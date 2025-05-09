package Singleton;

public class Samosa {

     private static Samosa samosa;

        private Samosa() {
            // private constructor to prevent instantiation
        }

//   this is a lazy initialization but it have some problem which is multiple threads can access
// at the same time and createe multiple instance of samosa 

        public static Samosa getInstance(){
            if(samosa==null){
                synchronized (Samosa.class) {

                    // this synchronized block is used to prevent multiple threads from creating multipe 
                    // instances of samosa at the same time
                    if(samosa==null){
                        samosa = new Samosa();
                    }
                }
            }

            return samosa;
        }
    
}
