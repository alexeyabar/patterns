package by.bkg.patterns.gof.structural.facade.model;

import java.sql.Connection;

public class OracleHelper {

    public static Connection getOracleDBConnection() {
        System.out.println("Retrieving connection to Oracle");
        return null;
    }

    public void generateOraclePDFReport(String tableName, Object someAdditionalProperties, Connection con) {
        System.out.println("Generating Oracle PDF report");
    }

    public void generateOracleHTMLReport(String tableName, Object someAdditionalProperties, Connection con) {
        System.out.println("Generating Oracle HTML report");
    }
}