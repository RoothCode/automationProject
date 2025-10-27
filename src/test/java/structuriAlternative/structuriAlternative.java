package structuriAlternative;

import org.testng.annotations.Test;

public class structuriAlternative {

    //In programare exista 2 tipuri de structuri : Alternative si Repetitive
    //Structuri alternative : If ... Then ... Else/Switch ... Case

    @Test

    public void metodaTest() {

//        verificaPersoanaMajora(69);
//        verificaPersoanaMajora(14);
        verificareNumarPar(25);
        verificareNumarPar(20);



    }

    public void verificaPersoanaMajora(int varsta) {
    if(varsta>=18){
        System.out.println("Persoana cu varsta de "+varsta+ " este majora.");
    }
    else{
        System.out.println("Persoana cu varsta de "+varsta+" este minora.");
    }

    }
    public void verificareNumarPar(int numar) {
        if (numar%2==0) {
            System.out.println(numar + " este numar par");

        }
        else {
            System.out.println(numar + " este numar impar");
        }
    }

//Verificăm dacă un număr este pozitiv și divizibil cu 5.

}
