import java.util.ArrayList;

public class BookApp{
    public static void main(String[] args){
// To add books to array for method
// ArrayList<Integer> books= new ArrayList<Integer>();
        //    Book book1 = new Book("The Two Towers", "J.R.R. Tolkien", "The second book of the Lord of the Rings series", 10.89, true);

        Book book1 = new Book();
        book1.setTitle("The Two Towers");
        book1.setAuthor("J.R.R. Tolkien");
        book1.setDescription("The second book of the Lord of the Rings series");
        book1.setPrice(10.89);
        book1.setisInStock(true);


        Book book2 = new Book();
        book2.setTitle("Holes");
        book2.setAuthor("Louis Sachar");
        book2.setDescription("Centers around unlucky teenage boy Stanley Yelnats, who is sent to juvenile corrections facility in desert to dig holes");
        book2.setPrice(7.99);
        book2.setisInStock(true);


        Book book3 = new Book();
        book3.setTitle("Modern Romance");
        book3.setAuthor("Aziz Ansari");
        book3.setDescription("Aziz Ansari researches the relationship of modern romance and technology");
        book3.setPrice(6.98);
        book3.setisInStock(false);

        Book book4 = new Book();
        book4.setTitle("A Game of Thrones");
        book4.setAuthor("George R.R. Martin");
        book4.setDescription("The first novel of 'A Song of Ice and Fire' epic fantasy series");
        book4.setPrice(8.99);
        book4.setisInStock(false);

        Book book5 = new Book();
        book5.setTitle("Unfu*k yourself");
        book5.setAuthor("Gary John Bishop");
        book5.setDescription("Refreshing, BS-free, self-empowerment guide that offers an honest, no-nonsense, " +
                "tough-love approach to help you move past self-imposed limitations.");
        book5.setPrice(11.99);
        book5.setisInStock(true);

        System.out.println(book1.getDisplayText());
        System.out.println(book2.getDisplayText());
        System.out.println(book3.getDisplayText());
        System.out.println(book4.getDisplayText());
        System.out.println(book5.getDisplayText());


    }

}