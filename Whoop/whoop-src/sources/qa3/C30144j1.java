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

/* JADX INFO: renamed from: qa3.j1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C30144j1 extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: E */
    public static final C30144j1 f123263E;

    /* JADX INFO: renamed from: F */
    public static final C30115a f123264F = new C30115a(20);

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f123265w;

    /* JADX INFO: renamed from: x */
    public List f123266x;

    /* JADX INFO: renamed from: y */
    public byte f123267y;

    /* JADX INFO: renamed from: z */
    public int f123268z;

    static {
        C30144j1 c30144j1 = new C30144j1();
        f123263E = c30144j1;
        c30144j1.f123266x = Collections.EMPTY_LIST;
    }

    public C30144j1() {
        this.f123267y = (byte) -1;
        this.f123268z = -1;
        this.f123265w = AbstractC36990e.f158321w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        if (this.f123267y == 1) {
            return true;
        }
        this.f123267y = (byte) 1;
        return true;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30156p c30156p = new C30156p(1);
        c30156p.f123384z = Collections.EMPTY_LIST;
        c30156p.m92341n(this);
        return c30156p;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123268z;
        if (i13 != -1) {
            return i13;
        }
        int iM118779d = 0;
        for (int i14 = 0; i14 < this.f123266x.size(); i14++) {
            iM118779d += C36994g.m118779d(1, (InterfaceC37019v) this.f123266x.get(i14));
        }
        int size = this.f123265w.size() + iM118779d;
        this.f123268z = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        C30156p c30156p = new C30156p(1);
        c30156p.f123384z = Collections.EMPTY_LIST;
        return c30156p;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        for (int i13 = 0; i13 < this.f123266x.size(); i13++) {
            c36994g.m118790o(1, (InterfaceC37019v) this.f123266x.get(i13));
        }
        c36994g.m118793r(this.f123265w);
    }

    /* JADX INFO: renamed from: i */
    public final C30156p m92323i() {
        C30156p c30156p = new C30156p(1);
        c30156p.f123384z = Collections.EMPTY_LIST;
        c30156p.m92341n(this);
        return c30156p;
    }

    public C30144j1(C30156p c30156p) {
        this.f123267y = (byte) -1;
        this.f123268z = -1;
        this.f123265w = c30156p.f158353w;
    }

    public C30144j1(C36992f c36992f, C36998i c36998i) {
        this.f123267y = (byte) -1;
        this.f123268z = -1;
        this.f123266x = Collections.EMPTY_LIST;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        boolean z4 = false;
        boolean z13 = false;
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    if (iM118769o != 0) {
                        if (iM118769o != 10) {
                            if (!c36992f.m118772r(iM118769o, c36994gM118784j)) {
                            }
                        } else {
                            if (!z13) {
                                this.f123266x = new ArrayList();
                                z13 = true;
                            }
                            this.f123266x.add(c36992f.m118762h(C30141i1.f123220L, c36998i));
                        }
                    }
                    z4 = true;
                } catch (Throwable th3) {
                    if (z13) {
                        this.f123266x = Collections.unmodifiableList(this.f123266x);
                    }
                    try {
                        c36994gM118784j.m118785i();
                    } catch (IOException unused) {
                    } finally {
                        this.f123265w = c36988d.m118737i();
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
        if (z13) {
            this.f123266x = Collections.unmodifiableList(this.f123266x);
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123265w = c36988d.m118737i();
        }
    }
}
