import java.util.Scanner;

public class Robot {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		
		while(true) {
			System.out.println("1 pizza");
			System.out.println("2 rice");
			System.out.println("3 paratha");
			System.out.println("4 crust");
			System.out.println("5 toppings");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: order.setPizza(new Pizza("Plain Pizza-VEG",24));break;
			case 2: order.setRice("Basmati Jeera Rice");break;
			case 3: order.setParatha("Methi Paratha");break;
			case 4: order.setCrust("ThinCrust");break;
			case 5: order.setTopping("Tomato");break;
			default : System.out.println("Nothing to add to your order");
			}
			System.out.println("Are you done ? y/n");
			String done = sc.next();
			if(done.equalsIgnoreCase("y")) {
				System.out.println(order);
				System.out.println("Committing ......");
				
				
			}else
				continue;
		}
		

	}

}
