package mathfunktions.subtraction;

import arreycreator.FirstArray;
import arreycreator.SecondArray;
import get.GetBiggerArray;
import get.GetOneColumn;


public class SubtractionArray {
    int[][] firstArray = new FirstArray().returnFirstArray();
    int[][] secondArray = new SecondArray().returnSecondArray();

    int sizeThirdArray = new GetBiggerArray().getSizeFromBiggerArray(firstArray, secondArray);
    int[][] subtractionArray = new int[sizeThirdArray][];

    GetOneColumn oneColumn = new GetOneColumn();

    public int[][] getArraySubtraction() {
        for (int i = 0; i < sizeThirdArray; i++) {
            int[] columnFromFirstArray = oneColumn.getOneColumn(i, firstArray);
            int[] columnFromSecondArray = oneColumn.getOneColumn(i, secondArray);
            int[] subtractionColumn = new SubtractionOneColumn().subtractionOneColumn(columnFromFirstArray, columnFromSecondArray);
            int sizeAdditionalColumn = subtractionColumn.length;
            subtractionArray[i] = new int[sizeAdditionalColumn];
            for (int j = 0; j < sizeAdditionalColumn; j++) {
                subtractionArray[i][j] = subtractionColumn[j];
            }
        }
        return subtractionArray;
    }
}
