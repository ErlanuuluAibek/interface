public class Duck implements Swimable{
    private String nickName;

    public Duck(String nickName) {
        this.nickName = nickName;
    }

    public Duck() {
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public String toString() {
        return "Duck "+nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
