public class SpiralMatrixBypass {
    public int[] print(int[][] input) {
        int h = input.length;
        int w = input[0].length;

        int top = 0, right = w - 1, left = 0, bottom = h - 1;
        int[] array = new int[w * h];
        int[] row = input[top];

        int k = 0;
        for (int i = left; i <= right; i++) {
            array[k] = row[i];
            k++;
        }
        for (int i = top; i <= bottom; i++) {
            array[k] = row[i];
            k++;
        }
        return array;
    }
}


/* for (int i = right; i <= left; i++) {
                array[k] = row[i];
                k++;
            }
            for (int i = left; i <= top - 1; i++) {
                array[k] = row[i];
                k++;
            } */