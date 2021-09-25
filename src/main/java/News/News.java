package News;

public class News {
    private int id;
    private int departmentId;
    private String title;
    private String newsType;
    private String newsDetails;

    public News(int departmentId, String title, String newsType, String newsDetails) {
        this.departmentId = departmentId;
        this.title = title;
        this.newsType = newsType;
        this.newsDetails = newsDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }

    public String getNewsDetails() {
        return newsDetails;
    }

    public void setNewsDetails(String newsDetails) {
        this.newsDetails = newsDetails;
    }
}
