package ta3;

import java.io.IOException;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import qa3.C30115a;
import wa3.AbstractC36990e;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36988d;
import wa3.C36992f;
import wa3.C36994g;
import wa3.C36998i;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: ta3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C33680f extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: J */
    public static final C33680f f140687J;

    /* JADX INFO: renamed from: K */
    public static final C30115a f140688K = new C30115a(23);

    /* JADX INFO: renamed from: E */
    public C33678d f140689E;

    /* JADX INFO: renamed from: F */
    public C33678d f140690F;

    /* JADX INFO: renamed from: G */
    public C33678d f140691G;

    /* JADX INFO: renamed from: H */
    public byte f140692H;

    /* JADX INFO: renamed from: I */
    public int f140693I;

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f140694w;

    /* JADX INFO: renamed from: x */
    public int f140695x;

    /* JADX INFO: renamed from: y */
    public C33676b f140696y;

    /* JADX INFO: renamed from: z */
    public C33678d f140697z;

    static {
        C33680f c33680f = new C33680f();
        f140687J = c33680f;
        c33680f.f140696y = C33676b.f140662G;
        C33678d c33678d = C33678d.f140673G;
        c33680f.f140697z = c33678d;
        c33680f.f140689E = c33678d;
        c33680f.f140690F = c33678d;
        c33680f.f140691G = c33678d;
    }

    public C33680f() {
        this.f140692H = (byte) -1;
        this.f140693I = -1;
        this.f140694w = AbstractC36990e.f158321w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        if (this.f140692H == 1) {
            return true;
        }
        this.f140692H = (byte) 1;
        return true;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C33679e c33679eM106424k = C33679e.m106424k();
        c33679eM106424k.m106426l(this);
        return c33679eM106424k;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f140693I;
        if (i13 != -1) {
            return i13;
        }
        int iM118779d = (this.f140695x & 1) == 1 ? C36994g.m118779d(1, this.f140696y) : 0;
        if ((this.f140695x & 2) == 2) {
            iM118779d += C36994g.m118779d(2, this.f140697z);
        }
        if ((this.f140695x & 4) == 4) {
            iM118779d += C36994g.m118779d(3, this.f140689E);
        }
        if ((this.f140695x & 8) == 8) {
            iM118779d += C36994g.m118779d(4, this.f140690F);
        }
        if ((this.f140695x & 16) == 16) {
            iM118779d += C36994g.m118779d(5, this.f140691G);
        }
        int size = this.f140694w.size() + iM118779d;
        this.f140693I = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C33679e.m106424k();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        if ((this.f140695x & 1) == 1) {
            c36994g.m118790o(1, this.f140696y);
        }
        if ((this.f140695x & 2) == 2) {
            c36994g.m118790o(2, this.f140697z);
        }
        if ((this.f140695x & 4) == 4) {
            c36994g.m118790o(3, this.f140689E);
        }
        if ((this.f140695x & 8) == 8) {
            c36994g.m118790o(4, this.f140690F);
        }
        if ((this.f140695x & 16) == 16) {
            c36994g.m118790o(5, this.f140691G);
        }
        c36994g.m118793r(this.f140694w);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m106427i() {
        return (this.f140695x & 4) == 4;
    }

    public C33680f(C33679e c33679e) {
        this.f140692H = (byte) -1;
        this.f140693I = -1;
        this.f140694w = c33679e.f158353w;
    }

    public C33680f(C36992f c36992f, C36998i c36998i) {
        this.f140692H = (byte) -1;
        this.f140693I = -1;
        this.f140696y = C33676b.f140662G;
        C33678d c33678d = C33678d.f140673G;
        this.f140697z = c33678d;
        this.f140689E = c33678d;
        this.f140690F = c33678d;
        this.f140691G = c33678d;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        boolean z4 = false;
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    if (iM118769o != 0) {
                        C33677c c33677cM106423i = null;
                        C33675a c33675aM106418j = null;
                        C33677c c33677cM106423i2 = null;
                        C33677c c33677cM106423i3 = null;
                        C33677c c33677cM106423i4 = null;
                        if (iM118769o == 10) {
                            if ((this.f140695x & 1) == 1) {
                                C33676b c33676b = this.f140696y;
                                c33676b.getClass();
                                c33675aM106418j = C33675a.m106418j();
                                c33675aM106418j.m106420l(c33676b);
                            }
                            C33676b c33676b2 = (C33676b) c36992f.m118762h(C33676b.f140663H, c36998i);
                            this.f140696y = c33676b2;
                            if (c33675aM106418j != null) {
                                c33675aM106418j.m106420l(c33676b2);
                                this.f140696y = c33675aM106418j.m106419k();
                            }
                            this.f140695x |= 1;
                        } else if (iM118769o == 18) {
                            if ((this.f140695x & 2) == 2) {
                                C33678d c33678d2 = this.f140697z;
                                c33678d2.getClass();
                                c33677cM106423i2 = C33678d.m106423i(c33678d2);
                            }
                            C33678d c33678d3 = (C33678d) c36992f.m118762h(C33678d.f140674H, c36998i);
                            this.f140697z = c33678d3;
                            if (c33677cM106423i2 != null) {
                                c33677cM106423i2.m106422k(c33678d3);
                                this.f140697z = c33677cM106423i2.m106421j();
                            }
                            this.f140695x |= 2;
                        } else if (iM118769o == 26) {
                            if ((this.f140695x & 4) == 4) {
                                C33678d c33678d4 = this.f140689E;
                                c33678d4.getClass();
                                c33677cM106423i3 = C33678d.m106423i(c33678d4);
                            }
                            C33678d c33678d5 = (C33678d) c36992f.m118762h(C33678d.f140674H, c36998i);
                            this.f140689E = c33678d5;
                            if (c33677cM106423i3 != null) {
                                c33677cM106423i3.m106422k(c33678d5);
                                this.f140689E = c33677cM106423i3.m106421j();
                            }
                            this.f140695x |= 4;
                        } else if (iM118769o == 34) {
                            if ((this.f140695x & 8) == 8) {
                                C33678d c33678d6 = this.f140690F;
                                c33678d6.getClass();
                                c33677cM106423i4 = C33678d.m106423i(c33678d6);
                            }
                            C33678d c33678d7 = (C33678d) c36992f.m118762h(C33678d.f140674H, c36998i);
                            this.f140690F = c33678d7;
                            if (c33677cM106423i4 != null) {
                                c33677cM106423i4.m106422k(c33678d7);
                                this.f140690F = c33677cM106423i4.m106421j();
                            }
                            this.f140695x |= 8;
                        } else if (iM118769o != 42) {
                            if (!c36992f.m118772r(iM118769o, c36994gM118784j)) {
                            }
                        } else {
                            if ((this.f140695x & 16) == 16) {
                                C33678d c33678d8 = this.f140691G;
                                c33678d8.getClass();
                                c33677cM106423i = C33678d.m106423i(c33678d8);
                            }
                            C33678d c33678d9 = (C33678d) c36992f.m118762h(C33678d.f140674H, c36998i);
                            this.f140691G = c33678d9;
                            if (c33677cM106423i != null) {
                                c33677cM106423i.m106422k(c33678d9);
                                this.f140691G = c33677cM106423i.m106421j();
                            }
                            this.f140695x |= 16;
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
                try {
                    c36994gM118784j.m118785i();
                } catch (IOException unused) {
                } finally {
                    this.f140694w = c36988d.m118737i();
                }
                throw th3;
            }
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f140694w = c36988d.m118737i();
        }
    }
}
