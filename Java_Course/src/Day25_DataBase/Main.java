package Day25_DataBase;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost/mysqldatabase";
        Connection con = DriverManager.getConnection(url,"root","anjanshrestha8");
        System.out.println("Connection Sucess");

        Statement stm = con.createStatement();
        ResultSet res = stm.executeQuery("SELECT * FROM customers");

        while(res.next()){

            String name = res.getString("name");
            System.out.println(name);

        }

//        ResultSet rs = stm.executeQuery("insert into customers ('name','address') values ('sandip','ktm')");
//        ResultSet rs = stm.executeQuery("UPDATE FROM customers SET name='test' where id='1' ");
//        ResultSet rs = stm.executeQuery(" insert into customers (name,address) values ('andip','pkr') ");

    }
}
