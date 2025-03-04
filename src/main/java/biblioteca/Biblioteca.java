package biblioteca;

import java.util.ArrayList;
import java.util.List;

    /**
     * la clase Bibliotec representa una biblioteca con una coleccion de Libros.
     * Permite agregar, eliminar y buscar libros por titulo y autor
     *
     * @author Bea.Walino
     * @version 04.03.2025
     */
    public class Biblioteca {
        // TODO: Documentar estos atributos

        /**
         * Lista continene los libros de la biblioteca
         */
        private final List<Libro> libros;
        // TODO: Documentar este método

        /**
         * Constructor por defecto inicializa la lista de libros.
         *  Crea nueva lista vacía de libros.
         */
        public Biblioteca() {
            libros = new ArrayList<>();
        }
        // TODO: Documentar este método.
        /**
         * Constructor inicializa la biblioteca con lista de libros
         * @param libros lista de libros con lo que se inicializa la biblioteca
         */

// Test: NO HAY QUE TESTEAR ESTE METODO
        public Biblioteca(List<Libro> libros) {
            this.libros = libros;
        }
        // TODO: Testear este metodo.

        /**
         * Agrega un libro a biblioteca.
         * @param libro.
         * @return {@code true} si el libro se agrega correctamente, {@code false} si no agrega.
         */
// Test: Comprobar si se ha agregado
        public boolean agregarLibro(Libro libro) {
            return libros.add(libro);
        }
        // TODO: Testear este metodo.
        /**
         * Elimina un libro de la biblioteca.
         * @param libro El libro a eliminar.
         * @return {@code true} si el libro se ha eliminado correctamente, {@code false} si no se encontraba.
         * @test si se ha eliminado correctamente un libro de la biblioteca.
         */
// Test: comprobar si se ha eliminado
        public boolean eliminarLibro(Libro libro) {
            return libros.remove(libro);
        }
        // TODO: Documentar este método
        /**
         * Devuelve la lista de libros de la biblioteca.
         * @return Lista de libros de la biblioteca.
         */

        public List<Libro> getLibros() {
            return libros;
        }
        // TODO: Documentar este método.
        /**
         * @param titulo título del libro a buscar.
         * @return El libro con el título especificado, {@code null} si no se encuentra.
         * @test 01: Buscar un libro existente y comprobar que se localiza.
         * @test 02: Buscar un libro NO existente y comprobar que no se localiza.
         */

        public Libro encuentraLibroPorTitulo(String titulo) {
            for (Libro libro : libros) {
                if (libro.getTitulo().equals(titulo)) {
                    return libro;
                }
            }
            return null;
        }
        // TODO: Documentar este metodo.

        /**
         * Método obsoleto para buscar un libro por su autor.
         * Este método se ha reemplazado por {@link #encuentraLibrosPorAutor(String)}.
         * @param autor El autor del libro a buscar.
         * @return El libro del autor especificado, o {@code null} si no se encuentra.
         * @deprecated Este método está obsoleto y ha sido reemplazado por {@link #encuentraLibrosPorAutor(String)}.
         */
// No testearlo
// Este metodo está obsoleto. Hay que documentarlo como tal.
// Recuerda: las anotaciones @deprecated y @link a la nueva
// versión mejorada encuentraLibrosPorAutor(...)
// En esta ocasión, NO TESTEAREMOS este metodo
        public Libro encuentaLibroPorAutor(String autor) {
            for (Libro libro : libros) {
                if (libro.getAutor().equals(autor)) {
                    return libro;
                }
            }
            return null;
        }
        // TODO: Documentar este metodo
        /**
         * Busca todos los libros de un autor determinado.
         * @param autor autor de lo libros que se desean buscar.
         * @return lista de libros de ese autor. Si no se encuentran libros, la lista será {@code null}.
         * @test Comprobar la lista de libros devuelta para un autor existente.
         * @test Comprobar la lista de libros devuelta para un autor no existente.
         */

// Este metodo sustituye al metodo anterior. Está disponible desde la
// versión 2.0. Hay que documentarlo teniéndolo en cuenta.
// TODO: Testear este metodo.
// Test: Comprobar la lista de libros que devuelve para un autor existentes.
// Test: Comprobar la lista de libros que devuelve para un autor No existente
        public List<Libro> encuentraLibrosPorAutor(String autor) {
            List<Libro> listaLibros = null;
            for (Libro libro : libros) {
                if (libro.getAutor().equals(autor)) {
                    if (listaLibros == null) {
                        listaLibros = new ArrayList<>();
                    }
                    listaLibros.add(libro);
                }
            }
            return listaLibros;
        }
    }

