package model;
import java.util.UUID;

public class Cliente {
    private String nome;
    private String cpf;
    private String id;

    public Cliente (String nome, String cpf, String id) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = UUID.randomUUID().toString();

        Cliente cliente  = new Cliente (nome, cpf, id);
    }
    public String getNome() {
        return nome;
    }
   public String getCpf() {
        return cpf;
   }
   public String getId() {
        return id;
   }
   public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setId(String id) {
        this.id = id;
    }



}
