public class Main {


    public static void main(String[] args) {
        

        Dog dog =new Dog.DogBuilder()
                .setName("Dog")
                .setAge(
                    "5"
                )
                .setGender("male").
                setPrice(40)
                .build();

                System.out.println(dog.getAge());
    }
    
}
