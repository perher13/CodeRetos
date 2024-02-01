package POOPractica;

public class ejecutable {
    public static void main(String[] args){
        Cuenta cuenta_1 = new Cuenta("Yo", 0);
        Cuenta cuenta_2 = new Cuenta("Tu", 300);

        cuenta_1.ingresar(300);
        cuenta_2.ingresar(400);

        cuenta_1.retirar(500);
        cuenta_2.retirar(100);

        System.out.println(cuenta_1);
        System.out.println(cuenta_2);
    }
}
