import java.util.ArrayList;

public class Tester extends Employee {
    private ArrayList<String> testTypes;

    public Tester(String Imie, String Nazwisko, String adres, String email, String pesel, int rokzatrudnienia) {
        super(Imie, Nazwisko, adres, email, pesel, rokzatrudnienia);
        testTypes = new ArrayList<>();
    }

    public void addTestType(String testType) {
        testTypes.add(testType);
    }

    public ArrayList<String> getTestTypes() {
        return testTypes;
    }

    public int LiczeniePensji() {
        int Placa = 3000;
        int CzasPracy = Math.max(0, 2024 - rokzatrudnienia);
        int DodatkowaPlaca = CzasPracy * 1000;

        DodatkowaPlaca += testTypes.size() * 300;

        return Placa + DodatkowaPlaca;

    }

}
