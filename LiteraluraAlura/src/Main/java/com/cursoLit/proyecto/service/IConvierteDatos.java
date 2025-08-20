package Main.java.com.cursoLit.proyecto.service;

public interface IConvierteDatos {

    <T> T obtenerDatos(String json, Class<T> clase);

}
