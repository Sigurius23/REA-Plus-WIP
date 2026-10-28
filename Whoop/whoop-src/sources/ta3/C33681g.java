package ta3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36992f;
import wa3.C36998i;
import wa3.InterfaceC37019v;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: ta3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C33681g extends AbstractC37002k implements InterfaceC37020w {

    /* JADX INFO: renamed from: x */
    public int f140698x;

    /* JADX INFO: renamed from: y */
    public List f140699y;

    /* JADX INFO: renamed from: z */
    public List f140700z;

    /* JADX INFO: renamed from: j */
    public static C33681g m106428j() {
        C33681g c33681g = new C33681g();
        List list = Collections.EMPTY_LIST;
        c33681g.f140699y = list;
        c33681g.f140700z = list;
        return c33681g;
    }

    public final Object clone() {
        C33681g c33681g = new C33681g();
        List list = Collections.EMPTY_LIST;
        c33681g.f140699y = list;
        c33681g.f140700z = list;
        c33681g.m106430l(m106429k());
        return c33681g;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C33685k c33685kM106429k = m106429k();
        c33685kM106429k.mo92260b();
        return c33685kM106429k;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C33685k c33685k = null;
        try {
            try {
                C33685k.f140728H.getClass();
                m106430l(new C33685k(c36992f, c36998i));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C33685k c33685k2 = (C33685k) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c33685k = c33685k2;
                    if (c33685k != null) {
                        m106430l(c33685k);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c33685k != null) {
                m106430l(c33685k);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m106430l((C33685k) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C33685k m106429k() {
        C33685k c33685k = new C33685k(this);
        if ((this.f140698x & 1) == 1) {
            this.f140699y = Collections.unmodifiableList(this.f140699y);
            this.f140698x &= -2;
        }
        c33685k.f140732x = this.f140699y;
        if ((this.f140698x & 2) == 2) {
            this.f140700z = Collections.unmodifiableList(this.f140700z);
            this.f140698x &= -3;
        }
        c33685k.f140733y = this.f140700z;
        return c33685k;
    }

    /* JADX INFO: renamed from: l */
    public final void m106430l(C33685k c33685k) {
        if (c33685k == C33685k.f140727G) {
            return;
        }
        if (!c33685k.f140732x.isEmpty()) {
            if (this.f140699y.isEmpty()) {
                this.f140699y = c33685k.f140732x;
                this.f140698x &= -2;
            } else {
                if ((this.f140698x & 1) != 1) {
                    this.f140699y = new ArrayList(this.f140699y);
                    this.f140698x |= 1;
                }
                this.f140699y.addAll(c33685k.f140732x);
            }
        }
        if (!c33685k.f140733y.isEmpty()) {
            if (this.f140700z.isEmpty()) {
                this.f140700z = c33685k.f140733y;
                this.f140698x &= -3;
            } else {
                if ((this.f140698x & 2) != 2) {
                    this.f140700z = new ArrayList(this.f140700z);
                    this.f140698x |= 2;
                }
                this.f140700z.addAll(c33685k.f140733y);
            }
        }
        this.f158353w = this.f158353w.m118743c(c33685k.f140731w);
    }
}
