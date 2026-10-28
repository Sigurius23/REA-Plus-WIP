package androidx.glance.appwidget.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1430y0 {

    /* JADX INFO: renamed from: c */
    public static final C1430y0 f5993c = new C1430y0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f5995b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final C1404m0 f5994a = new C1404m0();

    /* JADX INFO: renamed from: a */
    public final InterfaceC1372b1 m4555a(Class cls) {
        InterfaceC1372b1 interfaceC1372b1M4520z;
        Class cls2;
        AbstractC1383f0.m4333a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f5995b;
        InterfaceC1372b1 interfaceC1372b1 = (InterfaceC1372b1) concurrentHashMap.get(cls);
        if (interfaceC1372b1 != null) {
            return interfaceC1372b1;
        }
        C1404m0 c1404m0 = this.f5994a;
        c1404m0.getClass();
        Class cls3 = AbstractC1375c1.f5873a;
        if (!AbstractC1368a0.class.isAssignableFrom(cls) && (cls2 = AbstractC1375c1.f5873a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        C1369a1 c1369a1Mo4434a = ((C1401l0) c1404m0.f5942a).mo4434a(cls);
        int i13 = c1369a1Mo4434a.f5866d;
        AbstractC1367a abstractC1367a = c1369a1Mo4434a.f5863a;
        if ((i13 & 2) == 2) {
            if (AbstractC1368a0.class.isAssignableFrom(cls)) {
                interfaceC1372b1M4520z = new C1420t0(AbstractC1375c1.f5875c, AbstractC1421u.f5980a, abstractC1367a);
            } else {
                AbstractC1378d1 abstractC1378d1 = AbstractC1375c1.f5874b;
                C1419t c1419t = AbstractC1421u.f5981b;
                if (c1419t == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                interfaceC1372b1M4520z = new C1420t0(abstractC1378d1, c1419t, abstractC1367a);
            }
        } else if (AbstractC1368a0.class.isAssignableFrom(cls)) {
            C1419t c1419t2 = null;
            C1422u0 c1422u0 = AbstractC1424v0.f5988b;
            C1392i0 c1392i0 = AbstractC1395j0.f5916b;
            C1384f1 c1384f1 = AbstractC1375c1.f5875c;
            if (AbstractC12682p.m35485e(c1369a1Mo4434a.m4281a()) != 1) {
                c1419t2 = AbstractC1421u.f5980a;
            }
            C1419t c1419t3 = c1419t2;
            C1410o0 c1410o0 = AbstractC1412p0.f5957b;
            if (!(c1369a1Mo4434a instanceof C1369a1)) {
                int[] iArr = C1418s0.f5962n;
                c1369a1Mo4434a.getClass();
                throw new ClassCastException();
            }
            interfaceC1372b1M4520z = C1418s0.m4520z(c1369a1Mo4434a, c1422u0, c1392i0, c1384f1, c1419t3, c1410o0);
        } else {
            C1419t c1419t4 = null;
            C1422u0 c1422u1 = AbstractC1424v0.f5987a;
            C1392i0 c1392i1 = AbstractC1395j0.f5915a;
            AbstractC1378d1 abstractC1378d2 = AbstractC1375c1.f5874b;
            if (AbstractC12682p.m35485e(c1369a1Mo4434a.m4281a()) != 1 && (c1419t4 = AbstractC1421u.f5981b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C1419t c1419t5 = c1419t4;
            C1410o0 c1410o1 = AbstractC1412p0.f5956a;
            if (!(c1369a1Mo4434a instanceof C1369a1)) {
                int[] iArr2 = C1418s0.f5962n;
                c1369a1Mo4434a.getClass();
                throw new ClassCastException();
            }
            interfaceC1372b1M4520z = C1418s0.m4520z(c1369a1Mo4434a, c1422u1, c1392i1, abstractC1378d2, c1419t5, c1410o1);
        }
        InterfaceC1372b1 interfaceC1372b2 = (InterfaceC1372b1) concurrentHashMap.putIfAbsent(cls, interfaceC1372b1M4520z);
        return interfaceC1372b2 != null ? interfaceC1372b2 : interfaceC1372b1M4520z;
    }
}
