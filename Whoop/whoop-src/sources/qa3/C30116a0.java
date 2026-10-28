package qa3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import wa3.AbstractC36990e;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36988d;
import wa3.C36992f;
import wa3.C36994g;
import wa3.C36998i;
import wa3.InterfaceC37019v;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: qa3.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30116a0 extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: L */
    public static final C30116a0 f122967L;

    /* JADX INFO: renamed from: M */
    public static final C30148l f122968M = new C30148l(2);

    /* JADX INFO: renamed from: E */
    public EnumC30176z f122969E;

    /* JADX INFO: renamed from: F */
    public C30171w0 f122970F;

    /* JADX INFO: renamed from: G */
    public int f122971G;

    /* JADX INFO: renamed from: H */
    public List f122972H;

    /* JADX INFO: renamed from: I */
    public List f122973I;

    /* JADX INFO: renamed from: J */
    public byte f122974J;

    /* JADX INFO: renamed from: K */
    public int f122975K;

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f122976w;

    /* JADX INFO: renamed from: x */
    public int f122977x;

    /* JADX INFO: renamed from: y */
    public int f122978y;

    /* JADX INFO: renamed from: z */
    public int f122979z;

    static {
        C30116a0 c30116a0 = new C30116a0();
        f122967L = c30116a0;
        c30116a0.f122978y = 0;
        c30116a0.f122979z = 0;
        c30116a0.f122969E = EnumC30176z.TRUE;
        c30116a0.f122970F = C30171w0.f123475U;
        c30116a0.f122971G = 0;
        List list = Collections.EMPTY_LIST;
        c30116a0.f122972H = list;
        c30116a0.f122973I = list;
    }

    public C30116a0() {
        this.f122974J = (byte) -1;
        this.f122975K = -1;
        this.f122976w = AbstractC36990e.f158321w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f122974J;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (m92272p() && !this.f122970F.mo92260b()) {
            this.f122974J = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < this.f122972H.size(); i13++) {
            if (!((C30116a0) this.f122972H.get(i13)).mo92260b()) {
                this.f122974J = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f122973I.size(); i14++) {
            if (!((C30116a0) this.f122973I.get(i14)).mo92260b()) {
                this.f122974J = (byte) 0;
                return false;
            }
        }
        this.f122974J = (byte) 1;
        return true;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30174y c30174yM92368k = C30174y.m92368k();
        c30174yM92368k.m92370l(this);
        return c30174yM92368k;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f122975K;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f122977x & 1) == 1 ? C36994g.m118777b(1, this.f122978y) : 0;
        if ((this.f122977x & 2) == 2) {
            iM118777b += C36994g.m118777b(2, this.f122979z);
        }
        if ((this.f122977x & 4) == 4) {
            iM118777b += C36994g.m118776a(3, this.f122969E.f123543w);
        }
        if ((this.f122977x & 8) == 8) {
            iM118777b += C36994g.m118779d(4, this.f122970F);
        }
        if ((this.f122977x & 16) == 16) {
            iM118777b += C36994g.m118777b(5, this.f122971G);
        }
        for (int i14 = 0; i14 < this.f122972H.size(); i14++) {
            iM118777b += C36994g.m118779d(6, (InterfaceC37019v) this.f122972H.get(i14));
        }
        for (int i15 = 0; i15 < this.f122973I.size(); i15++) {
            iM118777b += C36994g.m118779d(7, (InterfaceC37019v) this.f122973I.get(i15));
        }
        int size = this.f122976w.size() + iM118777b;
        this.f122975K = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30174y.m92368k();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        if ((this.f122977x & 1) == 1) {
            c36994g.m118788m(1, this.f122978y);
        }
        if ((this.f122977x & 2) == 2) {
            c36994g.m118788m(2, this.f122979z);
        }
        if ((this.f122977x & 4) == 4) {
            c36994g.m118787l(3, this.f122969E.f123543w);
        }
        if ((this.f122977x & 8) == 8) {
            c36994g.m118790o(4, this.f122970F);
        }
        if ((this.f122977x & 16) == 16) {
            c36994g.m118788m(5, this.f122971G);
        }
        for (int i13 = 0; i13 < this.f122972H.size(); i13++) {
            c36994g.m118790o(6, (InterfaceC37019v) this.f122972H.get(i13));
        }
        for (int i14 = 0; i14 < this.f122973I.size(); i14++) {
            c36994g.m118790o(7, (InterfaceC37019v) this.f122973I.get(i14));
        }
        c36994g.m118793r(this.f122976w);
    }

    /* JADX INFO: renamed from: i */
    public final List m92265i() {
        return this.f122972H;
    }

    /* JADX INFO: renamed from: j */
    public final EnumC30176z m92266j() {
        return this.f122969E;
    }

    /* JADX INFO: renamed from: k */
    public final int m92267k() {
        return this.f122978y;
    }

    /* JADX INFO: renamed from: l */
    public final C30171w0 m92268l() {
        return this.f122970F;
    }

    /* JADX INFO: renamed from: m */
    public final int m92269m() {
        return this.f122971G;
    }

    /* JADX INFO: renamed from: n */
    public final List m92270n() {
        return this.f122973I;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m92271o() {
        return (this.f122977x & 4) == 4;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m92272p() {
        return (this.f122977x & 8) == 8;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m92273q() {
        return (this.f122977x & 16) == 16;
    }

    public C30116a0(C30174y c30174y) {
        this.f122974J = (byte) -1;
        this.f122975K = -1;
        this.f122976w = c30174y.f158353w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C30116a0(C36992f c36992f, C36998i c36998i) {
        EnumC30176z enumC30176z;
        this.f122974J = (byte) -1;
        this.f122975K = -1;
        boolean z4 = false;
        this.f122978y = 0;
        this.f122979z = 0;
        EnumC30176z enumC30176z2 = EnumC30176z.TRUE;
        this.f122969E = enumC30176z2;
        this.f122970F = C30171w0.f123475U;
        this.f122971G = 0;
        List list = Collections.EMPTY_LIST;
        this.f122972H = list;
        this.f122973I = list;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        int i13 = 0;
        while (!z4) {
            try {
                try {
                    try {
                        int iM118769o = c36992f.m118769o();
                        if (iM118769o != 0) {
                            if (iM118769o == 8) {
                                this.f122977x |= 1;
                                this.f122978y = c36992f.m118766l();
                            } else if (iM118769o != 16) {
                                Object objM92361r = null;
                                if (iM118769o == 24) {
                                    int iM118766l = c36992f.m118766l();
                                    if (iM118766l != 0) {
                                        if (iM118766l == 1) {
                                            objM92361r = EnumC30176z.FALSE;
                                        } else if (iM118766l == 2) {
                                            objM92361r = EnumC30176z.NULL;
                                        }
                                        enumC30176z = objM92361r;
                                    } else {
                                        enumC30176z = enumC30176z2;
                                    }
                                    if (enumC30176z == 0) {
                                        c36994gM118784j.m118797v(iM118769o);
                                        c36994gM118784j.m118797v(iM118766l);
                                    } else {
                                        this.f122977x |= 4;
                                        this.f122969E = enumC30176z;
                                    }
                                } else if (iM118769o == 34) {
                                    if ((this.f122977x & 8) == 8) {
                                        C30171w0 c30171w0 = this.f122970F;
                                        c30171w0.getClass();
                                        objM92361r = C30171w0.m92361r(c30171w0);
                                    }
                                    C30169v0 c30169v0 = objM92361r;
                                    C30171w0 c30171w1 = (C30171w0) c36992f.m118762h(C30171w0.f123476V, c36998i);
                                    this.f122970F = c30171w1;
                                    if (c30169v0 != 0) {
                                        c30169v0.m92357n(c30171w1);
                                        this.f122970F = c30169v0.m92356k();
                                    }
                                    this.f122977x |= 8;
                                } else if (iM118769o != 40) {
                                    C30148l c30148l = f122968M;
                                    if (iM118769o == 50) {
                                        if ((i13 & 32) != 32) {
                                            this.f122972H = new ArrayList();
                                            i13 |= 32;
                                        }
                                        this.f122972H.add(c36992f.m118762h(c30148l, c36998i));
                                    } else if (iM118769o != 58) {
                                        if (!c36992f.m118772r(iM118769o, c36994gM118784j)) {
                                        }
                                    } else {
                                        if ((i13 & 64) != 64) {
                                            this.f122973I = new ArrayList();
                                            i13 |= 64;
                                        }
                                        this.f122973I.add(c36992f.m118762h(c30148l, c36998i));
                                    }
                                } else {
                                    this.f122977x |= 16;
                                    this.f122971G = c36992f.m118766l();
                                }
                            } else {
                                this.f122977x |= 2;
                                this.f122979z = c36992f.m118766l();
                            }
                        }
                        z4 = true;
                    } catch (IOException e5) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e5.getMessage());
                        invalidProtocolBufferException.f89345w = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (InvalidProtocolBufferException e13) {
                    e13.f89345w = this;
                    throw e13;
                }
            } catch (Throwable th3) {
                if ((i13 & 32) == 32) {
                    this.f122972H = Collections.unmodifiableList(this.f122972H);
                }
                if ((i13 & 64) == 64) {
                    this.f122973I = Collections.unmodifiableList(this.f122973I);
                }
                try {
                    c36994gM118784j.m118785i();
                } catch (IOException unused) {
                } finally {
                    this.f122976w = c36988d.m118737i();
                }
                throw th3;
            }
        }
        if ((i13 & 32) == 32) {
            this.f122972H = Collections.unmodifiableList(this.f122972H);
        }
        if ((i13 & 64) == 64) {
            this.f122973I = Collections.unmodifiableList(this.f122973I);
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f122976w = c36988d.m118737i();
        }
    }
}
