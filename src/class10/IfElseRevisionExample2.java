package class10;

public class IfElseRevisionExample2 {
    public static void main(String[] args) {
        int i = 10, j = 5, k = 11;

        if(i + 1 <= k && j <= 11){

            if(i>k){
                System.out.println("1");
            }else if(k > j){
                System.out.println("2");
            }else{
                System.out.println("3");
            }


        }else{
            System.out.println("4");
        }
    }
}




