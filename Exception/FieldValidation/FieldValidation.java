public class FieldValidation {

	public static void main(String[] args) {
		CreateNewPerson("Giorgio", 9);
		CreateNewPerson("Antonio", 19);
		CreateNewPerson("Giovanni", 89);
	}
	
	private static void CreateNewPerson(String name, int age)
	{
		try {
			Person p = new Person(name, age);
			System.out.println(p.getAge());
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
