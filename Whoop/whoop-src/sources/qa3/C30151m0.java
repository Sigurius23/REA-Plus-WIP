package qa3;

import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p715kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36992f;
import wa3.C36998i;
import wa3.InterfaceC37019v;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: qa3.m0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30151m0 extends AbstractC37002k implements InterfaceC37020w {

    /* JADX INFO: renamed from: E */
    public EnumC30153n0 f123347E;

    /* JADX INFO: renamed from: x */
    public int f123348x;

    /* JADX INFO: renamed from: y */
    public int f123349y;

    /* JADX INFO: renamed from: z */
    public int f123350z;

    /* JADX INFO: renamed from: j */
    public static C30151m0 m92332j() {
        C30151m0 c30151m0 = new C30151m0();
        c30151m0.f123349y = -1;
        c30151m0.f123347E = EnumC30153n0.PACKAGE;
        return c30151m0;
    }

    public final Object clone() {
        C30151m0 c30151m0 = new C30151m0();
        c30151m0.f123349y = -1;
        c30151m0.f123347E = EnumC30153n0.PACKAGE;
        c30151m0.m92334l(m92333k());
        return c30151m0;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C30155o0 c30155o0M92333k = m92333k();
        if (c30155o0M92333k.mo92260b()) {
            return c30155o0M92333k;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30155o0 c30155o0 = null;
        try {
            try {
                C30155o0.f123374I.getClass();
                m92334l(new C30155o0(c36992f));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C30155o0 c30155o1 = (C30155o0) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c30155o0 = c30155o1;
                    if (c30155o0 != null) {
                        m92334l(c30155o0);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c30155o0 != null) {
                m92334l(c30155o0);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m92334l((C30155o0) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C30155o0 m92333k() {
        C30155o0 c30155o0 = new C30155o0(this);
        int i13 = this.f123348x;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30155o0.f123380y = this.f123349y;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c30155o0.f123381z = this.f123350z;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        c30155o0.f123375E = this.f123347E;
        c30155o0.f123379x = i14;
        return c30155o0;
    }

    /* JADX INFO: renamed from: l */
    public final void m92334l(C30155o0 c30155o0) {
        if (c30155o0 == C30155o0.f123373H) {
            return;
        }
        int i13 = c30155o0.f123379x;
        if ((i13 & 1) == 1) {
            int i14 = c30155o0.f123380y;
            this.f123348x = 1 | this.f123348x;
            this.f123349y = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = c30155o0.f123381z;
            this.f123348x = 2 | this.f123348x;
            this.f123350z = i15;
        }
        if ((i13 & 4) == 4) {
            EnumC30153n0 enumC30153n0 = c30155o0.f123375E;
            enumC30153n0.getClass();
            this.f123348x = 4 | this.f123348x;
            this.f123347E = enumC30153n0;
        }
        this.f158353w = this.f158353w.m118743c(c30155o0.f123378w);
    }
}
