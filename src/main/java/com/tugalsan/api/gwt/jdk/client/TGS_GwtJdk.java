package com.tugalsan.api.gwt.jdk.client;

import com.google.gwt.core.shared.GwtIncompatible;

public class TGS_GwtJdk {

    //MemoryHappy
    private static JREHappy of() {
        if (holder == null) {
            holder = new TGS_GwtJdk();
        }
        return holder.instance;
    }
    private static volatile TGS_GwtJdk holder = null;

    private TGS_GwtJdk() {

    }
    final private JREHappy instance = new JREHappy();

    //StaticHappy
    public static String hello(CharSequence name) {
        return of().hello(name);
    }

    //JREHappy
    protected static class JREHappy extends GWTHappy {

        @Override
        @GwtIncompatible
        protected String hello(CharSequence name) {
            return "Hello, %s from server side".formatted(name);
        }
    }

    //GWTHappy
    protected static class GWTHappy {

        protected String hello(CharSequence name) {
            return "hello, " + name + " from client side";
        }
    }
}
