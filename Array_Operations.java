/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_operations;

import java.util.Scanner;

/**
 *
 * @author nabiel akber
 * Various array operations using java
 * insertion,deletion,update,search etc
 * 
 */
 class Operations_On_Arrays
       
{
    //function that prints all the elements in an array(Traversing)
     // this function accepts an array as an argument
    
    public void traverse(int array_Numbers[])
    {
        for(int i=0;i<array_Numbers.length;i++)
        {
            System.out.print(array_Numbers[i]+"  ");//+Here is used for concat
        }
    }
    
    
   //  we have to insert element at the begning for that we have to shift all the elements 
    // to the right side 
    
    public  void insertion_Beg(int array_Numbers[],int item)
    {
        
        
    }
    
   
    public void insert_Array_begin()
{
    //This function insert an Elemet at the begining 
    // We basically Sift all the elemets to the right side of the array 
    // Then we overwrite the first element i.e index 0
    
         int a[]=new int[40];
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter size of an array");
       int n=sc.nextInt();
         System.out.println("Enter elements of an Array!");
         for( int i=0;i<n;i++)
         {
            a[i] =sc.nextInt();
          
            
         }
         for(int i=0;i<n;i++)
         {
             System.out.println("Elements of array are"+a[i]);
         }
        
        
         for(int i=n-1;i>=0;i--)
         {
             a[i+1]=a[i];//shifting all elements to the right side of the array
         }
         a[0]=9;//insert new element at 0 index
         n++;
         System.out.println("Element a[0]"+a[0]);
         System.out.println("Element a [1]"+a[1]);
         for(int i=0;i<n;i++)
         {
             System.out.println("Elements of array are"+a[i]);
         }
         
         
         
}
}


public class Array_Operations {

    
    public static void main(String[] args) {
        
        Operations_On_Arrays obj=new Operations_On_Arrays();
        int array_Numbers[]={2,5,7,8,10};
        obj.traverse(array_Numbers);
       obj.insert_Array_begin();
       
    }
    
}
