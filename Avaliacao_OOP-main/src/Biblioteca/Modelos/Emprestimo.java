package Biblioteca.Modelos;

import Biblioteca.Repository.EmprestimoRepository;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void registrar(EmprestimoRepository emprestimoRepo) {
        emprestimoRepo.registrarEmprestimo(this);
        livro.emprestar(usuario);
    }

    public void registrarDevolucao(EmprestimoRepository emprestimoRepo) {
        emprestimoRepo.registrarDevolucao(this);
        livro.devolver();
    }
}