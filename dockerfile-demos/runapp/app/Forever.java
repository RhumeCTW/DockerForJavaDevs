import lombok.extern.java.Log;

@Log
public class Forever {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Forevere world application");
        log.info("Run Forever using lombok");
        Thread.currentThread().join();
    }
}