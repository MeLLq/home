package praktika2;

public class Dog {
    public String nickname;
    public int age;
    public Dog(String nickname,int age ){
        this.nickname=nickname;
        this.age=age;
    }
    public String getNickname(){
        return nickname;
    }
    public void setNickname(String n)
    {
        this.nickname=n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a)
    {
        this.age=a;
    }

    void perevod() {
        age*=7;
        System.out.print(age);
        System.out.print(" ");
    }
    void stroka(){
        System.out.print(nickname.toString());
    }
}
