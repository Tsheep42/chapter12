public abstract class Monster implements Life{
    String name;
    int hp;

    public void run() {
        System.out.println("モンスターは逃げ出した。");
    }

}