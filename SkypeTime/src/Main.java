	import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
	
	public class Main extends JPanel{
		public Main(){
			JTextField data = new JTextField(20);
			this.add(data);
			JButton enter = new JButton("Send");
			 enter.addActionListener(new java.awt.event.ActionListener(){
				 public void actionPerformed(java.awt.event.ActionEvent evt){
					 String uRl = "https://script.google.com/macros/s/AKfycbzkyPXGKps1oknkDSHsK7_P0Pv_9D9-BksnOZnUzA7nARNw0T4/exec?name=-"+data.getText();
						URL url;
						char c;
						int i;
						try {
						url = new URL(uRl);		
						URLConnection conn = url.openConnection();
						InputStream is = conn.getInputStream();	
						while((i=is.read())!=-1)
				        {
				           c=(char)i;
				           System.out.print(c);
				        }
				     
					}catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 }
			 });
			 this.add(enter);
		}
		/*public static void main(String[] args){
			Scanner scan=new Scanner(System.in);
			ArrayList<String> nums = new ArrayList<String>();
			String s = "";
			double hours = 0;	
			double mins = 0;
			double seconds = 0;
			while(!s.equals("done")){
				s = scan.nextLine();
				if(!s.equals("done"))
				nums.add(s);
			}
			String[] x = nums.get(0).split("-");
			//System.out.println(nums.get(0).split("")[1]);
			for(int i=0;i<x.length;i++){
				hours+=(Integer.parseInt(x[i].split(":")[0]));
				//System.out.println(Integer.parseInt(x[i].split(":")[0])*60);
				mins+=Integer.parseInt(x[i].split(":")[1]);
				seconds+=Integer.parseInt(x[i].split(":")[2]);				
				if(seconds>=60){
					seconds-=60;
					mins++;
				}
				if(mins>=60){
					mins-=60;
					hours++;
				}
			}
			System.out.println(hours+" Hours, "+mins+" Minutes, "+seconds+" Seconds");
		}*/
	}
