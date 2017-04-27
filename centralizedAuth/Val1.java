package centralizedAuth;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Val1
 {
     public static boolean checkUser(String email,String pass) 
     {
      boolean st =false;
      int i;
      Connection con=null;
      
      try{
    	 Class.forName("oracle.jdbc.driver.OracleDriver"); 
         con=AuthDB.myConnection();
			
         PreparedStatement ps =con.prepareStatement
                             ("select ID, Password from application where ID=? and Password=?");
         ps.setString(1, email);
         ps.setString(2, pass);
         i=ps.executeUpdate();
         if(i==0)
        	 st=false;
         else
        	 st=true;
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }   
}