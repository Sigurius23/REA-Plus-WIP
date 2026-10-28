package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import p581we.C37199o;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5088f {

    /* JADX INFO: renamed from: a */
    public HashMap f21414a;

    /* JADX INFO: renamed from: b */
    public HashMap f21415b;

    public C5088f(C5095i0 c5095i0) {
        this.f21414a = new HashMap(c5095i0.f21423a);
        this.f21415b = new HashMap(c5095i0.f21424b);
    }

    /* JADX INFO: renamed from: a */
    public void m15967a(Enum r10, Object obj) {
        this.f21414a.put(r10, obj);
        this.f21415b.put(obj, r10);
    }

    /* JADX INFO: renamed from: b */
    public C37199o m15968b() {
        return new C37199o(Collections.unmodifiableMap(this.f21414a), Collections.unmodifiableMap(this.f21415b));
    }

    /* JADX INFO: renamed from: c */
    public void m15969c(C5089f0 c5089f0) throws GeneralSecurityException {
        HashMap map = this.f21414a;
        if (c5089f0 == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        C5093h0 c5093h0 = new C5093h0(c5089f0.f21416a, c5089f0.f21417b);
        if (!map.containsKey(c5093h0)) {
            map.put(c5093h0, c5089f0);
            return;
        }
        C5089f0 c5089f1 = (C5089f0) map.get(c5093h0);
        if (c5089f1.equals(c5089f0) && c5089f0.equals(c5089f1)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + c5093h0);
    }
}
