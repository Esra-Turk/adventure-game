# Adventure Game

This repository contains an adventure game running on console. This practice was developed using the four main principles (Encapsulation,Abstraction,Inheritance,Polymorpihsm) of object oriented programming in Java

## Examples of OOP
-  **Encapsulation** is the mechanism of hiding of data implementation by restricting access to public methods. Instance variables are kept private and accessor methods are made public to achieve this.[Example](https://github.com/Esra-Turk/adventure-game/blob/main/src/armor/Armor.java)

-  **Abstraction** is the concept of object-oriented programming that shows only essential attributes and hides unnecessary information. The main purpose of abstraction is hiding the unnecessary details from the users.
[In this example](https://github.com/Esra-Turk/adventure-game/blob/main/src/location/Location.java), The Location class, which is the ancestor of the Battle Location and Normal Location classes, is defined as abstract.Thus, generating objects from the location class and complexity is prevented.

- **Inheritance:** The child class will inherit all the public and protected properties and methods from the parent class. In addition, it can have its own properties and methods.An inherited class is defined by using the extends keyword.[Example](https://github.com/Esra-Turk/adventure-game/blob/main/src/location/ToolStore.java)

- **Polymorphism** means many forms, and it occurs when we have many classes that are related to each other by inheritance. For example:


    ```java
    Character s = new Samurai();
    ```

    ```java
    public Location location;
    .
    .
    .
    location = new SafeHouse(player);
    ```


## CLASSES
- Armor
    - Light
    - Medium
    - Heavy
- Character
    - Samurai
    - Archer
    - Knight
- Game
- Main
- Inventory
- Location
    - NormalLocation
        - SafeHouse
        - ToolStore
    - BattleLocation
        - Cave 
        - Forest
        - River
        - Mine
- Obstacle
    - Bear
    - Snake
    - Vampire
    - Zombie
- Player
- Weapon
    - Gun
    - Rifle
    - Sword


## UML CLASS DİAGRAM

<img width="737" alt="Ekran Resmi 2023-03-02 17 42 37" src="https://user-images.githubusercontent.com/74728647/222461460-b925c869-77d0-4114-be64-aa125e6362ba.png">


## GAME SCENARİO

```sh

Adventure Game
What is your name? Please enter the name: Esra
Esra welcome to the island
____________________________________________________
	Which character you want to be? 
	1-Samurai	Damage:5	Health:21	money:25
	2-Archer	Damage:7	Health:18	money:20 
	3-Knight	Damage:8	Health:24	money:5 
____________________________________________________
Enter the character name: Samurai
You are Samurai anymore. You have 5 damage 21 health 25.0 money
______________________________________________________________________________
	Where dou you want to go? 
	1-Tool Store	You can buy weapon and armor
	2-Safe House	Your health will be restore.
	3-Cave		Go to the cave but be careful! Zombies are everywhere
	4-River		Go to the river but be careful! Bears are everywhere
	5-Forest		Go to the forest but be careful!Vampires are everywhere
	4-Mine		Go to the mine but be careful! Snakes are everywhere
_______________________________________________________________________________
Please enter the location:Cave
You are in Cave
Be careful! 2 zombies live here
-------------------------------
You have two choices: Fight or Flight: fight

----Health Status Of The Characters----
Esra --> 21
Zombie(s)--> 20
----------------------------------------
Zombie dealt 3 damage to Esra
New Health Status
Esra--> 18
Zombie--> 20
----------------------------------------
Esra dealt 5 damage to Zombie
New Health Status
Esra--> 18
Zombie--> 15
----------------------------------------
Esra dealt 5 damage to Zombie
New Health Status
Esra--> 18
Zombie--> 10
----------------------------------------
Esra dealt 5 damage to Zombie
New Health Status
Esra--> 18
Zombie--> 5
----------------------------------------
Esra dealt 5 damage to Zombie
New Health Status
Esra--> 18
Zombie--> 0
----------------------------------------
Zombie is dead..Your health: 18

Your old balance is 25.0
The obstacle(s) had 8.0
Your new balance is 33.0
You earned food for killing the Zombie

Please enter the location:Tool Store
Which product do you want to buy? Weapon or Armor: Weapon
------------------------------- WEAPONS -------------------------------
id:1	 Name: Gun	 Damage: 2	 Money: 25
id:2	 Name: Sword	 Damage: 3	 Money: 35
id:3	 Name: Rifle	 Damage: 7	 Money: 45
-----------------------------------------------------------------------
Enter the weapon id that you want to buy:1
Your money: 33.0
You bought the product. Your current money are 8.0
Your weapon is Gun You have 7 damage anymore

Please enter the location:Mine
You are in Mine
Be careful! 5 snakes live here
-------------------------------
You have two choices: Fight or Flight: flight


Please enter the location:Cave
You can't go back the cave because you've won a prize before

Please enter the location:Forest
You are in Forest
Be careful! 3 vampires live here
-------------------------------
You have two choices: Fight or Flight: flight


Please enter the location:River
You are in River
Be careful! 1 bears live here
-------------------------------
You have two choices: Fight or Flight: fight

----Health Status Of The Characters----
Esra --> 18
Bear(s)--> 20
----------------------------------------
Esra dealt 7 damage to Bear
New Health Status
Esra--> 18
Bear--> 13
----------------------------------------
Esra dealt 7 damage to Bear
New Health Status
Esra--> 18
Bear--> 6
----------------------------------------
Bear dealt 7 damage to Esra
New Health Status
Esra--> 11
Bear--> 6
----------------------------------------
Esra dealt 7 damage to Bear
New Health Status
Esra--> 11
Bear--> 0
----------------------------------------
Bear is dead..Your health: 11

Your old balance is 8.0
The obstacle(s) had 12.0
Your new balance is 20.0
You earned water for killing the Bear

Please enter the location:Safe House
You are in the safe house. Your healthy is updated

Please enter the location:Tool Store
Which product do you want to buy? Weapon or Armor: Armor
------------------------------- ARMORS -------------------------------
id: 1	 Name: Light	 Defense: 1	 Money: 15.0
id: 2	 Name: Medium	 Defense: 3	 Money: 25.0
id: 3	 Name: Heavy	 Defense: 5	 Money: 40.0
----------------------------------------------------------------------
Enter the armor id that you want to buy:1
Your money: 20.0
You bought the product. Your current money are 5.0
You have a Light armor and 1 defence 

Please enter the location:River
You can't go back the river because you've won a prize before

Please enter the location:Mine
You are in Mine
Be careful! 3 snakes live here
-------------------------------
You have two choices: Fight or Flight: fight

----Health Status Of The Characters----
Esra --> 21
Snake(s)--> 36
----------------------------------------
Snake dealt 3 damage to Esra
New Health Status
Esra--> 18
Snake--> 36
----------------------------------------
Esra dealt 7 damage to Snake
New Health Status
Esra--> 18
Snake--> 29
----------------------------------------
Esra dealt 7 damage to Snake
New Health Status
Esra--> 18
Snake--> 22
----------------------------------------
Snake dealt 3 damage to Esra
New Health Status
Esra--> 15
Snake--> 22
----------------------------------------
Snake dealt 3 damage to Esra
New Health Status
Esra--> 12
Snake--> 22
----------------------------------------
Esra dealt 7 damage to Snake
New Health Status
Esra--> 12
Snake--> 15
----------------------------------------
Snake dealt 3 damage to Esra
New Health Status
Esra--> 9
Snake--> 15
----------------------------------------
Esra dealt 7 damage to Snake
New Health Status
Esra--> 9
Snake--> 8
----------------------------------------
Esra dealt 7 damage to Snake
New Health Status
Esra--> 9
Snake--> 1
----------------------------------------
Snake dealt 3 damage to Esra
New Health Status
Esra--> 6
Snake--> 1
----------------------------------------
Esra dealt 7 damage to Snake
New Health Status
Esra--> 6
Snake--> 0
----------------------------------------
Snake is dead..Your health: 6

Your old balance is 5.0
The obstacle(s) had 0.0
Your new balance is 5.0
You earned 1 money Your new balance is 6.0

Please enter the location:Safe House
You are in the safe house. Your healthy is updated

Please enter the location:Forest
You are in Forest
Be careful! 2 vampires live here
-------------------------------
You have two choices: Fight or Flight: fight

----Health Status Of The Characters----
Esra --> 21
Vampire(s)--> 28
----------------------------------------
Esra dealt 7 damage to Vampire
New Health Status
Esra--> 21
Vampire--> 21
----------------------------------------
Esra dealt 7 damage to Vampire
New Health Status
Esra--> 21
Vampire--> 14
----------------------------------------
Vampire dealt 3 damage to Esra
New Health Status
Esra--> 18
Vampire--> 14
----------------------------------------
Vampire dealt 3 damage to Esra
New Health Status
Esra--> 15
Vampire--> 14
----------------------------------------
Vampire dealt 3 damage to Esra
New Health Status
Esra--> 12
Vampire--> 14
----------------------------------------
Esra dealt 7 damage to Vampire
New Health Status
Esra--> 12
Vampire--> 7
----------------------------------------
Vampire dealt 3 damage to Esra
New Health Status
Esra--> 9
Vampire--> 7
----------------------------------------
Esra dealt 7 damage to Vampire
New Health Status
Esra--> 9
Vampire--> 0
----------------------------------------
Vampire is dead..Your health: 9

Your old balance is 6.0
The obstacle(s) had 14.0
Your new balance is 20.0
You earned food for killing the Vampire
YOU WON THE GAME!!See you again

```

## Requirements and Technologies

- java19 version