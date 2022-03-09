public class PictureBook extends Book{
    private String illustrator;
    public PictureBook(String title, String author, String i){
        super(title,author);
        illustrator = i;
    }
    public void printBookInfo(){
        super.printBookInfo();
        System.out.print(" and illustrated by " + illustrator);
    }
}
