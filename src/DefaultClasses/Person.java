package DefaultClasses;

import DefaultClasses.Color1;
import DefaultClasses.Color2;
import DefaultClasses.Country;

public class Person {
    Person(String name, Long height, Color1 eyeColor, Color2 haircolor, Country nationality, Location location){
        this.eyeColor = eyeColor;
        this.name = name;
        this.height = height;
        this.hairColor = haircolor;
        this.nationality = nationality;
        this.location = location;
    }
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Long height; //Поле может быть null, Значение поля должно быть больше 0
    private Color1 eyeColor; //Поле не может быть null
    private Color2 hairColor; //Поле может быть null
    private Country nationality; //Поле не может быть null
    private Location location; //Поле не может быть null
}
