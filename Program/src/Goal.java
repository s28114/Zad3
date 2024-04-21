public class Goal {
    private String Imie;
    private int bonus;
    private int rok;
    private int miesiac;
    private int dzien;

    public Goal(String Imie, int bonus, int rok, int miesiac, int dzien) {
        this.Imie = Imie;
        this.bonus = bonus;
        this.rok = rok;
        this.miesiac = miesiac;
        this.dzien = dzien;
    }

    public String getName() {
        return Imie;
    }

    public int getBonus() {
        return bonus;
    }

    public int getYear() {
        return rok;
    }

    public int getMonth() {
        return miesiac;
    }

    public int getDay() {
        return dzien;
    }
}
