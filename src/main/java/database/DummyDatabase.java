package database;

import util.Dataset;
import util.QueryResult;
import util.QueryScenario;

public class DummyDatabase implements Database {
	
	@Override
	public String getName() {
		return "DummyDatabase";
	}

	@Override
	public String getVersion() {
		return "Version 1.0 / Dummy Implementation";
	}

	@Override
	public void setUp() throws Exception {
		System.out.println("setUp(): " + getName() + " /// " + getVersion());
	}

	@Override
	public void load(Dataset dataset) throws Exception {
		System.out.println("load(Dataset)");
	}

	@Override
	public void prepare(QueryScenario queryScenario) throws Exception {
		System.out.println("prepare(): " + queryScenario.toString());
	}

	@Override
	public QueryResult query(QueryScenario queryScenario) throws Exception {
		System.out.println("query(): " + queryScenario.toString());
		return null;
	}

	@Override
	public String toString() {
		return "DummyDatabase [getName()=" + getName() + ", getVersion()="
				+ getVersion() + "]";
	}

	@Override
	public void clean() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	
}
