package get;

public class GetCellFromColumn {
    public int getValue(int numberCell, int[] oneArray) {
        int cell;
        int sizeArray = oneArray.length;
        if (numberCell > sizeArray-1) {
            cell = 0;
        } else {
            cell = oneArray[numberCell];
        }
        return cell;
    }
}
