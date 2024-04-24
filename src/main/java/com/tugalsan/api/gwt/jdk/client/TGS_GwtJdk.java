package com.tugalsan.api.gwt.jdk.client;

import com.google.gwt.core.shared.GwtIncompatible;

public class TGS_GwtJdk {

    private TGS_GwtJdk() {

    }
    final private FullImplementation instance = new FullImplementation();

    public static FullImplementation of() {
        return new TGS_GwtJdk().instance;
    }

    public static class FullImplementation extends ClientImplementation {

        @Override
        @GwtIncompatible
        public String hello(CharSequence name) {
            return "Hello, %s from server side".formatted(name);
        }
    }

    public static class ClientImplementation {

        public String hello(CharSequence name) {
            return "hello, " + name + " from client side";
        }
    }
}
