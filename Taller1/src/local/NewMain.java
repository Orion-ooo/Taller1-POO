
package local;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class NewMain {

    public static void main(String[] args) {
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNum = new Scanner(System.in);
        
        // libro
        Ejercicio1_Libro libro = new Ejercicio1_Libro();
        
        System.out.println("crear Libro:");
        System.out.println("ingrese el titulo del libro:");
        libro.setTitulo(entradaTexto.nextLine());
        System.out.println("ingrese el nombre del autor del libro " + libro.getTitulo());
        libro.setAutor(entradaTexto.nextLine());
        System.out.println("ingrese el numero de paginas del libro:" + libro.getTitulo());
        libro.setNumPaginas(entradaNum.nextInt());
        
        System.out.println("titulo del libro: " + libro.getTitulo());
        System.out.println("autor del libro: " + libro.getAutor());
        System.out.println("paginas de libro: " + libro.getNumPaginas());
        
        //Cuenta bancaria
        
        System.out.println("crear una cuenta bancaria:");
        System.out.println("ingresara dinero en el momento de la creacion?");
        System.out.println("ingrese si o no");
        String opcion = entradaTexto.nextLine();
        
        if (opcion.equalsIgnoreCase("si")) {
            Ejercicio2_CuentaBancaria cuentaBancaria = new Ejercicio2_CuentaBancaria(0, 0, "");
            
            System.out.println("ingrese el codigo de la cuenta:");
            cuentaBancaria.setNumCuenta(entradaNum.nextInt());
            System.out.println("ingrese la suma de dinero que ingresara:");
            cuentaBancaria.setSaldo(entradaNum.nextDouble());
            System.out.println("ingrese el tipo de cuenta:");
            cuentaBancaria.setTipoCuenta(entradaTexto.nextLine());
            
            System.out.println("tipo de cuenta: " + cuentaBancaria.getTipoCuenta());
            System.out.println("codigo de la cuenta: " + cuentaBancaria.getNumCuenta());
            System.out.println("saldo de la cuenta: " + cuentaBancaria.getSaldo());
            
        }else if (opcion.equalsIgnoreCase("no")){
            Ejercicio2_CuentaBancaria cuentaBancaria = new Ejercicio2_CuentaBancaria(0, "");
            
            System.out.println("ingrese el codigo de la cuenta:");
            cuentaBancaria.setNumCuenta(entradaNum.nextInt());
            System.out.println("ingrese el tipo de cuenta:");
            cuentaBancaria.setTipoCuenta(entradaTexto.nextLine());
            
            System.out.println("tipo de cuenta: " + cuentaBancaria.getTipoCuenta());
            System.out.println("codigo de la cuenta: " + cuentaBancaria.getNumCuenta());
        } else {
            System.out.println("opcion incorrecta");
        }
        
        // estudiante
        Ejercicio3_Estudiante estudiante = new Ejercicio3_Estudiante();
        
        System.out.println("estudiante actual:");
        System.out.println(estudiante.toString());
        
        System.out.println("registrar un estudiante nuevo:");
        System.out.println("ingrese el nombre del estudiante:");
        estudiante.setNombre(entradaTexto.nextLine());
        System.out.println("ingrese la edad del curso:");
        estudiante.setEdad(entradaNum.nextInt());
        System.out.println("ingrese el curso del estudiante:");
        estudiante.setCurso(entradaTexto.nextLine());
        
        System.out.println("nombre del estudiante: " + estudiante.getNombre());
        System.out.println("edad del estudiante: " + estudiante.getEdad());
        System.out.println("curso del estudiante: " + estudiante.getCurso());
        
    }
    
}
