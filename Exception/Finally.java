package Exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//used in   differnt  senariosn  where 
// - Closing Files
//  -Closing Database Connections:
// - // Closing Network Connections:
// - Closing Streams
// - Closing Threads




//below  example  of   an  demo  for database   connection 

public class Finally {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "username", "password")) {
            // Execute a query
        } catch (SQLException e) {
            System.out.println("Error executing query: " + e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Error closing connection: " + e.getMessage());
                }
            }
        }
    }
}

    
}
