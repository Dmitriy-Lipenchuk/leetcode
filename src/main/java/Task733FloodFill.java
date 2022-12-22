import java.util.Arrays;

public class Task733FloodFill {
    public static void main(String[] args) {
        int newColor = 2;
        int sr = 1;
        int sc = 1;
        int[][] image = new int[][]{
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

//        System.out.println(array[0][1]);
//        System.out.println(array[1][1]);
//        System.out.println(array[2][1]);
//
//        System.out.println(array.length); // кол-во строк       высота
//        System.out.println(array[0].length); // длина строки    ширина

        flood(image, sr, sc, image[sr][sc], newColor);
        image[sr][sc] = newColor;
        System.out.println(Arrays.deepToString(image));
    }

    public static void flood(int[][] image, int sr, int sc, int color, int newColor) {

        if ((sr - 1) >= 0) {
            if (image[sr - 1][sc] == color) {
                image[sr - 1][sc] = newColor;
                flood(image, sr - 1, sc, color, newColor);
            }
        }

        if (!((sr + 1) > image.length - 1)) {
            if (image[sr + 1][sc] == color) {
                image[sr + 1][sc] = newColor;
                flood(image, sr + 1, sc, color, newColor);
            }
        }

        if ((sc - 1) >= 0) {
            if (image[sr][sc - 1] == color) {
                image[sr][sc - 1] = newColor;
                flood(image, sr, sc - 1, color, newColor);
            }
        }

        if (!((sc + 1) > image[0].length - 1)) {
            if (image[sr][sc + 1] == color) {
                image[sr][sc + 1] = newColor;
                flood(image, sr, sc + 1, color, newColor);
            }
        }

    }


}
