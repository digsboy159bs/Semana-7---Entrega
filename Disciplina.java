public class Disciplina{
   private String nomed;
   private boolean pratica;
   
   public Disciplina(String nomed){
      this.nomed = nomed;
      this.pratica = false;
   }
   
   public String getNomed(){
      return nomed;
   }
   
   public boolean getPratica(){
      return pratica;
   }
   public void setNomed(String nomed){
      this.nomed = nomed;
   }
   
   public void setPratica(boolean pratica){
      this.pratica = pratica;
   }
   
   public String getDados(){
      return "Disciplina[Nome:"+nomed+"/nPratica:"+pratica+"]";
   }

}