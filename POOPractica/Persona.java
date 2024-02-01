package POOPractica;

public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        generaDNI();
    }

    public void calcularIMC(){

    }

    public void generaDNI(){

    }

    public void comprobarSexo(char sexo){

    }

    public void esMayorDeEdad(){

    }

    public String toString(){
        return "a";
    }

    //Setters y Getters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

}
