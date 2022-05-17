
public class Person 
{
	private final String _name;
	private final int _age;
	
	public String getName()
	{
		return _name;
	}
	
	public int getAge()
	{
		return _age;
	}

	public Person(String name, int age) throws InvalidAgeException
	{
		_name = name;
		_age = age;
		
		if(ValidateAge(_age))
			System.out.println("Welcome, " + name);
	}
	
	public Person(String name, String bornDate) throws InvalidAgeException 
	{
		//Ipotizzo che la stringa bornDate produca età 0
		this(name, 0);
		
		if(ValidateAge(_age))
			System.out.println("Welcome, " + name);
	}
	
	private Boolean ValidateAge(int age) throws InvalidAgeException
	{
		Boolean b = age > 18;
		
		if(!b)
			throw new InvalidAgeException();	
		
		return b;
	}
}
