public class Human {
    Leg leg;
    Head head;
    Hand hand;
    Human(){
        leg=new Leg();
        head=new Head();
        hand=new Hand();
    }
   public void Legs(){
       leg.lengsleg(3);
   }
   void Heads()
   {
       head.eye("Зеленые");

   }
   void Hands(){
       hand.Sila(100);
   }
    public static void main(String[] args) {
    Human clown=new Human();
    clown.Legs();
    clown.Hands();
    clown.Heads();
    }
}
