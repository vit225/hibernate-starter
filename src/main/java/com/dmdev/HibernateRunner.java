package com.dmdev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HibernateRunner {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "pass");
    }
}
