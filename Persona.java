public class Persona {
    private String name;
    private String surName;
    private int age;

    public Persona(String name, String lastName, int age) {
        this.name = name;
        this.surName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setLastName(String lastName) {
        this.surName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona [name= " + name + ", SurName= " + surName + ", age= " + age + "]";
    }
}
