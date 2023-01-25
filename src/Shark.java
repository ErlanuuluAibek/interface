public class Shark implements Swimable{
    private String nickName;

    public Shark(String nickName) {
        this.nickName = nickName;
    }

    public Shark() {
    }

    @Override
    public void swim() {
        System.out.println("shark is swimming");
    }

    @Override
    public String toString() {
        return "Shark "+nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
