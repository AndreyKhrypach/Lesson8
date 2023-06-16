import java.util.Objects;

public class Person {
    String name;
    int age;
    String sex;
    String colourEyes;
    boolean scars;

    public Person(String name, int age, String sex, String colourEyes, boolean scars) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.colourEyes = colourEyes;
        this.scars = scars;
    }

    public Person() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && scars == person.scars && Objects.equals(name, person.name) && Objects.equals(sex, person.sex) && Objects.equals(colourEyes, person.colourEyes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, colourEyes, scars);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", colourEyes='" + colourEyes + '\'' +
                ", scars=" + scars +
                '}';
    }
}
