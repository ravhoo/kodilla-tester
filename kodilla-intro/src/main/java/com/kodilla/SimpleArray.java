public class SimpleArray {
    public static void main(String[] args) {
        String[] favoriteThings = new String[5];
        favoriteThings[0] = "Jazz music";
        favoriteThings[1] = "Horror music";
        favoriteThings[2] = "Gym";
        favoriteThings[3] = "Coffee";
        favoriteThings[4] = "Sleep";
        System.out.println(favoriteThings[4]);
        int numberOfElements = favoriteThings.length;
        System.out.println(numberOfElements);
    }
}
