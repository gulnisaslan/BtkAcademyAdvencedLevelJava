package springIntro;

public class MySqlDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("MySql veritabanı ile bağlandınız. ");
		
	}

}
