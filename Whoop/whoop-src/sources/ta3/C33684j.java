package ta3;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
import wa3.C37018u;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: ta3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C33684j extends AbstractC37012p implements InterfaceC37020w {

    /* JADX INFO: renamed from: M */
    public static final C33684j f140713M;

    /* JADX INFO: renamed from: N */
    public static final C30115a f140714N = new C30115a(25);

    /* JADX INFO: renamed from: E */
    public Object f140715E;

    /* JADX INFO: renamed from: F */
    public EnumC33683i f140716F;

    /* JADX INFO: renamed from: G */
    public List f140717G;

    /* JADX INFO: renamed from: H */
    public int f140718H;

    /* JADX INFO: renamed from: I */
    public List f140719I;

    /* JADX INFO: renamed from: J */
    public int f140720J;

    /* JADX INFO: renamed from: K */
    public byte f140721K;

    /* JADX INFO: renamed from: L */
    public int f140722L;

    /* JADX INFO: renamed from: w */
    public final AbstractC36990e f140723w;

    /* JADX INFO: renamed from: x */
    public int f140724x;

    /* JADX INFO: renamed from: y */
    public int f140725y;

    /* JADX INFO: renamed from: z */
    public int f140726z;

    static {
        C33684j c33684j = new C33684j();
        f140713M = c33684j;
        c33684j.f140725y = 1;
        c33684j.f140726z = 0;
        c33684j.f140715E = "";
        c33684j.f140716F = EnumC33683i.NONE;
        List list = Collections.EMPTY_LIST;
        c33684j.f140717G = list;
        c33684j.f140719I = list;
    }

    public C33684j() {
        this.f140718H = -1;
        this.f140720J = -1;
        this.f140721K = (byte) -1;
        this.f140722L = -1;
        this.f140723w = AbstractC36990e.f158321w;
    }

    @Override // wa3.InterfaceC37020w
    /* JADX INFO: renamed from: b */
    public final boolean mo92260b() {
        if (this.f140721K == 1) {
            return true;
        }
        this.f140721K = (byte) 1;
        return true;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: c */
    public final AbstractC37002k mo92261c() {
        C33682h c33682hM106431j = C33682h.m106431j();
        c33682hM106431j.m106433l(this);
        return c33682hM106431j;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: d */
    public final int mo92262d() {
        AbstractC36990e c37018u;
        int i13 = this.f140722L;
        if (i13 != -1) {
            return i13;
        }
        int iM118777b = (this.f140724x & 1) == 1 ? C36994g.m118777b(1, this.f140725y) : 0;
        if ((this.f140724x & 2) == 2) {
            iM118777b += C36994g.m118777b(2, this.f140726z);
        }
        if ((this.f140724x & 8) == 8) {
            iM118777b += C36994g.m118776a(3, this.f140716F.f140712w);
        }
        int iM118778c = 0;
        for (int i14 = 0; i14 < this.f140717G.size(); i14++) {
            iM118778c += C36994g.m118778c(((Integer) this.f140717G.get(i14)).intValue());
        }
        int iM118778c2 = iM118777b + iM118778c;
        if (!this.f140717G.isEmpty()) {
            iM118778c2 = iM118778c2 + 1 + C36994g.m118778c(iM118778c);
        }
        this.f140718H = iM118778c;
        int iM118778c3 = 0;
        for (int i15 = 0; i15 < this.f140719I.size(); i15++) {
            iM118778c3 += C36994g.m118778c(((Integer) this.f140719I.get(i15)).intValue());
        }
        int size = iM118778c2 + iM118778c3;
        if (!this.f140719I.isEmpty()) {
            size = size + 1 + C36994g.m118778c(iM118778c3);
        }
        this.f140720J = iM118778c3;
        if ((this.f140724x & 4) == 4) {
            Object obj = this.f140715E;
            if (obj instanceof String) {
                try {
                    c37018u = new C37018u(((String) obj).getBytes("UTF-8"));
                    this.f140715E = c37018u;
                } catch (UnsupportedEncodingException e5) {
                    throw new RuntimeException("UTF-8 not supported?", e5);
                }
            } else {
                c37018u = (AbstractC36990e) obj;
            }
            size += c37018u.size() + C36994g.m118781f(c37018u.size()) + C36994g.m118783h(6);
        }
        int size2 = this.f140723w.size() + size;
        this.f140722L = size2;
        return size2;
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: e */
    public final AbstractC37002k mo92263e() {
        return C33682h.m106431j();
    }

    @Override // wa3.InterfaceC37019v
    /* JADX INFO: renamed from: f */
    public final void mo92264f(C36994g c36994g) throws IOException {
        AbstractC36990e c37018u;
        mo92262d();
        if ((this.f140724x & 1) == 1) {
            c36994g.m118788m(1, this.f140725y);
        }
        if ((this.f140724x & 2) == 2) {
            c36994g.m118788m(2, this.f140726z);
        }
        if ((this.f140724x & 8) == 8) {
            c36994g.m118787l(3, this.f140716F.f140712w);
        }
        if (this.f140717G.size() > 0) {
            c36994g.m118797v(34);
            c36994g.m118797v(this.f140718H);
        }
        for (int i13 = 0; i13 < this.f140717G.size(); i13++) {
            c36994g.m118789n(((Integer) this.f140717G.get(i13)).intValue());
        }
        if (this.f140719I.size() > 0) {
            c36994g.m118797v(42);
            c36994g.m118797v(this.f140720J);
        }
        for (int i14 = 0; i14 < this.f140719I.size(); i14++) {
            c36994g.m118789n(((Integer) this.f140719I.get(i14)).intValue());
        }
        if ((this.f140724x & 4) == 4) {
            Object obj = this.f140715E;
            if (obj instanceof String) {
                try {
                    c37018u = new C37018u(((String) obj).getBytes("UTF-8"));
                    this.f140715E = c37018u;
                } catch (UnsupportedEncodingException e5) {
                    throw new RuntimeException("UTF-8 not supported?", e5);
                }
            } else {
                c37018u = (AbstractC36990e) obj;
            }
            c36994g.m118799x(6, 2);
            c36994g.m118797v(c37018u.size());
            c36994g.m118793r(c37018u);
        }
        c36994g.m118793r(this.f140723w);
    }

    public C33684j(C33682h c33682h) {
        this.f140718H = -1;
        this.f140720J = -1;
        this.f140721K = (byte) -1;
        this.f140722L = -1;
        this.f140723w = c33682h.f158353w;
    }

    public C33684j(C36992f c36992f) {
        EnumC33683i enumC33683i;
        this.f140718H = -1;
        this.f140720J = -1;
        this.f140721K = (byte) -1;
        this.f140722L = -1;
        this.f140725y = 1;
        boolean z4 = false;
        this.f140726z = 0;
        this.f140715E = "";
        EnumC33683i enumC33683i2 = EnumC33683i.NONE;
        this.f140716F = enumC33683i2;
        List list = Collections.EMPTY_LIST;
        this.f140717G = list;
        this.f140719I = list;
        C36988d c36988d = new C36988d();
        C36994g c36994gM118784j = C36994g.m118784j(c36988d, 1);
        int i13 = 0;
        while (!z4) {
            try {
                try {
                    int iM118769o = c36992f.m118769o();
                    if (iM118769o != 0) {
                        if (iM118769o == 8) {
                            this.f140724x |= 1;
                            this.f140725y = c36992f.m118766l();
                        } else if (iM118769o == 16) {
                            this.f140724x |= 2;
                            this.f140726z = c36992f.m118766l();
                        } else if (iM118769o == 24) {
                            int iM118766l = c36992f.m118766l();
                            if (iM118766l == 0) {
                                enumC33683i = enumC33683i2;
                            } else if (iM118766l != 1) {
                                enumC33683i = iM118766l != 2 ? null : EnumC33683i.DESC_TO_CLASS_ID;
                            } else {
                                enumC33683i = EnumC33683i.INTERNAL_TO_CLASS_ID;
                            }
                            if (enumC33683i == null) {
                                c36994gM118784j.m118797v(iM118769o);
                                c36994gM118784j.m118797v(iM118766l);
                            } else {
                                this.f140724x |= 8;
                                this.f140716F = enumC33683i;
                            }
                        } else if (iM118769o == 32) {
                            if ((i13 & 16) != 16) {
                                this.f140717G = new ArrayList();
                                i13 |= 16;
                            }
                            this.f140717G.add(Integer.valueOf(c36992f.m118766l()));
                        } else if (iM118769o == 34) {
                            int iM118759e = c36992f.m118759e(c36992f.m118766l());
                            if ((i13 & 16) != 16 && c36992f.m118757c() > 0) {
                                this.f140717G = new ArrayList();
                                i13 |= 16;
                            }
                            while (c36992f.m118757c() > 0) {
                                this.f140717G.add(Integer.valueOf(c36992f.m118766l()));
                            }
                            c36992f.m118758d(iM118759e);
                        } else if (iM118769o == 40) {
                            if ((i13 & 32) != 32) {
                                this.f140719I = new ArrayList();
                                i13 |= 32;
                            }
                            this.f140719I.add(Integer.valueOf(c36992f.m118766l()));
                        } else if (iM118769o == 42) {
                            int iM118759e2 = c36992f.m118759e(c36992f.m118766l());
                            if ((i13 & 32) != 32 && c36992f.m118757c() > 0) {
                                this.f140719I = new ArrayList();
                                i13 |= 32;
                            }
                            while (c36992f.m118757c() > 0) {
                                this.f140719I.add(Integer.valueOf(c36992f.m118766l()));
                            }
                            c36992f.m118758d(iM118759e2);
                        } else if (iM118769o != 50) {
                            if (!c36992f.m118772r(iM118769o, c36994gM118784j)) {
                            }
                        } else {
                            C37018u c37018uM118760f = c36992f.m118760f();
                            this.f140724x |= 4;
                            this.f140715E = c37018uM118760f;
                        }
                    }
                    z4 = true;
                } catch (Throwable th3) {
                    if ((i13 & 16) == 16) {
                        this.f140717G = Collections.unmodifiableList(this.f140717G);
                    }
                    if ((i13 & 32) == 32) {
                        this.f140719I = Collections.unmodifiableList(this.f140719I);
                    }
                    try {
                        c36994gM118784j.m118785i();
                    } catch (IOException unused) {
                    } finally {
                        this.f140723w = c36988d.m118737i();
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
        if ((i13 & 16) == 16) {
            this.f140717G = Collections.unmodifiableList(this.f140717G);
        }
        if ((i13 & 32) == 32) {
            this.f140719I = Collections.unmodifiableList(this.f140719I);
        }
        try {
            c36994gM118784j.m118785i();
        } catch (IOException unused2) {
        } finally {
            this.f140723w = c36988d.m118737i();
        }
    }
}
