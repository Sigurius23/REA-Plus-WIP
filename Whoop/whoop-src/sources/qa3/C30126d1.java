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

/* JADX INFO: renamed from: qa3.d1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C30126d1 extends AbstractC37004l {

    /* JADX INFO: renamed from: E */
    public int f123084E;

    /* JADX INFO: renamed from: F */
    public int f123085F;

    /* JADX INFO: renamed from: G */
    public C30171w0 f123086G;

    /* JADX INFO: renamed from: H */
    public int f123087H;

    /* JADX INFO: renamed from: I */
    public C30171w0 f123088I;

    /* JADX INFO: renamed from: J */
    public int f123089J;

    /* JADX INFO: renamed from: K */
    public List f123090K;

    /* JADX INFO: renamed from: L */
    public C30127e f123091L;

    /* JADX INFO: renamed from: z */
    public int f123092z;

    /* JADX INFO: renamed from: l */
    public static C30126d1 m92295l() {
        C30126d1 c30126d1 = new C30126d1();
        C30171w0 c30171w0 = C30171w0.f123475U;
        c30126d1.f123086G = c30171w0;
        c30126d1.f123088I = c30171w0;
        c30126d1.f123090K = Collections.EMPTY_LIST;
        c30126d1.f123091L = C30127e.f123093P;
        return c30126d1;
    }

    public final Object clone() {
        C30126d1 c30126d1M92295l = m92295l();
        c30126d1M92295l.m92297n(m92296k());
        return c30126d1M92295l;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C30129e1 c30129e1M92296k = m92296k();
        if (c30129e1M92296k.mo92260b()) {
            return c30129e1M92296k;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30129e1 c30129e1 = null;
        try {
            try {
                C30129e1.f123113O.getClass();
                m92297n(new C30129e1(c36992f, c36998i));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C30129e1 c30129e2 = (C30129e1) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c30129e1 = c30129e2;
                    if (c30129e1 != null) {
                        m92297n(c30129e1);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c30129e1 != null) {
                m92297n(c30129e1);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m92297n((C30129e1) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C30129e1 m92296k() {
        C30129e1 c30129e1 = new C30129e1(this);
        int i13 = this.f123092z;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30129e1.f123125z = this.f123084E;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c30129e1.f123114E = this.f123085F;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        c30129e1.f123115F = this.f123086G;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        c30129e1.f123116G = this.f123087H;
        if ((i13 & 16) == 16) {
            i14 |= 16;
        }
        c30129e1.f123117H = this.f123088I;
        if ((i13 & 32) == 32) {
            i14 |= 32;
        }
        c30129e1.f123118I = this.f123089J;
        if ((i13 & 64) == 64) {
            this.f123090K = Collections.unmodifiableList(this.f123090K);
            this.f123092z &= -65;
        }
        c30129e1.f123119J = this.f123090K;
        if ((i13 & 128) == 128) {
            i14 |= 64;
        }
        c30129e1.f123120K = this.f123091L;
        c30129e1.f123124y = i14;
        return c30129e1;
    }

    /* JADX INFO: renamed from: n */
    public final void m92297n(C30129e1 c30129e1) {
        C30127e c30127e;
        C30171w0 c30171w0;
        C30171w0 c30171w1;
        if (c30129e1 == C30129e1.f123112N) {
            return;
        }
        int i13 = c30129e1.f123124y;
        if ((i13 & 1) == 1) {
            int i14 = c30129e1.f123125z;
            this.f123092z = 1 | this.f123092z;
            this.f123084E = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = c30129e1.f123114E;
            this.f123092z = 2 | this.f123092z;
            this.f123085F = i15;
        }
        if ((i13 & 4) == 4) {
            C30171w0 c30171w2 = c30129e1.f123115F;
            if ((this.f123092z & 4) != 4 || (c30171w1 = this.f123086G) == C30171w0.f123475U) {
                this.f123086G = c30171w2;
            } else {
                C30169v0 c30169v0M92361r = C30171w0.m92361r(c30171w1);
                c30169v0M92361r.m92357n(c30171w2);
                this.f123086G = c30169v0M92361r.m92356k();
            }
            this.f123092z |= 4;
        }
        int i16 = c30129e1.f123124y;
        if ((i16 & 8) == 8) {
            int i17 = c30129e1.f123116G;
            this.f123092z = 8 | this.f123092z;
            this.f123087H = i17;
        }
        if ((i16 & 16) == 16) {
            C30171w0 c30171w3 = c30129e1.f123117H;
            if ((this.f123092z & 16) != 16 || (c30171w0 = this.f123088I) == C30171w0.f123475U) {
                this.f123088I = c30171w3;
            } else {
                C30169v0 c30169v0M92361r2 = C30171w0.m92361r(c30171w0);
                c30169v0M92361r2.m92357n(c30171w3);
                this.f123088I = c30169v0M92361r2.m92356k();
            }
            this.f123092z |= 16;
        }
        if ((c30129e1.f123124y & 32) == 32) {
            int i18 = c30129e1.f123118I;
            this.f123092z = 32 | this.f123092z;
            this.f123089J = i18;
        }
        if (!c30129e1.f123119J.isEmpty()) {
            if (this.f123090K.isEmpty()) {
                this.f123090K = c30129e1.f123119J;
                this.f123092z &= -65;
            } else {
                if ((this.f123092z & 64) != 64) {
                    this.f123090K = new ArrayList(this.f123090K);
                    this.f123092z |= 64;
                }
                this.f123090K.addAll(c30129e1.f123119J);
            }
        }
        if ((c30129e1.f123124y & 64) == 64) {
            C30127e c30127e2 = c30129e1.f123120K;
            if ((this.f123092z & 128) != 128 || (c30127e = this.f123091L) == C30127e.f123093P) {
                this.f123091L = c30127e2;
            } else {
                C30121c c30121cM92298j = C30127e.m92298j(c30127e);
                c30121cM92298j.m92291l(c30127e2);
                this.f123091L = c30121cM92298j.m92290j();
            }
            this.f123092z |= 128;
        }
        m118816j(c30129e1);
        this.f158353w = this.f158353w.m118743c(c30129e1.f123123x);
    }
}
