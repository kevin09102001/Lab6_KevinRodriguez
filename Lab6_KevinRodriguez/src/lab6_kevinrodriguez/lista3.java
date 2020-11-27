/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_kevinrodriguez;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class lista3 {
    public ArrayList<listaclau> listaa=new ArrayList();

    public lista3() {
    }
    public ArrayList<listaclau> getListaa() {
        return listaa;
    }

    public void setListaa(ArrayList<listaclau> listaa) {
        this.listaa = listaa;
    }

    @Override
    public String toString() {
        return "lista3{" + "listaa=" + listaa + '}';
    }
    
    
}
