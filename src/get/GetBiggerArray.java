package get;

public class GetBiggerArray {

    public int getSizeFromBiggerArray(int[][] firstArray, int[][] secondArray) {
        int[][] biggerArray;
        int sizeFirstArray = firstArray.length;
        int sizeSecondArray = secondArray.length;
        if (sizeFirstArray > sizeSecondArray) {
            biggerArray = firstArray;
        } else {
            biggerArray = secondArray;
        }
        return biggerArray.length;
    }
}
