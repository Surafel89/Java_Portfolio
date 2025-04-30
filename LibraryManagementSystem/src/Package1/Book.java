package Package1;

public class Book {
	private String  Author;
	private String title;
	private int id;
	private int  availablecopies;
	private int totalavailablecopies;
	
	public Book(String Author, String title, int id ,int availablecopies,int totalavailablecopies ) {
		
    this.Author=Author;
    this.title=title;
    this.id=id;
    this.availablecopies=totalavailablecopies;
    this.totalavailablecopies=totalavailablecopies;
    
		
	}
	public void setAuthor(String Author) {
		this.Author=Author;
	}
	public void settitle (String title) {
		this.title=title;
	}
	public void setavaiablecopies(int availablecopies) {
    this.availablecopies=availablecopies;}
	
    public void setid(int id) {
this.id=id; }
    public void settotalavailablecopies(int totalavailablecopies) {
    	this.totalavailablecopies=totalavailablecopies;
    }
    
    public String getAuthor() {
    	return Author;

    } 
    public String getttitle() {
    	return title;
    	
    }
    public int getavailablecopies () {
    	
    	return availablecopies;
    }
    public int gettotalavailablecopies() {
    	return totalavailablecopies;
    }
    





}
