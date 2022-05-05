package pl.edu.pw.elka.prm2t.lab5.zad1;
import pl.edu.pw.elka.prm2t.lab5.zad1.Individual;

import java.util.HashMap;

public class IndividualDefectThenRepeat extends Individual {

    private final HashMap<Long, Boolean> memory = new HashMap<>();

    @Override
    public boolean willCooperate(Individual other) {
        return memory.getOrDefault(other.id, false);
    }

    @Override
    protected void rememberInteraction(Individual other, boolean otherAction) {
        memory.put(other.id, otherAction);
    }

    @Override
    public String getName() {
        return asString();
    }

    public String asString() {
        return "Defect once then repeat";
    }
}
