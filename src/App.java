public class App {

    public static void main(String[] args) throws Exception {
        int opcion;
        int dinero;
        boolean cuentaCreada;
        Cajero cajero = new Cajero();
        
        do {
                opcion = cajero.funciones();
                cuentaCreada = cajero.getCuentaCreada();
                switch (opcion) {
                    case 1:
                        if ( cuentaCreada == false) {
                            cajero.crearCuenta();
                        } else {
                            System.out.println("\nYa tienes una cuenta creada\n");
                        }
                            break;
                         // Crear cuenta vacía
                        
                    case 2: // Crear cuenta saldo inicial
                        if ( cuentaCreada == false) {
                            System.out.print("\nIntroduce el saldo inicial: $");
                            dinero = Integer.parseInt(System.console().readLine());
                            cajero.crearCuenta(dinero);
                        } else {
                            System.out.print("\nYa tienes una cuenta creada");
                        }
                        break;

                    case 3: // Ingresar dinero
                        if ( cuentaCreada == true) {
                            System.out.print("\nIntroduce la cantidad a ingresar: $");
                            dinero = Integer.parseInt(System.console().readLine());
                            cajero.ingresar(dinero);
                        } else {
                            System.out.print("\nNo tienes una cuenta creada\n");
                        }
                        break;

                    case 4: // Retirar dinero
                        if ( cuentaCreada == true) {
                            System.out.print("\nIntroduce la cantidad a retirar: $");
                            dinero = Integer.parseInt(System.console().readLine());
                            cajero.retirar(dinero);                      
                        } else {
                            System.out.print("\nNo tienes una cuenta creada\n");
                        }
                        break;

                    case 5: // Ver saldo 
                        if ( cuentaCreada == true) {
                            System.out.print("\nTu saldo es de: $" + cajero.getSaldo() + "\n");
                        } else {
                            System.out.print("\nNo tienes una cuenta creada\n");
                        }
                        break;

                    case 6: // Transferir 
                        if ( cuentaCreada == true) {
                        	Cuenta_tercero cuentaTransferir = new Cuenta_tercero();
                            System.out.print("Igrese lacuenta a la que quiere transferir: ");
                            cuentaTransferir.asignarNumCuenta(int numCuenta);
                            System.out.print("Igrese el monto de la transferencia: ");
                            cuentaTransferir.transferir(int dinero);
                        } else {
                            System.out.print("\nNo tienes una cuenta creada\n");
                        }
                        break;
                    case 7: // Salir 
                        System.out.println("\nGracias por su preferencia");
                        break;
                }
        } while (opcion != 6);


    }
}
