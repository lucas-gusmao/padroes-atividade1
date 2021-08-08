package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.MysqlDatabaseConnector;


public class TaxReport extends GeneralReport{

    private MysqlDatabaseConnector connector = new MysqlDatabaseConnector();
    
    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.createConnection();
    }

    public void executeQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connector.runQuery(query);
    }

    public void convert() {
        System.out.println("Converting To PDF...");
    }
}
