package at.turancan.Handy;

public class Camera {
    private int res;
    private int fileN=0;
    public Camera(int res){
        this.res=res;
    }
public PhoneFile takePicture(){
    System.out.println("take Picture");
    PhoneFile file= new PhoneFile("jpg",1001,"pic" );
    return file;
}

    public void setRes(int res) {
        this.res = res;
    }
    public int getRes() {
        return res;
    }
}
