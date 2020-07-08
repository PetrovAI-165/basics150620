import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SequenceSumTests {
    @Test
    public void testBasic() {
        assertEquals("0+1+2+3+4+5+6 = 21", SequenceSum.showSequence(6));
        assertEquals("0+1+2+3+4+5+6+7+8+9+10 = 55", SequenceSum.showSequence(10));
        assertEquals("0 = 0", SequenceSum.showSequence(0));
        assertEquals("-15 < 0", SequenceSum.showSequence(-15));
        assertEquals("0+1+2+3+4+5+6+7+8+9+10+11+12 = 78", SequenceSum.showSequence(12));

    }
}
