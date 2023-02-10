public class asalsayı {
    public static void main(String[] args) {
        int j = 2, x = 2;
        while (x < 97) {
            while (x > j) {
                if (x % j == 0) {
                    x++;
                    j = 1;
                }
                j++;
            }
            System.out.println(x);
            j = 2;
            x++;
        }
    }
}
