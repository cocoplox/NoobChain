package org.example;
import java.util.Date;
public class Block {
    public String hash;

    public String previusHash;
    private String data; //Datos, que queremos guardar
    private long timeStamp;

    public Block(String data, String previusHash) {

        this.previusHash = previusHash;
        this.data = data;
        this.timeStamp = new Date().getTime();
        //Importante hacer esto al final de constructor
        this.hash = CalculateHash();
    }
    public String CalculateHash(){
    String calculatedHash = StringUtil.applySha256(
            previusHash +
                    Long.toString(timeStamp) +
                    data
                    );
    return calculatedHash;
    }
}
