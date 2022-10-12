import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Cadastrar> CadastroPessoas = new ArrayList<>();

        //Escolha entre cadastrar, ver lista e sair.
        int escolha = 0;
        while (escolha != '3'){
            System.out.println("Digite 1 para cadastrar");
            System.out.println("Digite 2 para ver cadastros");
            System.out.println("Digite 3 para encerrar");
            escolha = teclado.nextLine().charAt(0);

            //Fazer o Cadastro
            if(escolha == '1'){
                System.out.println("Insira seus dados!");
                Cadastrar cad = new Cadastrar();

                System.out.println("Nome: ");
                cad.nome = teclado.nextLine();

                System.out.println("CPF: ");
                cad.cpf = teclado.nextLine();
                //Conferir se está com os . e - e se tem a quantidade necessaria(14 digitos): xxx.xxx.xxx-xx
                if(cad.cpf.length() < 14 ||  cad.cpf.length() >  14){
                    System.out.println("Confira se seu cpf está no modelo correto! ex: 123.456.789-00 ");
                    return;
                }
                if(cad.cpf.contains(".")){
                }
                if(cad.cpf.contains("-")){
                }
                else {
                    System.out.println("Insira o . e/ou - em seu cpf!");
                    return;
                }

                System.out.println("RG: ");
                cad.rg = teclado.nextLine();

                System.out.println("Data de Nascimento: ");
                cad.dataNascimento = teclado.nextLine();
                //Conferir se está com a /  e se tem a quantidade necessaria(10 digitos): xx/xx/xxxx
                if(cad.dataNascimento.length() < 10 || cad.dataNascimento.length() > 10){
                    System.out.println("Confira se sua Data de Nascimento está no modelo correto! ex: 17/11/2003 ");
                    return;
                }
                if(cad.dataNascimento.contains("/")){
                }
                else {
                    System.out.println("Insira o / em sua data!");
                    return;
                }

                System.out.println("Telefone de contato: ");
                cad.telefone = teclado.nextLine();
                //Conferir se está com a ( e ) e - e se tem a quantidade necessaria(14 digitos): (xx)xxxxx-xxxx
                if(cad.cpf.length() < 14 ||  cad.cpf.length() >  14){
                    System.out.println("Confira se seu telefone está no modelo correto! ex: (41)99999-9999 ");
                    return;
                }
                if(cad.telefone.contains("(")){
                }
                if(cad.telefone.contains(")")){
                }
                if(cad.telefone.contains("-")){
                }
                else {
                    System.out.println("Insira o ( ) e/ou - em seu telefone!");
                    return;
                }

                System.out.println("Email: ");
                cad.email = teclado.nextLine();
                //Conferir se está com o símbolo: @
                if(cad.email.contains("@")){
                }
                else{
                    System.out.println("Insira o @ em seu email!");
                    return;
                }

                System.out.println("Endereço: ");
                cad.endereco = teclado.nextLine();

                System.out.println("Cidade: ");
                cad.cidade = teclado.nextLine();

                System.out.println("UF: ");
                cad.uf = teclado.nextLine();

                System.out.println("Foto da Pessoa: ");
                //Trazendo tela para buscar imagem
                JFileChooser arquivo = new JFileChooser();
                arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
                arquivo.showSaveDialog(null);
                String caminho = arquivo.getSelectedFile().getAbsolutePath();
                System.out.println("Você buscou o arquivo: " + caminho);
                cad.foto = caminho;

                CadastroPessoas.add(cad);
            }
            //Mostrar a lista dos cadastrados
            else if(escolha == '2'){
                System.out.println("Imprimindo conteúdo da lista...");
                for(int i = 0; i< CadastroPessoas.size(); i++) {
                    CadastroPessoas.get(i).lista();
                }
            }
            //Caso digite uma opção inválida
            else if(escolha != '1' && escolha != '2' && escolha != '3') {
                System.out.println("Opção inválida!");
            }
        }
        //Encerrando programa
        System.out.println("Você escolheu encerrar o programa... ");
        System.out.println("Encerrando...");
        System.exit(0);
    }
}
