public class Main {

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
    
        int MaxDistance = 0;
        int max = 0;
        for(int i=0; i<distances.length; i++){
            if(distances[i] > maxDistance) {
                totalDistance += distances[i];
                max = i;
            }
        }
    }

}


