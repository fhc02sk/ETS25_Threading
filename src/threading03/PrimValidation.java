package threading03;

public class PrimValidation implements Runnable {

    private final long number;
    private PrimStatus isPrim;

    public PrimValidation(long number) {
        this.number = number;
        isPrim = PrimStatus.NotStarted;

    }

    @Override
    public String toString() {
        return "PrimValidation{" +
                "number=" + number+
                ", isPrim=" + isPrim +
                '}';
    }

    public void validate(){

        isPrim = PrimStatus.Running;

        for (long l = 2; l < number; l++) {
            if (number % l == 0) {
                isPrim = PrimStatus.IsNotPrim;
                break;
            }
        }

        if (isPrim == PrimStatus.Running)
            isPrim = PrimStatus.IsPrim;

        System.out.println("done: " + number + " is a Prim: " + isPrim);
    }

    @Override
    public void run() {
        validate();
    }
}
