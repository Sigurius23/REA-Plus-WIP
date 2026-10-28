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

/* JADX INFO: renamed from: qa3.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30137h0 extends AbstractC37004l {

    /* JADX INFO: renamed from: E */
    public C30161r0 f123175E;

    /* JADX INFO: renamed from: F */
    public C30157p0 f123176F;

    /* JADX INFO: renamed from: G */
    public C30134g0 f123177G;

    /* JADX INFO: renamed from: H */
    public List f123178H;

    /* JADX INFO: renamed from: z */
    public int f123179z;

    /* JADX INFO: renamed from: k */
    public static C30137h0 m92312k() {
        C30137h0 c30137h0 = new C30137h0();
        c30137h0.f123175E = C30161r0.f123405E;
        c30137h0.f123176F = C30157p0.f123385E;
        c30137h0.f123177G = C30134g0.f123151K;
        c30137h0.f123178H = Collections.EMPTY_LIST;
        return c30137h0;
    }

    public final Object clone() {
        C30137h0 c30137h0 = new C30137h0();
        c30137h0.f123175E = C30161r0.f123405E;
        c30137h0.f123176F = C30157p0.f123385E;
        c30137h0.f123177G = C30134g0.f123151K;
        c30137h0.f123178H = Collections.EMPTY_LIST;
        c30137h0.m92314n(m92313l());
        return c30137h0;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C30140i0 c30140i0M92313l = m92313l();
        if (c30140i0M92313l.mo92260b()) {
            return c30140i0M92313l;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30140i0 c30140i0 = null;
        try {
            try {
                C30140i0.f123210K.getClass();
                m92314n(new C30140i0(c36992f, c36998i));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C30140i0 c30140i1 = (C30140i0) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c30140i0 = c30140i1;
                    if (c30140i0 != null) {
                        m92314n(c30140i0);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c30140i0 != null) {
                m92314n(c30140i0);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m92314n((C30140i0) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final C30140i0 m92313l() {
        C30140i0 c30140i0 = new C30140i0(this);
        int i13 = this.f123179z;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30140i0.f123218z = this.f123175E;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c30140i0.f123211E = this.f123176F;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        c30140i0.f123212F = this.f123177G;
        if ((i13 & 8) == 8) {
            this.f123178H = Collections.unmodifiableList(this.f123178H);
            this.f123179z &= -9;
        }
        c30140i0.f123213G = this.f123178H;
        c30140i0.f123217y = i14;
        return c30140i0;
    }

    /* JADX INFO: renamed from: n */
    public final void m92314n(C30140i0 c30140i0) {
        C30134g0 c30134g0;
        C30157p0 c30157p0;
        C30161r0 c30161r0;
        if (c30140i0 == C30140i0.f123209J) {
            return;
        }
        if ((c30140i0.f123217y & 1) == 1) {
            C30161r0 c30161r1 = c30140i0.f123218z;
            if ((this.f123179z & 1) != 1 || (c30161r0 = this.f123175E) == C30161r0.f123405E) {
                this.f123175E = c30161r1;
            } else {
                C30149l0 c30149l0M92326j = C30149l0.m92326j();
                c30149l0M92326j.m92331p(c30161r0);
                c30149l0M92326j.m92331p(c30161r1);
                this.f123175E = c30149l0M92326j.m92329n();
            }
            this.f123179z |= 1;
        }
        if ((c30140i0.f123217y & 2) == 2) {
            C30157p0 c30157p1 = c30140i0.f123211E;
            if ((this.f123179z & 2) != 2 || (c30157p0 = this.f123176F) == C30157p0.f123385E) {
                this.f123176F = c30157p1;
            } else {
                C30149l0 c30149l0M92327k = C30149l0.m92327k();
                c30149l0M92327k.m92330o(c30157p0);
                c30149l0M92327k.m92330o(c30157p1);
                this.f123176F = c30149l0M92327k.m92328l();
            }
            this.f123179z |= 2;
        }
        if ((c30140i0.f123217y & 4) == 4) {
            C30134g0 c30134g1 = c30140i0.f123212F;
            if ((this.f123179z & 4) != 4 || (c30134g0 = this.f123177G) == C30134g0.f123151K) {
                this.f123177G = c30134g1;
            } else {
                C30131f0 c30131f0M92301k = C30131f0.m92301k();
                c30131f0M92301k.m92303n(c30134g0);
                c30131f0M92301k.m92303n(c30134g1);
                this.f123177G = c30131f0M92301k.m92302l();
            }
            this.f123179z |= 4;
        }
        if (!c30140i0.f123213G.isEmpty()) {
            if (this.f123178H.isEmpty()) {
                this.f123178H = c30140i0.f123213G;
                this.f123179z &= -9;
            } else {
                if ((this.f123179z & 8) != 8) {
                    this.f123178H = new ArrayList(this.f123178H);
                    this.f123179z |= 8;
                }
                this.f123178H.addAll(c30140i0.f123213G);
            }
        }
        m118816j(c30140i0);
        this.f158353w = this.f158353w.m118743c(c30140i0.f123216x);
    }
}
