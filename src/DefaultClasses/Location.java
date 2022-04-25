package DefaultClasses;

public class Location {
    Location(Double x, Float y, long z, String name){
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    private Double x; //Поле не может быть null
    private Float y; //Поле не может быть null
    private long z;
    private String name; //Строка не может быть пустой, Поле не может быть null
}
