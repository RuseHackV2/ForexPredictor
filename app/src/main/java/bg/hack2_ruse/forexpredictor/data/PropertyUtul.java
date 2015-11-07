package bg.hack2_ruse.forexpredictor.data;

import android.content.Context;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.List;

import bg.hack2_ruse.forexpredictor.models.Tools;

/**
 * Created by student on 15-11-7.
 */
public class PropertyUtul {

    private static final String INSTRUMNETNAMES = "instrument.properties";


   public PropertyUtul(){

   }

    public List<Tools> getInstruments(Context context){

        return readObjects(context.getFilesDir());
    }

    public void saveObjects(List<?> list,Context context){
        writeObjects(list, context.getFilesDir());
    }

    private void writeObjects(List<?> myClassList,File fileDir)  {
        File file = new File(fileDir,INSTRUMNETNAMES);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fout = null;
        ObjectOutputStream oos= null;
        try{
            fout = new FileOutputStream(file, true);
            oos = new ObjectOutputStream(fout);
            oos.writeObject(myClassList);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (oos !=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fout != null){
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    private List<Tools> readObjects(File fileDir){
        File file = new File(fileDir, INSTRUMNETNAMES);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        List<Tools> result = new ArrayList<>();
        FileInputStream streamIn = null;
        ObjectInputStream objectinputstream = null;
        try {
            streamIn = new FileInputStream(file);
            objectinputstream = new ObjectInputStream(streamIn);
            Tools readCase = null;
            do{
                readCase = (Tools) objectinputstream.readObject();
                if(readCase != null){
                    result.add(readCase);
                }
            }while(readCase !=null);


    } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (OptionalDataException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (StreamCorruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {

            e.printStackTrace();
        }finally {
            if(objectinputstream != null){
                try {
                    objectinputstream .close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
            return  result;
    }
}
