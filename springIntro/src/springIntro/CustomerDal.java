package springIntro;

public class CustomerDal implements ICustomerDal {

	String connectionString;
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	@Override
	public void add() {
		System.out.println("Connection String : "+ this.connectionString);
		System.out.println("Oracle Veriataban� ile ba�land�n�z.");
		
	}

}