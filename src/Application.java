import app.Kid;
import app.SantaClaus;

public class Application {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            Kid kid = new Kid("Jonny",true, "I Wish for World Peace");
            SantaClaus.get_Wish(kid);
        }
    }
}
