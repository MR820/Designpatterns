package cn.org.wyxxt.builder;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/11 9:42 上午
 * @email jsjxzw@163.com
 */
public class Person {
    int id;
    String name;
    int age;
    double weight;
    Location loc;


    private Person() {
    }

    public static class PersonBuilder {
        Person p = new Person();

        public PersonBuilder basicInfo(int id, String name, int age) {
            p.id = id;
            p.name = name;
            p.age = age;
            return this;
        }

        public PersonBuilder weight(double weight) {
            p.weight = weight;
            return this;
        }

        public PersonBuilder loc(String street, String roomNo) {
            p.loc = new Location(street, roomNo);
            return this;
        }

        public Person build() {
            return p;
        }
    }
}

class Location {
    String street;
    String roomNo;

    public Location(String street, String roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }
}