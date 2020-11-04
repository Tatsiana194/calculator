package get;

public class GetOneColumn {
    public int[] getOneColumn(int columnNumber, int[][] arrayGetColumn) {
        int arraySize = arrayGetColumn.length;
        int[] column;
        if (arraySize - 1 < columnNumber) {
            column = new int[1];
            column[0] = 0;
        } else {
            int columnSize = arrayGetColumn[columnNumber].length;
            column = new int[columnSize];
            for (int i = 0; i < columnSize; i++) {
                column[i] = arrayGetColumn[columnNumber][i];
            }
        }
        return column;
    }
}
