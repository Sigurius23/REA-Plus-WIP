package ta3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import qa3.C30115a;
import wa3.AbstractC36990e;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36988d;
import wa3.C36992f;
import wa3.C36994g;
import wa3.C36998i;
import wa3.InterfaceC37019v;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: ta3.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C33685k extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: G */
    public static final C33685k f140727G;

    /* JADX INFO: renamed from: H */
    public static final C30115a f140728H = new C30115a(24);

    /* JADX INFO: renamed from: E */
    public byte f140729E;

    /* JADX INFO: renamed from: F */
    public int f140730F;

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f140731w;

    /* JADX INFO: renamed from: x */
    public List f140732x;

    /* JADX INFO: renamed from: y */
    public List f140733y;

    /* JADX INFO: renamed from: z */
    public int f140734z;

    static {
        C33685k c33685k = new C33685k();
        f140727G = c33685k;
        List list = Collections.EMPTY_LIST;
        c33685k.f140732x = list;
        c33685k.f140733y = list;
    }

    public C33685k() {
        this.f140734z = -1;
        this.f140729E = (byte) -1;
        this.f140730F = -1;
        this.f140731w = AbstractC36990e.f158321w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        if (this.f140729E == 1) {
            return true;
        }
        this.f140729E = (byte) 1;
        return true;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C33681g c33681gM106428j = C33681g.m106428j();
        c33681gM106428j.m106430l(this);
        return c33681gM106428j;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f140730F;
        if (i13 != -1) {
            return i13;
        }
        int iM118779d = 0;
        for (int i14 = 0; i14 < this.f140732x.size(); i14++) {
            iM118779d += C36994g.m118779d(1, (InterfaceC37019v) this.f140732x.get(i14));
        }
        int iM118778c = 0;
        for (int i15 = 0; i15 < this.f140733y.size(); i15++) {
            iM118778c += C36994g.m118778c(((Integer) this.f140733y.get(i15)).intValue());
        }
        int iM118778c2 = iM118779d + iM118778c;
        if (!this.f140733y.isEmpty()) {
            iM118778c2 = iM118778c2 + 1 + C36994g.m118778c(iM118778c);
        }
        this.f140734z = iM118778c;
        int size = this.f140731w.size() + iM118778c2;
        this.f140730F = size;
        return size;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C33681g.m106428j();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        for (int i13 = 0; i13 < this.f140732x.size(); i13++) {
            c36994g.m118790o(1, (InterfaceC37019v) this.f140732x.get(i13));
        }
        if (this.f140733y.size() > 0) {
            c36994g.m118797v(42);
            c36994g.m118797v(this.f140734z);
        }
        for (int i14 = 0; i14 < this.f140733y.size(); i14++) {
            c36994g.m118789n(((Integer) this.f140733y.get(i14)).intValue());
        }
        c36994g.m118793r(this.f140731w);
    }

    public C33685k(C33681g c33681g) {
        this.f140734z = -1;
        this.f140729E = (byte) -1;
        this.f140730F = -1;
        this.f140731w = c33681g.f158353w;
    }

    public C33685k(C36992f c36992f, C36998i c36998i) {
        this.f140734z = -1;
        this.f140729E = (byte) -1;
        this.f140730F = -1;
        List list = Collections.EMPTY_LIST;
        this.f140732x = list;
        this.f140733y = list;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        boolean z4 = false;
        int i13 = 0;
        while (!z4) {
            try {
                try {
                    try {
                        int iM118769o = c36992f.m118769o();
                        if (iM118769o != 0) {
                            if (iM118769o == 10) {
                                if ((i13 & 1) != 1) {
                                    this.f140732x = new ArrayList();
                                    i13 |= 1;
                                }
                                this.f140732x.add(c36992f.m118762h(C33684j.f140714N, c36998i));
                            } else if (iM118769o == 40) {
                                if ((i13 & 2) != 2) {
                                    this.f140733y = new ArrayList();
                                    i13 |= 2;
                                }
                                this.f140733y.add(Integer.valueOf(c36992f.m118766l()));
                            } else if (iM118769o != 42) {
                                if (!c36992f.m118772r(iM118769o, c36994gM118784j)) {
                                }
                            } else {
                                int iM118759e = c36992f.m118759e(c36992f.m118766l());
                                if ((i13 & 2) != 2 && c36992f.m118757c() > 0) {
                                    this.f140733y = new ArrayList();
                                    i13 |= 2;
                                }
                                while (c36992f.m118757c() > 0) {
                                    this.f140733y.add(Integer.valueOf(c36992f.m118766l()));
                                }
                                c36992f.m118758d(iM118759e);
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
                if ((i13 & 1) == 1) {
                    this.f140732x = Collections.unmodifiableList(this.f140732x);
                }
                if ((i13 & 2) == 2) {
                    this.f140733y = Collections.unmodifiableList(this.f140733y);
                }
                try {
                    c36994gM118784j.m118785i();
                } catch (IOException unused) {
                } finally {
                    this.f140731w = c36988d.m118737i();
                }
                throw th3;
            }
        }
        if ((i13 & 1) == 1) {
            this.f140732x = Collections.unmodifiableList(this.f140732x);
        }
        if ((i13 & 2) == 2) {
            this.f140733y = Collections.unmodifiableList(this.f140733y);
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f140731w = c36988d.m118737i();
        }
    }
}
