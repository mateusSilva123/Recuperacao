/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.MslfUsuarios;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 *
 */
public class UsuariosDAO extends DAO_Abstract{


@Override
    public void insert(Object object) {
       session.beginTransaction();
       session.save(object);
       session.getTransaction().commit();
    }

    @Override 
    public void update(Object object) {
       session.beginTransaction();
        session.flush();
       session.clear();
       session.update(object);
       session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
       session.beginTransaction();
       session.flush();
       session.clear();
       session.delete( object);
       session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosDAO.class);
        criteria.add(Restrictions.eq("MSLF_idUsuarios", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MslfUsuarios.class);
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }
    
    public static void main(String[] args) {
<<<<<<< HEAD
       
=======
<<<<<<< HEAD
       
=======
<<<<<<< HEAD
       
=======
        MslfUsuarios usuarios = new MslfUsuarios();
        usuarios.setMslfIdUsuarios(88);
        usuarios.setMslfNome("nomer");
        usuarios.setMslfApelido("nome");
        usuarios.setMslfCpf("123");
        usuarios.setMslfNivel(1);
        usuarios.setMslfAtivo("s");
        usuarios.setMslfSenha("senha");
        
        UsuariosDAO usuariosDAO = new UsuariosDAO();
       usuariosDAO.insert(usuarios);
        System.out.println(usuarios);
>>>>>>> a39f6a3e389fc4532bbcda4e8f5d2756cc862b1d
>>>>>>> 55df74220d96b2f3edc43084e6b27e73990c10cc
>>>>>>> f38b18788bc284862b466ecca84678e102546fb2
    }
    
}
