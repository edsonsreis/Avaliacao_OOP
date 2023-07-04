package Biblioteca.View;

import Biblioteca.Controller.EmprestimoController;
import Biblioteca.Controller.LivroController;
import Biblioteca.Modelos.Emprestimo;
import Biblioteca.Repository.EmprestimoRepository;
import Biblioteca.Repository.EmprestimoRepositoryImpl;
import Biblioteca.Repository.LivroRepository;
import Biblioteca.Repository.LivroRepositoryImpl;

import javax.swing.*;
import java.util.concurrent.atomic.AtomicInteger;

public class MenuInicial {
   private static final LivroRepository livroRepository = new LivroRepositoryImpl();
    private static final LivroController livroController = new LivroController(livroRepository);
    private static final EmprestimoRepository emprestimoRepository = new EmprestimoRepositoryImpl();
    private static final EmprestimoController emprestimoController = new EmprestimoController(emprestimoRepository);
    private static final AtomicInteger idCounter = new AtomicInteger();

    public static void main(String[] args) {

        System.gc();

        boolean executando = true;
        int opcaoSelecionada = 0;

        while (executando) {
            opcaoSelecionada = Integer.parseInt(JOptionPane.showInputDialog(("")));

            switch (opcaoSelecionada) {
                case 1:
                    int opcao = Integer.parseInt(JOptionPane.showInputDialog(""));
                    break;
                case 2:
                    // Chamar menu cliente
                    break;
                case 3:
                    // Chamar menu produto
                    break;
                case 4:
                    // Chamar menu cardapio
                    break;
                case 5:
                    // Chamar menu mesa
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
                    break;


            }
        }
    }
}