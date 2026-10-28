package com.google.crypto.tink.internal;

import b23.C2342h;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import p075ct.C11105a;
import p154fs.AbstractC14733k;
import p505ts.AbstractC34132o;
import p692zt.C41113q;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.z */
/* JADX INFO: loaded from: classes.dex */
public final class C5121z {

    /* JADX INFO: renamed from: b */
    public static final C5121z f21474b;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f21475a = new AtomicReference(new C5111q0(new C41113q(5)));

    static {
        try {
            C5121z c5121z = new C5121z();
            c5121z.m16094d(new C5102m(C5110q.class, new C2342h(3)));
            f21474b = c5121z;
        } catch (Exception e5) {
            throw new TinkBugException(e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC34132o m16091a(C5099k0 c5099k0) throws GeneralSecurityException {
        C5111q0 c5111q0 = (C5111q0) this.f21475a.get();
        c5111q0.getClass();
        C5107o0 c5107o0 = new C5107o0(C5099k0.class, (C11105a) c5099k0.f21440y);
        HashMap map = c5111q0.f21457b;
        if (map.containsKey(c5107o0)) {
            return ((C5098k) map.get(c5107o0)).f21435b.mo7222e(c5099k0);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + c5107o0 + " available");
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC14733k m16092b(C5101l0 c5101l0) throws GeneralSecurityException {
        C5111q0 c5111q0 = (C5111q0) this.f21475a.get();
        c5111q0.getClass();
        C5107o0 c5107o0 = new C5107o0(C5101l0.class, (C11105a) c5101l0.f21443x);
        HashMap map = c5111q0.f21459d;
        if (map.containsKey(c5107o0)) {
            return ((C5081b0) map.get(c5107o0)).f21394b.mo7224g(c5101l0);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + c5107o0 + " available");
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m16093c(C5098k c5098k) {
        C41113q c41113q = new C41113q((C5111q0) this.f21475a.get());
        c41113q.m133450B(c5098k);
        this.f21475a.set(new C5111q0(c41113q));
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m16094d(C5102m c5102m) {
        C41113q c41113q = new C41113q((C5111q0) this.f21475a.get());
        c41113q.m133451C(c5102m);
        this.f21475a.set(new C5111q0(c41113q));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m16095e(C5081b0 c5081b0) {
        C41113q c41113q = new C41113q((C5111q0) this.f21475a.get());
        c41113q.m133452D(c5081b0);
        this.f21475a.set(new C5111q0(c41113q));
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m16096f(C5085d0 c5085d0) {
        C41113q c41113q = new C41113q((C5111q0) this.f21475a.get());
        c41113q.m133453E(c5085d0);
        this.f21475a.set(new C5111q0(c41113q));
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC5105n0 m16097g(AbstractC34132o abstractC34132o) throws GeneralSecurityException {
        C5111q0 c5111q0 = (C5111q0) this.f21475a.get();
        c5111q0.getClass();
        C5109p0 c5109p0 = new C5109p0(abstractC34132o.getClass(), C5099k0.class);
        HashMap map = c5111q0.f21456a;
        if (map.containsKey(c5109p0)) {
            return ((C5102m) map.get(c5109p0)).f21446b.mo7221d(abstractC34132o);
        }
        throw new GeneralSecurityException("No Key serializer for " + c5109p0 + " available");
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC5105n0 m16098h(AbstractC14733k abstractC14733k) throws GeneralSecurityException {
        C5111q0 c5111q0 = (C5111q0) this.f21475a.get();
        c5111q0.getClass();
        C5109p0 c5109p0 = new C5109p0(abstractC14733k.getClass(), C5101l0.class);
        HashMap map = c5111q0.f21458c;
        if (map.containsKey(c5109p0)) {
            return ((C5085d0) map.get(c5109p0)).f21406b.mo7220c(abstractC14733k);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + c5109p0 + " available");
    }
}
