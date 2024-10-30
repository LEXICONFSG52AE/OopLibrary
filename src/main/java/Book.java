import java.util.UUID;

public class Book {

    private String iD;
    private String Title;
    private String Author;
    private String Available;

    private Person owner;

    public Book(String Title, String Author, String Available, int ID ) {
        this.generateID();
        this.setTitle(Title);
        this.setAuthor(Author);
    }

    public Book(String Title, String Author) {
        this(Title, Author, iD,  );
    }

    // ## Methods
    // Getters and Setters are used to access and modify the private fields of a class
    // they are part of the principles of Encapsulation in OOP.
    private void generateID() {
        this.iD = UUID.randomUUID().toString();
    }

    public void setTitle(String Title) {
        if (Title == null) throw new IllegalArgumentException("Brand should not be null or empty.");
        this.Title = Title;
    }

    public void setAuthor(String Author) {
        if (Author == null) throw new IllegalArgumentException("Model should not be null or empty.");
        this.Author = Author;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getiD() {
        return this.iD;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getBookInfo() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Book Title: ");
        stringBuilder.append("Author: ");
        stringBuilder.append(iD);
        if (owner != null) {
            stringBuilder.append(" , Owner Name: ");
            stringBuilder.append(owner.getPersonInfo());
        } else {
            stringBuilder.append(" , No Owner assigned. ");

        }

        return stringBuilder.toString();
    }
}