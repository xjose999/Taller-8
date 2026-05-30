class Gerente extends Empleado {
    String departamento;

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);
    }
}