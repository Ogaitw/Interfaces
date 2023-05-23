package dominio;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando Banco de Dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um Arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando a permissao no banco de dados");
    }
}
