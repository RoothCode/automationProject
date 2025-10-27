//array, list, set/map

import org.testng.annotations.Test;

import java.security.Key;
import java.util.*;

public class Colectii {

    @Test

    public void metodatTest() {
//        cursantiArray();
//        cursantiList();
//        listaMasini();
//        exemple();
//        tariOrase();
        caietRetete();

    }

    public void cursantiArray() {
        String[] cursanti = new String[6];
        cursanti[0] = "Madalina";
        cursanti[1] = "Mihaela";
        cursanti[2] = "Moni";
        cursanti[3] = "Mari";
        cursanti[4] = "Andreea";
        cursanti[5] = "Floris";
        for (int index = 0; index < cursanti.length; index++) {
            System.out.println("Numele cursantului este " + cursanti[index]);
        }
    }

    public void cursantiList() {
        List<String> cursanti = new ArrayList<>();
        cursanti.add("Raluca");
        cursanti.add("Oana");
        cursanti.add("Nelutu");

        for (int index = 0; index < cursanti.size(); index++) {
            System.out.println("Numele cursantului este " + cursanti.get(index));
        }
    }

    public void listaMasini() {
        List<String> masini= new ArrayList<>();
        masini.add("Mercedes");
        masini.add("Volvo");
        masini.add("Porche");
        masini.add("Audi");
        masini.add("BMW");

        for(int index=0; index< masini.size(); index++){
            System.out.println("Marca masinii este "+ masini.get(index));
        }
    }
    //maps - cheie=valoare
    //parcurgerea se face pe baza cheilor folosind un set

    public void exemple () {
        Map<String,String> elemente= new HashMap<>();
        elemente.put("Masina","Dacia");
        elemente.put("Persoana","Alex");
        elemente.put("Telefon", "Iphone");

        for (String Key:elemente.keySet()) {
            System.out.println("Cheia este "+ Key);
            System.out.println("Valoarea este "+elemente.get(Key));
        }
    }
    public void tariOrase() {
        Map<String,List<String>> obiecte= new HashMap<>();
        List<String> oraseRomania= Arrays.asList("Cluj","Timisoara","Buc");
        List<String> oraseItalia= Arrays.asList("Roma","Venetia","Verona");

        obiecte.put("Romania", oraseRomania);
        obiecte.put("Italia", oraseItalia);

        for(String Key: obiecte.keySet()){
            System.out.println("Tara este "+Key);
            System.out.println("Orasele sunt "+obiecte.get(Key));
        }

    }

    public void caietRetete(){
        Map<String, List<String>> ingrediente = new HashMap<>();
        List<String> ingredienteSupapui= Arrays.asList("pui","apa","legume");
        List<String> ingredientepaste= Arrays.asList("paste","usturoi","rosii");

        ingrediente.put("Supa pui", ingredienteSupapui);
        ingrediente.put("Paste ", ingredientepaste);

        for (String Key: ingrediente.keySet()) {
            System.out.println("Reteta este "+ Key);
            System.out.println("Ingredientele sunt "+ ingrediente.get(Key));
        }
    }
}