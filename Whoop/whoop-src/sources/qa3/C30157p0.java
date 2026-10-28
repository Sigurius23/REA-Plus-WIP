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

/* JADX INFO: renamed from: qa3.p0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C30157p0 extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: E */
    public static final C30157p0 f123385E;

    /* JADX INFO: renamed from: F */
    public static final C30115a f123386F = new C30115a(11);

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f123387w;

    /* JADX INFO: renamed from: x */
    public List f123388x;

    /* JADX INFO: renamed from: y */
    public byte f123389y;

    /* JADX INFO: renamed from: z */
    public int f123390z;

    static {
        C30157p0 c30157p0 = new C30157p0();
        f123385E = c30157p0;
        c30157p0.f123388x = Collections.EMPTY_LIST;
    }

    public C30157p0() {
        this.f123389y = (byte) -1;
        this.f123390z = -1;
        this.f123387w = AbstractC36990e.f158321w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123389y;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i13 = 0; i13 < this.f123388x.size(); i13++) {
            if (!((C30155o0) this.f123388x.get(i13)).mo92260b()) {
                this.f123389y = (byte) 0;
                return false;
            }
        }
        this.f123389y = (byte) 1;
        return true;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30149l0 c30149l0M92327k = C30149l0.m92327k();
        c30149l0M92327k.m92330o(this);
        return c30149l0M92327k;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123390z;
        if (i13 != -1) {
            return i13;
        }
        int iM118779d = 0;
        for (int i14 = 0; i14 < this.f123388x.size(); i14++) {
            iM118779d += C36994g.m118779d(1, (InterfaceC37019v) this.f123388x.get(i14));
        }
        int size = this.f123387w.size() + iM118779d;
        this.f123390z = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30149l0.m92327k();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        for (int i13 = 0; i13 < this.f123388x.size(); i13++) {
            c36994g.m118790o(1, (InterfaceC37019v) this.f123388x.get(i13));
        }
        c36994g.m118793r(this.f123387w);
    }

    public C30157p0(C30149l0 c30149l0) {
        this.f123389y = (byte) -1;
        this.f123390z = -1;
        this.f123387w = c30149l0.f158353w;
    }

    public C30157p0(C36992f c36992f, C36998i c36998i) {
        this.f123389y = (byte) -1;
        this.f123390z = -1;
        this.f123388x = Collections.EMPTY_LIST;
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
                                this.f123388x = new ArrayList();
                                z13 = true;
                            }
                            this.f123388x.add(c36992f.m118762h(C30155o0.f123374I, c36998i));
                        }
                    }
                    z4 = true;
                } catch (Throwable th3) {
                    if (z13) {
                        this.f123388x = Collections.unmodifiableList(this.f123388x);
                    }
                    try {
                        c36994gM118784j.m118785i();
                    } catch (IOException unused) {
                    } finally {
                        this.f123387w = c36988d.m118737i();
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
            this.f123388x = Collections.unmodifiableList(this.f123388x);
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123387w = c36988d.m118737i();
        }
    }
}
