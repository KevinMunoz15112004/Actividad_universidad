public class EstudianteDeportista extends Estudiante{
    private String deporte;

    //Constructor general
    public EstudianteDeportista(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String Direccion, int codigo, String deporte) {
        super(cedula, nombre, fechaNacimiento, tipoSangre, Direccion, codigo);
        this.deporte = deporte;
    }

    //Getters
    private String getDeporte() {
        return deporte;
    }

    //Metodo personalizado
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("Estudiante Deportista");
        System.out.println("Tipo Deporte: " + getDeporte());
    }
}
