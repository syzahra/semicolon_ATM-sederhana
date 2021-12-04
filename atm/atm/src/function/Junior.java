package function;

public class Junior extends JenisTabungan {
    @Override
    public void keluarUang(double uang){
        if(uang <= 1000000){
            setSaldo(getSaldo() - uang);
        }
    }
}
