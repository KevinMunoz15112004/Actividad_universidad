public class DocenteContrato extends Docente{
    private String tipoContrato;

    //Constructor General
    public DocenteContrato(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String Direccion, int codigo, String tipoContrato) {
        super(cedula, nombre, fechaNacimiento, tipoSangre, Direccion, codigo);
        this.tipoContrato = tipoContrato;
    }

    //Getters
    private String getTipoContrato() {
        return tipoContrato;
    }

    //Metodo personalizado
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("Tipo Contrato");
        System.out.println("El tipo de contrato es: " + getTipoContrato());
    }
}
