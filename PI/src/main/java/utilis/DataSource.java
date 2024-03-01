package utilis;

import java.sql.*;

public class DataSource {

    private String url="jdbc:mysql://localhost:3306/maxgain";
    private String user="root";
    private Connection cnx;
    private  String pwd = "";

    private static DataSource instance;
    private DataSource() {
        try {

            cnx = DriverManager.getConnection(url, user, pwd);
            System.out.println("cnx etablie !!");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    // creer methode qui responsable de l'instance de la classe datasource


    public static DataSource getInstance() {
        if(instance==null)
            instance=new DataSource();
        return instance;
    }

    public Connection getCnx() {
        return cnx;
    }
}
