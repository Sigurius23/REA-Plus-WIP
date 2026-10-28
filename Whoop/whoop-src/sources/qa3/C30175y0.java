package qa3;

import androidx.recyclerview.widget.AbstractC1707m0;
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

/* JADX INFO: renamed from: qa3.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C30175y0 extends AbstractC37006m {

    /* JADX INFO: renamed from: P */
    public static final C30175y0 f123523P;

    /* JADX INFO: renamed from: Q */
    public static final C30148l f123524Q = new C30148l(3);

    /* JADX INFO: renamed from: E */
    public int f123525E;

    /* JADX INFO: renamed from: F */
    public List f123526F;

    /* JADX INFO: renamed from: G */
    public C30171w0 f123527G;

    /* JADX INFO: renamed from: H */
    public int f123528H;

    /* JADX INFO: renamed from: I */
    public C30171w0 f123529I;

    /* JADX INFO: renamed from: J */
    public int f123530J;

    /* JADX INFO: renamed from: K */
    public List f123531K;

    /* JADX INFO: renamed from: L */
    public List f123532L;

    /* JADX INFO: renamed from: M */
    public List f123533M;

    /* JADX INFO: renamed from: N */
    public byte f123534N;

    /* JADX INFO: renamed from: O */
    public int f123535O;

    /* JADX INFO: renamed from: x */
    public final AbstractC36990e f123536x;

    /* JADX INFO: renamed from: y */
    public int f123537y;

    /* JADX INFO: renamed from: z */
    public int f123538z;

    static {
        C30175y0 c30175y0 = new C30175y0();
        f123523P = c30175y0;
        c30175y0.f123538z = 6;
        c30175y0.f123525E = 0;
        List list = Collections.EMPTY_LIST;
        c30175y0.f123526F = list;
        C30171w0 c30171w0 = C30171w0.f123475U;
        c30175y0.f123527G = c30171w0;
        c30175y0.f123528H = 0;
        c30175y0.f123529I = c30171w0;
        c30175y0.f123530J = 0;
        c30175y0.f123531K = list;
        c30175y0.f123532L = list;
        c30175y0.f123533M = list;
    }

    public C30175y0(C30173x0 c30173x0) {
        super(c30173x0);
        this.f123534N = (byte) -1;
        this.f123535O = -1;
        this.f123536x = c30173x0.f158353w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: a */
    public final InterfaceC37019v mo92288a() {
        return f123523P;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123534N;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f123537y & 2) != 2) {
            this.f123534N = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < this.f123526F.size(); i13++) {
            if (!((C30120b1) this.f123526F.get(i13)).mo92260b()) {
                this.f123534N = (byte) 0;
                return false;
            }
        }
        if ((this.f123537y & 4) == 4 && !this.f123527G.mo92260b()) {
            this.f123534N = (byte) 0;
            return false;
        }
        if ((this.f123537y & 16) == 16 && !this.f123529I.mo92260b()) {
            this.f123534N = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < this.f123531K.size(); i14++) {
            if (!((C30136h) this.f123531K.get(i14)).mo92260b()) {
                this.f123534N = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f123533M.size(); i15++) {
            if (!((C30150m) this.f123533M.get(i15)).mo92260b()) {
                this.f123534N = (byte) 0;
                return false;
            }
        }
        if (m118818i()) {
            this.f123534N = (byte) 1;
            return true;
        }
        this.f123534N = (byte) 0;
        return false;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30173x0 c30173x0M92365k = C30173x0.m92365k();
        c30173x0M92365k.m92367n(this);
        return c30173x0M92365k;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123535O;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f123537y & 1) == 1 ? C36994g.m118777b(1, this.f123538z) : 0;
        if ((this.f123537y & 2) == 2) {
            iM118777b += C36994g.m118777b(2, this.f123525E);
        }
        for (int i14 = 0; i14 < this.f123526F.size(); i14++) {
            iM118777b += C36994g.m118779d(3, (InterfaceC37019v) this.f123526F.get(i14));
        }
        if ((this.f123537y & 4) == 4) {
            iM118777b += C36994g.m118779d(4, this.f123527G);
        }
        if ((this.f123537y & 8) == 8) {
            iM118777b += C36994g.m118777b(5, this.f123528H);
        }
        if ((this.f123537y & 16) == 16) {
            iM118777b += C36994g.m118779d(6, this.f123529I);
        }
        if ((this.f123537y & 32) == 32) {
            iM118777b += C36994g.m118777b(7, this.f123530J);
        }
        for (int i15 = 0; i15 < this.f123531K.size(); i15++) {
            iM118777b += C36994g.m118779d(8, (InterfaceC37019v) this.f123531K.get(i15));
        }
        int iM118778c = 0;
        for (int i16 = 0; i16 < this.f123532L.size(); i16++) {
            iM118778c += C36994g.m118778c(((Integer) this.f123532L.get(i16)).intValue());
        }
        int size = (this.f123532L.size() * 2) + iM118777b + iM118778c;
        for (int i17 = 0; i17 < this.f123533M.size(); i17++) {
            size += C36994g.m118779d(32, (InterfaceC37019v) this.f123533M.get(i17));
        }
        int size2 = this.f123536x.size() + m118819j() + size;
        this.f123535O = size2;
        return size2;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30173x0.m92365k();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        C28539n0 c28539n0 = new C28539n0(this);
        if ((this.f123537y & 1) == 1) {
            c36994g.m118788m(1, this.f123538z);
        }
        if ((this.f123537y & 2) == 2) {
            c36994g.m118788m(2, this.f123525E);
        }
        for (int i13 = 0; i13 < this.f123526F.size(); i13++) {
            c36994g.m118790o(3, (InterfaceC37019v) this.f123526F.get(i13));
        }
        if ((this.f123537y & 4) == 4) {
            c36994g.m118790o(4, this.f123527G);
        }
        if ((this.f123537y & 8) == 8) {
            c36994g.m118788m(5, this.f123528H);
        }
        if ((this.f123537y & 16) == 16) {
            c36994g.m118790o(6, this.f123529I);
        }
        if ((this.f123537y & 32) == 32) {
            c36994g.m118788m(7, this.f123530J);
        }
        for (int i14 = 0; i14 < this.f123531K.size(); i14++) {
            c36994g.m118790o(8, (InterfaceC37019v) this.f123531K.get(i14));
        }
        for (int i15 = 0; i15 < this.f123532L.size(); i15++) {
            c36994g.m118788m(31, ((Integer) this.f123532L.get(i15)).intValue());
        }
        for (int i16 = 0; i16 < this.f123533M.size(); i16++) {
            c36994g.m118790o(32, (InterfaceC37019v) this.f123533M.get(i16));
        }
        c28539n0.m86842n(200, c36994g);
        c36994g.m118793r(this.f123536x);
    }

    public C30175y0() {
        this.f123534N = (byte) -1;
        this.f123535O = -1;
        this.f123536x = AbstractC36990e.f158321w;
    }

    public C30175y0(C36992f c36992f, C36998i c36998i) {
        this.f123534N = (byte) -1;
        this.f123535O = -1;
        this.f123538z = 6;
        boolean z4 = false;
        this.f123525E = 0;
        List list = Collections.EMPTY_LIST;
        this.f123526F = list;
        C30171w0 c30171w0 = C30171w0.f123475U;
        this.f123527G = c30171w0;
        this.f123528H = 0;
        this.f123529I = c30171w0;
        this.f123530J = 0;
        this.f123531K = list;
        this.f123532L = list;
        this.f123533M = list;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        int i13 = 0;
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    C30169v0 c30169v0M92361r = null;
                    switch (iM118769o) {
                        case 0:
                            break;
                        case 8:
                            this.f123537y |= 1;
                            this.f123538z = c36992f.m118766l();
                            continue;
                        case 16:
                            this.f123537y |= 2;
                            this.f123525E = c36992f.m118766l();
                            continue;
                        case 26:
                            if ((i13 & 4) != 4) {
                                this.f123526F = new ArrayList();
                                i13 |= 4;
                            }
                            this.f123526F.add(c36992f.m118762h(C30120b1.f123009O, c36998i));
                            continue;
                        case 34:
                            if ((this.f123537y & 4) == 4) {
                                C30171w0 c30171w1 = this.f123527G;
                                c30171w1.getClass();
                                c30169v0M92361r = C30171w0.m92361r(c30171w1);
                            }
                            C30171w0 c30171w2 = (C30171w0) c36992f.m118762h(C30171w0.f123476V, c36998i);
                            this.f123527G = c30171w2;
                            if (c30169v0M92361r != null) {
                                c30169v0M92361r.m92357n(c30171w2);
                                this.f123527G = c30169v0M92361r.m92356k();
                            }
                            this.f123537y |= 4;
                            continue;
                        case 40:
                            this.f123537y |= 8;
                            this.f123528H = c36992f.m118766l();
                            continue;
                        case 50:
                            if ((this.f123537y & 16) == 16) {
                                C30171w0 c30171w3 = this.f123529I;
                                c30171w3.getClass();
                                c30169v0M92361r = C30171w0.m92361r(c30171w3);
                            }
                            C30171w0 c30171w4 = (C30171w0) c36992f.m118762h(C30171w0.f123476V, c36998i);
                            this.f123529I = c30171w4;
                            if (c30169v0M92361r != null) {
                                c30169v0M92361r.m92357n(c30171w4);
                                this.f123529I = c30169v0M92361r.m92356k();
                            }
                            this.f123537y |= 16;
                            continue;
                        case 56:
                            this.f123537y |= 32;
                            this.f123530J = c36992f.m118766l();
                            continue;
                        case 66:
                            if ((i13 & 128) != 128) {
                                this.f123531K = new ArrayList();
                                i13 |= 128;
                            }
                            this.f123531K.add(c36992f.m118762h(C30136h.f123168H, c36998i));
                            continue;
                        case 248:
                            if ((i13 & 256) != 256) {
                                this.f123532L = new ArrayList();
                                i13 |= 256;
                            }
                            this.f123532L.add(Integer.valueOf(c36992f.m118766l()));
                            continue;
                        case AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                            int iM118759e = c36992f.m118759e(c36992f.m118766l());
                            if ((i13 & 256) != 256 && c36992f.m118757c() > 0) {
                                this.f123532L = new ArrayList();
                                i13 |= 256;
                            }
                            while (c36992f.m118757c() > 0) {
                                this.f123532L.add(Integer.valueOf(c36992f.m118766l()));
                            }
                            c36992f.m118758d(iM118759e);
                            continue;
                        case 258:
                            if ((i13 & 512) != 512) {
                                this.f123533M = new ArrayList();
                                i13 |= 512;
                            }
                            this.f123533M.add(c36992f.m118762h(C30150m.f123340H, c36998i));
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
                if ((i13 & 4) == 4) {
                    this.f123526F = Collections.unmodifiableList(this.f123526F);
                }
                if ((i13 & 128) == 128) {
                    this.f123531K = Collections.unmodifiableList(this.f123531K);
                }
                if ((i13 & 256) == 256) {
                    this.f123532L = Collections.unmodifiableList(this.f123532L);
                }
                if ((i13 & 512) == 512) {
                    this.f123533M = Collections.unmodifiableList(this.f123533M);
                }
                try {
                    c36994gM118784j.m118785i();
                } catch (IOException unused) {
                } finally {
                    this.f123536x = c36988d.m118737i();
                }
                m118822m();
                throw th3;
            }
        }
        if ((i13 & 4) == 4) {
            this.f123526F = Collections.unmodifiableList(this.f123526F);
        }
        if ((i13 & 128) == 128) {
            this.f123531K = Collections.unmodifiableList(this.f123531K);
        }
        if ((i13 & 256) == 256) {
            this.f123532L = Collections.unmodifiableList(this.f123532L);
        }
        if ((i13 & 512) == 512) {
            this.f123533M = Collections.unmodifiableList(this.f123533M);
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123536x = c36988d.m118737i();
        }
        m118822m();
    }
}
