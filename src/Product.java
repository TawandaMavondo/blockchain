
public class Product {

    private String from;
    private String to;
    private String description;

    public  Product(
            String from, String to, String description
    ){
        this.from =from;
        this.to =to;
        this.description = description;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
