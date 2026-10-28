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

/* JADX INFO: renamed from: qa3.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C30152n extends AbstractC37004l {

    /* JADX INFO: renamed from: E */
    public int f123351E;

    /* JADX INFO: renamed from: F */
    public List f123352F;

    /* JADX INFO: renamed from: G */
    public List f123353G;

    /* JADX INFO: renamed from: H */
    public List f123354H;

    /* JADX INFO: renamed from: I */
    public List f123355I;

    /* JADX INFO: renamed from: z */
    public int f123356z;

    /* JADX INFO: renamed from: k */
    public static C30152n m92335k() {
        C30152n c30152n = new C30152n();
        c30152n.f123351E = 6;
        List list = Collections.EMPTY_LIST;
        c30152n.f123352F = list;
        c30152n.f123353G = list;
        c30152n.f123354H = list;
        c30152n.f123355I = list;
        return c30152n;
    }

    public final Object clone() {
        C30152n c30152n = new C30152n();
        c30152n.f123351E = 6;
        List list = Collections.EMPTY_LIST;
        c30152n.f123352F = list;
        c30152n.f123353G = list;
        c30152n.f123354H = list;
        c30152n.f123355I = list;
        c30152n.m92337n(m92336l());
        return c30152n;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C30154o c30154oM92336l = m92336l();
        if (c30154oM92336l.mo92260b()) {
            return c30154oM92336l;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30154o c30154o = null;
        try {
            try {
                C30154o.f123363L.getClass();
                m92337n(new C30154o(c36992f, c36998i));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C30154o c30154o2 = (C30154o) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c30154o = c30154o2;
                    if (c30154o != null) {
                        m92337n(c30154o);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c30154o != null) {
                m92337n(c30154o);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m92337n((C30154o) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final C30154o m92336l() {
        C30154o c30154o = new C30154o(this);
        int i13 = this.f123356z;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30154o.f123372z = this.f123351E;
        if ((i13 & 2) == 2) {
            this.f123352F = Collections.unmodifiableList(this.f123352F);
            this.f123356z &= -3;
        }
        c30154o.f123364E = this.f123352F;
        if ((this.f123356z & 4) == 4) {
            this.f123353G = Collections.unmodifiableList(this.f123353G);
            this.f123356z &= -5;
        }
        c30154o.f123365F = this.f123353G;
        if ((this.f123356z & 8) == 8) {
            this.f123354H = Collections.unmodifiableList(this.f123354H);
            this.f123356z &= -9;
        }
        c30154o.f123366G = this.f123354H;
        if ((this.f123356z & 16) == 16) {
            this.f123355I = Collections.unmodifiableList(this.f123355I);
            this.f123356z &= -17;
        }
        c30154o.f123367H = this.f123355I;
        c30154o.f123371y = i14;
        return c30154o;
    }

    /* JADX INFO: renamed from: n */
    public final void m92337n(C30154o c30154o) {
        if (c30154o == C30154o.f123362K) {
            return;
        }
        if ((c30154o.f123371y & 1) == 1) {
            int i13 = c30154o.f123372z;
            this.f123356z = 1 | this.f123356z;
            this.f123351E = i13;
        }
        if (!c30154o.f123364E.isEmpty()) {
            if (this.f123352F.isEmpty()) {
                this.f123352F = c30154o.f123364E;
                this.f123356z &= -3;
            } else {
                if ((this.f123356z & 2) != 2) {
                    this.f123352F = new ArrayList(this.f123352F);
                    this.f123356z |= 2;
                }
                this.f123352F.addAll(c30154o.f123364E);
            }
        }
        if (!c30154o.f123365F.isEmpty()) {
            if (this.f123353G.isEmpty()) {
                this.f123353G = c30154o.f123365F;
                this.f123356z &= -5;
            } else {
                if ((this.f123356z & 4) != 4) {
                    this.f123353G = new ArrayList(this.f123353G);
                    this.f123356z |= 4;
                }
                this.f123353G.addAll(c30154o.f123365F);
            }
        }
        if (!c30154o.f123366G.isEmpty()) {
            if (this.f123354H.isEmpty()) {
                this.f123354H = c30154o.f123366G;
                this.f123356z &= -9;
            } else {
                if ((this.f123356z & 8) != 8) {
                    this.f123354H = new ArrayList(this.f123354H);
                    this.f123356z |= 8;
                }
                this.f123354H.addAll(c30154o.f123366G);
            }
        }
        if (!c30154o.f123367H.isEmpty()) {
            if (this.f123355I.isEmpty()) {
                this.f123355I = c30154o.f123367H;
                this.f123356z &= -17;
            } else {
                if ((this.f123356z & 16) != 16) {
                    this.f123355I = new ArrayList(this.f123355I);
                    this.f123356z |= 16;
                }
                this.f123355I.addAll(c30154o.f123367H);
            }
        }
        m118816j(c30154o);
        this.f158353w = this.f158353w.m118743c(c30154o.f123370x);
    }
}
