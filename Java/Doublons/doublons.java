import java.util.Arrays;

class projet {

    public static void main(final String[] args) {

        // Déclaration
        final String[] Liste = { "Banane", "Pomme", "Abricot", "Cerise", "Abricot", "Orange", };
        final String[] newListe = new String[Liste.length];


        Arrays.sort(Liste);


        // Supprime les doublons
        for(int i = 0; i < Liste.length; i++){

            for(int j = 0; j < newListe.length; j++){
                if (Liste[i] != newListe[j]){
                    newListe[i] = Liste[i];
                } else {
                    break;
                }
            }
        }

        // Affichage résultat
        System.out.println("Liste : " + Arrays.toString(newListe));
    }
}

