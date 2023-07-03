package Biblioteca.View;

import Biblioteca.Controller.EmprestimoController;
import Biblioteca.Controller.LivroController;
import Biblioteca.Repository.EmprestimoRepository;
import Biblioteca.Repository.EmprestimoRepositoryImpl;
import Biblioteca.Repository.LivroRepository;
import Biblioteca.Repository.LivroRepositoryImpl;

public class Teste {
        public static void main(String[] args) {
            LivroRepository livroRepo = new LivroRepositoryImpl();
            LivroController livroController = new LivroController(livroRepo);

            EmprestimoRepository emprestimoRepo = new EmprestimoRepositoryImpl();
            EmprestimoController emprestimoController = new EmprestimoController(emprestimoRepo);

            livroController.adicionarLivro("Livro 1", "Autor 1");
            livroController.adicionarLivro("Livro 2", "Autor 2");
            livroController.listarLivros();
        }
  }
