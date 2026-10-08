public class KidsWithCandies1431 {

    public static void main(String[] args) {

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        int max = candies[0];

        // Find maximum candies
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        // Create result array
        boolean[] result = new boolean[candies.length];

        // Check each kid
        for (int i = 0; i < candies.length; i++) {

            if (candies[i] + extraCandies >= max) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }

        // Print result
        System.out.print("[ ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        System.out.println("]");
    }
}