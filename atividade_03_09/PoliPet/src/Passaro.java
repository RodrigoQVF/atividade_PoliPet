public class Passaro extends Animal{

    private boolean raro;
    private String nome;
    private Double peso;
    private Double diaria;
    private boolean isDomesticado = false;

    public Passaro(String nome, Double peso, boolean raro){
        super(nome, peso);
        this.raro = raro;
        this.nome = nome;
        this.peso = peso;
    }

        @Override
    public void emitirSom(){
        System.out.println("piu");
    }

    @Override
    public Double calcularDiariaCuidado(){
        if(raro){
            diaria = 30.0 + (0.1 * peso) + 5;
        }else{
            diaria = 30.0 + (0.1 * peso);
        }

        return diaria;
    }
    @Override
    public String listarAnimal(){
       return "Nome: " + this.nome + "\n" + "Som: piu" + "\n" + "Diaria: " + calcularDiariaCuidado();
    }
    @Override
    public boolean getDomesticado() {
        return false;
    }
}
