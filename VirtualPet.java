/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how pet morale
   
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void changeDiaper(){
        hunger = hunger - 30;
        if (hunger < 25)
            face.setImage("Joyful");
            if (hunger < 50){
            face.setImage("happy");
            }else{
                    face.setImage("Sad");
                }
        }

    public void poop(){
        hunger = hunger + 25;
        if (hunger < 50){
            face.setImage("happy");
        } else {
            face.setImage("Sad");
        }
    }

    public void keepWatchingTV(){
        hunger = hunger - 5;
        if (hunger < 50){
            face.setImage("happy");
        } else{
            face.setImage("Sad");
        }
    }

    public void fight(){
        hunger = hunger + 0;
        if (hunger < 50){
            face.setImage("happy");
        } else{
            face.setImage("Hurt");
        }
    }

    public void flight(){
        this.hunger = hunger + 20;
        if (hunger < 50){
            face.setImage("Running");
        } else {
            hunger +=20;
            face.setImage("Hurt");
        }
    }

    public void steal(){
        hunger = hunger - 20;
        if (hunger < 50){
            face.setImage("Heist");
        } else {
            hunger += 30;
            face.setImage("Caught");
        }
    }

    public void work(){
        hunger = hunger - 10;
        if(hunger < 50){
            face.setImage("Working");
        } if (hunger < 75){
            hunger += 15;
            face.setImage("Tired");
            if (hunger > 75 && hunger < 100){
                hunger += 30;
                face.setImage("Cooked");
            }
        }
    }

    public void playVideoGames(){
        hunger = hunger - 15;
        if(hunger < 50){
            face.setImage("Gaming");
        } if (hunger > 50){
            face.setImage("Sad");
            hunger = hunger + 15;
        }

    public void doHomework(){
        hunger = hunger + 25;
        if(hunger < 50){
            face.setImage("Doing homework well");
            hunger = hunger - 30;
        } if (hunger  > 50){
            face.setImage("angry");
            hunger = hunger + 10
        }
    }

    }
} // end Virtual Pet


