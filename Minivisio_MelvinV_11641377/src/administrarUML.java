
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class administrarUML {
    ArrayList<claseCreada>clases=new ArrayList();
   File archivo=null;
   

    public administrarUML(String path) {
        archivo=new File(path);
    }

    public ArrayList<claseCreada> getLabels() {
        return clases;
    }

    public void setLabels(ArrayList<claseCreada> clases) {
        this.clases = clases;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void cargarArchivo(){
        try{
           
            claseCreada temp;
            if(archivo.exists()){
                FileInputStream entrada=new FileInputStream(archivo);
                ObjectInputStream objeto=new ObjectInputStream(entrada);
                try{
                   while((temp=(claseCreada)objeto.readObject())!=null){
                       clases.add(temp);
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
            for (claseCreada t : clases) {
                bw.writeObject(t);
            }
            bw.flush();
        }catch(Exception ex){
            
        }
        bw.close();
        fw.close();
        
    }
}
