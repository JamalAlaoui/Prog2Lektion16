package opgave01.models;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println(" Jeg svinger med mit sværd af ild! ");
    }
}
