/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.projecao.ltpw.dao;

import br.projecao.ltpw.model.Departamento;
import br.projecao.ltpw.model.Professor;
import br.projecao.ltpw.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author laboratorio
 */
public class DepartamentoDAO {
    
    private static DepartamentoDAO instancia;
    private DepartamentoDAO(){
    
    }
    
    public static synchronized DepartamentoDAO getInstance(){
        if (instancia == null) instancia = new DepartamentoDAO();
        return instancia;
    }
    
    
    
    private static Transaction transObj;
    private static Session sessionObj;
    
    /**
     * Adiciona um novo professor na base de dados
     **/
     
    public Departamento salvaDepartamento(Departamento departamentoObj) {        
        
            sessionObj = HibernateUtil.getSessionFactory().openSession();
            transObj = sessionObj.beginTransaction();
            
            //sessionObj.save(professorObj);
            sessionObj.saveOrUpdate(departamentoObj);
            
            System.out.println("Departamento salvo com Id: " + departamentoObj.getIdDepartamento());
 
        
        
            transObj.commit();
            sessionObj.close();
            
        
        
        return departamentoObj;
    }
    
    public Departamento obterDepartamentoPorChave(Departamento pDepartamento){
        Departamento lDepartamento = null;
        sessionObj = HibernateUtil.getSessionFactory().openSession();
          try {
                Query query = sessionObj.createQuery ("from Departamento where idDepartamento = " + pDepartamento.getIdDepartamento());
                lDepartamento = (Departamento)query.uniqueResult();
                 
            } catch (Exception e) {
                e.printStackTrace();
            }
            
          sessionObj.close();
              return lDepartamento;
        }
    
      public List<Departamento> obterTodosOsDepartamentos(){
          sessionObj = HibernateUtil.getSessionFactory().openSession();
          List<Departamento> lDepartamentos = null;
          try {
                Query query = sessionObj.createQuery ("from Departamento");
                lDepartamentos = query.list();
                
               
            } catch (Exception e) {
                e.printStackTrace();
            }
              sessionObj.close();
              return lDepartamentos;
        }
      
      
       public boolean removerDepartamento(Departamento departamentoObj){
          try {
              
            sessionObj = HibernateUtil.getSessionFactory().openSession();
            transObj = sessionObj.beginTransaction();
            sessionObj.delete(departamentoObj.getCursos());
      
            
  
        } catch (Exception exceptionObj) {
            exceptionObj.printStackTrace();
            return false;
        } finally {
            
            transObj.commit();
            sessionObj.close();
            
        }
         return true; 
       }
    
}
