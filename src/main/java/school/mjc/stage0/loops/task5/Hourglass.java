package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++){

            for(int j = 1; j <= height; j++){
                if (height%2 != 0){
                    if(i<=height/2){
                        if (j > i && j <= height - i){
                            System.out.print('8');
                        }else{
                            System.out.print(' ');
                        }
                    }else{
                        if(j <= i+1 && j >= height - i){
                            System.out.print('8');
                        }else{
                            System.out.print(' ');
                        }
                    }
                }else{
                    if(i<height/2){
                        if (j > i && j <= height - i){
                            System.out.print('8');
                        }else{
                            System.out.print(' ');
                        }
                    }else{
                        if(j <= i+1 && j >= height - i){
                            System.out.print('8');
                        }else{
                            System.out.print(' ');
                        }
                    }
                }
            }
            System.out.println("");
        }
    }
}
