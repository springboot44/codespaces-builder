package Singleton;

public class Main {

    public static void main(String[] args) {


        Samosa samosa1 = Samosa.getInstance();

        System.out.println(samosa1.hashCode());

        Samosa samosa2=Samosa.getInstance();

        System.out.println(samosa2.hashCode());

        Dosa dosa1=Dosa.getInstance();


        Dosa dosa2=Dosa.getInstance();
        System.out.println(dosa1.hashCode());
        System.out.println(dosa2.hashCode());
        
    }
    
}
