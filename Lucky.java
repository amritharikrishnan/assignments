class Lucky{

	public static void main(String[]args){
	
		int b=127,d=7;
		if(d<1&&d>31){
			System.out.println("Invalid Date");
		}
		else{
			if(Integer.toString(d).length()==1){
				if(b%10==d||b%d==0){
					System.out.println("Lucky Customer");
				}
				else
				{
					System.out.println("Unlucky Customer");
				}
			}
			else{
				System.out.println(b%100);
				if(b%100==d||b%d==0){
					System.out.println("Lucky Customer");
				}
				else
				{
					System.out.println("Unlucky Customer");
				}
			}
		}
	}
}