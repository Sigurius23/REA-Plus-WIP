package qa3;

import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36992f;
import wa3.C36998i;
import wa3.InterfaceC37019v;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: qa3.f1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30132f1 extends AbstractC37002k implements InterfaceC37020w {

    /* JADX INFO: renamed from: E */
    public EnumC30135g1 f123140E;

    /* JADX INFO: renamed from: F */
    public int f123141F;

    /* JADX INFO: renamed from: G */
    public int f123142G;

    /* JADX INFO: renamed from: H */
    public EnumC30138h1 f123143H;

    /* JADX INFO: renamed from: x */
    public int f123144x;

    /* JADX INFO: renamed from: y */
    public int f123145y;

    /* JADX INFO: renamed from: z */
    public int f123146z;

    /* JADX INFO: renamed from: j */
    public static C30132f1 m92304j() {
        C30132f1 c30132f1 = new C30132f1();
        c30132f1.f123140E = EnumC30135g1.ERROR;
        c30132f1.f123143H = EnumC30138h1.LANGUAGE_VERSION;
        return c30132f1;
    }

    public final Object clone() {
        C30132f1 c30132f1 = new C30132f1();
        c30132f1.f123140E = EnumC30135g1.ERROR;
        c30132f1.f123143H = EnumC30138h1.LANGUAGE_VERSION;
        c30132f1.m92306l(m92305k());
        return c30132f1;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C30141i1 c30141i1M92305k = m92305k();
        c30141i1M92305k.mo92260b();
        return c30141i1M92305k;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30141i1 c30141i1 = null;
        try {
            try {
                C30141i1.f123220L.getClass();
                m92306l(new C30141i1(c36992f));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C30141i1 c30141i2 = (C30141i1) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c30141i1 = c30141i2;
                    if (c30141i1 != null) {
                        m92306l(c30141i1);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c30141i1 != null) {
                m92306l(c30141i1);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m92306l((C30141i1) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C30141i1 m92305k() {
        C30141i1 c30141i1 = new C30141i1(this);
        int i13 = this.f123144x;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30141i1.f123229y = this.f123145y;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c30141i1.f123230z = this.f123146z;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        c30141i1.f123221E = this.f123140E;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        c30141i1.f123222F = this.f123141F;
        if ((i13 & 16) == 16) {
            i14 |= 16;
        }
        c30141i1.f123223G = this.f123142G;
        if ((i13 & 32) == 32) {
            i14 |= 32;
        }
        c30141i1.f123224H = this.f123143H;
        c30141i1.f123228x = i14;
        return c30141i1;
    }

    /* JADX INFO: renamed from: l */
    public final void m92306l(C30141i1 c30141i1) {
        if (c30141i1 == C30141i1.f123219K) {
            return;
        }
        int i13 = c30141i1.f123228x;
        if ((i13 & 1) == 1) {
            int i14 = c30141i1.f123229y;
            this.f123144x = 1 | this.f123144x;
            this.f123145y = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = c30141i1.f123230z;
            this.f123144x = 2 | this.f123144x;
            this.f123146z = i15;
        }
        if ((i13 & 4) == 4) {
            EnumC30135g1 enumC30135g1 = c30141i1.f123221E;
            enumC30135g1.getClass();
            this.f123144x = 4 | this.f123144x;
            this.f123140E = enumC30135g1;
        }
        int i16 = c30141i1.f123228x;
        if ((i16 & 8) == 8) {
            int i17 = c30141i1.f123222F;
            this.f123144x = 8 | this.f123144x;
            this.f123141F = i17;
        }
        if ((i16 & 16) == 16) {
            int i18 = c30141i1.f123223G;
            this.f123144x = 16 | this.f123144x;
            this.f123142G = i18;
        }
        if ((i16 & 32) == 32) {
            EnumC30138h1 enumC30138h1 = c30141i1.f123224H;
            enumC30138h1.getClass();
            this.f123144x = 32 | this.f123144x;
            this.f123143H = enumC30138h1;
        }
        this.f158353w = this.f158353w.m118743c(c30141i1.f123227w);
    }
}
