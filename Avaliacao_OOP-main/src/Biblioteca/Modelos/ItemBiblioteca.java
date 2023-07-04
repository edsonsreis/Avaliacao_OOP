package Biblioteca.Modelos;

abstract class ItemBiblioteca {
    public abstract void emprestar(Usuario usuario);
    public abstract void devolver();
}