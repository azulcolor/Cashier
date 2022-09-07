public class Cuenta {
    float dinero;
    boolean cuentaCreada = false;
    boolean inversion = false;
    int opcion;

    public Cuenta() {
    }

    public void crearCuenta() {
        this.cuentaCreada = true;
        System.out.println("\nCuenta creada con éxito\n");
    }

    public void crearCuenta(float dinero) {
        if (dinero > 0) {
            this.dinero = dinero;
            this.cuentaCreada = true;
            System.out.println("\nCuenta creada con saldo de " + dinero +  " fue creada con éxito\n");
        } else {
            System.out.println("No se puede crear una cuenta con saldo negativo");
        }
    }

    public void ingresar(float dinero) {
        if (dinero > 0) {
            this.dinero += dinero;
            System.out.print("\nHas ingresado $" + dinero + " en tu cuenta\n");
        } else {
            System.out.println("No se puede ingresar una cantidad negativa");
        }
    }

    public void retirar(int dinero) {
        if (dinero > this.dinero) {
            System.out.print("\nNo tienes suficiente dinero en tu cuenta\n");
        } else if(dinero < 0) {
            System.out.println("No se puede retirar una cantidad negativa");
        } else {
            this.dinero -= dinero;
            System.out.print("\nHas retirado $" + dinero + " de tu cuenta\n");
        }
    }

    public float getSaldo() {
        return dinero;
    }

    public boolean getCuentaCreada() {
        return cuentaCreada;
    }

    public int funciones() {

        if (opcion == 0) {
            System.out.println("\nBienvenido al cajero");
        }

        System.out.println("\n1.- Crear cuenta vacía");
        System.out.println("2.- Crear cuenta saldo inicial");
        System.out.println("3.- Ingresar dinero");
        System.out.println("4.- Retirar dinero");
        System.out.println("5.- Ver saldo");
        System.out.println("6.- Invertir");
        System.out.println("7.- Salir");
        System.out.print("Elige una opción: ");

        opcion = Integer.parseInt(System.console().readLine());

        return opcion;
    }
}
