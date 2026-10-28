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

/* JADX INFO: renamed from: qa3.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C30154o extends AbstractC37006m {

    /* JADX INFO: renamed from: K */
    public static final C30154o f123362K;

    /* JADX INFO: renamed from: L */
    public static final C30115a f123363L = new C30115a(4);

    /* JADX INFO: renamed from: E */
    public List f123364E;

    /* JADX INFO: renamed from: F */
    public List f123365F;

    /* JADX INFO: renamed from: G */
    public List f123366G;

    /* JADX INFO: renamed from: H */
    public List f123367H;

    /* JADX INFO: renamed from: I */
    public byte f123368I;

    /* JADX INFO: renamed from: J */
    public int f123369J;

    /* JADX INFO: renamed from: x */
    public final AbstractC36990e f123370x;

    /* JADX INFO: renamed from: y */
    public int f123371y;

    /* JADX INFO: renamed from: z */
    public int f123372z;

    static {
        C30154o c30154o = new C30154o();
        f123362K = c30154o;
        c30154o.f123372z = 6;
        List list = Collections.EMPTY_LIST;
        c30154o.f123364E = list;
        c30154o.f123365F = list;
        c30154o.f123366G = list;
        c30154o.f123367H = list;
    }

    public C30154o(C30152n c30152n) {
        super(c30152n);
        this.f123368I = (byte) -1;
        this.f123369J = -1;
        this.f123370x = c30152n.f158353w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: a */
    public final InterfaceC37019v mo92288a() {
        return f123362K;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        byte b = this.f123368I;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i13 = 0; i13 < this.f123364E.size(); i13++) {
            if (!((C30129e1) this.f123364E.get(i13)).mo92260b()) {
                this.f123368I = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f123366G.size(); i14++) {
            if (!((C30150m) this.f123366G.get(i14)).mo92260b()) {
                this.f123368I = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f123367H.size(); i15++) {
            if (!((C30136h) this.f123367H.get(i15)).mo92260b()) {
                this.f123368I = (byte) 0;
                return false;
            }
        }
        if (m118818i()) {
            this.f123368I = (byte) 1;
            return true;
        }
        this.f123368I = (byte) 0;
        return false;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C30152n c30152nM92335k = C30152n.m92335k();
        c30152nM92335k.m92337n(this);
        return c30152nM92335k;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        int i13 = this.f123369J;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f123371y & 1) == 1 ? C36994g.m118777b(1, this.f123372z) : 0;
        for (int i14 = 0; i14 < this.f123364E.size(); i14++) {
            iM118777b += C36994g.m118779d(2, (InterfaceC37019v) this.f123364E.get(i14));
        }
        for (int i15 = 0; i15 < this.f123367H.size(); i15++) {
            iM118777b += C36994g.m118779d(3, (InterfaceC37019v) this.f123367H.get(i15));
        }
        int iM118778c = 0;
        for (int i16 = 0; i16 < this.f123365F.size(); i16++) {
            iM118778c += C36994g.m118778c(((Integer) this.f123365F.get(i16)).intValue());
        }
        int size = (this.f123365F.size() * 2) + iM118777b + iM118778c;
        for (int i17 = 0; i17 < this.f123366G.size(); i17++) {
            size += C36994g.m118779d(32, (InterfaceC37019v) this.f123366G.get(i17));
        }
        int size2 = this.f123370x.size() + m118819j() + size;
        this.f123369J = size2;
        return size2;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C30152n.m92335k();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        mo92262d();
        C28539n0 c28539n0 = new C28539n0(this);
        if ((this.f123371y & 1) == 1) {
            c36994g.m118788m(1, this.f123372z);
        }
        for (int i13 = 0; i13 < this.f123364E.size(); i13++) {
            c36994g.m118790o(2, (InterfaceC37019v) this.f123364E.get(i13));
        }
        for (int i14 = 0; i14 < this.f123367H.size(); i14++) {
            c36994g.m118790o(3, (InterfaceC37019v) this.f123367H.get(i14));
        }
        for (int i15 = 0; i15 < this.f123365F.size(); i15++) {
            c36994g.m118788m(31, ((Integer) this.f123365F.get(i15)).intValue());
        }
        for (int i16 = 0; i16 < this.f123366G.size(); i16++) {
            c36994g.m118790o(32, (InterfaceC37019v) this.f123366G.get(i16));
        }
        c28539n0.m86842n(19000, c36994g);
        c36994g.m118793r(this.f123370x);
    }

    public C30154o() {
        this.f123368I = (byte) -1;
        this.f123369J = -1;
        this.f123370x = AbstractC36990e.f158321w;
    }

    public C30154o(C36992f c36992f, C36998i c36998i) {
        this.f123368I = (byte) -1;
        this.f123369J = -1;
        this.f123372z = 6;
        List list = Collections.EMPTY_LIST;
        this.f123364E = list;
        this.f123365F = list;
        this.f123366G = list;
        this.f123367H = list;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        boolean z4 = false;
        int i13 = 0;
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    if (iM118769o != 0) {
                        if (iM118769o == 8) {
                            this.f123371y |= 1;
                            this.f123372z = c36992f.m118766l();
                        } else if (iM118769o == 18) {
                            if ((i13 & 2) != 2) {
                                this.f123364E = new ArrayList();
                                i13 |= 2;
                            }
                            this.f123364E.add(c36992f.m118762h(C30129e1.f123113O, c36998i));
                        } else if (iM118769o == 26) {
                            if ((i13 & 16) != 16) {
                                this.f123367H = new ArrayList();
                                i13 |= 16;
                            }
                            this.f123367H.add(c36992f.m118762h(C30136h.f123168H, c36998i));
                        } else if (iM118769o == 248) {
                            if ((i13 & 4) != 4) {
                                this.f123365F = new ArrayList();
                                i13 |= 4;
                            }
                            this.f123365F.add(Integer.valueOf(c36992f.m118766l()));
                        } else if (iM118769o == 250) {
                            int iM118759e = c36992f.m118759e(c36992f.m118766l());
                            if ((i13 & 4) != 4 && c36992f.m118757c() > 0) {
                                this.f123365F = new ArrayList();
                                i13 |= 4;
                            }
                            while (c36992f.m118757c() > 0) {
                                this.f123365F.add(Integer.valueOf(c36992f.m118766l()));
                            }
                            c36992f.m118758d(iM118759e);
                        } else if (iM118769o != 258) {
                            if (!m118823n(c36992f, c36994gM118784j, c36998i, iM118769o)) {
                            }
                        } else {
                            if ((i13 & 8) != 8) {
                                this.f123366G = new ArrayList();
                                i13 |= 8;
                            }
                            this.f123366G.add(c36992f.m118762h(C30150m.f123340H, c36998i));
                        }
                    }
                    z4 = true;
                } catch (Throwable th3) {
                    if ((i13 & 2) == 2) {
                        this.f123364E = Collections.unmodifiableList(this.f123364E);
                    }
                    if ((i13 & 16) == 16) {
                        this.f123367H = Collections.unmodifiableList(this.f123367H);
                    }
                    if ((i13 & 4) == 4) {
                        this.f123365F = Collections.unmodifiableList(this.f123365F);
                    }
                    if ((i13 & 8) == 8) {
                        this.f123366G = Collections.unmodifiableList(this.f123366G);
                    }
                    try {
                        c36994gM118784j.m118785i();
                    } catch (IOException unused) {
                    } finally {
                        this.f123370x = c36988d.m118737i();
                    }
                    m118822m();
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
        if ((i13 & 2) == 2) {
            this.f123364E = Collections.unmodifiableList(this.f123364E);
        }
        if ((i13 & 16) == 16) {
            this.f123367H = Collections.unmodifiableList(this.f123367H);
        }
        if ((i13 & 4) == 4) {
            this.f123365F = Collections.unmodifiableList(this.f123365F);
        }
        if ((i13 & 8) == 8) {
            this.f123366G = Collections.unmodifiableList(this.f123366G);
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f123370x = c36988d.m118737i();
        }
        m118822m();
    }
}
