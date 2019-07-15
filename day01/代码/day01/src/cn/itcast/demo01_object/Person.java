package cn.itcast.demo01_object;

/*
    所有类都直接或者间接的继承自Object
    如果我们没有使用extends关键字继承其他类，那么这个类是继承自Object的。
 */
public class Person {
    private String name;
    private int age;

    //alt + insert
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }



    /*
    //重写equals方法，比较对象的属性，如果对象的属性完全相同，那么就看成是同一个对象
    @Override
    public boolean equals(Object obj) {
        //判断参数对象是否是null，如果是null直接返回false
        if(obj == null) {
            return false;
        }

        //判断参数对象是否是Person类型
        if(obj instanceof Person) {
            //向下转型，把参数obj转型成Person类型
            Person p = (Person)obj;
            //比较调用者对象的属性和参数对象的属性是否完全相同，如果完全相同，返回true。
            return this.name.equals(p.name) && this.age == p.age;
        }

        return false;
    }
    */

    //alt + insert
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    /*
    @Override
    public String toString() {
        return name + "-" + age;
    }
    */

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
