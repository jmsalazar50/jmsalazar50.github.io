import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of Cars");
		int size=s.nextInt();
		Operation opt=new Operation(size);
		System.out.println("Enter Car information: ");
		for(int i=0;i<size;i++) {
			Cars s1=new Cars();
			System.out.println("Enter " +(i+1)+ " Car year");
			int year=s.nextInt();
			System.out.println("Enter " +(i+1)+ " Car make");
			String make=s.next();
			System.out.println("Enter " +(i+1)+ " Car model");
			String model=s.next();
			
			s1.setYear(year);
			s1.setMake(make);
			s1.setModel(model);
			
			opt.addCar(s1);
		}
		String text="";
		Cars std=null;
		do {
			System.out.println("Press 1 for find car by year");
			System.out.println("Press 2 for find car by make");
			System.out.println("Press 3 for find car by model");
			System.out.println("Press 4 for show all entries");
			System.out.println("Press 5 to delete a car");
			System.out.println("Enter choice :-");
			int choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter year to find");
				std=opt.findCarByYear(s.nextInt());
				if(std!=null) {
					System.out.println(std.getYear()+"\t"+std.getMake()+"\t"+std.getModel());
				}else {
					System.out.println("This year does not exist.");
				}
				break;
			case 2:
				System.out.println("Enter make to find");
				std=opt.findCarByMake(s.next());
				if(std!=null) {
					System.out.println(std.getYear()+"\t"+std.getMake()+"\t"+std.getModel());
				}else {
					System.out.println("This make does not exist.");
				}
				break;
			case 3:
				System.out.println("Enter model to find");
				std=opt.findCarByModel(s.next());
				if(std!=null) {
					System.out.println(std.getYear()+"\t"+std.getMake()+"\t"+std.getModel());
				}else {
					System.out.println("This model does not exist.");
				}
				break;
			case 4:
				opt.showAllCar();
				break;
			case 5:
				System.out.println("Enter year to delete");
				if(opt.delete(s.nextInt())) {
					System.out.println("Successfully deleted");
				}else {
					System.out.println("This year is not available.");
				}
				break;
				default:System.out.println("Error..");
			}
			System.out.println("Do you want to continue? y/n");
			text=s.next();
		}while(text.equalsIgnoreCase("y"));
		
		System.out.println("Demo over");
		
		
	}
}
