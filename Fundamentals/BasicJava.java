import java.util.ArrayList;

public class BasicJava {
    public void oneToTwoFiftyFive() {
        for(int i = 0; i < 256; i++){
            System.out.println(i);
        }
    }

    public void oneToTwoFiftyFiveOdd(){
        for(int i=0; i<256; i++){
            if(i%2==1){
                System.out.println(i);
            }
            else{
                continue;
            }
        }
    }

    public void printSum(){
        int sum = 0;
        for(int i=0; i<256; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public void iterateArray(int[] givenArray){
        int length = givenArray.length;
        for(int i=0; i< length; i++){
            System.out.println(givenArray[i]);
        }
    }

    public void findMax(int[] givenArray){
        int length = givenArray.length;        
        int max = givenArray[0];
        for(int i=1; i< length; i++){
            if(max < givenArray[i]){
                max = givenArray[i];
            }
        }
    }

    public void getAverage(int[] givenArray){
        int length = givenArray.length;
        double sum = 0;
        for (int i = 0; i < length; i++){
            sum = sum + givenArray[i];
        }
        double avg = sum / length;
        System.out.println("Avg is: " + avg);
    }

    public void arrayOddNumber(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
            for (int i = 1; i < 256; i = i + 2) {
                myArray.add(i);
            }
    
            System.out.println(myArray);
    }

    public void greaterThanY(int[] givenArray, int y){
        int length = givenArray.length;
        int count = 0;
        for (int i = 0; i < length; i++){ 
            if (givenArray[i] > y){
                count++;
            }
        }
        System.out.println(count);
    }

    public void squareValues(int[] givenArray){
        int length = givenArray.length;
        for (int i = 0; i < length; i++){ 
            givenArray[i] *= givenArray[i];
        }

        System.out.println(givenArray);
    }

    public void eliminateNegativeNumber(int[] array){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        int length = array.length;

        for(int i = 0; i < length; i++) {
            if(array[i] < 0) {
                myArray.add(0);
            } else {
                myArray.add(array[i]);
            }
        }

        System.out.println(myArray);       
    }

    public void minMaxAverage(int[] givenArray){
        int length = givenArray.length;
        int max = givenArray[0];
        int min = givenArray[0];
        double sum = 0;
            for (int i = 1; i < length; i++){
                if(givenArray[i] < min){
                    min = givenArray[i];
                }
                if (givenArray[i] > max){
                    max = givenArray[i];
                }
            sum = sum + givenArray[i];
            }
        double avg = sum / length;
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
        System.out.println("Avg is: " + avg);
    }

    public void shiftValueArray(int[] givenArray){
        int length = givenArray.length - 1;        
            for(int i = 0; i < length; i++){
                givenArray[i] = givenArray[i + 1];
            }
    
            givenArray[length] = 0;
    
            System.out.println(givenArray);
    }

}