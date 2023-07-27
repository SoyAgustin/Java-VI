package mx.com.bytebank.test;
import mx.com.bytebank.modelo.Contador;
import mx.com.bytebank.modelo.ContolBonificacion;
import mx.com.bytebank.modelo.Funcionario;
import mx.com.bytebank.modelo.Gerente;

public class TestControlBonificacion {
    public static void main(String[] args) {
      Funcionario diego = new Contador();
      diego.setSalario(2000);
      
      Gerente jimena = new Gerente();
      jimena.setSalario(10000);
      
      Contador alexiz = new Contador();
      alexiz.setSalario(5000);

      ContolBonificacion controlBonificacion = new ContolBonificacion();

      controlBonificacion.registrarSalario(diego);
      controlBonificacion.registrarSalario(jimena);
      controlBonificacion.registrarSalario(alexiz);
    }
}
