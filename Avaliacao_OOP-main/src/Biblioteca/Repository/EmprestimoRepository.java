package Biblioteca.Repository;

import Biblioteca.Modelos.Emprestimo;

public interface EmprestimoRepository {
    void registrarEmprestimo(Emprestimo emprestimo);
    void registrarDevolucao(Emprestimo emprestimo);
}
