class Offer{
	public static void main(String[]args){
		int itemcount=3,x=20,y=30,z=25;
		double val1=offer1(itemcount,x,y,z);
		double val2=offer2(itemcount,x,y,z);
		if(val1<val2){
			System.out.println("Offer 1 is Applicable");
		}
		else{
			System.out.println("Offer 2 is Applicable");
		}
	}
	public static double offer1(int c,int o,int t,int th){
		
		int sum=o+t+th;
		return (sum-(sum*0.2));
	}
	public static double offer2(int c,int o,int t,int th){
		
		if(o<t){
			if(o<th){
				return(t+th);
			}
			else{
				return(o+t);
			}
		}
		else if(t<th){
			return(t+th);
		}
		else{
			return 0;
		}
	}
}