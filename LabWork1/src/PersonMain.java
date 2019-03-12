enum Gender{
	M('M'), F('F');
	
	private char gender;
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	private Gender(char g) {
		gender = g;
	}
}
class Person{
	String firstName;
	String lastName;
	char gender;
	String phoneNumber;
	int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(Gender g) {
		
		this.gender = g.getGender();
		
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//Default constructor
	Person(){
		firstName = "";
		lastName = "";
		phoneNumber = "";
		gender = 'M';
		
	}
	//Parameterized Constructor
	Person(String fName, String lName, String phone, Gender gend){
		firstName = fName;
		lastName = lName;
		phoneNumber = phone;
		gender = gend.getGender();
	}
	
	public int calculateAge(int month, int day, int year)
	{
		if(year > 2019) {
			System.out.println("Invalid year");
			return 0;
		}
		age = 2019 - year;
		return age;
	}
	
	public String getFullName() {
		return (firstName + ',' + lastName);
	}
	
	public void getPersonDetails() {
		System.out.println(getFullName());
		System.out.println(gender);
		System.out.println(phoneNumber);
		System.out.println(age);
	}
}
public class PersonMain {
	public static void main(String[] args) {
		Gender gender = Gender.M;
		Person person1 = new Person("Johnny","Tran","123-456-7890", gender);
		System.out.println(person1.calculateAge(5, 20, 1996));
		System.out.println(person1.getFullName());
		person1.getPersonDetails();
	}
}
