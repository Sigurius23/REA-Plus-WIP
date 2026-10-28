package androidx.health.platform.client.proto;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.y1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1554y1 {

    /* JADX INFO: renamed from: c */
    public static final C1554y1 f6164c = new C1554y1();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f6166b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final C1465g1 f6165a = new C1465g1();

    /* JADX INFO: renamed from: a */
    public final InterfaceC1536u2 m4946a(Class cls) {
        InterfaceC1536u2 interfaceC1536u2M4740A;
        Class cls2;
        Charset charset = AbstractC1549x0.f6150a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f6166b;
        InterfaceC1536u2 interfaceC1536u2 = (InterfaceC1536u2) concurrentHashMap.get(cls);
        if (interfaceC1536u2 != null) {
            return interfaceC1536u2;
        }
        C1465g1 c1465g1 = this.f6165a;
        c1465g1.getClass();
        Class cls3 = AbstractC1541v2.f6122a;
        if (!AbstractC1534u0.class.isAssignableFrom(cls) && (cls2 = AbstractC1541v2.f6122a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        C1436a2 c1436a2Mo4607a = ((C1460f1) c1465g1.f6042a).mo4607a(cls);
        int i13 = c1436a2Mo4607a.f6017d;
        AbstractC1433a abstractC1433a = c1436a2Mo4607a.f6014a;
        if ((i13 & 2) == 2) {
            if (AbstractC1534u0.class.isAssignableFrom(cls)) {
                interfaceC1536u2M4740A = new C1510p1(AbstractC1541v2.f6125d, AbstractC1499n0.f6070a, abstractC1433a);
            } else {
                AbstractC1452d3 abstractC1452d3 = AbstractC1541v2.f6123b;
                C1494m0 c1494m0 = AbstractC1499n0.f6071b;
                if (c1494m0 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                interfaceC1536u2M4740A = new C1510p1(abstractC1452d3, c1494m0, abstractC1433a);
            }
        } else if (AbstractC1534u0.class.isAssignableFrom(cls)) {
            interfaceC1536u2M4740A = (c1436a2Mo4607a.f6017d & 1) == 1 ? C1505o1.m4740A(c1436a2Mo4607a, AbstractC1520r1.f6111b, AbstractC1450d1.f6030b, AbstractC1541v2.f6125d, AbstractC1499n0.f6070a, AbstractC1490l1.f6068b) : C1505o1.m4740A(c1436a2Mo4607a, AbstractC1520r1.f6111b, AbstractC1450d1.f6030b, AbstractC1541v2.f6125d, null, AbstractC1490l1.f6068b);
        } else if ((c1436a2Mo4607a.f6017d & 1) == 1) {
            C1515q1 c1515q1 = AbstractC1520r1.f6110a;
            C1440b1 c1440b1 = AbstractC1450d1.f6029a;
            AbstractC1452d3 abstractC1452d4 = AbstractC1541v2.f6123b;
            C1494m0 c1494m1 = AbstractC1499n0.f6071b;
            if (c1494m1 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            interfaceC1536u2M4740A = C1505o1.m4740A(c1436a2Mo4607a, c1515q1, c1440b1, abstractC1452d4, c1494m1, AbstractC1490l1.f6067a);
        } else {
            interfaceC1536u2M4740A = C1505o1.m4740A(c1436a2Mo4607a, AbstractC1520r1.f6110a, AbstractC1450d1.f6029a, AbstractC1541v2.f6124c, null, AbstractC1490l1.f6067a);
        }
        InterfaceC1536u2 interfaceC1536u3 = (InterfaceC1536u2) concurrentHashMap.putIfAbsent(cls, interfaceC1536u2M4740A);
        return interfaceC1536u3 != null ? interfaceC1536u3 : interfaceC1536u2M4740A;
    }
}
