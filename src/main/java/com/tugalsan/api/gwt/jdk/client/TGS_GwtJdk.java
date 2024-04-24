package com.tugalsan.api.gwt.jdk.client;

import com.google.gwt.core.shared.GwtIncompatible;

public class TGS_GwtJdk {

    //STATIC
    public static IOver of() {
        if (holder == null) {
            holder = new TGS_GwtJdk();
        }
        return holder.instance;
    }
    private static volatile TGS_GwtJdk holder = null;

    //INSTANCE
    private TGS_GwtJdk() {

    }
    final private IOver instance = new IOver();

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
