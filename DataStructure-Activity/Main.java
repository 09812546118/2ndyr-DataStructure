/*
*  MULTIDIMENSIONAL ARRAYS
*
* */

public class Main {
    public static void main(String[] args) {}

    public static void display3DArray() {
        /*
        *   Example: 3D Array
        *   String[][][] names = new String[array_index][row_index][column_index];
        *   String[][][] names = {
        *       {
        *           { "a", "b", "c" },
        *           { "d", "e", "f" },
        *           { "g", "h", "i" },
        *           { "j", "l", "m" }
        *       },
        *       {
        *           { "n", "o", "p" },
        *           { "q", "r", "s" },
        *           { "t", "u", "v" },
        *           { "w", "x", "y" }
        *       }
        *   }
        *
        *   Example: kuhaon value sa "u"
        *   System.out.println(names[1][2][1]);
        */
        String[][][] names = {
            {
                { "a", "b", "c" },
                { "d", "e", "f" },
                { "g", "h", "i" },
                { "j", "l", "m" }
            },
            {
                { "n", "o", "p" },
                { "q", "r", "s" },
                { "t", "u", "v" },
                { "w", "x", "y" }
            }
        };

        for (String[][] s: names) {
            // s = {
            //   { "a", "b", "c" },
            //   { "d", "e", "f" },
            //   { "g", "h", "i" },
            //   { "j", "l", "m" }
            // }
            for (String[] i: s) {
                // i = { "a", "b", "c" }
                for (String x: i) {
                    // x = "a"
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void display2DArray() {
        /*
        *  Example: 1D Array
        *   int[] oneDArray = new int[array_size];
        *   int[] oneDArray = { 1, 2, 3, 4, 5 };
        *
        *  Example: 2D Array
        *   int[][] t = new int[row][column];
        *   int[][] t = {{ 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }}
        *
        *   Tabular form: "kunuhay"
        *   - 1  2  3  4  5
        *   - 6  7  8  9  10
        *   - 11 12 13 14 15
        *     .  .  .  .  .
        *
        *   Indeces based on tabular form:
        *    t[0][0] t[0][1] t[0][2] t[0][3] t[0][4]
        *    t[1][0] t[1][1] t[1][2] t[1][3] t[1][4]
        *    t[2][0] t[2][1] t[2][2] t[2][3] t[2][4]
        */

        int[][] t = {{ 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }};

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        // System.out.println(t[2][3]);
    }
}