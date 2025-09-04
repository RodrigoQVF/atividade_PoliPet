

public abstract class Animal {

    private String nome;
    private Double peso;

    public Animal(String nome, Double peso){
        this.nome = nome;
        this.peso = peso;
    }



    public abstract void emitirSom();
    public abstract Double calcularDiariaCuidado();
    public abstract String listarAnimal();
    public abstract boolean getDomesticado();

}
