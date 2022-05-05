package pl.edu.pw.elka.prm2t.lab5.zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Simulation<T extends Individual> {

    private final static List<Simulation<? extends Individual>> simulations = new ArrayList<>();

    private final static List<Individual> globalPopulation = new ArrayList<>();

    private final List<Individual> subPopulation = new ArrayList<>();

    Simulation(int sizeOfPopulation, IndividualCreator<? extends Individual> creator) {
        for (int n = 0; n < sizeOfPopulation; n++) {
            var individual = creator.create();
            subPopulation.add(individual);
            globalPopulation.add(individual);
        }
    }

    public static void main(String... args) {
        int nEach = 20;  // Liczba osobników posługujących się daną strategią

        // generowanie osobników poszczególnych rodzajów
        simulations.add(new Simulation<>(nEach, IndividualAlwaysCooperate::new));
        simulations.add(new Simulation<>(nEach, IndividualAlwaysDefect::new));
        simulations.add(new Simulation<>(nEach, IndividualActRandomly::new));
        simulations.add(new Simulation<>(nEach, IndividualCooperateThenRepeat::new));
        simulations.add(new Simulation<>(nEach, IndividualDefectThenRepeat::new));
        simulations.add(new Simulation<>(nEach, IndividualActRandomlyThenRepeat::new));
        //simulations.add(new Simulation<>(nEach, IndividualCooperateThen::new));

        int tSpan = 30000;  // Liczba spotkań na osobnika w ramach całej symulacji

        for (int t = 0; t < tSpan; t++) {
            // Losowy dobór osobników w pary i przetwarzanie spotkań
            List<? extends Individual> notPaired = new ArrayList<>(globalPopulation);
            while (!notPaired.isEmpty()) {
                Individual first = notPaired.get(0);
                Individual second = notPaired.get(ThreadLocalRandom.current().nextInt(1, notPaired.size()));

                first.interact(second);

                notPaired.remove(first);
                notPaired.remove(second);
            }
        }

        // wypisanie rezultatów
        for (Simulation<? extends Individual> s : simulations) {
            System.out.println(s);
        }
    }

    public String asString() {
        return subPopulation.get(0).getName() + " " + averagePoints();
    }

    @Override
    public String toString() {
        return asString();
    }

    int averagePoints() {
        int sum = 0;
        for (Individual i : subPopulation) {
            sum += i.getPoints();
        }
        return sum / subPopulation.size();
    }
}
