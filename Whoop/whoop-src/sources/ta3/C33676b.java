package ta3;

import java.io.IOException;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import qa3.C30115a;
import wa3.AbstractC36990e;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36988d;
import wa3.C36992f;
import wa3.C36994g;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: ta3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C33676b extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: G */
    public static final C33676b f140662G;

    /* JADX INFO: renamed from: H */
    public static final C30115a f140663H = new C30115a(21);

    /* JADX INFO: renamed from: E */
    public byte f140664E;

    /* JADX INFO: renamed from: F */
    public int f140665F;

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f140666w;

    /* JADX INFO: renamed from: x */
    public int f140667x;

    /* JADX INFO: renamed from: y */
    public int f140668y;

    /* JADX INFO: renamed from: z */
    public int f140669z;

    static {
        C33676b c33676b = new C33676b();
        f140662G = c33676b;
        c33676b.f140668y = 0;
        c33676b.f140669z = 0;
    }

    public C33676b() {
        this.f140664E = (byte) -1;
        this.f140665F = -1;
        this.f140666w = AbstractC36990e.f158321w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        if (this.f140664E == 1) {
            return true;
        }
        this.f140664E = (byte) 1;
        return true;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C33675a c33675aM106418j = C33675a.m106418j();
        c33675aM106418j.m106420l(this);
        return c33675aM106418j;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f140665F;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f140667x & 1) == 1 ? C36994g.m118777b(1, this.f140668y) : 0;
        if ((this.f140667x & 2) == 2) {
            iM118777b += C36994g.m118777b(2, this.f140669z);
        }
        int size = this.f140666w.size() + iM118777b;
        this.f140665F = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C33675a.m106418j();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        if ((this.f140667x & 1) == 1) {
            c36994g.m118788m(1, this.f140668y);
        }
        if ((this.f140667x & 2) == 2) {
            c36994g.m118788m(2, this.f140669z);
        }
        c36994g.m118793r(this.f140666w);
    }

    public C33676b(C33675a c33675a) {
        this.f140664E = (byte) -1;
        this.f140665F = -1;
        this.f140666w = c33675a.f158353w;
    }

    public C33676b(C36992f c36992f) {
        this.f140664E = (byte) -1;
        this.f140665F = -1;
        boolean z4 = false;
        this.f140668y = 0;
        this.f140669z = 0;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    if (iM118769o != 0) {
                        if (iM118769o == 8) {
                            this.f140667x |= 1;
                            this.f140668y = c36992f.m118766l();
                        } else if (iM118769o != 16) {
                            if (!c36992f.m118772r(iM118769o, c36994gM118784j)) {
                            }
                        } else {
                            this.f140667x |= 2;
                            this.f140669z = c36992f.m118766l();
                        }
                    }
                    z4 = true;
                } catch (InvalidProtocolBufferException e5) {
                    e5.f89345w = this;
                    throw e5;
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
                    this.f140666w = c36988d.m118737i();
                }
                throw th3;
            }
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f140666w = c36988d.m118737i();
        }
    }
}
