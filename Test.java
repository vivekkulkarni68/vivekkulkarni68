
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
         Order order = new Order.Builder()
        		              .paratha("Methi Paratha")
                              .rice("Masmati Jeera RIce")
                              .pizza(new Pizza("Plain Pizza",24))
                              .topping("Pineapple")
                              .build();
      
         System.out.println(order);
         
	}

}
