import java.util.Scanner;
class Scores{
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int oddc=0;
		double val=0.0,result=0.0;
		System.out.println("Enter the values :");
		while(oddc<3){
			val=sc.nextDouble();
			if(val%2==0){
				result=result-0.5;
				System.out.println("Result ="+result);
			}
			else if(val%2==1){
				result=result+1;
				oddc++;
				System.out.println("Result ="+result);
			}
			else if(val<0){
				result=result-1;
				System.out.println("Result ="+result);
			}
		}
	}
}