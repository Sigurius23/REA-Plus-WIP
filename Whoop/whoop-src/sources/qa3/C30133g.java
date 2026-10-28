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

/* JADX INFO: renamed from: qa3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C30133g extends AbstractC37002k implements InterfaceC37020w {

    /* JADX INFO: renamed from: E */
    public int f123147E;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f123148x;

    /* JADX INFO: renamed from: y */
    public int f123149y;

    /* JADX INFO: renamed from: z */
    public List f123150z;

    public /* synthetic */ C30133g(int i13) {
        this.f123148x = i13;
    }

    /* JADX INFO: renamed from: l */
    public static C30133g m92307l() {
        C30133g c30133g = new C30133g(1);
        c30133g.f123150z = Collections.EMPTY_LIST;
        c30133g.f123147E = -1;
        return c30133g;
    }

    public final Object clone() {
        switch (this.f123148x) {
            case 0:
                C30133g c30133g = new C30133g(0);
                c30133g.f123150z = Collections.EMPTY_LIST;
                c30133g.m92310n(m92308j());
                return c30133g;
            default:
                C30133g c30133gM92307l = m92307l();
                c30133gM92307l.m92311o(m92309k());
                return c30133gM92307l;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        switch (this.f123148x) {
            case 0:
                C30136h c30136hM92308j = m92308j();
                if (c30136hM92308j.mo92260b()) {
                    return c30136hM92308j;
                }
                throw new UninitializedMessageException();
            default:
                C30123c1 c30123c1M92309k = m92309k();
                if (c30123c1M92309k.mo92260b()) {
                    return c30123c1M92309k;
                }
                throw new UninitializedMessageException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003d  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        switch (this.f123148x) {
            case 0:
                C30136h c30136h = null;
                try {
                    try {
                        m92310n((C30136h) C30136h.f123168H.mo92259a(c36992f, c36998i));
                        return this;
                    } catch (Throwable th3) {
                        th = th3;
                        if (c30136h != null) {
                            m92310n(c30136h);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e5) {
                    C30136h c30136h2 = (C30136h) e5.f89345w;
                    try {
                        throw e5;
                    } catch (Throwable th4) {
                        th = th4;
                        c30136h = c30136h2;
                        if (c30136h != null) {
                            m92310n(c30136h);
                        }
                        throw th;
                    }
                }
            default:
                C30123c1 c30123c1 = null;
                try {
                    try {
                        C30123c1.f123060H.getClass();
                        m92311o(new C30123c1(c36992f, c36998i));
                        return this;
                    } catch (InvalidProtocolBufferException e13) {
                        C30123c1 c30123c2 = (C30123c1) e13.f89345w;
                        try {
                            throw e13;
                        } catch (Throwable th5) {
                            th = th5;
                            c30123c1 = c30123c2;
                            if (c30123c1 != null) {
                                m92311o(c30123c1);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (c30123c1 != null) {
                        m92311o(c30123c1);
                    }
                    throw th;
                }
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        switch (this.f123148x) {
            case 0:
                m92310n((C30136h) abstractC37012p);
                break;
            default:
                m92311o((C30123c1) abstractC37012p);
                break;
        }
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C30136h m92308j() {
        C30136h c30136h = new C30136h(this);
        int i13 = this.f123149y;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30136h.f123173y = this.f123147E;
        if ((i13 & 2) == 2) {
            this.f123150z = Collections.unmodifiableList(this.f123150z);
            this.f123149y &= -3;
        }
        c30136h.f123174z = this.f123150z;
        c30136h.f123172x = i14;
        return c30136h;
    }

    /* JADX INFO: renamed from: k */
    public C30123c1 m92309k() {
        C30123c1 c30123c1 = new C30123c1(this);
        int i13 = this.f123149y;
        if ((i13 & 1) == 1) {
            this.f123150z = Collections.unmodifiableList(this.f123150z);
            this.f123149y &= -2;
        }
        c30123c1.f123065y = this.f123150z;
        int i14 = (i13 & 2) != 2 ? 0 : 1;
        c30123c1.f123066z = this.f123147E;
        c30123c1.f123064x = i14;
        return c30123c1;
    }

    /* JADX INFO: renamed from: n */
    public void m92310n(C30136h c30136h) {
        if (c30136h == C30136h.f123167G) {
            return;
        }
        if ((c30136h.f123172x & 1) == 1) {
            int i13 = c30136h.f123173y;
            this.f123149y = 1 | this.f123149y;
            this.f123147E = i13;
        }
        if (!c30136h.f123174z.isEmpty()) {
            if (this.f123150z.isEmpty()) {
                this.f123150z = c30136h.f123174z;
                this.f123149y &= -3;
            } else {
                if ((this.f123149y & 2) != 2) {
                    this.f123150z = new ArrayList(this.f123150z);
                    this.f123149y |= 2;
                }
                this.f123150z.addAll(c30136h.f123174z);
            }
        }
        this.f158353w = this.f158353w.m118743c(c30136h.f123171w);
    }

    /* JADX INFO: renamed from: o */
    public void m92311o(C30123c1 c30123c1) {
        if (c30123c1 == C30123c1.f123059G) {
            return;
        }
        if (!c30123c1.f123065y.isEmpty()) {
            if (this.f123150z.isEmpty()) {
                this.f123150z = c30123c1.f123065y;
                this.f123149y &= -2;
            } else {
                if ((this.f123149y & 1) != 1) {
                    this.f123150z = new ArrayList(this.f123150z);
                    this.f123149y |= 1;
                }
                this.f123150z.addAll(c30123c1.f123065y);
            }
        }
        if ((c30123c1.f123064x & 1) == 1) {
            int i13 = c30123c1.f123066z;
            this.f123149y |= 2;
            this.f123147E = i13;
        }
        this.f158353w = this.f158353w.m118743c(c30123c1.f123063w);
    }
}
