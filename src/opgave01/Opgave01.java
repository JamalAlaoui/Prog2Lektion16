package opgave01;

import opgave01.models.*;
import opgave01.models.Character;

public class Opgave01 {
    public static void main(String[] args) {


        Character pkub = new King();
        pkub.setWeapon(new KnifeBehavior());
pkub.fight();
        pkub.setWeapon(new SwordBehavior());
pkub.fight();


    }
}
