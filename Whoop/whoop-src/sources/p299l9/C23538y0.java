package p299l9;

import ai.C0902h;
import android.util.SparseArray;
import e10.C12554k0;
import java.io.EOFException;
import java.util.Objects;
import p010a9.C0580e;
import p012ab.C0682h0;
import p122em.C13322b;
import p171g9.C15587d;
import p171g9.C15590g;
import p171g9.InterfaceC15591h;
import p213i7.C18194g;
import p284ko.C22631o;
import p398p9.C28977a;
import p499t9.C33637j0;
import p499t9.InterfaceC33639k0;
import p516u8.AbstractC34587d0;
import p516u8.C34602l;
import p516u8.C34608o;
import p516u8.C34610p;
import p516u8.InterfaceC34594h;
import p607x8.AbstractC38046a;
import p607x8.C38059n;
import qg3.C30352d;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: l9.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23538y0 implements InterfaceC33639k0 {

    /* JADX INFO: renamed from: A */
    public C34610p f93213A;

    /* JADX INFO: renamed from: B */
    public C34610p f93214B;

    /* JADX INFO: renamed from: D */
    public boolean f93216D;

    /* JADX INFO: renamed from: E */
    public long f93217E;

    /* JADX INFO: renamed from: a */
    public final C23534w0 f93218a;

    /* JADX INFO: renamed from: d */
    public final InterfaceC15591h f93221d;

    /* JADX INFO: renamed from: e */
    public final C15587d f93222e;

    /* JADX INFO: renamed from: f */
    public C23526s0 f93223f;

    /* JADX INFO: renamed from: g */
    public C34610p f93224g;

    /* JADX INFO: renamed from: h */
    public C12554k0 f93225h;

    /* JADX INFO: renamed from: p */
    public int f93233p;

    /* JADX INFO: renamed from: q */
    public int f93234q;

    /* JADX INFO: renamed from: r */
    public int f93235r;

    /* JADX INFO: renamed from: s */
    public int f93236s;

    /* JADX INFO: renamed from: w */
    public boolean f93240w;

    /* JADX INFO: renamed from: z */
    public boolean f93243z;

    /* JADX INFO: renamed from: b */
    public final C13322b f93219b = new C13322b();

    /* JADX INFO: renamed from: i */
    public int f93226i = 1000;

    /* JADX INFO: renamed from: j */
    public long[] f93227j = new long[1000];

    /* JADX INFO: renamed from: k */
    public long[] f93228k = new long[1000];

    /* JADX INFO: renamed from: n */
    public long[] f93231n = new long[1000];

    /* JADX INFO: renamed from: m */
    public int[] f93230m = new int[1000];

    /* JADX INFO: renamed from: l */
    public int[] f93229l = new int[1000];

    /* JADX INFO: renamed from: o */
    public C33637j0[] f93232o = new C33637j0[1000];

    /* JADX INFO: renamed from: c */
    public final C0682h0 f93220c = new C0682h0(new C18194g(28));

    /* JADX INFO: renamed from: t */
    public long f93237t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u */
    public long f93238u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v */
    public long f93239v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y */
    public boolean f93242y = true;

    /* JADX INFO: renamed from: x */
    public boolean f93241x = true;

    /* JADX INFO: renamed from: C */
    public boolean f93215C = true;

    public C23538y0(C22631o c22631o, InterfaceC15591h interfaceC15591h, C15587d c15587d) {
        this.f93221d = interfaceC15591h;
        this.f93222e = c15587d;
        this.f93218a = new C23534w0(c22631o, (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:10:0x002b, B:14:0x0037, B:19:0x0049, B:21:0x0062, B:25:0x007c, B:24:0x007a), top: B:35:0x002b }] */
    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: a */
    public final void mo36173a(C34610p c34610p) {
        C34610p c34610p2;
        if (this.f93217E == 0 || c34610p.f145788s == Long.MAX_VALUE) {
            c34610p2 = c34610p;
        } else {
            C34608o c34608oM109410a = c34610p.m109410a();
            c34608oM109410a.f145746r = c34610p.f145788s + this.f93217E;
            c34610p2 = new C34610p(c34608oM109410a);
        }
        boolean z4 = false;
        this.f93243z = false;
        this.f93213A = c34610p;
        synchronized (this) {
            try {
                this.f93242y = false;
                if (!Objects.equals(c34610p2, this.f93214B)) {
                    if (((SparseArray) this.f93220c.f2433y).size() == 0) {
                        this.f93214B = c34610p2;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.f93220c.f2433y;
                        if (((C23536x0) sparseArray.valueAt(sparseArray.size() - 1)).f93204a.equals(c34610p2)) {
                            SparseArray sparseArray2 = (SparseArray) this.f93220c.f2433y;
                            this.f93214B = ((C23536x0) sparseArray2.valueAt(sparseArray2.size() - 1)).f93204a;
                        } else {
                            this.f93214B = c34610p2;
                        }
                    }
                    boolean z13 = this.f93215C;
                    C34610p c34610p3 = this.f93214B;
                    this.f93215C = z13 & AbstractC34587d0.m109368a(c34610p3.f145783n, c34610p3.f145780k);
                    this.f93216D = false;
                    z4 = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C23526s0 c23526s0 = this.f93223f;
        if (c23526s0 == null || !z4) {
            return;
        }
        c23526s0.f93130Q.post(c23526s0.f93128O);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d3 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:26:0x0054, B:28:0x0058, B:32:0x006e, B:35:0x0075, B:39:0x007d, B:44:0x00b8, B:67:0x0133, B:69:0x013c, B:46:0x00d3, B:48:0x00dc, B:50:0x00e4, B:52:0x00f9, B:56:0x0102, B:57:0x0107, B:59:0x010d, B:63:0x011b, B:65:0x0120, B:66:0x0130, B:49:0x00e2), top: B:74:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00dc A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:26:0x0054, B:28:0x0058, B:32:0x006e, B:35:0x0075, B:39:0x007d, B:44:0x00b8, B:67:0x0133, B:69:0x013c, B:46:0x00d3, B:48:0x00dc, B:50:0x00e4, B:52:0x00f9, B:56:0x0102, B:57:0x0107, B:59:0x010d, B:63:0x011b, B:65:0x0120, B:66:0x0130, B:49:0x00e2), top: B:74:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:26:0x0054, B:28:0x0058, B:32:0x006e, B:35:0x0075, B:39:0x007d, B:44:0x00b8, B:67:0x0133, B:69:0x013c, B:46:0x00d3, B:48:0x00dc, B:50:0x00e4, B:52:0x00f9, B:56:0x0102, B:57:0x0107, B:59:0x010d, B:63:0x011b, B:65:0x0120, B:66:0x0130, B:49:0x00e2), top: B:74:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:26:0x0054, B:28:0x0058, B:32:0x006e, B:35:0x0075, B:39:0x007d, B:44:0x00b8, B:67:0x0133, B:69:0x013c, B:46:0x00d3, B:48:0x00dc, B:50:0x00e4, B:52:0x00f9, B:56:0x0102, B:57:0x0107, B:59:0x010d, B:63:0x011b, B:65:0x0120, B:66:0x0130, B:49:0x00e2), top: B:74:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:55:0x0101  */
    /* JADX WARN: Code duplicated, block: B:59:0x010d A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:26:0x0054, B:28:0x0058, B:32:0x006e, B:35:0x0075, B:39:0x007d, B:44:0x00b8, B:67:0x0133, B:69:0x013c, B:46:0x00d3, B:48:0x00dc, B:50:0x00e4, B:52:0x00f9, B:56:0x0102, B:57:0x0107, B:59:0x010d, B:63:0x011b, B:65:0x0120, B:66:0x0130, B:49:0x00e2), top: B:74:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0118  */
    /* JADX WARN: Code duplicated, block: B:62:0x011a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0120 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:26:0x0054, B:28:0x0058, B:32:0x006e, B:35:0x0075, B:39:0x007d, B:44:0x00b8, B:67:0x0133, B:69:0x013c, B:46:0x00d3, B:48:0x00dc, B:50:0x00e4, B:52:0x00f9, B:56:0x0102, B:57:0x0107, B:59:0x010d, B:63:0x011b, B:65:0x0120, B:66:0x0130, B:49:0x00e2), top: B:74:0x0054 }] */
    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: b */
    public final void mo36174b(long j7, int i13, int i14, int i15, C33637j0 c33637j0) {
        InterfaceC15591h interfaceC15591h;
        C15590g c15590g;
        C0682h0 c0682h0;
        int i16;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z4;
        boolean z13;
        if (this.f93243z) {
            C34610p c34610p = this.f93213A;
            AbstractC35849g.m113808j(c34610p);
            mo36173a(c34610p);
        }
        int i17 = i13 & 1;
        boolean z14 = i17 != 0;
        if (this.f93241x) {
            if (!z14) {
                return;
            } else {
                this.f93241x = false;
            }
        }
        long j13 = j7 + this.f93217E;
        if (this.f93215C) {
            if (j13 < this.f93237t) {
                return;
            }
            if (i17 == 0) {
                if (!this.f93216D) {
                    AbstractC38046a.m121826u("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f93214B);
                    this.f93216D = true;
                }
                i13 |= 1;
            }
        }
        long j14 = (this.f93218a.f93190c - ((long) i14)) - ((long) i15);
        synchronized (this) {
            try {
                int i18 = this.f93233p;
                if (i18 > 0) {
                    int iM68130m = m68130m(i18 - 1);
                    AbstractC35849g.m113802d(this.f93228k[iM68130m] + ((long) this.f93229l[iM68130m]) <= j14);
                }
                this.f93240w = (536870912 & i13) != 0;
                this.f93239v = Math.max(this.f93239v, j13);
                int iM68130m2 = m68130m(this.f93233p);
                this.f93231n[iM68130m2] = j13;
                this.f93228k[iM68130m2] = j14;
                this.f93229l[iM68130m2] = i14;
                this.f93230m[iM68130m2] = i13;
                this.f93232o[iM68130m2] = c33637j0;
                this.f93227j[iM68130m2] = 0;
                if (((SparseArray) this.f93220c.f2433y).size() == 0) {
                    C34610p c34610p2 = this.f93214B;
                    c34610p2.getClass();
                    interfaceC15591h = this.f93221d;
                    if (interfaceC15591h != null) {
                        interfaceC15591h.getClass();
                        c15590g = C15590g.f58540a;
                    } else {
                        c15590g = C15590g.f58540a;
                    }
                    c0682h0 = this.f93220c;
                    i16 = this.f93234q + this.f93233p;
                    C23536x0 c23536x0 = new C23536x0(c34610p2, c15590g);
                    sparseArray = (SparseArray) c0682h0.f2433y;
                    if (c0682h0.f2432x == -1) {
                        if (sparseArray.size() == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        AbstractC35849g.m113807i(z13);
                        c0682h0.f2432x = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i16 >= iKeyAt) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        AbstractC35849g.m113802d(z4);
                        if (iKeyAt == i16) {
                            ((C18194g) c0682h0.f2434z).accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i16, c23536x0);
                } else {
                    SparseArray sparseArray2 = (SparseArray) this.f93220c.f2433y;
                    if (!((C23536x0) sparseArray2.valueAt(sparseArray2.size() - 1)).f93204a.equals(this.f93214B)) {
                        C34610p c34610p3 = this.f93214B;
                        c34610p3.getClass();
                        interfaceC15591h = this.f93221d;
                        if (interfaceC15591h != null) {
                            interfaceC15591h.getClass();
                            c15590g = C15590g.f58540a;
                        } else {
                            c15590g = C15590g.f58540a;
                        }
                        c0682h0 = this.f93220c;
                        i16 = this.f93234q + this.f93233p;
                        C23536x0 c23536x1 = new C23536x0(c34610p3, c15590g);
                        sparseArray = (SparseArray) c0682h0.f2433y;
                        if (c0682h0.f2432x == -1) {
                            if (sparseArray.size() == 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            AbstractC35849g.m113807i(z13);
                            c0682h0.f2432x = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i16 >= iKeyAt) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            AbstractC35849g.m113802d(z4);
                            if (iKeyAt == i16) {
                                ((C18194g) c0682h0.f2434z).accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i16, c23536x1);
                    }
                }
                int i19 = this.f93233p + 1;
                this.f93233p = i19;
                int i24 = this.f93226i;
                if (i19 == i24) {
                    int i25 = i24 + 1000;
                    long[] jArr = new long[i25];
                    long[] jArr2 = new long[i25];
                    long[] jArr3 = new long[i25];
                    int[] iArr = new int[i25];
                    int[] iArr2 = new int[i25];
                    C33637j0[] c33637j0Arr = new C33637j0[i25];
                    int i26 = this.f93235r;
                    int i27 = i24 - i26;
                    System.arraycopy(this.f93228k, i26, jArr2, 0, i27);
                    System.arraycopy(this.f93231n, this.f93235r, jArr3, 0, i27);
                    System.arraycopy(this.f93230m, this.f93235r, iArr, 0, i27);
                    System.arraycopy(this.f93229l, this.f93235r, iArr2, 0, i27);
                    System.arraycopy(this.f93232o, this.f93235r, c33637j0Arr, 0, i27);
                    System.arraycopy(this.f93227j, this.f93235r, jArr, 0, i27);
                    int i28 = this.f93235r;
                    System.arraycopy(this.f93228k, 0, jArr2, i27, i28);
                    System.arraycopy(this.f93231n, 0, jArr3, i27, i28);
                    System.arraycopy(this.f93230m, 0, iArr, i27, i28);
                    System.arraycopy(this.f93229l, 0, iArr2, i27, i28);
                    System.arraycopy(this.f93232o, 0, c33637j0Arr, i27, i28);
                    System.arraycopy(this.f93227j, 0, jArr, i27, i28);
                    this.f93228k = jArr2;
                    this.f93231n = jArr3;
                    this.f93230m = iArr;
                    this.f93229l = iArr2;
                    this.f93232o = c33637j0Arr;
                    this.f93227j = jArr;
                    this.f93235r = 0;
                    this.f93226i = i25;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: c */
    public final int mo36175c(InterfaceC34594h interfaceC34594h, int i13, boolean z4) throws EOFException {
        C23534w0 c23534w0 = this.f93218a;
        int iM68119d = c23534w0.m68119d(i13);
        C0902h c0902h = (C0902h) c23534w0.f93195h;
        C28977a c28977a = (C28977a) c0902h.f3297z;
        int i14 = interfaceC34594h.read(c28977a.f117213a, ((int) (c23534w0.f93190c - c0902h.f3295x)) + c28977a.f117214b, iM68119d);
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

    @Override // p499t9.InterfaceC33639k0
    /* JADX INFO: renamed from: d */
    public final void mo36176d(C38059n c38059n, int i13, int i14) {
        while (true) {
            C23534w0 c23534w0 = this.f93218a;
            if (i13 <= 0) {
                c23534w0.getClass();
                return;
            }
            int iM68119d = c23534w0.m68119d(i13);
            C0902h c0902h = (C0902h) c23534w0.f93195h;
            C28977a c28977a = (C28977a) c0902h.f3297z;
            c38059n.m121852e(c28977a.f117213a, ((int) (c23534w0.f93190c - c0902h.f3295x)) + c28977a.f117214b, iM68119d);
            i13 -= iM68119d;
            long j7 = c23534w0.f93190c + ((long) iM68119d);
            c23534w0.f93190c = j7;
            C0902h c0902h2 = (C0902h) c23534w0.f93195h;
            if (j7 == c0902h2.f3296y) {
                c23534w0.f93195h = (C0902h) c0902h2.f3293E;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final long m68122e(int i13) {
        this.f93238u = Math.max(this.f93238u, m68128k(i13));
        this.f93233p -= i13;
        int i14 = this.f93234q + i13;
        this.f93234q = i14;
        int i15 = this.f93235r + i13;
        this.f93235r = i15;
        int i16 = this.f93226i;
        if (i15 >= i16) {
            this.f93235r = i15 - i16;
        }
        int i17 = this.f93236s - i13;
        this.f93236s = i17;
        int i18 = 0;
        if (i17 < 0) {
            this.f93236s = 0;
        }
        C0682h0 c0682h0 = this.f93220c;
        SparseArray sparseArray = (SparseArray) c0682h0.f2433y;
        while (i18 < sparseArray.size() - 1) {
            int i19 = i18 + 1;
            if (i14 < sparseArray.keyAt(i19)) {
                break;
            }
            ((C18194g) c0682h0.f2434z).accept(sparseArray.valueAt(i18));
            sparseArray.removeAt(i18);
            int i24 = c0682h0.f2432x;
            if (i24 > 0) {
                c0682h0.f2432x = i24 - 1;
            }
            i18 = i19;
        }
        if (this.f93233p != 0) {
            return this.f93228k[this.f93235r];
        }
        int i25 = this.f93235r;
        if (i25 == 0) {
            i25 = this.f93226i;
        }
        int i26 = i25 - 1;
        return this.f93228k[i26] + ((long) this.f93229l[i26]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    /* JADX INFO: renamed from: f */
    public final void m68123f(long j7, boolean z4) throws Throwable {
        Throwable th3;
        C23534w0 c23534w0 = this.f93218a;
        synchronized (this) {
            try {
                try {
                    int i13 = this.f93233p;
                    long jM68122e = -1;
                    if (i13 != 0) {
                        long[] jArr = this.f93231n;
                        int i14 = this.f93235r;
                        if (j7 >= jArr[i14]) {
                            if (z4) {
                                try {
                                    int i15 = this.f93236s;
                                    if (i15 != i13) {
                                        i13 = i15 + 1;
                                    }
                                } catch (Throwable th4) {
                                    th3 = th4;
                                    throw th3;
                                }
                            }
                            int iM68127j = m68127j(i14, i13, j7, false);
                            if (iM68127j != -1) {
                                jM68122e = m68122e(iM68127j);
                            }
                        }
                    }
                    c23534w0.m68118c(jM68122e);
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
    public final void m68124g() {
        long jM68122e;
        C23534w0 c23534w0 = this.f93218a;
        synchronized (this) {
            int i13 = this.f93233p;
            jM68122e = i13 == 0 ? -1L : m68122e(i13);
        }
        c23534w0.m68118c(jM68122e);
    }

    /* JADX INFO: renamed from: h */
    public final void m68125h(long j7) {
        long jMax;
        if (this.f93233p == 0) {
            return;
        }
        synchronized (this) {
            jMax = Math.max(this.f93238u, m68128k(this.f93236s));
        }
        AbstractC35849g.m113802d(j7 > jMax);
        int i13 = this.f93233p;
        int iM68130m = m68130m(i13 - 1);
        while (i13 > this.f93236s && this.f93231n[iM68130m] >= j7) {
            i13--;
            iM68130m--;
            if (iM68130m == -1) {
                iM68130m = this.f93226i - 1;
            }
        }
        m68126i(this.f93234q + i13);
    }

    /* JADX INFO: renamed from: i */
    public final void m68126i(int i13) {
        long j7;
        int i14 = this.f93234q;
        int i15 = this.f93233p;
        int i16 = (i14 + i15) - i13;
        boolean z4 = false;
        AbstractC35849g.m113802d(i16 >= 0 && i16 <= i15 - this.f93236s);
        int i17 = this.f93233p - i16;
        this.f93233p = i17;
        this.f93239v = Math.max(this.f93238u, m68128k(i17));
        if (i16 == 0 && this.f93240w) {
            z4 = true;
        }
        this.f93240w = z4;
        C0682h0 c0682h0 = this.f93220c;
        SparseArray sparseArray = (SparseArray) c0682h0.f2433y;
        for (int size = sparseArray.size() - 1; size >= 0 && i13 < sparseArray.keyAt(size); size--) {
            ((C18194g) c0682h0.f2434z).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        c0682h0.f2432x = sparseArray.size() > 0 ? Math.min(c0682h0.f2432x, sparseArray.size() - 1) : -1;
        int i18 = this.f93233p;
        if (i18 != 0) {
            int iM68130m = m68130m(i18 - 1);
            j7 = this.f93228k[iM68130m] + ((long) this.f93229l[iM68130m]);
        } else {
            j7 = 0;
        }
        C23534w0 c23534w0 = this.f93218a;
        int i19 = c23534w0.f93189b;
        AbstractC35849g.m113802d(j7 <= c23534w0.f93190c);
        c23534w0.f93190c = j7;
        if (j7 != 0) {
            C0902h c0902h = (C0902h) c23534w0.f93193f;
            if (j7 != c0902h.f3295x) {
                while (c23534w0.f93190c > c0902h.f3296y) {
                    c0902h = (C0902h) c0902h.f3293E;
                }
                C0902h c0902h2 = (C0902h) c0902h.f3293E;
                c0902h2.getClass();
                c23534w0.m68116a(c0902h2);
                C0902h c0902h3 = new C0902h(i19, c0902h.f3296y, 6);
                c0902h.f3293E = c0902h3;
                if (c23534w0.f93190c == c0902h.f3296y) {
                    c0902h = c0902h3;
                }
                c23534w0.f93195h = c0902h;
                if (((C0902h) c23534w0.f93194g) == c0902h2) {
                    c23534w0.f93194g = c0902h3;
                    return;
                }
                return;
            }
        }
        c23534w0.m68116a((C0902h) c23534w0.f93193f);
        C0902h c0902h4 = new C0902h(i19, c23534w0.f93190c, 6);
        c23534w0.f93193f = c0902h4;
        c23534w0.f93194g = c0902h4;
        c23534w0.f93195h = c0902h4;
    }

    /* JADX INFO: renamed from: j */
    public final int m68127j(int i13, int i14, long j7, boolean z4) {
        int i15 = -1;
        for (int i16 = 0; i16 < i14; i16++) {
            long j13 = this.f93231n[i13];
            if (j13 > j7) {
                break;
            }
            if (!z4 || (this.f93230m[i13] & 1) != 0) {
                if (j13 == j7) {
                    return i16;
                }
                i15 = i16;
            }
            i13++;
            if (i13 == this.f93226i) {
                i13 = 0;
            }
        }
        return i15;
    }

    /* JADX INFO: renamed from: k */
    public final long m68128k(int i13) {
        long jMax = Long.MIN_VALUE;
        if (i13 == 0) {
            return Long.MIN_VALUE;
        }
        int iM68130m = m68130m(i13 - 1);
        for (int i14 = 0; i14 < i13; i14++) {
            jMax = Math.max(jMax, this.f93231n[iM68130m]);
            if ((this.f93230m[iM68130m] & 1) != 0) {
                return jMax;
            }
            iM68130m--;
            if (iM68130m == -1) {
                iM68130m = this.f93226i - 1;
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: l */
    public final int m68129l() {
        return this.f93234q + this.f93236s;
    }

    /* JADX INFO: renamed from: m */
    public final int m68130m(int i13) {
        int i14 = this.f93235r + i13;
        int i15 = this.f93226i;
        return i14 < i15 ? i14 : i14 - i15;
    }

    /* JADX INFO: renamed from: n */
    public final synchronized int m68131n(long j7, boolean z4) {
        try {
            try {
                int iM68130m = m68130m(this.f93236s);
                int i13 = this.f93236s;
                int i14 = this.f93233p;
                if (!(i13 != i14) || j7 < this.f93231n[iM68130m]) {
                    return 0;
                }
                if (j7 > this.f93239v && z4) {
                    return i14 - i13;
                }
                int iM68127j = m68127j(iM68130m, i14 - i13, j7, true);
                if (iM68127j == -1) {
                    return 0;
                }
                return iM68127j;
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
    public final synchronized boolean m68132o(boolean z4) {
        C34610p c34610p;
        boolean z13 = false;
        if (this.f93236s != this.f93233p) {
            if (((C23536x0) this.f93220c.m1697l(m68129l())).f93204a != this.f93224g) {
                return true;
            }
            return m68133p(m68130m(this.f93236s));
        }
        if (z4 || this.f93240w || ((c34610p = this.f93214B) != null && c34610p != this.f93224g)) {
            z13 = true;
        }
        return z13;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m68133p(int i13) {
        C12554k0 c12554k0 = this.f93225h;
        if (c12554k0 == null || c12554k0.m35220G() == 4) {
            return true;
        }
        if ((this.f93230m[i13] & 1073741824) != 0) {
            return false;
        }
        this.f93225h.getClass();
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m68134q(C34610p c34610p, C30352d c30352d) {
        C34610p c34610p2;
        C34610p c34610p3 = this.f93224g;
        boolean z4 = c34610p3 == null;
        C34602l c34602l = c34610p3 == null ? null : c34610p3.f145787r;
        this.f93224g = c34610p;
        C34602l c34602l2 = c34610p.f145787r;
        InterfaceC15591h interfaceC15591h = this.f93221d;
        if (interfaceC15591h != null) {
            int iMo43889a = interfaceC15591h.mo43889a(c34610p);
            C34608o c34608oM109410a = c34610p.m109410a();
            c34608oM109410a.f145728L = iMo43889a;
            c34610p2 = new C34610p(c34608oM109410a);
        } else {
            c34610p2 = c34610p;
        }
        c30352d.f124536y = c34610p2;
        c30352d.f124535x = this.f93225h;
        if (interfaceC15591h == null) {
            return;
        }
        if (z4 || !Objects.equals(c34602l, c34602l2)) {
            C12554k0 c12554k0 = this.f93225h;
            C15587d c15587d = this.f93222e;
            C12554k0 c12554k0Mo43891c = interfaceC15591h.mo43891c(c15587d, c34610p);
            this.f93225h = c12554k0Mo43891c;
            c30352d.f124535x = c12554k0Mo43891c;
            if (c12554k0 != null) {
                c12554k0.m35222K(c15587d);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m68135r(C30352d c30352d, C0580e c0580e, int i13, boolean z4) {
        int i14;
        boolean z13 = (i13 & 2) != 0;
        C13322b c13322b = this.f93219b;
        synchronized (this) {
            try {
                c0580e.f2064F = false;
                i14 = -3;
                if (this.f93236s != this.f93233p) {
                    C34610p c34610p = ((C23536x0) this.f93220c.m1697l(m68129l())).f93204a;
                    if (z13 || c34610p != this.f93224g) {
                        m68134q(c34610p, c30352d);
                        i14 = -5;
                    } else {
                        int iM68130m = m68130m(this.f93236s);
                        if (m68133p(iM68130m)) {
                            c0580e.f2052x = this.f93230m[iM68130m];
                            if (this.f93236s == this.f93233p - 1 && (z4 || this.f93240w)) {
                                c0580e.m1495a(536870912);
                            }
                            c0580e.f2065G = this.f93231n[iM68130m];
                            c13322b.f46158a = this.f93229l[iM68130m];
                            c13322b.f46159b = this.f93228k[iM68130m];
                            c13322b.f46160c = this.f93232o[iM68130m];
                            i14 = -4;
                        } else {
                            c0580e.f2064F = true;
                        }
                    }
                } else if (z4 || this.f93240w) {
                    c0580e.f2052x = 4;
                    c0580e.f2065G = Long.MIN_VALUE;
                    i14 = -4;
                } else {
                    C34610p c34610p2 = this.f93214B;
                    if (c34610p2 != null && (z13 || c34610p2 != this.f93224g)) {
                        m68134q(c34610p2, c30352d);
                        i14 = -5;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (i14 == -4 && !c0580e.m1496f(4)) {
            boolean z14 = (i13 & 1) != 0;
            if ((i13 & 4) == 0) {
                if (z14) {
                    C23534w0 c23534w0 = this.f93218a;
                    C23534w0.m68114i((C0902h) c23534w0.f93194g, c0580e, this.f93219b, (C38059n) c23534w0.f93192e);
                } else {
                    C23534w0 c23534w1 = this.f93218a;
                    c23534w1.f93194g = C23534w0.m68114i((C0902h) c23534w1.f93194g, c0580e, this.f93219b, (C38059n) c23534w1.f93192e);
                }
            }
            if (!z14) {
                this.f93236s++;
            }
        }
        return i14;
    }

    /* JADX INFO: renamed from: s */
    public final void m68136s(boolean z4) {
        C23534w0 c23534w0 = this.f93218a;
        c23534w0.m68116a((C0902h) c23534w0.f93193f);
        C0902h c0902h = (C0902h) c23534w0.f93193f;
        int i13 = c23534w0.f93189b;
        AbstractC35849g.m113807i(((C28977a) c0902h.f3297z) == null);
        c0902h.f3295x = 0L;
        c0902h.f3296y = i13;
        C0902h c0902h2 = (C0902h) c23534w0.f93193f;
        c23534w0.f93194g = c0902h2;
        c23534w0.f93195h = c0902h2;
        c23534w0.f93190c = 0L;
        ((C22631o) c23534w0.f93191d).m65567b();
        this.f93233p = 0;
        this.f93234q = 0;
        this.f93235r = 0;
        this.f93236s = 0;
        this.f93241x = true;
        this.f93237t = Long.MIN_VALUE;
        this.f93238u = Long.MIN_VALUE;
        this.f93239v = Long.MIN_VALUE;
        this.f93240w = false;
        C0682h0 c0682h0 = this.f93220c;
        SparseArray sparseArray = (SparseArray) c0682h0.f2433y;
        for (int i14 = 0; i14 < sparseArray.size(); i14++) {
            ((C18194g) c0682h0.f2434z).accept(sparseArray.valueAt(i14));
        }
        c0682h0.f2432x = -1;
        sparseArray.clear();
        if (z4) {
            this.f93213A = null;
            this.f93214B = null;
            this.f93242y = true;
            this.f93215C = true;
        }
    }

    /* JADX INFO: renamed from: t */
    public final synchronized boolean m68137t(int i13) {
        synchronized (this) {
            this.f93236s = 0;
            C23534w0 c23534w0 = this.f93218a;
            c23534w0.f93194g = (C0902h) c23534w0.f93193f;
        }
        int i14 = this.f93234q;
        if (i13 >= i14 && i13 <= this.f93233p + i14) {
            this.f93237t = Long.MIN_VALUE;
            this.f93236s = i13 - i14;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final synchronized boolean m68138u(long j7, boolean z4) throws Throwable {
        Throwable th3;
        C23538y0 c23538y0;
        long j13;
        int iM68127j;
        try {
            synchronized (this) {
                try {
                    try {
                        this.f93236s = 0;
                        C23534w0 c23534w0 = this.f93218a;
                        c23534w0.f93194g = (C0902h) c23534w0.f93193f;
                        int iM68130m = m68130m(0);
                        int i13 = this.f93236s;
                        int i14 = this.f93233p;
                        if (!(i13 != i14) || j7 < this.f93231n[iM68130m] || (j7 > this.f93239v && !z4)) {
                            return false;
                        }
                        if (this.f93215C) {
                            iM68127j = i14 - i13;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= iM68127j) {
                                    if (!z4) {
                                        iM68127j = -1;
                                        break;
                                    }
                                    break;
                                }
                                try {
                                    if (this.f93231n[iM68130m] >= j7) {
                                        iM68127j = i15;
                                        break;
                                    }
                                    iM68130m++;
                                    if (iM68130m == this.f93226i) {
                                        iM68130m = 0;
                                    }
                                    i15++;
                                } catch (Throwable th4) {
                                    th3 = th4;
                                }
                            }
                            c23538y0 = this;
                            j13 = j7;
                        } else {
                            c23538y0 = this;
                            j13 = j7;
                            iM68127j = c23538y0.m68127j(iM68130m, i14 - i13, j13, true);
                        }
                        if (iM68127j == -1) {
                            return false;
                        }
                        c23538y0.f93237t = j13;
                        c23538y0.f93236s += iM68127j;
                        return true;
                    } catch (Throwable th5) {
                        th = th5;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    th3 = th;
                }
                th3 = th;
                throw th3;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    /* JADX INFO: renamed from: v */
    public final synchronized void m68139v(int i13) {
        boolean z4;
        if (i13 >= 0) {
            try {
                if (this.f93236s + i13 <= this.f93233p) {
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
        AbstractC35849g.m113802d(z4);
        this.f93236s += i13;
    }
}
