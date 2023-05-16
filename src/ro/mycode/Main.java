package ro.mycode;

public class Main {
    public static void main(String[] args) {
        System.out.println("Interiorul metodei statice " + metodaStatica());
        System.out.println("Interiorul blocului static " + numar);
        System.out.println("Interiorul clasei statice " + Static.clasaStatica());
    }

    // Variabila si metoda statica:
    // Atunci cand o variabila sau o metoda este declarata ca statica, aceasta apartine clasei in sine, nu unei instante specifice a clasei.
    // Variabilele statice sunt impartasite de toate instantele clasei si pot fi accesate fara a crea o instanță noua.
    // Metodele statice pot fi apelate direct prin numele clasei, fara a crea o instanta.
    static int variabilaStatica = 10;

    public static int metodaStatica() {
        return variabilaStatica;
    }

    // Bloc static:
    // Un bloc static este un bloc de cod intr-o clasa care este executat o singura data atunci cand clasa este incarcata in memorie.
    // Aceasta poate fi utilizata pentru a initializa variabile statice sau pentru a realiza alte operatii care trebuie efectuate o singura data.

    static int numar;

    static {
        numar = 20;
    }

    // Clasa statica inglobata:
    // In Java, o clasă poate fi definita in interiorul altei clase, iar daca este marcată ca statică, devine o clasa statică inglobata.
    // O clasă statica inglobata poate fi accesata fara a crea o instanta a clasei exterioare si are restrictii asupra accesului la membrii clasei exterioare.

    static class Static {
        public static int clasaStatica() {
            int numar = 30;
            return numar;
        }
    }

}