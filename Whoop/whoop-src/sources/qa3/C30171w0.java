package qa3;

import androidx.health.platform.client.proto.C1533u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
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

/* JADX INFO: renamed from: qa3.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C30171w0 extends AbstractC37006m {

    /* JADX INFO: renamed from: U */
    public static final C30171w0 f123475U;

    /* JADX INFO: renamed from: V */
    public static final C30115a f123476V = new C30115a(14);

    /* JADX INFO: renamed from: E */
    public boolean f123477E;

    /* JADX INFO: renamed from: F */
    public int f123478F;

    /* JADX INFO: renamed from: G */
    public C30171w0 f123479G;

    /* JADX INFO: renamed from: H */
    public int f123480H;

    /* JADX INFO: renamed from: I */
    public int f123481I;

    /* JADX INFO: renamed from: J */
    public int f123482J;

    /* JADX INFO: renamed from: K */
    public int f123483K;

    /* JADX INFO: renamed from: L */
    public int f123484L;

    /* JADX INFO: renamed from: M */
    public C30171w0 f123485M;

    /* JADX INFO: renamed from: N */
    public int f123486N;

    /* JADX INFO: renamed from: O */
    public C30171w0 f123487O;

    /* JADX INFO: renamed from: P */
    public int f123488P;

    /* JADX INFO: renamed from: Q */
    public int f123489Q;

    /* JADX INFO: renamed from: R */
    public List f123490R;

    /* JADX INFO: renamed from: S */
    public byte f123491S;

    /* JADX INFO: renamed from: T */
    public int f123492T;

    /* JADX INFO: renamed from: x */
    public final AbstractC36990e f123493x;

    /* JADX INFO: renamed from: y */
    public int f123494y;

    /* JADX INFO: renamed from: z */
    public List f123495z;

    static {
        C30171w0 c30171w0 = new C30171w0();
        f123475U = c30171w0;
        c30171w0.m92363q();
    }

    public C30171w0(C30169v0 c30169v0) {
        super(c30169v0);
        this.f123491S = (byte) -1;
        this.f123492T = -1;
        this.f123493x = c30169v0.f158353w;
    }

    /* JADX INFO: renamed from: r */
    public static C30169v0 m92361r(C30171w0 c30171w0) {
        C30169v0 c30169v0M92355l = C30169v0.m92355l();
        c30169v0M92355l.m92357n(c30171w0);
        return c30169v0M92355l;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: a */
    public final InterfaceC37019v mo92288a() {
        return f123475U;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123491S;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i13 = 0; i13 < this.f123495z.size(); i13++) {
            if (!((C30167u0) this.f123495z.get(i13)).mo92260b()) {
                this.f123491S = (byte) 0;
                return false;
            }
        }
        if ((this.f123494y & 4) == 4 && !this.f123479G.mo92260b()) {
            this.f123491S = (byte) 0;
            return false;
        }
        if ((this.f123494y & 256) == 256 && !this.f123485M.mo92260b()) {
            this.f123491S = (byte) 0;
            return false;
        }
        if ((this.f123494y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 1024 && !this.f123487O.mo92260b()) {
            this.f123491S = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < this.f123490R.size(); i14++) {
            if (!((C30136h) this.f123490R.get(i14)).mo92260b()) {
                this.f123491S = (byte) 0;
                return false;
            }
        }
        if (m118818i()) {
            this.f123491S = (byte) 1;
            return true;
        }
        this.f123491S = (byte) 0;
        return false;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123492T;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f123494y & 4096) == 4096 ? C36994g.m118777b(1, this.f123489Q) : 0;
        for (int i14 = 0; i14 < this.f123495z.size(); i14++) {
            iM118777b += C36994g.m118779d(2, (InterfaceC37019v) this.f123495z.get(i14));
        }
        if ((this.f123494y & 1) == 1) {
            iM118777b += C36994g.m118783h(3) + 1;
        }
        if ((this.f123494y & 2) == 2) {
            iM118777b += C36994g.m118777b(4, this.f123478F);
        }
        if ((this.f123494y & 4) == 4) {
            iM118777b += C36994g.m118779d(5, this.f123479G);
        }
        if ((this.f123494y & 16) == 16) {
            iM118777b += C36994g.m118777b(6, this.f123481I);
        }
        if ((this.f123494y & 32) == 32) {
            iM118777b += C36994g.m118777b(7, this.f123482J);
        }
        if ((this.f123494y & 8) == 8) {
            iM118777b += C36994g.m118777b(8, this.f123480H);
        }
        if ((this.f123494y & 64) == 64) {
            iM118777b += C36994g.m118777b(9, this.f123483K);
        }
        if ((this.f123494y & 256) == 256) {
            iM118777b += C36994g.m118779d(10, this.f123485M);
        }
        if ((this.f123494y & 512) == 512) {
            iM118777b += C36994g.m118777b(11, this.f123486N);
        }
        if ((this.f123494y & 128) == 128) {
            iM118777b += C36994g.m118777b(12, this.f123484L);
        }
        if ((this.f123494y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 1024) {
            iM118777b += C36994g.m118779d(13, this.f123487O);
        }
        if ((this.f123494y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 2048) {
            iM118777b += C36994g.m118777b(14, this.f123488P);
        }
        for (int i15 = 0; i15 < this.f123490R.size(); i15++) {
            iM118777b += C36994g.m118779d(100, (InterfaceC37019v) this.f123490R.get(i15));
        }
        int size = this.f123493x.size() + m118819j() + iM118777b;
        this.f123492T = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30169v0.m92355l();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        C28539n0 c28539n0 = new C28539n0(this);
        if ((this.f123494y & 4096) == 4096) {
            c36994g.m118788m(1, this.f123489Q);
        }
        for (int i13 = 0; i13 < this.f123495z.size(); i13++) {
            c36994g.m118790o(2, (InterfaceC37019v) this.f123495z.get(i13));
        }
        if ((this.f123494y & 1) == 1) {
            boolean z4 = this.f123477E;
            c36994g.m118799x(3, 0);
            c36994g.m118792q(z4 ? 1 : 0);
        }
        if ((this.f123494y & 2) == 2) {
            c36994g.m118788m(4, this.f123478F);
        }
        if ((this.f123494y & 4) == 4) {
            c36994g.m118790o(5, this.f123479G);
        }
        if ((this.f123494y & 16) == 16) {
            c36994g.m118788m(6, this.f123481I);
        }
        if ((this.f123494y & 32) == 32) {
            c36994g.m118788m(7, this.f123482J);
        }
        if ((this.f123494y & 8) == 8) {
            c36994g.m118788m(8, this.f123480H);
        }
        if ((this.f123494y & 64) == 64) {
            c36994g.m118788m(9, this.f123483K);
        }
        if ((this.f123494y & 256) == 256) {
            c36994g.m118790o(10, this.f123485M);
        }
        if ((this.f123494y & 512) == 512) {
            c36994g.m118788m(11, this.f123486N);
        }
        if ((this.f123494y & 128) == 128) {
            c36994g.m118788m(12, this.f123484L);
        }
        if ((this.f123494y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 1024) {
            c36994g.m118790o(13, this.f123487O);
        }
        if ((this.f123494y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 2048) {
            c36994g.m118788m(14, this.f123488P);
        }
        for (int i14 = 0; i14 < this.f123490R.size(); i14++) {
            c36994g.m118790o(100, (InterfaceC37019v) this.f123490R.get(i14));
        }
        c28539n0.m86842n(200, c36994g);
        c36994g.m118793r(this.f123493x);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m92362p() {
        return (this.f123494y & 16) == 16;
    }

    /* JADX INFO: renamed from: q */
    public final void m92363q() {
        List list = Collections.EMPTY_LIST;
        this.f123495z = list;
        this.f123477E = false;
        this.f123478F = 0;
        C30171w0 c30171w0 = f123475U;
        this.f123479G = c30171w0;
        this.f123480H = 0;
        this.f123481I = 0;
        this.f123482J = 0;
        this.f123483K = 0;
        this.f123484L = 0;
        this.f123485M = c30171w0;
        this.f123486N = 0;
        this.f123487O = c30171w0;
        this.f123488P = 0;
        this.f123489Q = 0;
        this.f123490R = list;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final C30169v0 mo92261c() {
        return m92361r(this);
    }

    public C30171w0() {
        this.f123491S = (byte) -1;
        this.f123492T = -1;
        this.f123493x = AbstractC36990e.f158321w;
    }

    public C30171w0(C36992f c36992f, C36998i c36998i) {
        this.f123491S = (byte) -1;
        this.f123492T = -1;
        m92363q();
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        boolean z4 = false;
        int i13 = 0;
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    C30115a c30115a = f123476V;
                    C30169v0 c30169v0M92361r = null;
                    switch (iM118769o) {
                        case 0:
                            break;
                        case 8:
                            this.f123494y |= 4096;
                            this.f123489Q = c36992f.m118766l();
                            continue;
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            if ((i13 & 1) != 1) {
                                this.f123495z = new ArrayList();
                                i13 |= 1;
                            }
                            this.f123495z.add(c36992f.m118762h(C30167u0.f123437I, c36998i));
                            continue;
                        case 24:
                            this.f123494y |= 1;
                            this.f123477E = c36992f.m118767m() != 0;
                            continue;
                        case 32:
                            this.f123494y |= 2;
                            this.f123478F = c36992f.m118766l();
                            continue;
                        case 42:
                            if ((this.f123494y & 4) == 4) {
                                C30171w0 c30171w0 = this.f123479G;
                                c30171w0.getClass();
                                c30169v0M92361r = m92361r(c30171w0);
                            }
                            C30171w0 c30171w1 = (C30171w0) c36992f.m118762h(c30115a, c36998i);
                            this.f123479G = c30171w1;
                            if (c30169v0M92361r != null) {
                                c30169v0M92361r.m92357n(c30171w1);
                                this.f123479G = c30169v0M92361r.m92356k();
                            }
                            this.f123494y |= 4;
                            continue;
                        case 48:
                            this.f123494y |= 16;
                            this.f123481I = c36992f.m118766l();
                            continue;
                        case 56:
                            this.f123494y |= 32;
                            this.f123482J = c36992f.m118766l();
                            continue;
                        case 64:
                            this.f123494y |= 8;
                            this.f123480H = c36992f.m118766l();
                            continue;
                        case 72:
                            this.f123494y |= 64;
                            this.f123483K = c36992f.m118766l();
                            continue;
                        case 82:
                            if ((this.f123494y & 256) == 256) {
                                C30171w0 c30171w2 = this.f123485M;
                                c30171w2.getClass();
                                c30169v0M92361r = m92361r(c30171w2);
                            }
                            C30171w0 c30171w3 = (C30171w0) c36992f.m118762h(c30115a, c36998i);
                            this.f123485M = c30171w3;
                            if (c30169v0M92361r != null) {
                                c30169v0M92361r.m92357n(c30171w3);
                                this.f123485M = c30169v0M92361r.m92356k();
                            }
                            this.f123494y |= 256;
                            continue;
                        case 88:
                            this.f123494y |= 512;
                            this.f123486N = c36992f.m118766l();
                            continue;
                        case 96:
                            this.f123494y |= 128;
                            this.f123484L = c36992f.m118766l();
                            continue;
                        case 106:
                            if ((this.f123494y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 1024) {
                                C30171w0 c30171w4 = this.f123487O;
                                c30171w4.getClass();
                                c30169v0M92361r = m92361r(c30171w4);
                            }
                            C30171w0 c30171w5 = (C30171w0) c36992f.m118762h(c30115a, c36998i);
                            this.f123487O = c30171w5;
                            if (c30169v0M92361r != null) {
                                c30169v0M92361r.m92357n(c30171w5);
                                this.f123487O = c30169v0M92361r.m92356k();
                            }
                            this.f123494y |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                            continue;
                        case 112:
                            this.f123494y |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            this.f123488P = c36992f.m118766l();
                            continue;
                        case 802:
                            if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 16384) {
                                this.f123490R = new ArrayList();
                                i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                            }
                            this.f123490R.add(c36992f.m118762h(C30136h.f123168H, c36998i));
                            continue;
                        default:
                            if (!m118823n(c36992f, c36994gM118784j, c36998i, iM118769o)) {
                                break;
                            }
                            break;
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
                if ((i13 & 1) == 1) {
                    this.f123495z = Collections.unmodifiableList(this.f123495z);
                }
                if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 16384) {
                    this.f123490R = Collections.unmodifiableList(this.f123490R);
                }
                try {
                    c36994gM118784j.m118785i();
                } catch (IOException unused) {
                } finally {
                    this.f123493x = c36988d.m118737i();
                }
                m118822m();
                throw th3;
            }
        }
        if ((i13 & 1) == 1) {
            this.f123495z = Collections.unmodifiableList(this.f123495z);
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 16384) {
            this.f123490R = Collections.unmodifiableList(this.f123490R);
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123493x = c36988d.m118737i();
        }
        m118822m();
    }
}
