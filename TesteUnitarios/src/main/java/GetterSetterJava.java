public class GetterSetterJava {

    private float saldo = 0f;
    private int id = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) throws Exception {
        if(saldo > 10000)
            throw new Exception("Saldo não pode ser maior que 10000");

        this.saldo = saldo;
    }


    //boilerplate, um código que é sempre feito mais não tem muita
    //utilidade vamos dizer assim.
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setNome("cat 2");
        System.out.println(animal.getNome());

    }
}