package Biblioteca.Repository;
import Biblioteca.Modelos.Livro;
import java.util.List;

public interface LivroRepository {
    void adicionarLivro(Livro livro);
    void excluirLivro(Livro livro);
    List<Livro> listarLivros();
}