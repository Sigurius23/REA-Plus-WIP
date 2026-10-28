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

/* JADX INFO: renamed from: ta3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C33682h extends AbstractC37002k implements InterfaceC37020w {

    /* JADX INFO: renamed from: E */
    public Object f140701E;

    /* JADX INFO: renamed from: F */
    public EnumC33683i f140702F;

    /* JADX INFO: renamed from: G */
    public List f140703G;

    /* JADX INFO: renamed from: H */
    public List f140704H;

    /* JADX INFO: renamed from: x */
    public int f140705x;

    /* JADX INFO: renamed from: y */
    public int f140706y;

    /* JADX INFO: renamed from: z */
    public int f140707z;

    /* JADX INFO: renamed from: j */
    public static C33682h m106431j() {
        C33682h c33682h = new C33682h();
        c33682h.f140706y = 1;
        c33682h.f140701E = "";
        c33682h.f140702F = EnumC33683i.NONE;
        List list = Collections.EMPTY_LIST;
        c33682h.f140703G = list;
        c33682h.f140704H = list;
        return c33682h;
    }

    public final Object clone() {
        C33682h c33682h = new C33682h();
        c33682h.f140706y = 1;
        c33682h.f140701E = "";
        c33682h.f140702F = EnumC33683i.NONE;
        List list = Collections.EMPTY_LIST;
        c33682h.f140703G = list;
        c33682h.f140704H = list;
        c33682h.m106433l(m106432k());
        return c33682h;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C33684j c33684jM106432k = m106432k();
        c33684jM106432k.mo92260b();
        return c33684jM106432k;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C33684j c33684j = null;
        try {
            try {
                C33684j.f140714N.getClass();
                m106433l(new C33684j(c36992f));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C33684j c33684j2 = (C33684j) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c33684j = c33684j2;
                    if (c33684j != null) {
                        m106433l(c33684j);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c33684j != null) {
                m106433l(c33684j);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m106433l((C33684j) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C33684j m106432k() {
        C33684j c33684j = new C33684j(this);
        int i13 = this.f140705x;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c33684j.f140725y = this.f140706y;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c33684j.f140726z = this.f140707z;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        c33684j.f140715E = this.f140701E;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        c33684j.f140716F = this.f140702F;
        if ((i13 & 16) == 16) {
            this.f140703G = Collections.unmodifiableList(this.f140703G);
            this.f140705x &= -17;
        }
        c33684j.f140717G = this.f140703G;
        if ((this.f140705x & 32) == 32) {
            this.f140704H = Collections.unmodifiableList(this.f140704H);
            this.f140705x &= -33;
        }
        c33684j.f140719I = this.f140704H;
        c33684j.f140724x = i14;
        return c33684j;
    }

    /* JADX INFO: renamed from: l */
    public final void m106433l(C33684j c33684j) {
        if (c33684j == C33684j.f140713M) {
            return;
        }
        int i13 = c33684j.f140724x;
        if ((i13 & 1) == 1) {
            int i14 = c33684j.f140725y;
            this.f140705x = 1 | this.f140705x;
            this.f140706y = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = c33684j.f140726z;
            this.f140705x = 2 | this.f140705x;
            this.f140707z = i15;
        }
        if ((i13 & 4) == 4) {
            this.f140705x |= 4;
            this.f140701E = c33684j.f140715E;
        }
        if ((i13 & 8) == 8) {
            EnumC33683i enumC33683i = c33684j.f140716F;
            enumC33683i.getClass();
            this.f140705x = 8 | this.f140705x;
            this.f140702F = enumC33683i;
        }
        if (!c33684j.f140717G.isEmpty()) {
            if (this.f140703G.isEmpty()) {
                this.f140703G = c33684j.f140717G;
                this.f140705x &= -17;
            } else {
                if ((this.f140705x & 16) != 16) {
                    this.f140703G = new ArrayList(this.f140703G);
                    this.f140705x |= 16;
                }
                this.f140703G.addAll(c33684j.f140717G);
            }
        }
        if (!c33684j.f140719I.isEmpty()) {
            if (this.f140704H.isEmpty()) {
                this.f140704H = c33684j.f140719I;
                this.f140705x &= -33;
            } else {
                if ((this.f140705x & 32) != 32) {
                    this.f140704H = new ArrayList(this.f140704H);
                    this.f140705x |= 32;
                }
                this.f140704H.addAll(c33684j.f140719I);
            }
        }
        this.f158353w = this.f158353w.m118743c(c33684j.f140723w);
    }
}
