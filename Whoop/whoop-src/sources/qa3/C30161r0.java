package qa3;

import java.io.IOException;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import wa3.AbstractC36990e;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36988d;
import wa3.C36992f;
import wa3.C36994g;
import wa3.C37016s;
import wa3.C37018u;
import wa3.InterfaceC37017t;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: qa3.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C30161r0 extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: E */
    public static final C30161r0 f123405E;

    /* JADX INFO: renamed from: F */
    public static final C30115a f123406F = new C30115a(13);

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f123407w;

    /* JADX INFO: renamed from: x */
    public InterfaceC37017t f123408x;

    /* JADX INFO: renamed from: y */
    public byte f123409y;

    /* JADX INFO: renamed from: z */
    public int f123410z;

    static {
        C30161r0 c30161r0 = new C30161r0();
        f123405E = c30161r0;
        c30161r0.f123408x = C37016s.f158385x;
    }

    public C30161r0() {
        this.f123409y = (byte) -1;
        this.f123410z = -1;
        this.f123407w = AbstractC36990e.f158321w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        if (this.f123409y == 1) {
            return true;
        }
        this.f123409y = (byte) 1;
        return true;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30149l0 c30149l0M92326j = C30149l0.m92326j();
        c30149l0M92326j.m92331p(this);
        return c30149l0M92326j;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123410z;
        if (i13 != -1) {
            return i13;
        }
        int size = 0;
        for (int i14 = 0; i14 < this.f123408x.size(); i14++) {
            AbstractC36990e abstractC36990eMo118814b0 = this.f123408x.mo118814b0(i14);
            size += abstractC36990eMo118814b0.size() + C36994g.m118781f(abstractC36990eMo118814b0.size());
        }
        int size2 = this.f123407w.size() + this.f123408x.size() + size;
        this.f123410z = size2;
        return size2;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30149l0.m92326j();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        for (int i13 = 0; i13 < this.f123408x.size(); i13++) {
            AbstractC36990e abstractC36990eMo118814b0 = this.f123408x.mo118814b0(i13);
            c36994g.m118799x(1, 2);
            c36994g.m118797v(abstractC36990eMo118814b0.size());
            c36994g.m118793r(abstractC36990eMo118814b0);
        }
        c36994g.m118793r(this.f123407w);
    }

    public C30161r0(C30149l0 c30149l0) {
        this.f123409y = (byte) -1;
        this.f123410z = -1;
        this.f123407w = c30149l0.f158353w;
    }

    public C30161r0(C36992f c36992f) {
        this.f123409y = (byte) -1;
        this.f123410z = -1;
        this.f123408x = C37016s.f158385x;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        boolean z4 = false;
        boolean z13 = false;
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    if (iM118769o != 0) {
                        if (iM118769o != 10) {
                            if (!c36992f.m118772r(iM118769o, c36994gM118784j)) {
                            }
                        } else {
                            C37018u c37018uM118760f = c36992f.m118760f();
                            if (!z13) {
                                this.f123408x = new C37016s();
                                z13 = true;
                            }
                            this.f123408x.mo118812S0(c37018uM118760f);
                        }
                    }
                    z4 = true;
                } catch (Throwable th3) {
                    if (z13) {
                        this.f123408x = this.f123408x.mo118815k();
                    }
                    try {
                        c36994gM118784j.m118785i();
                    } catch (IOException unused) {
                    } finally {
                        this.f123407w = c36988d.m118737i();
                    }
                    throw th3;
                }
            } catch (InvalidProtocolBufferException e5) {
                e5.f89345w = this;
                throw e5;
            } catch (IOException e13) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                invalidProtocolBufferException.f89345w = this;
                throw invalidProtocolBufferException;
            }
        }
        if (z13) {
            this.f123408x = this.f123408x.mo118815k();
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123407w = c36988d.m118737i();
        }
    }
}
