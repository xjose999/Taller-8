public class Prueba {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        emp.nombre = "Luis";
        emp.salario = 1500.0;

        Gerente ger = new Gerente();
        ger.nombre = "Ana";
        ger.salario = 3000.0;
        ger.departamento = "Ventas";

        emp.mostrarDetalles();
        ger.mostrarDetalles();
    }
}