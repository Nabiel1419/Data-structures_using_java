/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_advanced;

import java.util.Scanner;

/**
 *
 * This Java Class contains a DeleteOperation Function which deletes element at the
 * zero index
 * @author nabiel
 */
public class Delete_Operations {
    
    public void delete_At_Beg()
    {
        int arr[]=new int[30];
        int size;
        System.out.println("Enter Size of Array");
        Scanner sc =new Scanner(System.in);
        size=sc.nextInt();
        System.out.println("Enter Elements of An Array");
        for(int j=0;j<size;j++)
        {
            arr[j]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
        for(int i=0;i<size;i++)
        {
            arr[i]=arr[i+1];
            
        }
            for(int i=0;i<size;i++)
        {
            System.out.println();
            System.out.println(arr[i]);
        }
            size--;
        
    }
    
}
