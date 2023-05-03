
/**
 * @author ("João" Silva Soares) 
 * @version (2023.04.19-v1)
 */

public class Imovel
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private long iptu;
    private String utilizacao;
    private Endereco endereco;
    private Tipo tipo;

    /**
     * Construtor para objetos da classe Imovel
     */
    public Imovel(long iptu, String rua, short numero, int cep, String estado, String cidade, Tipo tipo, String utilizacao)
    {
        this.iptu = iptu;
        this.endereco = new Endereco(rua, cidade, estado, numero, cep);
        this.tipo = tipo;
        this.utilizacao = utilizacao;
    }
    public Imovel (long iptu, String rua, short numero, int cep, Tipo tipo, String utilizacao)
    {
        this(iptu, rua, numero, cep, "BA", "Salvador", tipo, utilizacao);
    }
    public Imovel(long iptu, Endereco endereco, Tipo tipo, String utilizacao)
    {
        this.iptu = iptu;
        this.endereco = endereco;
        this.tipo = tipo;
        this.utilizacao = utilizacao;
    }

    public String toString()
    {
        return("Tipo: " + this.tipo + "\n" + "IPTU: " + this.iptu + "\n" + "Utilização: "
        + this.utilizacao + "\n" + "ENDEREÇO: \n" + this.endereco.toString() + "\n");
    }
    
    // Métodos Acessores:
    public long getIPTU()
    {
        return this.iptu;
    }
    
    public Endereco getEndereco()
    {
        return this.endereco;
    }
    
    public Tipo getTipo()
    {
        return this.tipo;
    }
    
    public String getUtilizacao()
    {
        return this.utilizacao;
    }
}
