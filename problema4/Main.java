class Entidad_Financiera{
    private double valorCheque;
    private double valorComm;
    private double valorcheque;
    private Cliente cliente;
    private BancoF bancoF;

    public Entidad_Financiera() {
    }

    public Entidad_Financiera(double valorCheque,Cliente cliente,BancoF bancoF) {
        this.valorCheque = valorCheque;
        this.cliente=cliente;
        this.bancoF=bancoF;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public void calcularCommBanco(){
        this.valorComm=(this.getValorCheque()*0.003);
        this.valorComm=valorComm;
    }
    public double getValorCheque() {
        return valorCheque;
    }

    @Override
    public String toString() {
        return "EntidadFinanciera{" +
                "\nvalorCheque= " + valorCheque+"\n" +
                "valorComision=" + valorComm+"\n" +
                "clientes=" + cliente +"\n"+
                "bancoss=" + bancoF +"\n"+
                '}';
    }
}
class Cliente{
    private String nombre;
    private String apellido;
    private int cedula;

    public Cliente() {
    }

    public Cliente(String nombres, String apellidos, int cedula) {
        this.nombre = nombres;
        this.apellido = apellidos;
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellido = apellido;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nombres='" + nombre + '\'' +
                ", apellidos='" + apellido + '\'' +
                ", cedula=" + cedula +
                '}';
    }
}
class BancoF{
    private String nombreBanco;


    public BancoF() {
    }

    public BancoF(String nombreBanco) {
        this.nombreBanco = nombreBanco;

    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }



    public String getNombreBanco() {
        return nombreBanco;
    }



    @Override
    public String toString() {
        return "Bancoss{" +
                "nombreBanco='" + nombreBanco + '\'' +
                '}';
    }
}





public class Main {
    public static void main(String[] args) {
        Cliente cliente=new Cliente("RICHARD VICENTE","FEIJOO CHICAIZA",1102431853);
        BancoF bancoF=new BancoF("BANCO DE LOJA");
        Entidad_Financiera entidad_financiera=new Entidad_Financiera(50000,cliente,bancoF);
        entidad_financiera.calcularCommBanco();
        System.out.println(entidad_financiera);

    }
}