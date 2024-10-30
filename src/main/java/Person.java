import java.util.Objects;

public class Person {
    private static int sequencer = 0;

        private String firstName;
        private String lastName;
        private int id;

        public Person(String firstName, String lastName, int id) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = getNextId();
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getid() {
            return id;
        }

        public String getPersonInfo() {
            return "Name: " + firstName + ", Lastname: " + lastName + ", ID: " + id;
        }

    // getNext ID ?
    public static int getNextId(){
        return ++sequencer;

// Loanbook


//returnBook


    }



}