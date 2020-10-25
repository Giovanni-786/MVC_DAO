package model;


public class ClienteModel extends EnderecoModel {
    private int CLI_ID;
    private String CLI_NOME;
    private String CLI_CPF;
    private String CLI_EMAIL;
    private String CLI_DDD;
    private String CLI_TELEFONE;
    
    
   

    public ClienteModel() {
    }
    
    public class EnderecoModel{
        EnderecoModel endereco = new EnderecoModel();
    }
    
   
    public ClienteModel(int CLI_ID, String CLI_NOME, String CLI_CPF, String CLI_EMAIL, String CLI_DDD, String CLI_TELEFONE) {
        this.CLI_ID = CLI_ID;
        this.CLI_NOME = CLI_NOME;
        this.CLI_CPF = CLI_CPF;
        this.CLI_EMAIL = CLI_EMAIL;
        this.CLI_DDD = CLI_DDD;
        this.CLI_TELEFONE = CLI_TELEFONE;
        
        
    }

    /**
     * @return the CLI_ID
     */
    public int getCLI_ID() {
        return CLI_ID;
    }

    /**
     * @param CLI_ID the CLI_ID to set
     */
    public void setCLI_ID(int CLI_ID) {
        this.CLI_ID = CLI_ID;
    }

    /**
     * @return the CLI_NOME
     */
    public String getCLI_NOME() {
        return CLI_NOME;
    }

    /**
     * @param CLI_NOME the CLI_NOME to set
     */
    public void setCLI_NOME(String CLI_NOME) {
        this.CLI_NOME = CLI_NOME;
    }

    /**
     * @return the CLI_CPF
     */
    public String getCLI_CPF() {
        return CLI_CPF;
    }

    /**
     * @param CLI_CPF the CLI_CPF to set
     */
    public void setCLI_CPF(String CLI_CPF) {
        this.CLI_CPF = CLI_CPF;
    }

    /**
     * @return the CLI_EMAIL
     */
    public String getCLI_EMAIL() {
        return CLI_EMAIL;
    }

    /**
     * @param CLI_EMAIL the CLI_EMAIL to set
     */
    public void setCLI_EMAIL(String CLI_EMAIL) {
        this.CLI_EMAIL = CLI_EMAIL;
    }

    /**
     * @return the CLI_DDD
     */
    public String getCLI_DDD() {
        return CLI_DDD;
    }

    /**
     * @param CLI_DDD the CLI_DDD to set
     */
    public void setCLI_DDD(String CLI_DDD) {
        this.CLI_DDD = CLI_DDD;
    }

    /**
     * @return the CLI_TELEFONE
     */
    public String getCLI_TELEFONE() {
        return CLI_TELEFONE;
    }

    /**
     * @param CLI_TELEFONE the CLI_TELEFONE to set
     */
    public void setCLI_TELEFONE(String CLI_TELEFONE) {
        this.CLI_TELEFONE = CLI_TELEFONE;
    }


}
