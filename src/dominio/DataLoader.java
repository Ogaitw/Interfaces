package dominio;

public interface DataLoader {
    void load();
    default void checkPermission () {
        System.out.println("Chegando a permissao!");
    }
}
