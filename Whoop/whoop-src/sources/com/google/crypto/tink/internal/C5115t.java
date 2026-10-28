package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import p154fs.AbstractC14733k;
import p505ts.AbstractC34132o;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.t */
/* JADX INFO: loaded from: classes.dex */
public final class C5115t {

    /* JADX INFO: renamed from: b */
    public static final C5115t f21463b;

    /* JADX INFO: renamed from: a */
    public final HashMap f21464a = new HashMap();

    static {
        C5114s c5114s = new C5114s(0);
        C5115t c5115t = new C5115t();
        try {
            c5115t.m16081a(c5114s, C5112r.class);
            f21463b = c5115t;
        } catch (GeneralSecurityException e5) {
            throw new IllegalStateException("unexpected error.", e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m16081a(C5114s c5114s, Class cls) {
        try {
            C5114s c5114s2 = (C5114s) this.f21464a.get(cls);
            if (c5114s2 != null && !c5114s2.equals(c5114s)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls + " already inserted");
            }
            this.f21464a.put(cls, c5114s);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC34132o m16082b(AbstractC14733k abstractC14733k) {
        AbstractC34132o abstractC34132oM16080a;
        synchronized (this) {
            C5114s c5114s = (C5114s) this.f21464a.get(abstractC14733k.getClass());
            if (c5114s == null) {
                throw new GeneralSecurityException("Cannot create a new key for parameters " + abstractC14733k + ": no key creator for this class was registered.");
            }
            abstractC34132oM16080a = c5114s.m16080a(abstractC14733k);
        }
        return abstractC34132oM16080a;
    }
}
