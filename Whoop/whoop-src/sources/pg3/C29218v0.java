package pg3;

import java.util.ArrayList;
import java.util.Objects;
import p031b9.AbstractC2875y;
import ud3.AbstractC34799a1;
import ud3.C34807d0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.C34854z0;
import ud3.EnumC34828m0;
import ud3.InterfaceC34808d1;

/* JADX INFO: renamed from: pg3.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29218v0<T> {

    /* JADX INFO: renamed from: a */
    public final C34850x0 f118269a;

    /* JADX INFO: renamed from: b */
    public final Object f118270b;

    /* JADX INFO: renamed from: c */
    public final AbstractC34799a1 f118271c;

    public C29218v0(C34850x0 c34850x0, Object obj, AbstractC34799a1 abstractC34799a1) {
        this.f118269a = c34850x0;
        this.f118270b = obj;
        this.f118271c = abstractC34799a1;
    }

    /* JADX INFO: renamed from: a */
    public static C29218v0 m88723a(int i13, AbstractC34799a1 abstractC34799a1) {
        Objects.requireNonNull(abstractC34799a1, "body == null");
        if (i13 < 400) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "code < 400: "));
        }
        C34854z0 c34854z0 = AbstractC34799a1.f146522x;
        ArrayList arrayList = new ArrayList(20);
        C29171a0 c29171a0 = new C29171a0(abstractC34799a1.mo1942k(), abstractC34799a1.mo1941i());
        EnumC34828m0 enumC34828m0 = EnumC34828m0.HTTP_1_1;
        C34830n0 c34830n0 = new C34830n0();
        c34830n0.m109905f("http://localhost/");
        C34832o0 c34832o0 = new C34832o0(c34830n0);
        if (i13 >= 0) {
            return m88724b(abstractC34799a1, new C34850x0(c34832o0, enumC34828m0, "Response.error()", i13, null, new C34807d0((String[]) arrayList.toArray(new String[0])), c29171a0, null, null, null, null, 0L, 0L, null, InterfaceC34808d1.f146549A));
        }
        throw new IllegalStateException(AbstractC2875y.m8295h(i13, "code < 0: ").toString());
    }

    /* JADX INFO: renamed from: b */
    public static C29218v0 m88724b(AbstractC34799a1 abstractC34799a1, C34850x0 c34850x0) {
        Objects.requireNonNull(abstractC34799a1, "body == null");
        if (c34850x0.f146788Q) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new C29218v0(c34850x0, null, abstractC34799a1);
    }

    /* JADX INFO: renamed from: c */
    public static C29218v0 m88725c(Object obj) {
        C34854z0 c34854z0 = AbstractC34799a1.f146522x;
        ArrayList arrayList = new ArrayList(20);
        EnumC34828m0 enumC34828m0 = EnumC34828m0.HTTP_1_1;
        C34830n0 c34830n0 = new C34830n0();
        c34830n0.m109905f("http://localhost/");
        return m88726d(obj, new C34850x0(new C34832o0(c34830n0), enumC34828m0, "OK", 200, null, new C34807d0((String[]) arrayList.toArray(new String[0])), c34854z0, null, null, null, null, 0L, 0L, null, InterfaceC34808d1.f146549A));
    }

    /* JADX INFO: renamed from: d */
    public static C29218v0 m88726d(Object obj, C34850x0 c34850x0) {
        if (c34850x0.f146788Q) {
            return new C29218v0(c34850x0, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final String toString() {
        return this.f118269a.toString();
    }
}
