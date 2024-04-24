package com.tugalsan.api.gwt.jdk.client;

import com.google.gwt.core.shared.GwtIncompatible;

public class TGS_GwtJdk {

    //STATIC
    public static IOver of() {
        if (instance == null) {
            instance = new TGS_GwtJdk();
        }
        return instance.implementaion;
    }
    private static volatile TGS_GwtJdk instance = null;

    //IMPLEMENTATION
    private TGS_GwtJdk() {

    }
    final private IOver implementaion = new IOver();

    //OVERRIDE
    public static class IOver extends IGWT {

        @Override
        @GwtIncompatible
        public String hello(CharSequence name) {
            return "Hello, %s from server side".formatted(name);
        }
    }

    //GWT
    public static class IGWT {

        public String hello(CharSequence name) {
            return "hello, " + name + " from client side";
        }
    }
}
