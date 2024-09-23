package e2;

public class BookMain {
    public static void main(String[] args) {
        Book big=new Book("big","jeff",1287);
        Book jig=new Book("jig","john",1987);
        Book aig=new Book("aig","huang",1917);

        BookCase jeff=new BookCase();
       

        jeff.PutBookInBookCase(big,jig,aig);

        
        
        
    }

    

}
