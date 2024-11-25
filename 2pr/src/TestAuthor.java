public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Alexey Tyunkin", "none", 'M');

        System.out.println(author);

        author.setEmail("tyunkin@google.com");

        System.out.println(author);
    }
}
