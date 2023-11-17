import static java.lang.Math.max;
public class Book extends Product {
    private String genre, author, publisher, publishDate, language;
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPublishDate() {
        return publishDate;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getLanguage() {
        return language;
    }
    public boolean Find(String x){
        if(super.Find(x) || genre.contains(x) || author.contains(x) || publisher.contains(x) || publishDate.contains(x) || language.contains(x) ) return true;
        else return false;
    }
    public void Add(){
        super.Add();
        System.out.print("Nhập thể loại: "); genre = sc.nextLine();
        System.out.print("Nhập tác giả: "); author = sc.nextLine();
        System.out.print("Nhập tên nhà xuất bản: "); publisher = sc.nextLine();
        System.out.print("Nhập năm xuất bản: "); publishDate = sc.nextLine();
        System.out.print("Nhập ngôn ngữ: "); language = sc.nextLine();
        setGenre(genre);
        setAuthor(author);
        setPublisher(publisher);
        setPublishDate(publishDate);
        setLanguage(language);
    }
    public void Mode1(){
        super.Mode1();
        System.out.println("Thể loại: " + getGenre());
        System.out.println("Tác giả: " + getAuthor());
        System.out.println("Nhà xuất bản: " + getPublisher());
        System.out.println("Ngày xuất bản: " + getPublishDate());
        System.out.println("Ngôn ngữ: " + getLanguage());
    }
//    public void Mode2(int len_Name, int len_Price, int len_Brand, int len_Bonus){
//        super.Mode2(len_Name,len_Price,len_Brand,len_Bonus);
//        len_Bonus = max(len_Bonus, ("- Thể loại: " + getGenre()).length());
//        len_Bonus = max(len_Bonus, ("- Tác giả: " + getAuthor()).length());
//        len_Bonus = max(len_Bonus, ("- Nhà xuất bản: " + getPublisher()).length());
//        len_Bonus = max(len_Bonus, ("- Năm xuất bản: " + getPublishDate()).length());
//        len_Bonus = max(len_Bonus, ("- Ngôn ngữ: " + getLanguage()).length());
//    }
}
