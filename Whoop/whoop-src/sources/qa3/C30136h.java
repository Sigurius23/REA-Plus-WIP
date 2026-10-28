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

/* JADX INFO: renamed from: qa3.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C30136h extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: G */
    public static final C30136h f123167G;

    /* JADX INFO: renamed from: H */
    public static final C30115a f123168H = new C30115a(0);

    /* JADX INFO: renamed from: E */
    public byte f123169E;

    /* JADX INFO: renamed from: F */
    public int f123170F;

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f123171w;

    /* JADX INFO: renamed from: x */
    public int f123172x;

    /* JADX INFO: renamed from: y */
    public int f123173y;

    /* JADX INFO: renamed from: z */
    public List f123174z;

    static {
        C30136h c30136h = new C30136h();
        f123167G = c30136h;
        c30136h.f123173y = 0;
        c30136h.f123174z = Collections.EMPTY_LIST;
    }

    public C30136h() {
        this.f123169E = (byte) -1;
        this.f123170F = -1;
        this.f123171w = AbstractC36990e.f158321w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123169E;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f123172x & 1) != 1) {
            this.f123169E = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < this.f123174z.size(); i13++) {
            if (!((C30130f) this.f123174z.get(i13)).mo92260b()) {
                this.f123169E = (byte) 0;
                return false;
            }
        }
        this.f123169E = (byte) 1;
        return true;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30133g c30133g = new C30133g(0);
        c30133g.f123150z = Collections.EMPTY_LIST;
        c30133g.m92310n(this);
        return c30133g;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123170F;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f123172x & 1) == 1 ? C36994g.m118777b(1, this.f123173y) : 0;
        for (int i14 = 0; i14 < this.f123174z.size(); i14++) {
            iM118777b += C36994g.m118779d(2, (InterfaceC37019v) this.f123174z.get(i14));
        }
        int size = this.f123171w.size() + iM118777b;
        this.f123170F = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        C30133g c30133g = new C30133g(0);
        c30133g.f123150z = Collections.EMPTY_LIST;
        return c30133g;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        if ((this.f123172x & 1) == 1) {
            c36994g.m118788m(1, this.f123173y);
        }
        for (int i13 = 0; i13 < this.f123174z.size(); i13++) {
            c36994g.m118790o(2, (InterfaceC37019v) this.f123174z.get(i13));
        }
        c36994g.m118793r(this.f123171w);
    }

    public C30136h(C30133g c30133g) {
        this.f123169E = (byte) -1;
        this.f123170F = -1;
        this.f123171w = c30133g.f158353w;
    }

    public C30136h(C36992f c36992f, C36998i c36998i) {
        this.f123169E = (byte) -1;
        this.f123170F = -1;
        boolean z4 = false;
        this.f123173y = 0;
        this.f123174z = Collections.EMPTY_LIST;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        char c3 = 0;
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    if (iM118769o != 0) {
                        if (iM118769o == 8) {
                            this.f123172x |= 1;
                            this.f123173y = c36992f.m118766l();
                        } else if (iM118769o != 18) {
                            if (!c36992f.m118772r(iM118769o, c36994gM118784j)) {
                            }
                        } else {
                            if ((c3 & 2) != 2) {
                                this.f123174z = new ArrayList();
                                c3 = 2;
                            }
                            this.f123174z.add(c36992f.m118762h(C30130f.f123127H, c36998i));
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
                    this.f123174z = Collections.unmodifiableList(this.f123174z);
                }
                try {
                    c36994gM118784j.m118785i();
                } catch (IOException unused) {
                } finally {
                    this.f123171w = c36988d.m118737i();
                }
                throw th3;
            }
        }
        if ((c3 & 2) == 2) {
            this.f123174z = Collections.unmodifiableList(this.f123174z);
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123171w = c36988d.m118737i();
        }
    }
}
