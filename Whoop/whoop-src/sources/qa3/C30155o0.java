package qa3;

import java.io.IOException;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import wa3.AbstractC36990e;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36988d;
import wa3.C36992f;
import wa3.C36994g;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: qa3.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C30155o0 extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: H */
    public static final C30155o0 f123373H;

    /* JADX INFO: renamed from: I */
    public static final C30115a f123374I = new C30115a(12);

    /* JADX INFO: renamed from: E */
    public EnumC30153n0 f123375E;

    /* JADX INFO: renamed from: F */
    public byte f123376F;

    /* JADX INFO: renamed from: G */
    public int f123377G;

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f123378w;

    /* JADX INFO: renamed from: x */
    public int f123379x;

    /* JADX INFO: renamed from: y */
    public int f123380y;

    /* JADX INFO: renamed from: z */
    public int f123381z;

    static {
        C30155o0 c30155o0 = new C30155o0();
        f123373H = c30155o0;
        c30155o0.f123380y = -1;
        c30155o0.f123381z = 0;
        c30155o0.f123375E = EnumC30153n0.PACKAGE;
    }

    public C30155o0() {
        this.f123376F = (byte) -1;
        this.f123377G = -1;
        this.f123378w = AbstractC36990e.f158321w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123376F;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f123379x & 2) == 2) {
            this.f123376F = (byte) 1;
            return true;
        }
        this.f123376F = (byte) 0;
        return false;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30151m0 c30151m0M92332j = C30151m0.m92332j();
        c30151m0M92332j.m92334l(this);
        return c30151m0M92332j;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123377G;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f123379x & 1) == 1 ? C36994g.m118777b(1, this.f123380y) : 0;
        if ((this.f123379x & 2) == 2) {
            iM118777b += C36994g.m118777b(2, this.f123381z);
        }
        if ((this.f123379x & 4) == 4) {
            iM118777b += C36994g.m118776a(3, this.f123375E.f123361w);
        }
        int size = this.f123378w.size() + iM118777b;
        this.f123377G = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30151m0.m92332j();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        if ((this.f123379x & 1) == 1) {
            c36994g.m118788m(1, this.f123380y);
        }
        if ((this.f123379x & 2) == 2) {
            c36994g.m118788m(2, this.f123381z);
        }
        if ((this.f123379x & 4) == 4) {
            c36994g.m118787l(3, this.f123375E.f123361w);
        }
        c36994g.m118793r(this.f123378w);
    }

    public C30155o0(C30151m0 c30151m0) {
        this.f123376F = (byte) -1;
        this.f123377G = -1;
        this.f123378w = c30151m0.f158353w;
    }

    public C30155o0(C36992f c36992f) {
        EnumC30153n0 enumC30153n0;
        this.f123376F = (byte) -1;
        this.f123377G = -1;
        this.f123380y = -1;
        boolean z4 = false;
        this.f123381z = 0;
        EnumC30153n0 enumC30153n1 = EnumC30153n0.PACKAGE;
        this.f123375E = enumC30153n1;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    if (iM118769o != 0) {
                        if (iM118769o == 8) {
                            this.f123379x |= 1;
                            this.f123380y = c36992f.m118766l();
                        } else if (iM118769o == 16) {
                            this.f123379x |= 2;
                            this.f123381z = c36992f.m118766l();
                        } else if (iM118769o != 24) {
                            if (!c36992f.m118772r(iM118769o, c36994gM118784j)) {
                            }
                        } else {
                            int iM118766l = c36992f.m118766l();
                            if (iM118766l == 0) {
                                enumC30153n0 = EnumC30153n0.CLASS;
                            } else if (iM118766l != 1) {
                                enumC30153n0 = iM118766l != 2 ? null : EnumC30153n0.LOCAL;
                            } else {
                                enumC30153n0 = enumC30153n1;
                            }
                            if (enumC30153n0 == null) {
                                c36994gM118784j.m118797v(iM118769o);
                                c36994gM118784j.m118797v(iM118766l);
                            } else {
                                this.f123379x |= 4;
                                this.f123375E = enumC30153n0;
                            }
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
                    this.f123378w = c36988d.m118737i();
                }
                throw th3;
            }
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123378w = c36988d.m118737i();
        }
    }
}
