import javax.swing.JOptionPane;

   public class Programa {
      
      public static void main(String[] args) throws Exception {
         for(;;){
         String resposta = (JOptionPane.showInputDialog("Informe o que você deseja fazer: \nDigite 1 para cadastrar.\n Digite 2 para vizualizar a disponibilidade dos instrutores.\n Digite 3 para fechar o programa.\n"));
         if(resposta.equals("3")){
            break;
         }
         switch (resposta){
            case "1":
            Aluno[] lista_alunos = new Aluno[1000];

            int cont = 0;

            JOptionPane.showMessageDialog(null, "Bem-Vindo à Academia. É um prazer ter você, cliente, acessando nossa plataforma de Cadastro. ");
                for(; ; ) {
                   String nome = JOptionPane.showInputDialog("Digite seu nome: ");
                   String sexo = JOptionPane.showInputDialog("Digite seu sexo: ");
                   String cpf = JOptionPane.showInputDialog("Digite seu CPF: ");
                   String rg = JOptionPane.showInputDialog("Digite seu RG: ");
         
                   int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do mês que você nasceu: "));
                   int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês que você nasceu: "));
                   int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que você nasceu: "));
         
                   String cidade = JOptionPane.showInputDialog("Informe o nome da sua cidade: ");
                   String estado = JOptionPane.showInputDialog("Digite o nome do estado onde você mora: ");
                   String bairro = JOptionPane.showInputDialog("Digite o nome do seu bairro: ");
                   String rua = JOptionPane.showInputDialog("Digite o nome da rua onde você mora: ");
                   String numero = JOptionPane.showInputDialog("Digite o número da casa onde você mora: ");
                   String complemento = JOptionPane.showInputDialog("Informe o tipo de complemento em que você vive: ");

                   float peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o seu peso: "));
                   float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a sua altura: "));
         
                  DataNascimento d00 = new  DataNascimento (dia, mes, ano);
         
                  Endereco e00 = new Endereco(cidade, estado, bairro, rua, numero, complemento);

                  Avaliacao av00 = new Avaliacao(peso, altura);

                  Aluno a00 = new Aluno(nome, sexo, rg, cpf, e00, d00, av00);
         
                  JOptionPane.showMessageDialog(null, "Cadastro realizadado com Sucesso! Verifique a seguir suas informações cadastradas.");
         
                  System.out.println("\nINFORMAÇÕES:\n"+a00.imprimeAluno()+a00.getEndereco().imprimee()+a00.getDatanascimento().imprimeData()+a00.getAvaliacao().imprimePA());
         
                  int resp = JOptionPane.showConfirmDialog(null,"Você deseja cadastrar mais algum aluno?");
         
                    if(resp!= 0){
                       break;
                     }
         
                  lista_alunos[cont] = new Aluno(cpf, rg, nome, sexo, e00, d00, av00);
         
                  cont++;
               }

            break;

            case "2":
              Instrutor i00 = new Instrutor("Mateuzinho", "Mateus Santos", "22244133");

              Instrutor i01 = new Instrutor("Maria marombinha", "Maria Antônia", "22244135");

              Instrutor i02 = new Instrutor("Ana maromba", "Ana Maria", "22244130");  
              
              System.out.println("\nINFORMAÇÕES:\n"+i00.imprimeInstrutor()+ i01.imprimeInstrutor()+i02.imprimeInstrutor());

            break;

            case "3":
            JOptionPane.showMessageDialog(null, "O programa está sendo encerrado. A academia Toca do Ogro agradece pela preferência! Em seguida, clique em 'cancel'.");
            break;
            default:
            JOptionPane.showMessageDialog(null, "Ops, parece que você digitou uma opção inválida. Que tal tentar novamente?");
         }
      }
      }
   }


   