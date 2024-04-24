package com.tugalsan.api.gwt.jdk.client;

import com.google.gwt.core.shared.GwtIncompatible;

public class TGS_GwtJdk {

    //UserHappy
    public static Common cmn() {
        return memoryHappy().cmn;
    }

    public static OnlyJreHappy jre() {
        return memoryHappy().jre;
    }

    public static OnlyGwtHappy gwt() {
        return memoryHappy().gwt;
    }

    //MemoryHappy
    private static TGS_GwtJdk memoryHappy() {
        if (holder == null) {
            holder = new TGS_GwtJdk();
        }
        return holder;
    }
    private static volatile TGS_GwtJdk holder = null;

    private TGS_GwtJdk() {

    }
    final public Common cmn = new Common();
    final public OnlyJreHappy jre = new OnlyJreHappy();
    final public OnlyGwtHappy gwt = new OnlyGwtHappy();

    //OnlyGwtHappy
    public static class OnlyGwtHappy {

        public static void onlyGwtCanUseMe() {
        }
    }

    //OnlyJreHappy
    public static class OnlyJreHappy {

        @GwtIncompatible
        public static void onlyJreCanUseMe() {
        }
    }

    //Common
    public static class Common extends CommonGwt {

        @Override
        @GwtIncompatible
        public String hello(CharSequence name) {
            return "Hello, %s from server side".formatted(name);
        }
    }

    //CommonGwt
    public static class CommonGwt {

        public String hello(CharSequence name) {
            return "hello, " + name + " from client side";
        }
    }
}
