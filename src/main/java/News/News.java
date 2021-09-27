package News;

import java.util.Objects;

public class News {
    private int id;
    private int department_id;
    private String title;
    private String category;
    private String news_details;

    public News(int departmentId, String title, String newsType, String newsDetails) {
        this.department_id = departmentId;
        this.title = title;
        this.category = newsType;
        this.news_details = newsDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return id == news.id && department_id == news.department_id && Objects.equals(title, news.title) && Objects.equals(category, news.category) && Objects.equals(news_details, news.news_details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, department_id, title, category, news_details);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNews_details() {
        return news_details;
    }

    public void setNews_details(String news_details) {
        this.news_details = news_details;
    }
}
