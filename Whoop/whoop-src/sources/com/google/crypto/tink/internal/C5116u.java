package com.google.crypto.tink.internal;

import gs.C16135h;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.u */
/* JADX INFO: loaded from: classes.dex */
public final class C5116u {

    /* JADX INFO: renamed from: b */
    public static final C5116u f21465b = new C5116u();

    /* JADX INFO: renamed from: a */
    public final HashMap f21466a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final synchronized void m16083a(C16135h c16135h, Class cls) {
        try {
            C16135h c16135h2 = (C16135h) this.f21466a.get(cls);
            if (c16135h2 != null && !c16135h2.equals(c16135h)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f21466a.put(cls, c16135h);
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
