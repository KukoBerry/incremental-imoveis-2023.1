import java.util.ArrayList;

/**
 * @author ("João" Silva Soares) 
 * @version (2023.04.23-v1)
 */
public class Proprietario
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private long cpf;
    private String identidade;
    private Endereco endereco;
    private ArrayList<Imovel> imoveis = new ArrayList<Imovel>();

    /**
     * Construtor para objetos da classe Proprietario
     */
    public Proprietario(String nome, long cpf, String identidade, String rua, short numero, int cep, String estado, String cidade)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.identidade = identidade;
        this.endereco = new Endereco(rua, cidade, estado, numero, cep);
    }
    public Proprietario(String nome, long cpf, String identidade, Endereco endereco)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.identidade = identidade;
        this.endereco = endereco;
    }

    //Adicionar Imóvel
    public boolean addImovel(Imovel imovel)
    {
        if (this.getEndereco().isIgual(imovel.getEndereco())){
        return false;
        }
        this.imoveis.add(imovel);
        return true;
    }
    public boolean addImovel(long iptu, String rua, short numero, int cep, String estado, String cidade, Tipo tipo, String utilizacao)
    {
        Endereco enderecoNovo = new Endereco(rua, cidade, estado, numero, cep);
        if (this.getEndereco().isIgual(enderecoNovo)){
        return false;
        }
        Imovel imovelNovo = new Imovel(iptu, enderecoNovo, tipo, utilizacao);
        this.imoveis.add(imovelNovo);
        return true;
    }
    
    public void listarImoveis(Tipo tipo)
    {
        System.out.println("Imóveis de " + this.nome + " registrados com tipo " + tipo + ": \n");
        for(int i=0; i<this.imoveis.size(); i++)
        {
            if (this.imoveis.get(i).getTipo() == tipo)
            {
                System.out.println(this.imoveis.get(i).toString());
            }
        }
    }
    
    //Alteração de Endereço, com sobrecarga
    public void setEndereco(String rua, short numero, int cep)
    {
        this.endereco.setRua(rua);
        this.endereco.setNumero(numero);
        this.endereco.setCEP(cep);
    }
    public void setEndereco(String rua, short numero, int cep, String estado, String cidade)
    {
        this.endereco.setRua(rua);
        this.endereco.setNumero(numero);
        this.endereco.setCEP(cep);
        this.endereco.setEstado(estado);
        this.endereco.setCidade(cidade);
    }
    
    //Métodos Acessores
    public String getNome()
    {
        return this.nome;
    }
    public String getIdentidade()
    {
        return this.identidade;
    }
    public Endereco getEndereco()
    {
        return this.endereco;
    }

    public long getCPF()
    {
        return this.cpf;
    }
}
