public class Cachorro extends Animal implements Domesticavel{

    private String nome;
    private Double peso;
    private boolean adestrado;
    private Double diaria;
    private boolean isDomesticado;

    public Cachorro(String nome, Double peso,boolean adestrado, boolean isDomesticado){
        super(nome, peso);
        this.nome = nome;
        this.peso = peso;
        this.adestrado = adestrado;
        this.isDomesticado = isDomesticado;

    }
    public boolean getDomesticado(){
        return this.isDomesticado;
    }

    @Override
    public void emitirSom(){
        System.out.println("Au Au");
    }

    @Override
    public Double calcularDiariaCuidado(){
        if(adestrado){
            diaria = 50.0 + 10.0 + (0.5 * peso);
        } else{
            diaria = 50.0 + (0.5 * peso);
        }

        return diaria;
    }

    @Override
    public boolean precisaPasseio() {
        return true;

    }

    @Override
    public String interagir() {
        return "Passeando com o cachorro";
    }
    
    
    @Override
    public String listarAnimal(){
        return "Nome: " + this.nome + "\n" + "Som: Au au" + "\n" + "Diaria: " + calcularDiariaCuidado();
    }
    
}
