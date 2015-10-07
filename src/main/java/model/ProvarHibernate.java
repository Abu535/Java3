/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author T-107
 */
public class ProvarHibernate {
    public static void main(String[] args)throws Exception{
        System.out.println("Bienvenido a hibernate");
       SessionFactory fuck= HibernateUtilidades.getSessionFactory();
      Session sesion= fuck.openSession();
        Transaction tranza= sesion.beginTransaction();
       /* Usauario u=new Usauario("pacheco", "4321");
        //guardar
       
        //Solo para insertar
        sesion.save(u);*/
        
        /*
        //Vamos hacer una busqueda de nuestros usuarios
        Criteria cricri= sesion.createCriteria(Usauario.class);
        ArrayList<Usauario> usu=(ArrayList<Usauario>)cricri.list();
        System.out.println(usu.size());
        for(Usauario u:usu){
            System.out.println(u);
        }*/
        
        /*
        //Vamos hacer una busqueda por id
       Criteria criri= sesion.createCriteria(Usauario.class);
       Usauario usu=(Usauario)criri.add(Restrictions.idEq(3)).uniqueResult();
        System.out.println(usu);
                */
       /*
        //Actualizar
        Usauario u=new Usauario(1);
        u.setLogin("olitas");
        u.setPassword("852");
        sesion.update(u);*/
        Usauario u=new Usauario(2);
        sesion.delete(u);
        tranza.commit(); 
        sesion.close();
        
        
    }
 
}
