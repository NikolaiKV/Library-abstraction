public abstract class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
