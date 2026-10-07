/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how pet morale
    int Pcf = 20;
    boolean trouble = false;
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("born_1");
        face.setMessage("I'm born!");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setMessage("Zzz");
        face.setImage("asleep");
    }

    public void changeDiaper(){
        if(hunger<30){
            //System.out.println("asdfsad");

        }
        face.setImage("");
    
        // hunger = hunger - 30;
    // if (hunger < 25)
    //     face.setImage("");
    //     face.setMessage("");
    //     if (hunger < 50){
    //     face.setImage("");
    //     }else{
    //             face.setImage("crying_1");
    //         }
    }

    public void poop(){
        trouble = true;
        face.setImage("poop");
        face.setMessage("Good Job");
    }

    public void keepWatchingTV(){
        face.setImage("watchingTV");
        face.setMessage("good choice");
        
    }

    public void fight(){
        hunger = hunger + 0;
        Pcf = Pcf + 50;
        if (hunger < 50){
            face.setImage("fight");
            face.setMessage("I beat him up");
        } else{
            face.setImage("fight");
            face.setMessage("I got beat up");
        }
    }

    public void flight(){
        this.hunger = this.hunger - 1000;
        if (hunger < 50){
            face.setImage("running");
        } else {
            hunger +=20;
            face.setImage("crying_1");
        }
    }

    public void steal(){
        hunger = hunger - 20;
        if (hunger < 50){
            face.setImage("Heist");
        } else {
            hunger += 30;
            face.setImage("caught");
        }
    }

    public void work(){
        hunger = hunger - 10;
        if(this.hunger < 50){
            face.setImage("Working");
            face.setMessage("I'm doing my shift");
        } if (hunger < 75){
            hunger += 15;
            face.setImage("tired_3");
            face.setMessage("I'm too tired man.");
            if (hunger > 75 && hunger < 100){
                hunger += 30;
                face.setImage("crying_1");
                face.setMessage("its too hard");
            }
        }
    }

    public void playVideoGames(){
        hunger = hunger - 15;
        if(hunger < 50){
            face.setImage("Gaming");
            face.setMessage("Good choice");
        } if (hunger > 50){
            face.setImage("crying_1");
            hunger = hunger + 15;
        }
    }

    public void doHomework(){
        hunger = hunger + 25;
        if(hunger < Pcf || trouble == true){
            face.setImage("Doing homework well");
            hunger = hunger - 30;
        }if (hunger  > 50){
            face.setImage("angry");
            hunger = hunger + 10;
        }
    }


} // end Virtual Pet


