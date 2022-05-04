package pl.edu.pw.elka.prm2t.lab5;

import java.util.HashMap;

public class IndividualCooperateThen extends Individual{

    private final HashMap<Long, Integer> memory = new HashMap<>();

    @Override
    public boolean willCooperate(Individual other) {

        if(memory.get(other.id).intValue()<=2){
            memory.getOrDefault(other.id, 0);
            return true;
        }
        memory.getOrDefault(other.id, 0);
        return false;
    }

    @Override
    protected void rememberInteraction(Individual other, boolean otherAction) {
        if(!otherAction){
            int a = memory.get(other.id).intValue() + 1;
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
