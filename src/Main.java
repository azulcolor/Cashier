
public class Main {

	public static void main(String[] args) throws Exception {
        int opcion;
        int dinero;
        boolean cuentaCreada;
        boolean inversion = false;
        Cajero cajero = new Cajero();
        
        do {
                opcion = cajero.funciones();
                cuentaCreada = cajero.getCuentaCreada();
                inversion = cajero.inversion;

                if (inversion == true) {
                    cajero.ingresar(cajero.getGanancias());
                    System.out.println("\nHas recibido " + cajero.getGanancias() + " de tus inversiones");
                    System.out.println("Tu cuenta subió a $" + cajero.getSaldo());
                }
                
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
                            cajero.inversion();
                        	System.out.print("\nTus ganancias por inversión es de: $" + cajero.getGanancias() + "\n");
                        } else {
                            System.out.print("\nNo tienes una cuenta creada\n");
                        }
                        break;
                    case 7: // Salir 
                        System.out.println("\nGracias por su preferencia");
                        break;
                }
        } while (opcion != 7);


    }
}


