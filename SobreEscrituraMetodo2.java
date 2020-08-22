//*
 
package sobreescriturametodo2;
/**
 * @author José Yacelga
 *         Carlos Arias
 */
import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;

class Vehiculo{
    private String marca;
    private String tecnologia;
    private int modelo;
    
    public Vehiculo(){
        marca="";
        tecnologia="";
        modelo=0;
    }

    public Vehiculo(String marca, String tecnologia, int modelo) {
        this.marca = marca;
        this.tecnologia = tecnologia;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public int getModelo() {
        return modelo;
    }
}

class Automovil extends Vehiculo{
    private String matriculaAutomovil;
    
    public Automovil(){
        super();
        matriculaAutomovil="Desconocido";
    }

    public Automovil(String marca, String tecnologia, int modelo) {
        super(marca, tecnologia, modelo);
        matriculaAutomovil="Desconocido";
    }

    public String getMatriculaAutomovil() {
        return matriculaAutomovil;
    }

    public void setMatriculaAutomovil(String matriculaAutomovil) {
        this.matriculaAutomovil = matriculaAutomovil;
    }
    
    public void mostrarDatos(){
        System.out.println("Datos del Automovil:\nMARCA DEL AUTOMOVIL: "+
                getMarca()+" "+getTecnologia()+"--MATRICULA DEL AUTOMOVIL: "+
                getMatriculaAutomovil());
    }
    
    public void mostrarPropietarios(){
        System.out.println("Propiestario:\nNombres del Propietario: Carlos Anibal\n"
        + "ID: 1714272166\n"+"Profesión: Estudiante");
    }
}

class AutomovilAutonomo extends Automovil{
    private Calendar fechaComienzoFabricacionAutonomia;

    public AutomovilAutonomo(Calendar fechaComienzoFabricacionAutonomia) {
        super();
        fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia;
    }

    public AutomovilAutonomo( String marca, String tecnologia, int modelo,
            Calendar fechaComienzoFabricacionAutonomia) {
        super(marca, tecnologia, modelo);
        this.fechaComienzoFabricacionAutonomia = fechaComienzoFabricacionAutonomia;
    }

    public Calendar getFechaComienzoFabricacionAutonomia() {
        return fechaComienzoFabricacionAutonomia;
    }
    
    public void mostrarDatos(){
        System.out.println("Datos del Automovil Autonomo: FECHA DE FABRICACION: "
        +fechaComienzoFabricacionAutonomia.getTime().toString());
    }
    
    public void mostrarPropietarios(){
        System.out.println("Propietario:\nNombres del Propietario: José Yacelga\n"
        + "ID: 1726724683\n"+"Profesión: Estudiante");
    }
}

class ListadoAutomoviles{
    private ArrayList<Automovil>listadoAutomoviles;

    public ListadoAutomoviles() {
        listadoAutomoviles = new ArrayList<Automovil>();
    }   
    
    public void addAutomovil(Automovil automovil){
        listadoAutomoviles.add(automovil);
    }
    
    public void Listar(){
        System.out.println("DATOS DE LOS AUTOMOVILES EXISTENTES EN EL LISTADO:");
        for(Automovil ObjetoTmp: listadoAutomoviles){
            ObjetoTmp.mostrarDatos();
        }
    }
}

class ListadoPropietarios{
    private ArrayList<Automovil>listadoPropietarios;
    
    public ListadoPropietarios(){
        listadoPropietarios=new ArrayList<Automovil>();
    }
    
    public void addAutomovil(Automovil propietarios){
        listadoPropietarios.add(propietarios);
    }
    
    public void Detallar(){
        System.out.println("DATOS DE LOS PROPIETARIOS DEL VEHICULO:");
        for(Automovil ObjetoPTS: listadoPropietarios){
            ObjetoPTS.mostrarPropietarios();
        }
    }
}

public class SobreEscrituraMetodo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("                  Universidad de las Fuerzas Armadas ESPE");
        System.out.println("                              Sede Latacunga");
        System.out.println("                          Ingeniería Automotriz");
        System.out.println("Desarrolladores: Carlos Anibal Arias Gallo ");
        System.out.println("                 José Antonio Yacelga Cajas");
        System.out.println("Materia:         Programación");
        System.out.println("NRC:             7450");
        System.out.println("Docente:         Luis Guerra");
        System.out.println("Tema:            Sobre Escritura de Metodos");
        System.out.println("----------------------------------------------------------------"
                + "-------------");
        
        int opcion1, prop1, menu1=1;
        Scanner sc = new Scanner(System.in);
        
        Automovil automovil1=new Automovil("For--","TECNOLOGIA: Canadiense",2018);
        automovil1.setMatriculaAutomovil("Ontario ABZM-264-20");
        
        Calendar fecha1=Calendar.getInstance();
        fecha1.set(2019,10,22);
        
        AutomovilAutonomo autonomo1= new AutomovilAutonomo("Nissan","TECNOLOGIA: Europea", 2020,fecha1);
        System.out.println("                          Base De Datos De Automoviles");
        while(menu1==1){
        ListadoAutomoviles listado1= new ListadoAutomoviles();
        ListadoPropietarios propietarios1= new ListadoPropietarios();
        System.out.println("Ingrese que desea realizar:");
        System.out.println("Realizar consulta:             [1]");
        System.out.println("Terminar y Salir:              [Cualquier otro número]");
        menu1=sc.nextInt();
        if(menu1!=1){
            break;
        }
        System.out.println("----------------------------------------------------------------"
                + "----------");
        System.out.println("Ingrese El vehiculo de listado que desea: ");
        System.out.println("Automovil                     [1]");
        System.out.println("Automovil Autonomo            [2]"); 
        opcion1=sc.nextInt();
        System.out.println("----------------------------------------------------------------"
                + "----------");
        switch(opcion1){
            case 1:
                System.out.println("Ingrese El menú que quiere visitar del vehiculo seleccionado: ");
                System.out.println("Información Propietario       [1]");
                System.out.println("Información Vehiculo          [2]");
                prop1=sc.nextInt();
                switch(prop1){
                    case 1:
                        propietarios1.addAutomovil(automovil1);;
                        propietarios1.Detallar();
                        break;
                    case 2:
                        listado1.addAutomovil(automovil1);
                        listado1.Listar();
                        break;
                    default:
                        System.out.println("Entrada invalida.");
                }
                break;
            case 2:
                System.out.println("Ingrese El menú que quiere visitar del vehiculo seleccionado: ");
                System.out.println("Información Propietario       [1]");
                System.out.println("Información Vehiculo          [2]");
                prop1=sc.nextInt();
                switch(prop1){
                    case 1:
                        propietarios1.addAutomovil(autonomo1);;
                        propietarios1.Detallar();
                        break;
                    case 2:
                        listado1.addAutomovil(autonomo1);
                        listado1.Listar();
                        break;
                    default:
                        System.out.println("Entrada invalida.");
                }
                break;
            default:
                System.out.println("Entrada Invalida");
        }
        System.out.println("------------------------------------------------"
                    + "------------------");
        }
            System.out.println("---------------------------Gracias Por Su Visita"
                    + "-------------------------------");
    }
}