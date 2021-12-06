package atm.src.function;

public class Junior extends JenisTabungan {
    public static int count;
    @Override
    public void keluarUang(double uang){

        setSaldo(getSaldo() - uang);

        count++;
    }
}
