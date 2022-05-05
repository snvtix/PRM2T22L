package pl.edu.pw.elka.prm2t.lab5.zad1;
import pl.edu.pw.elka.prm2t.lab5.zad1.Individual;

import java.util.HashMap;

public class IndividualCooperateThenRepeat extends Individual {

    private final HashMap<Long, Boolean> memory = new HashMap<>();

    @Override
    public boolean willCooperate(Individual other) {

        // Jeśli z danym osobnikiem nastąpiło już spotkanie, wybierz to samo, co on przy ostatnim spotkaniu.
        // W przeciwnym przypadku - wybierz "współpracę".
        return memory.getOrDefault(other.id, true);
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
        return "Cooperate once then repeat";
    }
}
