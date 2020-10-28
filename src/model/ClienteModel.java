package model;


public class ClienteModel {
    private int CLI_ID;
    private String CLI_NOME;
    private String CLI_CPF;
    private String CLI_EMAIL;
    private int CLI_DDD;
    private int CLI_TELEFONE;
    private int END_ID;
    
    
   

    public ClienteModel() {
        
        EnderecoModel endereco = new EnderecoModel();
        endereco.setEND_ID(END_ID);
    }
    
    
   
    
   
    public ClienteModel(int CLI_ID, String CLI_NOME, String CLI_CPF, String CLI_EMAIL, int CLI_DDD, int CLI_TELEFONE) {
        this.CLI_ID = CLI_ID;
        this.CLI_NOME = CLI_NOME;
        this.CLI_CPF = CLI_CPF;
        this.CLI_EMAIL = CLI_EMAIL;
        this.CLI_DDD = CLI_DDD;
        this.CLI_TELEFONE = CLI_TELEFONE;
        this.END_ID = END_ID;
     
        
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
    public int getCLI_DDD() {
        return CLI_DDD;
    }

    /**
     * @param CLI_DDD the CLI_DDD to set
     */
    public void setCLI_DDD(int CLI_DDD) {
        this.CLI_DDD = CLI_DDD;
    }

    /**
     * @return the CLI_TELEFONE
     */
    public int getCLI_TELEFONE() {
        return CLI_TELEFONE;
    }

    /**
     * @param CLI_TELEFONE the CLI_TELEFONE to set
     */
    public void setCLI_TELEFONE(int CLI_TELEFONE) {
        this.CLI_TELEFONE = CLI_TELEFONE;
    }

    /**
     * @return the END_ID
     */
    public int getEND_ID() {
        return END_ID;
    }

    /**
     * @param END_ID the END_ID to set
     */
    public void setEND_ID(int END_ID) {
        this.END_ID = END_ID;
    }

  

}
