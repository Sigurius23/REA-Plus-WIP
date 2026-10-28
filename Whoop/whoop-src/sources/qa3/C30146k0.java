package qa3;

import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1707m0;
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

/* JADX INFO: renamed from: qa3.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C30146k0 extends AbstractC37006m {

    /* JADX INFO: renamed from: e0 */
    public static final C30146k0 f123302e0;

    /* JADX INFO: renamed from: f0 */
    public static final C30115a f123303f0 = new C30115a(10);

    /* JADX INFO: renamed from: E */
    public int f123304E;

    /* JADX INFO: renamed from: F */
    public int f123305F;

    /* JADX INFO: renamed from: G */
    public C30171w0 f123306G;

    /* JADX INFO: renamed from: H */
    public int f123307H;

    /* JADX INFO: renamed from: I */
    public List f123308I;

    /* JADX INFO: renamed from: J */
    public C30171w0 f123309J;

    /* JADX INFO: renamed from: K */
    public int f123310K;

    /* JADX INFO: renamed from: L */
    public List f123311L;

    /* JADX INFO: renamed from: M */
    public List f123312M;

    /* JADX INFO: renamed from: N */
    public int f123313N;

    /* JADX INFO: renamed from: O */
    public List f123314O;

    /* JADX INFO: renamed from: P */
    public C30129e1 f123315P;

    /* JADX INFO: renamed from: Q */
    public int f123316Q;

    /* JADX INFO: renamed from: R */
    public int f123317R;

    /* JADX INFO: renamed from: S */
    public List f123318S;

    /* JADX INFO: renamed from: T */
    public List f123319T;

    /* JADX INFO: renamed from: U */
    public List f123320U;

    /* JADX INFO: renamed from: V */
    public List f123321V;

    /* JADX INFO: renamed from: W */
    public List f123322W;

    /* JADX INFO: renamed from: X */
    public List f123323X;

    /* JADX INFO: renamed from: Y */
    public List f123324Y;

    /* JADX INFO: renamed from: Z */
    public List f123325Z;

    /* JADX INFO: renamed from: a0 */
    public C30158q f123326a0;

    /* JADX INFO: renamed from: b0 */
    public C30158q f123327b0;

    /* JADX INFO: renamed from: c0 */
    public byte f123328c0;

    /* JADX INFO: renamed from: d0 */
    public int f123329d0;

    /* JADX INFO: renamed from: x */
    public final AbstractC36990e f123330x;

    /* JADX INFO: renamed from: y */
    public int f123331y;

    /* JADX INFO: renamed from: z */
    public int f123332z;

    static {
        C30146k0 c30146k0 = new C30146k0();
        f123302e0 = c30146k0;
        c30146k0.m92325p();
    }

    public C30146k0(C30143j0 c30143j0) {
        super(c30143j0);
        this.f123313N = -1;
        this.f123328c0 = (byte) -1;
        this.f123329d0 = -1;
        this.f123330x = c30143j0.f158353w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: a */
    public final InterfaceC37019v mo92288a() {
        return f123302e0;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123328c0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i13 = this.f123331y;
        if ((i13 & 4) != 4) {
            this.f123328c0 = (byte) 0;
            return false;
        }
        if ((i13 & 8) == 8 && !this.f123306G.mo92260b()) {
            this.f123328c0 = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < this.f123308I.size(); i14++) {
            if (!((C30120b1) this.f123308I.get(i14)).mo92260b()) {
                this.f123328c0 = (byte) 0;
                return false;
            }
        }
        if ((this.f123331y & 32) == 32 && !this.f123309J.mo92260b()) {
            this.f123328c0 = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < this.f123311L.size(); i15++) {
            if (!((C30171w0) this.f123311L.get(i15)).mo92260b()) {
                this.f123328c0 = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f123314O.size(); i16++) {
            if (!((C30129e1) this.f123314O.get(i16)).mo92260b()) {
                this.f123328c0 = (byte) 0;
                return false;
            }
        }
        if ((this.f123331y & 128) == 128 && !this.f123315P.mo92260b()) {
            this.f123328c0 = (byte) 0;
            return false;
        }
        for (int i17 = 0; i17 < this.f123319T.size(); i17++) {
            if (!((C30150m) this.f123319T.get(i17)).mo92260b()) {
                this.f123328c0 = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < this.f123320U.size(); i18++) {
            if (!((C30136h) this.f123320U.get(i18)).mo92260b()) {
                this.f123328c0 = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < this.f123321V.size(); i19++) {
            if (!((C30136h) this.f123321V.get(i19)).mo92260b()) {
                this.f123328c0 = (byte) 0;
                return false;
            }
        }
        for (int i24 = 0; i24 < this.f123322W.size(); i24++) {
            if (!((C30136h) this.f123322W.get(i24)).mo92260b()) {
                this.f123328c0 = (byte) 0;
                return false;
            }
        }
        for (int i25 = 0; i25 < this.f123323X.size(); i25++) {
            if (!((C30136h) this.f123323X.get(i25)).mo92260b()) {
                this.f123328c0 = (byte) 0;
                return false;
            }
        }
        for (int i26 = 0; i26 < this.f123324Y.size(); i26++) {
            if (!((C30136h) this.f123324Y.get(i26)).mo92260b()) {
                this.f123328c0 = (byte) 0;
                return false;
            }
        }
        for (int i27 = 0; i27 < this.f123325Z.size(); i27++) {
            if (!((C30136h) this.f123325Z.get(i27)).mo92260b()) {
                this.f123328c0 = (byte) 0;
                return false;
            }
        }
        if ((this.f123331y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 1024 && !this.f123326a0.mo92260b()) {
            this.f123328c0 = (byte) 0;
            return false;
        }
        if ((this.f123331y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 2048 && !this.f123327b0.mo92260b()) {
            this.f123328c0 = (byte) 0;
            return false;
        }
        if (m118818i()) {
            this.f123328c0 = (byte) 1;
            return true;
        }
        this.f123328c0 = (byte) 0;
        return false;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30143j0 c30143j0M92320n = C30143j0.m92320n();
        c30143j0M92320n.m92322o(this);
        return c30143j0M92320n;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123329d0;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f123331y & 2) == 2 ? C36994g.m118777b(1, this.f123304E) : 0;
        if ((this.f123331y & 4) == 4) {
            iM118777b += C36994g.m118777b(2, this.f123305F);
        }
        if ((this.f123331y & 8) == 8) {
            iM118777b += C36994g.m118779d(3, this.f123306G);
        }
        for (int i14 = 0; i14 < this.f123308I.size(); i14++) {
            iM118777b += C36994g.m118779d(4, (InterfaceC37019v) this.f123308I.get(i14));
        }
        if ((this.f123331y & 32) == 32) {
            iM118777b += C36994g.m118779d(5, this.f123309J);
        }
        if ((this.f123331y & 128) == 128) {
            iM118777b += C36994g.m118779d(6, this.f123315P);
        }
        if ((this.f123331y & 256) == 256) {
            iM118777b += C36994g.m118777b(7, this.f123316Q);
        }
        if ((this.f123331y & 512) == 512) {
            iM118777b += C36994g.m118777b(8, this.f123317R);
        }
        if ((this.f123331y & 16) == 16) {
            iM118777b += C36994g.m118777b(9, this.f123307H);
        }
        if ((this.f123331y & 64) == 64) {
            iM118777b += C36994g.m118777b(10, this.f123310K);
        }
        if ((this.f123331y & 1) == 1) {
            iM118777b += C36994g.m118777b(11, this.f123332z);
        }
        for (int i15 = 0; i15 < this.f123311L.size(); i15++) {
            iM118777b += C36994g.m118779d(12, (InterfaceC37019v) this.f123311L.get(i15));
        }
        int iM118778c = 0;
        for (int i16 = 0; i16 < this.f123312M.size(); i16++) {
            iM118778c += C36994g.m118778c(((Integer) this.f123312M.get(i16)).intValue());
        }
        int iM118779d = iM118777b + iM118778c;
        if (!this.f123312M.isEmpty()) {
            iM118779d = iM118779d + 1 + C36994g.m118778c(iM118778c);
        }
        this.f123313N = iM118778c;
        for (int i17 = 0; i17 < this.f123320U.size(); i17++) {
            iM118779d += C36994g.m118779d(14, (InterfaceC37019v) this.f123320U.get(i17));
        }
        for (int i18 = 0; i18 < this.f123321V.size(); i18++) {
            iM118779d += C36994g.m118779d(15, (InterfaceC37019v) this.f123321V.get(i18));
        }
        for (int i19 = 0; i19 < this.f123322W.size(); i19++) {
            iM118779d += C36994g.m118779d(16, (InterfaceC37019v) this.f123322W.get(i19));
        }
        for (int i24 = 0; i24 < this.f123314O.size(); i24++) {
            iM118779d += C36994g.m118779d(17, (InterfaceC37019v) this.f123314O.get(i24));
        }
        int iM118778c2 = 0;
        for (int i25 = 0; i25 < this.f123318S.size(); i25++) {
            iM118778c2 += C36994g.m118778c(((Integer) this.f123318S.get(i25)).intValue());
        }
        int size = (this.f123318S.size() * 2) + iM118779d + iM118778c2;
        for (int i26 = 0; i26 < this.f123319T.size(); i26++) {
            size += C36994g.m118779d(32, (InterfaceC37019v) this.f123319T.get(i26));
        }
        for (int i27 = 0; i27 < this.f123323X.size(); i27++) {
            size += C36994g.m118779d(33, (InterfaceC37019v) this.f123323X.get(i27));
        }
        for (int i28 = 0; i28 < this.f123324Y.size(); i28++) {
            size += C36994g.m118779d(34, (InterfaceC37019v) this.f123324Y.get(i28));
        }
        for (int i29 = 0; i29 < this.f123325Z.size(); i29++) {
            size += C36994g.m118779d(35, (InterfaceC37019v) this.f123325Z.get(i29));
        }
        if ((this.f123331y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 1024) {
            size += C36994g.m118779d(40, this.f123326a0);
        }
        if ((this.f123331y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 2048) {
            size += C36994g.m118779d(41, this.f123327b0);
        }
        int size2 = this.f123330x.size() + m118819j() + size;
        this.f123329d0 = size2;
        return size2;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30143j0.m92320n();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        C28539n0 c28539n0 = new C28539n0(this);
        if ((this.f123331y & 2) == 2) {
            c36994g.m118788m(1, this.f123304E);
        }
        if ((this.f123331y & 4) == 4) {
            c36994g.m118788m(2, this.f123305F);
        }
        if ((this.f123331y & 8) == 8) {
            c36994g.m118790o(3, this.f123306G);
        }
        for (int i13 = 0; i13 < this.f123308I.size(); i13++) {
            c36994g.m118790o(4, (InterfaceC37019v) this.f123308I.get(i13));
        }
        if ((this.f123331y & 32) == 32) {
            c36994g.m118790o(5, this.f123309J);
        }
        if ((this.f123331y & 128) == 128) {
            c36994g.m118790o(6, this.f123315P);
        }
        if ((this.f123331y & 256) == 256) {
            c36994g.m118788m(7, this.f123316Q);
        }
        if ((this.f123331y & 512) == 512) {
            c36994g.m118788m(8, this.f123317R);
        }
        if ((this.f123331y & 16) == 16) {
            c36994g.m118788m(9, this.f123307H);
        }
        if ((this.f123331y & 64) == 64) {
            c36994g.m118788m(10, this.f123310K);
        }
        if ((this.f123331y & 1) == 1) {
            c36994g.m118788m(11, this.f123332z);
        }
        for (int i14 = 0; i14 < this.f123311L.size(); i14++) {
            c36994g.m118790o(12, (InterfaceC37019v) this.f123311L.get(i14));
        }
        if (this.f123312M.size() > 0) {
            c36994g.m118797v(106);
            c36994g.m118797v(this.f123313N);
        }
        for (int i15 = 0; i15 < this.f123312M.size(); i15++) {
            c36994g.m118789n(((Integer) this.f123312M.get(i15)).intValue());
        }
        for (int i16 = 0; i16 < this.f123320U.size(); i16++) {
            c36994g.m118790o(14, (InterfaceC37019v) this.f123320U.get(i16));
        }
        for (int i17 = 0; i17 < this.f123321V.size(); i17++) {
            c36994g.m118790o(15, (InterfaceC37019v) this.f123321V.get(i17));
        }
        for (int i18 = 0; i18 < this.f123322W.size(); i18++) {
            c36994g.m118790o(16, (InterfaceC37019v) this.f123322W.get(i18));
        }
        for (int i19 = 0; i19 < this.f123314O.size(); i19++) {
            c36994g.m118790o(17, (InterfaceC37019v) this.f123314O.get(i19));
        }
        for (int i24 = 0; i24 < this.f123318S.size(); i24++) {
            c36994g.m118788m(31, ((Integer) this.f123318S.get(i24)).intValue());
        }
        for (int i25 = 0; i25 < this.f123319T.size(); i25++) {
            c36994g.m118790o(32, (InterfaceC37019v) this.f123319T.get(i25));
        }
        for (int i26 = 0; i26 < this.f123323X.size(); i26++) {
            c36994g.m118790o(33, (InterfaceC37019v) this.f123323X.get(i26));
        }
        for (int i27 = 0; i27 < this.f123324Y.size(); i27++) {
            c36994g.m118790o(34, (InterfaceC37019v) this.f123324Y.get(i27));
        }
        for (int i28 = 0; i28 < this.f123325Z.size(); i28++) {
            c36994g.m118790o(35, (InterfaceC37019v) this.f123325Z.get(i28));
        }
        if ((this.f123331y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 1024) {
            c36994g.m118790o(40, this.f123326a0);
        }
        if ((this.f123331y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 2048) {
            c36994g.m118790o(41, this.f123327b0);
        }
        c28539n0.m86842n(19000, c36994g);
        c36994g.m118793r(this.f123330x);
    }

    /* JADX INFO: renamed from: p */
    public final void m92325p() {
        this.f123332z = 518;
        this.f123304E = 2054;
        this.f123305F = 0;
        C30171w0 c30171w0 = C30171w0.f123475U;
        this.f123306G = c30171w0;
        this.f123307H = 0;
        List list = Collections.EMPTY_LIST;
        this.f123308I = list;
        this.f123309J = c30171w0;
        this.f123310K = 0;
        this.f123311L = list;
        this.f123312M = list;
        this.f123314O = list;
        this.f123315P = C30129e1.f123112N;
        this.f123316Q = 0;
        this.f123317R = 0;
        this.f123318S = list;
        this.f123319T = list;
        this.f123320U = list;
        this.f123321V = list;
        this.f123322W = list;
        this.f123323X = list;
        this.f123324Y = list;
        this.f123325Z = list;
        C30158q c30158q = C30158q.f123391E;
        this.f123326a0 = c30158q;
        this.f123327b0 = c30158q;
    }

    public C30146k0() {
        this.f123313N = -1;
        this.f123328c0 = (byte) -1;
        this.f123329d0 = -1;
        this.f123330x = AbstractC36990e.f158321w;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0040  */
    /* JADX WARN: Multi-variable type inference failed */
    public C30146k0(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30156p c30156p;
        C30156p c30156p2;
        this.f123313N = -1;
        this.f123328c0 = (byte) -1;
        this.f123329d0 = -1;
        m92325p();
        C36988d c36988dM118742l = AbstractC36990e.m118742l();
        boolean z4 = true;
        C36994g c36994gM118784j = C36994g.m118784j(c36988dM118742l, 1);
        boolean z13 = false;
        int i13 = 0;
        while (true) {
            boolean z14 = z4;
            if (!z13) {
                try {
                    try {
                        int iM118769o = c36992f.m118769o();
                        switch (iM118769o) {
                            case 0:
                                z13 = z14;
                                z4 = z14;
                                break;
                            case 8:
                                this.f123331y |= 2;
                                this.f123304E = c36992f.m118761g();
                                z4 = z14;
                                break;
                            case 16:
                                this.f123331y |= 4;
                                this.f123305F = c36992f.m118761g();
                                z4 = z14;
                                break;
                            case 26:
                                C30169v0 c30169v0Mo92261c = (this.f123331y & 8) == 8 ? this.f123306G.mo92261c() : null;
                                C30171w0 c30171w0 = (C30171w0) c36992f.m118762h(C30171w0.f123476V, c36998i);
                                this.f123306G = c30171w0;
                                if (c30169v0Mo92261c != 0) {
                                    c30169v0Mo92261c.m92357n(c30171w0);
                                    this.f123306G = c30169v0Mo92261c.m92356k();
                                }
                                this.f123331y |= 8;
                                z4 = z14;
                                break;
                            case 34:
                                if ((i13 & 32) != 32) {
                                    this.f123308I = new ArrayList();
                                    i13 |= 32;
                                }
                                this.f123308I.add(c36992f.m118762h(C30120b1.f123009O, c36998i));
                                z4 = z14;
                                break;
                            case 42:
                                C30169v0 c30169v0Mo92261c2 = (this.f123331y & 32) == 32 ? this.f123309J.mo92261c() : null;
                                C30171w0 c30171w1 = (C30171w0) c36992f.m118762h(C30171w0.f123476V, c36998i);
                                this.f123309J = c30171w1;
                                if (c30169v0Mo92261c2 != 0) {
                                    c30169v0Mo92261c2.m92357n(c30171w1);
                                    this.f123309J = c30169v0Mo92261c2.m92356k();
                                }
                                this.f123331y |= 32;
                                z4 = z14;
                                break;
                            case 50:
                                C30126d1 c30126d1M92300p = (this.f123331y & 128) == 128 ? this.f123315P.m92300p() : null;
                                C30129e1 c30129e1 = (C30129e1) c36992f.m118762h(C30129e1.f123113O, c36998i);
                                this.f123315P = c30129e1;
                                if (c30126d1M92300p != 0) {
                                    c30126d1M92300p.m92297n(c30129e1);
                                    this.f123315P = c30126d1M92300p.m92296k();
                                }
                                this.f123331y |= 128;
                                z4 = z14;
                                break;
                            case 56:
                                this.f123331y |= 256;
                                this.f123316Q = c36992f.m118761g();
                                z4 = z14;
                                break;
                            case 64:
                                this.f123331y |= 512;
                                this.f123317R = c36992f.m118761g();
                                z4 = z14;
                                break;
                            case 72:
                                this.f123331y |= 16;
                                this.f123307H = c36992f.m118761g();
                                z4 = z14;
                                break;
                            case 80:
                                this.f123331y |= 64;
                                this.f123310K = c36992f.m118761g();
                                z4 = z14;
                                break;
                            case 88:
                                this.f123331y |= 1;
                                this.f123332z = c36992f.m118761g();
                                z4 = z14;
                                break;
                            case 98:
                                if ((i13 & 256) != 256) {
                                    this.f123311L = new ArrayList();
                                    i13 |= 256;
                                }
                                this.f123311L.add(c36992f.m118762h(C30171w0.f123476V, c36998i));
                                z4 = z14;
                                break;
                            case 104:
                                if ((i13 & 512) != 512) {
                                    this.f123312M = new ArrayList();
                                    i13 |= 512;
                                }
                                this.f123312M.add(Integer.valueOf(c36992f.m118761g()));
                                z4 = z14;
                                break;
                            case 106:
                                int iM118759e = c36992f.m118759e(c36992f.m118766l());
                                if ((i13 & 512) != 512 && c36992f.m118757c() > 0) {
                                    this.f123312M = new ArrayList();
                                    i13 |= 512;
                                }
                                while (c36992f.m118757c() > 0) {
                                    this.f123312M.add(Integer.valueOf(c36992f.m118761g()));
                                }
                                c36992f.m118758d(iM118759e);
                                z4 = z14;
                                break;
                            case 114:
                                if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 65536) {
                                    this.f123320U = new ArrayList();
                                    i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                                }
                                this.f123320U.add(c36992f.m118762h(C30136h.f123168H, c36998i));
                                z4 = z14;
                                break;
                            case 122:
                                if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 131072) {
                                    this.f123321V = new ArrayList();
                                    i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                                }
                                this.f123321V.add(c36992f.m118762h(C30136h.f123168H, c36998i));
                                z4 = z14;
                                break;
                            case 130:
                                if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 262144) {
                                    this.f123322W = new ArrayList();
                                    i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                                }
                                this.f123322W.add(c36992f.m118762h(C30136h.f123168H, c36998i));
                                z4 = z14;
                                break;
                            case 138:
                                if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 1024) {
                                    this.f123314O = new ArrayList();
                                    i13 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                                }
                                this.f123314O.add(c36992f.m118762h(C30129e1.f123113O, c36998i));
                                z4 = z14;
                                break;
                            case 248:
                                if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 16384) {
                                    this.f123318S = new ArrayList();
                                    i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                                }
                                this.f123318S.add(Integer.valueOf(c36992f.m118761g()));
                                z4 = z14;
                                break;
                            case AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                int iM118759e2 = c36992f.m118759e(c36992f.m118766l());
                                if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 16384 && c36992f.m118757c() > 0) {
                                    this.f123318S = new ArrayList();
                                    i13 |= DfuBaseService.ERROR_CONNECTION_MASK;
                                }
                                while (c36992f.m118757c() > 0) {
                                    this.f123318S.add(Integer.valueOf(c36992f.m118761g()));
                                }
                                c36992f.m118758d(iM118759e2);
                                z4 = z14;
                                break;
                            case 258:
                                if ((i13 & 32768) != 32768) {
                                    this.f123319T = new ArrayList();
                                    i13 |= 32768;
                                }
                                this.f123319T.add(c36992f.m118762h(C30150m.f123340H, c36998i));
                                z4 = z14;
                                break;
                            case 266:
                                if ((i13 & 524288) != 524288) {
                                    this.f123323X = new ArrayList();
                                    i13 |= 524288;
                                }
                                this.f123323X.add(c36992f.m118762h(C30136h.f123168H, c36998i));
                                z4 = z14;
                                break;
                            case 274:
                                if ((i13 & 1048576) != 1048576) {
                                    this.f123324Y = new ArrayList();
                                    i13 |= 1048576;
                                }
                                this.f123324Y.add(c36992f.m118762h(C30136h.f123168H, c36998i));
                                z4 = z14;
                                break;
                            case 282:
                                if ((i13 & 2097152) != 2097152) {
                                    this.f123325Z = new ArrayList();
                                    i13 |= 2097152;
                                }
                                this.f123325Z.add(c36992f.m118762h(C30136h.f123168H, c36998i));
                                z4 = z14;
                                break;
                            case 322:
                                if ((this.f123331y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 1024) {
                                    C30158q c30158q = this.f123326a0;
                                    c30158q.getClass();
                                    c30156p2 = new C30156p(0);
                                    c30156p2.f123384z = Collections.EMPTY_LIST;
                                    c30156p2.m92340l(c30158q);
                                } else {
                                    c30156p2 = null;
                                }
                                C30158q c30158q2 = (C30158q) c36992f.m118762h(C30158q.f123392F, c36998i);
                                this.f123326a0 = c30158q2;
                                if (c30156p2 != null) {
                                    c30156p2.m92340l(c30158q2);
                                    this.f123326a0 = c30156p2.m92338j();
                                }
                                this.f123331y |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                                z4 = z14;
                                break;
                            case 330:
                                try {
                                    if ((this.f123331y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 2048) {
                                        try {
                                            C30158q c30158q3 = this.f123327b0;
                                            c30158q3.getClass();
                                            c30156p = new C30156p(0);
                                            c30156p.f123384z = Collections.EMPTY_LIST;
                                            c30156p.m92340l(c30158q3);
                                        } catch (InvalidProtocolBufferException e5) {
                                            e = e5;
                                            e.m65784a(this);
                                            throw e;
                                        } catch (IOException e13) {
                                            e = e13;
                                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                                            invalidProtocolBufferException.m65784a(this);
                                            throw invalidProtocolBufferException;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if ((i13 & 32) == 32) {
                                                this.f123308I = Collections.unmodifiableList(this.f123308I);
                                            }
                                            if ((i13 & 256) == 256) {
                                                this.f123311L = Collections.unmodifiableList(this.f123311L);
                                            }
                                            if ((i13 & 512) == 512) {
                                                this.f123312M = Collections.unmodifiableList(this.f123312M);
                                            }
                                            if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 65536) {
                                                this.f123320U = Collections.unmodifiableList(this.f123320U);
                                            }
                                            if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) == 131072) {
                                                this.f123321V = Collections.unmodifiableList(this.f123321V);
                                            }
                                            if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 262144) {
                                                this.f123322W = Collections.unmodifiableList(this.f123322W);
                                            }
                                            if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 1024) {
                                                this.f123314O = Collections.unmodifiableList(this.f123314O);
                                            }
                                            if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 16384) {
                                                this.f123318S = Collections.unmodifiableList(this.f123318S);
                                            }
                                            if ((i13 & 32768) == 32768) {
                                                this.f123319T = Collections.unmodifiableList(this.f123319T);
                                            }
                                            if ((i13 & 524288) == 524288) {
                                                this.f123323X = Collections.unmodifiableList(this.f123323X);
                                            }
                                            if ((i13 & 1048576) == 1048576) {
                                                this.f123324Y = Collections.unmodifiableList(this.f123324Y);
                                            }
                                            if ((i13 & 2097152) == 2097152) {
                                                this.f123325Z = Collections.unmodifiableList(this.f123325Z);
                                            }
                                            try {
                                                c36994gM118784j.m118785i();
                                                break;
                                            } catch (IOException unused) {
                                            } finally {
                                                this.f123330x = c36988dM118742l.m118737i();
                                            }
                                            m118822m();
                                            throw th;
                                        }
                                    } else {
                                        c30156p = null;
                                    }
                                    C30158q c30158q4 = (C30158q) c36992f.m118762h(C30158q.f123392F, c36998i);
                                    this.f123327b0 = c30158q4;
                                    if (c30156p != null) {
                                        c30156p.m92340l(c30158q4);
                                        this.f123327b0 = c30156p.m92338j();
                                    }
                                    this.f123331y |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                    z4 = z14;
                                } catch (InvalidProtocolBufferException e14) {
                                    e = e14;
                                } catch (IOException e15) {
                                    e = e15;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                break;
                            default:
                                if (!m118823n(c36992f, c36994gM118784j, c36998i, iM118769o)) {
                                    z13 = z14;
                                }
                                z4 = z14;
                                break;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (InvalidProtocolBufferException e16) {
                    e = e16;
                } catch (IOException e17) {
                    e = e17;
                }
            } else {
                if ((i13 & 32) == 32) {
                    this.f123308I = Collections.unmodifiableList(this.f123308I);
                }
                if ((i13 & 256) == 256) {
                    this.f123311L = Collections.unmodifiableList(this.f123311L);
                }
                if ((i13 & 512) == 512) {
                    this.f123312M = Collections.unmodifiableList(this.f123312M);
                }
                if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 65536) {
                    this.f123320U = Collections.unmodifiableList(this.f123320U);
                }
                if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) == 131072) {
                    this.f123321V = Collections.unmodifiableList(this.f123321V);
                }
                if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 262144) {
                    this.f123322W = Collections.unmodifiableList(this.f123322W);
                }
                if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 1024) {
                    this.f123314O = Collections.unmodifiableList(this.f123314O);
                }
                if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 16384) {
                    this.f123318S = Collections.unmodifiableList(this.f123318S);
                }
                if ((i13 & 32768) == 32768) {
                    this.f123319T = Collections.unmodifiableList(this.f123319T);
                }
                if ((i13 & 524288) == 524288) {
                    this.f123323X = Collections.unmodifiableList(this.f123323X);
                }
                if ((i13 & 1048576) == 1048576) {
                    this.f123324Y = Collections.unmodifiableList(this.f123324Y);
                }
                if ((i13 & 2097152) == 2097152) {
                    this.f123325Z = Collections.unmodifiableList(this.f123325Z);
                }
                try {
                    c36994gM118784j.m118785i();
                } catch (IOException unused2) {
                } finally {
                    this.f123330x = c36988dM118742l.m118737i();
                }
                m118822m();
                return;
            }
        }
    }
}
