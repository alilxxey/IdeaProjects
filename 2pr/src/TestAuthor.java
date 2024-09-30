public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("John Doe", "john.doe@example.com", 'M');

        System.out.println(author);

        author.setEmail("john.new@example.com");

        System.out.println("Updated email: " + author.getEmail());
    }
}
