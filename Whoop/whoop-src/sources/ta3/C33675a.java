package ta3;

import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36992f;
import wa3.C36998i;
import wa3.InterfaceC37019v;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: ta3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C33675a extends AbstractC37002k implements InterfaceC37020w {

    /* JADX INFO: renamed from: x */
    public int f140659x;

    /* JADX INFO: renamed from: y */
    public int f140660y;

    /* JADX INFO: renamed from: z */
    public int f140661z;

    /* JADX INFO: renamed from: j */
    public static C33675a m106418j() {
        return new C33675a();
    }

    public final Object clone() {
        C33675a c33675a = new C33675a();
        c33675a.m106420l(m106419k());
        return c33675a;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C33676b c33676bM106419k = m106419k();
        c33676bM106419k.mo92260b();
        return c33676bM106419k;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C33676b c33676b = null;
        try {
            try {
                C33676b.f140663H.getClass();
                m106420l(new C33676b(c36992f));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C33676b c33676b2 = (C33676b) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c33676b = c33676b2;
                    if (c33676b != null) {
                        m106420l(c33676b);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c33676b != null) {
                m106420l(c33676b);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m106420l((C33676b) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C33676b m106419k() {
        C33676b c33676b = new C33676b(this);
        int i13 = this.f140659x;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c33676b.f140668y = this.f140660y;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c33676b.f140669z = this.f140661z;
        c33676b.f140667x = i14;
        return c33676b;
    }

    /* JADX INFO: renamed from: l */
    public final void m106420l(C33676b c33676b) {
        if (c33676b == C33676b.f140662G) {
            return;
        }
        int i13 = c33676b.f140667x;
        if ((i13 & 1) == 1) {
            int i14 = c33676b.f140668y;
            this.f140659x = 1 | this.f140659x;
            this.f140660y = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = c33676b.f140669z;
            this.f140659x = 2 | this.f140659x;
            this.f140661z = i15;
        }
        this.f158353w = this.f158353w.m118743c(c33676b.f140666w);
    }
}
