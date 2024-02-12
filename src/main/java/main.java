import org.example.work.services.WorkService;

public class main {
    public static void main(String[] args) {

        WorkService service = new WorkService();

        System.out.println(service.calculate(10_000, 3_000, 20_000));
        System.out.println(service.calculate(100_000, 60_000, 150_000));


    }
}
