package mathfunktions.addition;

import get.GetCellFromColumn;

public class AdditionOneColumn {

    public int[] additionColumn(int[] columnFromFirstArray, int[] columnFromSecondArray) {
        int sizeColumnFromFirstArray = columnFromFirstArray.length;
        int sizeColumnFromSecondArray = columnFromSecondArray.length;
        int columnSize = sizeColumnFromFirstArray > sizeColumnFromSecondArray ? sizeColumnFromFirstArray : sizeColumnFromSecondArray;
        int[] additionColumn = new int[columnSize];

        GetCellFromColumn cell = new GetCellFromColumn();
        for (int i = 0; i < columnSize; i++) {
            int valueFromFirstColumn = cell.getValue(i, columnFromFirstArray);
            int valueFromSecondColumn = cell.getValue(i, columnFromSecondArray);
            additionColumn[i] = valueFromFirstColumn + valueFromSecondColumn;
        }
        return additionColumn;
    }
}
