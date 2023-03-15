package practice;

public class If {

    public static void main(String[] args) {

        int myInt = 15;

        if (myInt < 10){
            System.out.println("Less than 10");
        } else if( myInt > 20 ){
            System.out.println("Bigger than 20");
        } else{
            System.out.println("Others");
        }

        String rand = ( Math.random( ) * 10 > 5) ? ">5": "<5";
        System.out.println(rand);
    }
}
