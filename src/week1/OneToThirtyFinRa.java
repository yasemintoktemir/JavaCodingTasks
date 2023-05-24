package day0524;

public class OneToThirtyFinRa {
    public static void main(String[] args) {
        for(int i=1; i<31 ; i++){
            if(i%3==0 && i%5==0){
                System.out.print("Finra/");
            }else if(i%3==0){
                System.out.print("Fin/");
            }else if(i%5==0){
                System.out.print("Ra/");
            }else {
                System.out.print(i+"/");
            }
        }

    }
}