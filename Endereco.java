public class Endereco
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String rua, cidade, estado;
    private short numero;
    private int cep;
    private boolean isValido = false;
    private String[] estadosValidos = {
        "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA",
        "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ",
        "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF"
    };

    public Endereco(String rua, String cidade, String inputEstado, short numero, int cep)
    {
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.cep = cep;
        for (int i=0; i<estadosValidos.length; i++){
            if (inputEstado.toUpperCase().equals(estadosValidos[i])){
                this.estado = estadosValidos[i];
                this.isValido = true;
            }
        }
        if (this.isValido == false){
            System.out.println("ERRO: Este código de estado não é válido.");
        }
    }

    public String getRua()
    {
        return this.rua;
    }
    public String getCidade()
    {
        return this.cidade;
    }
    public String getEstado()
    {
        return this.estado;
    }
    public short getNumero()
    {
        return this.numero;
    }
    public int getCEP()
    {
        return this.cep;
    }
    
    public void setRua(String input)
    {
        this.rua = input;
    }
    public void setCidade(String input)
    {
        this.cidade = input;
    }
    public void setEstado(String input)
    {
        for (int i=0; i<estadosValidos.length; i++){
            if (input.toUpperCase().equals(estadosValidos[i])){
                this.estado = estadosValidos[i];
                this.isValido = true;
            }
        }
        if (this.isValido == false){
            System.out.println("ERRO: Este código de estado não é válido.");
        }
    }
    public void setNumero(short input)
    {
        this.numero = input;
    }
    public void setCEP(int input)
    {
        this.cep = input;
    }
    
    public String toString()
    {
        return ("CEP: " + this.cep + "\nRua: " + this.rua + "\nNúmero: " + this.numero
            + "\nCidade e Estado: " + this.cidade + ", " + this.estado);
    }
    
    public boolean isIgual(Endereco b){
        if(this.getRua().equals(b.getRua())
        && this.getCidade().equals(b.getCidade())
        && this.getEstado().equals(b.getEstado())
        && this.getNumero() == b.getNumero()
        && this.getCEP() == b.getCEP()){
            return true;
        }
        return false;
    }
}
