import java.util.ArrayList;

public class Developer extends Employee {
    private ArrayList<Technology> technologies;

    public Developer(String Imie, String Nazwisko, String adres, String email, String pesel, int rokzatrudnienia) {
        super(Imie, Nazwisko, adres, email, pesel, rokzatrudnienia);
        technologies = new ArrayList<>();
    }

    public void addTechnology(Technology technology) {
        technologies.add(technology);
    }

    public ArrayList<Technology> getTechnologies() {
        return technologies;
    }

    public int LiczeniePensji() {
        int Placa = 3000;
        int CzasPracy = Math.max(0, 2024 - rokzatrudnienia); // assuming current year is 2024
        int DodatkowaPlaca = CzasPracy * 1000;


        for (Technology technology : technologies) {
            DodatkowaPlaca += technology.getBonus();
        }

        return Placa + DodatkowaPlaca;
    }








}


