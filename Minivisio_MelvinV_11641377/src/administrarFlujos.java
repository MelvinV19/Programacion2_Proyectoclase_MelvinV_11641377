
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JLabel;


public class administrarFlujos implements Serializable{
   ArrayList<JLabel>labels=new ArrayList();
   File archivo=null;
   

    public administrarFlujos(String path) {
        archivo=new File(path);
    }

    public ArrayList<JLabel> getLabels() {
        return labels;
    }

    public void setLabels(ArrayList<JLabel> labels) {
        this.labels = labels;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void cargarArchivo(){
        try{
            JLabel temp;
            if(archivo.exists()){
                FileInputStream entrada=new FileInputStream(archivo);
                ObjectInputStream objeto=new ObjectInputStream(entrada);
                try{
                   while((temp=(JLabel)objeto.readObject())!=null){
                       labels.add(temp);
                   } 
                }catch(EOFException ex){
                    //encontro el final del archivo
                    
                }
                objeto.close();
                entrada.close();
            }
        }catch(Exception ex){
            //encontro el final del archivo
        }
            
    }
    public void escribirArchivo() throws IOException{
        FileOutputStream fw=null;
        ObjectOutputStream bw=null;
        try{
           fw=new FileOutputStream(archivo);
           bw=new ObjectOutputStream(fw);
            for (JLabel t : labels) {
                bw.writeObject(t);
            }
            bw.flush();
        }catch(Exception ex){
            
        }
        bw.close();
        fw.close();
        
    }
    
   
     
}
