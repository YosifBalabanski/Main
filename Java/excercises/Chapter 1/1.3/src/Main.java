
public class Main {

    public static void main(String[] args) {
	    int patternMatrix[][] = {
                {0,0,0,1,0,0,0,0,0,0,0,0,0},
                {1,0,2,2,2,0,3,0,3,2,2,2,0},
                {1,0,1,0,2,2,0,3,3,0,2,0,2},
                {1,0,2,2,2,2,0,3,0,2,2,2,2}
        };
	    PatternDecoder.matrixPrint(patternMatrix);
    }
}
