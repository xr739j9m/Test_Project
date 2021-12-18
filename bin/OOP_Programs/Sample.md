***
### Object Oriented Programming Reference
***

Constructor :

```java
// Create a Main class
public class Main {
  int x;  // Create a class attribute

  // Create a class constructor for the Main class
  public Main() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Outputs 5
```
***
Another exeample: 
```java
public class Main {
  int modelYear;
  String modelName;

  public Main(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Main myCar = new Main(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

// Outputs 1969 Mustan
```
Setter Methods
Sample 1:
```java
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}
```
Samples 2:
```java
public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}

// Outputs "John"
```

Previous Proj in java
```java
public class book {

	// set method
	public void set(String book_Name, String ISBN_num, String authorName, String publisher) {
	}

//get method
	public String getName(String bookName) {
		return bookName;
	}

	public String getISBN(String ISBN_num) {
		return ISBN_num;
	}

	public String getAuthorName(String authorName) {
		return authorName;
	}

	public String getpublisher(String publisher) {
		return publisher;
	}

	public String getBooksInfo(String bookName, String ISBN_num, String authorName, String publisher) {
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Book Name\t\tISBN No.\t\tAuthor Name\t\tPublisher");
		System.out.println("-----------------------------------------------------------------------------------------");
		return bookName + "\t\t" + ISBN_num + "\t\t" + authorName + "\t\t" + publisher;

	}

	public static void main(String[] args) {
		// attributes set to null first
		String bookName = null;
		String ISBN_num = null;
		String authorName = null;
		String publisher = null;

		System.out.println("\n\n---------------------------------------------------");
		System.out.println("Welcome to the University's Library Book Collection");
		System.out.println("---------------------------------------------------");

		System.out.println("\nFollowing functionalities are available: "
				+ "\n\n1- Set Book Information \n2- Get Book Information \n3- Display Book Information \n4- Exit");
		System.out.println("---------------------------------------------------");
		boolean key = true;
		do {
			System.out.println("\nEnter Choice: ");
			Scanner input = new Scanner(System.in);

			// users choices

			int choice = input.nextInt();

			book firstbook = new book();

			switch (choice) {
			// choice 1 - set book info
			case 1:

				System.out.print("Enter book Name:");
				input.nextLine();
				bookName = input.nextLine();

				System.out.print("Enter ISBN number:");
				ISBN_num = input.nextLine();

				System.out.print("Enter Author Name:");
				authorName = input.nextLine();

				System.out.print("Enter Publisher:");
				publisher = input.nextLine();
				// book object
				firstbook.set(bookName, ISBN_num, authorName, publisher);
				System.out.println("-------------------------------------------------");
				System.out.println("Provided information has been set.");
				System.out.println("-------------------------------------------------");
				break;
			// choice 2- get book info
			case 2:
				System.out.println(
						"-----------------------------------------------------------------------------------------");
				System.out.println("Book Name\t\tISBN No.\t\tAuthor Name\t\tPublisher");
				System.out.println(
						"-----------------------------------------------------------------------------------------");
				System.out.println(firstbook.getName(bookName) + "\t\t" + firstbook.getISBN(ISBN_num) + "\t\t"
						+ firstbook.getAuthorName(authorName) + "\t\t" + firstbook.getpublisher(publisher));

				break;
			// choice 3 -display book info
			case 3:
				System.out.println(firstbook.getBooksInfo(bookName, ISBN_num, authorName, publisher));

				break;
			case 4:
				System.out.println("Thank you");
				key = false;
				break;

			default:
				System.out.println("Invalid Choice. Try Again");

			}

		} while (key == true);
	}
}
```

Create a String array

```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo
```

Creating object array
```java
//We use the Class_Name followed by a square bracket [] then object reference name to create an Array of Objects.
Class_Name[ ] objectArrayReference;

//Alternatively, we can also declare an Array of Objects as :
Class_Name objectArrayReference[ ];

//Both the above declarations imply that objectArrayReference is an array of objects.
//For example, if you have a class Student then we can create an array of Student objects as given below:
Student[ ] studentObjects;  
Or
Student studentObjects[];

//Instantiate the array of objects –Syntax: 
Class_Name obj[ ]= new Class_Name[Array_Length];

Student[ ] studentObjects = new Student[2];
```

Creating array object
```java
class Main{
   public static void main(String args[]){
     //create array of employee object  
    Employee[] obj = new Employee[2] ;
 
     //create & initialize actual employee objects using constructor
     obj[0] = new Employee(100,"ABC");
     obj[1] = new Employee(200,"XYZ");
 
     //display the employee object data
     System.out.println("Employee Object 1:");
     obj[0].showData();
     System.out.println("Employee Object 2:");
     obj[1].showData();
  }
}
//Employee class with empId and name as attributes
class Employee{
  int empId;
  String name;
  //Employee class constructor
  Employee(inteid, String n){
     empId = eid;
     name = n;
  }
public void showData(){
   System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
   System.out.println();
 }
}
```

For loop an object
```java
Horse [] myHorses = new Horse [10];
 
for (int i = 0; i < 10; i++)
{
    //get input variables;
    myHorses[i] = new Horse(name, age, color);
}
```
Loop through an object:

![](img/2021-10-02-21-07-59.png)
![](img/2021-10-02-21-09-11.png)
```java
//ex 1
ArrayList<Room> rooms = new ArrayList<>();
rooms.forEach(room -> System.out.println(room.getName()));
//ex 2
ArrayList<Room> rooms = new ArrayList<>();
rooms.forEach(room -> {
    // here room is available
});
//ex3
ArrayList<Room> rooms = new ArrayList<>();
rooms.forEach(System.out::println);
//
for(Room room : rooms) {
  //room contains an element of rooms
}

for (final Room room : rooms) {
          // Here your room is available
}
//setting object up to 3
 for (int i = 0; i < 3; i++) {
            clone[i].set("BMW", "black");
        }
```

