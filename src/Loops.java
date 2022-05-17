public class Loops {
    public static void main(String[] args) {
        int[] input={5,4,3,2,1};
        multiplier(input);


       inverter(input);


       for (int el:input){
           System.out.println(el);
       }

    }

    public static int[] multiplier(int[] input){
        int primer= input[0];
        for(int i=0;i<input.length;i++){
            if(i<input.length-1){

          input[i]= input[i]*input[i+1] ;
            }else{input[i]= input[i]*primer;}
        }
        return input;
    }

    public static int[] inverter(int[] input){
        int[] sample = input.clone();
        for(int i=0;i<input.length;i++){
            input[i]= sample[input.length-1-i];
        }
        return input;
    }
}


//Example
//
//input: [5, 4, 3, 2, 1]
//output: [20, 12, 6, 2, 5] // Explanation 5*4, 4*3, 3*2, 2*1, 1*5