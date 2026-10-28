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

/* JADX INFO: renamed from: qa3.i1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C30141i1 extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: K */
    public static final C30141i1 f123219K;

    /* JADX INFO: renamed from: L */
    public static final C30115a f123220L = new C30115a(19);

    /* JADX INFO: renamed from: E */
    public EnumC30135g1 f123221E;

    /* JADX INFO: renamed from: F */
    public int f123222F;

    /* JADX INFO: renamed from: G */
    public int f123223G;

    /* JADX INFO: renamed from: H */
    public EnumC30138h1 f123224H;

    /* JADX INFO: renamed from: I */
    public byte f123225I;

    /* JADX INFO: renamed from: J */
    public int f123226J;

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f123227w;

    /* JADX INFO: renamed from: x */
    public int f123228x;

    /* JADX INFO: renamed from: y */
    public int f123229y;

    /* JADX INFO: renamed from: z */
    public int f123230z;

    static {
        C30141i1 c30141i1 = new C30141i1();
        f123219K = c30141i1;
        c30141i1.f123229y = 0;
        c30141i1.f123230z = 0;
        c30141i1.f123221E = EnumC30135g1.ERROR;
        c30141i1.f123222F = 0;
        c30141i1.f123223G = 0;
        c30141i1.f123224H = EnumC30138h1.LANGUAGE_VERSION;
    }

    public C30141i1() {
        this.f123225I = (byte) -1;
        this.f123226J = -1;
        this.f123227w = AbstractC36990e.f158321w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        if (this.f123225I == 1) {
            return true;
        }
        this.f123225I = (byte) 1;
        return true;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30132f1 c30132f1M92304j = C30132f1.m92304j();
        c30132f1M92304j.m92306l(this);
        return c30132f1M92304j;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123226J;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f123228x & 1) == 1 ? C36994g.m118777b(1, this.f123229y) : 0;
        if ((this.f123228x & 2) == 2) {
            iM118777b += C36994g.m118777b(2, this.f123230z);
        }
        if ((this.f123228x & 4) == 4) {
            iM118777b += C36994g.m118776a(3, this.f123221E.f123166w);
        }
        if ((this.f123228x & 8) == 8) {
            iM118777b += C36994g.m118777b(4, this.f123222F);
        }
        if ((this.f123228x & 16) == 16) {
            iM118777b += C36994g.m118777b(5, this.f123223G);
        }
        if ((this.f123228x & 32) == 32) {
            iM118777b += C36994g.m118776a(6, this.f123224H.f123184w);
        }
        int size = this.f123227w.size() + iM118777b;
        this.f123226J = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30132f1.m92304j();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        if ((this.f123228x & 1) == 1) {
            c36994g.m118788m(1, this.f123229y);
        }
        if ((this.f123228x & 2) == 2) {
            c36994g.m118788m(2, this.f123230z);
        }
        if ((this.f123228x & 4) == 4) {
            c36994g.m118787l(3, this.f123221E.f123166w);
        }
        if ((this.f123228x & 8) == 8) {
            c36994g.m118788m(4, this.f123222F);
        }
        if ((this.f123228x & 16) == 16) {
            c36994g.m118788m(5, this.f123223G);
        }
        if ((this.f123228x & 32) == 32) {
            c36994g.m118787l(6, this.f123224H.f123184w);
        }
        c36994g.m118793r(this.f123227w);
    }

    public C30141i1(C30132f1 c30132f1) {
        this.f123225I = (byte) -1;
        this.f123226J = -1;
        this.f123227w = c30132f1.f158353w;
    }

    public C30141i1(C36992f c36992f) {
        this.f123225I = (byte) -1;
        this.f123226J = -1;
        boolean z4 = false;
        this.f123229y = 0;
        this.f123230z = 0;
        EnumC30135g1 enumC30135g1 = EnumC30135g1.ERROR;
        this.f123221E = enumC30135g1;
        this.f123222F = 0;
        this.f123223G = 0;
        EnumC30138h1 enumC30138h1 = EnumC30138h1.LANGUAGE_VERSION;
        this.f123224H = enumC30138h1;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    if (iM118769o != 0) {
                        if (iM118769o == 8) {
                            this.f123228x |= 1;
                            this.f123229y = c36992f.m118766l();
                        } else if (iM118769o != 16) {
                            EnumC30138h1 enumC30138h2 = null;
                            EnumC30135g1 enumC30135g2 = null;
                            if (iM118769o == 24) {
                                int iM118766l = c36992f.m118766l();
                                if (iM118766l == 0) {
                                    enumC30135g2 = EnumC30135g1.WARNING;
                                } else if (iM118766l == 1) {
                                    enumC30135g2 = enumC30135g1;
                                } else if (iM118766l == 2) {
                                    enumC30135g2 = EnumC30135g1.HIDDEN;
                                }
                                if (enumC30135g2 == null) {
                                    c36994gM118784j.m118797v(iM118769o);
                                    c36994gM118784j.m118797v(iM118766l);
                                } else {
                                    this.f123228x |= 4;
                                    this.f123221E = enumC30135g2;
                                }
                            } else if (iM118769o == 32) {
                                this.f123228x |= 8;
                                this.f123222F = c36992f.m118766l();
                            } else if (iM118769o == 40) {
                                this.f123228x |= 16;
                                this.f123223G = c36992f.m118766l();
                            } else if (iM118769o != 48) {
                                if (!c36992f.m118772r(iM118769o, c36994gM118784j)) {
                                }
                            } else {
                                int iM118766l2 = c36992f.m118766l();
                                if (iM118766l2 == 0) {
                                    enumC30138h2 = enumC30138h1;
                                } else if (iM118766l2 == 1) {
                                    enumC30138h2 = EnumC30138h1.COMPILER_VERSION;
                                } else if (iM118766l2 == 2) {
                                    enumC30138h2 = EnumC30138h1.API_VERSION;
                                }
                                if (enumC30138h2 == null) {
                                    c36994gM118784j.m118797v(iM118769o);
                                    c36994gM118784j.m118797v(iM118766l2);
                                } else {
                                    this.f123228x |= 32;
                                    this.f123224H = enumC30138h2;
                                }
                            }
                        } else {
                            this.f123228x |= 2;
                            this.f123230z = c36992f.m118766l();
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
                    this.f123227w = c36988d.m118737i();
                }
                throw th3;
            }
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123227w = c36988d.m118737i();
        }
    }
}
