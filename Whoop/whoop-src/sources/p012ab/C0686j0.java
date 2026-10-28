package p012ab;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import ng3.C26702o;
import p031b9.C2817b;
import p499t9.C33622c;
import p499t9.C33624d;
import p499t9.C33638k;
import p499t9.C33650s;
import p499t9.C33651t;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p607x8.C38059n;
import p607x8.C38064s;
import qa.InterfaceC30105j;
import qg3.C30352d;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: ab.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0686j0 implements InterfaceC33644n {

    /* JADX INFO: renamed from: a */
    public final int f2448a;

    /* JADX INFO: renamed from: b */
    public final List f2449b;

    /* JADX INFO: renamed from: c */
    public final C38059n f2450c = new C38059n(new byte[9400], 0);

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f2451d;

    /* JADX INFO: renamed from: e */
    public final C0679g f2452e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC30105j f2453f;

    /* JADX INFO: renamed from: g */
    public final SparseArray f2454g;

    /* JADX INFO: renamed from: h */
    public final SparseBooleanArray f2455h;

    /* JADX INFO: renamed from: i */
    public final SparseBooleanArray f2456i;

    /* JADX INFO: renamed from: j */
    public final C0670b0 f2457j;

    /* JADX INFO: renamed from: k */
    public C0668a0 f2458k;

    /* JADX INFO: renamed from: l */
    public InterfaceC33648q f2459l;

    /* JADX INFO: renamed from: m */
    public int f2460m;

    /* JADX INFO: renamed from: n */
    public boolean f2461n;

    /* JADX INFO: renamed from: o */
    public boolean f2462o;

    /* JADX INFO: renamed from: p */
    public boolean f2463p;

    /* JADX INFO: renamed from: q */
    public int f2464q;

    public C0686j0(int i13, InterfaceC30105j interfaceC30105j, C38064s c38064s, C0679g c0679g) {
        this.f2452e = c0679g;
        this.f2448a = i13;
        this.f2453f = interfaceC30105j;
        this.f2449b = Collections.singletonList(c38064s);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f2455h = sparseBooleanArray;
        this.f2456i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f2454g = sparseArray;
        this.f2451d = new SparseIntArray();
        this.f2457j = new C0670b0(1);
        this.f2459l = InterfaceC33648q.f140435u;
        this.f2464q = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i14 = 0; i14 < size; i14++) {
            sparseArray.put(sparseArray2.keyAt(i14), (InterfaceC0692m0) sparseArray2.valueAt(i14));
        }
        sparseArray.put(0, new C0678f0(new C30352d(this)));
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        C0668a0 c0668a0;
        long j14;
        SparseArray sparseArray = this.f2454g;
        List list = this.f2449b;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            C38064s c38064s = (C38064s) list.get(i13);
            synchronized (c38064s) {
                j14 = c38064s.f163028b;
            }
            boolean z4 = j14 == -9223372036854775807L;
            if (!z4) {
                long jM121885d = c38064s.m121885d();
                z4 = (jM121885d == -9223372036854775807L || jM121885d == 0 || jM121885d == j13) ? false : true;
            }
            if (z4) {
                c38064s.m121886e(j13);
            }
        }
        if (j13 != 0 && (c0668a0 = this.f2458k) != null) {
            c0668a0.m106253e(j13);
        }
        this.f2450c.m121843C(0);
        this.f2451d.clear();
        for (int i14 = 0; i14 < sparseArray.size(); i14++) {
            ((InterfaceC0692m0) sparseArray.valueAt(i14)).mo1669a();
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        if ((this.f2448a & 1) == 0) {
            interfaceC33648q = new C2817b(interfaceC33648q, this.f2453f);
        }
        this.f2459l = interfaceC33648q;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f2450c.f163017a;
        C33638k c33638k = (C33638k) interfaceC33646o;
        c33638k.mo3092c(bArr, 0, 940, false);
        for (int i13 = 0; i13 < 188; i13++) {
            int i14 = 0;
            while (true) {
                if (i14 >= 5) {
                    c33638k.mo3100n(i13);
                    return true;
                }
                if (bArr[(i14 * 188) + i13] != 71) {
                    break;
                }
                i14++;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [ab.m0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) {
        InterfaceC33646o interfaceC33646o2;
        int i13;
        ?? r10;
        ?? r14;
        InterfaceC0692m0 interfaceC0692m0;
        boolean z4;
        long length = interfaceC33646o.getLength();
        if (this.f2461n) {
            long j7 = -9223372036854775807L;
            C0670b0 c0670b0 = this.f2457j;
            if (length != -1 && !c0670b0.f2326d) {
                int i14 = this.f2464q;
                C38064s c38064s = c0670b0.f2324b;
                C38059n c38059n = c0670b0.f2325c;
                if (i14 <= 0) {
                    c0670b0.m1660a(interfaceC33646o);
                    return 0;
                }
                if (c0670b0.f2328f) {
                    if (c0670b0.f2330h == -9223372036854775807L) {
                        c0670b0.m1660a(interfaceC33646o);
                        return 0;
                    }
                    if (c0670b0.f2327e) {
                        long j13 = c0670b0.f2329g;
                        if (j13 == -9223372036854775807L) {
                            c0670b0.m1660a(interfaceC33646o);
                            return 0;
                        }
                        c0670b0.f2331i = c38064s.m121884c(c0670b0.f2330h) - c38064s.m121883b(j13);
                        c0670b0.m1660a(interfaceC33646o);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800, interfaceC33646o.getLength());
                    long j14 = 0;
                    if (interfaceC33646o.getPosition() != j14) {
                        c33650s.f140436a = j14;
                        return 1;
                    }
                    c38059n.m121843C(iMin);
                    interfaceC33646o.mo3093e();
                    interfaceC33646o.mo3103p(c38059n.f163017a, 0, iMin);
                    int i15 = c38059n.f163019c;
                    for (int i16 = c38059n.f163018b; i16 < i15; i16++) {
                        if (c38059n.f163017a[i16] == 71) {
                            long jM110130L = AbstractC34924m.m110130L(c38059n, i16, i14);
                            if (jM110130L != -9223372036854775807L) {
                                j7 = jM110130L;
                                break;
                            }
                        }
                    }
                    c0670b0.f2329g = j7;
                    c0670b0.f2327e = true;
                    return 0;
                }
                long length2 = interfaceC33646o.getLength();
                int iMin2 = (int) Math.min(112800, length2);
                long j15 = length2 - ((long) iMin2);
                if (interfaceC33646o.getPosition() != j15) {
                    c33650s.f140436a = j15;
                    return 1;
                }
                c38059n.m121843C(iMin2);
                interfaceC33646o.mo3093e();
                interfaceC33646o.mo3103p(c38059n.f163017a, 0, iMin2);
                int i17 = c38059n.f163018b;
                int i18 = c38059n.f163019c;
                for (int i19 = i18 - 188; i19 >= i17; i19--) {
                    byte[] bArr = c38059n.f163017a;
                    int i24 = 0;
                    for (int i25 = -4; i25 <= 4; i25++) {
                        int i26 = (i25 * 188) + i19;
                        if (i26 >= i17 && i26 < i18 && bArr[i26] == 71) {
                            i24++;
                            if (i24 == 5) {
                                long jM110130L2 = AbstractC34924m.m110130L(c38059n, i19, i14);
                                if (jM110130L2 == -9223372036854775807L) {
                                    break;
                                }
                                j7 = jM110130L2;
                                break;
                            }
                        } else {
                            i24 = 0;
                        }
                    }
                }
                c0670b0.f2330h = j7;
                c0670b0.f2328f = true;
                return 0;
            }
            if (this.f2462o) {
                i13 = 1;
                z4 = false;
            } else {
                this.f2462o = true;
                long j16 = c0670b0.f2331i;
                if (j16 != -9223372036854775807L) {
                    i13 = 1;
                    z4 = false;
                    C0668a0 c0668a0 = new C0668a0(new C26702o(29, false), new C0682h0(this.f2464q, c0670b0.f2324b), j16, 1 + j16, 0L, length, 188L, 940);
                    this.f2458k = c0668a0;
                    this.f2459l.mo3109v((C33622c) c0668a0.f140382c);
                } else {
                    z4 = false;
                    i13 = 1;
                    this.f2459l.mo3109v(new C33651t(j16));
                }
            }
            if (this.f2463p) {
                this.f2463p = z4;
                mo1540b(0L, 0L);
                if (interfaceC33646o.getPosition() != 0) {
                    c33650s.f140436a = 0L;
                    return i13;
                }
            }
            C0668a0 c0668a1 = this.f2458k;
            if (c0668a1 != null && ((C33624d) c0668a1.f140384e) != null) {
                return c0668a1.m106251a(interfaceC33646o, c33650s);
            }
            interfaceC33646o2 = interfaceC33646o;
            r10 = z4;
        } else {
            interfaceC33646o2 = interfaceC33646o;
            i13 = 1;
            r10 = 0;
        }
        C38059n c38059n2 = this.f2450c;
        byte[] bArr2 = c38059n2.f163017a;
        if (9400 - c38059n2.f163018b < 188) {
            int iM121848a = c38059n2.m121848a();
            if (iM121848a > 0) {
                System.arraycopy(bArr2, c38059n2.f163018b, bArr2, r10, iM121848a);
            }
            c38059n2.m121844D(iM121848a, bArr2);
        }
        while (true) {
            int iM121848a2 = c38059n2.m121848a();
            ?? r15 = this.f2454g;
            if (iM121848a2 >= 188) {
                int i27 = c38059n2.f163018b;
                int i28 = c38059n2.f163019c;
                byte[] bArr3 = c38059n2.f163017a;
                while (i27 < i28 && bArr3[i27] != 71) {
                    i27++;
                }
                c38059n2.m121846F(i27);
                int i29 = i27 + 188;
                int i34 = c38059n2.f163019c;
                if (i29 > i34) {
                    return r10;
                }
                int iM121854g = c38059n2.m121854g();
                if ((8388608 & iM121854g) != 0) {
                    c38059n2.m121846F(i29);
                    return r10;
                }
                ?? r16 = (4194304 & iM121854g) != 0 ? 1 : r10;
                int i35 = (2096896 & iM121854g) >> 8;
                ?? r17 = (iM121854g & 32) != 0 ? 1 : r10;
                if ((iM121854g & 16) != 0) {
                    interfaceC0692m0 = (InterfaceC0692m0) r15.get(i35);
                } else {
                    r14 = 0;
                }
                if (r14 == 0) {
                    r14 = interfaceC0692m0;
                    c38059n2.m121846F(i29);
                    return r10;
                }
                int i36 = iM121854g & 15;
                SparseIntArray sparseIntArray = this.f2451d;
                int i37 = sparseIntArray.get(i35, i36 - 1);
                sparseIntArray.put(i35, i36);
                if (i37 == i36) {
                    r14 = interfaceC0692m0;
                    c38059n2.m121846F(i29);
                    return r10;
                }
                if (i36 != ((i37 + 1) & 15)) {
                    r14 = interfaceC0692m0;
                    r14.mo1669a();
                }
                if (r17 != 0) {
                    int iM121867t = c38059n2.m121867t();
                    r16 = (r16 == true ? 1 : 0) | ((c38059n2.m121867t() & 64) != 0 ? 2 : r10);
                    c38059n2.m121847G(iM121867t - 1);
                }
                boolean z13 = this.f2461n;
                if (z13 || !this.f2456i.get(i35, r10)) {
                    c38059n2.m121845E(i29);
                    r14.mo1670b(r16, c38059n2);
                    c38059n2.m121845E(i34);
                }
                if (!z13 && this.f2461n && length != -1) {
                    this.f2463p = true;
                }
                c38059n2.m121846F(i29);
                return r10;
            }
            int i38 = c38059n2.f163019c;
            int i39 = interfaceC33646o2.read(bArr2, i38, 9400 - i38);
            if (i39 == -1) {
                for (?? r18 = r10; r18 < r15.size(); r18++) {
                    InterfaceC0692m0 interfaceC0692m1 = (InterfaceC0692m0) r15.valueAt(r18);
                    if (interfaceC0692m1 instanceof C0705z) {
                        C0705z c0705z = (C0705z) interfaceC0692m1;
                        if (c0705z.f2670c == 3 && c0705z.f2677j == -1) {
                            c0705z.mo1670b(i13, new C38059n());
                        }
                    }
                    i13 = 1;
                }
                return -1;
            }
            c38059n2.m121845E(i38 + i39);
            i13 = 1;
        }
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
    }
}
