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

/* JADX INFO: renamed from: qa3.c1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C30123c1 extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: G */
    public static final C30123c1 f123059G;

    /* JADX INFO: renamed from: H */
    public static final C30115a f123060H = new C30115a(17);

    /* JADX INFO: renamed from: E */
    public byte f123061E;

    /* JADX INFO: renamed from: F */
    public int f123062F;

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f123063w;

    /* JADX INFO: renamed from: x */
    public int f123064x;

    /* JADX INFO: renamed from: y */
    public List f123065y;

    /* JADX INFO: renamed from: z */
    public int f123066z;

    static {
        C30123c1 c30123c1 = new C30123c1();
        f123059G = c30123c1;
        c30123c1.f123065y = Collections.EMPTY_LIST;
        c30123c1.f123066z = -1;
    }

    public C30123c1() {
        this.f123061E = (byte) -1;
        this.f123062F = -1;
        this.f123063w = AbstractC36990e.f158321w;
    }

    /* JADX INFO: renamed from: i */
    public static C30133g m92293i(C30123c1 c30123c1) {
        C30133g c30133gM92307l = C30133g.m92307l();
        c30133gM92307l.m92311o(c30123c1);
        return c30133gM92307l;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123061E;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i13 = 0; i13 < this.f123065y.size(); i13++) {
            if (!((C30171w0) this.f123065y.get(i13)).mo92260b()) {
                this.f123061E = (byte) 0;
                return false;
            }
        }
        this.f123061E = (byte) 1;
        return true;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        return m92293i(this);
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123062F;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = 0;
        for (int i14 = 0; i14 < this.f123065y.size(); i14++) {
            iM118777b += C36994g.m118779d(1, (InterfaceC37019v) this.f123065y.get(i14));
        }
        if ((this.f123064x & 1) == 1) {
            iM118777b += C36994g.m118777b(2, this.f123066z);
        }
        int size = this.f123063w.size() + iM118777b;
        this.f123062F = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30133g.m92307l();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        for (int i13 = 0; i13 < this.f123065y.size(); i13++) {
            c36994g.m118790o(1, (InterfaceC37019v) this.f123065y.get(i13));
        }
        if ((this.f123064x & 1) == 1) {
            c36994g.m118788m(2, this.f123066z);
        }
        c36994g.m118793r(this.f123063w);
    }

    public C30123c1(C30133g c30133g) {
        this.f123061E = (byte) -1;
        this.f123062F = -1;
        this.f123063w = c30133g.f158353w;
    }

    public C30123c1(C36992f c36992f, C36998i c36998i) {
        this.f123061E = (byte) -1;
        this.f123062F = -1;
        this.f123065y = Collections.EMPTY_LIST;
        this.f123066z = -1;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        boolean z4 = false;
        boolean z13 = false;
        while (!z4) {
            try {
                try {
                    try {
                        int iM118769o = c36992f.m118769o();
                        if (iM118769o != 0) {
                            if (iM118769o == 10) {
                                if (!z13) {
                                    this.f123065y = new ArrayList();
                                    z13 = true;
                                }
                                this.f123065y.add(c36992f.m118762h(C30171w0.f123476V, c36998i));
                            } else if (iM118769o != 16) {
                                if (!c36992f.m118772r(iM118769o, c36994gM118784j)) {
                                }
                            } else {
                                this.f123064x |= 1;
                                this.f123066z = c36992f.m118766l();
                            }
                        }
                        z4 = true;
                    } catch (InvalidProtocolBufferException e5) {
                        e5.f89345w = this;
                        throw e5;
                    }
                } catch (IOException e13) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                    invalidProtocolBufferException.f89345w = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th3) {
                if (z13) {
                    this.f123065y = Collections.unmodifiableList(this.f123065y);
                }
                try {
                    c36994gM118784j.m118785i();
                } catch (IOException unused) {
                } finally {
                    this.f123063w = c36988d.m118737i();
                }
                throw th3;
            }
        }
        if (z13) {
            this.f123065y = Collections.unmodifiableList(this.f123065y);
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123063w = c36988d.m118737i();
        }
    }
}
