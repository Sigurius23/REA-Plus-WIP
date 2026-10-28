package qa3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p715kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36992f;
import wa3.C36998i;
import wa3.InterfaceC37019v;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: qa3.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C30174y extends AbstractC37002k implements InterfaceC37020w {

    /* JADX INFO: renamed from: E */
    public EnumC30176z f123515E;

    /* JADX INFO: renamed from: F */
    public C30171w0 f123516F;

    /* JADX INFO: renamed from: G */
    public int f123517G;

    /* JADX INFO: renamed from: H */
    public List f123518H;

    /* JADX INFO: renamed from: I */
    public List f123519I;

    /* JADX INFO: renamed from: x */
    public int f123520x;

    /* JADX INFO: renamed from: y */
    public int f123521y;

    /* JADX INFO: renamed from: z */
    public int f123522z;

    /* JADX INFO: renamed from: k */
    public static C30174y m92368k() {
        C30174y c30174y = new C30174y();
        c30174y.f123515E = EnumC30176z.TRUE;
        c30174y.f123516F = C30171w0.f123475U;
        List list = Collections.EMPTY_LIST;
        c30174y.f123518H = list;
        c30174y.f123519I = list;
        return c30174y;
    }

    public final Object clone() {
        C30174y c30174yM92368k = m92368k();
        c30174yM92368k.m92370l(m92369j());
        return c30174yM92368k;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C30116a0 c30116a0M92369j = m92369j();
        if (c30116a0M92369j.mo92260b()) {
            return c30116a0M92369j;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30116a0 c30116a0 = null;
        try {
            try {
                C30116a0.f122968M.getClass();
                m92370l(new C30116a0(c36992f, c36998i));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C30116a0 c30116a1 = (C30116a0) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c30116a0 = c30116a1;
                    if (c30116a0 != null) {
                        m92370l(c30116a0);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c30116a0 != null) {
                m92370l(c30116a0);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m92370l((C30116a0) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final C30116a0 m92369j() {
        C30116a0 c30116a0 = new C30116a0(this);
        int i13 = this.f123520x;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30116a0.f122978y = this.f123521y;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c30116a0.f122979z = this.f123522z;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        c30116a0.f122969E = this.f123515E;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        c30116a0.f122970F = this.f123516F;
        if ((i13 & 16) == 16) {
            i14 |= 16;
        }
        c30116a0.f122971G = this.f123517G;
        if ((i13 & 32) == 32) {
            this.f123518H = Collections.unmodifiableList(this.f123518H);
            this.f123520x &= -33;
        }
        c30116a0.f122972H = this.f123518H;
        if ((this.f123520x & 64) == 64) {
            this.f123519I = Collections.unmodifiableList(this.f123519I);
            this.f123520x &= -65;
        }
        c30116a0.f122973I = this.f123519I;
        c30116a0.f122977x = i14;
        return c30116a0;
    }

    /* JADX INFO: renamed from: l */
    public final void m92370l(C30116a0 c30116a0) {
        C30171w0 c30171w0;
        if (c30116a0 == C30116a0.f122967L) {
            return;
        }
        int i13 = c30116a0.f122977x;
        if ((i13 & 1) == 1) {
            int i14 = c30116a0.f122978y;
            this.f123520x = 1 | this.f123520x;
            this.f123521y = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = c30116a0.f122979z;
            this.f123520x = 2 | this.f123520x;
            this.f123522z = i15;
        }
        if (c30116a0.m92271o()) {
            EnumC30176z enumC30176z = c30116a0.f122969E;
            enumC30176z.getClass();
            this.f123520x |= 4;
            this.f123515E = enumC30176z;
        }
        if (c30116a0.m92272p()) {
            C30171w0 c30171w1 = c30116a0.f122970F;
            if ((this.f123520x & 8) != 8 || (c30171w0 = this.f123516F) == C30171w0.f123475U) {
                this.f123516F = c30171w1;
            } else {
                C30169v0 c30169v0M92361r = C30171w0.m92361r(c30171w0);
                c30169v0M92361r.m92357n(c30171w1);
                this.f123516F = c30169v0M92361r.m92356k();
            }
            this.f123520x |= 8;
        }
        if (c30116a0.m92273q()) {
            int i16 = c30116a0.f122971G;
            this.f123520x |= 16;
            this.f123517G = i16;
        }
        if (!c30116a0.f122972H.isEmpty()) {
            if (this.f123518H.isEmpty()) {
                this.f123518H = c30116a0.f122972H;
                this.f123520x &= -33;
            } else {
                if ((this.f123520x & 32) != 32) {
                    this.f123518H = new ArrayList(this.f123518H);
                    this.f123520x |= 32;
                }
                this.f123518H.addAll(c30116a0.f122972H);
            }
        }
        if (!c30116a0.f122973I.isEmpty()) {
            if (this.f123519I.isEmpty()) {
                this.f123519I = c30116a0.f122973I;
                this.f123520x &= -65;
            } else {
                if ((this.f123520x & 64) != 64) {
                    this.f123519I = new ArrayList(this.f123519I);
                    this.f123520x |= 64;
                }
                this.f123519I.addAll(c30116a0.f122973I);
            }
        }
        this.f158353w = this.f158353w.m118743c(c30116a0.f122976w);
    }
}
