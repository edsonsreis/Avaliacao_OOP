package Biblioteca.Controller;

import Biblioteca.Modelos.Livro;
import Biblioteca.Repository.LivroRepository;

import java.util.List;

public class LivroController {
    private LivroRepository livroRepository;

    public LivroController(LivroRepository livroRepo) {
        this.livroRepository = livroRepo;
    }

    public void adicionarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        livroRepository.adicionarLivro(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void excluirLivro(String titulo) {
        List<Livro> livros = this.livroRepository.listarLivros();
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                this.livroRepository.excluirLivro(livro);
                System.out.println("Livro excluído: " + livro.getTitulo());
                return;
            }
        }
        System.out.println("Livro não encontrado: " + titulo);
    }

    public void listarLivros() {
        List<Livro> livros = this.livroRepository.listarLivros();
        if (livros.isEmpty()) {
            System.out.println("Não há livros cadastrados");
        } else {
            System.out.println("Livros:");
            for (Livro livro : livros) {
                System.out.println(" - " + livro.getTitulo() + " (" + livro.getAutor() + ")");
            }
        }
    }
}