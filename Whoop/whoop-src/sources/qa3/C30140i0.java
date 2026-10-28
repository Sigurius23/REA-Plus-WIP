package qa3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p389p0.C28539n0;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import wa3.AbstractC36990e;
import wa3.AbstractC37002k;
import wa3.AbstractC37006m;
import wa3.C36988d;
import wa3.C36992f;
import wa3.C36994g;
import wa3.C36998i;
import wa3.InterfaceC37019v;

/* JADX INFO: renamed from: qa3.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C30140i0 extends AbstractC37006m {

    /* JADX INFO: renamed from: J */
    public static final C30140i0 f123209J;

    /* JADX INFO: renamed from: K */
    public static final C30115a f123210K = new C30115a(9);

    /* JADX INFO: renamed from: E */
    public C30157p0 f123211E;

    /* JADX INFO: renamed from: F */
    public C30134g0 f123212F;

    /* JADX INFO: renamed from: G */
    public List f123213G;

    /* JADX INFO: renamed from: H */
    public byte f123214H;

    /* JADX INFO: renamed from: I */
    public int f123215I;

    /* JADX INFO: renamed from: x */
    public final AbstractC36990e f123216x;

    /* JADX INFO: renamed from: y */
    public int f123217y;

    /* JADX INFO: renamed from: z */
    public C30161r0 f123218z;

    static {
        C30140i0 c30140i0 = new C30140i0();
        f123209J = c30140i0;
        c30140i0.f123218z = C30161r0.f123405E;
        c30140i0.f123211E = C30157p0.f123385E;
        c30140i0.f123212F = C30134g0.f123151K;
        c30140i0.f123213G = Collections.EMPTY_LIST;
    }

    public C30140i0(C30137h0 c30137h0) {
        super(c30137h0);
        this.f123214H = (byte) -1;
        this.f123215I = -1;
        this.f123216x = c30137h0.f158353w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: a */
    public final InterfaceC37019v mo92288a() {
        return f123209J;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123214H;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f123217y & 2) == 2 && !this.f123211E.mo92260b()) {
            this.f123214H = (byte) 0;
            return false;
        }
        if ((this.f123217y & 4) == 4 && !this.f123212F.mo92260b()) {
            this.f123214H = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < this.f123213G.size(); i13++) {
            if (!((C30145k) this.f123213G.get(i13)).mo92260b()) {
                this.f123214H = (byte) 0;
                return false;
            }
        }
        if (m118818i()) {
            this.f123214H = (byte) 1;
            return true;
        }
        this.f123214H = (byte) 0;
        return false;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30137h0 c30137h0M92312k = C30137h0.m92312k();
        c30137h0M92312k.m92314n(this);
        return c30137h0M92312k;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123215I;
        if (i13 != -1) {
            return i13;
        }
        int iM118779d = (this.f123217y & 1) == 1 ? C36994g.m118779d(1, this.f123218z) : 0;
        if ((this.f123217y & 2) == 2) {
            iM118779d += C36994g.m118779d(2, this.f123211E);
        }
        if ((this.f123217y & 4) == 4) {
            iM118779d += C36994g.m118779d(3, this.f123212F);
        }
        for (int i14 = 0; i14 < this.f123213G.size(); i14++) {
            iM118779d += C36994g.m118779d(4, (InterfaceC37019v) this.f123213G.get(i14));
        }
        int size = this.f123216x.size() + m118819j() + iM118779d;
        this.f123215I = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30137h0.m92312k();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        C28539n0 c28539n0 = new C28539n0(this);
        if ((this.f123217y & 1) == 1) {
            c36994g.m118790o(1, this.f123218z);
        }
        if ((this.f123217y & 2) == 2) {
            c36994g.m118790o(2, this.f123211E);
        }
        if ((this.f123217y & 4) == 4) {
            c36994g.m118790o(3, this.f123212F);
        }
        for (int i13 = 0; i13 < this.f123213G.size(); i13++) {
            c36994g.m118790o(4, (InterfaceC37019v) this.f123213G.get(i13));
        }
        c28539n0.m86842n(200, c36994g);
        c36994g.m118793r(this.f123216x);
    }

    public C30140i0() {
        this.f123214H = (byte) -1;
        this.f123215I = -1;
        this.f123216x = AbstractC36990e.f158321w;
    }

    public C30140i0(C36992f c36992f, C36998i c36998i) {
        this.f123214H = (byte) -1;
        this.f123215I = -1;
        this.f123218z = C30161r0.f123405E;
        this.f123211E = C30157p0.f123385E;
        this.f123212F = C30134g0.f123151K;
        this.f123213G = Collections.EMPTY_LIST;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        boolean z4 = false;
        char c3 = 0;
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    if (iM118769o != 0) {
                        C30131f0 c30131f0M92301k = null;
                        C30149l0 c30149l0M92326j = null;
                        C30149l0 c30149l0M92327k = null;
                        if (iM118769o == 10) {
                            if ((this.f123217y & 1) == 1) {
                                C30161r0 c30161r0 = this.f123218z;
                                c30161r0.getClass();
                                c30149l0M92326j = C30149l0.m92326j();
                                c30149l0M92326j.m92331p(c30161r0);
                            }
                            C30161r0 c30161r1 = (C30161r0) c36992f.m118762h(C30161r0.f123406F, c36998i);
                            this.f123218z = c30161r1;
                            if (c30149l0M92326j != null) {
                                c30149l0M92326j.m92331p(c30161r1);
                                this.f123218z = c30149l0M92326j.m92329n();
                            }
                            this.f123217y |= 1;
                        } else if (iM118769o == 18) {
                            if ((this.f123217y & 2) == 2) {
                                C30157p0 c30157p0 = this.f123211E;
                                c30157p0.getClass();
                                c30149l0M92327k = C30149l0.m92327k();
                                c30149l0M92327k.m92330o(c30157p0);
                            }
                            C30157p0 c30157p1 = (C30157p0) c36992f.m118762h(C30157p0.f123386F, c36998i);
                            this.f123211E = c30157p1;
                            if (c30149l0M92327k != null) {
                                c30149l0M92327k.m92330o(c30157p1);
                                this.f123211E = c30149l0M92327k.m92328l();
                            }
                            this.f123217y |= 2;
                        } else if (iM118769o == 26) {
                            if ((this.f123217y & 4) == 4) {
                                C30134g0 c30134g0 = this.f123212F;
                                c30134g0.getClass();
                                c30131f0M92301k = C30131f0.m92301k();
                                c30131f0M92301k.m92303n(c30134g0);
                            }
                            C30134g0 c30134g1 = (C30134g0) c36992f.m118762h(C30134g0.f123152L, c36998i);
                            this.f123212F = c30134g1;
                            if (c30131f0M92301k != null) {
                                c30131f0M92301k.m92303n(c30134g1);
                                this.f123212F = c30131f0M92301k.m92302l();
                            }
                            this.f123217y |= 4;
                        } else if (iM118769o != 34) {
                            if (!m118823n(c36992f, c36994gM118784j, c36998i, iM118769o)) {
                            }
                        } else {
                            int i13 = (c3 == true ? 1 : 0) & '\b';
                            c3 = c3;
                            if (i13 != 8) {
                                this.f123213G = new ArrayList();
                                c3 = '\b';
                            }
                            this.f123213G.add(c36992f.m118762h(C30145k.f123270h0, c36998i));
                        }
                    }
                    z4 = true;
                } catch (InvalidProtocolBufferException e5) {
                    e5.f89345w = this;
                    throw e5;
                } catch (IOException e13) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                    invalidProtocolBufferException.f89345w = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th3) {
                if (((c3 == true ? 1 : 0) & '\b') == 8) {
                    this.f123213G = Collections.unmodifiableList(this.f123213G);
                }
                try {
                    c36994gM118784j.m118785i();
                } catch (IOException unused) {
                } finally {
                    this.f123216x = c36988d.m118737i();
                }
                m118822m();
                throw th3;
            }
        }
        if (((c3 == true ? 1 : 0) & '\b') == 8) {
            this.f123213G = Collections.unmodifiableList(this.f123213G);
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123216x = c36988d.m118737i();
        }
        m118822m();
    }
}
