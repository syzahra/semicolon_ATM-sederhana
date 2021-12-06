package atm.src.function;

public class Haji extends JenisTabungan{
    @Override
    public void keluarUang(double uang){
        double minPenarikan = 0.1 * getSaldo();

        if (uang >= minPenarikan) {
            setSaldo(getSaldo() - uang - 50000);

        }
        else {
            setSaldo(getSaldo() - uang);
        }
    }
}
