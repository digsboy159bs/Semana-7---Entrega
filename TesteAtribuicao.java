import javax.swing.JOptionPane;
public class TesteAtribuicao{
   public static void main (String... x){
      String nome = JOptionPane.showInputDialog("Digite o nome do professor:");
      int idade = Integer.parseInt(JOptionPane.showInputDialog("qual a idade do professor:"));
      String nomed = JOptionPane.showInputDialog("Digite o nome da disciplina:");
      
      Professor professor = new Professor(nome, idade);
      
      Disciplina disciplina = new Disciplina(nome);
      
      Atribuicao atribuicao = new Atribuicao(professor , disciplina);
      
      JOptionPane.showMessageDialog(null, atribuicao.getDados());
      
      nomed = JOptionPane.showInputDialog("Digite o nome da disciplina:");

      
      boolean pratica = Boolean.parseBoolean(JOptionPane.showInputDialog("Pratica:True/False"));
      
      disciplina.setPratica(pratica);
      disciplina.setNomed(nomed);
      
      JOptionPane.showMessageDialog(null, atribuicao.getDados());


   }
}