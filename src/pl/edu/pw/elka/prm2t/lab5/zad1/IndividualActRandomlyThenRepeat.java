package pl.edu.pw.elka.prm2t.lab5.zad1;

import pl.edu.pw.elka.prm2t.lab5.zad1.Individual;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class IndividualActRandomlyThenRepeat extends Individual {

    private final HashMap<Long, Boolean> memory = new HashMap<>();

    @Override
    public boolean willCooperate(Individual other) {
        // [JW] Tu należało skorzystać z pamięci, podobnie jak przy "DefectThenRepeat":
        return memory.getOrDefault(other.id, ThreadLocalRandom.current().nextBoolean());
    }

    @Override
    protected void rememberInteraction(Individual other, boolean otherAction) {
        memory.put(other.id, otherAction);
    }

    @Override
    public String getName() {
        return "Act randomly once then repeat";
    }
}
