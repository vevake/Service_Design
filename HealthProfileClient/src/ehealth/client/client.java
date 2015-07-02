package ehealth.client;

import java.io.Console;
import java.net.URL;
import java.nio.Buffer;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import  ehealth.ws.*;

public class client {

	public static  String username="", key="";
	public static boolean thread = true;
	public static LifeCoach lifestyle;
	public static void main(String[] args) throws Exception {

		URL url = new URL("http://localhost:8000/ehealth/LifestyleCoach?wsdl");
		QName qname = new QName("http://ws.ehealth/", "HealthProfile");
		Service service = Service.create(url, qname);
		lifestyle = service.getPort(LifeCoach.class);  
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        //log-in
        boolean logout =true;
        while(logout){
        System.out.println("Login to the system;");
        System.out.println("Enter Username:");
        username = buffer.readLine();
        System.out.println("Enter Password:");
        String password = buffer.readLine();
        key = lifestyle.login(username, password);
        if (!key.equals("Invalid login") && !key.equals("Enter username"))
        {
        	System.out.println("Your Key :" +key);
        	logout =false;
        	break;
        }
        }
        boolean flag= true;
        PushReminder thread_pr = new PushReminder();
        thread_pr.start_thread();
        while(flag){
            MenuPage();
            int option = Integer.parseInt(buffer.readLine());
        switch(option){
        
        case 1:	//Add LifeStatus
        		List<MeasureDefinition> md = lifestyle.getMeasuresDefinition();
        		System.out.println("Enter the Measure number to input:");
        		int i=0;
        		for (MeasureDefinition measure : md)
        		{
        			System.out.println(++i + " - " + measure.getMeasureName());
        		}
        		int m = Integer.parseInt(buffer.readLine());
        		UserProfile u = lifestyle.getUserProfile(username, key);
        		System.out.println("Enter the measure value:");
        		double value = Double.parseDouble(buffer.readLine());
        		System.out.println(md.get(m-1).getMeasureName());
        		lifestyle.addLifeStatus(username,key,value,md.get(m-1).getMeasureName());
        		break;
        
        case 2:	//Retrieve LifeStatus
        	List<LifeStatus> ls =lifestyle.viewLifeStatus(username, key);
        	for (LifeStatus l : ls)
        	{
        		System.out.print(l.getMeasureDefinition().getMeasureName());
        		System.out.print(" "+l.getValue());
        		System.out.println();
        	}
        	break;
        	
        case 3:	//view current Goal
        	List<Goal> g = lifestyle.getCurrentGoal(username, key);
        	for (Goal goal : g)
        	{
        		System.out.print("Goal:" +goal.getGoal());
        		System.out.print("  Time:"+goal.getScheduleDateTime());
        		System.out.println();
        	}
        	break;
        	
        case 4: //Share LifeStatus
        	String result = lifestyle.shareLifeStatus(username,key);
        	System.out.println(result);
        	break;
        	
        case 5: // Share Goal
        	String result1 = lifestyle.shareGoal(username,key);
        	System.out.println(result1);
        	break;
        
        case 6: // Get Motivation quotes
        	String quote = lifestyle.getMotivation();
        	System.out.println(quote);
        	break;
        	
        case 7:	//log-out
    		lifestyle.logout(username, key);
    		thread = false;
    		flag=false;
    		break;
        case 8: //Exit
        	flag = false;
        	thread = false;
        	break;
        default:
        		break;
      }	
     }   
	}
	private static void MenuPage(){
		System.out.println("*****MENU******");
		System.out.println("1.Add Lifestatus.");
		System.out.println("2.View the current LifeStatus");
		System.out.println("3.View current goal");
		System.out.println("4.Share LifeStatus");
		System.out.println("5.Share Goal");
		System.out.println("6.Get Motivational Quotes");
		System.out.println("7.Log-out");
		System.out.println("8.Exit");
		System.out.println("Enter your option from above:");
	}
	public static class PushReminder implements Runnable{
		private Goal g=null;
		private Thread t;
		private String goal;
		@Override
		public void run(){
			while(thread){
				try{
				if (!key.equals("")){
					g=lifestyle.getPushMessage(username, key);
					System.out.println(g);
					if(g!=null){
					goal = "Goal: " +g.getGoal();
					goal += "Time: " +g.getScheduleDateTime();
					JOptionPane.showMessageDialog(null, goal);
					}
				}
				t.sleep(1000 * 60 * 10);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		public void start_thread(){
			t = new Thread(this,"PushReminder");
			t.start();
		}
		
	}
}
