package pl.edu.pw.elka.prm2t.lab5.zad1;

import java.util.function.Supplier;

@FunctionalInterface
interface IndividualCreator<T> extends Supplier<T> {

    default T create() {
        return get();
    }

    @Override
    T get();
}
