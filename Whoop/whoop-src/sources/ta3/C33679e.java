package ta3;

import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36992f;
import wa3.C36998i;
import wa3.InterfaceC37019v;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: ta3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C33679e extends AbstractC37002k implements InterfaceC37020w {

    /* JADX INFO: renamed from: E */
    public C33678d f140681E;

    /* JADX INFO: renamed from: F */
    public C33678d f140682F;

    /* JADX INFO: renamed from: G */
    public C33678d f140683G;

    /* JADX INFO: renamed from: x */
    public int f140684x;

    /* JADX INFO: renamed from: y */
    public C33676b f140685y;

    /* JADX INFO: renamed from: z */
    public C33678d f140686z;

    /* JADX INFO: renamed from: k */
    public static C33679e m106424k() {
        C33679e c33679e = new C33679e();
        c33679e.f140685y = C33676b.f140662G;
        C33678d c33678d = C33678d.f140673G;
        c33679e.f140686z = c33678d;
        c33679e.f140681E = c33678d;
        c33679e.f140682F = c33678d;
        c33679e.f140683G = c33678d;
        return c33679e;
    }

    public final Object clone() {
        C33679e c33679eM106424k = m106424k();
        c33679eM106424k.m106426l(m106425j());
        return c33679eM106424k;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C33680f c33680fM106425j = m106425j();
        c33680fM106425j.mo92260b();
        return c33680fM106425j;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C33680f c33680f = null;
        try {
            try {
                C33680f.f140688K.getClass();
                m106426l(new C33680f(c36992f, c36998i));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C33680f c33680f2 = (C33680f) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c33680f = c33680f2;
                    if (c33680f != null) {
                        m106426l(c33680f);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c33680f != null) {
                m106426l(c33680f);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m106426l((C33680f) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final C33680f m106425j() {
        C33680f c33680f = new C33680f(this);
        int i13 = this.f140684x;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c33680f.f140696y = this.f140685y;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c33680f.f140697z = this.f140686z;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        c33680f.f140689E = this.f140681E;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        c33680f.f140690F = this.f140682F;
        if ((i13 & 16) == 16) {
            i14 |= 16;
        }
        c33680f.f140691G = this.f140683G;
        c33680f.f140695x = i14;
        return c33680f;
    }

    /* JADX INFO: renamed from: l */
    public final void m106426l(C33680f c33680f) {
        C33678d c33678d;
        C33678d c33678d2;
        C33678d c33678d3;
        C33678d c33678d4;
        C33676b c33676b;
        if (c33680f == C33680f.f140687J) {
            return;
        }
        if ((c33680f.f140695x & 1) == 1) {
            C33676b c33676b2 = c33680f.f140696y;
            if ((this.f140684x & 1) != 1 || (c33676b = this.f140685y) == C33676b.f140662G) {
                this.f140685y = c33676b2;
            } else {
                C33675a c33675aM106418j = C33675a.m106418j();
                c33675aM106418j.m106420l(c33676b);
                c33675aM106418j.m106420l(c33676b2);
                this.f140685y = c33675aM106418j.m106419k();
            }
            this.f140684x |= 1;
        }
        if ((c33680f.f140695x & 2) == 2) {
            C33678d c33678d5 = c33680f.f140697z;
            if ((this.f140684x & 2) != 2 || (c33678d4 = this.f140686z) == C33678d.f140673G) {
                this.f140686z = c33678d5;
            } else {
                C33677c c33677cM106423i = C33678d.m106423i(c33678d4);
                c33677cM106423i.m106422k(c33678d5);
                this.f140686z = c33677cM106423i.m106421j();
            }
            this.f140684x |= 2;
        }
        if (c33680f.m106427i()) {
            C33678d c33678d6 = c33680f.f140689E;
            if ((this.f140684x & 4) != 4 || (c33678d3 = this.f140681E) == C33678d.f140673G) {
                this.f140681E = c33678d6;
            } else {
                C33677c c33677cM106423i2 = C33678d.m106423i(c33678d3);
                c33677cM106423i2.m106422k(c33678d6);
                this.f140681E = c33677cM106423i2.m106421j();
            }
            this.f140684x |= 4;
        }
        if ((c33680f.f140695x & 8) == 8) {
            C33678d c33678d7 = c33680f.f140690F;
            if ((this.f140684x & 8) != 8 || (c33678d2 = this.f140682F) == C33678d.f140673G) {
                this.f140682F = c33678d7;
            } else {
                C33677c c33677cM106423i3 = C33678d.m106423i(c33678d2);
                c33677cM106423i3.m106422k(c33678d7);
                this.f140682F = c33677cM106423i3.m106421j();
            }
            this.f140684x |= 8;
        }
        if ((c33680f.f140695x & 16) == 16) {
            C33678d c33678d8 = c33680f.f140691G;
            if ((this.f140684x & 16) != 16 || (c33678d = this.f140683G) == C33678d.f140673G) {
                this.f140683G = c33678d8;
            } else {
                C33677c c33677cM106423i4 = C33678d.m106423i(c33678d);
                c33677cM106423i4.m106422k(c33678d8);
                this.f140683G = c33677cM106423i4.m106421j();
            }
            this.f140684x |= 16;
        }
        this.f158353w = this.f158353w.m118743c(c33680f.f140694w);
    }
}
