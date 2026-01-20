public class Tamagotchi {

    private int hunger;
    private int energy;
    private int mood;



    public Tamagotchi() {
        this.hunger = 4;
        this.energy = 4;
        this.mood = 4;
    }

    public Tamagotchi(int hunger, int energy, int mood) {
        this.hunger = hunger;
        this.energy = energy;
        this.mood = mood;
    }



    public String play() {
        setHunger(this.hunger + 1);
        setMood(this.mood + 1);
        setEnergy(this.energy - 1);
        return status();
    }

    public String eat() {
        setHunger(this.hunger - 2);
        setEnergy(this.energy - 1);
        return status();
    }

    public String sleep() {
        setEnergy(this.energy + 2);
        return "Tamagotchi dice (-_-) zZz";
    }


    public String status() {
        if (this.mood < 2) {
            return "Tamagotchi dice ఠ_ఠ ";
        } else if (this.energy <= 0) {
            return "Tamagotchi dice (-_-) zzZ";
        } else if (this.energy > 3) {
            return "Tamagotchi dice (-_-)";
        } else if (this.mood < 8) {
            return "Tamagotchi dice :-)";
        } else {
            return "Tamagotchi dice :-|";
        }
    }



    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }



    @Override
    public String toString() {
        return "Tamagotchi " +
                "Hambre= " + hunger +
                ", Energia= " + energy +
                ", Humor= " + mood
                ;
    }
}