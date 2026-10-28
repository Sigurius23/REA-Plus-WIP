package com.google.crypto.tink.internal;

import ih0.AbstractC18489d0;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5096j {

    /* JADX INFO: renamed from: c */
    public static final Logger f21425c = Logger.getLogger(C5096j.class.getName());

    /* JADX INFO: renamed from: d */
    public static final C5096j f21426d;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap f21427a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f21428b;

    static {
        C5096j c5096j = new C5096j();
        c5096j.f21427a = new ConcurrentHashMap();
        c5096j.f21428b = new ConcurrentHashMap();
        f21426d = c5096j;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C5108p m15971a(String str) {
        if (!this.f21427a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (C5108p) this.f21427a.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m15972b(C5108p c5108p, boolean z4) {
        try {
            String str = c5108p.f21450a;
            if (z4 && this.f21428b.containsKey(str) && !((Boolean) this.f21428b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            C5108p c5108p2 = (C5108p) this.f21427a.get(str);
            if (c5108p2 != null && !c5108p2.getClass().equals(c5108p.getClass())) {
                f21425c.warning("Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + c5108p2.getClass().getName() + ", cannot be re-registered with " + c5108p.getClass().getName());
            }
            this.f21427a.putIfAbsent(str, c5108p);
            this.f21428b.put(str, Boolean.valueOf(z4));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m15973c(C5108p c5108p, boolean z4) {
        m15974d(c5108p, 1, z4);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m15974d(C5108p c5108p, int i13, boolean z4) {
        try {
            if (!(i13 != 1 ? AbstractC18489d0.m53361b(i13) : AbstractC18489d0.m53360a(i13))) {
                throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
            }
            m15972b(c5108p, z4);
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
