package ejercicios;

public class calculator {

	public static void main(String[] args) {
		
		String[] viaje1={"Vienna-Prague 312", "Prague-Zurich 676"};
	    String[] viaje2={"Vienna Prague 312", "Prague Zurich 676"};
	    String[] viaje3= {"trayecto1 10", " trayecto2 20"};
	    
	    String ap1=calculator(viaje1);
	    String ap2=calculator(viaje2);
	    String ap3=calculator(viaje3);
	    
	    System.out.println("\nActual: \t"+ap1.toString());
	    System.out.println("\nExpected: \tLongest: Prague-Zurich 676, Expenses: $160.55");
	    System.out.println("\nActual: \t"+ap2.toString());
	    System.out.println("\nExpected: \tLongest: Prague Zurich 676, Expenses: $160.55");
	    System.out.println("\nActual: \t"+ap3.toString());
	    System.out.println("\nExpected: \tLongest: trayecto2 20, Expenses: $4.88");
	}
	//(312+676)/8*1.3
	
	public static String calculator(String[] distancesList) {
        final double perLitre = 1.30;
        final double consumption = 8;
        int totalDistance = 0;
        int[] distances = new int[distancesList.length];
    
        for(int i=0; i<distancesList.length; i++){
            String item = distancesList[i];
            String[] words = item.split("[ -]");
            String distInKm = words[words.length-1];
            distances[i] = Integer.parseInt(distInKm);
        }
    
        int maxDistance = 0;
        int max = 0;
        for(int i=0; i<distances.length; i++){
            if(distances[i] > maxDistance) {
                totalDistance += distances[i];
                max = i;
                System.out.println(totalDistance);
            }
        }
        
        double litres=totalDistance/consumption;
     //       String cost=String.format("%.2f", (litres*1.3));
        double cost=litres*perLitre;
        String sb="Longest: "+distancesList[max].toString()+", Expenses: $"+cost;
        
		return sb;
    }

}
