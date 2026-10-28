package com.scottyab.rootbeer;

import p048ce.AbstractC4482w;

/* JADX INFO: loaded from: classes6.dex */
public class RootBeerNative {

    /* JADX INFO: renamed from: a */
    public static final boolean f22074a;

    static {
        try {
            System.loadLibrary("toolChecker");
            f22074a = true;
        } catch (UnsatisfiedLinkError e5) {
            AbstractC4482w.m13971G(e5);
        }
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z4);
}
