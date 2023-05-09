class Automotores{
private int cedulaDuenio;
private String marcaVehiculo;
private int anioFabri;
private double valorvehiculo;
private double valorMatricula;
public Automotores(){
        }
public Automotores(int cedulaAnio,String marcaVehiculo,int anioFabri,
        double valorvehiculo){
        this.cedulaDuenio=cedulaDuenio;
        this.marcaVehiculo=marcaVehiculo;
        this.anioFabri=anioFabri;
        this.valorvehiculo=valorvehiculo;
        }
//SETS

public void setCedulaDuenio(int cedulaDuenio) {
        this.cedulaDuenio = cedulaDuenio;
        }

public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
        }

public void setAnioFabri(int anioFabri) {
        this.anioFabri = anioFabri;
        }

public void setValorvehiculo(double valorvehiculo) {
        this.valorvehiculo = valorvehiculo;
        }
//GETS

public int getCedulaDuenio() {
        return cedulaDuenio;
        }

public String getMarcaVehiculo() {
        return marcaVehiculo;
        }

public int getAnioFabri() {
        return anioFabri;
        }

public double getValorvehiculo() {
        return valorvehiculo;
        }

public double getValorMatricula() {
        return valorMatricula;
        }
//calcular valor matricula
public void calcularValorMatricula(){
        this.valorMatricula=((this.getValorvehiculo()*0.002)*(2023-this.getAnioFabri()));
        this.valorMatricula=valorMatricula;
        }
        class Fabricante{
    private String  nombreFabri;
    private
        }

@Override
public String toString() {
        return "Automotores{" +
        "cedulaDuenio=" + cedulaDuenio +
        ", marcaVehiculo='" + marcaVehiculo + '\'' +
        ", anioFabri=" + anioFabri +
        ", valorvehiculo=" + valorvehiculo +
        ", valorMatricula=" + valorMatricula +
        '}';
        }
        }




public class Main {
    public static void main(String[] args) {
        Automotores automotores=new Automotores();
        Automotores automotores1=new Automotores(1102481853,"TOYOTA",2010,7000);
        automotores1.calcularValorMatricula();
        System.out.println(automotores1);
    }
}