package qa3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p389p0.C28539n0;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import wa3.AbstractC36990e;
import wa3.AbstractC37002k;
import wa3.AbstractC37006m;
import wa3.C36988d;
import wa3.C36992f;
import wa3.C36994g;
import wa3.C36998i;
import wa3.InterfaceC37019v;

/* JADX INFO: renamed from: qa3.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C30134g0 extends AbstractC37006m {

    /* JADX INFO: renamed from: K */
    public static final C30134g0 f123151K;

    /* JADX INFO: renamed from: L */
    public static final C30115a f123152L = new C30115a(8);

    /* JADX INFO: renamed from: E */
    public List f123153E;

    /* JADX INFO: renamed from: F */
    public List f123154F;

    /* JADX INFO: renamed from: G */
    public C30123c1 f123155G;

    /* JADX INFO: renamed from: H */
    public C30144j1 f123156H;

    /* JADX INFO: renamed from: I */
    public byte f123157I;

    /* JADX INFO: renamed from: J */
    public int f123158J;

    /* JADX INFO: renamed from: x */
    public final AbstractC36990e f123159x;

    /* JADX INFO: renamed from: y */
    public int f123160y;

    /* JADX INFO: renamed from: z */
    public List f123161z;

    static {
        C30134g0 c30134g0 = new C30134g0();
        f123151K = c30134g0;
        List list = Collections.EMPTY_LIST;
        c30134g0.f123161z = list;
        c30134g0.f123153E = list;
        c30134g0.f123154F = list;
        c30134g0.f123155G = C30123c1.f123059G;
        c30134g0.f123156H = C30144j1.f123263E;
    }

    public C30134g0(C30131f0 c30131f0) {
        super(c30131f0);
        this.f123157I = (byte) -1;
        this.f123158J = -1;
        this.f123159x = c30131f0.f158353w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: a */
    public final InterfaceC37019v mo92288a() {
        return f123151K;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123157I;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i13 = 0; i13 < this.f123161z.size(); i13++) {
            if (!((C30122c0) this.f123161z.get(i13)).mo92260b()) {
                this.f123157I = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f123153E.size(); i14++) {
            if (!((C30146k0) this.f123153E.get(i14)).mo92260b()) {
                this.f123157I = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f123154F.size(); i15++) {
            if (!((C30175y0) this.f123154F.get(i15)).mo92260b()) {
                this.f123157I = (byte) 0;
                return false;
            }
        }
        if ((this.f123160y & 1) == 1 && !this.f123155G.mo92260b()) {
            this.f123157I = (byte) 0;
            return false;
        }
        if (m118818i()) {
            this.f123157I = (byte) 1;
            return true;
        }
        this.f123157I = (byte) 0;
        return false;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30131f0 c30131f0M92301k = C30131f0.m92301k();
        c30131f0M92301k.m92303n(this);
        return c30131f0M92301k;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123158J;
        if (i13 != -1) {
            return i13;
        }
        int iM118779d = 0;
        for (int i14 = 0; i14 < this.f123161z.size(); i14++) {
            iM118779d += C36994g.m118779d(3, (InterfaceC37019v) this.f123161z.get(i14));
        }
        for (int i15 = 0; i15 < this.f123153E.size(); i15++) {
            iM118779d += C36994g.m118779d(4, (InterfaceC37019v) this.f123153E.get(i15));
        }
        for (int i16 = 0; i16 < this.f123154F.size(); i16++) {
            iM118779d += C36994g.m118779d(5, (InterfaceC37019v) this.f123154F.get(i16));
        }
        if ((this.f123160y & 1) == 1) {
            iM118779d += C36994g.m118779d(30, this.f123155G);
        }
        if ((this.f123160y & 2) == 2) {
            iM118779d += C36994g.m118779d(32, this.f123156H);
        }
        int size = this.f123159x.size() + m118819j() + iM118779d;
        this.f123158J = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30131f0.m92301k();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        C28539n0 c28539n0 = new C28539n0(this);
        for (int i13 = 0; i13 < this.f123161z.size(); i13++) {
            c36994g.m118790o(3, (InterfaceC37019v) this.f123161z.get(i13));
        }
        for (int i14 = 0; i14 < this.f123153E.size(); i14++) {
            c36994g.m118790o(4, (InterfaceC37019v) this.f123153E.get(i14));
        }
        for (int i15 = 0; i15 < this.f123154F.size(); i15++) {
            c36994g.m118790o(5, (InterfaceC37019v) this.f123154F.get(i15));
        }
        if ((this.f123160y & 1) == 1) {
            c36994g.m118790o(30, this.f123155G);
        }
        if ((this.f123160y & 2) == 2) {
            c36994g.m118790o(32, this.f123156H);
        }
        c28539n0.m86842n(200, c36994g);
        c36994g.m118793r(this.f123159x);
    }

    public C30134g0() {
        this.f123157I = (byte) -1;
        this.f123158J = -1;
        this.f123159x = AbstractC36990e.f158321w;
    }

    public C30134g0(C36992f c36992f, C36998i c36998i) {
        this.f123157I = (byte) -1;
        this.f123158J = -1;
        List list = Collections.EMPTY_LIST;
        this.f123161z = list;
        this.f123153E = list;
        this.f123154F = list;
        this.f123155G = C30123c1.f123059G;
        this.f123156H = C30144j1.f123263E;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        boolean z4 = false;
        int i13 = 0;
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    if (iM118769o != 0) {
                        if (iM118769o == 26) {
                            int i14 = (i13 == true ? 1 : 0) & 1;
                            i13 = i13;
                            if (i14 != 1) {
                                this.f123161z = new ArrayList();
                                i13 = (i13 == true ? 1 : 0) | 1;
                            }
                            this.f123161z.add(c36992f.m118762h(C30122c0.f123035Z, c36998i));
                        } else if (iM118769o == 34) {
                            int i15 = (i13 == true ? 1 : 0) & 2;
                            i13 = i13;
                            if (i15 != 2) {
                                this.f123153E = new ArrayList();
                                i13 = (i13 == true ? 1 : 0) | 2;
                            }
                            this.f123153E.add(c36992f.m118762h(C30146k0.f123303f0, c36998i));
                        } else if (iM118769o != 42) {
                            C30156p c30156p = null;
                            C30133g c30133gM92293i = null;
                            if (iM118769o == 242) {
                                if ((this.f123160y & 1) == 1) {
                                    C30123c1 c30123c1 = this.f123155G;
                                    c30123c1.getClass();
                                    c30133gM92293i = C30123c1.m92293i(c30123c1);
                                }
                                C30123c1 c30123c2 = (C30123c1) c36992f.m118762h(C30123c1.f123060H, c36998i);
                                this.f123155G = c30123c2;
                                if (c30133gM92293i != null) {
                                    c30133gM92293i.m92311o(c30123c2);
                                    this.f123155G = c30133gM92293i.m92309k();
                                }
                                this.f123160y |= 1;
                            } else if (iM118769o != 258) {
                                if (!m118823n(c36992f, c36994gM118784j, c36998i, iM118769o)) {
                                }
                            } else {
                                if ((this.f123160y & 2) == 2) {
                                    C30144j1 c30144j1 = this.f123156H;
                                    c30144j1.getClass();
                                    c30156p = new C30156p(1);
                                    c30156p.f123384z = Collections.EMPTY_LIST;
                                    c30156p.m92341n(c30144j1);
                                }
                                C30144j1 c30144j2 = (C30144j1) c36992f.m118762h(C30144j1.f123264F, c36998i);
                                this.f123156H = c30144j2;
                                if (c30156p != null) {
                                    c30156p.m92341n(c30144j2);
                                    this.f123156H = c30156p.m92339k();
                                }
                                this.f123160y |= 2;
                            }
                        } else {
                            int i16 = (i13 == true ? 1 : 0) & 4;
                            i13 = i13;
                            if (i16 != 4) {
                                this.f123154F = new ArrayList();
                                i13 = (i13 == true ? 1 : 0) | 4;
                            }
                            this.f123154F.add(c36992f.m118762h(C30175y0.f123524Q, c36998i));
                        }
                    }
                    z4 = true;
                } catch (Throwable th3) {
                    if (((i13 == true ? 1 : 0) & 1) == 1) {
                        this.f123161z = Collections.unmodifiableList(this.f123161z);
                    }
                    if (((i13 == true ? 1 : 0) & 2) == 2) {
                        this.f123153E = Collections.unmodifiableList(this.f123153E);
                    }
                    if (((i13 == true ? 1 : 0) & 4) == 4) {
                        this.f123154F = Collections.unmodifiableList(this.f123154F);
                    }
                    try {
                        c36994gM118784j.m118785i();
                    } catch (IOException unused) {
                    } finally {
                        this.f123159x = c36988d.m118737i();
                    }
                    m118822m();
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
        if (((i13 == true ? 1 : 0) & 1) == 1) {
            this.f123161z = Collections.unmodifiableList(this.f123161z);
        }
        if (((i13 == true ? 1 : 0) & 2) == 2) {
            this.f123153E = Collections.unmodifiableList(this.f123153E);
        }
        if (((i13 == true ? 1 : 0) & 4) == 4) {
            this.f123154F = Collections.unmodifiableList(this.f123154F);
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123159x = c36988d.m118737i();
        }
        m118822m();
    }
}
