package pl.edu.pw.elka.prm2t.lab5;

public abstract class Individual {

    private static long nextId = Long.MIN_VALUE;

    public final long id;

    private int points;

    abstract public boolean willCooperate(Individual other);

    abstract protected void rememberInteraction(Individual other, boolean otherAction);

    public abstract String getName();

    public Individual() {
        points = 0;
        id = nextId++;
    }

    private void addPoints(int amount) {
        points += amount;
    }

    public int getPoints() {
        return points;
    }

    public void interact(Individual other) {

        final boolean thisCooperate = willCooperate(other);
        final boolean otherCooperate = other.willCooperate(this);

        int thisOutcome, otherOutcome;
        if (thisCooperate) {
            if (otherCooperate) {
                thisOutcome = StrategyOutcome.COOPERATION_REWARD.points;
                otherOutcome = StrategyOutcome.COOPERATION_REWARD.points;
            }
            else {
                thisOutcome = StrategyOutcome.COOPERATION_PUNISHMENT.points;
                otherOutcome = StrategyOutcome.DEFECTION_REWARD.points;
            }
        }
        else {
            if (otherCooperate) {
                thisOutcome = StrategyOutcome.DEFECTION_REWARD.points;
                otherOutcome = StrategyOutcome.COOPERATION_PUNISHMENT.points;
            }
            else {
                thisOutcome = StrategyOutcome.DEFECTION_PUNISHMENT.points;
                otherOutcome = StrategyOutcome.DEFECTION_PUNISHMENT.points;
            }
        }

        addPoints(thisOutcome);
        other.addPoints(otherOutcome);

        rememberInteraction(other, otherCooperate);
        other.rememberInteraction(this, thisCooperate);
    }
}
