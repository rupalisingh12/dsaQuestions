package practise;

import java.util.*;
public class lec23 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		List<Integer>cans=new ArrayList<>();
		cans.add(7);
		cans.add(6);
		cans.add(4);
		cans.add(6);
		cans.add(10);
		cans.add(4);
		cans.add(4);
		cans.add(54);
		System.out.print(findTotalWeight(cans));
		
		
//		publi
	}
	
	public static int findTotalWeight(List<Integer>cans) {
		int min=Integer.MAX_VALUE;
		int a=-1;
		int tw=0;
		int k=0;
		
		while(cans.size()>0) {
			for(int i=0;i<cans.size();i++) {
				 if(min>=cans.get(i)) {
					 if(min==cans.get(i)) {
						 if(i<a) {
							 a=i;
						 }
						 else {
							 //do not do anything
						 }
					}
					 else {
						 min=cans.get(i);
						 a=i;
					 }
				 }
				 else {
					 // do not do anything
				 }
			}
			System.out.println(a);
			if(cans.size()==1) {
				cans.remove(a);
				
			}
			else if(a==0) {
				cans.remove(a);
				cans.remove(a);
			}
			else if(a==cans.size()-1) {
				cans.remove(a);

				cans.remove(a-1);
			}
			else {
			
				 cans.remove(a);
	             cans.remove(a-1);
	             cans.remove(a-1);
				 
			}

			
			 k++;
			 tw=tw+min;
			 min=Integer.MAX_VALUE;
			 a=-1;
			 
			 
		}
		return tw;
	 }

}
