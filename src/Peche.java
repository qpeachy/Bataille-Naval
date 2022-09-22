public class Peche extends Bateau{
    private int _nbr_matelot;
    private static final int NBR_MATELOT_DEFAULT = 12;
    
    
    public Peche(int x, int y, int _drapeau,int nbr_matelot) {
        super(x, y, _drapeau);
        this._nbr_matelot = nbr_matelot;
    }
    public Peche(int x, int y, int _drapeau) {
        super(x, y, _drapeau);
        this._nbr_matelot = NBR_MATELOT_DEFAULT;
    }
    
    public String getNom(){
        String nom = super.getNom() + " de Pêche";
        return nom;
    }

    @Override
    public String toString(){
        String result;
        result = getNom() + "avec drapeau " + super.get_drapeau() + " en (" + super.get_x() + ", " + super.get_y() + ") -> " + getEtat() + "avec à son bord " + _nbr_matelot + " matelots";
        return result;
    }
    @Override
    public void recoitBoulet() {
        // TODO Auto-generated method stub
        
    }

    public boolean estPacifique(){
        return true;
    }

    @Override
    public void combat(Bateau bateau) {
        if (estPacifique() == false){
            recoitBoulet();
        }
        
        super.coule();

        
    }
}