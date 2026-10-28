package ta3;

import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36992f;
import wa3.C36998i;
import wa3.InterfaceC37019v;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: ta3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C33677c extends AbstractC37002k implements InterfaceC37020w {

    /* JADX INFO: renamed from: x */
    public int f140670x;

    /* JADX INFO: renamed from: y */
    public int f140671y;

    /* JADX INFO: renamed from: z */
    public int f140672z;

    public final Object clone() {
        C33677c c33677c = new C33677c();
        c33677c.m106422k(m106421j());
        return c33677c;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C33678d c33678dM106421j = m106421j();
        c33678dM106421j.mo92260b();
        return c33678dM106421j;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C33678d c33678d = null;
        try {
            try {
                C33678d.f140674H.getClass();
                m106422k(new C33678d(c36992f));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C33678d c33678d2 = (C33678d) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c33678d = c33678d2;
                    if (c33678d != null) {
                        m106422k(c33678d);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c33678d != null) {
                m106422k(c33678d);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m106422k((C33678d) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final C33678d m106421j() {
        C33678d c33678d = new C33678d(this);
        int i13 = this.f140670x;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c33678d.f140679y = this.f140671y;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c33678d.f140680z = this.f140672z;
        c33678d.f140678x = i14;
        return c33678d;
    }

    /* JADX INFO: renamed from: k */
    public final void m106422k(C33678d c33678d) {
        if (c33678d == C33678d.f140673G) {
            return;
        }
        int i13 = c33678d.f140678x;
        if ((i13 & 1) == 1) {
            int i14 = c33678d.f140679y;
            this.f140670x = 1 | this.f140670x;
            this.f140671y = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = c33678d.f140680z;
            this.f140670x = 2 | this.f140670x;
            this.f140672z = i15;
        }
        this.f158353w = this.f158353w.m118743c(c33678d.f140677w);
    }
}
