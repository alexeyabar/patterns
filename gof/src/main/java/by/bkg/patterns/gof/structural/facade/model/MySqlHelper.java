package by.bkg.patterns.gof.structural.facade.model;

import java.sql.Connection;

public class MySqlHelper {

    public static Connection getMySqlDBConnection() {
        System.out.println("Retrieving connection to MySQL");
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con) {
        System.out.println("Generating MySQL PDF report");
    }

    public void generateMySqlHTMLReport(String tableName, Connection con) {
        System.out.println("Generating MySQL HTML report");
    }
}