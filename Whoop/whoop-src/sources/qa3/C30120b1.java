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

/* JADX INFO: renamed from: qa3.b1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C30120b1 extends AbstractC37006m {

    /* JADX INFO: renamed from: N */
    public static final C30120b1 f123008N;

    /* JADX INFO: renamed from: O */
    public static final C30115a f123009O = new C30115a(16);

    /* JADX INFO: renamed from: E */
    public int f123010E;

    /* JADX INFO: renamed from: F */
    public boolean f123011F;

    /* JADX INFO: renamed from: G */
    public EnumC30117a1 f123012G;

    /* JADX INFO: renamed from: H */
    public List f123013H;

    /* JADX INFO: renamed from: I */
    public List f123014I;

    /* JADX INFO: renamed from: J */
    public int f123015J;

    /* JADX INFO: renamed from: K */
    public List f123016K;

    /* JADX INFO: renamed from: L */
    public byte f123017L;

    /* JADX INFO: renamed from: M */
    public int f123018M;

    /* JADX INFO: renamed from: x */
    public final AbstractC36990e f123019x;

    /* JADX INFO: renamed from: y */
    public int f123020y;

    /* JADX INFO: renamed from: z */
    public int f123021z;

    static {
        C30120b1 c30120b1 = new C30120b1();
        f123008N = c30120b1;
        c30120b1.f123021z = 0;
        c30120b1.f123010E = 0;
        c30120b1.f123011F = false;
        c30120b1.f123012G = EnumC30117a1.INV;
        List list = Collections.EMPTY_LIST;
        c30120b1.f123013H = list;
        c30120b1.f123014I = list;
        c30120b1.f123016K = list;
    }

    public C30120b1(C30177z0 c30177z0) {
        super(c30177z0);
        this.f123015J = -1;
        this.f123017L = (byte) -1;
        this.f123018M = -1;
        this.f123019x = c30177z0.f158353w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: a */
    public final InterfaceC37019v mo92288a() {
        return f123008N;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123017L;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i13 = this.f123020y;
        if ((i13 & 1) != 1) {
            this.f123017L = (byte) 0;
            return false;
        }
        if ((i13 & 2) != 2) {
            this.f123017L = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < this.f123013H.size(); i14++) {
            if (!((C30171w0) this.f123013H.get(i14)).mo92260b()) {
                this.f123017L = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f123016K.size(); i15++) {
            if (!((C30136h) this.f123016K.get(i15)).mo92260b()) {
                this.f123017L = (byte) 0;
                return false;
            }
        }
        if (m118818i()) {
            this.f123017L = (byte) 1;
            return true;
        }
        this.f123017L = (byte) 0;
        return false;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30177z0 c30177z0M92371k = C30177z0.m92371k();
        c30177z0M92371k.m92373n(this);
        return c30177z0M92371k;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123018M;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f123020y & 1) == 1 ? C36994g.m118777b(1, this.f123021z) : 0;
        if ((this.f123020y & 2) == 2) {
            iM118777b += C36994g.m118777b(2, this.f123010E);
        }
        if ((this.f123020y & 4) == 4) {
            iM118777b += C36994g.m118783h(3) + 1;
        }
        if ((this.f123020y & 8) == 8) {
            iM118777b += C36994g.m118776a(4, this.f123012G.f122984w);
        }
        for (int i14 = 0; i14 < this.f123013H.size(); i14++) {
            iM118777b += C36994g.m118779d(5, (InterfaceC37019v) this.f123013H.get(i14));
        }
        int iM118778c = 0;
        for (int i15 = 0; i15 < this.f123014I.size(); i15++) {
            iM118778c += C36994g.m118778c(((Integer) this.f123014I.get(i15)).intValue());
        }
        int iM118779d = iM118777b + iM118778c;
        if (!this.f123014I.isEmpty()) {
            iM118779d = iM118779d + 1 + C36994g.m118778c(iM118778c);
        }
        this.f123015J = iM118778c;
        for (int i16 = 0; i16 < this.f123016K.size(); i16++) {
            iM118779d += C36994g.m118779d(100, (InterfaceC37019v) this.f123016K.get(i16));
        }
        int size = this.f123019x.size() + m118819j() + iM118779d;
        this.f123018M = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30177z0.m92371k();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        C28539n0 c28539n0 = new C28539n0(this);
        if ((this.f123020y & 1) == 1) {
            c36994g.m118788m(1, this.f123021z);
        }
        if ((this.f123020y & 2) == 2) {
            c36994g.m118788m(2, this.f123010E);
        }
        if ((this.f123020y & 4) == 4) {
            boolean z4 = this.f123011F;
            c36994g.m118799x(3, 0);
            c36994g.m118792q(z4 ? 1 : 0);
        }
        if ((this.f123020y & 8) == 8) {
            c36994g.m118787l(4, this.f123012G.f122984w);
        }
        for (int i13 = 0; i13 < this.f123013H.size(); i13++) {
            c36994g.m118790o(5, (InterfaceC37019v) this.f123013H.get(i13));
        }
        if (this.f123014I.size() > 0) {
            c36994g.m118797v(50);
            c36994g.m118797v(this.f123015J);
        }
        for (int i14 = 0; i14 < this.f123014I.size(); i14++) {
            c36994g.m118789n(((Integer) this.f123014I.get(i14)).intValue());
        }
        for (int i15 = 0; i15 < this.f123016K.size(); i15++) {
            c36994g.m118790o(100, (InterfaceC37019v) this.f123016K.get(i15));
        }
        c28539n0.m86842n(1000, c36994g);
        c36994g.m118793r(this.f123019x);
    }

    public C30120b1() {
        this.f123015J = -1;
        this.f123017L = (byte) -1;
        this.f123018M = -1;
        this.f123019x = AbstractC36990e.f158321w;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    public C30120b1(C36992f c36992f, C36998i c36998i) {
        EnumC30117a1 enumC30117a1;
        this.f123015J = -1;
        this.f123017L = (byte) -1;
        this.f123018M = -1;
        this.f123021z = 0;
        this.f123010E = 0;
        this.f123011F = false;
        EnumC30117a1 enumC30117a2 = EnumC30117a1.INV;
        this.f123012G = enumC30117a2;
        List list = Collections.EMPTY_LIST;
        this.f123013H = list;
        this.f123014I = list;
        this.f123016K = list;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        boolean z4 = false;
        int i13 = 0;
        while (!z4) {
            try {
                try {
                    try {
                        int iM118769o = c36992f.m118769o();
                        if (iM118769o == 0) {
                            z4 = true;
                        } else if (iM118769o == 8) {
                            this.f123020y |= 1;
                            this.f123021z = c36992f.m118766l();
                        } else if (iM118769o == 16) {
                            this.f123020y |= 2;
                            this.f123010E = c36992f.m118766l();
                        } else if (iM118769o == 24) {
                            this.f123020y |= 4;
                            this.f123011F = c36992f.m118767m() != 0;
                        } else if (iM118769o == 32) {
                            int iM118766l = c36992f.m118766l();
                            if (iM118766l == 0) {
                                enumC30117a1 = EnumC30117a1.IN;
                            } else if (iM118766l != 1) {
                                enumC30117a1 = iM118766l != 2 ? null : enumC30117a2;
                            } else {
                                enumC30117a1 = EnumC30117a1.OUT;
                            }
                            if (enumC30117a1 == null) {
                                c36994gM118784j.m118797v(iM118769o);
                                c36994gM118784j.m118797v(iM118766l);
                            } else {
                                this.f123020y |= 8;
                                this.f123012G = enumC30117a1;
                            }
                        } else if (iM118769o == 42) {
                            if ((i13 & 16) != 16) {
                                this.f123013H = new ArrayList();
                                i13 |= 16;
                            }
                            this.f123013H.add(c36992f.m118762h(C30171w0.f123476V, c36998i));
                        } else if (iM118769o == 48) {
                            if ((i13 & 32) != 32) {
                                this.f123014I = new ArrayList();
                                i13 |= 32;
                            }
                            this.f123014I.add(Integer.valueOf(c36992f.m118766l()));
                        } else if (iM118769o == 50) {
                            int iM118759e = c36992f.m118759e(c36992f.m118766l());
                            if ((i13 & 32) != 32 && c36992f.m118757c() > 0) {
                                this.f123014I = new ArrayList();
                                i13 |= 32;
                            }
                            while (c36992f.m118757c() > 0) {
                                this.f123014I.add(Integer.valueOf(c36992f.m118766l()));
                            }
                            c36992f.m118758d(iM118759e);
                        } else if (iM118769o != 802) {
                            if (!m118823n(c36992f, c36994gM118784j, c36998i, iM118769o)) {
                                z4 = true;
                            }
                        } else {
                            if ((i13 & 64) != 64) {
                                this.f123016K = new ArrayList();
                                i13 |= 64;
                            }
                            this.f123016K.add(c36992f.m118762h(C30136h.f123168H, c36998i));
                        }
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
                if ((i13 & 16) == 16) {
                    this.f123013H = Collections.unmodifiableList(this.f123013H);
                }
                if ((i13 & 32) == 32) {
                    this.f123014I = Collections.unmodifiableList(this.f123014I);
                }
                if ((i13 & 64) == 64) {
                    this.f123016K = Collections.unmodifiableList(this.f123016K);
                }
                try {
                    c36994gM118784j.m118785i();
                } catch (IOException unused) {
                } finally {
                    this.f123019x = c36988d.m118737i();
                }
                m118822m();
                throw th3;
            }
        }
        if ((i13 & 16) == 16) {
            this.f123013H = Collections.unmodifiableList(this.f123013H);
        }
        if ((i13 & 32) == 32) {
            this.f123014I = Collections.unmodifiableList(this.f123014I);
        }
        if ((i13 & 64) == 64) {
            this.f123016K = Collections.unmodifiableList(this.f123016K);
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123019x = c36988d.m118737i();
        }
        m118822m();
    }
}
