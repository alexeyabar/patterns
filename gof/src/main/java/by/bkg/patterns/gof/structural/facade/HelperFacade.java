package by.bkg.patterns.gof.structural.facade;

import by.bkg.patterns.gof.structural.facade.model.MySqlHelper;
import by.bkg.patterns.gof.structural.facade.model.OracleHelper;

import java.sql.Connection;

public class HelperFacade {

    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        switch (dbType) {
            case MYSQL -> {
                Connection con = MySqlHelper.getMySqlDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportType) {
                    case HTML -> mySqlHelper.generateMySqlHTMLReport(tableName, con);
                    case PDF -> mySqlHelper.generateMySqlPDFReport(tableName, con);
                }
            }
            case ORACLE -> {
                Connection con = OracleHelper.getOracleDBConnection();
                OracleHelper oracleHelper = new OracleHelper();
                Object additionalProperties = new Object();
                switch (reportType) {
                    case HTML -> oracleHelper.generateOracleHTMLReport(tableName, additionalProperties, con);
                    case PDF -> oracleHelper.generateOraclePDFReport(tableName, additionalProperties, con);
                }
            }
        }
    }

    public enum DBTypes {
        MYSQL, ORACLE;
    }

    public enum ReportTypes {
        HTML, PDF;
    }
}