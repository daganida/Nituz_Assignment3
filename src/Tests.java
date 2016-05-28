
import java.util.Scanner;

import Interfaces.AirConditioner;

public class Tests {

	public static void main(String[] args) {
		  	Scanner in = new Scanner(System.in);
	        Scanner str = new Scanner(System.in);
	        AirConditioner airCon = new MyAirConditioner();
	      boolean showMenu=true;
	      while(showMenu)
	      {
	        // Display the menu
	        System.out.println("Choose your Option:");
	        System.out.println("====================");
	        System.out.println("1\t Turn Air Conditioner On");
	        System.out.println("2\t Turn Air Conditioner Off");
	        System.out.println("3\t Set Air Conditioner Mode");
	        System.out.println("4\t Set Wished Temperature");
	        System.out.println("5\t Increment Wished Temperature");
	        System.out.println("6\t Decrement Wished Temperature");
	        System.out.println("7\t Increment Room Temperature");
	        System.out.println("8\t Decrement Room Temperature");
	        System.out.println("9\t Get Current Temperature");
	        System.out.println("10\t Get Room Temperature");
	        System.out.println("11\t Exit");
	        System.out.println("Please enter your choice:");
	        
	        //Get user's choice
	        int choice=in.nextInt();
	         
	        //Display the title of the chosen module
	        switch (choice) {
	            case 1: airCon.on();
		   break;
	            case 2: airCon.off();
	                    break;
	            case 3: airCon.setMode(str.nextLine());
	                    break;
	            case 4: airCon.setTemp(in.nextInt());
	                    break;
	            case 5: airCon.incTemp(in.nextInt());
	            		break;
	            case 6: airCon.decTemp(in.nextInt());
	            		break;
	            case 7: airCon.incRoomTemp(in.nextInt());
	            		break;
		        case 8: airCon.decRoomTemp(in.nextInt());
		        		break;
		        case 9: System.out.println(airCon.getCurrTemp());
		            	break;
		        case 10: System.out.println(airCon.getRoomTemp());
		             	break;
		        case 11: showMenu=false;
		        		System.out.println("Bye Bye...");
		        		break;
	                     
	            default: System.out.println("Invalid choice");
	        }//end of switch
	        
	    
	        
	      }
	      
	      
	      
	    }//end of the main method
		
	}



