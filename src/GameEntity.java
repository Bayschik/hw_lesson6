public class GameEntity {
    private int health;
    private int damage;
    private String name;

    public GameEntity(int health, int damage) {
        this.damage = damage;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int healh) {
        this.health = healh;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
