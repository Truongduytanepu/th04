/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author AD
 */
public class Connect {

    public static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String svName = "localhost";
    private int port = 1433;
    private String dbName = "QLSanpham";
    private String userName = "sa";
    private String passWord = "123456";
    public Connection getConnect(){
        Connection conn =null;
        try {
            //B1 Nap driver cho project
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //B2 Thiet lap chuoi ket noi
            String dbUrl = "jdbc:sqlserver://"+svName+":"+port+"; databaseName= "+dbName+";encrypt= false;";
            //B3: Tao ket noi den CSDL
            conn = DriverManager.getConnection(dbUrl,userName,passWord);
            System.out.println("Ket noi thanh cong!");
        } catch (Exception ex) {
            //Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Loi: " + ex.getMessage());
        }
        return conn;
      }
    public static void main(String [] args){
        Connect db = new Connect();
        db.getConnect();
    }
}
