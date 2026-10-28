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

/* JADX INFO: renamed from: qa3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C30127e extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: P */
    public static final C30127e f123093P;

    /* JADX INFO: renamed from: Q */
    public static final C30115a f123094Q = new C30115a(2);

    /* JADX INFO: renamed from: E */
    public float f123095E;

    /* JADX INFO: renamed from: F */
    public double f123096F;

    /* JADX INFO: renamed from: G */
    public int f123097G;

    /* JADX INFO: renamed from: H */
    public int f123098H;

    /* JADX INFO: renamed from: I */
    public int f123099I;

    /* JADX INFO: renamed from: J */
    public C30136h f123100J;

    /* JADX INFO: renamed from: K */
    public List f123101K;

    /* JADX INFO: renamed from: L */
    public int f123102L;

    /* JADX INFO: renamed from: M */
    public int f123103M;

    /* JADX INFO: renamed from: N */
    public byte f123104N;

    /* JADX INFO: renamed from: O */
    public int f123105O;

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f123106w;

    /* JADX INFO: renamed from: x */
    public int f123107x;

    /* JADX INFO: renamed from: y */
    public EnumC30124d f123108y;

    /* JADX INFO: renamed from: z */
    public long f123109z;

    static {
        C30127e c30127e = new C30127e();
        f123093P = c30127e;
        c30127e.m92299i();
    }

    public C30127e() {
        this.f123104N = (byte) -1;
        this.f123105O = -1;
        this.f123106w = AbstractC36990e.f158321w;
    }

    /* JADX INFO: renamed from: j */
    public static C30121c m92298j(C30127e c30127e) {
        C30121c c30121cM92289k = C30121c.m92289k();
        c30121cM92289k.m92291l(c30127e);
        return c30121cM92289k;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123104N;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f123107x & 128) == 128 && !this.f123100J.mo92260b()) {
            this.f123104N = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < this.f123101K.size(); i13++) {
            if (!((C30127e) this.f123101K.get(i13)).mo92260b()) {
                this.f123104N = (byte) 0;
                return false;
            }
        }
        this.f123104N = (byte) 1;
        return true;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        return m92298j(this);
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123105O;
        if (i13 != -1) {
            return i13;
        }
        int iM118776a = (this.f123107x & 1) == 1 ? C36994g.m118776a(1, this.f123108y.f123081w) : 0;
        if ((this.f123107x & 2) == 2) {
            long j7 = this.f123109z;
            iM118776a += C36994g.m118782g((j7 >> 63) ^ (j7 << 1)) + C36994g.m118783h(2);
        }
        if ((this.f123107x & 4) == 4) {
            iM118776a += C36994g.m118783h(3) + 4;
        }
        if ((this.f123107x & 8) == 8) {
            iM118776a += C36994g.m118783h(4) + 8;
        }
        if ((this.f123107x & 16) == 16) {
            iM118776a += C36994g.m118777b(5, this.f123097G);
        }
        if ((this.f123107x & 32) == 32) {
            iM118776a += C36994g.m118777b(6, this.f123098H);
        }
        if ((this.f123107x & 64) == 64) {
            iM118776a += C36994g.m118777b(7, this.f123099I);
        }
        if ((this.f123107x & 128) == 128) {
            iM118776a += C36994g.m118779d(8, this.f123100J);
        }
        for (int i14 = 0; i14 < this.f123101K.size(); i14++) {
            iM118776a += C36994g.m118779d(9, (InterfaceC37019v) this.f123101K.get(i14));
        }
        if ((this.f123107x & 512) == 512) {
            iM118776a += C36994g.m118777b(10, this.f123103M);
        }
        if ((this.f123107x & 256) == 256) {
            iM118776a += C36994g.m118777b(11, this.f123102L);
        }
        int size = this.f123106w.size() + iM118776a;
        this.f123105O = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30121c.m92289k();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        if ((this.f123107x & 1) == 1) {
            c36994g.m118787l(1, this.f123108y.f123081w);
        }
        if ((this.f123107x & 2) == 2) {
            long j7 = this.f123109z;
            c36994g.m118799x(2, 0);
            c36994g.m118798w((j7 >> 63) ^ (j7 << 1));
        }
        if ((this.f123107x & 4) == 4) {
            float f13 = this.f123095E;
            c36994g.m118799x(3, 5);
            c36994g.m118795t(Float.floatToRawIntBits(f13));
        }
        if ((this.f123107x & 8) == 8) {
            double d3 = this.f123096F;
            c36994g.m118799x(4, 1);
            c36994g.m118796u(Double.doubleToRawLongBits(d3));
        }
        if ((this.f123107x & 16) == 16) {
            c36994g.m118788m(5, this.f123097G);
        }
        if ((this.f123107x & 32) == 32) {
            c36994g.m118788m(6, this.f123098H);
        }
        if ((this.f123107x & 64) == 64) {
            c36994g.m118788m(7, this.f123099I);
        }
        if ((this.f123107x & 128) == 128) {
            c36994g.m118790o(8, this.f123100J);
        }
        for (int i13 = 0; i13 < this.f123101K.size(); i13++) {
            c36994g.m118790o(9, (InterfaceC37019v) this.f123101K.get(i13));
        }
        if ((this.f123107x & 512) == 512) {
            c36994g.m118788m(10, this.f123103M);
        }
        if ((this.f123107x & 256) == 256) {
            c36994g.m118788m(11, this.f123102L);
        }
        c36994g.m118793r(this.f123106w);
    }

    /* JADX INFO: renamed from: i */
    public final void m92299i() {
        this.f123108y = EnumC30124d.BYTE;
        this.f123109z = 0L;
        this.f123095E = 0.0f;
        this.f123096F = 0.0d;
        this.f123097G = 0;
        this.f123098H = 0;
        this.f123099I = 0;
        this.f123100J = C30136h.f123167G;
        this.f123101K = Collections.EMPTY_LIST;
        this.f123102L = 0;
        this.f123103M = 0;
    }

    public C30127e(C30121c c30121c) {
        this.f123104N = (byte) -1;
        this.f123105O = -1;
        this.f123106w = c30121c.f158353w;
    }

    public C30127e(C36992f c36992f, C36998i c36998i) {
        C30133g c30133g;
        this.f123104N = (byte) -1;
        this.f123105O = -1;
        m92299i();
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        boolean z4 = false;
        char c3 = 0;
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    switch (iM118769o) {
                        case 0:
                            break;
                        case 8:
                            int iM118766l = c36992f.m118766l();
                            EnumC30124d enumC30124dM92294b = EnumC30124d.m92294b(iM118766l);
                            if (enumC30124dM92294b == null) {
                                c36994gM118784j.m118797v(iM118769o);
                                c36994gM118784j.m118797v(iM118766l);
                            } else {
                                this.f123107x |= 1;
                                this.f123108y = enumC30124dM92294b;
                                continue;
                            }
                            break;
                        case 16:
                            this.f123107x |= 2;
                            long jM118767m = c36992f.m118767m();
                            this.f123109z = (-(jM118767m & 1)) ^ (jM118767m >>> 1);
                            continue;
                        case 29:
                            this.f123107x |= 4;
                            this.f123095E = Float.intBitsToFloat(c36992f.m118764j());
                            continue;
                        case 33:
                            this.f123107x |= 8;
                            this.f123096F = Double.longBitsToDouble(c36992f.m118765k());
                            continue;
                        case 40:
                            this.f123107x |= 16;
                            this.f123097G = c36992f.m118766l();
                            continue;
                        case 48:
                            this.f123107x |= 32;
                            this.f123098H = c36992f.m118766l();
                            continue;
                        case 56:
                            this.f123107x |= 64;
                            this.f123099I = c36992f.m118766l();
                            continue;
                        case 66:
                            if ((this.f123107x & 128) == 128) {
                                C30136h c30136h = this.f123100J;
                                c30136h.getClass();
                                c30133g = new C30133g(0);
                                c30133g.f123150z = Collections.EMPTY_LIST;
                                c30133g.m92310n(c30136h);
                            } else {
                                c30133g = null;
                            }
                            C30136h c30136h2 = (C30136h) c36992f.m118762h(C30136h.f123168H, c36998i);
                            this.f123100J = c30136h2;
                            if (c30133g != null) {
                                c30133g.m92310n(c30136h2);
                                this.f123100J = c30133g.m92308j();
                            }
                            this.f123107x |= 128;
                            continue;
                        case 74:
                            if ((c3 & 256) != 256) {
                                this.f123101K = new ArrayList();
                                c3 = 256;
                            }
                            this.f123101K.add(c36992f.m118762h(f123094Q, c36998i));
                            continue;
                        case 80:
                            this.f123107x |= 512;
                            this.f123103M = c36992f.m118766l();
                            continue;
                        case 88:
                            this.f123107x |= 256;
                            this.f123102L = c36992f.m118766l();
                            continue;
                        default:
                            if (!c36992f.m118772r(iM118769o, c36994gM118784j)) {
                                break;
                            }
                            break;
                    }
                    z4 = true;
                } catch (Throwable th3) {
                    if ((c3 & 256) == 256) {
                        this.f123101K = Collections.unmodifiableList(this.f123101K);
                    }
                    try {
                        c36994gM118784j.m118785i();
                    } catch (IOException unused) {
                    } finally {
                        this.f123106w = c36988d.m118737i();
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
        if ((c3 & 256) == 256) {
            this.f123101K = Collections.unmodifiableList(this.f123101K);
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123106w = c36988d.m118737i();
        }
    }
}
