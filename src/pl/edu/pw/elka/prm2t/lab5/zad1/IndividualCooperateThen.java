package pl.edu.pw.elka.prm2t.lab5.zad1;

import pl.edu.pw.elka.prm2t.lab5.zad1.Individual;

import java.util.HashMap;

public class IndividualCooperateThen extends Individual {

    private final HashMap<Long, Integer> memory = new HashMap<>();

    @Override
    public boolean willCooperate(Individual other) {

        // [JW] Trzeba jeszcze sprawdzić, czy w pamięci jest w ogóle klucz other.id (tzn. czy nie jest to pierwsze
        // spotkanie z osobnikiem other):
        if(!memory.containsKey(other.id) || memory.get(other.id) < 2){
            // memory.getOrDefault(other.id, 0);  // [JW] to niepotrzebne
            return true;
        }
        // memory.getOrDefault(other.id, 0);  // [JW] to niepotrzebne
        return false;
    }

    @Override
    protected void rememberInteraction(Individual other, boolean otherAction) {
        if(!otherAction){
            // [JW] Tu też trzeba sprawdzić, czy jest w pamięci klucz other.id:
            int a = 1;
            if (memory.containsKey(other.id)) {
                a += memory.get(other.id);
            }
            memory.put(other.id, a);
        }
        else{
            memory.put(other.id, 0);
        }
    }

    @Override
    public String getName() {
        return "Cooperate then";
    }
}
