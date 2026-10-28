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

/* JADX INFO: renamed from: qa3.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30131f0 extends AbstractC37004l {

    /* JADX INFO: renamed from: E */
    public List f123134E;

    /* JADX INFO: renamed from: F */
    public List f123135F;

    /* JADX INFO: renamed from: G */
    public List f123136G;

    /* JADX INFO: renamed from: H */
    public C30123c1 f123137H;

    /* JADX INFO: renamed from: I */
    public C30144j1 f123138I;

    /* JADX INFO: renamed from: z */
    public int f123139z;

    /* JADX INFO: renamed from: k */
    public static C30131f0 m92301k() {
        C30131f0 c30131f0 = new C30131f0();
        List list = Collections.EMPTY_LIST;
        c30131f0.f123134E = list;
        c30131f0.f123135F = list;
        c30131f0.f123136G = list;
        c30131f0.f123137H = C30123c1.f123059G;
        c30131f0.f123138I = C30144j1.f123263E;
        return c30131f0;
    }

    public final Object clone() {
        C30131f0 c30131f0 = new C30131f0();
        List list = Collections.EMPTY_LIST;
        c30131f0.f123134E = list;
        c30131f0.f123135F = list;
        c30131f0.f123136G = list;
        c30131f0.f123137H = C30123c1.f123059G;
        c30131f0.f123138I = C30144j1.f123263E;
        c30131f0.m92303n(m92302l());
        return c30131f0;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C30134g0 c30134g0M92302l = m92302l();
        if (c30134g0M92302l.mo92260b()) {
            return c30134g0M92302l;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30134g0 c30134g0 = null;
        try {
            try {
                C30134g0.f123152L.getClass();
                m92303n(new C30134g0(c36992f, c36998i));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C30134g0 c30134g1 = (C30134g0) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c30134g0 = c30134g1;
                    if (c30134g0 != null) {
                        m92303n(c30134g0);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c30134g0 != null) {
                m92303n(c30134g0);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m92303n((C30134g0) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final C30134g0 m92302l() {
        C30134g0 c30134g0 = new C30134g0(this);
        int i13 = this.f123139z;
        if ((i13 & 1) == 1) {
            this.f123134E = Collections.unmodifiableList(this.f123134E);
            this.f123139z &= -2;
        }
        c30134g0.f123161z = this.f123134E;
        if ((this.f123139z & 2) == 2) {
            this.f123135F = Collections.unmodifiableList(this.f123135F);
            this.f123139z &= -3;
        }
        c30134g0.f123153E = this.f123135F;
        if ((this.f123139z & 4) == 4) {
            this.f123136G = Collections.unmodifiableList(this.f123136G);
            this.f123139z &= -5;
        }
        c30134g0.f123154F = this.f123136G;
        int i14 = (i13 & 8) != 8 ? 0 : 1;
        c30134g0.f123155G = this.f123137H;
        if ((i13 & 16) == 16) {
            i14 |= 2;
        }
        c30134g0.f123156H = this.f123138I;
        c30134g0.f123160y = i14;
        return c30134g0;
    }

    /* JADX INFO: renamed from: n */
    public final void m92303n(C30134g0 c30134g0) {
        C30144j1 c30144j1;
        C30123c1 c30123c1;
        if (c30134g0 == C30134g0.f123151K) {
            return;
        }
        if (!c30134g0.f123161z.isEmpty()) {
            if (this.f123134E.isEmpty()) {
                this.f123134E = c30134g0.f123161z;
                this.f123139z &= -2;
            } else {
                if ((this.f123139z & 1) != 1) {
                    this.f123134E = new ArrayList(this.f123134E);
                    this.f123139z |= 1;
                }
                this.f123134E.addAll(c30134g0.f123161z);
            }
        }
        if (!c30134g0.f123153E.isEmpty()) {
            if (this.f123135F.isEmpty()) {
                this.f123135F = c30134g0.f123153E;
                this.f123139z &= -3;
            } else {
                if ((this.f123139z & 2) != 2) {
                    this.f123135F = new ArrayList(this.f123135F);
                    this.f123139z |= 2;
                }
                this.f123135F.addAll(c30134g0.f123153E);
            }
        }
        if (!c30134g0.f123154F.isEmpty()) {
            if (this.f123136G.isEmpty()) {
                this.f123136G = c30134g0.f123154F;
                this.f123139z &= -5;
            } else {
                if ((this.f123139z & 4) != 4) {
                    this.f123136G = new ArrayList(this.f123136G);
                    this.f123139z |= 4;
                }
                this.f123136G.addAll(c30134g0.f123154F);
            }
        }
        if ((c30134g0.f123160y & 1) == 1) {
            C30123c1 c30123c2 = c30134g0.f123155G;
            if ((this.f123139z & 8) != 8 || (c30123c1 = this.f123137H) == C30123c1.f123059G) {
                this.f123137H = c30123c2;
            } else {
                C30133g c30133gM92293i = C30123c1.m92293i(c30123c1);
                c30133gM92293i.m92311o(c30123c2);
                this.f123137H = c30133gM92293i.m92309k();
            }
            this.f123139z |= 8;
        }
        if ((c30134g0.f123160y & 2) == 2) {
            C30144j1 c30144j2 = c30134g0.f123156H;
            if ((this.f123139z & 16) != 16 || (c30144j1 = this.f123138I) == C30144j1.f123263E) {
                this.f123138I = c30144j2;
            } else {
                C30156p c30156p = new C30156p(1);
                c30156p.f123384z = Collections.EMPTY_LIST;
                c30156p.m92341n(c30144j1);
                c30156p.m92341n(c30144j2);
                this.f123138I = c30156p.m92339k();
            }
            this.f123139z |= 16;
        }
        m118816j(c30134g0);
        this.f158353w = this.f158353w.m118743c(c30134g0.f123159x);
    }
}
