package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1264w0 {

    /* JADX INFO: renamed from: c */
    public static final C1264w0 f5502c = new C1264w0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f5504b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final C1225j0 f5503a = new C1225j0();

    /* JADX INFO: renamed from: a */
    public final InterfaceC1270z0 m4012a(Class cls) {
        InterfaceC1270z0 interfaceC1270z0M3973w;
        Class cls2;
        AbstractC1204c0.m3788a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f5504b;
        InterfaceC1270z0 interfaceC1270z0 = (InterfaceC1270z0) concurrentHashMap.get(cls);
        if (interfaceC1270z0 != null) {
            return interfaceC1270z0;
        }
        C1225j0 c1225j0 = this.f5503a;
        c1225j0.getClass();
        Class cls3 = AbstractC1199a1.f5350a;
        if (!AbstractC1269z.class.isAssignableFrom(cls) && (cls2 = AbstractC1199a1.f5350a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        C1268y0 c1268y0Mo3810a = ((C1222i0) c1225j0.f5411a).mo3810a(cls);
        int i13 = c1268y0Mo3810a.f5513d;
        AbstractC1197a abstractC1197a = c1268y0Mo3810a.f5510a;
        if ((i13 & 2) == 2) {
            if (AbstractC1269z.class.isAssignableFrom(cls)) {
                interfaceC1270z0M3973w = C1249r0.m4009j(AbstractC1199a1.f5352c, AbstractC1251s.f5471a, abstractC1197a);
            } else {
                AbstractC1211e1 abstractC1211e1 = AbstractC1199a1.f5351b;
                C1248r c1248r = AbstractC1251s.f5472b;
                if (c1248r == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                interfaceC1270z0M3973w = C1249r0.m4009j(abstractC1211e1, c1248r, abstractC1197a);
            }
        } else if (AbstractC1269z.class.isAssignableFrom(cls)) {
            C1248r c1248r2 = null;
            C1252s0 c1252s0 = AbstractC1255t0.f5477b;
            C1213f0 c1213f0 = AbstractC1216g0.f5397b;
            C1217g1 c1217g1 = AbstractC1199a1.f5352c;
            if (AbstractC12682p.m35485e(c1268y0Mo3810a.m4019a()) != 1) {
                c1248r2 = AbstractC1251s.f5471a;
            }
            C1248r c1248r3 = c1248r2;
            C1234m0 c1234m0 = AbstractC1237n0.f5446b;
            if (!(c1268y0Mo3810a instanceof C1268y0)) {
                int[] iArr = C1246q0.f5453n;
                c1268y0Mo3810a.getClass();
                throw new ClassCastException();
            }
            interfaceC1270z0M3973w = C1246q0.m3973w(c1268y0Mo3810a, c1252s0, c1213f0, c1217g1, c1248r3, c1234m0);
        } else {
            C1248r c1248r4 = null;
            C1252s0 c1252s1 = AbstractC1255t0.f5476a;
            C1213f0 c1213f1 = AbstractC1216g0.f5396a;
            AbstractC1211e1 abstractC1211e2 = AbstractC1199a1.f5351b;
            if (AbstractC12682p.m35485e(c1268y0Mo3810a.m4019a()) != 1 && (c1248r4 = AbstractC1251s.f5472b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            C1248r c1248r5 = c1248r4;
            C1234m0 c1234m1 = AbstractC1237n0.f5445a;
            if (!(c1268y0Mo3810a instanceof C1268y0)) {
                int[] iArr2 = C1246q0.f5453n;
                c1268y0Mo3810a.getClass();
                throw new ClassCastException();
            }
            interfaceC1270z0M3973w = C1246q0.m3973w(c1268y0Mo3810a, c1252s1, c1213f1, abstractC1211e2, c1248r5, c1234m1);
        }
        InterfaceC1270z0 interfaceC1270z1 = (InterfaceC1270z0) concurrentHashMap.putIfAbsent(cls, interfaceC1270z0M3973w);
        return interfaceC1270z1 != null ? interfaceC1270z1 : interfaceC1270z0M3973w;
    }
}
