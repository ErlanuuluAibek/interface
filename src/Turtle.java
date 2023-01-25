public class Turtle implements Swimable{
    private String nickName;

    public Turtle(String nickName) {
        this.nickName = nickName;
    }

    public Turtle() {
    }

    @Override
    public void swim() {
        System.out.println("turtle is swimming ");
    }

    @Override
    public String toString() {
        return "Turtle "+nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
