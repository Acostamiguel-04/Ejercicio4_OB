public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio parte 1 ");

        Cliente cliente = new Cliente();
        cliente.edad = 19;
        System.out.println("La edad de la persona es: " + cliente.edad);
        cliente.nombre="Miguel";
        System.out.println("El nombre de la persona es: " + cliente.nombre);
        cliente.telefono=1156514708;
        System.out.println("El numero de telefono es: "+ cliente.telefono);
        cliente.credito= 150000;
        System.out.println("El credito de la persona es de: " + cliente.credito + "$");

        System.out.println("Ejercicio parte 2 ");

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 20;
        System.out.println("La edad del trabajador es: " + trabajador.edad);
        trabajador.nombre="Thomas";
        System.out.println("El nombre del trabajador es: " + trabajador.nombre);
        trabajador.telefono=1156514562;
        System.out.println("El numero de telefono es: "+ trabajador.telefono);
        trabajador.salario=120000;
        System.out.println("El salario del trabajador es: "+ trabajador.salario +"$");



    }
}

    class Persona {
        int edad;
        String nombre;
        int telefono;
    }

    class Cliente extends Persona{
        int credito;

    }
    class Trabajador extends Persona  {
        int salario;

    }


