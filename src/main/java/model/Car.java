package model;


public class Car {


    private int age;

    private String name;

    private int series;


    public Car() {
    }

    public Car(int id, String name, int series) {
        this.age = age;
        this.name = name;
        this.series = series;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", series=" + series +
                '}';
    }
}
