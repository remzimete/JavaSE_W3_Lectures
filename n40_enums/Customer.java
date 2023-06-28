package n40_enums;

import n40_enums.App.Color;
public class Customer {

    private int id;
    private City city;
    private String name;
    private Color favoriteColor;



    public Customer(int id, City city, String name, Color favoriteColor) {
        this.id = id;
        this.city = city;
        this.name = name;
        this.favoriteColor = favoriteColor;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(Color favoriteColor) {
        this.favoriteColor = favoriteColor;
    }
}
