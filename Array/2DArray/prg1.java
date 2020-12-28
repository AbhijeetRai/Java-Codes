class Demo {

        public static void main(String[] args) {

                int arr1[][] = {{1, 2}, {3, 4}};
                int arr2[][] = new int[][]{{1, 2}, {3, 4}};

                int[][] arr3 = {{1, 2}, {3, 4}};
                int[][] arr4 = new int[][] {{1, 2}, {3, 4}};

                int[][] arr5 = new int[2][2];

                //Cannot give both dimension and initializer
                //int[][] arr6 = new int[2][2]{1, 2, 3};

                //Do not give initializer at compile time.
                //int[2][2] arr7;

                //int arr8[2][2] = {1, 2, 3, 4};
        }
}
