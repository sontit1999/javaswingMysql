/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontapmysql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Son tit
 */
public class Connect {
    private static Connect connect = null;
    public Connection connection = null;
    // thông tin cấu hình kết nối mysql
    public static String databaseURL = "jdbc:mysql://localhost:3306/ontap";
    public static String USERNAME = "root";
    public static String PASSWORD = "";
    public static String jdbcDriver = "com.mysql.jdbc.Driver";
    // hàm get đối tượng Connect để sử dụng các hàm query , update
    public static Connect getInstance(){
         if(connect==null){
             connect = new Connect();
         }
         return connect;
    }
    // hàm connect tới mysql
    public void connectToMysql(){
        try {
            Class.forName(jdbcDriver);
            if(connection== null){
               connection = DriverManager.getConnection(databaseURL,USERNAME,PASSWORD);
               if(connection!=null){
                   System.out.println("COnnect succes!");
               }else{
                  System.out.println("COnnect fail!");
               }
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    // hàm get data từ bảng trong database 
    public ResultSet queryData(String sql){
       if(connection==null){
          connectToMysql();
       }
        try {
            Statement stt = connection.createStatement();
             ResultSet result = stt.executeQuery(sql);
             return result;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    // hàm update data  trong database 
    public int updateData(String sql){
       if(connection==null){
          connectToMysql();
       }
        try {
             Statement stt = connection.createStatement();
             int kq = stt.executeUpdate(sql);
             return kq;
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
