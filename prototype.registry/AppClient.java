package prototype.registry;

public class AppClient {
	
	static StudentRegistry studentRegister = new StudentRegistry();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		
		s.setAddres("Bangalore");
		s.setContact(1235);
		s.setName("Kartik");
	
		IntelligentStudent is = new IntelligentStudent();
		
		is.setIq(360);
		
		fillRegistry("inteliStudent", is);

		fillRegistry("student",s);
		
		Student intelligentKartik  = studentRegister.get("inteliStudent").clone();
		
		intelligentKartik.setAddres("Mahadevpura,560048");
		intelligentKartik.setContact(4567);
		
		intelligentKartik.setName("Kartik Porwal");
		
		System.out.println(intelligentKartik);
		
	}

	
	
	public static void fillRegistry(String key , Student s)
	{
		studentRegister.register(key, s);
	}
	
	
}