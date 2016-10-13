import hibernateUtil.HibernateUtil;


import model.Computer;
import model.Persona;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class esempioOneToOne {

	public static void main(String[] args) {
		
		Computer c1= new Computer();
		
		c1.setModello("HP");
		
//Computer c2= new Computer();
//		
//		c2.setModello("Asus");
		
		Persona p1=new Persona();
		p1.setNome("AAA");
		p1.setCognome("BBB");
		
//		p1.addComputer(c1);

		
		
//	  c1.addPersona(p1);
		
		
		
		
Session session=HibernateUtil.openSession();
		
		Transaction tx=null;
		
		try{
		
		tx=session.getTransaction();
		
		         tx.begin();
		         
//		       session.save(c1);
		      
		     session.save(p1);
		         
		     tx.commit();      
		}catch(Exception ex){
			
			tx.rollback();
			
			
		}finally{
			session.close();
		}

	}

}
