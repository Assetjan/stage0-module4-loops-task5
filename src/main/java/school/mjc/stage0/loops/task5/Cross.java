package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int k = 1;
        int l = 0;
        int h;
        for (int i = 0; i < sideLength; i++){
            for (int j = 0; j<sideLength; j++){
                h = j+1;
                if (k == j+1 || h == sideLength - l){
                    System.out.print('8');
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println("");
            k++;
            l++;
        }
    }
}

