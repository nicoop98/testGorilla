
public class main{
  
        String list1 = "pan 1 2, leche 3 2";
        String list2 = "agua 2 2, aceite 4 3";
        String ap1 = total(list1);
        System.out.println("\nExpected: 2+6=8");
        String ap2 = total(list2);
        System.out.println("\nExpected: 4+12=16");
    
        public static String total(String[] groceryList){

            String list = groceryList.toString();
            String[] product = list.split(",");
            int ptotal=0;
            int priceProduct=0;
            StringBuilder out=new StringBuilder();
        
            for(int i=0; i<product.length; i++){
                String[] item = product[i].split(" ");
                priceProduct = Integer.valueOf(item[1])*Integer.valueOf(item[2]);
                ptotal+=priceProduct;
                if(product.length) out.append(priceProduct+"+");
                else out.append(priceProduct+"="+ptotal);
            }
        
            return out.toString();
        }

}


