
import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Animal> animais = new ArrayList<>(); 
        ArrayList<Animal> domesticados = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Cachorro c1 = new Cachorro("cachorro1", 5.0, false, true);
        Gato g1 = new Gato("gato1", 3.0, true);
        Passaro p1 = new Passaro("passaro1", 1.0, false);
        Cachorro c2 = new Cachorro("cachorro2", 9.0, false, false);
        Gato g2 = new Gato("gato2", 6.0, false);

        animais.add(c1);
        animais.add(g1);
        animais.add(p1);
        animais.add(c2);
        animais.add(g2);

        while (true) { 
            System.out.println("1 - Listar");
            System.out.println("2 - Somar");
            System.out.println("3 - Filtrar");
            System.out.println("0 - Sair");
            int op = scan.nextInt();
            if(op == 0){
                break;
            }
            if(op == 1){
                for(int i = 0; i < animais.size(); i++){
                    System.out.println(animais.get(i).listarAnimal());
                    System.out.println();
                }
            }
            if(op == 2){
                Double sum = 0.0;
                for(int i= 0; i < animais.size(); i++){
                    sum += animais.get(i).calcularDiariaCuidado();
                }
                System.out.println("A soma das diárias é : " + sum);

            }
            if(op == 3){
                for(int i=0; i < animais.size(); i++){
                    if(animais.get(i).getDomesticado()){
                        domesticados.add(animais.get(i));
                        
                    }
                }
                for(int i = 0; i < domesticados.size(); i++){
                    System.out.println(domesticados.get(i).listarAnimal());
                    System.out.println();
                }
            }
        }
    }
}
