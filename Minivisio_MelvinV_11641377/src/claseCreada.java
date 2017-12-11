
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class claseCreada {
    ArrayList<JLabel>lista=new ArrayList();
    JPanel clase;

    public claseCreada() {
    }

    public claseCreada(JPanel clase) {
        this.clase = clase;
    }

    public JPanel getClase() {
        return clase;
    }

    public void setClase(JPanel clase) {
        this.clase = clase;
    }
    

    public ArrayList<JLabel> getLista() {
        return lista;
    }

    public void setLista(ArrayList<JLabel> lista) {
        this.lista = lista;
    }
    
    
}
