import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPirate {
    
    @Test
    public void TestDommages(){
        Pirate bateauPirate = new Pirate(51, 152, 3, "Capitaine Arold", true);
        assertEquals("ayant subi des dommages", bateauPirate.getEtat());
    }

    @Test
    public void TestDetruit(){
        Pirate bateauPirate2 = new Pirate(629, 12, 5, "Capitaine Ptistus", true);
        assertEquals(false, bateauPirate2.estDetruit());
        bateauPirate2.coule();
        assertEquals(true, bateauPirate2.estDetruit());
        assertEquals("detruit ", bateauPirate2.getEtat());
    }
}
