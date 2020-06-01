package config;
import  java.sql.*;
public class Conexion 
{
 public static Connection getConnection() {
     Connection  con=null;

        String url="jdbc:mysql://localhost/dbcarritocompras"; 
            String usu="root";
            String pass="1234";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con=(Connection)DriverManager.getConnection(url,usu,pass);
                 System.out.println("Conexión en linea");
            }catch(Exception ex){

                 System.out.println("ERROR, en la Conexión "+ex);
            }

   return  con;

 }
  public   static void  main(String  args[])
  {
      getConnection();

  }

 
}