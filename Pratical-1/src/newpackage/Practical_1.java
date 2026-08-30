/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import java.sql.*;
public class Practical_1 {
    public static void main(String[] args) {
        try {

            String url = "jdbc:mysql://localhost:3306/employee_db";
            String user = "root";
            String password = "";

            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
            
            System.out.println("Employee Records:");   // ← ADD THIS LINE

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " "
                        + rs.getString("name") + " "
                        + rs.getString("city") + " "
                        + rs.getInt("age"));

            }

            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {

            System.out.println(e);

        }

    }
}
