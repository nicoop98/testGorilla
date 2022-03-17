package ejercicios;

import java.util.Iterator;

public class grocery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String[] list1 = {"pan 1 2","leche 3 2"};
        String[] list2 = {"agua 2 2","aceite 4 3"};
        String[] list3 = {"agua-5 2","aceite-6_3"};
        String ap1 = total(list1);
        System.out.println(ap1.toString());
        System.out.println("\nExpected: 2+6=8");
        String ap2 = total(list2);
        System.out.println(ap2.toString());
        System.out.println("\nExpected: 4+12=16");
        String ap3 = total(list3);
        System.out.println(ap3.toString());
        System.out.println("\nExpected: 10+18=28");
	}
	
	public static String total(String[] groceryList){

        String list = groceryList.toString();
        int ptotal=0;
        int priceProduct=0;
        StringBuilder out=new StringBuilder();
    
        for(int i=0; i<groceryList.length; i++){
        	String[] item = groceryList[i].split("[ _-]");
//            String[] item = groceryList[i].split(" ");
            
            priceProduct = Integer.valueOf(item[1])*Integer.valueOf(item[2]);
            ptotal+=priceProduct;
        	System.out.println(ptotal);
            
            if(i<groceryList.length-1) out.append(priceProduct+"+");
            else out.append(priceProduct+"="+ptotal);
            
        }
    
        return out.toString();
    }

}
