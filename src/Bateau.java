public abstract class Bateau {
    private int _x;
    private int _y;
    private int _drapeau;
    private boolean _detruit;

    public Bateau(int x, int y, int _drapeau) {
        if (_x > BatailleNavale.MAX_X){
            this._x = BatailleNavale.MAX_X;
        }
        if (_x < 0) {
            this._x = 0;
        } else {
            this._x = x;
        }
        
        if (_y > BatailleNavale.MAX_Y){
            this._y = BatailleNavale.MAX_Y;
        }
        if (_y < 0) {
            this._y = 0;   
        } else {
            this._y = y;
        }

        this._drapeau = _drapeau;
        this._detruit = false;
    }

    public int get_x() {
        return _x;
    }

    public int get_y() {
        return _y;
    }

    public int get_drapeau() {
        return _drapeau;
    }

    public boolean estDetruit(){
        return _detruit;
    }

    public double distance(Bateau autreBateau){
        double result;
        double calcule;
        calcule = Math.pow((_x - autreBateau._x),2) + Math.pow((_y - autreBateau._y), 2);
        result = Math.sqrt(calcule);
        return result; 
    }

    public void avance(int unitsX, int unitsY){
        if (_x< BatailleNavale.MAX_X | _x > 0){
            _x += unitsX;
        }
        if (_y< BatailleNavale.MAX_Y | _y > 0){
            _y += unitsY;
        }
           
    }

    public void coule(){
        _detruit = true;
    }

    public String getNom(){
        String nom = "Bateau";
        return nom;
    }


    public String getEtat(){
        String result = " intact ";
        if (_detruit){
            result =  "detruit ";
        }
        return result;
    }

    public abstract boolean estPacifique();

    @Override
    public String toString(){
        String result;
        result = getNom() + " avec drapeau " + _drapeau + " en (" + _x + ", " + _y + ") -> " + getEtat();
        return result;
    }

    public abstract void recoitBoulet();

    public abstract void combat(Bateau bateau);

    public void rencontre(Bateau bateau){
        if (_drapeau != bateau._drapeau & distance(bateau) < BatailleNavale.RAYON_RENCONTRE){
            combat(bateau);
        }
    }

}
