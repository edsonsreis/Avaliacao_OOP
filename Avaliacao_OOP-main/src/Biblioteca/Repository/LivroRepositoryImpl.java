package Biblioteca.Repository;

import Biblioteca.Modelos.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroRepositoryImpl implements LivroRepository {
    private List<Livro> livros;

    public LivroRepositoryImpl() {
        this.livros = new ArrayList<Livro>();
    }

    @Override
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    @Override
    public void excluirLivro(Livro livro) {
        livros.remove(livro);
    }

    @Override
    public List<Livro> listarLivros() {
        return livros;
    }
}