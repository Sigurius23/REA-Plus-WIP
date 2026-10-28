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

/* JADX INFO: renamed from: qa3.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C30156p extends AbstractC37002k implements InterfaceC37020w {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f123382x;

    /* JADX INFO: renamed from: y */
    public int f123383y;

    /* JADX INFO: renamed from: z */
    public List f123384z;

    public /* synthetic */ C30156p(int i13) {
        this.f123382x = i13;
    }

    public final Object clone() {
        switch (this.f123382x) {
            case 0:
                C30156p c30156p = new C30156p(0);
                c30156p.f123384z = Collections.EMPTY_LIST;
                c30156p.m92340l(m92338j());
                return c30156p;
            default:
                C30156p c30156p2 = new C30156p(1);
                c30156p2.f123384z = Collections.EMPTY_LIST;
                c30156p2.m92341n(m92339k());
                return c30156p2;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        switch (this.f123382x) {
            case 0:
                C30158q c30158qM92338j = m92338j();
                if (c30158qM92338j.mo92260b()) {
                    return c30158qM92338j;
                }
                throw new UninitializedMessageException();
            default:
                C30144j1 c30144j1M92339k = m92339k();
                c30144j1M92339k.mo92260b();
                return c30144j1M92339k;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        switch (this.f123382x) {
            case 0:
                C30158q c30158q = null;
                try {
                    try {
                        C30158q.f123392F.getClass();
                        m92340l(new C30158q(c36992f, c36998i));
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        C30158q c30158q2 = (C30158q) e5.f89345w;
                        try {
                            throw e5;
                        } catch (Throwable th3) {
                            th = th3;
                            c30158q = c30158q2;
                            if (c30158q != null) {
                                m92340l(c30158q);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (c30158q != null) {
                        m92340l(c30158q);
                    }
                    throw th;
                }
            default:
                C30144j1 c30144j1 = null;
                try {
                    try {
                        C30144j1.f123264F.getClass();
                        m92341n(new C30144j1(c36992f, c36998i));
                        return this;
                    } catch (InvalidProtocolBufferException e13) {
                        C30144j1 c30144j2 = (C30144j1) e13.f89345w;
                        try {
                            throw e13;
                        } catch (Throwable th5) {
                            th = th5;
                            c30144j1 = c30144j2;
                            if (c30144j1 != null) {
                                m92341n(c30144j1);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (c30144j1 != null) {
                        m92341n(c30144j1);
                    }
                    throw th;
                }
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        switch (this.f123382x) {
            case 0:
                m92340l((C30158q) abstractC37012p);
                break;
            default:
                m92341n((C30144j1) abstractC37012p);
                break;
        }
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C30158q m92338j() {
        C30158q c30158q = new C30158q(this);
        if ((this.f123383y & 1) == 1) {
            this.f123384z = Collections.unmodifiableList(this.f123384z);
            this.f123383y &= -2;
        }
        c30158q.f123394x = this.f123384z;
        return c30158q;
    }

    /* JADX INFO: renamed from: k */
    public C30144j1 m92339k() {
        C30144j1 c30144j1 = new C30144j1(this);
        if ((this.f123383y & 1) == 1) {
            this.f123384z = Collections.unmodifiableList(this.f123384z);
            this.f123383y &= -2;
        }
        c30144j1.f123266x = this.f123384z;
        return c30144j1;
    }

    /* JADX INFO: renamed from: l */
    public void m92340l(C30158q c30158q) {
        if (c30158q == C30158q.f123391E) {
            return;
        }
        if (!c30158q.f123394x.isEmpty()) {
            if (this.f123384z.isEmpty()) {
                this.f123384z = c30158q.f123394x;
                this.f123383y &= -2;
            } else {
                if ((this.f123383y & 1) != 1) {
                    this.f123384z = new ArrayList(this.f123384z);
                    this.f123383y |= 1;
                }
                this.f123384z.addAll(c30158q.f123394x);
            }
        }
        this.f158353w = this.f158353w.m118743c(c30158q.f123393w);
    }

    /* JADX INFO: renamed from: n */
    public void m92341n(C30144j1 c30144j1) {
        if (c30144j1 == C30144j1.f123263E) {
            return;
        }
        if (!c30144j1.f123266x.isEmpty()) {
            if (this.f123384z.isEmpty()) {
                this.f123384z = c30144j1.f123266x;
                this.f123383y &= -2;
            } else {
                if ((this.f123383y & 1) != 1) {
                    this.f123384z = new ArrayList(this.f123384z);
                    this.f123383y |= 1;
                }
                this.f123384z.addAll(c30144j1.f123266x);
            }
        }
        this.f158353w = this.f158353w.m118743c(c30144j1.f123265w);
    }
}
