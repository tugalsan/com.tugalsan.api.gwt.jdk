package com.tugalsan.api.gwt.jdk.client;

import com.google.gwt.core.shared.GwtIncompatible;

public class TGS_GwtJdk {

    //INSTANCE
    private static IOver of() {
        if (holder == null) {
            holder = new TGS_GwtJdk();
        }
        return holder.instance;
    }
    private static volatile TGS_GwtJdk holder = null;

    private TGS_GwtJdk() {

    }
    final private IOver instance = new IOver();

    //COMBINER
    public static String hello(CharSequence name) {
        return of().hello(name);
    }

    //OVERRIDE
    protected static class IOver extends IGWT {

        @Override
        @GwtIncompatible
        protected String hello(CharSequence name) {
            return "Hello, %s from server side".formatted(name);
        }
    }

    //GWT
    protected static class IGWT {

        protected String hello(CharSequence name) {
            return "hello, " + name + " from client side";
        }
    }
}
