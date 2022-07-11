package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O fisico", 600);
        System.out.println(livro1);

        /*int a = 5;
        int b = 3;
        System.out.println("hello world! " + (a+b));*/
    }
}
    class livro {
        private String nome;
        private String numPaginas;

        public livro(String nome) {
            this.nome = nome;
            this.numPaginas = numPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(String numPaginas) {
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas='" + numPaginas + '\'' +
                    '}';
        }
    }



