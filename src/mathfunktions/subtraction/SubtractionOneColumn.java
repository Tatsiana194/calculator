package mathfunktions.subtraction;

import get.GetCellFromColumn;

public class SubtractionOneColumn {

    public int[] subtractionOneColumn(int[] columnFromFirstArray, int[] columnFromSecondArray) {
        int sizeColumnFromFirstArray = columnFromFirstArray.length;
        int sizeColumnFromSecondArray = columnFromSecondArray.length;
        int columnSize = sizeColumnFromFirstArray > sizeColumnFromSecondArray ? sizeColumnFromFirstArray : sizeColumnFromSecondArray;
        int[] subtractionColumn = new int[columnSize];

        GetCellFromColumn cell = new GetCellFromColumn();
        for (int i = 0; i < columnSize; i++) {
            int valueFromFirstColumn = cell.getValue(i, columnFromFirstArray);
            int valueFromSecondColumn = cell.getValue(i, columnFromSecondArray);
            subtractionColumn[i] = valueFromFirstColumn - valueFromSecondColumn;
        }
        return subtractionColumn;
    }
}
