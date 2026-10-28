package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.x0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5185x0 {

    /* JADX INFO: renamed from: c */
    public static final C5185x0 f21595c = new C5185x0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f21597b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final C5153k0 f21596a = new C5153k0();

    /* JADX INFO: renamed from: a */
    public static C5185x0 m16370a() {
        return f21595c;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC5124a1 m16371b(Class cls) {
        InterfaceC5124a1 interfaceC5124a1M16317z;
        Class cls2;
        AbstractC5126b0.m16123a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f21597b;
        InterfaceC5124a1 interfaceC5124a1 = (InterfaceC5124a1) concurrentHashMap.get(cls);
        if (interfaceC5124a1 != null) {
            return interfaceC5124a1;
        }
        C5153k0 c5153k0 = this.f21596a;
        c5153k0.getClass();
        Class cls3 = AbstractC5127b1.f21481a;
        if (!AbstractC5184x.class.isAssignableFrom(cls) && (cls2 = AbstractC5127b1.f21481a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        C5189z0 c5189z0Mo16184a = ((C5150j0) c5153k0.f21535a).mo16184a(cls);
        int i13 = c5189z0Mo16184a.f21604d;
        AbstractC5122a abstractC5122a = c5189z0Mo16184a.f21601a;
        if ((i13 & 2) == 2) {
            if (AbstractC5184x.class.isAssignableFrom(cls)) {
                interfaceC5124a1M16317z = new C5175s0(AbstractC5127b1.f21483c, AbstractC5172r.f21564a, abstractC5122a);
            } else {
                AbstractC5130c1 abstractC5130c1 = AbstractC5127b1.f21482b;
                C5170q c5170q = AbstractC5172r.f21565b;
                if (c5170q == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                interfaceC5124a1M16317z = new C5175s0(abstractC5130c1, c5170q, abstractC5122a);
            }
        } else if (AbstractC5184x.class.isAssignableFrom(cls)) {
            interfaceC5124a1M16317z = AbstractC12682p.m35485e(c5189z0Mo16184a.m16376a()) != 1 ? C5173r0.m16317z(c5189z0Mo16184a, AbstractC5179u0.f21592b, AbstractC5144h0.f21512b, AbstractC5127b1.f21483c, AbstractC5172r.f21564a, AbstractC5162n0.f21557b) : C5173r0.m16317z(c5189z0Mo16184a, AbstractC5179u0.f21592b, AbstractC5144h0.f21512b, AbstractC5127b1.f21483c, null, AbstractC5162n0.f21557b);
        } else if (AbstractC12682p.m35485e(c5189z0Mo16184a.m16376a()) != 1) {
            C5177t0 c5177t0 = AbstractC5179u0.f21591a;
            C5138f0 c5138f0 = AbstractC5144h0.f21511a;
            AbstractC5130c1 abstractC5130c2 = AbstractC5127b1.f21482b;
            C5170q c5170q2 = AbstractC5172r.f21565b;
            if (c5170q2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            interfaceC5124a1M16317z = C5173r0.m16317z(c5189z0Mo16184a, c5177t0, c5138f0, abstractC5130c2, c5170q2, AbstractC5162n0.f21556a);
        } else {
            interfaceC5124a1M16317z = C5173r0.m16317z(c5189z0Mo16184a, AbstractC5179u0.f21591a, AbstractC5144h0.f21511a, AbstractC5127b1.f21482b, null, AbstractC5162n0.f21556a);
        }
        InterfaceC5124a1 interfaceC5124a2 = (InterfaceC5124a1) concurrentHashMap.putIfAbsent(cls, interfaceC5124a1M16317z);
        return interfaceC5124a2 != null ? interfaceC5124a2 : interfaceC5124a1M16317z;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC5124a1 m16372c(Object obj) {
        return m16371b(obj.getClass());
    }
}
