package at.turancan.Handy;

public class PhoneFile {
    private String extension;
    private String persname;
    private int size;

    public PhoneFile(String extension, int size, String persname){
        this.extension=extension;
        this.persname=persname;
        this.size=size;
    }
    public String getExtension(){
        return extension;
    }
    public String getPersname(){
        return persname;
    }
    public int getSize(){
        return size;
    }
    public String getInfo(){
        return this.extension + " " + this.persname + " " + this.size;
    }
}
