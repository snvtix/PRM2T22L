package pl.edu.pw.elka.prm2t.lab5.zad1;

public enum StrategyOutcome {

    COOPERATION_REWARD(1),

    DEFECTION_PUNISHMENT(-1),

    DEFECTION_REWARD(3),

    COOPERATION_PUNISHMENT(-2);

    final int points;
    StrategyOutcome(int points) {
        this.points = points;
    }
}
