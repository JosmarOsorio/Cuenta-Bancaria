// ejercicio 3 sumativa 2 .cpp : Programa que muestra una cuenta bancaria y permite consultar saldo, agregar saldo y retirar. Por: Josmar Osorio. Para: Programación II-UBA.

import java.util.Scanner;//Importamos la libreria java.util.Scanner para poder leer datos ingresador por pantalla.

public class CuentaBancaria { //Creamos la clase cuenta bancaria.
    private double saldo;//Creamos una variable que contenga el saldo de la cuenta.

    public CuentaBancaria() { //Creamos un metodo donde almacenamos el saldo de la cuenta bancaria.
        saldo = 1000;
    }

    public double consultarSaldo() { //Creamos un metodo que nos permita conusltar el saldo .
        return saldo;
    }

    public void agregarSaldo(double monto) { //Creamos un metodo para agregar saldo a la cuenta.
        saldo += monto; //Se suma el monto nuevo que se ha ingresado a el saldo que tenga disponible.
        System.out.println("Se agregó $" + monto + " a su cuenta"); //Se muestra un mensaje con el monto que se ha agregado.
    }

    public void retirarSaldo(double monto) { //Creamos un metodo para retirar saldo de la cuenta.
        if (saldo >= monto) { //Creamos un ciclo if que identifique si se puede retirar saldo o no.
            saldo -= monto;
            System.out.println("Se retiró $" + monto + " de su cuenta"); // Si lo que se quiere retirar es menor al saldo disponible se muestra cuanto se retiró.
        } else {
            System.out.println("No hay suficiente saldo en su cuenta");// Si lo que se quiere retirar excede el saldo disponible se muestra que no hay suficiente saldo.
        }
    }
}

class Menu { //Creamos una clase menú que contiene el menu que se le mostrará al usuario.
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true; //Creamos la variable continuar para controlar la ejecuacion del bucle do while.

        do {
            System.out.println("1. Consultar saldo"); //Creamos el menu que se mostará añ usuario.
            System.out.println("2. Agregar saldo");
            System.out.println("3. Retirar saldo");
            System.out.println("4. Salir");

            int opcion = sc.nextInt(); //Creamos la varibale opcion para identificar que opcion seleccionó el suaurio.

            switch (opcion) {
                case 1 :
                    System.out.println("Su saldo actual es $" + cuenta.consultarSaldo());//Creamos el caso 1 donde se muestre el saldod e la cuenta.
                    break;
                case 2 :
                    System.out.println("Ingresa la cantidad de dinero que deseas agregar:");//Creamos el caso 2 donde se pueda ingresar saldo a la cuenta.
                    double agregar = sc.nextDouble();
                    cuenta.agregarSaldo(agregar);//Llamamos al meotodo agregar saldo.
                  break;
                case 3 :
                    System.out.println("Ingresa la cantidad de dinero que deseas retirar:");//Creamos el caso 3 donde se pueda retirar saldo de la cuenta.
                    double retirar = sc.nextDouble();
                    cuenta.retirarSaldo(retirar);//Lamamos al metodo retirar saldo.
                break;
                case 4 :
                    System.out.println("Hata luego!");
                    continuar = false; //Creamos el caso 4 donde se pueda salir del menú y rompa el ciclo do while.
                break;
                default :
                    System.out.println("Opción inválida");//Si el numero ingresado es invalido se muestra un mensaje al usuario.
                    break;
            }
        } while (continuar);
        sc.close();
    }
}