public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("BookTitel1");
        Book book2 = new Book("BookTitel1");
        Book book3 = new Book("BookTitel1");

        Person p1 = new Person("Förnamnett");
        Person p2 = new Person("Förnamntvå");
        System.out.println(p1.getPersonInfo());
        System.out.println(p2.getPersonInfo());

        System.out.println("----------------------");
        book1.setOwner(p1);
        book2.setOwner(p2);
        book3.setOwner(p1);

        System.out.println(book1.getBookInfo());
        System.out.println(book2.getBookInfo());
        System.out.println(book3.getBookInfo());


    }
}