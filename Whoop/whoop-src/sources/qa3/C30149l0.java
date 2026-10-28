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
import wa3.C37016s;
import wa3.InterfaceC37017t;
import wa3.InterfaceC37019v;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: qa3.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30149l0 extends AbstractC37002k implements InterfaceC37020w {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f123336x;

    /* JADX INFO: renamed from: y */
    public int f123337y;

    /* JADX INFO: renamed from: z */
    public List f123338z;

    public /* synthetic */ C30149l0(int i13) {
        this.f123336x = i13;
    }

    /* JADX INFO: renamed from: j */
    public static C30149l0 m92326j() {
        C30149l0 c30149l0 = new C30149l0(1);
        c30149l0.f123338z = C37016s.f158385x;
        return c30149l0;
    }

    /* JADX INFO: renamed from: k */
    public static C30149l0 m92327k() {
        C30149l0 c30149l0 = new C30149l0(0);
        c30149l0.f123338z = Collections.EMPTY_LIST;
        return c30149l0;
    }

    public final Object clone() {
        switch (this.f123336x) {
            case 0:
                C30149l0 c30149l0 = new C30149l0(0);
                c30149l0.f123338z = Collections.EMPTY_LIST;
                c30149l0.m92330o(m92328l());
                return c30149l0;
            default:
                C30149l0 c30149l1 = new C30149l0(1);
                c30149l1.f123338z = C37016s.f158385x;
                c30149l1.m92331p(m92329n());
                return c30149l1;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        switch (this.f123336x) {
            case 0:
                C30157p0 c30157p0M92328l = m92328l();
                if (c30157p0M92328l.mo92260b()) {
                    return c30157p0M92328l;
                }
                throw new UninitializedMessageException();
            default:
                C30161r0 c30161r0M92329n = m92329n();
                c30161r0M92329n.mo92260b();
                return c30161r0M92329n;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        switch (this.f123336x) {
            case 0:
                C30157p0 c30157p0 = null;
                try {
                    try {
                        C30157p0.f123386F.getClass();
                        m92330o(new C30157p0(c36992f, c36998i));
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        C30157p0 c30157p1 = (C30157p0) e5.f89345w;
                        try {
                            throw e5;
                        } catch (Throwable th3) {
                            th = th3;
                            c30157p0 = c30157p1;
                            if (c30157p0 != null) {
                                m92330o(c30157p0);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (c30157p0 != null) {
                        m92330o(c30157p0);
                    }
                    throw th;
                }
            default:
                C30161r0 c30161r0 = null;
                try {
                    try {
                        C30161r0.f123406F.getClass();
                        m92331p(new C30161r0(c36992f));
                        return this;
                    } catch (InvalidProtocolBufferException e13) {
                        C30161r0 c30161r1 = (C30161r0) e13.f89345w;
                        try {
                            throw e13;
                        } catch (Throwable th5) {
                            th = th5;
                            c30161r0 = c30161r1;
                            if (c30161r0 != null) {
                                m92331p(c30161r0);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (c30161r0 != null) {
                        m92331p(c30161r0);
                    }
                    throw th;
                }
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        switch (this.f123336x) {
            case 0:
                m92330o((C30157p0) abstractC37012p);
                break;
            default:
                m92331p((C30161r0) abstractC37012p);
                break;
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C30157p0 m92328l() {
        C30157p0 c30157p0 = new C30157p0(this);
        if ((this.f123337y & 1) == 1) {
            this.f123338z = Collections.unmodifiableList(this.f123338z);
            this.f123337y &= -2;
        }
        c30157p0.f123388x = this.f123338z;
        return c30157p0;
    }

    /* JADX INFO: renamed from: n */
    public C30161r0 m92329n() {
        C30161r0 c30161r0 = new C30161r0(this);
        if ((this.f123337y & 1) == 1) {
            this.f123338z = ((InterfaceC37017t) this.f123338z).mo118815k();
            this.f123337y &= -2;
        }
        c30161r0.f123408x = (InterfaceC37017t) this.f123338z;
        return c30161r0;
    }

    /* JADX INFO: renamed from: o */
    public void m92330o(C30157p0 c30157p0) {
        if (c30157p0 == C30157p0.f123385E) {
            return;
        }
        if (!c30157p0.f123388x.isEmpty()) {
            if (this.f123338z.isEmpty()) {
                this.f123338z = c30157p0.f123388x;
                this.f123337y &= -2;
            } else {
                if ((this.f123337y & 1) != 1) {
                    this.f123338z = new ArrayList(this.f123338z);
                    this.f123337y |= 1;
                }
                this.f123338z.addAll(c30157p0.f123388x);
            }
        }
        this.f158353w = this.f158353w.m118743c(c30157p0.f123387w);
    }

    /* JADX INFO: renamed from: p */
    public void m92331p(C30161r0 c30161r0) {
        if (c30161r0 == C30161r0.f123405E) {
            return;
        }
        if (!c30161r0.f123408x.isEmpty()) {
            if (((InterfaceC37017t) this.f123338z).isEmpty()) {
                this.f123338z = c30161r0.f123408x;
                this.f123337y &= -2;
            } else {
                if ((this.f123337y & 1) != 1) {
                    this.f123338z = new C37016s((InterfaceC37017t) this.f123338z);
                    this.f123337y |= 1;
                }
                ((InterfaceC37017t) this.f123338z).addAll(c30161r0.f123408x);
            }
        }
        this.f158353w = this.f158353w.m118743c(c30161r0.f123407w);
    }
}
