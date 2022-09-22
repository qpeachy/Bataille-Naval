public class Pirate extends Bateau{
    private static final String CAPITAINE_DEFAULT = "Capitaine Pirate";
    
    private String _capitaine;
    private boolean _endommager;
    
    public Pirate(int x, int y, int _drapeau, String capitaine, boolean endommager) {
        super(x, y, _drapeau);
        this._capitaine = capitaine;
    }
    public Pirate(int x, int y, int _drapeau, boolean endommager) {
        super(x, y, _drapeau);
        this._endommager = endommager;
        this._capitaine = CAPITAINE_DEFAULT;
    }

    public String getEtat(){
       
        if(_endommager == true){
            return "ayant subi des dommages ";
        }
        if (super.estDetruit() == true){
            return "detruit ";
        }
        else {
            return " intact ";
        } 
    }

    public String getNom(){
        String nom = super.getNom() + " de Pirate";
        return nom;
    }


    @Override
    public String toString(){
        String result;
        result = getNom() + "avec drapeau " + super.get_drapeau() + " en (" + super.get_x() + ", " + super.get_y() + ") -> " + getEtat() + "avec à son bord " + _capitaine;
        return result;
    }

    public boolean pacifique(){
        return false;
    }

    @Override
    public void recoitBoulet() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void combat(Bateau bateau) {
        recoitBoulet();
        if ()
        
    }
}
