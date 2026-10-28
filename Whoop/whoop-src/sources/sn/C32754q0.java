package sn;

import ai.C0902h;
import android.util.Log;
import android.util.SparseArray;
import ed3.C13117a;
import java.io.EOFException;
import java.util.ArrayList;
import p012ab.C0682h0;
import p047c9.C4320k;
import p122em.C13322b;
import p284ko.C22606a;
import p284ko.C22631o;
import p284ko.InterfaceC22622i;
import p299l9.C23534w0;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p508ty.C34249c;
import p527um.C35073c;
import p556vm.C36136c;
import p556vm.C36140g;
import p556vm.InterfaceC36141h;
import p588wm.C37376r;
import p588wm.InterfaceC37377s;
import p619xl.C38445a;
import sm.C32710c;

/* JADX INFO: renamed from: sn.q0 */
/* JADX INFO: loaded from: classes6.dex */
public class C32754q0 implements InterfaceC37377s {

    /* JADX INFO: renamed from: A */
    public C31521c0 f136205A;

    /* JADX INFO: renamed from: B */
    public C31521c0 f136206B;

    /* JADX INFO: renamed from: C */
    public int f136207C;

    /* JADX INFO: renamed from: D */
    public boolean f136208D;

    /* JADX INFO: renamed from: E */
    public boolean f136209E;

    /* JADX INFO: renamed from: F */
    public long f136210F;

    /* JADX INFO: renamed from: G */
    public boolean f136211G;

    /* JADX INFO: renamed from: a */
    public final C23534w0 f136212a;

    /* JADX INFO: renamed from: d */
    public final InterfaceC36141h f136215d;

    /* JADX INFO: renamed from: e */
    public final C32770z f136216e;

    /* JADX INFO: renamed from: f */
    public Object f136217f;

    /* JADX INFO: renamed from: g */
    public C31521c0 f136218g;

    /* JADX INFO: renamed from: h */
    public C34249c f136219h;

    /* JADX INFO: renamed from: p */
    public int f136227p;

    /* JADX INFO: renamed from: q */
    public int f136228q;

    /* JADX INFO: renamed from: r */
    public int f136229r;

    /* JADX INFO: renamed from: s */
    public int f136230s;

    /* JADX INFO: renamed from: w */
    public boolean f136234w;

    /* JADX INFO: renamed from: z */
    public boolean f136237z;

    /* JADX INFO: renamed from: b */
    public final C13322b f136213b = new C13322b();

    /* JADX INFO: renamed from: i */
    public int f136220i = 1000;

    /* JADX INFO: renamed from: j */
    public int[] f136221j = new int[1000];

    /* JADX INFO: renamed from: k */
    public long[] f136222k = new long[1000];

    /* JADX INFO: renamed from: n */
    public long[] f136225n = new long[1000];

    /* JADX INFO: renamed from: m */
    public int[] f136224m = new int[1000];

    /* JADX INFO: renamed from: l */
    public int[] f136223l = new int[1000];

    /* JADX INFO: renamed from: o */
    public C37376r[] f136226o = new C37376r[1000];

    /* JADX INFO: renamed from: c */
    public final C0682h0 f136214c = new C0682h0(new C32710c(23));

    /* JADX INFO: renamed from: t */
    public long f136231t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u */
    public long f136232u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v */
    public long f136233v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y */
    public boolean f136236y = true;

    /* JADX INFO: renamed from: x */
    public boolean f136235x = true;

