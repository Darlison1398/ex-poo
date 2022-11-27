public class mycount {
    private String nome;
    private String sobreNome;
    private String palavraChave;

    public mycount(){

    }

    public String getNome(){
        return nome;
    }

    public String getSobreNome(){
        return sobreNome;
    }

    public String getPalavraChave(){
        return palavraChave;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSobreNome(String sobreNome){
        this.sobreNome = sobreNome;
    }

    public void setPalavraChave(String palavraChave){
        this.palavraChave = palavraChave;
    }

    public void mostrarNome(){
        this.nome = "Darlison";
    }

    public void mostrarSobreNome(){
        this.sobreNome = "Silva";
    }

    public void mostrarPalavraChave(){
        this.palavraChave = "Vai dar tudo bem";
    }

    public String mostrarTudo(){
        return "Nome: " + String.valueOf(this.nome) + " " + String.valueOf(this.sobreNome) + "\nPalavra-Chave: " + String.valueOf(this.palavraChave);
    }
}
