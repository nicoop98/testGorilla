public class main {

    String viaje1="Vienna-Prague 312, Prague-Zurich 676";
    String viaje2="Vienna Prague 312, Prague Zurich 676";


    public static String calculator(String[] distancesList) {
        final double perLitre = 1.30;
        final int consumption = 8;
        int totalDistance = 0;
        int[] distances = new int[distancesList.length];
    
        for(int i=0; i<distancesList.length; i++){
            String item = distancesList[i];
            String[] words = item.split(" ");
            String distInKm = words[words.length-1];
            distances[i] = Integer.parseInt(distInKm);
        }
    
        int maxDistance = 0;
        int max = 0;
        for(int i=0; i<distances.length; i++){
            if(distances[i] > maxDistance) {
                totalDistance += distances[i];
                max = i;
            }
        }
    }
}