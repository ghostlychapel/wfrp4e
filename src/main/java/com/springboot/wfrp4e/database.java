package com.springboot.wfrp4e;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
//TODO - Complete this file
    private final String url = "jdbc:postgresql://localhost:5432/wfrp4e";
    private final String user = "postgres";
    private final String pass = "postgreSQLadmin";

    public class PostgreSQLJDBC {
        public static void main(String args[]) {
            Connection c = null;
            try {
                Class.forName("org.postgresql.Driver");
                c = DriverManager
                        .getConnection("jdbc:postgresql://localhost:5432/testdb",
                                "postgres", "123");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println(e.getClass().getName()+": "+e.getMessage());
                System.exit(0);
            }
            System.out.println("Opened database successfully");
        }
    }
}
