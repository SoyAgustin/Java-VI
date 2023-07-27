package mx.com.bytebank.modelo;
//Vamos a sumar todas las bonificaciones que se reciban como parametro
public class ContolBonificacion {
    private double suma;

    public double registrarSalario(Funcionario funcionario){
        this.suma = funcionario.getBonificacion()+this.suma;
        System.out.println("calculo actual: "+this.suma);
        return this.suma;
    }
}
