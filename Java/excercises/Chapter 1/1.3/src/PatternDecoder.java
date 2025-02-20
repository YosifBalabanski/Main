
public class PatternDecoder {
    public static void matrixPrint(int pMatrix[][]){
        for(int i=0; i < pMatrix.length; i++){
            for(int j=0; j < pMatrix[i].length; j++){
                pDecode(pMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void pDecode(int var){
        switch (var){
            case 0:
                System.out.print(" ");
                break;
            case 1:
                System.out.print("J");
                break;
            case 2:
                System.out.print("a");
                break;
            case 3:
                System.out.print("v");
                break;
            default:
                System.out.print(" ");
                break;
        }
    }
}
