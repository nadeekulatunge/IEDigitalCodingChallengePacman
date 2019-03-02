
package pcman;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nadeeshani
 */
public class PCMAN {

    public static int Currunt_x=0;
    public static int Currunt_y=0;
    public static String Currunt_facing="";
     int[][] Grid_size = new int[5][5]; 
    
    public static void main(String[] args) {
        ArrayList<String> commands = new ArrayList<>();

        PCMAN pc=new PCMAN();
         System.out.print("Enter Place x==> ");
         Scanner x = new Scanner(System.in); 
         String loc_x = x.nextLine();
                  Currunt_x=Integer.parseInt(loc_x);
            
          System.out.print("Enter Place y==> ");
         Scanner y = new Scanner(System.in); 
         String loc_y = y.nextLine();
          Currunt_y=Integer.parseInt(loc_y);
          
          
           System.out.print("Enter facing ==> ");
         Scanner facing = new Scanner(System.in); 
         Currunt_facing= facing.nextLine();
          
           pc.place(Currunt_x, Currunt_y, Currunt_facing);
        System.out.print("ENTER COMNDAS FOR PACMAN==> ");
        Scanner inputMenuChoice = new Scanner(System.in);   
        String choice = inputMenuChoice.nextLine();

        
     while (!choice.equals("REPORT"))
		{
                    

                    switch (choice)
			{
                                case "PLACE":
                                    
                                    System.out.print("Enter Place x==> ");
                                    x = new Scanner(System.in);
                                    loc_x = x.nextLine();
                                    Currunt_x=Integer.parseInt(loc_x);
                                    
                                    System.out.print("Enter Place y==> ");
                                     y = new Scanner(System.in);
                                    loc_y = y.nextLine();
                                    Currunt_y=Integer.parseInt(loc_y);
                                    
                                     System.out.print("Enter facing ==> ");
                                    facing = new Scanner(System.in); 
                                    Currunt_facing= facing.nextLine();
                                    
                                     pc.place(Currunt_x, Currunt_y, Currunt_facing);
                                     commands.add("PLACE ("+Currunt_x+","+Currunt_y+","+Currunt_facing+")");
                                      choice = inputMenuChoice.nextLine();
                                     break;
				case "MOVE":
				       pc.A_move();
                                       commands.add("MOVE");
                                       choice = inputMenuChoice.nextLine();
					break;
				case "LEFT":
				       pc.Change_currunt_facing("LEFT");
                                       commands.add("LEFT");
                                       choice = inputMenuChoice.nextLine();
					break;
                                case "RIGHT":
				       pc.Change_currunt_facing("RIGHT");
                                       commands.add("RIGHT");
                                       choice = inputMenuChoice.nextLine();
					break;
                                case "REPORT":
				      
                                       commands.add("REPORT");
                                       
					break;
				default:
					System.out.println("ERROR choice not recognised");
                                        break;
			}
        
            
        
       
    }
       
        System.out.println("GIVEN INPUTS ARE.......");
     
       for(String com : commands) {
           System.out.println(com);
         }
      
        System.out.println(Currunt_x+" "+Currunt_y+" "+Currunt_facing);
    }
       public void Change_currunt_facing(String P_facing){
   
   if(Currunt_facing.equals("NORTH")){
       
       if(P_facing.equals("LEFT")){
       
       Currunt_facing="WEST";
       }
       if(P_facing.equals("RIGHT")){
       
       Currunt_facing="EAST";
       }
   }
   
   
    if(Currunt_facing.equals("SOUTH")){
       
       if(P_facing.equals("LEFT")){
       
       Currunt_facing="EAST";
       }
       if(P_facing.equals("RIGHT")){
       
       Currunt_facing="WEST";
       }
   }
   
    
    
    
     if(Currunt_facing.equals("WEST")){
       
       if(P_facing.equals("LEFT")){
       
       Currunt_facing="SOUTH";
       }
       if(P_facing.equals("RIGHT")){
       
       Currunt_facing="NORTH";
       }
   }
     
     
     
      if(Currunt_facing.equals("EAST")){
       
       if(P_facing.equals("LEFT")){
       
       Currunt_facing="NORTH";
       }
       if(P_facing.equals("RIGHT")){
       
       Currunt_facing="SOUTH";
       }
   }
   
   
   }
    
    public void place(int x,int y,String facing ){
    
    Currunt_x=x;
    Currunt_y=y;
    Currunt_facing=facing;    
    
    
    }
   public void  A_move(){
       
       if(Currunt_facing.equals("NORTH")){
        
           if(Currunt_y!=4){
           
               Currunt_y++;
               
           }else{
           
               System.out.println("youcant..move");
           }                  
       }
       
       if(Currunt_facing.equals("SOUTH")){
        
           if(Currunt_y!=0){
           
               Currunt_y--;
               
           }  else{
           
               System.out.println("youcant..move");
           }                 
       }
       
         if(Currunt_facing.equals("WEST")){
        
           if(Currunt_x!=0){
           
               Currunt_x--;
               
           }  else{
           
               System.out.println("youcant..move");
           }                 
       }
       
       if(Currunt_facing.equals("EAST")){
        
           if(Currunt_x!=4){
           
               Currunt_x++;
               
           }   else{
           
               System.out.println("youcant..move");
           }                
       }
   
  
   } 
    
    }