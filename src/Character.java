public abstract class Character implements Life{
    String name;
    int hp;
    int damage;

    public void run(){
        System.out.println(this.name + "は、逃げ出した！");
    }
    public void attack(Monster target) {
        System.out.println(this.name + "の攻撃");
        System.out.println(target.name + "に" + damage + "ポイントのダメージ");
        target.hp -= damage;
    }
}
