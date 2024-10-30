public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Test1");
        Book book2 = new Book("Test2");
        Book book3 = new Book("Test3");

        Person p1 = new Person("Test Persson");
        Person p2 = new Person("Per Testsson");
        System.out.println(p1.getPersonInfo());
        System.out.println(p2.getPersonInfo());

        System.out.println("----------------------");
        book1.setOwner(p1);
        book2.setOwner(p1);
        book3.setOwner(p1);

        System.out.println(book1.getBookInfo());
        System.out.println(book2.getBookInfo());
        System.out.println(book3.getBookInfo());


    }
}