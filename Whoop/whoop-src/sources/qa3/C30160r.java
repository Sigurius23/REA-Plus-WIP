package qa3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p715kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36992f;
import wa3.C36998i;
import wa3.InterfaceC37019v;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: qa3.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C30160r extends AbstractC37002k implements InterfaceC37020w {

    /* JADX INFO: renamed from: E */
    public C30116a0 f123399E;

    /* JADX INFO: renamed from: F */
    public EnumC30166u f123400F;

    /* JADX INFO: renamed from: G */
    public EnumC30162s f123401G;

    /* JADX INFO: renamed from: x */
    public int f123402x;

    /* JADX INFO: renamed from: y */
    public EnumC30164t f123403y;

    /* JADX INFO: renamed from: z */
    public List f123404z;

    /* JADX INFO: renamed from: k */
    public static C30160r m92342k() {
        C30160r c30160r = new C30160r();
        c30160r.f123403y = EnumC30164t.RETURNS_CONSTANT;
        c30160r.f123404z = Collections.EMPTY_LIST;
        c30160r.f123399E = C30116a0.f122967L;
        c30160r.f123400F = EnumC30166u.AT_MOST_ONCE;
        c30160r.f123401G = EnumC30162s.CONCLUSION_CONDITION;
        return c30160r;
    }

    public final Object clone() {
        C30160r c30160rM92342k = m92342k();
        c30160rM92342k.m92344l(m92343j());
        return c30160rM92342k;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C30168v c30168vM92343j = m92343j();
        if (c30168vM92343j.mo92260b()) {
            return c30168vM92343j;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30168v c30168v = null;
        try {
            try {
                C30168v.f123446K.getClass();
                m92344l(new C30168v(c36992f, c36998i));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C30168v c30168v2 = (C30168v) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c30168v = c30168v2;
                    if (c30168v != null) {
                        m92344l(c30168v);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c30168v != null) {
                m92344l(c30168v);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m92344l((C30168v) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final C30168v m92343j() {
        C30168v c30168v = new C30168v(this);
        int i13 = this.f123402x;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30168v.f123454y = this.f123403y;
        if ((i13 & 2) == 2) {
            this.f123404z = Collections.unmodifiableList(this.f123404z);
            this.f123402x &= -3;
        }
        c30168v.f123455z = this.f123404z;
        if ((i13 & 4) == 4) {
            i14 |= 2;
        }
        c30168v.f123447E = this.f123399E;
        if ((i13 & 8) == 8) {
            i14 |= 4;
        }
        c30168v.f123448F = this.f123400F;
        if ((i13 & 16) == 16) {
            i14 |= 8;
        }
        c30168v.f123449G = this.f123401G;
        c30168v.f123453x = i14;
        return c30168v;
    }

    /* JADX INFO: renamed from: l */
    public final void m92344l(C30168v c30168v) {
        C30116a0 c30116a0;
        if (c30168v == C30168v.f123445J) {
            return;
        }
        if (c30168v.m92353n()) {
            EnumC30164t enumC30164t = c30168v.f123454y;
            enumC30164t.getClass();
            this.f123402x |= 1;
            this.f123403y = enumC30164t;
        }
        if (!c30168v.f123455z.isEmpty()) {
            if (this.f123404z.isEmpty()) {
                this.f123404z = c30168v.f123455z;
                this.f123402x &= -3;
            } else {
                if ((this.f123402x & 2) != 2) {
                    this.f123404z = new ArrayList(this.f123404z);
                    this.f123402x |= 2;
                }
                this.f123404z.addAll(c30168v.f123455z);
            }
        }
        if (c30168v.m92352m()) {
            C30116a0 c30116a1 = c30168v.f123447E;
            if ((this.f123402x & 4) != 4 || (c30116a0 = this.f123399E) == C30116a0.f122967L) {
                this.f123399E = c30116a1;
            } else {
                C30174y c30174yM92368k = C30174y.m92368k();
                c30174yM92368k.m92370l(c30116a0);
                c30174yM92368k.m92370l(c30116a1);
                this.f123399E = c30174yM92368k.m92369j();
            }
            this.f123402x |= 4;
        }
        if (c30168v.m92354o()) {
            EnumC30166u enumC30166u = c30168v.f123448F;
            enumC30166u.getClass();
            this.f123402x |= 8;
            this.f123400F = enumC30166u;
        }
        if ((c30168v.f123453x & 8) == 8) {
            EnumC30162s enumC30162s = c30168v.f123449G;
            enumC30162s.getClass();
            this.f123402x |= 16;
            this.f123401G = enumC30162s;
        }
        this.f158353w = this.f158353w.m118743c(c30168v.f123452w);
    }
}
