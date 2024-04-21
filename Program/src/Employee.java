public class Employee {
    protected String Imie;
    protected String Naziwsko;
    protected String adres;
    protected String email;
    protected String pesel;
    protected int rokzatrudnienia;

    public Employee(String Imie, String Nazwisko, String adres, String email, String pesel, int rokzatrudnienia) {
        this.Imie = Imie;
        this.Naziwsko = Nazwisko;
        this.adres = adres;
        this.email = email;
        this.pesel = pesel;
        this.rokzatrudnienia = rokzatrudnienia;
    }

    public String getFirstName() {
        return Imie;
    }

    public String getLastName() {
        return Naziwsko;
    }

    public String getAddress() {
        return adres;
    }

    public String getEmail() {
        return email;
    }

    public String getPesel() {
        return pesel;
    }

    public int getEmploymentYear() {
        return rokzatrudnienia;
    }

    public int LiczeniePensji() {
        int Placa = 3000;
        int CzasPracy = Math.max(0, 2024 - rokzatrudnienia);
        int DodatkowaPlaca = CzasPracy * 1000;
        return Placa + DodatkowaPlaca;
    }
}
