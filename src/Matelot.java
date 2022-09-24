public class Matelot {
    private String _nom;
    private String _poste;
    
    public Matelot(String nom, String poste) {
        this._nom = nom;
        this._poste = poste;
    }

    public String get_nom() {
        return _nom;
    }

    public String get_poste() {
        return _poste;
    }

    public String toString(){
        String result = "Le Matelot " + get_nom() + " est assigné au poste de " + get_poste();
        return result;
    }
}
