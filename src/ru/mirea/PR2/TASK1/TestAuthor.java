package ru.mirea.PR2.TASK1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Bob", "bobabc@mail.com", 'm');
        System.out.println(author);
        author.setEmail("newmain@mail.com");
        System.out.println(author);
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        System.out.println(author.getName());
    }
}
