package mx.com.bytebank.test;
import mx.com.bytebank.modelo.Funcionario;
import mx.com.bytebank.modelo.Gerente;

public class TestReferencias {
    public static void main(String[] args) {
        //Funcionario funcionario = new Funcionario();
        Funcionario funcionario = new Gerente();
        //El código anterior compila porque el elemento mas generico puede ser adaptado al mas especifico, pero no al revés
        funcionario.setNombre("Diego");

        Gerente gerente = new Gerente();
        gerente.setNombre("Jimena");

        funcionario.setSalario(2000);
        gerente.setSalario(1000);

        //funcionario.iniciarSesion();
        //No compila porque el compilador no sabe que funcionario es un gerente, y no sabe que tiene el método iniciarSesion.

        
    }
}
