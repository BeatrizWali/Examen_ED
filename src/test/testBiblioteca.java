package biblioteca;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class BibliotecaTest {

    private Biblioteca biblioteca;
    private Libro libro1;
    private Libro libro2;
    private Libro libro3;

    @BeforeEach
    public void setUp() {
        // Crear una nueva instancia de Biblioteca y algunos libros antes de cada test
        biblioteca = new Biblioteca();
        libro1 = new Libro("Título 1", "Autor A");
        libro2 = new Libro("Título 2", "Autor B");
        libro3 = new Libro("Título 3", "Autor A");
    }

    @Test
    public void testAgregarLibro() {
        // Verificar si un libro se agrega correctamente
        assertTrue(biblioteca.agregarLibro(libro1));
        assertTrue(biblioteca.getLibros().contains(libro1));
    }

    @Test
    public void testEliminarLibro() {
        // Primero agregamos el libro
        biblioteca.agregarLibro(libro1);

        // Verificamos si se elimina correctamente
        assertTrue(biblioteca.eliminarLibro(libro1));
        assertFalse(biblioteca.getLibros().contains(libro1));

        // Intentar eliminar un libro que no existe
        assertFalse(biblioteca.eliminarLibro(libro2)); // libro2 no se ha agregado
    }

    @Test
    public void testEncuentraLibroPorTituloExistente() {
        // Agregar el libro1 y buscarlo por título
        biblioteca.agregarLibro(libro1);

        Libro encontrado = biblioteca.encuentraLibroPorTitulo("Título 1");
        assertNotNull(encontrado);
        assertEquals(libro1, encontrado);
    }

    @Test
    public void testEncuentraLibroPorTituloNoExistente() {
        // Buscar un libro que no existe
        Libro encontrado = biblioteca.encuentraLibroPorTitulo("Título No Existente");
        assertNull(encontrado);
    }

    @Test
    public void testEncuentraLibrosPorAutorExistente() {
        // Agregar los libros
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Buscar libros por autor
        List<Libro> librosAutorA = biblioteca.encuentraLibrosPorAutor("Autor A");
        assertNotNull(librosAutorA);
        assertEquals(2, librosAutorA.size()); // Debería encontrar dos libros del Autor A

        // Verificar que los libros encontrados sean correctos
        assertTrue(librosAutorA.contains(libro1));
        assertTrue(librosAutorA.contains(libro3));
    }

    @Test
    public void testEncuentraLibrosPorAutorNoExistente() {
        // Agregar los libros
        biblioteca.agregarLibro(libro1);

        // Buscar libros de un autor que no existe
        List<Libro> librosAutorC = biblioteca.encuentraLibrosPorAutor("Autor C");
        assertNull(librosAutorC); // Debería retornar null si no hay libros del autor
    }
}



