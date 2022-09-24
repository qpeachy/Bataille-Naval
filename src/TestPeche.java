import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPeche {
    
    @Test
    public void PecheMatelot(){
        Matelot Jean = new Matelot("Jean", "Marin");
        Matelot Kris = new Matelot("Kris", "Marin");
        Peche Bleue = new Peche(12, 45, 3);
        Bleue.AjouterMatelot(Jean);
        Bleue.AjouterMatelot(Kris);
        assertEquals(2, Bleue.nombreMatelots());
    }
    
}
