package ro.mycode;

public class Main {
    public static void main(String[] args) {
        System.out.println(metodaStatica());
    }

    //Aceata este o varibila declarata statica
    static int variabilaStatica =10;

    //Aceasta este o variabila declarata nonstatica
    int variabilaNestatica=10;

    //Doar variabilele statice pot fi apelate in metodele statice "metodaStatica"
    //Metodele si variabile statice pot fi folosit doar in clasa din care fac parte
    public static int metodaStatica(){
        return variabilaStatica;
    }
}