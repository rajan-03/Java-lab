


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
 
