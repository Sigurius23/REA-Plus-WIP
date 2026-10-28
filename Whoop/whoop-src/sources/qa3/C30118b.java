package qa3;

import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p715kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import wa3.AbstractC36990e;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36992f;
import wa3.C36998i;
import wa3.C37018u;
import wa3.InterfaceC37019v;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: qa3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C30118b extends AbstractC37002k implements InterfaceC37020w {

    /* JADX INFO: renamed from: E */
    public Object f122985E;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f122986x;

    /* JADX INFO: renamed from: y */
    public int f122987y;

    /* JADX INFO: renamed from: z */
    public int f122988z;

    public /* synthetic */ C30118b(int i13) {
        this.f122986x = i13;
    }

    /* JADX INFO: renamed from: j */
    public static C30118b m92275j() {
        C30118b c30118b = new C30118b(1);
        c30118b.f122985E = AbstractC36990e.f158321w;
        return c30118b;
    }

    /* JADX INFO: renamed from: k */
    public static C30118b m92276k() {
        C30118b c30118b = new C30118b(0);
        c30118b.f122985E = C30127e.f123093P;
        return c30118b;
    }

    public final Object clone() {
        switch (this.f122986x) {
            case 0:
                C30118b c30118b = new C30118b(0);
                c30118b.f122985E = C30127e.f123093P;
                c30118b.m92282o(m92280l());
                return c30118b;
            default:
                C30118b c30118b2 = new C30118b(1);
                c30118b2.f122985E = AbstractC36990e.f158321w;
                c30118b2.m92283p(m92281n());
                return c30118b2;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        switch (this.f122986x) {
            case 0:
                C30130f c30130fM92280l = m92280l();
                if (c30130fM92280l.mo92260b()) {
                    return c30130fM92280l;
                }
                throw new UninitializedMessageException();
            default:
                C30150m c30150mM92281n = m92281n();
                if (c30150mM92281n.mo92260b()) {
                    return c30150mM92281n;
                }
                throw new UninitializedMessageException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        switch (this.f122986x) {
            case 0:
                C30130f c30130f = null;
                try {
                    try {
                        C30130f.f123127H.getClass();
                        m92282o(new C30130f(c36992f, c36998i));
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        C30130f c30130f2 = (C30130f) e5.f89345w;
                        try {
                            throw e5;
                        } catch (Throwable th3) {
                            th = th3;
                            c30130f = c30130f2;
                            if (c30130f != null) {
                                m92282o(c30130f);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (c30130f != null) {
                        m92282o(c30130f);
                    }
                    throw th;
                }
            default:
                C30150m c30150m = null;
                try {
                    try {
                        C30150m.f123340H.getClass();
                        m92283p(new C30150m(c36992f));
                        return this;
                    } catch (InvalidProtocolBufferException e13) {
                        C30150m c30150m2 = (C30150m) e13.f89345w;
                        try {
                            throw e13;
                        } catch (Throwable th5) {
                            th = th5;
                            c30150m = c30150m2;
                            if (c30150m != null) {
                                m92283p(c30150m);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (c30150m != null) {
                        m92283p(c30150m);
                    }
                    throw th;
                }
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        switch (this.f122986x) {
            case 0:
                m92282o((C30130f) abstractC37012p);
                break;
            default:
                m92283p((C30150m) abstractC37012p);
                break;
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C30130f m92280l() {
        C30130f c30130f = new C30130f(this);
        int i13 = this.f122987y;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30130f.f123132y = this.f122988z;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c30130f.f123133z = (C30127e) this.f122985E;
        c30130f.f123131x = i14;
        return c30130f;
    }

    /* JADX INFO: renamed from: n */
    public C30150m m92281n() {
        C30150m c30150m = new C30150m(this);
        int i13 = this.f122987y;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30150m.f123345y = this.f122988z;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c30150m.f123346z = (C37018u) this.f122985E;
        c30150m.f123344x = i14;
        return c30150m;
    }

    /* JADX INFO: renamed from: o */
    public void m92282o(C30130f c30130f) {
        C30127e c30127e;
        if (c30130f == C30130f.f123126G) {
            return;
        }
        int i13 = c30130f.f123131x;
        if ((i13 & 1) == 1) {
            int i14 = c30130f.f123132y;
            this.f122987y = 1 | this.f122987y;
            this.f122988z = i14;
        }
        if ((i13 & 2) == 2) {
            C30127e c30127e2 = c30130f.f123133z;
            if ((this.f122987y & 2) != 2 || (c30127e = (C30127e) this.f122985E) == C30127e.f123093P) {
                this.f122985E = c30127e2;
            } else {
                C30121c c30121cM92298j = C30127e.m92298j(c30127e);
                c30121cM92298j.m92291l(c30127e2);
                this.f122985E = c30121cM92298j.m92290j();
            }
            this.f122987y |= 2;
        }
        this.f158353w = this.f158353w.m118743c(c30130f.f123130w);
    }

    /* JADX INFO: renamed from: p */
    public void m92283p(C30150m c30150m) {
        if (c30150m == C30150m.f123339G) {
            return;
        }
        int i13 = c30150m.f123344x;
        if ((i13 & 1) == 1) {
            int i14 = c30150m.f123345y;
            this.f122987y = 1 | this.f122987y;
            this.f122988z = i14;
        }
        if ((i13 & 2) == 2) {
            C37018u c37018u = c30150m.f123346z;
            c37018u.getClass();
            this.f122987y = 2 | this.f122987y;
            this.f122985E = c37018u;
        }
        this.f158353w = this.f158353w.m118743c(c30150m.f123343w);
    }
}
