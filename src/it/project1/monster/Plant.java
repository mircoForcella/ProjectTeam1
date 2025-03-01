package it.project1.monster;

public class Plant extends Monster implements ElementalMonster {
public Plant(String name, int level, int monsterHealtPoints, int monsterAbilityPoints, int monsterAttack, int monsterDefense) {
        super(name, level, monsterHealtPoints, monsterAbilityPoints, monsterAttack, monsterDefense);
        }

@Override
public Element getElement() {
        return Element.Ground;
        }

@Override
public String getType() {
        return "Elemental";
        }

    @Override
    public double getDamageReductionFromFlying() {
        return 0;
    }

    @Override
    public double getDamageReductionFromElemental(Element element) {
        return 0;
    }
}