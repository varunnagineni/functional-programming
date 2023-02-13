package com.functional.programming.firstClassFunctions;


/**
 * Assign the function definition dynamically at the runtime
 */
public class FunctionsAsData {

    protected static class Person {
        private String name;
        private Integer age;

        public Person (String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    protected static class DataLoader {
        public final NoArgFunction<Person> loadPerson;

        public DataLoader(Boolean isDevelopment) {
            this.loadPerson = isDevelopment ? this::loadPersonFake : this::loadPersonReal;
        }
        private Person loadPersonReal() {
            System.out.println("Loading person ....");
            return new Person ("Real Person", 30);
        }

        private Person loadPersonFake() {
            System.out.println("Returning Fake person Object ...");
            return new Person("Fake Person", 40);
        }
    }
    public static void main(String[] args) {
        final Boolean IS_DEVELOPMENT = true;

        DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
        System.out.println(dataLoader.loadPerson.apply());
    }
}
