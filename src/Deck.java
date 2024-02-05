import java.util.*;
public class Deck {
    private Random random = new Random();
    private int Cartas = 0;
    private ArrayList<String> Baraja = new ArrayList<String>();
    private ArrayList<String>  ValorTrebol = new ArrayList<String>();
    private ArrayList<String>  ValorPica = new ArrayList<String>();
    private ArrayList<String>  ValorDiamante = new ArrayList<String>();
    private ArrayList<String>  ValorCorazon = new ArrayList<String>();
    public void Shuffle(){
        System.out.println("Se mezcló el Deck.");
        Cartas = 52;

        for(int i = 0; i < Card.Valor.length; i++){
            ValorTrebol.add(Card.Valor[i]);
            ValorPica.add(Card.Valor[i]);
            ValorDiamante.add(Card.Valor[i]);
            ValorCorazon.add(Card.Valor[i]);
        }
    }

    public void head(){
        ArrayList<String> MostrarCarta = new ArrayList<String>();

        if(Cartas == 0  || Cartas < 10){
            Shuffle();
        }

        Baraja.add(Card.Palo[random.nextInt(4)]);

        if (Baraja.get(Baraja.size() - 1) == "Treboles" ||
        Baraja.get(Baraja.size() - 1) == "Picas"){
            Baraja.add(Card.Color[1]);
        }else{
            Baraja.add(Card.Color[0]);
        }

        if(Baraja.get(Baraja.size() - 2) == "Treboles"){
            String valor = ValorTrebol.get(random.nextInt(ValorTrebol.size()));
            Baraja.add(valor);
            ValorTrebol.remove(valor);

        }else if(Baraja.get(Baraja.size() - 2) == "Picas"){
            String valor = ValorPica.get(random.nextInt(ValorPica.size()));
            Baraja.add(valor);
            ValorPica.remove(valor);
        }else if(Baraja.get(Baraja.size() - 2) == "Corazones"){
            String valor = ValorCorazon.get(random.nextInt(ValorCorazon.size()));
            Baraja.add(valor);
            ValorCorazon.remove(valor);
        }else{
            String valor = ValorDiamante.get(random.nextInt(ValorDiamante.size()));
            Baraja.add(valor);
            ValorDiamante.remove(valor);
        }

        Cartas--;

        for (int i = 3; i > 0; i--){
            MostrarCarta.add(Baraja.get(Baraja.size() - i));
        }

        System.out.println(MostrarCarta);
        System.out.println("Quedan: " + String.valueOf(Cartas) + " Cartas\n" );
        if(Cartas <= 10){
            Shuffle();
        }

    }

    public void pick(){
        ArrayList<String> MostrarCarta = new ArrayList<String>();
        int sin = 0;

        if(Cartas == 0 || Cartas < 10){
            Shuffle();
        }

        if(Baraja.size() == 0){
            head();
        }else{
            Baraja.add(Card.Palo[random.nextInt(4)]);

            if (Baraja.get(Baraja.size() - 1) == "Treboles" ||
                    Baraja.get(Baraja.size() - 1) == "Picas"){
                Baraja.add(Card.Color[1]);
            }else{
                Baraja.add(Card.Color[0]);
            }

            if(Baraja.get(Baraja.size() - 2) == "Treboles" && !ValorTrebol.isEmpty()){
                String valor = ValorTrebol.get(random.nextInt(ValorTrebol.size()));
                Baraja.add(valor);
                ValorTrebol.remove(valor);

            }else if(Baraja.get(Baraja.size() - 2) == "Picas" && !ValorPica.isEmpty()){
                String valor = ValorPica.get(random.nextInt(ValorPica.size()));
                Baraja.add(valor);
                ValorPica.remove(valor);
            }else if(Baraja.get(Baraja.size() - 2) == "Corazones" && !ValorCorazon.isEmpty()){
                String valor = ValorCorazon.get(random.nextInt(ValorCorazon.size()));
                Baraja.add(valor);
                ValorCorazon.remove(valor);
            }else if(Baraja.get(Baraja.size() - 2) == "Diamantes" && !ValorDiamante.isEmpty()){
                String valor = ValorDiamante.get(random.nextInt(ValorDiamante.size()));
                Baraja.add(valor);
                ValorDiamante.remove(valor);
            }else{
                System.out.println("Sin mas cartas de " + Baraja.get(Baraja.size() - 2) + "\n");
                sin = 1;
            }

            Cartas--;

            for (int i = 3; i > 0; i--){
                MostrarCarta.add(Baraja.get(Baraja.size() - i));
            }

            if(sin != 1){
                System.out.println(MostrarCarta);
                System.out.println("Quedan: " + String.valueOf(Cartas) + " Cartas \n" );
            }else{
                Shuffle();
            }


        }

    }
    public void hand(){
        ArrayList<String> MostrarCartas = new ArrayList<String>();
        int sin = 0;

        if (Cartas < 10 || Cartas == 0){
            Shuffle();
        }

        if(Baraja.size() == 0){
            head();
        }else {
            for(int i = 0; i < 5; i++) {
                Cartas--;
                Baraja.add(Card.Palo[random.nextInt(4)]);

                if (Baraja.get(Baraja.size() - 1) == "Treboles" ||
                        Baraja.get(Baraja.size() - 1) == "Picas"){
                    Baraja.add(Card.Color[1]);
                }else{
                    Baraja.add(Card.Color[0]);
                }

                if(Baraja.get(Baraja.size() - 2) == "Treboles" && !ValorTrebol.isEmpty()){
                    String valor = ValorTrebol.get(random.nextInt(ValorTrebol.size()));
                    Baraja.add(valor);
                    ValorTrebol.remove(valor);

                }else if(Baraja.get(Baraja.size() - 2) == "Picas" && !ValorPica.isEmpty()){
                    String valor = ValorPica.get(random.nextInt(ValorPica.size()));
                    Baraja.add(valor);
                    ValorPica.remove(valor);
                }else if(Baraja.get(Baraja.size() - 2) == "Corazones" && !ValorCorazon.isEmpty()){
                    String valor = ValorCorazon.get(random.nextInt(ValorCorazon.size()));
                    Baraja.add(valor);
                    ValorCorazon.remove(valor);
                }else if(Baraja.get(Baraja.size() - 2) == "Diamantes" && !ValorDiamante.isEmpty()){
                    String valor = ValorDiamante.get(random.nextInt(ValorDiamante.size()));
                    Baraja.add(valor);
                    ValorDiamante.remove(valor);
                }else{
                    System.out.println("Sin mas cartas de " + Baraja.get(Baraja.size() - 2) + "\n");
                    sin = 1;
                    break;
                }
            }

            for (int i = 15; i > 0; i--){
                MostrarCartas.add(Baraja.get(Baraja.size() - i));
            }

            if (sin != 1){
                System.out.println(MostrarCartas);
                System.out.println("Quedan: " + String.valueOf(Cartas) + " Cartas\n" );
            }else{
                Shuffle();
            }
        }


    }

}
