class Dog {

    private String name;
    private String gender;
    private String age;
    private double price;

    // Constructor to initialize Dog using DogBuilder
    Dog(DogBuilder dogBuilder) {
        this.name = dogBuilder.name;
        this.gender = dogBuilder.gender;
        this.age = dogBuilder.age;
        this.price = dogBuilder.price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    // Static nested DogBuilder class
    public static class DogBuilder {

        private String name;
        private String gender;
        private String age;
        private double price;

        // Setter methods for DogBuilder
        public DogBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public DogBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public DogBuilder setAge(String age) {
            this.age = age;
            return this;
        }

        public DogBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        // Build method to create a Dog instance
        public Dog build() {
            return new Dog(this);
        }
    }
}