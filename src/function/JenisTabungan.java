package atm.src.function;

public abstract class JenisTabungan {
    private String noRek;
    private String pin;
    private double saldo;

    public JenisTabungan(){
        this.noRek = "20081070";
        this.pin = "1234";
        this.saldo = 1000000;
    }

    public String getNoRek() {
        return noRek;
    }

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void masukUang(double uang){
        this.saldo = getSaldo() + uang;
    }

    public abstract void keluarUang(double uang);
}
