package pl.edu.pw.elka.prm2t.lab5;

import java.util.HashMap;

public class IndividualActRandomlyThen extends Individual{

    private final HashMap<Long, Boolean> memory = new HashMap<>();
    int coop = 0;
    int def = 0;
    boolean firstmeeting = true;

    @Override
    public boolean willCooperate(Individual other) {
        return true;
    }

    @Override
    protected void rememberInteraction(Individual other, boolean otherAction) {
    }

    @Override
    public String getName() {
        return null;
    }
}
