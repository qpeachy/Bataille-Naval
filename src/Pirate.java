public class Pirate extends Bateau{
    private static final String CAPITAINE_DEFAULT = "Capitaine Pirate";
    
    private String _capitaine;
    private boolean _endommager;
    
    public Pirate(int x, int y, int _drapeau, String capitaine, boolean endommager) {
        super(x, y, _drapeau);
        this._capitaine = capitaine;
        this._endommager = endommager;
    }
    public Pirate(int x, int y, int _drapeau, boolean endommager) {
        super(x, y, _drapeau);
        this._endommager = endommager;
        this._capitaine = CAPITAINE_DEFAULT;
    }

    @Override
    public String getEtat() {       

        if (super.estDetruit() == true){
            return "detruit ";
        }
        else{
            if(_endommager){
                return "ayant subi des dommages ";
            }
            else{
                return "intact";
            }  
        }
    }

    public String getNom(){
        String nom = super.getNom() + " de Pirate";
        return nom;
    }


    @Override
    public String toString(){
        String result;
        result = getNom() + " avec drapeau " + super.get_drapeau() + " en (" + super.get_x() + ", " + super.get_y() + ") -> " + getEtat() + " avec à son bord " + _capitaine;
        return result;
    }

    public boolean estPacifique(){
        return false;
    }

    @Override
    public void recoitBoulet() {
        if (_endommager == false){
            _endommager = true;
        }
        else{
            super.coule();
        }
    }

    @Override
    public void combat(Bateau bateau) {
        if (bateau.estPacifique() == false){
            recoitBoulet();
        }
        bateau.recoitBoulet();
    }
}
