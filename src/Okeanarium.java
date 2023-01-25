import java.util.Arrays;

public class Okeanarium {
   Swimable[] swimable;
    public Okeanarium(Swimable[] swimable) {
        this.swimable = swimable;
    }

    @Override
    public String toString() {
        return "Okeanarium{" + Arrays.toString(swimable) +
                '}';
    }
}