    public C32754q0(C22631o c22631o, InterfaceC36141h interfaceC36141h, C32770z c32770z) {
        this.f136215d = interfaceC36141h;
        this.f136216e = c32770z;
        this.f136212a = new C23534w0(c22631o);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005b A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:4:0x000a, B:8:0x0017, B:13:0x0029, B:15:0x0042, B:19:0x005d, B:81:0x0111, B:73:0x00fe, B:76:0x0106, B:18:0x005b), top: B:91:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:80:0x0110  */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, sn.p0] */
    @Override // p588wm.InterfaceC37377s
    /* JADX INFO: renamed from: a */
    public final void mo102730a(C31521c0 c31521c0) {
        boolean z4;
        C4320k c4320kM71611e;
        int iM13611a;
        C31521c0 c31521c0Mo102739j = mo102739j(c31521c0);
        boolean z13 = false;
        this.f136237z = false;
        this.f136205A = c31521c0;
        synchronized (this) {
            try {
                this.f136236y = false;
                if (!AbstractC24567y.m71670a(c31521c0Mo102739j, this.f136206B)) {
                    if (((SparseArray) this.f136214c.f2433y).size() == 0) {
                        this.f136206B = c31521c0Mo102739j;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.f136214c.f2433y;
                        if (((C32750o0) sparseArray.valueAt(sparseArray.size() - 1)).f136193a.equals(c31521c0Mo102739j)) {
                            SparseArray sparseArray2 = (SparseArray) this.f136214c.f2433y;
                            this.f136206B = ((C32750o0) sparseArray2.valueAt(sparseArray2.size() - 1)).f136193a;
                        } else {
                            this.f136206B = c31521c0Mo102739j;
                        }
                    }
                    C31521c0 c31521c1 = this.f136206B;
                    String str = c31521c1.f130077L;
                    String str2 = c31521c1.f130074I;
                    ArrayList arrayList = AbstractC24555m.f95827a;
                    if (str != null) {
                        switch (str) {
                            case "audio/eac3-joc":
                            case "audio/mpeg-L1":
                            case "audio/mpeg-L2":
                            case "audio/ac3":
                            case "audio/raw":
                            case "audio/eac3":
                            case "audio/flac":
                            case "audio/mpeg":
                            case "audio/g711-alaw":
                            case "audio/g711-mlaw":
                                z4 = true;
                                break;
                            case "audio/mp4a-latm":
                                if (str2 != null && (c4320kM71611e = AbstractC24555m.m71611e(str2)) != null && (iM13611a = c4320kM71611e.m13611a()) != 0 && iM13611a != 16) {
                                    z4 = true;
                                    break;
                                } else {
                                    z4 = false;
                                    break;
                                }
                                break;
                            default:
                                z4 = false;
                                break;
                        }
                    } else {
                        z4 = false;
                    }
                    this.f136208D = z4;
                    this.f136209E = false;
                    z13 = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        ?? r10 = this.f136217f;
        if (r10 == 0 || !z13) {
            return;
        }
        r10.mo102719r();
    }

    @Override // p588wm.InterfaceC37377s
    /* JADX INFO: renamed from: b */
    public final int mo102731b(InterfaceC22622i interfaceC22622i, int i13, boolean z4) throws EOFException {
        C23534w0 c23534w0 = this.f136212a;
        int iM68119d = c23534w0.m68119d(i13);
        C0902h c0902h = (C0902h) c23534w0.f93195h;
        C22606a c22606a = (C22606a) c0902h.f3297z;
        int i14 = interfaceC22622i.read(c22606a.f88944a, ((int) (c23534w0.f93190c - c0902h.f3295x)) + c22606a.f88945b, iM68119d);
        if (i14 == -1) {
            if (z4) {
                return -1;
            }
            throw new EOFException();
        }
        long j7 = c23534w0.f93190c + ((long) i14);
        c23534w0.f93190c = j7;
        C0902h c0902h2 = (C0902h) c23534w0.f93195h;
        if (j7 == c0902h2.f3296y) {
            c23534w0.f93195h = (C0902h) c0902h2.f3293E;
        }
        return i14;
    }

    @Override // p588wm.InterfaceC37377s
    /* JADX INFO: renamed from: c */
    public final void mo102732c(int i13, C13117a c13117a) {
        while (true) {
            C23534w0 c23534w0 = this.f136212a;
            if (i13 <= 0) {
                c23534w0.getClass();
                return;
            }
            int iM68119d = c23534w0.m68119d(i13);
            C0902h c0902h = (C0902h) c23534w0.f93195h;
            C22606a c22606a = (C22606a) c0902h.f3297z;
            c13117a.m36697g(c22606a.f88944a, ((int) (c23534w0.f93190c - c0902h.f3295x)) + c22606a.f88945b, iM68119d);
            i13 -= iM68119d;
            long j7 = c23534w0.f93190c + ((long) iM68119d);
            c23534w0.f93190c = j7;
            C0902h c0902h2 = (C0902h) c23534w0.f93195h;
            if (j7 == c0902h2.f3296y) {
                c23534w0.f93195h = (C0902h) c0902h2.f3293E;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0185 A[Catch: all -> 0x00eb, TryCatch #1 {all -> 0x00eb, blocks: (B:69:0x00cd, B:71:0x00d1, B:75:0x00e7, B:78:0x00ee, B:82:0x00f6, B:87:0x0131, B:110:0x01ab, B:112:0x01b4, B:89:0x014c, B:91:0x0150, B:93:0x0158, B:95:0x0171, B:99:0x017a, B:100:0x017f, B:102:0x0185, B:106:0x0193, B:108:0x0198, B:109:0x01a8, B:92:0x0156), top: B:118:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0190  */
    /* JADX WARN: Code duplicated, block: B:105:0x0192  */
    /* JADX WARN: Code duplicated, block: B:108:0x0198 A[Catch: all -> 0x00eb, TryCatch #1 {all -> 0x00eb, blocks: (B:69:0x00cd, B:71:0x00d1, B:75:0x00e7, B:78:0x00ee, B:82:0x00f6, B:87:0x0131, B:110:0x01ab, B:112:0x01b4, B:89:0x014c, B:91:0x0150, B:93:0x0158, B:95:0x0171, B:99:0x017a, B:100:0x017f, B:102:0x0185, B:106:0x0193, B:108:0x0198, B:109:0x01a8, B:92:0x0156), top: B:118:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:89:0x014c A[Catch: all -> 0x00eb, TryCatch #1 {all -> 0x00eb, blocks: (B:69:0x00cd, B:71:0x00d1, B:75:0x00e7, B:78:0x00ee, B:82:0x00f6, B:87:0x0131, B:110:0x01ab, B:112:0x01b4, B:89:0x014c, B:91:0x0150, B:93:0x0158, B:95:0x0171, B:99:0x017a, B:100:0x017f, B:102:0x0185, B:106:0x0193, B:108:0x0198, B:109:0x01a8, B:92:0x0156), top: B:118:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0150 A[Catch: all -> 0x00eb, TryCatch #1 {all -> 0x00eb, blocks: (B:69:0x00cd, B:71:0x00d1, B:75:0x00e7, B:78:0x00ee, B:82:0x00f6, B:87:0x0131, B:110:0x01ab, B:112:0x01b4, B:89:0x014c, B:91:0x0150, B:93:0x0158, B:95:0x0171, B:99:0x017a, B:100:0x017f, B:102:0x0185, B:106:0x0193, B:108:0x0198, B:109:0x01a8, B:92:0x0156), top: B:118:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0156 A[Catch: all -> 0x00eb, TryCatch #1 {all -> 0x00eb, blocks: (B:69:0x00cd, B:71:0x00d1, B:75:0x00e7, B:78:0x00ee, B:82:0x00f6, B:87:0x0131, B:110:0x01ab, B:112:0x01b4, B:89:0x014c, B:91:0x0150, B:93:0x0158, B:95:0x0171, B:99:0x017a, B:100:0x017f, B:102:0x0185, B:106:0x0193, B:108:0x0198, B:109:0x01a8, B:92:0x0156), top: B:118:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0171 A[Catch: all -> 0x00eb, TryCatch #1 {all -> 0x00eb, blocks: (B:69:0x00cd, B:71:0x00d1, B:75:0x00e7, B:78:0x00ee, B:82:0x00f6, B:87:0x0131, B:110:0x01ab, B:112:0x01b4, B:89:0x014c, B:91:0x0150, B:93:0x0158, B:95:0x0171, B:99:0x017a, B:100:0x017f, B:102:0x0185, B:106:0x0193, B:108:0x0198, B:109:0x01a8, B:92:0x0156), top: B:118:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0177  */
    /* JADX WARN: Code duplicated, block: B:98:0x0179  */
    @Override // p588wm.InterfaceC37377s
    /* JADX INFO: renamed from: d */
    public void mo102733d(long j7, int i13, int i14, int i15, C37376r c37376r) {
        int i16;
        InterfaceC36141h interfaceC36141h;
        C36140g c36140g;
        C0682h0 c0682h0;
        int i17;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z4;
        boolean z13;
        boolean z14;
        if (this.f136237z) {
            C31521c0 c31521c0 = this.f136205A;
            AbstractC24543a.m71574j(c31521c0);
            mo102730a(c31521c0);
        }
        int i18 = i13 & 1;
        boolean z15 = i18 != 0;
        if (this.f136235x) {
            if (!z15) {
                return;
            } else {
                this.f136235x = false;
            }
        }
        long j13 = j7 + this.f136210F;
        if (!this.f136208D) {
            i16 = i13;
        } else {
            if (j13 < this.f136231t) {
                return;
            }
            if (i18 == 0) {
                if (!this.f136209E) {
                    String strValueOf = String.valueOf(this.f136206B);
                    StringBuilder sb4 = new StringBuilder(strValueOf.length() + 50);
                    sb4.append("Overriding unexpected non-sync sample for format: ");
                    sb4.append(strValueOf);
                    Log.w("SampleQueue", sb4.toString());
                    this.f136209E = true;
                }
                i16 = i13 | 1;
            } else {
                i16 = i13;
            }
        }
        if (this.f136211G) {
            if (!z15) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f136227p == 0) {
                        z14 = j13 > this.f136232u;
                    } else {
                        synchronized (this) {
                            long jMax = Math.max(this.f136232u, m102740k(this.f136230s));
                            if (jMax >= j13) {
                                z14 = false;
                            } else {
                                int i19 = this.f136227p;
                                int iM102742m = m102742m(i19 - 1);
                                while (i19 > this.f136230s && this.f136225n[iM102742m] >= j13) {
                                    i19--;
                                    iM102742m--;
                                    if (iM102742m == -1) {
                                        iM102742m = this.f136220i - 1;
                                    }
                                }
                                m102737h(this.f136228q + i19);
                                z14 = true;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (!z14) {
                return;
            } else {
                this.f136211G = false;
            }
        }
        long j14 = (this.f136212a.f93190c - ((long) i14)) - ((long) i15);
        synchronized (this) {
            try {
                int i24 = this.f136227p;
                if (i24 > 0) {
                    int iM102742m2 = m102742m(i24 - 1);
                    AbstractC24543a.m71569e(this.f136222k[iM102742m2] + ((long) this.f136223l[iM102742m2]) <= j14);
                }
                this.f136234w = (536870912 & i16) != 0;
                this.f136233v = Math.max(this.f136233v, j13);
                int iM102742m3 = m102742m(this.f136227p);
                this.f136225n[iM102742m3] = j13;
                this.f136222k[iM102742m3] = j14;
                this.f136223l[iM102742m3] = i14;
                this.f136224m[iM102742m3] = i16;
                this.f136226o[iM102742m3] = c37376r;
                this.f136221j[iM102742m3] = this.f136207C;
                if (((SparseArray) this.f136214c.f2433y).size() == 0) {
                    interfaceC36141h = this.f136215d;
                    if (interfaceC36141h != null) {
                        interfaceC36141h.getClass();
                        c36140g = C36140g.f154643a;
                    } else {
                        c36140g = C36140g.f154643a;
                    }
                    c0682h0 = this.f136214c;
                    i17 = this.f136228q + this.f136227p;
                    C31521c0 c31521c1 = this.f136206B;
                    c31521c1.getClass();
                    C32750o0 c32750o0 = new C32750o0(c31521c1, c36140g);
                    sparseArray = (SparseArray) c0682h0.f2433y;
                    if (c0682h0.f2432x == -1) {
                        if (sparseArray.size() == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        AbstractC24543a.m71573i(z13);
                        c0682h0.f2432x = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i17 >= iKeyAt) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        AbstractC24543a.m71569e(z4);
                        if (iKeyAt == i17) {
                            ((C32710c) c0682h0.f2434z).m102661a(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i17, c32750o0);
                } else {
                    SparseArray sparseArray2 = (SparseArray) this.f136214c.f2433y;
                    if (!((C32750o0) sparseArray2.valueAt(sparseArray2.size() - 1)).f136193a.equals(this.f136206B)) {
                        interfaceC36141h = this.f136215d;
                        if (interfaceC36141h != null) {
                            interfaceC36141h.getClass();
                            c36140g = C36140g.f154643a;
                        } else {
                            c36140g = C36140g.f154643a;
                        }
                        c0682h0 = this.f136214c;
                        i17 = this.f136228q + this.f136227p;
                        C31521c0 c31521c2 = this.f136206B;
                        c31521c2.getClass();
                        C32750o0 c32750o1 = new C32750o0(c31521c2, c36140g);
                        sparseArray = (SparseArray) c0682h0.f2433y;
                        if (c0682h0.f2432x == -1) {
                            if (sparseArray.size() == 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            AbstractC24543a.m71573i(z13);
                            c0682h0.f2432x = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i17 >= iKeyAt) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            AbstractC24543a.m71569e(z4);
                            if (iKeyAt == i17) {
                                ((C32710c) c0682h0.f2434z).m102661a(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i17, c32750o1);
                    }
                }
                int i25 = this.f136227p + 1;
                this.f136227p = i25;
                int i26 = this.f136220i;
                if (i25 == i26) {
                    int i27 = i26 + 1000;
                    int[] iArr = new int[i27];
                    long[] jArr = new long[i27];
                    long[] jArr2 = new long[i27];
                    int[] iArr2 = new int[i27];
                    int[] iArr3 = new int[i27];
                    C37376r[] c37376rArr = new C37376r[i27];
                    int i28 = this.f136229r;
                    int i29 = i26 - i28;
                    System.arraycopy(this.f136222k, i28, jArr, 0, i29);
                    System.arraycopy(this.f136225n, this.f136229r, jArr2, 0, i29);
                    System.arraycopy(this.f136224m, this.f136229r, iArr2, 0, i29);
                    System.arraycopy(this.f136223l, this.f136229r, iArr3, 0, i29);
                    System.arraycopy(this.f136226o, this.f136229r, c37376rArr, 0, i29);
                    System.arraycopy(this.f136221j, this.f136229r, iArr, 0, i29);
                    int i34 = this.f136229r;
                    System.arraycopy(this.f136222k, 0, jArr, i29, i34);
                    System.arraycopy(this.f136225n, 0, jArr2, i29, i34);
                    System.arraycopy(this.f136224m, 0, iArr2, i29, i34);
                    System.arraycopy(this.f136223l, 0, iArr3, i29, i34);
                    System.arraycopy(this.f136226o, 0, c37376rArr, i29, i34);
                    System.arraycopy(this.f136221j, 0, iArr, i29, i34);
                    this.f136222k = jArr;
                    this.f136225n = jArr2;
                    this.f136224m = iArr2;
                    this.f136223l = iArr3;
                    this.f136226o = c37376rArr;
                    this.f136221j = iArr;
                    this.f136229r = 0;
                    this.f136220i = i27;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final long m102734e(int i13) {
        this.f136232u = Math.max(this.f136232u, m102740k(i13));
        this.f136227p -= i13;
        int i14 = this.f136228q + i13;
        this.f136228q = i14;
        int i15 = this.f136229r + i13;
        this.f136229r = i15;
        int i16 = this.f136220i;
        if (i15 >= i16) {
            this.f136229r = i15 - i16;
        }
        int i17 = this.f136230s - i13;
        this.f136230s = i17;
        int i18 = 0;
        if (i17 < 0) {
            this.f136230s = 0;
        }
        C0682h0 c0682h0 = this.f136214c;
        SparseArray sparseArray = (SparseArray) c0682h0.f2433y;
        while (i18 < sparseArray.size() - 1) {
            int i19 = i18 + 1;
            if (i14 < sparseArray.keyAt(i19)) {
                break;
            }
            ((C32710c) c0682h0.f2434z).m102661a(sparseArray.valueAt(i18));
            sparseArray.removeAt(i18);
            int i24 = c0682h0.f2432x;
            if (i24 > 0) {
                c0682h0.f2432x = i24 - 1;
            }
            i18 = i19;
        }
        if (this.f136227p != 0) {
            return this.f136222k[this.f136229r];
        }
        int i25 = this.f136229r;
        if (i25 == 0) {
            i25 = this.f136220i;
        }
        int i26 = i25 - 1;
        return this.f136222k[i26] + ((long) this.f136223l[i26]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    /* JADX INFO: renamed from: f */
    public final void m102735f(long j7, boolean z4) throws Throwable {
        Throwable th3;
        C23534w0 c23534w0 = this.f136212a;
        synchronized (this) {
            try {
                try {
                    int i13 = this.f136227p;
                    long jM102734e = -1;
                    if (i13 != 0) {
                        long[] jArr = this.f136225n;
                        int i14 = this.f136229r;
                        if (j7 >= jArr[i14]) {
                            if (z4) {
                                try {
                                    int i15 = this.f136230s;
                                    if (i15 != i13) {
                                        i13 = i15 + 1;
                                    }
                                } catch (Throwable th4) {
                                    th3 = th4;
                                    throw th3;
                                }
                            }
                            int iM102738i = m102738i(i14, i13, j7, false);
                            if (iM102738i != -1) {
                                jM102734e = m102734e(iM102738i);
                            }
                        }
                    }
                    c23534w0.m68118c(jM102734e);
                } catch (Throwable th5) {
                    th = th5;
                    th3 = th;
                    throw th3;
                }
            } catch (Throwable th6) {
                th = th6;
                th3 = th;
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m102736g() {
        long jM102734e;
        C23534w0 c23534w0 = this.f136212a;
        synchronized (this) {
            int i13 = this.f136227p;
            jM102734e = i13 == 0 ? -1L : m102734e(i13);
        }
        c23534w0.m68118c(jM102734e);
    }

    /* JADX INFO: renamed from: h */
    public final long m102737h(int i13) {
        int i14 = this.f136228q;
        int i15 = this.f136227p;
        int i16 = (i14 + i15) - i13;
        boolean z4 = false;
        AbstractC24543a.m71569e(i16 >= 0 && i16 <= i15 - this.f136230s);
        int i17 = this.f136227p - i16;
        this.f136227p = i17;
        this.f136233v = Math.max(this.f136232u, m102740k(i17));
        if (i16 == 0 && this.f136234w) {
            z4 = true;
        }
        this.f136234w = z4;
        C0682h0 c0682h0 = this.f136214c;
        SparseArray sparseArray = (SparseArray) c0682h0.f2433y;
        for (int size = sparseArray.size() - 1; size >= 0 && i13 < sparseArray.keyAt(size); size--) {
            ((C32710c) c0682h0.f2434z).m102661a(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        c0682h0.f2432x = sparseArray.size() > 0 ? Math.min(c0682h0.f2432x, sparseArray.size() - 1) : -1;
        int i18 = this.f136227p;
        if (i18 == 0) {
            return 0L;
        }
        int iM102742m = m102742m(i18 - 1);
        return this.f136222k[iM102742m] + ((long) this.f136223l[iM102742m]);
    }

    /* JADX INFO: renamed from: i */
    public final int m102738i(int i13, int i14, long j7, boolean z4) {
        int i15 = -1;
        for (int i16 = 0; i16 < i14; i16++) {
            long j13 = this.f136225n[i13];
            if (j13 > j7) {
                break;
            }
            if (!z4 || (this.f136224m[i13] & 1) != 0) {
                if (j13 == j7) {
                    return i16;
                }
                i15 = i16;
            }
            i13++;
            if (i13 == this.f136220i) {
                i13 = 0;
            }
        }
        return i15;
    }

    /* JADX INFO: renamed from: j */
    public C31521c0 mo102739j(C31521c0 c31521c0) {
        if (this.f136210F == 0 || c31521c0.f130081P == Long.MAX_VALUE) {
            return c31521c0;
        }
        C31518b0 c31518b0M97113a = c31521c0.m97113a();
        c31518b0M97113a.f130051o = c31521c0.f130081P + this.f136210F;
        return new C31521c0(c31518b0M97113a);
    }

    /* JADX INFO: renamed from: k */
    public final long m102740k(int i13) {
        long jMax = Long.MIN_VALUE;
        if (i13 == 0) {
            return Long.MIN_VALUE;
        }
        int iM102742m = m102742m(i13 - 1);
        for (int i14 = 0; i14 < i13; i14++) {
            jMax = Math.max(jMax, this.f136225n[iM102742m]);
            if ((this.f136224m[iM102742m] & 1) != 0) {
                return jMax;
            }
            iM102742m--;
            if (iM102742m == -1) {
                iM102742m = this.f136220i - 1;
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: l */
    public final int m102741l() {
        return this.f136228q + this.f136230s;
    }

    /* JADX INFO: renamed from: m */
    public final int m102742m(int i13) {
        int i14 = this.f136229r + i13;
        int i15 = this.f136220i;
        return i14 < i15 ? i14 : i14 - i15;
    }

    /* JADX INFO: renamed from: n */
    public final synchronized int m102743n(long j7, boolean z4) throws Throwable {
        try {
            try {
                int iM102742m = m102742m(this.f136230s);
                int i13 = this.f136230s;
                int i14 = this.f136227p;
                if (!(i13 != i14) || j7 < this.f136225n[iM102742m]) {
                    return 0;
                }
                if (j7 > this.f136233v && z4) {
                    return i14 - i13;
                }
                int iM102738i = m102738i(iM102742m, i14 - i13, j7, true);
                if (iM102738i == -1) {
                    return 0;
                }
                return iM102738i;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public final synchronized C31521c0 m102744o() {
        return this.f136236y ? null : this.f136206B;
    }

    /* JADX INFO: renamed from: p */
    public final synchronized boolean m102745p(boolean z4) {
        C31521c0 c31521c0;
        boolean z13 = false;
        if (this.f136230s != this.f136227p) {
            if (((C32750o0) this.f136214c.m1697l(m102741l())).f136193a != this.f136218g) {
                return true;
            }
            return m102746q(m102742m(this.f136230s));
        }
        if (z4 || this.f136234w || ((c31521c0 = this.f136206B) != null && c31521c0 != this.f136218g)) {
            z13 = true;
        }
        return z13;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m102746q(int i13) {
        C34249c c34249c = this.f136219h;
        if (c34249c == null || c34249c.m108301r() == 4) {
            return true;
        }
        if ((this.f136224m[i13] & 1073741824) != 0) {
            return false;
        }
        this.f136219h.getClass();
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m102747r(C31521c0 c31521c0, C38445a c38445a) {
        C31521c0 c31521c1;
        C31521c0 c31521c2 = this.f136218g;
        boolean z4 = c31521c2 == null;
        C36136c c36136c = z4 ? null : c31521c2.f130080O;
        this.f136218g = c31521c0;
        C36136c c36136c2 = c31521c0.f130080O;
        InterfaceC36141h interfaceC36141h = this.f136215d;
        if (interfaceC36141h != null) {
            int iMo114965b = interfaceC36141h.mo114965b(c31521c0);
            C31518b0 c31518b0M97113a = c31521c0.m97113a();
            c31518b0M97113a.f130036D = iMo114965b;
            c31521c1 = new C31521c0(c31518b0M97113a);
        } else {
            c31521c1 = c31521c0;
        }
        c38445a.f164637y = c31521c1;
        c38445a.f164636x = this.f136219h;
        if (interfaceC36141h == null) {
            return;
        }
        if (z4 || !AbstractC24567y.m71670a(c36136c, c36136c2)) {
            C34249c c34249c = this.f136219h;
            C32770z c32770z = this.f136216e;
            C34249c c34249cMo114964a = interfaceC36141h.mo114964a(c32770z, c31521c0);
            this.f136219h = c34249cMo114964a;
            c38445a.f164636x = c34249cMo114964a;
            if (c34249c != null) {
                c34249c.m108304u(c32770z);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final synchronized int m102748s() {
        try {
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f136230s != this.f136227p ? this.f136221j[m102742m(this.f136230s)] : this.f136207C;
    }

    /* JADX INFO: renamed from: t */
    public final int m102749t(C38445a c38445a, C35073c c35073c, int i13, boolean z4) {
        int i14;
        boolean z13 = (i13 & 2) != 0;
        C13322b c13322b = this.f136213b;
        synchronized (this) {
            try {
                c35073c.f148796E = false;
                i14 = -3;
                if (this.f136230s != this.f136227p) {
                    C31521c0 c31521c0 = ((C32750o0) this.f136214c.m1697l(m102741l())).f136193a;
                    if (z13 || c31521c0 != this.f136218g) {
                        m102747r(c31521c0, c38445a);
                        i14 = -5;
                    } else {
                        int iM102742m = m102742m(this.f136230s);
                        if (m102746q(iM102742m)) {
                            c35073c.f2052x = this.f136224m[iM102742m];
                            long j7 = this.f136225n[iM102742m];
                            c35073c.f148797F = j7;
                            if (j7 < this.f136231t) {
                                c35073c.m1495a(Integer.MIN_VALUE);
                            }
                            c13322b.f46158a = this.f136223l[iM102742m];
                            c13322b.f46159b = this.f136222k[iM102742m];
                            c13322b.f46160c = this.f136226o[iM102742m];
                            i14 = -4;
                        } else {
                            c35073c.f148796E = true;
                        }
                    }
                } else if (z4 || this.f136234w) {
                    c35073c.f2052x = 4;
                    i14 = -4;
                } else {
                    C31521c0 c31521c1 = this.f136206B;
                    if (c31521c1 != null && (z13 || c31521c1 != this.f136218g)) {
                        m102747r(c31521c1, c38445a);
                        i14 = -5;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (i14 == -4 && !c35073c.m1496f(4)) {
            boolean z14 = (i13 & 1) != 0;
            if ((i13 & 4) == 0) {
                if (z14) {
                    C23534w0 c23534w0 = this.f136212a;
                    C23534w0.m68115j((C0902h) c23534w0.f93194g, c35073c, this.f136213b, (C13117a) c23534w0.f93192e);
                } else {
                    C23534w0 c23534w1 = this.f136212a;
                    c23534w1.f93194g = C23534w0.m68115j((C0902h) c23534w1.f93194g, c35073c, this.f136213b, (C13117a) c23534w1.f93192e);
                }
            }
            if (!z14) {
                this.f136230s++;
            }
        }
        return i14;
    }

    /* JADX INFO: renamed from: u */
    public final void m102750u(boolean z4) {
        C23534w0 c23534w0 = this.f136212a;
        c23534w0.m68117b((C0902h) c23534w0.f93193f);
        C0902h c0902h = (C0902h) c23534w0.f93193f;
        int i13 = c23534w0.f93189b;
        AbstractC24543a.m71573i(((C22606a) c0902h.f3297z) == null);
        c0902h.f3295x = 0L;
        c0902h.f3296y = i13;
        C0902h c0902h2 = (C0902h) c23534w0.f93193f;
        c23534w0.f93194g = c0902h2;
        c23534w0.f93195h = c0902h2;
        c23534w0.f93190c = 0L;
        ((C22631o) c23534w0.f93191d).m65567b();
        this.f136227p = 0;
        this.f136228q = 0;
        this.f136229r = 0;
        this.f136230s = 0;
        this.f136235x = true;
        this.f136231t = Long.MIN_VALUE;
        this.f136232u = Long.MIN_VALUE;
        this.f136233v = Long.MIN_VALUE;
        this.f136234w = false;
        C0682h0 c0682h0 = this.f136214c;
        SparseArray sparseArray = (SparseArray) c0682h0.f2433y;
        for (int i14 = 0; i14 < sparseArray.size(); i14++) {
            ((C32710c) c0682h0.f2434z).m102661a(sparseArray.valueAt(i14));
        }
        c0682h0.f2432x = -1;
        sparseArray.clear();
        if (z4) {
            this.f136205A = null;
            this.f136206B = null;
            this.f136236y = true;
        }
    }

    /* JADX INFO: renamed from: v */
    public final synchronized boolean m102751v(long j7, boolean z4) throws Throwable {
        try {
            try {
                synchronized (this) {
                    try {
                        this.f136230s = 0;
                        C23534w0 c23534w0 = this.f136212a;
                        c23534w0.f93194g = (C0902h) c23534w0.f93193f;
                        int iM102742m = m102742m(0);
                        int i13 = this.f136230s;
                        int i14 = this.f136227p;
                        if (!(i13 != i14) || j7 < this.f136225n[iM102742m] || (j7 > this.f136233v && !z4)) {
                            return false;
                        }
                        int iM102738i = m102738i(iM102742m, i14 - i13, j7, true);
                        if (iM102738i == -1) {
                            return false;
                        }
                        this.f136231t = j7;
                        this.f136230s += iM102738i;
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    /* JADX INFO: renamed from: w */
    public final synchronized void m102752w(int i13) {
        boolean z4;
        if (i13 >= 0) {
            try {
                if (this.f136230s + i13 <= this.f136227p) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        } else {
            z4 = false;
        }
        AbstractC24543a.m71569e(z4);
        this.f136230s += i13;
    }
}
