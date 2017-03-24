/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import beans.EjbSesion;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;



/**
 *
 * @author frodo
 */
public class Prueba {
    
    
    public static EJBContainer contenedor;
    public static Context contexto;
    public static EjbSesion ejb1;
    
    public static void main(String[] args)throws Exception{
        
        iniciarContenedor();
        
        
        
    }
    
    public static void iniciarContenedor ()throws Exception
    {
        contenedor = EJBContainer.createEJBContainer();
        contexto = contenedor.getContext();
        ejb1 = (EjbSesion) contexto.lookup("java:global/classes/EjbSesion!beans.EjbSesion");
        int c = ejb1.sumar(1, 4);
        System.out.println(c);
    }
    
    
    

    
    
    
}
