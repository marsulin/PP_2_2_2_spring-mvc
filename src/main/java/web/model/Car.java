package web.model;

public class Car {
  @Override
  public String toString() {
    return "Car{" +
        "id=" + id +
        ", brand='" + brand + '\'' +
        ", color='" + color + '\'' +
        '}';
  }

  private int id;
  private String brand;
  private String color;

  public Car(int id, String brand, String color) {
    this.id = id;
    this.brand = brand;
    this.color = color;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
