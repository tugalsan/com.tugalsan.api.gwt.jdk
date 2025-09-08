package com.tugalsan.api.gwt.jdk.client;

import java.util.function.Supplier;

public class TGC_StableSupplier<T> implements Supplier<T> {

    private volatile Supplier<T> supplier;
    private volatile T value;

    public TGC_StableSupplier(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    @Override
    public T get() {
        if (value == null) {
            value = supplier.get();
        }
        return value;
    }
}
