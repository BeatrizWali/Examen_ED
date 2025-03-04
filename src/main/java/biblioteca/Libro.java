package biblioteca;

public class Libro {

    /**
     * La clase Libro representa un libro en la biblioteca. Tiene información sobre el título,
     * autor y el año de publicación del libro.
     * @author Bea.Walino
     * @version 04.03.2025
     */
        // TODO: Documentar estos atributos
        /**
         * título del libro.
         */
        private String titulo;
        /**
         * Autor del libro.
         */
        private String autor;
        /**
         * Año de publicación del libro.
         */
        private int anioPublicacion;
        // TODO: Documentar este método
// TODO: Testear este método

        /**
         * Constructor para crear libro con el título, autor y año.
         * @param titulo título del libro.
         * @param autor autor del libro.
         * @param anioPublicacion año de publicación del libro.
         * @test Verifica que los parámetros se asignan correctamente al crear un libro.
         */
        public Libro(String titulo, String autor, int anioPublicacion) {
            this.titulo = titulo;
            this.autor = autor;
            this.anioPublicacion = anioPublicacion;
        }
        /**
         * Devuelve el título del libro.
         * @return título del libro.
         */
        public String getTitulo() {
            return titulo;
        }
        /**
         * Establece el título del libro.
         * @param titulo nuevo título del libro.
         */
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
        // TODO: Documentar este método
        /**
         * Devuelve el autor del libro.
         * @return autor del libro.
         */
        public String getAutor() {
            return autor;
        }
        public void setAutor(String autor) {
            this.autor = autor;
        }
        // TODO: Documentar este método
        /**
         * Devuelve año de publicación del libro.
         * @return año de publicación del libro.
         */

        public int getAnioPublicacion() {
            return anioPublicacion;
        }
        /**
         * Establece el año de publicación del libro.
         * @param anioPublicacion  nuevo año de publicación del libro.
         */
        public void setAnioPublicacion(int anioPublicacion) {
            this.anioPublicacion = anioPublicacion;
        }
    }

