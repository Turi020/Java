package at.turancan.Handy;

import java.util.List;

public class Phone {
    private Sim sim;
    private String number;
    private Camera camera;
    private SD_memo sdMemo;


    public Phone( Camera camera, Sim sim, SD_memo sdMemo){
        this.camera=camera;
        this.sim=sim;
        this.sdMemo=sdMemo;
    }
    public void takePicture () {
        PhoneFile file = this.camera.takePicture();
        this.sdMemo.saveFile(file);
        System.out.println(file.getInfo());
    }
   public List <PhoneFile> getAllFiles(){
        return this.sdMemo.getFiles();
    }
    public void call(){
        this.sim.docall(number);
    }
}

