package by.bkg.patterns.gof.structural.facade;


import by.bkg.patterns.gof.structural.facade.model.MySqlHelper;
import by.bkg.patterns.gof.structural.facade.model.OracleHelper;

import java.sql.Connection;

import static by.bkg.patterns.gof.structural.facade.HelperFacade.DBTypes.MYSQL;
import static by.bkg.patterns.gof.structural.facade.HelperFacade.DBTypes.ORACLE;
import static by.bkg.patterns.gof.structural.facade.HelperFacade.ReportTypes.HTML;
import static by.bkg.patterns.gof.structural.facade.HelperFacade.ReportTypes.PDF;

// https://www.digitalocean.com/community/tutorials/facade-design-pattern-in-java
// https://refactoring.guru/design-patterns/facade
public class FacadePatternTest {

    public static void main(String[] args) {
        var tableName = "Employee";

        System.out.println("Generating MySql HTML report and Oracle PDF report without using Facade...\n");
        var con = MySqlHelper.getMySqlDBConnection();
        var mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, con);

        var con1 = OracleHelper.getOracleDBConnection();
        var oracleHelper = new OracleHelper();
        var oracleReportProperties = new Object();
        oracleHelper.generateOraclePDFReport(tableName, oracleReportProperties, con1);

        System.out.println("==================================================================");
        System.out.println("Generating MySql HTML report and Oracle PDF report using Facade...\n");
        HelperFacade.generateReport(MYSQL, HTML, tableName);
        HelperFacade.generateReport(ORACLE, PDF, tableName);
    }
}
