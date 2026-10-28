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

/* JADX INFO: renamed from: qa3.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C30172x extends AbstractC37006m {

    /* JADX INFO: renamed from: H */
    public static final C30172x f123496H;

    /* JADX INFO: renamed from: I */
    public static final C30115a f123497I = new C30115a(6);

    /* JADX INFO: renamed from: E */
    public List f123498E;

    /* JADX INFO: renamed from: F */
    public byte f123499F;

    /* JADX INFO: renamed from: G */
    public int f123500G;

    /* JADX INFO: renamed from: x */
    public final AbstractC36990e f123501x;

    /* JADX INFO: renamed from: y */
    public int f123502y;

    /* JADX INFO: renamed from: z */
    public int f123503z;

    static {
        C30172x c30172x = new C30172x();
        f123496H = c30172x;
        c30172x.f123503z = 0;
        c30172x.f123498E = Collections.EMPTY_LIST;
    }

    public C30172x(C30170w c30170w) {
        super(c30170w);
        this.f123499F = (byte) -1;
        this.f123500G = -1;
        this.f123501x = c30170w.f158353w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: a */
    public final InterfaceC37019v mo92288a() {
        return f123496H;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123499F;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i13 = 0; i13 < this.f123498E.size(); i13++) {
            if (!((C30136h) this.f123498E.get(i13)).mo92260b()) {
                this.f123499F = (byte) 0;
                return false;
            }
        }
        if (m118818i()) {
            this.f123499F = (byte) 1;
            return true;
        }
        this.f123499F = (byte) 0;
        return false;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30170w c30170wM92358k = C30170w.m92358k();
        c30170wM92358k.m92360n(this);
        return c30170wM92358k;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123500G;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f123502y & 1) == 1 ? C36994g.m118777b(1, this.f123503z) : 0;
        for (int i14 = 0; i14 < this.f123498E.size(); i14++) {
            iM118777b += C36994g.m118779d(2, (InterfaceC37019v) this.f123498E.get(i14));
        }
        int size = this.f123501x.size() + m118819j() + iM118777b;
        this.f123500G = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30170w.m92358k();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        C28539n0 c28539n0 = new C28539n0(this);
        if ((this.f123502y & 1) == 1) {
            c36994g.m118788m(1, this.f123503z);
        }
        for (int i13 = 0; i13 < this.f123498E.size(); i13++) {
            c36994g.m118790o(2, (InterfaceC37019v) this.f123498E.get(i13));
        }
        c28539n0.m86842n(200, c36994g);
        c36994g.m118793r(this.f123501x);
    }

    public C30172x() {
        this.f123499F = (byte) -1;
        this.f123500G = -1;
        this.f123501x = AbstractC36990e.f158321w;
    }

    public C30172x(C36992f c36992f, C36998i c36998i) {
        this.f123499F = (byte) -1;
        this.f123500G = -1;
        boolean z4 = false;
        this.f123503z = 0;
        this.f123498E = Collections.EMPTY_LIST;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        char c3 = 0;
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    if (iM118769o != 0) {
                        if (iM118769o == 8) {
                            this.f123502y |= 1;
                            this.f123503z = c36992f.m118766l();
                        } else if (iM118769o != 18) {
                            if (!m118823n(c36992f, c36994gM118784j, c36998i, iM118769o)) {
                            }
                        } else {
                            if ((c3 & 2) != 2) {
                                this.f123498E = new ArrayList();
                                c3 = 2;
                            }
                            this.f123498E.add(c36992f.m118762h(C30136h.f123168H, c36998i));
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
                if ((c3 & 2) == 2) {
                    this.f123498E = Collections.unmodifiableList(this.f123498E);
                }
                try {
                    c36994gM118784j.m118785i();
                } catch (IOException unused) {
                } finally {
                    this.f123501x = c36988d.m118737i();
                }
                m118822m();
                throw th3;
            }
        }
        if ((c3 & 2) == 2) {
            this.f123498E = Collections.unmodifiableList(this.f123498E);
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123501x = c36988d.m118737i();
        }
        m118822m();
    }
}
