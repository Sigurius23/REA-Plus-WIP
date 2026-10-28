package ud3;

import ne3.InterfaceC26631o0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import zd3.C40563g;

/* JADX INFO: renamed from: ud3.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34848w0 {

    /* JADX INFO: renamed from: a */
    public C34832o0 f146761a;

    /* JADX INFO: renamed from: b */
    public EnumC34828m0 f146762b;

    /* JADX INFO: renamed from: d */
    public String f146764d;

    /* JADX INFO: renamed from: e */
    public C34804c0 f146765e;

    /* JADX INFO: renamed from: h */
    public InterfaceC26631o0 f146768h;

    /* JADX INFO: renamed from: i */
    public C34850x0 f146769i;

    /* JADX INFO: renamed from: j */
    public C34850x0 f146770j;

    /* JADX INFO: renamed from: k */
    public C34850x0 f146771k;

    /* JADX INFO: renamed from: l */
    public long f146772l;

    /* JADX INFO: renamed from: m */
    public long f146773m;

    /* JADX INFO: renamed from: n */
    public C40563g f146774n;

    /* JADX INFO: renamed from: c */
    public int f146763c = -1;

    /* JADX INFO: renamed from: g */
    public AbstractC34799a1 f146767g = AbstractC34799a1.f146522x;

    /* JADX INFO: renamed from: o */
    public InterfaceC34808d1 f146775o = InterfaceC34808d1.f146549A;

    /* JADX INFO: renamed from: f */
    public C22677k0 f146766f = new C22677k0(2, false);

    /* JADX INFO: renamed from: b */
    public static void m109929b(C34850x0 c34850x0, String str) {
        if (c34850x0 != null) {
            if (c34850x0.f146780I != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (c34850x0.f146781J != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (c34850x0.f146782K != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C34850x0 m109930a() {
        int i13 = this.f146763c;
        if (i13 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f146763c).toString());
        }
        C34832o0 c34832o0 = this.f146761a;
        if (c34832o0 == null) {
            throw new IllegalStateException("request == null");
        }
        EnumC34828m0 enumC34828m0 = this.f146762b;
        if (enumC34828m0 == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f146764d;
        if (str != null) {
            return new C34850x0(c34832o0, enumC34828m0, str, i13, this.f146765e, this.f146766f.m65766g(), this.f146767g, this.f146768h, this.f146769i, this.f146770j, this.f146771k, this.f146772l, this.f146773m, this.f146774n, this.f146775o);
        }
        throw new IllegalStateException("message == null");
    }

    /* JADX INFO: renamed from: c */
    public final void m109931c(C34807d0 headers) {
        AbstractC22676k.m65750j(headers, "headers");
        this.f146766f = headers.m109865d();
    }
}
