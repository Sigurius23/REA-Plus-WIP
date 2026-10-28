package qa3;

import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p715kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36992f;
import wa3.C36998i;
import wa3.InterfaceC37019v;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: qa3.s0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30163s0 extends AbstractC37002k implements InterfaceC37020w {

    /* JADX INFO: renamed from: E */
    public int f123416E;

    /* JADX INFO: renamed from: x */
    public int f123417x;

    /* JADX INFO: renamed from: y */
    public EnumC30165t0 f123418y;

    /* JADX INFO: renamed from: z */
    public C30171w0 f123419z;

    /* JADX INFO: renamed from: j */
    public static C30163s0 m92345j() {
        C30163s0 c30163s0 = new C30163s0();
        c30163s0.f123418y = EnumC30165t0.INV;
        c30163s0.f123419z = C30171w0.f123475U;
        return c30163s0;
    }

    public final Object clone() {
        C30163s0 c30163s0 = new C30163s0();
        c30163s0.f123418y = EnumC30165t0.INV;
        c30163s0.f123419z = C30171w0.f123475U;
        c30163s0.m92347l(m92346k());
        return c30163s0;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C30167u0 c30167u0M92346k = m92346k();
        if (c30167u0M92346k.mo92260b()) {
            return c30167u0M92346k;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30167u0 c30167u0 = null;
        try {
            try {
                C30167u0.f123437I.getClass();
                m92347l(new C30167u0(c36992f, c36998i));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C30167u0 c30167u1 = (C30167u0) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c30167u0 = c30167u1;
                    if (c30167u0 != null) {
                        m92347l(c30167u0);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c30167u0 != null) {
                m92347l(c30167u0);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m92347l((C30167u0) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C30167u0 m92346k() {
        C30167u0 c30167u0 = new C30167u0(this);
        int i13 = this.f123417x;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30167u0.f123443y = this.f123418y;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c30167u0.f123444z = this.f123419z;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        c30167u0.f123438E = this.f123416E;
        c30167u0.f123442x = i14;
        return c30167u0;
    }

    /* JADX INFO: renamed from: l */
    public final void m92347l(C30167u0 c30167u0) {
        C30171w0 c30171w0;
        if (c30167u0 == C30167u0.f123436H) {
            return;
        }
        if ((c30167u0.f123442x & 1) == 1) {
            EnumC30165t0 enumC30165t0 = c30167u0.f123443y;
            enumC30165t0.getClass();
            this.f123417x = 1 | this.f123417x;
            this.f123418y = enumC30165t0;
        }
        if ((c30167u0.f123442x & 2) == 2) {
            C30171w0 c30171w1 = c30167u0.f123444z;
            if ((this.f123417x & 2) != 2 || (c30171w0 = this.f123419z) == C30171w0.f123475U) {
                this.f123419z = c30171w1;
            } else {
                C30169v0 c30169v0M92361r = C30171w0.m92361r(c30171w0);
                c30169v0M92361r.m92357n(c30171w1);
                this.f123419z = c30169v0M92361r.m92356k();
            }
            this.f123417x |= 2;
        }
        if ((c30167u0.f123442x & 4) == 4) {
            int i13 = c30167u0.f123438E;
            this.f123417x = 4 | this.f123417x;
            this.f123416E = i13;
        }
        this.f158353w = this.f158353w.m118743c(c30167u0.f123441w);
    }
}
