public class Tarjeta {
    private float saldo;
    public float dinero;
    
    public Tarjeta(){
        saldo=0;
    }
    
    public float depositar(float dinero){
        System.out.println("\nDinero a depositar: " + dinero);
        if(dinero<0){
            System.out.print("No se permite ingresar valores negativos");
            return 0;
        }
        else {
        saldo = saldo + dinero;
        System.out.print("\nSaldo restante:");
        System.out.print(saldo);
        return saldo;
        }
    }
    
    public float retirar(float dinero){
        if(saldo>=dinero){
            saldo = saldo - dinero;
            System.out.print("\nSaldo restante: ");
            System.out.print(saldo);
            return saldo;
        }
        else
            return 0;
    }
    
    public void consultar(){
        System.out.print("\nSaldo restante: ");
        System.out.print(saldo);
    }
}