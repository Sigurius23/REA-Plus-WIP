package androidx.health.platform.client.proto;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.g1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1465g1 {

    /* JADX INFO: renamed from: b */
    public static final C1519r0 f6041b = new C1519r0(1);

    /* JADX INFO: renamed from: a */
    public final Object f6042a;

    public C1465g1(C1483k c1483k) {
        Charset charset = AbstractC1549x0.f6150a;
        if (c1483k == null) {
            throw new NullPointerException("output");
        }
        this.f6042a = c1483k;
        c1483k.f6058c = this;
    }

    /* JADX INFO: renamed from: a */
    public void m4624a(int i13, C1468h c1468h) {
        C1483k c1483k = (C1483k) this.f6042a;
        c1483k.m4673O(i13, 2);
        c1483k.m4666H(c1468h);
    }

    /* JADX INFO: renamed from: b */
    public void m4625b(int i13, Object obj, InterfaceC1536u2 interfaceC1536u2) throws CodedOutputStream$OutOfSpaceException {
        C1483k c1483k = (C1483k) this.f6042a;
        c1483k.m4673O(i13, 3);
        interfaceC1536u2.mo4771h((AbstractC1433a) obj, c1483k.f6058c);
        c1483k.m4673O(i13, 4);
    }

    /* JADX INFO: renamed from: c */
    public void m4626c(int i13, Object obj, InterfaceC1536u2 interfaceC1536u2) throws CodedOutputStream$OutOfSpaceException {
        C1483k c1483k = (C1483k) this.f6042a;
        AbstractC1433a abstractC1433a = (AbstractC1433a) obj;
        c1483k.m4673O(i13, 2);
        c1483k.m4674P(abstractC1433a.mo4563b(interfaceC1536u2));
        interfaceC1536u2.mo4771h(abstractC1433a, c1483k.f6058c);
    }

    public C1465g1() {
        InterfaceC1495m1 interfaceC1495m1;
        try {
            interfaceC1495m1 = (InterfaceC1495m1) Class.forName("androidx.health.platform.client.proto.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC1495m1 = f6041b;
        }
        InterfaceC1495m1[] interfaceC1495m1Arr = {C1519r0.f6108b, interfaceC1495m1};
        C1460f1 c1460f1 = new C1460f1();
        c1460f1.f6038a = interfaceC1495m1Arr;
        Charset charset = AbstractC1549x0.f6150a;
        this.f6042a = c1460f1;
    }
}
