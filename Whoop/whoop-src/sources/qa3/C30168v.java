package qa3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import wa3.AbstractC36990e;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36988d;
import wa3.C36992f;
import wa3.C36994g;
import wa3.C36998i;
import wa3.InterfaceC37019v;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: qa3.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C30168v extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: J */
    public static final C30168v f123445J;

    /* JADX INFO: renamed from: K */
    public static final C30148l f123446K = new C30148l(1);

    /* JADX INFO: renamed from: E */
    public C30116a0 f123447E;

    /* JADX INFO: renamed from: F */
    public EnumC30166u f123448F;

    /* JADX INFO: renamed from: G */
    public EnumC30162s f123449G;

    /* JADX INFO: renamed from: H */
    public byte f123450H;

    /* JADX INFO: renamed from: I */
    public int f123451I;

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f123452w;

    /* JADX INFO: renamed from: x */
    public int f123453x;

    /* JADX INFO: renamed from: y */
    public EnumC30164t f123454y;

    /* JADX INFO: renamed from: z */
    public List f123455z;

    static {
        C30168v c30168v = new C30168v();
        f123445J = c30168v;
        c30168v.f123454y = EnumC30164t.RETURNS_CONSTANT;
        c30168v.f123455z = Collections.EMPTY_LIST;
        c30168v.f123447E = C30116a0.f122967L;
        c30168v.f123448F = EnumC30166u.AT_MOST_ONCE;
        c30168v.f123449G = EnumC30162s.CONCLUSION_CONDITION;
    }

    public C30168v() {
        this.f123450H = (byte) -1;
        this.f123451I = -1;
        this.f123452w = AbstractC36990e.f158321w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123450H;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i13 = 0; i13 < this.f123455z.size(); i13++) {
            if (!((C30116a0) this.f123455z.get(i13)).mo92260b()) {
                this.f123450H = (byte) 0;
                return false;
            }
        }
        if (!m92352m() || this.f123447E.mo92260b()) {
            this.f123450H = (byte) 1;
            return true;
        }
        this.f123450H = (byte) 0;
        return false;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30160r c30160rM92342k = C30160r.m92342k();
        c30160rM92342k.m92344l(this);
        return c30160rM92342k;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123451I;
        if (i13 != -1) {
            return i13;
        }
        int iM118776a = (this.f123453x & 1) == 1 ? C36994g.m118776a(1, this.f123454y.f123424w) : 0;
        for (int i14 = 0; i14 < this.f123455z.size(); i14++) {
            iM118776a += C36994g.m118779d(2, (InterfaceC37019v) this.f123455z.get(i14));
        }
        if ((this.f123453x & 2) == 2) {
            iM118776a += C36994g.m118779d(3, this.f123447E);
        }
        if ((this.f123453x & 4) == 4) {
            iM118776a += C36994g.m118776a(4, this.f123448F.f123435w);
        }
        if ((this.f123453x & 8) == 8) {
            iM118776a += C36994g.m118776a(5, this.f123449G.f123415w);
        }
        int size = this.f123452w.size() + iM118776a;
        this.f123451I = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30160r.m92342k();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        if ((this.f123453x & 1) == 1) {
            c36994g.m118787l(1, this.f123454y.f123424w);
        }
        for (int i13 = 0; i13 < this.f123455z.size(); i13++) {
            c36994g.m118790o(2, (InterfaceC37019v) this.f123455z.get(i13));
        }
        if ((this.f123453x & 2) == 2) {
            c36994g.m118790o(3, this.f123447E);
        }
        if ((this.f123453x & 4) == 4) {
            c36994g.m118787l(4, this.f123448F.f123435w);
        }
        if ((this.f123453x & 8) == 8) {
            c36994g.m118787l(5, this.f123449G.f123415w);
        }
        c36994g.m118793r(this.f123452w);
    }

    /* JADX INFO: renamed from: i */
    public final C30116a0 m92348i() {
        return this.f123447E;
    }

    /* JADX INFO: renamed from: j */
    public final List m92349j() {
        return this.f123455z;
    }

    /* JADX INFO: renamed from: k */
    public final EnumC30164t m92350k() {
        return this.f123454y;
    }

    /* JADX INFO: renamed from: l */
    public final EnumC30166u m92351l() {
        return this.f123448F;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m92352m() {
        return (this.f123453x & 2) == 2;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m92353n() {
        return (this.f123453x & 1) == 1;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m92354o() {
        return (this.f123453x & 4) == 4;
    }

    public C30168v(C30160r c30160r) {
        this.f123450H = (byte) -1;
        this.f123451I = -1;
        this.f123452w = c30160r.f158353w;
    }

    public C30168v(C36992f c36992f, C36998i c36998i) {
        this.f123450H = (byte) -1;
        this.f123451I = -1;
        EnumC30164t enumC30164t = EnumC30164t.RETURNS_CONSTANT;
        this.f123454y = enumC30164t;
        this.f123455z = Collections.EMPTY_LIST;
        this.f123447E = C30116a0.f122967L;
        EnumC30166u enumC30166u = EnumC30166u.AT_MOST_ONCE;
        this.f123448F = enumC30166u;
        EnumC30162s enumC30162s = EnumC30162s.CONCLUSION_CONDITION;
        this.f123449G = enumC30162s;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        boolean z4 = false;
        char c3 = 0;
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    if (iM118769o != 0) {
                        EnumC30162s enumC30162s2 = null;
                        EnumC30164t enumC30164t2 = null;
                        C30174y c30174yM92368k = null;
                        EnumC30166u enumC30166u2 = null;
                        if (iM118769o == 8) {
                            int iM118766l = c36992f.m118766l();
                            if (iM118766l == 0) {
                                enumC30164t2 = enumC30164t;
                            } else if (iM118766l == 1) {
                                enumC30164t2 = EnumC30164t.CALLS;
                            } else if (iM118766l == 2) {
                                enumC30164t2 = EnumC30164t.RETURNS_NOT_NULL;
                            }
                            if (enumC30164t2 == null) {
                                c36994gM118784j.m118797v(iM118769o);
                                c36994gM118784j.m118797v(iM118766l);
                            } else {
                                this.f123453x |= 1;
                                this.f123454y = enumC30164t2;
                            }
                        } else if (iM118769o == 18) {
                            int i13 = (c3 == true ? 1 : 0) & 2;
                            c3 = c3;
                            if (i13 != 2) {
                                this.f123455z = new ArrayList();
                                c3 = 2;
                            }
                            this.f123455z.add(c36992f.m118762h(C30116a0.f122968M, c36998i));
                        } else if (iM118769o == 26) {
                            if ((this.f123453x & 2) == 2) {
                                C30116a0 c30116a0 = this.f123447E;
                                c30116a0.getClass();
                                c30174yM92368k = C30174y.m92368k();
                                c30174yM92368k.m92370l(c30116a0);
                            }
                            C30116a0 c30116a1 = (C30116a0) c36992f.m118762h(C30116a0.f122968M, c36998i);
                            this.f123447E = c30116a1;
                            if (c30174yM92368k != null) {
                                c30174yM92368k.m92370l(c30116a1);
                                this.f123447E = c30174yM92368k.m92369j();
                            }
                            this.f123453x |= 2;
                        } else if (iM118769o == 32) {
                            int iM118766l2 = c36992f.m118766l();
                            if (iM118766l2 == 0) {
                                enumC30166u2 = enumC30166u;
                            } else if (iM118766l2 == 1) {
                                enumC30166u2 = EnumC30166u.EXACTLY_ONCE;
                            } else if (iM118766l2 == 2) {
                                enumC30166u2 = EnumC30166u.AT_LEAST_ONCE;
                            }
                            if (enumC30166u2 == null) {
                                c36994gM118784j.m118797v(iM118769o);
                                c36994gM118784j.m118797v(iM118766l2);
                            } else {
                                this.f123453x |= 4;
                                this.f123448F = enumC30166u2;
                            }
                        } else if (iM118769o != 40) {
                            if (!c36992f.m118772r(iM118769o, c36994gM118784j)) {
                            }
                        } else {
                            int iM118766l3 = c36992f.m118766l();
                            if (iM118766l3 == 0) {
                                enumC30162s2 = enumC30162s;
                            } else if (iM118766l3 == 1) {
                                enumC30162s2 = EnumC30162s.RETURNS_CONDITION;
                            } else if (iM118766l3 == 2) {
                                enumC30162s2 = EnumC30162s.HOLDSIN_CONDITION;
                            }
                            if (enumC30162s2 == null) {
                                c36994gM118784j.m118797v(iM118769o);
                                c36994gM118784j.m118797v(iM118766l3);
                            } else {
                                this.f123453x |= 8;
                                this.f123449G = enumC30162s2;
                            }
                        }
                    }
                    z4 = true;
                } catch (Throwable th3) {
                    if (((c3 == true ? 1 : 0) & 2) == 2) {
                        this.f123455z = Collections.unmodifiableList(this.f123455z);
                    }
                    try {
                        c36994gM118784j.m118785i();
                    } catch (IOException unused) {
                    } finally {
                        this.f123452w = c36988d.m118737i();
                    }
                    throw th3;
                }
            } catch (InvalidProtocolBufferException e5) {
                e5.f89345w = this;
                throw e5;
            } catch (IOException e13) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                invalidProtocolBufferException.f89345w = this;
                throw invalidProtocolBufferException;
            }
        }
        if (((c3 == true ? 1 : 0) & 2) == 2) {
            this.f123455z = Collections.unmodifiableList(this.f123455z);
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123452w = c36988d.m118737i();
        }
    }
}
