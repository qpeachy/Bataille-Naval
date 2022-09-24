import java.util.ArrayList;

public class Peche extends Bateau{
    private int _nbr_matelot;
    private static final int NBR_MATELOT_DEFAULT = 12;
    private ArrayList<Matelot> _matelot;
    
    
    public Peche(int x, int y, int _drapeau,int nbr_matelot) {
        super(x, y, _drapeau);
        this._nbr_matelot = nbr_matelot;
        _matelot = new ArrayList<Matelot>();
    }
    public Peche(int x, int y, int _drapeau) {
        super(x, y, _drapeau);
        this._nbr_matelot = NBR_MATELOT_DEFAULT;
        _matelot = new ArrayList<Matelot>();
    }
    
    public void AjouterMatelot(Matelot matelot){
        _matelot.add(matelot);
    }

    public int nombreMatelots(){
		return _matelot.size();
	}


    public String getNom(){
        String nom = super.getNom() + " de Pêche";
        return nom;
    }

    @Override
    public String getEtat(){
        if (estDetruit()== true){
            return "detruit ";
        }
        return "intact";
    }

    @Override
    public String toString(){
        return toString()+ " avec à son bord " + _nbr_matelot + " matelots";
    }

    public boolean estPacifique(){
        return true;
    }

    @Override
    public void recoitBoulet() {  
        super.coule();
    }

    @Override
    public void combat(Bateau bateau) {
        if (bateau.estPacifique() == false){
            recoitBoulet();
        }
    }
}
