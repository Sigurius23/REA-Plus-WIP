package p012ab;

import android.util.Log;
import ed3.C13117a;
import java.util.Collections;
import java.util.List;
import jh3.AbstractC21702c;
import p151fn.C14637y;
import p151fn.InterfaceC14620h;
import p309lo.AbstractC24543a;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;
import p607x8.AbstractC38046a;
import p607x8.C38059n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ab.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C0683i implements InterfaceC0685j, InterfaceC14620h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2435a;

    /* JADX INFO: renamed from: b */
    public boolean f2436b;

    /* JADX INFO: renamed from: c */
    public long f2437c;

    /* JADX INFO: renamed from: d */
    public int f2438d;

    /* JADX INFO: renamed from: e */
    public int f2439e;

    /* JADX INFO: renamed from: f */
    public final Object f2440f;

    /* JADX INFO: renamed from: g */
    public Object f2441g;

    public C0683i(List list, int i13) {
        this.f2435a = i13;
        switch (i13) {
            case 2:
                this.f2440f = list;
                this.f2441g = new InterfaceC37377s[list.size()];
                this.f2437c = -9223372036854775807L;
                break;
            default:
                this.f2440f = list;
                this.f2441g = new InterfaceC33639k0[list.size()];
                this.f2437c = -9223372036854775807L;
                break;
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: a */
    public final void mo1663a() {
        switch (this.f2435a) {
            case 0:
                this.f2436b = false;
                this.f2437c = -9223372036854775807L;
                break;
            case 1:
                this.f2436b = false;
                this.f2437c = -9223372036854775807L;
                break;
            case 2:
                this.f2436b = false;
                this.f2437c = -9223372036854775807L;
                break;
            default:
                this.f2436b = false;
                this.f2437c = -9223372036854775807L;
                break;
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: c */
    public void mo1664c(C38059n c38059n) {
        boolean z4;
        boolean z13;
        switch (this.f2435a) {
            case 0:
                if (this.f2436b) {
                    if (this.f2438d == 2) {
                        if (c38059n.m121848a() == 0) {
                            z13 = false;
                        } else {
                            if (c38059n.m121867t() != 32) {
                                this.f2436b = false;
                            }
                            this.f2438d--;
                            z13 = this.f2436b;
                        }
                        if (!z13) {
                        }
                    }
                    if (this.f2438d == 1) {
                        if (c38059n.m121848a() == 0) {
                            z4 = false;
                        } else {
                            if (c38059n.m121867t() != 0) {
                                this.f2436b = false;
                            }
                            this.f2438d--;
                            z4 = this.f2436b;
                        }
                        if (!z4) {
                        }
                    }
                    int i13 = c38059n.f163018b;
                    int iM121848a = c38059n.m121848a();
                    for (InterfaceC33639k0 interfaceC33639k0 : (InterfaceC33639k0[]) this.f2441g) {
                        c38059n.m121846F(i13);
                        interfaceC33639k0.mo36176d(c38059n, iM121848a, 0);
                    }
                    this.f2439e += iM121848a;
                }
                break;
            default:
                C38059n c38059n2 = (C38059n) this.f2440f;
                AbstractC35849g.m113808j((InterfaceC33639k0) this.f2441g);
                if (this.f2436b) {
                    int iM121848a2 = c38059n.m121848a();
                    int i14 = this.f2439e;
                    if (i14 < 10) {
                        int iMin = Math.min(iM121848a2, 10 - i14);
                        System.arraycopy(c38059n.f163017a, c38059n.f163018b, c38059n2.f163017a, this.f2439e, iMin);
                        if (this.f2439e + iMin == 10) {
                            c38059n2.m121846F(0);
                            if (73 == c38059n2.m121867t() && 68 == c38059n2.m121867t() && 51 == c38059n2.m121867t()) {
                                c38059n2.m121847G(3);
                                this.f2438d = c38059n2.m121866s() + 10;
                            } else {
                                AbstractC38046a.m121826u("Id3Reader", "Discarding invalid ID3 tag");
                                this.f2436b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iM121848a2, this.f2438d - this.f2439e);
                    ((InterfaceC33639k0) this.f2441g).mo36176d(c38059n, iMin2, 0);
                    this.f2439e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: d */
    public final void mo1665d(int i13, long j7) {
        switch (this.f2435a) {
            case 0:
                if ((i13 & 4) != 0) {
                    this.f2436b = true;
                    this.f2437c = j7;
                    this.f2439e = 0;
                    this.f2438d = 2;
                    break;
                }
                break;
            case 1:
                if ((i13 & 4) != 0) {
                    this.f2436b = true;
                    this.f2437c = j7;
                    this.f2438d = 0;
                    this.f2439e = 0;
                    break;
                }
                break;
            case 2:
                if ((i13 & 4) != 0) {
                    this.f2436b = true;
                    if (j7 != -9223372036854775807L) {
                        this.f2437c = j7;
                    }
                    this.f2439e = 0;
                    this.f2438d = 2;
                    break;
                }
                break;
            default:
                if ((i13 & 4) != 0) {
                    this.f2436b = true;
                    if (j7 != -9223372036854775807L) {
                        this.f2437c = j7;
                    }
                    this.f2438d = 0;
                    this.f2439e = 0;
                    break;
                }
                break;
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: e */
    public void mo1666e(boolean z4) {
        int i13;
        switch (this.f2435a) {
            case 0:
                if (this.f2436b) {
                    AbstractC35849g.m113807i(this.f2437c != -9223372036854775807L);
                    for (InterfaceC33639k0 interfaceC33639k0 : (InterfaceC33639k0[]) this.f2441g) {
                        interfaceC33639k0.mo36174b(this.f2437c, 1, this.f2439e, 0, null);
                    }
                    this.f2436b = false;
                }
                break;
            default:
                AbstractC35849g.m113808j((InterfaceC33639k0) this.f2441g);
                if (this.f2436b && (i13 = this.f2438d) != 0 && this.f2439e == i13) {
                    AbstractC35849g.m113807i(this.f2437c != -9223372036854775807L);
                    ((InterfaceC33639k0) this.f2441g).mo36174b(this.f2437c, 1, this.f2438d, 0, null);
                    this.f2436b = false;
                    break;
                }
                break;
        }
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: f */
    public void mo1711f(C13117a c13117a) {
        boolean z4;
        boolean z13;
        switch (this.f2435a) {
            case 2:
                if (this.f2436b) {
                    if (this.f2438d == 2) {
                        if (c13117a.m36692a() == 0) {
                            z13 = false;
                        } else {
                            if (c13117a.m36715y() != 32) {
                                this.f2436b = false;
                            }
                            this.f2438d--;
                            z13 = this.f2436b;
                        }
                        if (!z13) {
                        }
                    }
                    if (this.f2438d == 1) {
                        if (c13117a.m36692a() == 0) {
                            z4 = false;
                        } else {
                            if (c13117a.m36715y() != 0) {
                                this.f2436b = false;
                            }
                            this.f2438d--;
                            z4 = this.f2436b;
                        }
                        if (!z4) {
                        }
                    }
                    int i13 = c13117a.f45382b;
                    int iM36692a = c13117a.m36692a();
                    for (InterfaceC37377s interfaceC37377s : (InterfaceC37377s[]) this.f2441g) {
                        c13117a.m36689K(i13);
                        interfaceC37377s.mo102732c(iM36692a, c13117a);
                    }
                    this.f2439e += iM36692a;
                }
                break;
            default:
                C13117a c13117a2 = (C13117a) this.f2440f;
                AbstractC24543a.m71574j((InterfaceC37377s) this.f2441g);
                if (this.f2436b) {
                    int iM36692a2 = c13117a.m36692a();
                    int i14 = this.f2439e;
                    if (i14 < 10) {
                        int iMin = Math.min(iM36692a2, 10 - i14);
                        System.arraycopy(c13117a.f45381a, c13117a.f45382b, c13117a2.f45381a, this.f2439e, iMin);
                        if (this.f2439e + iMin == 10) {
                            c13117a2.m36689K(0);
                            if (73 == c13117a2.m36715y() && 68 == c13117a2.m36715y() && 51 == c13117a2.m36715y()) {
                                c13117a2.m36690L(3);
                                this.f2438d = c13117a2.m36713w() + 10;
                            } else {
                                Log.w("Id3Reader", "Discarding invalid ID3 tag");
                                this.f2436b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iM36692a2, this.f2438d - this.f2439e);
                    ((InterfaceC37377s) this.f2441g).mo102732c(iMin2, c13117a);
                    this.f2439e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: g */
    public void mo1712g(InterfaceC37369k interfaceC37369k, C0690l0 c0690l0) {
        switch (this.f2435a) {
            case 2:
                InterfaceC37377s[] interfaceC37377sArr = (InterfaceC37377s[]) this.f2441g;
                for (int i13 = 0; i13 < interfaceC37377sArr.length; i13++) {
                    C14637y c14637y = (C14637y) ((List) this.f2440f).get(i13);
                    c0690l0.m1733c();
                    c0690l0.m1738h();
                    InterfaceC37377s interfaceC37377sMo3102o = interfaceC37369k.mo3102o(c0690l0.f2494e, 3);
                    C31518b0 c31518b0 = new C31518b0();
                    c0690l0.m1738h();
                    c31518b0.f130037a = (String) c0690l0.f2495f;
                    c31518b0.f130047k = "application/dvbsubs";
                    c31518b0.f130049m = Collections.singletonList(c14637y.f54046b);
                    c31518b0.f130039c = c14637y.f54045a;
                    interfaceC37377sMo3102o.mo102730a(new C31521c0(c31518b0));
                    interfaceC37377sArr[i13] = interfaceC37377sMo3102o;
                }
                break;
            default:
                c0690l0.m1733c();
                c0690l0.m1738h();
                InterfaceC37377s interfaceC37377sMo3102o2 = interfaceC37369k.mo3102o(c0690l0.f2494e, 5);
                this.f2441g = interfaceC37377sMo3102o2;
                C31518b0 c31518b1 = new C31518b0();
                c0690l0.m1738h();
                c31518b1.f130037a = (String) c0690l0.f2495f;
                c31518b1.f130047k = "application/id3";
                interfaceC37377sMo3102o2.mo102730a(new C31521c0(c31518b1));
                break;
        }
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: h */
    public void mo1713h() {
        int i13;
        switch (this.f2435a) {
            case 2:
                if (this.f2436b) {
                    if (this.f2437c != -9223372036854775807L) {
                        for (InterfaceC37377s interfaceC37377s : (InterfaceC37377s[]) this.f2441g) {
                            interfaceC37377s.mo102733d(this.f2437c, 1, this.f2439e, 0, null);
                        }
                    }
                    this.f2436b = false;
                }
                break;
            default:
                AbstractC24543a.m71574j((InterfaceC37377s) this.f2441g);
                if (this.f2436b && (i13 = this.f2438d) != 0 && this.f2439e == i13) {
                    long j7 = this.f2437c;
                    if (j7 != -9223372036854775807L) {
                        ((InterfaceC37377s) this.f2441g).mo102733d(j7, 1, i13, 0, null);
                    }
                    this.f2436b = false;
                    break;
                }
                break;
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: i */
    public void mo1667i(InterfaceC33648q interfaceC33648q, C0690l0 c0690l0) {
        switch (this.f2435a) {
            case 0:
                InterfaceC33639k0[] interfaceC33639k0Arr = (InterfaceC33639k0[]) this.f2441g;
                for (int i13 = 0; i13 < interfaceC33639k0Arr.length; i13++) {
                    C0688k0 c0688k0 = (C0688k0) ((List) this.f2440f).get(i13);
                    c0690l0.m1733c();
                    c0690l0.m1738h();
                    InterfaceC33639k0 interfaceC33639k0Mo3101o = interfaceC33648q.mo3101o(c0690l0.f2494e, 3);
                    C34608o c34608o = new C34608o();
                    c0690l0.m1738h();
                    c34608o.f145729a = (String) c0690l0.f2495f;
                    c34608o.f145740l = AbstractC34587d0.m109382o("video/mp2t");
                    c34608o.f145741m = AbstractC34587d0.m109382o("application/dvbsubs");
                    c34608o.f145744p = Collections.singletonList(c0688k0.f2471b);
                    c34608o.f145732d = c0688k0.f2470a;
                    AbstractC21702c.m61152w(c34608o, interfaceC33639k0Mo3101o);
                    interfaceC33639k0Arr[i13] = interfaceC33639k0Mo3101o;
                }
                break;
            default:
                c0690l0.m1733c();
                c0690l0.m1738h();
                InterfaceC33639k0 interfaceC33639k0Mo3101o2 = interfaceC33648q.mo3101o(c0690l0.f2494e, 5);
                this.f2441g = interfaceC33639k0Mo3101o2;
                C34608o c34608o2 = new C34608o();
                c0690l0.m1738h();
                c34608o2.f145729a = (String) c0690l0.f2495f;
                c34608o2.f145740l = AbstractC34587d0.m109382o("video/mp2t");
                c34608o2.f145741m = AbstractC34587d0.m109382o("application/id3");
                AbstractC21702c.m61152w(c34608o2, interfaceC33639k0Mo3101o2);
                break;
        }
    }

    public C0683i(int i13) {
        this.f2435a = i13;
        switch (i13) {
            case 3:
                this.f2440f = new C13117a(10);
                this.f2437c = -9223372036854775807L;
                break;
            default:
                this.f2440f = new C38059n(10);
                this.f2437c = -9223372036854775807L;
                break;
        }
    }
}
