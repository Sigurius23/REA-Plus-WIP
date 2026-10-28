package ud3;

import java.io.Closeable;
import java.io.EOFException;
import ne3.C26616h;
import ne3.C26621j0;
import ne3.InterfaceC26631o0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import zd3.C40563g;

/* JADX INFO: renamed from: ud3.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34850x0 implements Closeable {

    /* JADX INFO: renamed from: E */
    public final C34804c0 f146776E;

    /* JADX INFO: renamed from: F */
    public final C34807d0 f146777F;

    /* JADX INFO: renamed from: G */
    public final AbstractC34799a1 f146778G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC26631o0 f146779H;

    /* JADX INFO: renamed from: I */
    public final C34850x0 f146780I;

    /* JADX INFO: renamed from: J */
    public final C34850x0 f146781J;

    /* JADX INFO: renamed from: K */
    public final C34850x0 f146782K;

    /* JADX INFO: renamed from: L */
    public final long f146783L;

    /* JADX INFO: renamed from: M */
    public final long f146784M;

    /* JADX INFO: renamed from: N */
    public final C40563g f146785N;

    /* JADX INFO: renamed from: O */
    public final InterfaceC34808d1 f146786O;

    /* JADX INFO: renamed from: P */
    public C34817h f146787P;

    /* JADX INFO: renamed from: Q */
    public final boolean f146788Q;

    /* JADX INFO: renamed from: w */
    public final C34832o0 f146789w;

    /* JADX INFO: renamed from: x */
    public final EnumC34828m0 f146790x;

    /* JADX INFO: renamed from: y */
    public final String f146791y;

    /* JADX INFO: renamed from: z */
    public final int f146792z;

    public C34850x0(C34832o0 request, EnumC34828m0 protocol, String message, int i13, C34804c0 c34804c0, C34807d0 c34807d0, AbstractC34799a1 body, InterfaceC26631o0 interfaceC26631o0, C34850x0 c34850x0, C34850x0 c34850x1, C34850x0 c34850x2, long j7, long j13, C40563g c40563g, InterfaceC34808d1 trailersSource) {
        AbstractC22676k.m65750j(request, "request");
        AbstractC22676k.m65750j(protocol, "protocol");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(trailersSource, "trailersSource");
        this.f146789w = request;
        this.f146790x = protocol;
        this.f146791y = message;
        this.f146792z = i13;
        this.f146776E = c34804c0;
        this.f146777F = c34807d0;
        this.f146778G = body;
        this.f146779H = interfaceC26631o0;
        this.f146780I = c34850x0;
        this.f146781J = c34850x1;
        this.f146782K = c34850x2;
        this.f146783L = j7;
        this.f146784M = j13;
        this.f146785N = c40563g;
        this.f146786O = trailersSource;
        boolean z4 = false;
        if (200 <= i13 && i13 < 300) {
            z4 = true;
        }
        this.f146788Q = z4;
    }

    /* JADX INFO: renamed from: b */
    public final C34817h m109932b() {
        C34817h c34817h = this.f146787P;
        if (c34817h != null) {
            return c34817h;
        }
        C34817h c34817h2 = C34817h.f146574n;
        C34817h c34817hM92093O = AbstractC30060g.m92093O(this.f146777F);
        this.f146787P = c34817hM92093O;
        return c34817hM92093O;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f146778G.close();
    }

    /* JADX INFO: renamed from: h */
    public final C34848w0 m109933h() {
        C34848w0 c34848w0 = new C34848w0();
        c34848w0.f146763c = -1;
        c34848w0.f146767g = AbstractC34799a1.f146522x;
        c34848w0.f146775o = InterfaceC34808d1.f146549A;
        c34848w0.f146761a = this.f146789w;
        c34848w0.f146762b = this.f146790x;
        c34848w0.f146763c = this.f146792z;
        c34848w0.f146764d = this.f146791y;
        c34848w0.f146765e = this.f146776E;
        c34848w0.f146766f = this.f146777F.m109865d();
        c34848w0.f146767g = this.f146778G;
        c34848w0.f146768h = this.f146779H;
        c34848w0.f146769i = this.f146780I;
        c34848w0.f146770j = this.f146781J;
        c34848w0.f146771k = this.f146782K;
        c34848w0.f146772l = this.f146783L;
        c34848w0.f146773m = this.f146784M;
        c34848w0.f146774n = this.f146785N;
        c34848w0.f146775o = this.f146786O;
        return c34848w0;
    }

    /* JADX INFO: renamed from: i */
    public final C34854z0 m109934i(long j7) throws EOFException {
        AbstractC34799a1 abstractC34799a1 = this.f146778G;
        C26621j0 c26621j0Peek = abstractC34799a1.mo1940d1().peek();
        C26616h c26616h = new C26616h();
        c26621j0Peek.request(j7);
        long jMin = Math.min(j7, c26621j0Peek.f105872x.f105866x);
        while (jMin > 0) {
            long jMo9164h1 = c26621j0Peek.mo9164h1(c26616h, jMin);
            if (jMo9164h1 == -1) {
                throw new EOFException();
            }
            jMin -= jMo9164h1;
        }
        C34854z0 c34854z0 = AbstractC34799a1.f146522x;
        return new C34854z0(abstractC34799a1.mo1942k(), c26616h.f105866x, c26616h);
    }

    public final String toString() {
        return "Response{protocol=" + this.f146790x + ", code=" + this.f146792z + ", message=" + this.f146791y + ", url=" + this.f146789w.f146712a + '}';
    }
}
