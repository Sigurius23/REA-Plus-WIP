package p151fn;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import ed3.C13117a;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p309lo.AbstractC24543a;
import p309lo.C24566x;
import p499t9.C33623c0;
import p499t9.C33624d;
import p499t9.C33650s;
import p550vd.AbstractC35902e;
import p588wm.C37359a;
import p588wm.C37364f;
import p588wm.C37370l;
import p588wm.InterfaceC37367i;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;
import qg3.C30352d;

/* JADX INFO: renamed from: fn.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C14636x implements InterfaceC37367i {

    /* JADX INFO: renamed from: a */
    public final int f54027a;

    /* JADX INFO: renamed from: b */
    public final List f54028b;

    /* JADX INFO: renamed from: c */
    public final C13117a f54029c;

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f54030d;

    /* JADX INFO: renamed from: e */
    public final C14618f f54031e;

    /* JADX INFO: renamed from: f */
    public final SparseArray f54032f;

    /* JADX INFO: renamed from: g */
    public final SparseBooleanArray f54033g;

    /* JADX INFO: renamed from: h */
    public final SparseBooleanArray f54034h;

    /* JADX INFO: renamed from: i */
    public final C14630r f54035i;

    /* JADX INFO: renamed from: j */
    public C14629q f54036j;

    /* JADX INFO: renamed from: k */
    public InterfaceC37369k f54037k;

    /* JADX INFO: renamed from: l */
    public int f54038l;

    /* JADX INFO: renamed from: m */
    public boolean f54039m;

    /* JADX INFO: renamed from: n */
    public boolean f54040n;

    /* JADX INFO: renamed from: o */
    public boolean f54041o;

    /* JADX INFO: renamed from: p */
    public InterfaceC14638z f54042p;

    /* JADX INFO: renamed from: q */
    public int f54043q;

    /* JADX INFO: renamed from: r */
    public int f54044r;

    public C14636x(int i13, C24566x c24566x, C14618f c14618f) {
        this.f54031e = c14618f;
        this.f54027a = i13;
        if (i13 == 1 || i13 == 2) {
            this.f54028b = Collections.singletonList(c24566x);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f54028b = arrayList;
            arrayList.add(c24566x);
        }
        this.f54029c = new C13117a(new byte[9400], 0, 1, false);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f54033g = sparseBooleanArray;
        this.f54034h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f54032f = sparseArray;
        this.f54030d = new SparseIntArray();
        this.f54035i = new C14630r(1);
        this.f54037k = InterfaceC37369k.f159856D;
        this.f54044r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i14 = 0; i14 < size; i14++) {
            sparseArray.put(sparseArray2.keyAt(i14), (InterfaceC14638z) sparseArray2.valueAt(i14));
        }
        sparseArray.put(0, new C14634v(new C30352d(this)));
        this.f54042p = null;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: b */
    public final void mo3071b(long j7, long j13) {
        C14629q c14629q;
        long j14;
        SparseArray sparseArray = this.f54032f;
        List list = this.f54028b;
        AbstractC24543a.m71573i(this.f54027a != 2);
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            C24566x c24566x = (C24566x) list.get(i13);
            synchronized (c24566x) {
                j14 = c24566x.f95872b;
            }
            boolean z4 = j14 == -9223372036854775807L;
            if (!z4) {
                long jM71661c = c24566x.m71661c();
                z4 = (jM71661c == -9223372036854775807L || jM71661c == 0 || jM71661c == j13) ? false : true;
            }
            if (z4) {
                c24566x.m71662d(j13);
            }
        }
        if (j13 != 0 && (c14629q = this.f54036j) != null) {
            c14629q.m106253e(j13);
        }
        this.f54029c.m36686H(0);
        this.f54030d.clear();
        for (int i14 = 0; i14 < sparseArray.size(); i14++) {
            ((InterfaceC14638z) sparseArray.valueAt(i14)).mo41824a();
        }
        this.f54043q = 0;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: g */
    public final boolean mo3073g(InterfaceC37368j interfaceC37368j) throws EOFException, InterruptedIOException {
        byte[] bArr = this.f54029c.f45381a;
        C37364f c37364f = (C37364f) interfaceC37368j;
        c37364f.mo3092c(bArr, 0, 940, false);
        for (int i13 = 0; i13 < 188; i13++) {
            int i14 = 0;
            while (true) {
                if (i14 >= 5) {
                    c37364f.mo3100n(i13);
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

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: h */
    public final void mo3074h(InterfaceC37369k interfaceC37369k) {
        this.f54037k = interfaceC37369k;
    }

    /* JADX WARN: Failed to calculate best type for var: r27v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 'this'  ??, new type: fn.x
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r27v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 'this'  ??, new type: fn.x
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r27v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 'this'  ??, new type: fn.x
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r27v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 'this'  ??, new type: fn.x
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r27v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 'this'  ??, new type: fn.x
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:820)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r27v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 'this'  ??, new type: fn.x
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r27v0, types: [fn.x] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [fn.z] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: i */
    public final int mo3075i(InterfaceC37368j interfaceC37368j, C33650s c33650s) throws ParserException, EOFException, InterruptedIOException {
        InterfaceC37368j interfaceC37368j2;
        int i13;
        int i14;
        ?? r10;
        int i15;
        InterfaceC14638z interfaceC14638z;
        boolean z4;
        long j7 = ((C37364f) interfaceC37368j).f159851y;
        boolean z13 = this.f54039m;
        int i16 = this.f54027a;
        if (z13) {
            long j13 = -9223372036854775807L;
            C14630r c14630r = this.f54035i;
            if (j7 != -1 && i16 != 2 && !c14630r.f53994d) {
                int i17 = this.f54044r;
                C24566x c24566x = c14630r.f53992b;
                C13117a c13117a = c14630r.f53993c;
                if (i17 <= 0) {
                    c14630r.m41831a(interfaceC37368j);
                    return 0;
                }
                if (!c14630r.f53996f) {
                    C37364f c37364f = (C37364f) interfaceC37368j;
                    long j14 = c37364f.f159851y;
                    int iMin = (int) Math.min(112800, j14);
                    long j15 = j14 - ((long) iMin);
                    if (c37364f.f159852z != j15) {
                        c33650s.f140436a = j15;
                        return 1;
                    }
                    c13117a.m36686H(iMin);
                    c37364f.f159847F = 0;
                    c37364f.mo3092c(c13117a.f45381a, 0, iMin, false);
                    int i18 = c13117a.f45382b;
                    int i19 = c13117a.f45383c;
                    for (int i24 = i19 - 188; i24 >= i18; i24--) {
                        byte[] bArr = c13117a.f45381a;
                        int i25 = 0;
                        for (int i26 = -4; i26 <= 4; i26++) {
                            int i27 = (i26 * 188) + i24;
                            if (i27 >= i18 && i27 < i19 && bArr[i27] == 71) {
                                i25++;
                                if (i25 == 5) {
                                    long jM113943N = AbstractC35902e.m113943N(c13117a, i24, i17);
                                    if (jM113943N == -9223372036854775807L) {
                                        break;
                                    }
                                    j13 = jM113943N;
                                    break;
                                }
                            } else {
                                i25 = 0;
                            }
                        }
                    }
                    c14630r.f53998h = j13;
                    c14630r.f53996f = true;
                    return 0;
                }
                if (c14630r.f53998h == -9223372036854775807L) {
                    c14630r.m41831a(interfaceC37368j);
                    return 0;
                }
                if (c14630r.f53995e) {
                    long j16 = c14630r.f53997g;
                    if (j16 == -9223372036854775807L) {
                        c14630r.m41831a(interfaceC37368j);
                        return 0;
                    }
                    long jM71660b = c24566x.m71660b(c14630r.f53998h) - c24566x.m71660b(j16);
                    c14630r.f53999i = jM71660b;
                    if (jM71660b < 0) {
                        StringBuilder sb4 = new StringBuilder(65);
                        sb4.append("Invalid duration: ");
                        sb4.append(jM71660b);
                        sb4.append(". Using TIME_UNSET instead.");
                        Log.w("TsDurationReader", sb4.toString());
                        c14630r.f53999i = -9223372036854775807L;
                    }
                    c14630r.m41831a(interfaceC37368j);
                    return 0;
                }
                C37364f c37364f2 = (C37364f) interfaceC37368j;
                int iMin2 = (int) Math.min(112800, c37364f2.f159851y);
                long j17 = 0;
                if (c37364f2.f159852z != j17) {
                    c33650s.f140436a = j17;
                    return 1;
                }
                c13117a.m36686H(iMin2);
                c37364f2.f159847F = 0;
                c37364f2.mo3092c(c13117a.f45381a, 0, iMin2, false);
                int i28 = c13117a.f45383c;
                for (int i29 = c13117a.f45382b; i29 < i28; i29++) {
                    if (c13117a.f45381a[i29] == 71) {
                        long jM113943N2 = AbstractC35902e.m113943N(c13117a, i29, i17);
                        if (jM113943N2 != -9223372036854775807L) {
                            j13 = jM113943N2;
                            break;
                        }
                    }
                }
                c14630r.f53997g = j13;
                c14630r.f53995e = true;
                return 0;
            }
            if (this.f54040n) {
                i13 = i16;
                z4 = false;
                j7 = j7;
                i14 = 1;
            } else {
                this.f54040n = true;
                long j18 = c14630r.f53999i;
                if (j18 != -9223372036854775807L) {
                    j7 = j7;
                    i13 = i16;
                    i14 = 1;
                    z4 = false;
                    C14629q c14629q = new C14629q(new C33623c0(), new C14635w(this.f54044r, c14630r.f53992b), j18, 1 + j18, 0L, j7, 188L, 940);
                    this.f54036j = c14629q;
                    this.f54037k.mo3111x((C37359a) c14629q.f140382c);
                } else {
                    i13 = i16;
                    j7 = j7;
                    i14 = 1;
                    z4 = false;
                    this.f54037k.mo3111x(new C37370l(j18));
                }
            }
            if (this.f54041o) {
                this.f54041o = z4;
                mo3071b(r20, r20);
                if (((C37364f) interfaceC37368j).f159852z != r20) {
                    c33650s.f140436a = 0;
                    return i14;
                }
            }
            C14629q c14629q2 = this.f54036j;
            if (c14629q2 != null && ((C33624d) c14629q2.f140384e) != null) {
                return c14629q2.m106252b(interfaceC37368j, c33650s);
            }
            interfaceC37368j2 = interfaceC37368j;
            r10 = z4;
        } else {
            interfaceC37368j2 = interfaceC37368j;
            i13 = i16;
            i14 = 1;
            r10 = 0;
        }
        C13117a c13117a2 = this.f54029c;
        byte[] bArr2 = c13117a2.f45381a;
        if (9400 - c13117a2.f45382b < 188) {
            int iM36692a = c13117a2.m36692a();
            if (iM36692a > 0) {
                System.arraycopy(bArr2, c13117a2.f45382b, bArr2, r10, iM36692a);
            }
            c13117a2.m36687I(iM36692a, bArr2);
        }
        while (c13117a2.m36692a() < 188) {
            int i34 = c13117a2.f45383c;
            int i35 = ((C37364f) interfaceC37368j2).read(bArr2, i34, 9400 - i34);
            if (i35 == -1) {
                return -1;
            }
            c13117a2.m36688J(i34 + i35);
        }
        int i36 = c13117a2.f45382b;
        int i37 = c13117a2.f45383c;
        byte[] bArr3 = c13117a2.f45381a;
        int i38 = i36;
        while (i38 < i37 && bArr3[i38] != 71) {
            i38++;
        }
        c13117a2.m36689K(i38);
        int i39 = i38 + 188;
        ?? r14 = 0;
        if (i39 > i37) {
            int i44 = (i38 - i36) + this.f54043q;
            this.f54043q = i44;
            i15 = i13;
            if (i15 == 2 && i44 > 376) {
                throw ParserException.m15562a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            i15 = i13;
            this.f54043q = r10;
        }
        int i45 = c13117a2.f45383c;
        if (i39 > i45) {
            return r10;
        }
        int iM36699i = c13117a2.m36699i();
        if ((8388608 & iM36699i) != 0) {
            c13117a2.m36689K(i39);
            return r10;
        }
        ?? r15 = (4194304 & iM36699i) != 0 ? i14 : r10;
        int i46 = (2096896 & iM36699i) >> 8;
        ?? r16 = (iM36699i & 32) != 0 ? i14 : r10;
        if ((iM36699i & 16) != 0) {
            interfaceC14638z = (InterfaceC14638z) this.f54032f.get(i46);
        }
        if (r14 == 0) {
            r14 = interfaceC14638z;
            c13117a2.m36689K(i39);
            return r10;
        }
        if (i15 != 2) {
            int i47 = iM36699i & 15;
            SparseIntArray sparseIntArray = this.f54030d;
            int i48 = sparseIntArray.get(i46, i47 - 1);
            sparseIntArray.put(i46, i47);
            if (i48 == i47) {
                r14 = interfaceC14638z;
                c13117a2.m36689K(i39);
                return r10;
            }
            if (i47 != ((i48 + 1) & 15)) {
                r14 = interfaceC14638z;
                r14.mo41824a();
            }
        }
        if (r16 != 0) {
            int iM36715y = c13117a2.m36715y();
            r15 = (r15 == true ? 1 : 0) | ((c13117a2.m36715y() & 64) != 0 ? 2 : r10);
            c13117a2.m36690L(iM36715y - 1);
        }
        boolean z14 = this.f54039m;
        if (i15 == 2 || z14 || !this.f54034h.get(i46, r10)) {
            c13117a2.m36688J(i39);
            r14.mo41825b(r15, c13117a2);
            c13117a2.m36688J(i45);
        }
        if (i15 != 2 && !z14 && this.f54039m && j7 != -1) {
            this.f54041o = i14;
        }
        c13117a2.m36689K(i39);
        return r10;
    }

    @Override // p588wm.InterfaceC37367i
    public final void release() {
    }
}
