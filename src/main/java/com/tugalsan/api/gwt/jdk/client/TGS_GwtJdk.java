package com.tugalsan.api.gwt.jdk.client;

import com.google.gwt.core.shared.GwtIncompatible;

public class TGS_GwtJdk {

    //UserHappy
    public static CommonCombined cmn() {
        return of().cmn;
    }

    public static OnlyJre jre() {
        return of().jre;
    }

    public static OnlyGwt gwt() {
        return of().gwt;
    }

    //MemoryHappy
    private static TGS_GwtJdk of() {
        if (holder == null) {
            holder = new TGS_GwtJdk();
        }
        return holder;
    }
    private static volatile TGS_GwtJdk holder = null;

    private TGS_GwtJdk() {

    }
    final public CommonCombined cmn = new CommonCombined();
    final public OnlyJre jre = new OnlyJre();
    final public OnlyGwt gwt = new OnlyGwt();

    //OnlyGWTHappy
    public static class OnlyGwt {

        public static void onlyGwtCanUseMe() {
        }
    }

    //OnlyJREHappy
    public static class OnlyJre {

        @GwtIncompatible
        public static void onlyJreCanUseMe() {
        }
    }

    //JREHappy
    protected static class CommonCombined extends CommonGwt {

        @Override
        @GwtIncompatible
        protected String hello(CharSequence name) {
            return "Hello, %s from server side".formatted(name);
        }
    }

    //GWTHappy
    protected static class CommonGwt {

        protected String hello(CharSequence name) {
            return "hello, " + name + " from client side";
        }
    }
}
