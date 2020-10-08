package clinica;

import datos.Medico;
import datos.Paciente;
import datos.Usuario;
import java.io.*;
import java.util.ArrayList;

public class Archivo {

    public static void escribirListaMedicos(Object lista) {
        try {
            ObjectOutputStream escritor;
            escritor = new ObjectOutputStream(new FileOutputStream("D:/keiinerp/Archivo/ListadeMedicos.kevin"));
            escritor.writeObject(lista);
            escritor.close();
        } catch (Exception e) {
        }
    }

    public static void escribirHorariosDisponibles(Object lista) {
        try {
            ObjectOutputStream escritor;
            escritor = new ObjectOutputStream(new FileOutputStream("D:/keiinerp/Archivo/ListadeHorarios.kevin"));
            escritor.writeObject(lista);
            escritor.close();
        } catch (Exception e) {
        }
    }

    public static void escribirListaUsuarios(Object lista) {
        try {
            ObjectOutputStream escritor;
            escritor = new ObjectOutputStream(new FileOutputStream("D:/keiinerp/Archivo/ListadeUsuarios.kevin"));
            escritor.writeObject(lista);
            escritor.close();
        } catch (Exception e) {
        }
    }

    public static void escribirListaPacientes(Object lista) {
        try {
            ObjectOutputStream escritor;
            escritor = new ObjectOutputStream(new FileOutputStream("D:/keiinerp/Archivo/ListadePacientes.kevin"));
            escritor.writeObject(lista);
            escritor.close();
        } catch (Exception e) {
        }
    }

    public static ArrayList<Medico> leerMedicoBinario() {
        ArrayList<Medico> lista = new ArrayList<>();
        try {
            ObjectInputStream lector;
            lector = new ObjectInputStream(
                    new FileInputStream("D:/keiinerp/Archivo/ListadeMedicos.kevin"));
            lista = (ArrayList<Medico>) lector.readObject();
            lector.close();
            System.out.println(lista);
        } catch (Exception e) {
        }
        return lista;
    }

    public static ArrayList<String> leerHorariosDisponibles() {
        ArrayList<String> lista = new ArrayList<>();
        try {

            ObjectInputStream lector;
            lector = new ObjectInputStream(
                    new FileInputStream("D:/keiinerp/Archivo/ListadeHorarios.kevin"));
            lista = (ArrayList<String>) lector.readObject();
            lector.close();
            System.out.println(lista);
        } catch (Exception e) {
        }
        return lista;
    }

    public static ArrayList<Usuario> leerUsuarioBinario() {
        ArrayList<Usuario> lista = new ArrayList<>();
        try {
            ObjectInputStream lector;
            lector = new ObjectInputStream(
                    new FileInputStream("D:/keiinerp/Archivo/ListadeUsuarios.kevin"));
            lista = (ArrayList<Usuario>) lector.readObject();
            lector.close();
            System.out.println(lista);
        } catch (IOException | ClassNotFoundException e) {
        }
        return lista;
    }

    public static ArrayList<Paciente> leerPacientesBinario() {
        ArrayList<Paciente> lista = new ArrayList<>();
        try {
            ObjectInputStream lector;
            lector = new ObjectInputStream(
                    new FileInputStream("D:/keiinerp/Archivo/ListadePacientes.kevin"));
            lista = (ArrayList<Paciente>) lector.readObject();
            lector.close();
            System.out.println(lista);
        } catch (Exception e) {
        }
        return lista;
    }
}
