public class Gato extends Animal implements Domesticavel{

    private Double diaria;
    private String nome;
    private Double peso;
    private boolean isDomesticado;


    public Gato(String nome, Double peso, boolean isDomesticado){
        super(nome, peso);
        this.nome = nome;       
        this.peso = peso;
        this.isDomesticado = isDomesticado;
    }
        @Override
    public void emitirSom(){
        System.out.println("Miau");
    }

    public boolean getDomesticado(){
        return this.isDomesticado;
    }

    @Override
    public Double calcularDiariaCuidado(){
        diaria = 40.0 + (0.3 * peso);

        return diaria;
    }
    @Override
    public boolean precisaPasseio() {
        return true;
    }

    @Override
    public String interagir() {
        return "jogando bola de lã para o gato";
    }

    @Override
    public String listarAnimal(){
        return "Nome: " + this.nome + "\n" + "Som: Miau " + "\n" + "Diaria: " + calcularDiariaCuidado();
    }
}
