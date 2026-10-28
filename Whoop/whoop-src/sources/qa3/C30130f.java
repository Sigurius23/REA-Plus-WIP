package qa3;

import java.io.IOException;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import wa3.AbstractC36990e;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36988d;
import wa3.C36992f;
import wa3.C36994g;
import wa3.C36998i;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: qa3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C30130f extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: G */
    public static final C30130f f123126G;

    /* JADX INFO: renamed from: H */
    public static final C30115a f123127H = new C30115a(1);

    /* JADX INFO: renamed from: E */
    public byte f123128E;

    /* JADX INFO: renamed from: F */
    public int f123129F;

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f123130w;

    /* JADX INFO: renamed from: x */
    public int f123131x;

    /* JADX INFO: renamed from: y */
    public int f123132y;

    /* JADX INFO: renamed from: z */
    public C30127e f123133z;

    static {
        C30130f c30130f = new C30130f();
        f123126G = c30130f;
        c30130f.f123132y = 0;
        c30130f.f123133z = C30127e.f123093P;
    }

    public C30130f() {
        this.f123128E = (byte) -1;
        this.f123129F = -1;
        this.f123130w = AbstractC36990e.f158321w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123128E;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i13 = this.f123131x;
        if ((i13 & 1) != 1) {
            this.f123128E = (byte) 0;
            return false;
        }
        if ((i13 & 2) != 2) {
            this.f123128E = (byte) 0;
            return false;
        }
        if (this.f123133z.mo92260b()) {
            this.f123128E = (byte) 1;
            return true;
        }
        this.f123128E = (byte) 0;
        return false;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30118b c30118bM92276k = C30118b.m92276k();
        c30118bM92276k.m92282o(this);
        return c30118bM92276k;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123129F;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f123131x & 1) == 1 ? C36994g.m118777b(1, this.f123132y) : 0;
        if ((this.f123131x & 2) == 2) {
            iM118777b += C36994g.m118779d(2, this.f123133z);
        }
        int size = this.f123130w.size() + iM118777b;
        this.f123129F = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30118b.m92276k();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        if ((this.f123131x & 1) == 1) {
            c36994g.m118788m(1, this.f123132y);
        }
        if ((this.f123131x & 2) == 2) {
            c36994g.m118790o(2, this.f123133z);
        }
        c36994g.m118793r(this.f123130w);
    }

    public C30130f(C30118b c30118b) {
        this.f123128E = (byte) -1;
        this.f123129F = -1;
        this.f123130w = c30118b.f158353w;
    }

    public C30130f(C36992f c36992f, C36998i c36998i) {
        C30121c c30121cM92298j;
        this.f123128E = (byte) -1;
        this.f123129F = -1;
        boolean z4 = false;
        this.f123132y = 0;
        this.f123133z = C30127e.f123093P;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        while (!z4) {
            try {
                try {
                    try {
                        int iM118769o = c36992f.m118769o();
                        if (iM118769o != 0) {
                            if (iM118769o == 8) {
                                this.f123131x |= 1;
                                this.f123132y = c36992f.m118766l();
                            } else if (iM118769o != 18) {
                                if (!c36992f.m118772r(iM118769o, c36994gM118784j)) {
                                }
                            } else {
                                if ((this.f123131x & 2) == 2) {
                                    C30127e c30127e = this.f123133z;
                                    c30127e.getClass();
                                    c30121cM92298j = C30127e.m92298j(c30127e);
                                } else {
                                    c30121cM92298j = null;
                                }
                                C30127e c30127e2 = (C30127e) c36992f.m118762h(C30127e.f123094Q, c36998i);
                                this.f123133z = c30127e2;
                                if (c30121cM92298j != null) {
                                    c30121cM92298j.m92291l(c30127e2);
                                    this.f123133z = c30121cM92298j.m92290j();
                                }
                                this.f123131x |= 2;
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
                    this.f123130w = c36988d.m118737i();
                }
                throw th3;
            }
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123130w = c36988d.m118737i();
        }
    }
}
