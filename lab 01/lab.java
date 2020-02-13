  LAB-1: DATA TYPE AND ARRAY IN JAVA
 
 
   Data Types in Java          

Data types specify the different sizes and values that can be stored in the variable. There are two types of data types in Java:

Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.
Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.


     Java Arrays
 An array is a collection of similar type of elements which have a contiguous memory location.

Java array is an object which contains elements of a similar data type. Additionally, The elements of an array are stored in a contiguous 
memory location. It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.

Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.

Unlike C/C++, we can get the length of the array using the length member. In C/C++, we need to use the sizeof operator.

 In Java, array is an object of a dynamically generated class. Java array inherits the Object class, and implements the Serializable as 
 well as Cloneable interfaces. We can store primitive values or objects in an array in Java. Like C/C++, we can also create single 
 dimentional or  multidimentional arrays in Java.


Moreover, Java provides the feature of anonymous arrays which is not available in C/C

 There are two types of array.

Single Dimensional Array
Multidimensional Array


 CODES of single dimensional array 
   
 class Testarray{  
public static void main(String args[]){  
int a[]=new int[5];  
a[0]=10;
a[1]=20;  
a[2]=70;  
a[3]=40;  
a[4]=50;   
for(int i=0;i<a.length;i++) 
System.out.println(a[i]);  
}
}

     Output
 10
 20
 70
 40
 50
 


       Code of multi dimensional array
          
             class Testarray3{  
public static void main(String args[]){  
int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
for(int i=0;i<3;i++){  
 for(int j=0;j<3;j++){  
 System.out.print(arr[i][j]+" ");  
 }  
 System.out.println();  
}
}
     
     
                    OUTPUT
 1 2 3
 2 4 5
 4 4 5
 
