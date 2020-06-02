/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontapmysql;

import java.sql.Connection;
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
public class Ontapmysql {

    public static String databaseURL = "jdbc:mysql://localhost:3306/ontap";
    public static String USERNAME = "root";
    public static String PASSWORD = "";
    public static String jdbcDriver = "com.mysql.jdbc.Driver";
    public static Connection con = null;
    public static Statement statement = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            // đăng kí class
            Class.forName(jdbcDriver);
            // mở connect
            con = DriverManager.getConnection(databaseURL, USERNAME, PASSWORD);
            if (con != null) {
                System.out.println("Connect success");
                statement = con.createStatement();
            } else {
                System.out.println("Connect fail");

            }
            // tạo câu lệnh truy vấn
            String sql = "select * from khachhang";
            // truy vấn
            ResultSet result = statement.executeQuery(sql);
            if (result != null) {
                System.out.printf("%-15s  %-15s %-15s %-15s \n", "Mã KH", "Tên KH", "Số điện thoại", "Địa chỉ");
                while (result.next()) {
                    int makh = result.getInt("makh");
                    String tenkh = result.getString("tenkh");
                    String sdt = result.getString("sdt");
                    String dc = result.getString("dc");
                    System.out.printf("%-15d  %-15s %-15s %-15s \n", makh, tenkh, sdt, dc);
                }
            } else {
                System.out.println("Truy vấn ko thành công !");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ontapmysql.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Ontapmysql.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
//            try {
////                statement.close();
////                con.close();
////                System.out.println("Đã giải phóng tài nguyên!");
//            } catch (SQLException ex) {
//                Logger.getLogger(Ontapmysql.class.getName()).log(Level.SEVERE, null, ex);
//            }

        }
        if (deleteKH(1) == 1) {
            System.out.println("Xóa thành công khách hàng 01");
        } else {
            System.out.println("Xóa ko thành công ");
        }
        System.out.println("Ds sau khi xóa");

        ResultSet result = null;
        try {
            result = statement.executeQuery("select * from khachhang");
        } catch (SQLException ex) {
            Logger.getLogger(Ontapmysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (result != null) {
            System.out.printf("%-15s  %-15s %-15s %-15s \n", "Mã KH", "Tên KH", "Số điện thoại", "Địa chỉ");
            try {
                while (result.next()) {
                    int makh = result.getInt("makh");
                    String tenkh = result.getString("tenkh");
                    String sdt = result.getString("sdt");
                    String dc = result.getString("dc");
                    System.out.printf("%-15d  %-15s %-15s %-15s \n", makh, tenkh, sdt, dc);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Ontapmysql.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Truy vấn ko thành công !");
        }
    }

    public static int deleteKH(int makh) {
        if (statement != null) {
            String sqldelete = "delete from khachhang where makh = " + makh;
            try {
                return statement.executeUpdate(sqldelete);
            } catch (SQLException ex) {

                Logger.getLogger(Ontapmysql.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println("Chưa khởi tạo statement");
        }

        return 0;
    }

}
