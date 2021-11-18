package fsestuff.usefulclasses;

public class Person
{
private String firstName
private String surname
private String other

	public person ()
	{
		firstName = "";
		surname = "";
		other = "";

	}
	public Person(String input1, String input2)
	{
		firstName = input1;
		surname = input2;
		other = "";
	}

	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getSurname()
	{
		return surname;
	}
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
}