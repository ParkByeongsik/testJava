package basic;

public class Person {
    private String name;
    private int age;
    private String addr;

    public Person() {

    }
    public Person(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddr() {
        return addr;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
}