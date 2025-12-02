package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class PlaylistRecommenderTest {

    @Test
    public void emptyBPMs() {
        List<Integer> bpms = new ArrayList<Integer>();
        assertEquals("bpm not accepted", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void validTitle() {
        String s = "this is a good title";
        assertTrue(PlaylistRecommender.isValidTrackTitle(s));
    }

    @Test
    public void normalizeNegative() {
        assertEquals(0, PlaylistRecommender.normalizeVolume(-15));
    }
}
