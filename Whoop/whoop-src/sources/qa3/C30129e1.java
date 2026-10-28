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

/* JADX INFO: renamed from: qa3.e1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C30129e1 extends AbstractC37006m {

    /* JADX INFO: renamed from: N */
    public static final C30129e1 f123112N;

    /* JADX INFO: renamed from: O */
    public static final C30115a f123113O = new C30115a(18);

    /* JADX INFO: renamed from: E */
    public int f123114E;

    /* JADX INFO: renamed from: F */
    public C30171w0 f123115F;

    /* JADX INFO: renamed from: G */
    public int f123116G;

    /* JADX INFO: renamed from: H */
    public C30171w0 f123117H;

    /* JADX INFO: renamed from: I */
    public int f123118I;

    /* JADX INFO: renamed from: J */
    public List f123119J;

    /* JADX INFO: renamed from: K */
    public C30127e f123120K;

    /* JADX INFO: renamed from: L */
    public byte f123121L;

    /* JADX INFO: renamed from: M */
    public int f123122M;

    /* JADX INFO: renamed from: x */
    public final AbstractC36990e f123123x;

    /* JADX INFO: renamed from: y */
    public int f123124y;

    /* JADX INFO: renamed from: z */
    public int f123125z;

    static {
        C30129e1 c30129e1 = new C30129e1();
        f123112N = c30129e1;
        c30129e1.f123125z = 0;
        c30129e1.f123114E = 0;
        C30171w0 c30171w0 = C30171w0.f123475U;
        c30129e1.f123115F = c30171w0;
        c30129e1.f123116G = 0;
        c30129e1.f123117H = c30171w0;
        c30129e1.f123118I = 0;
        c30129e1.f123119J = Collections.EMPTY_LIST;
        c30129e1.f123120K = C30127e.f123093P;
    }

    public C30129e1(C30126d1 c30126d1) {
        super(c30126d1);
        this.f123121L = (byte) -1;
        this.f123122M = -1;
        this.f123123x = c30126d1.f158353w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: a */
    public final InterfaceC37019v mo92288a() {
        return f123112N;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123121L;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i13 = this.f123124y;
        if ((i13 & 2) != 2) {
            this.f123121L = (byte) 0;
            return false;
        }
        if ((i13 & 4) == 4 && !this.f123115F.mo92260b()) {
            this.f123121L = (byte) 0;
            return false;
        }
        if ((this.f123124y & 16) == 16 && !this.f123117H.mo92260b()) {
            this.f123121L = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < this.f123119J.size(); i14++) {
            if (!((C30136h) this.f123119J.get(i14)).mo92260b()) {
                this.f123121L = (byte) 0;
                return false;
            }
        }
        if ((this.f123124y & 64) == 64 && !this.f123120K.mo92260b()) {
            this.f123121L = (byte) 0;
            return false;
        }
        if (m118818i()) {
            this.f123121L = (byte) 1;
            return true;
        }
        this.f123121L = (byte) 0;
        return false;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30126d1 c30126d1M92295l = C30126d1.m92295l();
        c30126d1M92295l.m92297n(this);
        return c30126d1M92295l;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123122M;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f123124y & 1) == 1 ? C36994g.m118777b(1, this.f123125z) : 0;
        if ((this.f123124y & 2) == 2) {
            iM118777b += C36994g.m118777b(2, this.f123114E);
        }
        if ((this.f123124y & 4) == 4) {
            iM118777b += C36994g.m118779d(3, this.f123115F);
        }
        if ((this.f123124y & 16) == 16) {
            iM118777b += C36994g.m118779d(4, this.f123117H);
        }
        if ((this.f123124y & 8) == 8) {
            iM118777b += C36994g.m118777b(5, this.f123116G);
        }
        if ((this.f123124y & 32) == 32) {
            iM118777b += C36994g.m118777b(6, this.f123118I);
        }
        for (int i14 = 0; i14 < this.f123119J.size(); i14++) {
            iM118777b += C36994g.m118779d(7, (InterfaceC37019v) this.f123119J.get(i14));
        }
        if ((this.f123124y & 64) == 64) {
            iM118777b += C36994g.m118779d(8, this.f123120K);
        }
        int size = this.f123123x.size() + m118819j() + iM118777b;
        this.f123122M = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30126d1.m92295l();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        C28539n0 c28539n0 = new C28539n0(this);
        if ((this.f123124y & 1) == 1) {
            c36994g.m118788m(1, this.f123125z);
        }
        if ((this.f123124y & 2) == 2) {
            c36994g.m118788m(2, this.f123114E);
        }
        if ((this.f123124y & 4) == 4) {
            c36994g.m118790o(3, this.f123115F);
        }
        if ((this.f123124y & 16) == 16) {
            c36994g.m118790o(4, this.f123117H);
        }
        if ((this.f123124y & 8) == 8) {
            c36994g.m118788m(5, this.f123116G);
        }
        if ((this.f123124y & 32) == 32) {
            c36994g.m118788m(6, this.f123118I);
        }
        for (int i13 = 0; i13 < this.f123119J.size(); i13++) {
            c36994g.m118790o(7, (InterfaceC37019v) this.f123119J.get(i13));
        }
        if ((this.f123124y & 64) == 64) {
            c36994g.m118790o(8, this.f123120K);
        }
        c28539n0.m86842n(200, c36994g);
        c36994g.m118793r(this.f123123x);
    }

    /* JADX INFO: renamed from: p */
    public final C30126d1 m92300p() {
        C30126d1 c30126d1M92295l = C30126d1.m92295l();
        c30126d1M92295l.m92297n(this);
        return c30126d1M92295l;
    }

    public C30129e1() {
        this.f123121L = (byte) -1;
        this.f123122M = -1;
        this.f123123x = AbstractC36990e.f158321w;
    }

    public C30129e1(C36992f c36992f, C36998i c36998i) {
        this.f123121L = (byte) -1;
        this.f123122M = -1;
        boolean z4 = false;
        this.f123125z = 0;
        this.f123114E = 0;
        C30171w0 c30171w0 = C30171w0.f123475U;
        this.f123115F = c30171w0;
        this.f123116G = 0;
        this.f123117H = c30171w0;
        this.f123118I = 0;
        this.f123119J = Collections.EMPTY_LIST;
        this.f123120K = C30127e.f123093P;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        char c3 = 0;
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    if (iM118769o != 0) {
                        if (iM118769o == 8) {
                            this.f123124y |= 1;
                            this.f123125z = c36992f.m118766l();
                        } else if (iM118769o != 16) {
                            C30121c c30121cM92298j = null;
                            C30169v0 c30169v0M92361r = null;
                            C30169v0 c30169v0M92361r2 = null;
                            if (iM118769o == 26) {
                                if ((this.f123124y & 4) == 4) {
                                    C30171w0 c30171w1 = this.f123115F;
                                    c30171w1.getClass();
                                    c30169v0M92361r = C30171w0.m92361r(c30171w1);
                                }
                                C30171w0 c30171w2 = (C30171w0) c36992f.m118762h(C30171w0.f123476V, c36998i);
                                this.f123115F = c30171w2;
                                if (c30169v0M92361r != null) {
                                    c30169v0M92361r.m92357n(c30171w2);
                                    this.f123115F = c30169v0M92361r.m92356k();
                                }
                                this.f123124y |= 4;
                            } else if (iM118769o == 34) {
                                if ((this.f123124y & 16) == 16) {
                                    C30171w0 c30171w3 = this.f123117H;
                                    c30171w3.getClass();
                                    c30169v0M92361r2 = C30171w0.m92361r(c30171w3);
                                }
                                C30171w0 c30171w4 = (C30171w0) c36992f.m118762h(C30171w0.f123476V, c36998i);
                                this.f123117H = c30171w4;
                                if (c30169v0M92361r2 != null) {
                                    c30169v0M92361r2.m92357n(c30171w4);
                                    this.f123117H = c30169v0M92361r2.m92356k();
                                }
                                this.f123124y |= 16;
                            } else if (iM118769o == 40) {
                                this.f123124y |= 8;
                                this.f123116G = c36992f.m118766l();
                            } else if (iM118769o == 48) {
                                this.f123124y |= 32;
                                this.f123118I = c36992f.m118766l();
                            } else if (iM118769o == 58) {
                                int i13 = (c3 == true ? 1 : 0) & '@';
                                c3 = c3;
                                if (i13 != 64) {
                                    this.f123119J = new ArrayList();
                                    c3 = '@';
                                }
                                this.f123119J.add(c36992f.m118762h(C30136h.f123168H, c36998i));
                            } else if (iM118769o != 66) {
                                if (!m118823n(c36992f, c36994gM118784j, c36998i, iM118769o)) {
                                }
                            } else {
                                if ((this.f123124y & 64) == 64) {
                                    C30127e c30127e = this.f123120K;
                                    c30127e.getClass();
                                    c30121cM92298j = C30127e.m92298j(c30127e);
                                }
                                C30127e c30127e2 = (C30127e) c36992f.m118762h(C30127e.f123094Q, c36998i);
                                this.f123120K = c30127e2;
                                if (c30121cM92298j != null) {
                                    c30121cM92298j.m92291l(c30127e2);
                                    this.f123120K = c30121cM92298j.m92290j();
                                }
                                this.f123124y |= 64;
                            }
                        } else {
                            this.f123124y |= 2;
                            this.f123114E = c36992f.m118766l();
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
                if (((c3 == true ? 1 : 0) & '@') == 64) {
                    this.f123119J = Collections.unmodifiableList(this.f123119J);
                }
                try {
                    c36994gM118784j.m118785i();
                } catch (IOException unused) {
                } finally {
                    this.f123123x = c36988d.m118737i();
                }
                m118822m();
                throw th3;
            }
        }
        if (((c3 == true ? 1 : 0) & '@') == 64) {
            this.f123119J = Collections.unmodifiableList(this.f123119J);
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123123x = c36988d.m118737i();
        }
        m118822m();
    }
}
