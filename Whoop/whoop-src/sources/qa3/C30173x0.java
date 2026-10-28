package qa3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p715kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import wa3.AbstractC37002k;
import wa3.AbstractC37004l;
import wa3.AbstractC37012p;
import wa3.C36992f;
import wa3.C36998i;
import wa3.InterfaceC37019v;

/* JADX INFO: renamed from: qa3.x0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30173x0 extends AbstractC37004l {

    /* JADX INFO: renamed from: E */
    public int f123504E;

    /* JADX INFO: renamed from: F */
    public int f123505F;

    /* JADX INFO: renamed from: G */
    public List f123506G;

    /* JADX INFO: renamed from: H */
    public C30171w0 f123507H;

    /* JADX INFO: renamed from: I */
    public int f123508I;

    /* JADX INFO: renamed from: J */
    public C30171w0 f123509J;

    /* JADX INFO: renamed from: K */
    public int f123510K;

    /* JADX INFO: renamed from: L */
    public List f123511L;

    /* JADX INFO: renamed from: M */
    public List f123512M;

    /* JADX INFO: renamed from: N */
    public List f123513N;

    /* JADX INFO: renamed from: z */
    public int f123514z;

    /* JADX INFO: renamed from: k */
    public static C30173x0 m92365k() {
        C30173x0 c30173x0 = new C30173x0();
        c30173x0.f123504E = 6;
        List list = Collections.EMPTY_LIST;
        c30173x0.f123506G = list;
        C30171w0 c30171w0 = C30171w0.f123475U;
        c30173x0.f123507H = c30171w0;
        c30173x0.f123509J = c30171w0;
        c30173x0.f123511L = list;
        c30173x0.f123512M = list;
        c30173x0.f123513N = list;
        return c30173x0;
    }

    public final Object clone() {
        C30173x0 c30173x0 = new C30173x0();
        c30173x0.f123504E = 6;
        List list = Collections.EMPTY_LIST;
        c30173x0.f123506G = list;
        C30171w0 c30171w0 = C30171w0.f123475U;
        c30173x0.f123507H = c30171w0;
        c30173x0.f123509J = c30171w0;
        c30173x0.f123511L = list;
        c30173x0.f123512M = list;
        c30173x0.f123513N = list;
        c30173x0.m92367n(m92366l());
        return c30173x0;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C30175y0 c30175y0M92366l = m92366l();
        if (c30175y0M92366l.mo92260b()) {
            return c30175y0M92366l;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30175y0 c30175y0 = null;
        try {
            try {
                C30175y0.f123524Q.getClass();
                m92367n(new C30175y0(c36992f, c36998i));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C30175y0 c30175y1 = (C30175y0) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c30175y0 = c30175y1;
                    if (c30175y0 != null) {
                        m92367n(c30175y0);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c30175y0 != null) {
                m92367n(c30175y0);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m92367n((C30175y0) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final C30175y0 m92366l() {
        C30175y0 c30175y0 = new C30175y0(this);
        int i13 = this.f123514z;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30175y0.f123538z = this.f123504E;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c30175y0.f123525E = this.f123505F;
        if ((i13 & 4) == 4) {
            this.f123506G = Collections.unmodifiableList(this.f123506G);
            this.f123514z &= -5;
        }
        c30175y0.f123526F = this.f123506G;
        if ((i13 & 8) == 8) {
            i14 |= 4;
        }
        c30175y0.f123527G = this.f123507H;
        if ((i13 & 16) == 16) {
            i14 |= 8;
        }
        c30175y0.f123528H = this.f123508I;
        if ((i13 & 32) == 32) {
            i14 |= 16;
        }
        c30175y0.f123529I = this.f123509J;
        if ((i13 & 64) == 64) {
            i14 |= 32;
        }
        c30175y0.f123530J = this.f123510K;
        if ((this.f123514z & 128) == 128) {
            this.f123511L = Collections.unmodifiableList(this.f123511L);
            this.f123514z &= -129;
        }
        c30175y0.f123531K = this.f123511L;
        if ((this.f123514z & 256) == 256) {
            this.f123512M = Collections.unmodifiableList(this.f123512M);
            this.f123514z &= -257;
        }
        c30175y0.f123532L = this.f123512M;
        if ((this.f123514z & 512) == 512) {
            this.f123513N = Collections.unmodifiableList(this.f123513N);
            this.f123514z &= -513;
        }
        c30175y0.f123533M = this.f123513N;
        c30175y0.f123537y = i14;
        return c30175y0;
    }

    /* JADX INFO: renamed from: n */
    public final void m92367n(C30175y0 c30175y0) {
        C30171w0 c30171w0;
        C30171w0 c30171w1;
        if (c30175y0 == C30175y0.f123523P) {
            return;
        }
        int i13 = c30175y0.f123537y;
        if ((i13 & 1) == 1) {
            int i14 = c30175y0.f123538z;
            this.f123514z = 1 | this.f123514z;
            this.f123504E = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = c30175y0.f123525E;
            this.f123514z = 2 | this.f123514z;
            this.f123505F = i15;
        }
        if (!c30175y0.f123526F.isEmpty()) {
            if (this.f123506G.isEmpty()) {
                this.f123506G = c30175y0.f123526F;
                this.f123514z &= -5;
            } else {
                if ((this.f123514z & 4) != 4) {
                    this.f123506G = new ArrayList(this.f123506G);
                    this.f123514z |= 4;
                }
                this.f123506G.addAll(c30175y0.f123526F);
            }
        }
        if ((c30175y0.f123537y & 4) == 4) {
            C30171w0 c30171w2 = c30175y0.f123527G;
            if ((this.f123514z & 8) != 8 || (c30171w1 = this.f123507H) == C30171w0.f123475U) {
                this.f123507H = c30171w2;
            } else {
                C30169v0 c30169v0M92361r = C30171w0.m92361r(c30171w1);
                c30169v0M92361r.m92357n(c30171w2);
                this.f123507H = c30169v0M92361r.m92356k();
            }
            this.f123514z |= 8;
        }
        int i16 = c30175y0.f123537y;
        if ((i16 & 8) == 8) {
            int i17 = c30175y0.f123528H;
            this.f123514z |= 16;
            this.f123508I = i17;
        }
        if ((i16 & 16) == 16) {
            C30171w0 c30171w3 = c30175y0.f123529I;
            if ((this.f123514z & 32) != 32 || (c30171w0 = this.f123509J) == C30171w0.f123475U) {
                this.f123509J = c30171w3;
            } else {
                C30169v0 c30169v0M92361r2 = C30171w0.m92361r(c30171w0);
                c30169v0M92361r2.m92357n(c30171w3);
                this.f123509J = c30169v0M92361r2.m92356k();
            }
            this.f123514z |= 32;
        }
        if ((c30175y0.f123537y & 32) == 32) {
            int i18 = c30175y0.f123530J;
            this.f123514z |= 64;
            this.f123510K = i18;
        }
        if (!c30175y0.f123531K.isEmpty()) {
            if (this.f123511L.isEmpty()) {
                this.f123511L = c30175y0.f123531K;
                this.f123514z &= -129;
            } else {
                if ((this.f123514z & 128) != 128) {
                    this.f123511L = new ArrayList(this.f123511L);
                    this.f123514z |= 128;
                }
                this.f123511L.addAll(c30175y0.f123531K);
            }
        }
        if (!c30175y0.f123532L.isEmpty()) {
            if (this.f123512M.isEmpty()) {
                this.f123512M = c30175y0.f123532L;
                this.f123514z &= -257;
            } else {
                if ((this.f123514z & 256) != 256) {
                    this.f123512M = new ArrayList(this.f123512M);
                    this.f123514z |= 256;
                }
                this.f123512M.addAll(c30175y0.f123532L);
            }
        }
        if (!c30175y0.f123533M.isEmpty()) {
            if (this.f123513N.isEmpty()) {
                this.f123513N = c30175y0.f123533M;
                this.f123514z &= -513;
            } else {
                if ((this.f123514z & 512) != 512) {
                    this.f123513N = new ArrayList(this.f123513N);
                    this.f123514z |= 512;
                }
                this.f123513N.addAll(c30175y0.f123533M);
            }
        }
        m118816j(c30175y0);
        this.f158353w = this.f158353w.m118743c(c30175y0.f123536x);
    }
}
