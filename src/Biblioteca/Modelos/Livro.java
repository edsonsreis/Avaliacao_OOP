package Biblioteca.Modelos;

import Biblioteca.Enumeradores.Status;

public class Livro extends ItemBiblioteca {
    private String titulo;
    private String autor;
    private Status status;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.status = Status.DISPONIVEL;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public void emprestar(Usuario usuario) {
        if (status == Status.DISPONIVEL) {
            status = Status.EMPRESTADO;
            System.out.println(titulo + " emprestado para " + usuario.getNome());
        } else if (status == Status.EMPRESTADO) {
            System.out.println(titulo + " já está emprestado");
        } else if (status == Status.ATRASADO) {
            System.out.println(titulo + " está atrasado e não pode ser emprestado");
        }
    }

    @Override
    public void devolver() {
        if (status == Status.DISPONIVEL){
        System.out.println(titulo + " devolvido");
    } else {
            System.out.println(titulo + "ainda não foi devolvido!");
        }
    }

}