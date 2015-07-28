package co.james.patterns;
/*
 * The singleton pattern ensures that only one instance of the object can be instantiated.  This can be useful
 * if you want to ensure that all methods that use the object have the same one with the same values.
 */
public class Singleton {
	
	private static Singleton instance = null;
	private String connectionString;
	
	/*
	 * Private constructor prevents any other class from instantiating 
	 */
	
	private Singleton(){ }
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;	
	}
	
	protected String getConnectionString(){
		return this.connectionString;
	}
		
	protected void setName(String connectionString){
		this.connectionString = connectionString;		
	}
}

