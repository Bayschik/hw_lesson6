public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(700,80);
        boss.setDamage(80);
        boss.setHealth(700);
        boss.weapon.setTypeOfWeapon(WeaponType.PNEUMATIC);
        boss.weapon.setNameOfWeapon("Hatsan 125");
        System.out.println(boss.info());
        Skeleton skeleton = new Skeleton(250,50,10);
        skeleton.weapon.setNameOfWeapon("crossbow");
        skeleton.weapon.setTypeOfWeapon(WeaponType.BOW);
        System.out.println(skeleton.info());
        Skeleton skeleton1 = new Skeleton(300,35,15);
        skeleton1.weapon.setNameOfWeapon("AK-47");
        skeleton1.weapon.setTypeOfWeapon(WeaponType.FIREARMS);
        System.out.println(skeleton1.info());





    }
}
