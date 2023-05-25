package at.turancan.Handy;

import java.util.ArrayList;
import java.util.List;

public class SD_memo {
    private int capacity;
    private List<PhoneFile>files;

    public SD_memo(int capacity){
        this.capacity=capacity;
        this.files=new ArrayList<>();

    }

    public void saveFile(PhoneFile file) {
        files.add(file);
    }
    public List <PhoneFile> getFiles(){
        return files;
    }

    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
}
