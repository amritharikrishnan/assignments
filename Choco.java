class Choco{
	
	public static void main(String[]args){
		int count=0,chno=21,child=7,no=0;
		for(int i=0;i<child;i++){
			
			count=count+i;
			chno=chno-i;
			if(chno==0||chno-i<i){
				no=i+1;
				System.out.println("No of Students who  recieved chocolates completely : "+ no);
				break;
			}
		}	
	}
}