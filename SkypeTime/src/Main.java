	import java.util.ArrayList;
	import java.util.Scanner;
	
	public class Main {
		public static void main(String[] args){
			Scanner scan=new Scanner(System.in);
			ArrayList<String> nums = new ArrayList<String>();
			String s = "";
			double hours = 0;	
			double mins = 0;
			while(!s.equals("done")){
				s = scan.nextLine();
				if(!s.equals("done"))
				nums.add(s);
			}
			String[] x = nums.get(0).split("-");
			System.out.println(nums.get(0).split("")[1]);
			for(int i=0;i<x.length;i++){
				hours+=(Integer.parseInt(x[i].split(":")[0]));
				//System.out.println(Integer.parseInt(x[i].split(":")[0])*60);
				mins+=Integer.parseInt(x[i].split(":")[1]);
				if(mins>=60){
					mins-=60;
					hours++;
				}
			}
			System.out.println(hours+" Hours, "+mins+" Minutes");
		}
	}
