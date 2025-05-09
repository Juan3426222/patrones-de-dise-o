/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package credenciales;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanm
 */
public class GeneradorCredenciales {
    private static GeneradorCredenciales instancia;
    private List<Credencial> credenciales;
    
    private GeneradorCredenciales() {
        credenciales = new ArrayList<>();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static GeneradorCredenciales getInstancia() {
        if (instancia == null) {
            instancia = new GeneradorCredenciales();
        }
        return instancia;
    }
    public void agregarCredencial(Credencial c) {
        credenciales.add(c);
    }

    public void mostrarCredenciales() {
        if (credenciales.isEmpty()) {
            System.out.println("No hay credenciales registradas.");
        } else {
            for (Credencial c : credenciales) {
                c.mostrar();
            }
        }
    }

    public void eliminarTodas() {
        credenciales.clear();
        System.out.println("Credenciales eliminadas.");
    }
}
    

