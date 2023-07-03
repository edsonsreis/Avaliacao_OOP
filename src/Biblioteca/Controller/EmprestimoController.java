package Biblioteca.Controller;

import Biblioteca.Modelos.Emprestimo;
import Biblioteca.Modelos.Livro;
import Biblioteca.Modelos.Usuario;
import Biblioteca.Repository.EmprestimoRepository;

import java.util.List;

public class EmprestimoController {
    private EmprestimoRepository emprestimoRepository;
    private EmprestimoController livrosRepository;

    public EmprestimoController(EmprestimoRepository emprestimoRepo) {
        this.emprestimoRepository = emprestimoRepo;
    }

    public void realizarEmprestimo(String tituloLivro, String nomeUsuario) {
        List<Livro> livros = livrosRepository.listarLivros();
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(tituloLivro)) {
                Usuario usuario = new Usuario(nomeUsuario);
                Emprestimo emprestimo = new Emprestimo(livro, usuario);
                emprestimo.registrar(this.emprestimoRepository);
                return;
            }
        }
        System.out.println("Livro não encontrado: " + tituloLivro);
    }

    public void realizarDevolucao(String tituloLivro) {
        List<Livro> livros = livrosRepository.listarLivros();
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(tituloLivro)) {
                Emprestimo emprestimo = new Emprestimo(livro, null);
                emprestimo.registrarDevolucao(this.emprestimoRepository);
                return;
            }
        }
        System.out.println("Livro não encontrado: " + tituloLivro);
    }
    public List<Livro> listarLivros() {
        return livrosRepository.listarLivros();
    }
}
