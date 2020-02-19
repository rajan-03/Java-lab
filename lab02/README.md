**JAVA CONSTRUCRTOR


A Java constructor is special method that is called when an object is instantiated. In other words, when you use the new keyword.
The purpose of a Java constructor is to initializes the newly created object before it is used. 
Here is a simple example that creates an object, which results in the class constructor being called:

MyClass myClassObj = new MyClass();
 
 **Types of Constructors
 
There are two types of constructors: Default and Parameterized

Default constructor If you do not implement any constructor in your class, Java compiler inserts a default constructor into your code on
your behalf. This constructor is known as default constructor. Parameterized constructor Constructor with arguments(or you can say
parameters) is known as Parameterized constructor. Example:

    public class Employee {

  	 int empId;  
   	String empName;  
	    
   	Employee(int id, String name){  
       	this.empId = id;  
       this.empName = name;  
   	}  
   	void info(){
        	System.out.println("Id: "+empId+" Name: "+empName);
   	}  
	   
   	public static void main(String args[]){  
	Employee obj1 = new Employee(15,"sumit");  
	Employee obj2 = new Employee(32,"rajan");  
	obj1.info();  
	obj2.info();  
	   }  
	}
