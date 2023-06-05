package web.model;

public class User {
    private int id;
    private String name;
    private String surname;
    private int years;

    public User() {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.years = years;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "User: " +
                "id = " + id +
                ",  name = " + name +
                ", surname = " + surname +
                ", years = " + years;
    }
}
