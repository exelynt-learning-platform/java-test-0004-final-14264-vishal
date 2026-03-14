public class ConcentricSquare {

    public static void main(String[] args) {

        int n = 4;                  // highest number in the pattern
        int size = 2 * n - 1;       // total rows and columns

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int min = top;
                if (left < min) min = left;
                if (right < min) min = right;
                if (bottom < min) min = bottom;

                int value = n - min;

                System.out.print(value);
                if (j < size - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}