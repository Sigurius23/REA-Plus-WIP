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

/* JADX INFO: renamed from: qa3.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C30170w extends AbstractC37004l {

    /* JADX INFO: renamed from: E */
    public int f123472E;

    /* JADX INFO: renamed from: F */
    public List f123473F;

    /* JADX INFO: renamed from: z */
    public int f123474z;

    /* JADX INFO: renamed from: k */
    public static C30170w m92358k() {
        C30170w c30170w = new C30170w();
        c30170w.f123473F = Collections.EMPTY_LIST;
        return c30170w;
    }

    public final Object clone() {
        C30170w c30170w = new C30170w();
        c30170w.f123473F = Collections.EMPTY_LIST;
        c30170w.m92360n(m92359l());
        return c30170w;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C30172x c30172xM92359l = m92359l();
        if (c30172xM92359l.mo92260b()) {
            return c30172xM92359l;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30172x c30172x = null;
        try {
            try {
                C30172x.f123497I.getClass();
                m92360n(new C30172x(c36992f, c36998i));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C30172x c30172x2 = (C30172x) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c30172x = c30172x2;
                    if (c30172x != null) {
                        m92360n(c30172x);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c30172x != null) {
                m92360n(c30172x);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m92360n((C30172x) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final C30172x m92359l() {
        C30172x c30172x = new C30172x(this);
        int i13 = this.f123474z;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30172x.f123503z = this.f123472E;
        if ((i13 & 2) == 2) {
            this.f123473F = Collections.unmodifiableList(this.f123473F);
            this.f123474z &= -3;
        }
        c30172x.f123498E = this.f123473F;
        c30172x.f123502y = i14;
        return c30172x;
    }

    /* JADX INFO: renamed from: n */
    public final void m92360n(C30172x c30172x) {
        if (c30172x == C30172x.f123496H) {
            return;
        }
        if ((c30172x.f123502y & 1) == 1) {
            int i13 = c30172x.f123503z;
            this.f123474z = 1 | this.f123474z;
            this.f123472E = i13;
        }
        if (!c30172x.f123498E.isEmpty()) {
            if (this.f123473F.isEmpty()) {
                this.f123473F = c30172x.f123498E;
                this.f123474z &= -3;
            } else {
                if ((this.f123474z & 2) != 2) {
                    this.f123473F = new ArrayList(this.f123473F);
                    this.f123474z |= 2;
                }
                this.f123473F.addAll(c30172x.f123498E);
            }
        }
        m118816j(c30172x);
        this.f158353w = this.f158353w.m118743c(c30172x.f123501x);
    }
}
