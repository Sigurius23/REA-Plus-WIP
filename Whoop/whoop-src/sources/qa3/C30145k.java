package qa3;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p389p0.C28539n0;
import wa3.AbstractC36990e;
import wa3.AbstractC37002k;
import wa3.AbstractC37006m;
import wa3.C36994g;
import wa3.InterfaceC37019v;

/* JADX INFO: renamed from: qa3.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C30145k extends AbstractC37006m {

    /* JADX INFO: renamed from: g0 */
    public static final C30145k f123269g0;

    /* JADX INFO: renamed from: h0 */
    public static final C30115a f123270h0 = new C30115a(3);

    /* JADX INFO: renamed from: E */
    public int f123271E;

    /* JADX INFO: renamed from: F */
    public int f123272F;

    /* JADX INFO: renamed from: G */
    public List f123273G;

    /* JADX INFO: renamed from: H */
    public List f123274H;

    /* JADX INFO: renamed from: I */
    public List f123275I;

    /* JADX INFO: renamed from: J */
    public int f123276J;

    /* JADX INFO: renamed from: K */
    public List f123277K;

    /* JADX INFO: renamed from: L */
    public int f123278L;

    /* JADX INFO: renamed from: M */
    public List f123279M;

    /* JADX INFO: renamed from: N */
    public List f123280N;

    /* JADX INFO: renamed from: O */
    public int f123281O;

    /* JADX INFO: renamed from: P */
    public List f123282P;

    /* JADX INFO: renamed from: Q */
    public List f123283Q;

    /* JADX INFO: renamed from: R */
    public List f123284R;

    /* JADX INFO: renamed from: S */
    public List f123285S;

    /* JADX INFO: renamed from: T */
    public List f123286T;

    /* JADX INFO: renamed from: U */
    public List f123287U;

    /* JADX INFO: renamed from: V */
    public int f123288V;

    /* JADX INFO: renamed from: W */
    public int f123289W;

    /* JADX INFO: renamed from: X */
    public C30171w0 f123290X;

    /* JADX INFO: renamed from: Y */
    public int f123291Y;

    /* JADX INFO: renamed from: Z */
    public List f123292Z;

    /* JADX INFO: renamed from: a0 */
    public C30123c1 f123293a0;

    /* JADX INFO: renamed from: b0 */
    public List f123294b0;

    /* JADX INFO: renamed from: c0 */
    public C30144j1 f123295c0;

    /* JADX INFO: renamed from: d0 */
    public List f123296d0;

    /* JADX INFO: renamed from: e0 */
    public byte f123297e0;

    /* JADX INFO: renamed from: f0 */
    public int f123298f0;

    /* JADX INFO: renamed from: x */
    public final AbstractC36990e f123299x;

    /* JADX INFO: renamed from: y */
    public int f123300y;

    /* JADX INFO: renamed from: z */
    public int f123301z;

    static {
        C30145k c30145k = new C30145k();
        f123269g0 = c30145k;
        c30145k.m92324p();
    }

    public C30145k(C30139i c30139i) {
        super(c30139i);
        this.f123276J = -1;
        this.f123278L = -1;
        this.f123281O = -1;
        this.f123288V = -1;
        this.f123297e0 = (byte) -1;
        this.f123298f0 = -1;
        this.f123299x = c30139i.f158353w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: a */
    public final InterfaceC37019v mo92288a() {
        return f123269g0;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123297e0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f123300y & 2) != 2) {
            this.f123297e0 = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < this.f123273G.size(); i13++) {
            if (!((C30120b1) this.f123273G.get(i13)).mo92260b()) {
                this.f123297e0 = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f123274H.size(); i14++) {
            if (!((C30171w0) this.f123274H.get(i14)).mo92260b()) {
                this.f123297e0 = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f123279M.size(); i15++) {
            if (!((C30171w0) this.f123279M.get(i15)).mo92260b()) {
                this.f123297e0 = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f123282P.size(); i16++) {
            if (!((C30154o) this.f123282P.get(i16)).mo92260b()) {
                this.f123297e0 = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < this.f123283Q.size(); i17++) {
            if (!((C30122c0) this.f123283Q.get(i17)).mo92260b()) {
                this.f123297e0 = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < this.f123284R.size(); i18++) {
            if (!((C30146k0) this.f123284R.get(i18)).mo92260b()) {
                this.f123297e0 = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < this.f123285S.size(); i19++) {
            if (!((C30175y0) this.f123285S.get(i19)).mo92260b()) {
                this.f123297e0 = (byte) 0;
                return false;
            }
        }
        for (int i24 = 0; i24 < this.f123286T.size(); i24++) {
            if (!((C30172x) this.f123286T.get(i24)).mo92260b()) {
                this.f123297e0 = (byte) 0;
                return false;
            }
        }
        if ((this.f123300y & 16) == 16 && !this.f123290X.mo92260b()) {
            this.f123297e0 = (byte) 0;
            return false;
        }
        for (int i25 = 0; i25 < this.f123292Z.size(); i25++) {
            if (!((C30136h) this.f123292Z.get(i25)).mo92260b()) {
                this.f123297e0 = (byte) 0;
                return false;
            }
        }
        if ((this.f123300y & 64) == 64 && !this.f123293a0.mo92260b()) {
            this.f123297e0 = (byte) 0;
            return false;
        }
        for (int i26 = 0; i26 < this.f123296d0.size(); i26++) {
            if (!((C30150m) this.f123296d0.get(i26)).mo92260b()) {
                this.f123297e0 = (byte) 0;
                return false;
            }
        }
        if (m118818i()) {
            this.f123297e0 = (byte) 1;
            return true;
        }
        this.f123297e0 = (byte) 0;
        return false;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30139i c30139iM92316n = C30139i.m92316n();
        c30139iM92316n.m92318o(this);
        return c30139iM92316n;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123298f0;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f123300y & 1) == 1 ? C36994g.m118777b(1, this.f123301z) : 0;
        int iM118778c = 0;
        for (int i14 = 0; i14 < this.f123275I.size(); i14++) {
            iM118778c += C36994g.m118778c(((Integer) this.f123275I.get(i14)).intValue());
        }
        int iM118779d = iM118777b + iM118778c;
        if (!this.f123275I.isEmpty()) {
            iM118779d = iM118779d + 1 + C36994g.m118778c(iM118778c);
        }
        this.f123276J = iM118778c;
        if ((this.f123300y & 2) == 2) {
            iM118779d += C36994g.m118777b(3, this.f123271E);
        }
        if ((this.f123300y & 4) == 4) {
            iM118779d += C36994g.m118777b(4, this.f123272F);
        }
        for (int i15 = 0; i15 < this.f123273G.size(); i15++) {
            iM118779d += C36994g.m118779d(5, (InterfaceC37019v) this.f123273G.get(i15));
        }
        for (int i16 = 0; i16 < this.f123274H.size(); i16++) {
            iM118779d += C36994g.m118779d(6, (InterfaceC37019v) this.f123274H.get(i16));
        }
        int iM118778c2 = 0;
        for (int i17 = 0; i17 < this.f123277K.size(); i17++) {
            iM118778c2 += C36994g.m118778c(((Integer) this.f123277K.get(i17)).intValue());
        }
        int iM118779d2 = iM118779d + iM118778c2;
        if (!this.f123277K.isEmpty()) {
            iM118779d2 = iM118779d2 + 1 + C36994g.m118778c(iM118778c2);
        }
        this.f123278L = iM118778c2;
        for (int i18 = 0; i18 < this.f123282P.size(); i18++) {
            iM118779d2 += C36994g.m118779d(8, (InterfaceC37019v) this.f123282P.get(i18));
        }
        for (int i19 = 0; i19 < this.f123283Q.size(); i19++) {
            iM118779d2 += C36994g.m118779d(9, (InterfaceC37019v) this.f123283Q.get(i19));
        }
        for (int i24 = 0; i24 < this.f123284R.size(); i24++) {
            iM118779d2 += C36994g.m118779d(10, (InterfaceC37019v) this.f123284R.get(i24));
        }
        for (int i25 = 0; i25 < this.f123285S.size(); i25++) {
            iM118779d2 += C36994g.m118779d(11, (InterfaceC37019v) this.f123285S.get(i25));
        }
        for (int i26 = 0; i26 < this.f123286T.size(); i26++) {
            iM118779d2 += C36994g.m118779d(13, (InterfaceC37019v) this.f123286T.get(i26));
        }
        int iM118778c3 = 0;
        for (int i27 = 0; i27 < this.f123287U.size(); i27++) {
            iM118778c3 += C36994g.m118778c(((Integer) this.f123287U.get(i27)).intValue());
        }
        int iM118779d3 = iM118779d2 + iM118778c3;
        if (!this.f123287U.isEmpty()) {
            iM118779d3 = iM118779d3 + 2 + C36994g.m118778c(iM118778c3);
        }
        this.f123288V = iM118778c3;
        if ((this.f123300y & 8) == 8) {
            iM118779d3 += C36994g.m118777b(17, this.f123289W);
        }
        if ((this.f123300y & 16) == 16) {
            iM118779d3 += C36994g.m118779d(18, this.f123290X);
        }
        if ((this.f123300y & 32) == 32) {
            iM118779d3 += C36994g.m118777b(19, this.f123291Y);
        }
        for (int i28 = 0; i28 < this.f123279M.size(); i28++) {
            iM118779d3 += C36994g.m118779d(20, (InterfaceC37019v) this.f123279M.get(i28));
        }
        int iM118778c4 = 0;
        for (int i29 = 0; i29 < this.f123280N.size(); i29++) {
            iM118778c4 += C36994g.m118778c(((Integer) this.f123280N.get(i29)).intValue());
        }
        int iM118779d4 = iM118779d3 + iM118778c4;
        if (!this.f123280N.isEmpty()) {
            iM118779d4 = iM118779d4 + 2 + C36994g.m118778c(iM118778c4);
        }
        this.f123281O = iM118778c4;
        for (int i34 = 0; i34 < this.f123292Z.size(); i34++) {
            iM118779d4 += C36994g.m118779d(25, (InterfaceC37019v) this.f123292Z.get(i34));
        }
        if ((this.f123300y & 64) == 64) {
            iM118779d4 += C36994g.m118779d(30, this.f123293a0);
        }
        int iM118778c5 = 0;
        for (int i35 = 0; i35 < this.f123294b0.size(); i35++) {
            iM118778c5 += C36994g.m118778c(((Integer) this.f123294b0.get(i35)).intValue());
        }
        int size = (this.f123294b0.size() * 2) + iM118779d4 + iM118778c5;
        if ((this.f123300y & 128) == 128) {
            size += C36994g.m118779d(32, this.f123295c0);
        }
        for (int i36 = 0; i36 < this.f123296d0.size(); i36++) {
            size += C36994g.m118779d(33, (InterfaceC37019v) this.f123296d0.get(i36));
        }
        int size2 = this.f123299x.size() + m118819j() + size;
        this.f123298f0 = size2;
        return size2;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30139i.m92316n();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        C28539n0 c28539n0 = new C28539n0(this);
        if ((this.f123300y & 1) == 1) {
            c36994g.m118788m(1, this.f123301z);
        }
        if (this.f123275I.size() > 0) {
            c36994g.m118797v(18);
            c36994g.m118797v(this.f123276J);
        }
        for (int i13 = 0; i13 < this.f123275I.size(); i13++) {
            c36994g.m118789n(((Integer) this.f123275I.get(i13)).intValue());
        }
        if ((this.f123300y & 2) == 2) {
            c36994g.m118788m(3, this.f123271E);
        }
        if ((this.f123300y & 4) == 4) {
            c36994g.m118788m(4, this.f123272F);
        }
        for (int i14 = 0; i14 < this.f123273G.size(); i14++) {
            c36994g.m118790o(5, (InterfaceC37019v) this.f123273G.get(i14));
        }
        for (int i15 = 0; i15 < this.f123274H.size(); i15++) {
            c36994g.m118790o(6, (InterfaceC37019v) this.f123274H.get(i15));
        }
        if (this.f123277K.size() > 0) {
            c36994g.m118797v(58);
            c36994g.m118797v(this.f123278L);
        }
        for (int i16 = 0; i16 < this.f123277K.size(); i16++) {
            c36994g.m118789n(((Integer) this.f123277K.get(i16)).intValue());
        }
        for (int i17 = 0; i17 < this.f123282P.size(); i17++) {
            c36994g.m118790o(8, (InterfaceC37019v) this.f123282P.get(i17));
        }
        for (int i18 = 0; i18 < this.f123283Q.size(); i18++) {
            c36994g.m118790o(9, (InterfaceC37019v) this.f123283Q.get(i18));
        }
        for (int i19 = 0; i19 < this.f123284R.size(); i19++) {
            c36994g.m118790o(10, (InterfaceC37019v) this.f123284R.get(i19));
        }
        for (int i24 = 0; i24 < this.f123285S.size(); i24++) {
            c36994g.m118790o(11, (InterfaceC37019v) this.f123285S.get(i24));
        }
        for (int i25 = 0; i25 < this.f123286T.size(); i25++) {
            c36994g.m118790o(13, (InterfaceC37019v) this.f123286T.get(i25));
        }
        if (this.f123287U.size() > 0) {
            c36994g.m118797v(130);
            c36994g.m118797v(this.f123288V);
        }
        for (int i26 = 0; i26 < this.f123287U.size(); i26++) {
            c36994g.m118789n(((Integer) this.f123287U.get(i26)).intValue());
        }
        if ((this.f123300y & 8) == 8) {
            c36994g.m118788m(17, this.f123289W);
        }
        if ((this.f123300y & 16) == 16) {
            c36994g.m118790o(18, this.f123290X);
        }
        if ((this.f123300y & 32) == 32) {
            c36994g.m118788m(19, this.f123291Y);
        }
        for (int i27 = 0; i27 < this.f123279M.size(); i27++) {
            c36994g.m118790o(20, (InterfaceC37019v) this.f123279M.get(i27));
        }
        if (this.f123280N.size() > 0) {
            c36994g.m118797v(170);
            c36994g.m118797v(this.f123281O);
        }
        for (int i28 = 0; i28 < this.f123280N.size(); i28++) {
            c36994g.m118789n(((Integer) this.f123280N.get(i28)).intValue());
        }
        for (int i29 = 0; i29 < this.f123292Z.size(); i29++) {
            c36994g.m118790o(25, (InterfaceC37019v) this.f123292Z.get(i29));
        }
        if ((this.f123300y & 64) == 64) {
            c36994g.m118790o(30, this.f123293a0);
        }
        for (int i34 = 0; i34 < this.f123294b0.size(); i34++) {
            c36994g.m118788m(31, ((Integer) this.f123294b0.get(i34)).intValue());
        }
        if ((this.f123300y & 128) == 128) {
            c36994g.m118790o(32, this.f123295c0);
        }
        for (int i35 = 0; i35 < this.f123296d0.size(); i35++) {
            c36994g.m118790o(33, (InterfaceC37019v) this.f123296d0.get(i35));
        }
        c28539n0.m86842n(19000, c36994g);
        c36994g.m118793r(this.f123299x);
    }

    /* JADX INFO: renamed from: p */
    public final void m92324p() {
        this.f123301z = 6;
        this.f123271E = 0;
        this.f123272F = 0;
        List list = Collections.EMPTY_LIST;
        this.f123273G = list;
        this.f123274H = list;
        this.f123275I = list;
        this.f123277K = list;
        this.f123279M = list;
        this.f123280N = list;
        this.f123282P = list;
        this.f123283Q = list;
        this.f123284R = list;
        this.f123285S = list;
        this.f123286T = list;
        this.f123287U = list;
        this.f123289W = 0;
        this.f123290X = C30171w0.f123475U;
        this.f123291Y = 0;
        this.f123292Z = list;
        this.f123293a0 = C30123c1.f123059G;
        this.f123294b0 = list;
        this.f123295c0 = C30144j1.f123263E;
        this.f123296d0 = list;
    }

    public C30145k() {
        this.f123276J = -1;
        this.f123278L = -1;
        this.f123281O = -1;
        this.f123288V = -1;
        this.f123297e0 = (byte) -1;
        this.f123298f0 = -1;
        this.f123299x = AbstractC36990e.f158321w;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public C30145k(wa3.C36992f r22, wa3.C36998i r23) {
        /*
            Method dump skipped, instruction units count: 1604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qa3.C30145k.<init>(wa3.f, wa3.i):void");
    }
}
