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

/* JADX INFO: renamed from: qa3.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C30122c0 extends AbstractC37006m {

    /* JADX INFO: renamed from: Y */
    public static final C30122c0 f123034Y;

    /* JADX INFO: renamed from: Z */
    public static final C30115a f123035Z = new C30115a(7);

    /* JADX INFO: renamed from: E */
    public int f123036E;

    /* JADX INFO: renamed from: F */
    public int f123037F;

    /* JADX INFO: renamed from: G */
    public C30171w0 f123038G;

    /* JADX INFO: renamed from: H */
    public int f123039H;

    /* JADX INFO: renamed from: I */
    public List f123040I;

    /* JADX INFO: renamed from: J */
    public C30171w0 f123041J;

    /* JADX INFO: renamed from: K */
    public int f123042K;

    /* JADX INFO: renamed from: L */
    public List f123043L;

    /* JADX INFO: renamed from: M */
    public List f123044M;

    /* JADX INFO: renamed from: N */
    public int f123045N;

    /* JADX INFO: renamed from: O */
    public List f123046O;

    /* JADX INFO: renamed from: P */
    public List f123047P;

    /* JADX INFO: renamed from: Q */
    public C30123c1 f123048Q;

    /* JADX INFO: renamed from: R */
    public List f123049R;

    /* JADX INFO: renamed from: S */
    public C30158q f123050S;

    /* JADX INFO: renamed from: T */
    public List f123051T;

    /* JADX INFO: renamed from: U */
    public List f123052U;

    /* JADX INFO: renamed from: V */
    public List f123053V;

    /* JADX INFO: renamed from: W */
    public byte f123054W;

    /* JADX INFO: renamed from: X */
    public int f123055X;

    /* JADX INFO: renamed from: x */
    public final AbstractC36990e f123056x;

    /* JADX INFO: renamed from: y */
    public int f123057y;

    /* JADX INFO: renamed from: z */
    public int f123058z;

    static {
        C30122c0 c30122c0 = new C30122c0();
        f123034Y = c30122c0;
        c30122c0.m92292p();
    }

    public C30122c0(C30119b0 c30119b0) {
        super(c30119b0);
        this.f123045N = -1;
        this.f123054W = (byte) -1;
        this.f123055X = -1;
        this.f123056x = c30119b0.f158353w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: a */
    public final InterfaceC37019v mo92288a() {
        return f123034Y;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123054W;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i13 = this.f123057y;
        if ((i13 & 4) != 4) {
            this.f123054W = (byte) 0;
            return false;
        }
        if ((i13 & 8) == 8 && !this.f123038G.mo92260b()) {
            this.f123054W = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < this.f123040I.size(); i14++) {
            if (!((C30120b1) this.f123040I.get(i14)).mo92260b()) {
                this.f123054W = (byte) 0;
                return false;
            }
        }
        if ((this.f123057y & 32) == 32 && !this.f123041J.mo92260b()) {
            this.f123054W = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < this.f123043L.size(); i15++) {
            if (!((C30171w0) this.f123043L.get(i15)).mo92260b()) {
                this.f123054W = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f123046O.size(); i16++) {
            if (!((C30129e1) this.f123046O.get(i16)).mo92260b()) {
                this.f123054W = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < this.f123047P.size(); i17++) {
            if (!((C30129e1) this.f123047P.get(i17)).mo92260b()) {
                this.f123054W = (byte) 0;
                return false;
            }
        }
        if ((this.f123057y & 128) == 128 && !this.f123048Q.mo92260b()) {
            this.f123054W = (byte) 0;
            return false;
        }
        if ((this.f123057y & 256) == 256 && !this.f123050S.mo92260b()) {
            this.f123054W = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.f123051T.size(); i18++) {
            if (!((C30150m) this.f123051T.get(i18)).mo92260b()) {
                this.f123054W = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < this.f123052U.size(); i19++) {
            if (!((C30136h) this.f123052U.get(i19)).mo92260b()) {
                this.f123054W = (byte) 0;
                return false;
            }
        }
        for (int i24 = 0; i24 < this.f123053V.size(); i24++) {
            if (!((C30136h) this.f123053V.get(i24)).mo92260b()) {
                this.f123054W = (byte) 0;
                return false;
            }
        }
        if (m118818i()) {
            this.f123054W = (byte) 1;
            return true;
        }
        this.f123054W = (byte) 0;
        return false;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30119b0 c30119b0M92285n = C30119b0.m92285n();
        c30119b0M92285n.m92287o(this);
        return c30119b0M92285n;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123055X;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f123057y & 2) == 2 ? C36994g.m118777b(1, this.f123036E) : 0;
        if ((this.f123057y & 4) == 4) {
            iM118777b += C36994g.m118777b(2, this.f123037F);
        }
        if ((this.f123057y & 8) == 8) {
            iM118777b += C36994g.m118779d(3, this.f123038G);
        }
        for (int i14 = 0; i14 < this.f123040I.size(); i14++) {
            iM118777b += C36994g.m118779d(4, (InterfaceC37019v) this.f123040I.get(i14));
        }
        if ((this.f123057y & 32) == 32) {
            iM118777b += C36994g.m118779d(5, this.f123041J);
        }
        for (int i15 = 0; i15 < this.f123047P.size(); i15++) {
            iM118777b += C36994g.m118779d(6, (InterfaceC37019v) this.f123047P.get(i15));
        }
        if ((this.f123057y & 16) == 16) {
            iM118777b += C36994g.m118777b(7, this.f123039H);
        }
        if ((this.f123057y & 64) == 64) {
            iM118777b += C36994g.m118777b(8, this.f123042K);
        }
        if ((this.f123057y & 1) == 1) {
            iM118777b += C36994g.m118777b(9, this.f123058z);
        }
        for (int i16 = 0; i16 < this.f123043L.size(); i16++) {
            iM118777b += C36994g.m118779d(10, (InterfaceC37019v) this.f123043L.get(i16));
        }
        int iM118778c = 0;
        for (int i17 = 0; i17 < this.f123044M.size(); i17++) {
            iM118778c += C36994g.m118778c(((Integer) this.f123044M.get(i17)).intValue());
        }
        int iM118779d = iM118777b + iM118778c;
        if (!this.f123044M.isEmpty()) {
            iM118779d = iM118779d + 1 + C36994g.m118778c(iM118778c);
        }
        this.f123045N = iM118778c;
        for (int i18 = 0; i18 < this.f123052U.size(); i18++) {
            iM118779d += C36994g.m118779d(12, (InterfaceC37019v) this.f123052U.get(i18));
        }
        for (int i19 = 0; i19 < this.f123046O.size(); i19++) {
            iM118779d += C36994g.m118779d(13, (InterfaceC37019v) this.f123046O.get(i19));
        }
        if ((this.f123057y & 128) == 128) {
            iM118779d += C36994g.m118779d(30, this.f123048Q);
        }
        int iM118778c2 = 0;
        for (int i24 = 0; i24 < this.f123049R.size(); i24++) {
            iM118778c2 += C36994g.m118778c(((Integer) this.f123049R.get(i24)).intValue());
        }
        int size = (this.f123049R.size() * 2) + iM118779d + iM118778c2;
        if ((this.f123057y & 256) == 256) {
            size += C36994g.m118779d(32, this.f123050S);
        }
        for (int i25 = 0; i25 < this.f123051T.size(); i25++) {
            size += C36994g.m118779d(33, (InterfaceC37019v) this.f123051T.get(i25));
        }
        for (int i26 = 0; i26 < this.f123053V.size(); i26++) {
            size += C36994g.m118779d(34, (InterfaceC37019v) this.f123053V.get(i26));
        }
        int size2 = this.f123056x.size() + m118819j() + size;
        this.f123055X = size2;
        return size2;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30119b0.m92285n();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        C28539n0 c28539n0 = new C28539n0(this);
        if ((this.f123057y & 2) == 2) {
            c36994g.m118788m(1, this.f123036E);
        }
        if ((this.f123057y & 4) == 4) {
            c36994g.m118788m(2, this.f123037F);
        }
        if ((this.f123057y & 8) == 8) {
            c36994g.m118790o(3, this.f123038G);
        }
        for (int i13 = 0; i13 < this.f123040I.size(); i13++) {
            c36994g.m118790o(4, (InterfaceC37019v) this.f123040I.get(i13));
        }
        if ((this.f123057y & 32) == 32) {
            c36994g.m118790o(5, this.f123041J);
        }
        for (int i14 = 0; i14 < this.f123047P.size(); i14++) {
            c36994g.m118790o(6, (InterfaceC37019v) this.f123047P.get(i14));
        }
        if ((this.f123057y & 16) == 16) {
            c36994g.m118788m(7, this.f123039H);
        }
        if ((this.f123057y & 64) == 64) {
            c36994g.m118788m(8, this.f123042K);
        }
        if ((this.f123057y & 1) == 1) {
            c36994g.m118788m(9, this.f123058z);
        }
        for (int i15 = 0; i15 < this.f123043L.size(); i15++) {
            c36994g.m118790o(10, (InterfaceC37019v) this.f123043L.get(i15));
        }
        if (this.f123044M.size() > 0) {
            c36994g.m118797v(90);
            c36994g.m118797v(this.f123045N);
        }
        for (int i16 = 0; i16 < this.f123044M.size(); i16++) {
            c36994g.m118789n(((Integer) this.f123044M.get(i16)).intValue());
        }
        for (int i17 = 0; i17 < this.f123052U.size(); i17++) {
            c36994g.m118790o(12, (InterfaceC37019v) this.f123052U.get(i17));
        }
        for (int i18 = 0; i18 < this.f123046O.size(); i18++) {
            c36994g.m118790o(13, (InterfaceC37019v) this.f123046O.get(i18));
        }
        if ((this.f123057y & 128) == 128) {
            c36994g.m118790o(30, this.f123048Q);
        }
        for (int i19 = 0; i19 < this.f123049R.size(); i19++) {
            c36994g.m118788m(31, ((Integer) this.f123049R.get(i19)).intValue());
        }
        if ((this.f123057y & 256) == 256) {
            c36994g.m118790o(32, this.f123050S);
        }
        for (int i24 = 0; i24 < this.f123051T.size(); i24++) {
            c36994g.m118790o(33, (InterfaceC37019v) this.f123051T.get(i24));
        }
        for (int i25 = 0; i25 < this.f123053V.size(); i25++) {
            c36994g.m118790o(34, (InterfaceC37019v) this.f123053V.get(i25));
        }
        c28539n0.m86842n(19000, c36994g);
        c36994g.m118793r(this.f123056x);
    }

    /* JADX INFO: renamed from: p */
    public final void m92292p() {
        this.f123058z = 6;
        this.f123036E = 6;
        this.f123037F = 0;
        C30171w0 c30171w0 = C30171w0.f123475U;
        this.f123038G = c30171w0;
        this.f123039H = 0;
        List list = Collections.EMPTY_LIST;
        this.f123040I = list;
        this.f123041J = c30171w0;
        this.f123042K = 0;
        this.f123043L = list;
        this.f123044M = list;
        this.f123046O = list;
        this.f123047P = list;
        this.f123048Q = C30123c1.f123059G;
        this.f123049R = list;
        this.f123050S = C30158q.f123391E;
        this.f123051T = list;
        this.f123052U = list;
        this.f123053V = list;
    }

    public C30122c0() {
        this.f123045N = -1;
        this.f123054W = (byte) -1;
        this.f123055X = -1;
        this.f123056x = AbstractC36990e.f158321w;
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
    public C30122c0(wa3.C36992f r22, wa3.C36998i r23) {
        /*
            Method dump skipped, instruction units count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qa3.C30122c0.<init>(wa3.f, wa3.i):void");
    }
}
