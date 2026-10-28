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

/* JADX INFO: renamed from: ta3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C33678d extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: G */
    public static final C33678d f140673G;

    /* JADX INFO: renamed from: H */
    public static final C30115a f140674H = new C30115a(22);

    /* JADX INFO: renamed from: E */
    public byte f140675E;

    /* JADX INFO: renamed from: F */
    public int f140676F;

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f140677w;

    /* JADX INFO: renamed from: x */
    public int f140678x;

    /* JADX INFO: renamed from: y */
    public int f140679y;

    /* JADX INFO: renamed from: z */
    public int f140680z;

    static {
        C33678d c33678d = new C33678d();
        f140673G = c33678d;
        c33678d.f140679y = 0;
        c33678d.f140680z = 0;
    }

    public C33678d() {
        this.f140675E = (byte) -1;
        this.f140676F = -1;
        this.f140677w = AbstractC36990e.f158321w;
    }

    /* JADX INFO: renamed from: i */
    public static C33677c m106423i(C33678d c33678d) {
        C33677c c33677c = new C33677c();
        c33677c.m106422k(c33678d);
        return c33677c;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        if (this.f140675E == 1) {
            return true;
        }
        this.f140675E = (byte) 1;
        return true;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        return m106423i(this);
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f140676F;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f140678x & 1) == 1 ? C36994g.m118777b(1, this.f140679y) : 0;
        if ((this.f140678x & 2) == 2) {
            iM118777b += C36994g.m118777b(2, this.f140680z);
        }
        int size = this.f140677w.size() + iM118777b;
        this.f140676F = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return new C33677c();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        if ((this.f140678x & 1) == 1) {
            c36994g.m118788m(1, this.f140679y);
        }
        if ((this.f140678x & 2) == 2) {
            c36994g.m118788m(2, this.f140680z);
        }
        c36994g.m118793r(this.f140677w);
    }

    public C33678d(C33677c c33677c) {
        this.f140675E = (byte) -1;
        this.f140676F = -1;
        this.f140677w = c33677c.f158353w;
    }

    public C33678d(C36992f c36992f) {
        this.f140675E = (byte) -1;
        this.f140676F = -1;
        boolean z4 = false;
        this.f140679y = 0;
        this.f140680z = 0;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    if (iM118769o != 0) {
                        if (iM118769o == 8) {
                            this.f140678x |= 1;
                            this.f140679y = c36992f.m118766l();
                        } else if (iM118769o != 16) {
                            if (!c36992f.m118772r(iM118769o, c36994gM118784j)) {
                            }
                        } else {
                            this.f140678x |= 2;
                            this.f140680z = c36992f.m118766l();
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
                    this.f140677w = c36988d.m118737i();
                }
                throw th3;
            }
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f140677w = c36988d.m118737i();
        }
    }
}
