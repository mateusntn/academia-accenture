public abstract class Animals {
    private String Name;
    private int Age;

    public Animals() {
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Animals(String name, int age) {
        setName(name);
        setAge(age);
    }

    public abstract void MakeSound();
}
