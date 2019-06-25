public class BookApp{
    public static void main(String[] args){
//    Book book1 = new Book("The Two Towers", "J.R.R. Tolkien", "The second book of the Lord of the Rings series", 10.89, true);
      Book book1 = new Book();
      book1.setTitle("The Two Towers");
      book1.setAuthor("J.R.R. Tolien");
      book1.setDescription("The second book of the Lord of the Rings series");
      book1.setPrice(10.89);
      book1.setisInStock(true);
        System.out.println(book1.getDisplayText());


    }

}