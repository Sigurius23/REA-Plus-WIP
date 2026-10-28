package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC11266d;
import p154fs.InterfaceC14734l;
import p505ts.AbstractC34132o;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.y */
/* JADX INFO: loaded from: classes.dex */
public final class C5120y {

    /* JADX INFO: renamed from: b */
    public static final C5120y f21472b = new C5120y();

    /* JADX INFO: renamed from: a */
    public final AtomicReference f21473a;

    public C5120y() {
        C5088f c5088f = new C5088f();
        c5088f.f21414a = new HashMap();
        c5088f.f21415b = new HashMap();
        this.f21473a = new AtomicReference(new C5095i0(c5088f));
    }

    /* JADX INFO: renamed from: a */
    public final Class m16087a(Class cls) {
        HashMap map = ((C5095i0) this.f21473a.get()).f21424b;
        if (map.containsKey(cls)) {
            return ((InterfaceC14734l) map.get(cls)).mo42238a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    /* JADX INFO: renamed from: b */
    public final Object m16088b(AbstractC34132o abstractC34132o, Class cls) {
        C5095i0 c5095i0 = (C5095i0) this.f21473a.get();
        c5095i0.getClass();
        C5093h0 c5093h0 = new C5093h0(abstractC34132o.getClass(), cls);
        HashMap map = c5095i0.f21423a;
        if (map.containsKey(c5093h0)) {
            return ((C5089f0) map.get(c5093h0)).f21418c.mo7225h(abstractC34132o);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + c5093h0 + " available");
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m16089c(C5089f0 c5089f0) {
        C5088f c5088f = new C5088f((C5095i0) this.f21473a.get());
        c5088f.m15969c(c5089f0);
        this.f21473a.set(new C5095i0(c5088f));
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m16090d(InterfaceC14734l interfaceC14734l) {
        C5088f c5088f = new C5088f((C5095i0) this.f21473a.get());
        HashMap map = c5088f.f21415b;
        Class clsMo42239b = interfaceC14734l.mo42239b();
        if (map.containsKey(clsMo42239b)) {
            InterfaceC14734l interfaceC14734l2 = (InterfaceC14734l) map.get(clsMo42239b);
            if (!interfaceC14734l2.equals(interfaceC14734l) || !interfaceC14734l.equals(interfaceC14734l2)) {
                throw new GeneralSecurityException(AbstractC11266d.m30459m(clsMo42239b, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"));
            }
        } else {
            map.put(clsMo42239b, interfaceC14734l);
        }
        this.f21473a.set(new C5095i0(c5088f));
    }
}
