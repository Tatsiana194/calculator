package mathfunktions.addition;

import arreycreator.FirstArray;
import arreycreator.SecondArray;
import get.GetBiggerArray;
import get.GetOneColumn;

public class AdditionArray {
    int[][] firstArray = new FirstArray().returnFirstArray();
    int[][] secondArray = new SecondArray().returnSecondArray();

    int sizeThirdArray = new GetBiggerArray().getSizeFromBiggerArray(firstArray, secondArray);
    int[][] additionArray = new int[sizeThirdArray][];

    GetOneColumn oneColumn = new GetOneColumn();

    public int[][] getArrayAddition() {
        for (int i = 0; i < sizeThirdArray; i++) {
            int[] columnFromFirstArray = oneColumn.getOneColumn(i, firstArray);
            int[] columnFromSecondArray = oneColumn.getOneColumn(i, secondArray);
            int[] additionalColumn = new AdditionOneColumn().additionColumn(columnFromFirstArray, columnFromSecondArray);
            int sizeAdditionalColumn = additionalColumn.length;
            additionArray[i] = new int[sizeAdditionalColumn];
            for (int j = 0; j < sizeAdditionalColumn; j++) {
                additionArray[i][j] = additionalColumn[j];
            }
        }
        return additionArray;
    }
}