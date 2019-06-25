public class Book {
//    public static void main(String[] args){
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    public Book (){
        System.out.println("The constructor has run");
    }

    public Book(String title, String author, String description, double price,
                boolean isInstock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInstock;
    }

    public String getDisplayText(){
        return "Author: "  + author + "\n" + "Title: " + title + "\n" + description;
    }

////    GETTERS for each private variable
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getDescription(){
        return this.description;
    }
    public double getPrice(){
        return this.price;
    }
    public boolean getisInStock(){
        return this.isInStock;
    }

    //SETTERS
        public void setTitle(String title){
            this.title = title;
        }
        public void setAuthor(String author){
            this.author=author;
        }
        public void setDescription(String description){
            this.description = description;
        }
        public void setPrice(double price){
            this.price = price;
        }
        public void setisInStock(boolean isInStock){
            this.isInStock = isInStock;
        }



//    }
}

