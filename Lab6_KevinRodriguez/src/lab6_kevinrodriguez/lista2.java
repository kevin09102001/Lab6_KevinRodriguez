/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_kevinrodriguez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class lista2 {
   public ArrayList<listaclau> listaa=new ArrayList();
   private File archivo =null;
   
  public lista2(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<listaclau> getA() {
        return listaa;
    }

    public void setA(ArrayList<listaclau> listaa) {
        this.listaa = listaa;
    }

   
       public void setPersona(listaclau p) {
        this.listaa.add(p);
    }

    @Override
    public String toString() {
        return "lista2" + "a=" + listaa + ", archivo=" + archivo + '}';
    }
    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (listaclau t : listaa) {
                bw.write(t.getNombreclase() + "; ");
                bw.write(t.getNombre() + "; ");
                bw.write(t.getPuntuacion() + "; ");
                bw.write(t.getAño_Lanzamiento() + "; ");
                bw.write(t.getTipo() + "; ");
                bw.write(t.getGenero()+ "\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaa = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaa.add(new listaclau(sc.next(),
                                    sc.next(),
                                    sc.next(),sc.next(),sc.next(),sc.next()
                                 )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    } 
}
