package dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando Arquivos");
    }

    @Override
    public void remove() {
        System.out.println("Removendo um arquivo");
    }
    public void checkPermission() {
        System.out.println("Checando a permissao no banco de dados");
    }
}
