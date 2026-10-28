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

/* JADX INFO: renamed from: qa3.u0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C30167u0 extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: H */
    public static final C30167u0 f123436H;

    /* JADX INFO: renamed from: I */
    public static final C30115a f123437I = new C30115a(15);

    /* JADX INFO: renamed from: E */
    public int f123438E;

    /* JADX INFO: renamed from: F */
    public byte f123439F;

    /* JADX INFO: renamed from: G */
    public int f123440G;

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f123441w;

    /* JADX INFO: renamed from: x */
    public int f123442x;

    /* JADX INFO: renamed from: y */
    public EnumC30165t0 f123443y;

    /* JADX INFO: renamed from: z */
    public C30171w0 f123444z;

    static {
        C30167u0 c30167u0 = new C30167u0();
        f123436H = c30167u0;
        c30167u0.f123443y = EnumC30165t0.INV;
        c30167u0.f123444z = C30171w0.f123475U;
        c30167u0.f123438E = 0;
    }

    public C30167u0() {
        this.f123439F = (byte) -1;
        this.f123440G = -1;
        this.f123441w = AbstractC36990e.f158321w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123439F;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f123442x & 2) != 2 || this.f123444z.mo92260b()) {
            this.f123439F = (byte) 1;
            return true;
        }
        this.f123439F = (byte) 0;
        return false;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30163s0 c30163s0M92345j = C30163s0.m92345j();
        c30163s0M92345j.m92347l(this);
        return c30163s0M92345j;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123440G;
        if (i13 != -1) {
            return i13;
        }
        int iM118776a = (this.f123442x & 1) == 1 ? C36994g.m118776a(1, this.f123443y.f123430w) : 0;
        if ((this.f123442x & 2) == 2) {
            iM118776a += C36994g.m118779d(2, this.f123444z);
        }
        if ((this.f123442x & 4) == 4) {
            iM118776a += C36994g.m118777b(3, this.f123438E);
        }
        int size = this.f123441w.size() + iM118776a;
        this.f123440G = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30163s0.m92345j();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        if ((this.f123442x & 1) == 1) {
            c36994g.m118787l(1, this.f123443y.f123430w);
        }
        if ((this.f123442x & 2) == 2) {
            c36994g.m118790o(2, this.f123444z);
        }
        if ((this.f123442x & 4) == 4) {
            c36994g.m118788m(3, this.f123438E);
        }
        c36994g.m118793r(this.f123441w);
    }

    public C30167u0(C30163s0 c30163s0) {
        this.f123439F = (byte) -1;
        this.f123440G = -1;
        this.f123441w = c30163s0.f158353w;
    }

    public C30167u0(C36992f c36992f, C36998i c36998i) {
        this.f123439F = (byte) -1;
        this.f123440G = -1;
        EnumC30165t0 enumC30165t0 = EnumC30165t0.INV;
        this.f123443y = enumC30165t0;
        this.f123444z = C30171w0.f123475U;
        boolean z4 = false;
        this.f123438E = 0;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    if (iM118769o != 0) {
                        C30169v0 c30169v0M92361r = null;
                        EnumC30165t0 enumC30165t1 = null;
                        if (iM118769o == 8) {
                            int iM118766l = c36992f.m118766l();
                            if (iM118766l == 0) {
                                enumC30165t1 = EnumC30165t0.IN;
                            } else if (iM118766l == 1) {
                                enumC30165t1 = EnumC30165t0.OUT;
                            } else if (iM118766l == 2) {
                                enumC30165t1 = enumC30165t0;
                            } else if (iM118766l == 3) {
                                enumC30165t1 = EnumC30165t0.STAR;
                            }
                            if (enumC30165t1 == null) {
                                c36994gM118784j.m118797v(iM118769o);
                                c36994gM118784j.m118797v(iM118766l);
                            } else {
                                this.f123442x |= 1;
                                this.f123443y = enumC30165t1;
                            }
                        } else if (iM118769o == 18) {
                            if ((this.f123442x & 2) == 2) {
                                C30171w0 c30171w0 = this.f123444z;
                                c30171w0.getClass();
                                c30169v0M92361r = C30171w0.m92361r(c30171w0);
                            }
                            C30171w0 c30171w1 = (C30171w0) c36992f.m118762h(C30171w0.f123476V, c36998i);
                            this.f123444z = c30171w1;
                            if (c30169v0M92361r != null) {
                                c30169v0M92361r.m92357n(c30171w1);
                                this.f123444z = c30169v0M92361r.m92356k();
                            }
                            this.f123442x |= 2;
                        } else if (iM118769o != 24) {
                            if (!c36992f.m118772r(iM118769o, c36994gM118784j)) {
                            }
                        } else {
                            this.f123442x |= 4;
                            this.f123438E = c36992f.m118766l();
                        }
                    }
                    z4 = true;
                } catch (Throwable th3) {
                    try {
                        c36994gM118784j.m118785i();
                    } catch (IOException unused) {
                    } finally {
                        this.f123441w = c36988d.m118737i();
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
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123441w = c36988d.m118737i();
        }
    }
}
