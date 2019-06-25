

	import java.util.Scanner;

	public class Ass10 {
		static int noOfPos(int a[]){
			int count=0;
			for(int i=0;i<a.length;i++){
				if(a[i]>0){
					count++;
				}
			}
			return count;
		}
		static int noOfNeg(int a[]){
			int count=0;
			for(int i=0;i<a.length;i++){
				if(a[i]<0){
					count++;
				}
			}
			return count;
		}
		static int noOfOdd(int a[]){
			int count=0;
			for(int i=0;i<a.length;i++){
				if(a[i]%2!=0){
					count++;
				}
			}
			return count;
		}
		static int noOfEven(int a[]){
			int count=0;
			for(int i=0;i<a.length;i++){
				if(a[i]%2==0){
					count++;
				}
			}
			return count;
		}
		public static void main(String[] args) {
			int arr[]=new int[10];
			System.out.println("Enter 10 Integers");
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<arr.length;i++){
				arr[i]=sc.nextInt();
			}
			int cnt=noOfPos(arr);
			System.out.println("No of Positive nos="+cnt);
			cnt=noOfNeg(arr);
			System.out.println("No of Negative nos="+cnt);
			cnt=noOfOdd(arr);
			System.out.println("No of Odd nos="+cnt);
			cnt=noOfEven(arr);
			System.out.println("No of Even Nos="+cnt);
			sc.close();
		}
	}
