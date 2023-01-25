public class Main {
    public static void main(String[] args) {
        Shark shark=new Shark("goba");
        Shark shark2=new Shark("dabi");
        Shark shark3=new Shark("rimuru");
        Shark shark4=new Shark("kleiman");
        Shark shark5=new Shark("hina");
        Duck duck=new Duck("doc");
        Duck duck2=new Duck("bob");
        Duck duck3=new Duck("bubai");
        Duck duck4=new Duck("gin");
        Duck duck5=new Duck("stark");
        Turtle turtle=new Turtle("ben");
        Turtle turtle2=new Turtle("lo");
        Turtle turtle3=new Turtle("dofi");
        Turtle turtle4=new Turtle("urog");
        Turtle turtle5=new Turtle("boni");
        Swimable[] swimable=new Swimable[]{shark,shark2,shark3,shark4,shark5
                ,turtle,turtle2,turtle3,turtle4,turtle5
                ,duck,duck2,duck3,duck4,duck5};
        Okeanarium okeanarium=new Okeanarium(swimable);
        for (Swimable sw:swimable) {
            if(sw instanceof Shark){
                sw.swim();
            }else if(sw instanceof Turtle){
                sw.swim();
            }else if(sw instanceof Duck){
                sw.swim();
            }
        }
        System.out.println(okeanarium);



    }
}