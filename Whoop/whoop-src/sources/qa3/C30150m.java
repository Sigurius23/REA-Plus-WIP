package qa3;

import java.io.IOException;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import wa3.AbstractC36990e;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36988d;
import wa3.C36992f;
import wa3.C36994g;
import wa3.C37018u;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: qa3.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C30150m extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: G */
    public static final C30150m f123339G;

    /* JADX INFO: renamed from: H */
    public static final C30148l f123340H = new C30148l(0);

    /* JADX INFO: renamed from: E */
    public byte f123341E;

    /* JADX INFO: renamed from: F */
    public int f123342F;

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f123343w;

    /* JADX INFO: renamed from: x */
    public int f123344x;

    /* JADX INFO: renamed from: y */
    public int f123345y;

    /* JADX INFO: renamed from: z */
    public C37018u f123346z;

    static {
        C30150m c30150m = new C30150m();
        f123339G = c30150m;
        c30150m.f123345y = 0;
        c30150m.f123346z = AbstractC36990e.f158321w;
    }

    public C30150m() {
        this.f123341E = (byte) -1;
        this.f123342F = -1;
        this.f123343w = AbstractC36990e.f158321w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123341E;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i13 = this.f123344x;
        if ((i13 & 1) != 1) {
            this.f123341E = (byte) 0;
            return false;
        }
        if ((i13 & 2) == 2) {
            this.f123341E = (byte) 1;
            return true;
        }
        this.f123341E = (byte) 0;
        return false;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30118b c30118bM92275j = C30118b.m92275j();
        c30118bM92275j.m92283p(this);
        return c30118bM92275j;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123342F;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f123344x & 1) == 1 ? C36994g.m118777b(1, this.f123345y) : 0;
        if ((this.f123344x & 2) == 2) {
            C37018u c37018u = this.f123346z;
            iM118777b += c37018u.size() + C36994g.m118781f(c37018u.size()) + C36994g.m118783h(2);
        }
        int size = this.f123343w.size() + iM118777b;
        this.f123342F = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30118b.m92275j();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        if ((this.f123344x & 1) == 1) {
            c36994g.m118788m(1, this.f123345y);
        }
        if ((this.f123344x & 2) == 2) {
            C37018u c37018u = this.f123346z;
            c36994g.m118799x(2, 2);
            c36994g.m118797v(c37018u.size());
            c36994g.m118793r(c37018u);
        }
        c36994g.m118793r(this.f123343w);
    }

    public C30150m(C30118b c30118b) {
        this.f123341E = (byte) -1;
        this.f123342F = -1;
        this.f123343w = c30118b.f158353w;
    }

    public C30150m(C36992f c36992f) {
        this.f123341E = (byte) -1;
        this.f123342F = -1;
        boolean z4 = false;
        this.f123345y = 0;
        this.f123346z = AbstractC36990e.f158321w;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        while (!z4) {
            try {
                try {
                    try {
                        int iM118769o = c36992f.m118769o();
                        if (iM118769o != 0) {
                            if (iM118769o == 8) {
                                this.f123344x |= 1;
                                this.f123345y = c36992f.m118766l();
                            } else if (iM118769o != 18) {
                                if (!c36992f.m118772r(iM118769o, c36994gM118784j)) {
                                }
                            } else {
                                this.f123344x |= 2;
                                this.f123346z = c36992f.m118760f();
                            }
                        }
                        z4 = true;
                    } catch (InvalidProtocolBufferException e5) {
                        e5.f89345w = this;
                        throw e5;
                    }
                } catch (IOException e13) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                    invalidProtocolBufferException.f89345w = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th3) {
                try {
                    c36994gM118784j.m118785i();
                } catch (IOException unused) {
                } finally {
                    this.f123343w = c36988d.m118737i();
                }
                throw th3;
            }
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123343w = c36988d.m118737i();
        }
    }
}
