import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercices {
    public List exercice1(List<String> liste){
        List<String> listeString = liste.stream()
                .map((n)->n.toUpperCase())
                .collect(Collectors.toList());
        return listeString;
    }

    public List exercice2(List<String> liste){
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une nouvelle liste
        dont les string "INUTILE" ont été retirées
         */
        List<String> listeString = liste.stream()
                .filter((n)->!n.equals("INUTILE"))
                .collect(Collectors.toList());
        return listeString;
    }

    public String exercice3(List<String> liste){
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une string composée
        de toutes les string de la liste concaténées
         */
        String resultat = liste.stream()
                .reduce((acc, nouveau)->acc+nouveau)
                .get();
        return resultat;
    }


    public String exercice4(List<String> liste){
        /*
        Utilisez les streams pour transformer la liste en paramètre de la façon suivante:
        1. Mettre tous les éléments de la liste en majuscule
        2. Retirer tous les éléments "AAA"
        3. Concaténer tous les éléments de la liste pour former une string
         */
        String resultat = liste.stream()
                .map((n)->n.toUpperCase())
                .filter((n)->!n.equals("AAA"))
                .reduce((acc, nouveau)->acc+nouveau)
                .get();
        return resultat;
    }

    public List exercice5(List<Integer> liste){
        /*
        Utilisez les streams sur la liste en paramètre afin de retourner une nouvelle liste
        dont les éléments ont été doublés
         */
        List<Integer> listeInteger = liste.stream()
                .map((n)->n*2)
                .collect(Collectors.toList());
        return listeInteger;
    }

    public Integer exercice6(List<Integer> liste){
        /*
        Utilisez les streams sur la liste en paramètre afin de retourner le produit des éléments de la liste.
         */
        Integer resultat = liste.stream()
                .reduce((acc, nouveau)->acc*nouveau)
                .get();
        return resultat;
    }

    public List exercice7(List<Integer> liste){
        /*
        Utilisez les streams pour trouver tous les éléments dont le carré est supérieur à 50. Retournez une liste.
         */
        List<Integer> listeInt = liste.stream()
                .filter((n)->50<Math.pow(n,2))
                .collect(Collectors.toList());
        return listeInt;
    }

    public List exercice8(List<Integer> liste){
        /*
        Utilisez les streams pour trouver le premier chiffre des nombres de la liste passée en paramètre lorsqu'on
         les multiplie par 9.
         */
        List<Character> listeChar = liste.stream()
                .map((n)->n*9)
                .map((n)->n.toString())
                .map((n)->n.charAt(0))
                .collect(Collectors.toList());
        return listeChar;
    }

    public List exercice9(){
        /*
        Créez un stream infini d'entiers et utilisez le pour trouver les 10 premiers nombres divisibles par 3 et par 7.
         */
        List<Integer> liste = IntStream.iterate(1, (n)->n+1)
                .filter((n)->n%3==0)
                .filter((n)->n%7==0)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());
        return liste;
    }

    public List exercice10(){
        /*
        Générez la liste des 20 premiers carrés parfaits grâce à un stream infini.
         */
        List<Integer> liste = IntStream.iterate(1, (n)->n+1)
                .map((n)->n*n)
                .limit(20)
                .boxed()
                .collect(Collectors.toList());
        return liste;
    }
}
