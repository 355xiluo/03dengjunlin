import java.util.Scanner;


public class Elims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in); 
     System.out.println("请输入一个数");
     int a=sc.nextInt();
		int[] arr=new int[a];
	 System.out.println("数组长度为");
     System.out.println(arr.length);
     for(int i=0;i<arr.length;i++){
         arr[i]=i;
         
         System.out.println("数组的值为"+arr[i]);
     }
	}

}
