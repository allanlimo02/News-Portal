package News;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return id == news.id && departmentId == news.departmentId && Objects.equals(title, news.title) && Objects.equals(newsType, news.newsType) && Objects.equals(newsDetails, news.newsDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, departmentId, title, newsType, newsDetails);
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
