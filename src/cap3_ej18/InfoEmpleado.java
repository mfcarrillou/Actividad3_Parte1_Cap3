package cap3_ej18;

public class InfoEmpleado {
    int codigo; //Código del empleado
    String nombre; //Nombre
    double horas_trabajadas; //Número de horas trabajadas al mes
    double valor_hora; //Valor hora trabajada
    double p_retencionf; //Porcentaje de retención en la fuente
    
    InfoEmpleado(int cod, String nom, double h_trabajo, double h_valor, double retef){
        codigo = cod;
        nombre = nom;
        horas_trabajadas = h_trabajo;
        valor_hora = h_valor;
        p_retencionf = retef;
    }
    
    protected double calcularSalarioBruto(){
        return horas_trabajadas * valor_hora;
    }
    
    protected double calcularSalarioNeto(){
        return calcularSalarioBruto() * (1-(p_retencionf/100));
    }
    
}