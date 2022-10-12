public class Cadastrar {
    String nome;
    String cpf;
    String rg;
    String dataNascimento;
    String telefone;
    String email;
    String endereco;
    String cidade;
    String uf;
    String foto;

    //Mostrar lista com os cadastros feitos
    public void lista(){
        System.out.println("======= INÍCIO =======");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("UF: " + uf);
        System.out.println("Foto: " + foto);
        System.out.println("======= FIM =======");
    }
}
