package behaviours;

public interface IDamageable {

    public int getHp();

    public void setHp(int newHp);
    public void takeDamage(int damage);
    public void die();
}
