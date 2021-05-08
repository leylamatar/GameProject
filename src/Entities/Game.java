package Entities;

public class Game {
    private int id;
    private String GameName;
    private double Price;
    private String Category;

    public Game(int id,String GameName,double price,String Category){
        super();
        this.id = id;
        this.GameName = GameName;
        this.Price=price;
        this.Category = Category;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return GameName;
    }

    public void setGameName(String gameName) {
        GameName = gameName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
