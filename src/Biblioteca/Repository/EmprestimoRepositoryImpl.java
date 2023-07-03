package Biblioteca.Repository;

import Biblioteca.Modelos.Emprestimo;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoRepositoryImpl implements EmprestimoRepository {
    private List<Emprestimo> emprestimos;

    public EmprestimoRepositoryImpl() {
        this.emprestimos = new ArrayList<>();
    }

    @Override
    public void registrarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    @Override
    public void registrarDevolucao(Emprestimo emprestimo) {
        emprestimos.remove(emprestimo);
    }
}