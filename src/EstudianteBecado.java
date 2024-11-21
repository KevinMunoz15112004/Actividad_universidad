public class EstudianteBecado extends Estudiante{
    String tipoBeca;

    //Constructor general
    public EstudianteBecado(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String Direccion, int codigo, String tipoBeca) {
        super(cedula, nombre, fechaNacimiento, tipoSangre, Direccion, codigo);
        this.tipoBeca = tipoBeca;
    }

    //Getters
    private String getTipoBeca() {
        return tipoBeca;
    }

    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("Estudiante Becado");
        System.out.println("Tipo de Beca: "+ getTipoBeca());
    }
}
