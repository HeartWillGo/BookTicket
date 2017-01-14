package com.example.book_ticket;

public class ItemBean {
	private int imgid;  
    private String title;  
    private String detail;  
    
      private int number;
    public ItemBean() {  
        super();  
        // TODO Auto-generated constructor stub  
    }  
    public ItemBean(int imgid, String title, String detail,int number) {  
        super();  
        this.imgid = imgid;  
        this.title = title;  
        this.detail = detail;  
    }  
    public int getImgid() {  
        return imgid;  
    }  
    public void setImgid(int imgid) {  
        this.imgid = imgid;  
    }  
    public String getTitle() {  
        return title;  
    }  
    public void setTitle(String title) {  
        this.title = title;  
    }  
    public String getDetail() {  
        return detail;  
    }  
    public void setDetail(String detail) {  
        this.detail = detail;  
    }
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}  
  
}  

