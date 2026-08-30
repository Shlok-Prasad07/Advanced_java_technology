package newpackage;
import java.sql.*;

import java.util.Scanner;  
public class Pratical_2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","");
            System.out.println("Enter Employee ID:");
            int id = sc.nextInt();
            CallableStatement cs = con.prepareCall("CALL getcity(?, ?)");
            cs.setInt(1, id);
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.execute();
            String city = cs.getString(2);
            if (city != null) {
                System.out.println("Employee City: " + city);
            } else {
                System.out.println("Employee not found");
            }
            cs.close();
            con.close();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
