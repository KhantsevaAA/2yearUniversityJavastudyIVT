package org.example.lab3.task3;

public class useInterator{
    public static void main(String[] args) {
        TreasureChest chest = new TreasureChest();
        Iterator<Item> potionIterator = chest.iterator(ItemType.POTION);
        System.out.println("Potions in the chest:");
        while(potionIterator.hasNext()) {
            System.out.println(potionIterator.next());
        }

        Iterator<Item> weaponIterator = chest.iterator(ItemType.WEAPON);
        System.out.println("\nWeapons in the chest:");
        while(weaponIterator.hasNext()) {
            System.out.println(weaponIterator.next());
        }

        Iterator<Item> ringIterator = chest.iterator(ItemType.RING);
        System.out.println("\nRing in the chest:");
        while(ringIterator.hasNext()) {
            System.out.println(ringIterator.next());
        }

        Iterator<Item> anyIterator = chest.iterator(ItemType.ANY);
        System.out.println("\nAny in the chest:");
        while(anyIterator.hasNext()) {
            System.out.println(anyIterator.next());
        }
    }
}