package praktika2;
public class dog_kennel {
    public static void massive(){
        Dog[] sol=new Dog[4];
        sol[0]=new Dog("Iner",9);
        sol[1]=new Dog("Lofy",4);
        sol[2]=new Dog("flufy",7);
        sol[3]=new Dog("Oha",1);
      for(int i=0;i<sol.length;i++)
              System.out.println(sol[i]);
    }

    public static void main(String[] args){
        Dog test=new Dog("ho",10);
        test.perevod();
        test.stroka();
        System.out.println(" ");
        massive();
    }
}
