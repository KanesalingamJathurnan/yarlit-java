class SwitchCase{
	public static void main(String args[]){
		int dayno=1;
		String day;
		switch(dayno){
			case 1:
				day="Monday";
				System.out.println("Today is Monday ");
				break;
			case 2:
				day="Tuesday";
				System.out.println("Today is Tuesday ");				
				break;
			case 3:
				day="Wednesday";
				System.out.println("Today is Wednesday");
				break;
			case 4:
				day="Thursday";
				System.out.println("Today is Thursday ");
				break;
			case 5:
				day="Friday";
				System.out.println("Today is Friday");
				break;
			case 6:
				day="Saturday";
				System.out.println("Today is Saturday");
				break;
			case 7:
				day="Sunday";
				System.out.println("Today is Sunday");
			break;
			default:
			System.out.println("Not a day");
			break;
		}
	}
}