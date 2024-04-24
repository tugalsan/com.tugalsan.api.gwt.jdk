package com.tugalsan.api.gwt.jdk.client;

import com.google.gwt.core.shared.GwtIncompatible;

public class TGS_GwtJdk {

    //STATIC
    public static FullImplementation of() {
        if (instance == null) {
            instance = new TGS_GwtJdk();
        }
        return instance.full;
    }
    private static volatile TGS_GwtJdk instance = null;

    //INSTANCE
    private TGS_GwtJdk() {

    }
    final private FullImplementation full = new FullImplementation();

    //FULL
    public static class FullImplementation extends ClientImplementation {

        @Override
        @GwtIncompatible
        public String hello(CharSequence name) {
            return "Hello, %s from server side".formatted(name);
        }
    }

    //GWT
    public static class ClientImplementation {

        public String hello(CharSequence name) {
            return "hello, " + name + " from client side";
        }
    }
}
