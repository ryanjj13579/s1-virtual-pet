import javax.swing.*;

public class VPMain {
    VirtualPet vp = new VirtualPet();
    
    public VPMain(){
        //this.waitABeat(1000);
        String ans1 = this.askForInput("Are you ready to wait for changing diaper?");
        if(ans1.equals("yes"))
            vp.changeDiaper();
        else
            vp.poop();
        String ans = this.askForInput("Are you ready to sleep?");
        if(ans.equals("yes"))
            vp.sleep();
        else
            vp.keepWatchingTV();
       
        String ans3 = this.askForInput("Somebody is trying to steal your toy. Do you fight?");
        if(ans3.equals("yes"))
            vp.fight();
        else
            vp.flight();
        String ans4 = this.askForInput("You got no money to buy a PC. Do you steal or work a job");
        if(ans4.equals("yes"))
            vp.steal();
        else
            vp.work(); 
        String ans5 = this.askForInput("You're a teenager and you're not happy. Do you play video games or do homework?");
        if(ans5.equals("yes"))
            vp.playVideoGames();
    
        else
            vp.doHomework();
        

    }

    public void waitABeat(int ms){
        try {
            Thread.sleep(ms); //milliseconds
        } catch(Exception e){
        
        }
    }

    public String askForInput(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Input Dialog",
                    JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }

    public static void main(String[] args) {
        new VPMain();    
    }
}

