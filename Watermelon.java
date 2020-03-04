class Watermelon{
	public static void main(String[]args){
		int weight=10;
		System.out.println("The Watermelon Divisions: ");
		if(weight%2==0){
			for(int i=0;i<weight;i++){
				if(i==0){
				}
				else{
					System.out.print(i+"  ");
					System.out.println(weight-i);
				}
			}
		}
		else{
			System.out.println("Can't Devide Watermelon");
		}
	}
}