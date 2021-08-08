package br.edu.ifpb.report.controller;

public abstract class GeneralReport {

	public void generate() {
		createDatabaseConnection();
		executeQuery();
		convert();
	}

	protected abstract void createDatabaseConnection();
    protected abstract void executeQuery();
	protected abstract void convert();

}
