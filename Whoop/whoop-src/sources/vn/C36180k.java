package vn;

import ai.C0904j;
import android.net.Uri;
import android.util.SparseArray;
import bb.C2919f;
import com.google.android.exoplayer2.ParserException;
import g73.C15556d;
import in.C18715c;
import io.InterfaceC20035o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import ng3.C26701n;
import p047c9.C4320k;
import p284ko.C22611c0;
import p284ko.C22631o;
import p284ko.InterfaceC22625j0;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p465rm.C31537h1;
import p508ty.C34249c;
import p550vd.AbstractC35903f;
import p556vm.InterfaceC36141h;
import p589wn.C37394b;
import p589wn.C37395c;
import p589wn.C37399g;
import p589wn.C37402j;
import p589wn.C37403k;
import p589wn.C37404l;
import p589wn.C37405m;
import p589wn.InterfaceC37409q;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p715kotlin.jvm.internal.AbstractC22674j;
import q30.C29934u0;
import r80.AbstractC31061c;
import sm.C32713f;
import sn.C32766w0;
import sn.C32768x0;
import sn.C32770z;
import sn.InterfaceC32755r;
import sn.InterfaceC32756r0;
import sn.InterfaceC32757s;
import sn.InterfaceC32758s0;
import sn.InterfaceC32760t0;

/* JADX INFO: renamed from: vn.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C36180k implements InterfaceC32757s, InterfaceC37409q, InterfaceC32758s0 {

    /* JADX INFO: renamed from: E */
    public final InterfaceC36141h f154811E;

    /* JADX INFO: renamed from: F */
    public final C32770z f154812F;

    /* JADX INFO: renamed from: G */
    public final C15556d f154813G;

    /* JADX INFO: renamed from: H */
    public final C32770z f154814H;

    /* JADX INFO: renamed from: I */
    public final C22631o f154815I;

    /* JADX INFO: renamed from: J */
    public final IdentityHashMap f154816J;

    /* JADX INFO: renamed from: K */
    public final C34249c f154817K;

    /* JADX INFO: renamed from: L */
    public final C26701n f154818L;

    /* JADX INFO: renamed from: M */
    public final boolean f154819M;

    /* JADX INFO: renamed from: N */
    public final int f154820N;

    /* JADX INFO: renamed from: O */
    public final C32713f f154821O;

    /* JADX INFO: renamed from: P */
    public InterfaceC32755r f154822P;

    /* JADX INFO: renamed from: Q */
    public int f154823Q;

    /* JADX INFO: renamed from: R */
    public C32768x0 f154824R;

    /* JADX INFO: renamed from: S */
    public C36186q[] f154825S;

    /* JADX INFO: renamed from: T */
    public C36186q[] f154826T;

    /* JADX INFO: renamed from: U */
    public int f154827U;

    /* JADX INFO: renamed from: V */
    public C29934u0 f154828V;

    /* JADX INFO: renamed from: w */
    public final InterfaceC36178i f154829w;

    /* JADX INFO: renamed from: x */
    public final C37395c f154830x;

    /* JADX INFO: renamed from: y */
    public final C34249c f154831y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC22625j0 f154832z;

    public C36180k(InterfaceC36178i interfaceC36178i, C37395c c37395c, C34249c c34249c, InterfaceC22625j0 interfaceC22625j0, InterfaceC36141h interfaceC36141h, C32770z c32770z, C15556d c15556d, C32770z c32770z2, C22631o c22631o, C26701n c26701n, boolean z4, int i13, C32713f c32713f) {
        this.f154829w = interfaceC36178i;
        this.f154830x = c37395c;
        this.f154831y = c34249c;
        this.f154832z = interfaceC22625j0;
        this.f154811E = interfaceC36141h;
        this.f154812F = c32770z;
        this.f154813G = c15556d;
        this.f154814H = c32770z2;
        this.f154815I = c22631o;
        this.f154818L = c26701n;
        this.f154819M = z4;
        this.f154820N = i13;
        this.f154821O = c32713f;
        c26701n.getClass();
        this.f154828V = new C29934u0(new InterfaceC32760t0[0], 17);
        this.f154816J = new IdentityHashMap();
        this.f154817K = new C34249c(15);
        this.f154825S = new C36186q[0];
        this.f154826T = new C36186q[0];
    }

    /* JADX INFO: renamed from: q */
    public static C31521c0 m115122q(C31521c0 c31521c0, C31521c0 c31521c1, boolean z4) {
        String strM71683n;
        C18715c c18715c;
        int i13;
        String str;
        int i14;
        int i15;
        String str2;
        if (c31521c1 != null) {
            strM71683n = c31521c1.f130074I;
            c18715c = c31521c1.f130075J;
            i14 = c31521c1.f130090Y;
            i13 = c31521c1.f130101z;
            i15 = c31521c1.f130070E;
            str = c31521c1.f130100y;
            str2 = c31521c1.f130099x;
        } else {
            strM71683n = AbstractC24567y.m71683n(1, c31521c0.f130074I);
            c18715c = c31521c0.f130075J;
            if (z4) {
                i14 = c31521c0.f130090Y;
                i13 = c31521c0.f130101z;
                i15 = c31521c0.f130070E;
                str = c31521c0.f130100y;
                str2 = c31521c0.f130099x;
            } else {
                i13 = 0;
                str = null;
                i14 = -1;
                i15 = 0;
                str2 = null;
            }
        }
        String strM71609c = AbstractC24555m.m71609c(strM71683n);
        int i16 = z4 ? c31521c0.f130071F : -1;
        int i17 = z4 ? c31521c0.f130072G : -1;
        C31518b0 c31518b0 = new C31518b0();
        c31518b0.f130037a = c31521c0.f130098w;
        c31518b0.f130038b = str2;
        c31518b0.f130046j = c31521c0.f130076K;
        c31518b0.f130047k = strM71609c;
        c31518b0.f130044h = strM71683n;
        c31518b0.f130045i = c18715c;
        c31518b0.f130042f = i16;
        c31518b0.f130043g = i17;
        c31518b0.f130060x = i14;
        c31518b0.f130040d = i13;
        c31518b0.f130041e = i15;
        c31518b0.f130039c = str;
        return new C31521c0(c31518b0);
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: a */
    public final boolean mo91531a() {
        return this.f154828V.mo91531a();
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: b */
    public final void mo102699b(InterfaceC32755r interfaceC32755r, long j7) {
        boolean z4;
        List list;
        List list2;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        Uri[] uriArr;
        this.f154822P = interfaceC32755r;
        C37395c c37395c = this.f154830x;
        c37395c.getClass();
        c37395c.f159991E.add(this);
        C37405m c37405m = c37395c.f159996J;
        c37405m.getClass();
        List list3 = c37405m.f160060g;
        List list4 = c37405m.f160058e;
        Map map = Collections.EMPTY_MAP;
        boolean zIsEmpty = list4.isEmpty();
        List list5 = c37405m.f160061h;
        int i15 = 0;
        this.f154823Q = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z15 = this.f154819M;
        if (zIsEmpty) {
            z4 = z15;
            list = list3;
            list2 = list5;
        } else {
            C31521c0 c31521c0 = c37405m.f160063j;
            int size = list4.size();
            int[] iArr = new int[size];
            int i16 = 0;
            int i17 = 0;
            while (true) {
                list2 = list5;
                if (i16 >= list4.size()) {
                    break;
                }
                C31521c0 c31521c1 = ((C37404l) list4.get(i16)).f160051b;
                int i18 = c31521c1.f130083R;
                String str = c31521c1.f130074I;
                if (i18 > 0 || AbstractC24567y.m71683n(2, str) != null) {
                    iArr[i16] = 2;
                    i17++;
                } else if (AbstractC24567y.m71683n(1, str) != null) {
                    iArr[i16] = 1;
                    i15++;
                } else {
                    iArr[i16] = -1;
                }
                i16++;
                list5 = list2;
            }
            if (i17 > 0) {
                z14 = false;
                i14 = i17;
                z13 = true;
            } else if (i15 < size) {
                z13 = false;
                i14 = size - i15;
                z14 = true;
            } else {
                z13 = false;
                i14 = size;
                z14 = false;
            }
            Uri[] uriArr2 = new Uri[i14];
            boolean z16 = z13;
            C31521c0[] c31521c0Arr = new C31521c0[i14];
            int[] iArr2 = new int[i14];
            int i19 = 0;
            int i24 = 0;
            while (i19 < list4.size()) {
                if (z16) {
                    uriArr = uriArr2;
                    if (iArr[i19] == 2) {
                    }
                    i19++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (!z14 || iArr[i19] != 1) {
                    C37404l c37404l = (C37404l) list4.get(i19);
                    uriArr[i24] = c37404l.f160050a;
                    c31521c0Arr[i24] = c37404l.f160051b;
                    iArr2[i24] = i19;
                    i24++;
                }
                i19++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = c31521c0Arr[0].f130074I;
            int iM71682m = AbstractC24567y.m71682m(2, str2);
            int iM71682m2 = AbstractC24567y.m71682m(1, str2);
            boolean z17 = iM71682m2 <= 1 && iM71682m <= 1 && iM71682m2 + iM71682m > 0;
            z4 = z15;
            list = list3;
            C36186q c36186qM115125p = m115125p("main", (z16 || iM71682m2 <= 0) ? 0 : 1, uriArr3, c31521c0Arr, c37405m.f160063j, c37405m.f160064k, map, j7);
            arrayList.add(c36186qM115125p);
            arrayList2.add(iArr2);
            if (z4 && z17) {
                ArrayList arrayList3 = new ArrayList();
                if (iM71682m > 0) {
                    C31521c0[] c31521c0Arr2 = new C31521c0[i14];
                    int i25 = 0;
                    while (i25 < i14) {
                        C31521c0 c31521c2 = c31521c0Arr[i25];
                        String strM71683n = AbstractC24567y.m71683n(2, c31521c2.f130074I);
                        String strM71609c = AbstractC24555m.m71609c(strM71683n);
                        C31518b0 c31518b0 = new C31518b0();
                        c31518b0.f130037a = c31521c2.f130098w;
                        c31518b0.f130038b = c31521c2.f130099x;
                        c31518b0.f130046j = c31521c2.f130076K;
                        c31518b0.f130047k = strM71609c;
                        c31518b0.f130044h = strM71683n;
                        c31518b0.f130045i = c31521c2.f130075J;
                        c31518b0.f130042f = c31521c2.f130071F;
                        c31518b0.f130043g = c31521c2.f130072G;
                        c31518b0.f130052p = c31521c2.f130082Q;
                        c31518b0.f130053q = c31521c2.f130083R;
                        c31518b0.f130054r = c31521c2.f130084S;
                        c31518b0.f130040d = c31521c2.f130101z;
                        c31518b0.f130041e = c31521c2.f130070E;
                        c31521c0Arr2[i25] = new C31521c0(c31518b0);
                        i25++;
                        c31521c0Arr = c31521c0Arr;
                    }
                    C31521c0[] c31521c0Arr3 = c31521c0Arr;
                    arrayList3.add(new C32766w0("main", c31521c0Arr2));
                    if (iM71682m2 > 0 && (c31521c0 != null || list.isEmpty())) {
                        arrayList3.add(new C32766w0("main".concat(":audio"), m115122q(c31521c0Arr3[0], c31521c0, false)));
                    }
                    List list6 = c37405m.f160064k;
                    if (list6 != null) {
                        for (int i26 = 0; i26 < list6.size(); i26++) {
                            arrayList3.add(new C32766w0(AbstractC31061c.m95634j(19, i26, "main:cc:"), (C31521c0) list6.get(i26)));
                        }
                    }
                } else {
                    C31521c0[] c31521c0Arr4 = new C31521c0[i14];
                    for (int i27 = 0; i27 < i14; i27++) {
                        c31521c0Arr4[i27] = m115122q(c31521c0Arr[i27], c31521c0, true);
                    }
                    arrayList3.add(new C32766w0("main", c31521c0Arr4));
                }
                String strConcat = "main".concat(":id3");
                C31518b0 c31518b1 = new C31518b0();
                c31518b1.f130037a = "ID3";
                c31518b1.f130047k = "application/id3";
                C32766w0 c32766w0 = new C32766w0(strConcat, new C31521c0(c31518b1));
                arrayList3.add(c32766w0);
                c36186qM115125p.m115138F((C32766w0[]) arrayList3.toArray(new C32766w0[0]), arrayList3.indexOf(c32766w0));
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        int i28 = 0;
        while (i28 < list.size()) {
            List list7 = list;
            String str3 = ((C37403k) list7.get(i28)).f160049c;
            if (hashSet.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z18 = true;
                for (int i29 = 0; i29 < list7.size(); i29++) {
                    String str4 = ((C37403k) list7.get(i29)).f160049c;
                    int i34 = AbstractC24567y.f95875a;
                    if (str3.equals(str4)) {
                        C37403k c37403k = (C37403k) list7.get(i29);
                        arrayList6.add(Integer.valueOf(i29));
                        Uri uri = c37403k.f160047a;
                        C31521c0 c31521c3 = c37403k.f160048b;
                        arrayList4.add(uri);
                        arrayList5.add(c31521c3);
                        z18 &= AbstractC24567y.m71682m(1, c31521c3.f130074I) == 1;
                    }
                }
                String strConcat2 = str3.length() != 0 ? "audio:".concat(str3) : new String("audio:");
                int i35 = AbstractC24567y.f95875a;
                list = list7;
                String str5 = strConcat2;
                i13 = i28;
                C36186q c36186qM115125p2 = m115125p(str5, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (C31521c0[]) arrayList5.toArray(new C31521c0[0]), null, Collections.EMPTY_LIST, map, j7);
                arrayList2.add(AbstractC35903f.m113999S(arrayList6));
                arrayList.add(c36186qM115125p2);
                if (z4 && z18) {
                    c36186qM115125p2.m115138F(new C32766w0[]{new C32766w0(str5, (C31521c0[]) arrayList5.toArray(new C31521c0[0]))}, new int[0]);
                }
            } else {
                i13 = i28;
                list = list7;
            }
            i28 = i13 + 1;
        }
        this.f154827U = arrayList.size();
        for (int i36 = 0; i36 < list2.size(); i36++) {
            C37403k c37403k2 = (C37403k) list2.get(i36);
            String str6 = c37403k2.f160049c;
            C31521c0 c31521c4 = c37403k2.f160048b;
            StringBuilder sb4 = new StringBuilder(str6.length() + 21);
            sb4.append("subtitle:");
            sb4.append(i36);
            sb4.append(":");
            sb4.append(str6);
            String string = sb4.toString();
            C36186q c36186qM115125p3 = m115125p(string, 3, new Uri[]{c37403k2.f160047a}, new C31521c0[]{c31521c4}, null, Collections.EMPTY_LIST, map, j7);
            arrayList2.add(new int[]{i36});
            arrayList.add(c36186qM115125p3);
            c36186qM115125p3.m115138F(new C32766w0[]{new C32766w0(string, c31521c4)}, new int[0]);
        }
        this.f154825S = (C36186q[]) arrayList.toArray(new C36186q[0]);
        C36186q[] c36186qArr = this.f154825S;
        this.f154823Q = c36186qArr.length;
        c36186qArr[0].f154910z.f154774l = true;
        for (C36186q c36186q : c36186qArr) {
            if (!c36186q.f154886d0) {
                c36186q.mo91536u(c36186q.f154898p0);
            }
        }
        this.f154826T = this.f154825S;
    }

    @Override // sn.InterfaceC32758s0
    /* JADX INFO: renamed from: c */
    public final void mo97274c(InterfaceC32760t0 interfaceC32760t0) {
        this.f154822P.mo97274c(this);
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: d */
    public final long mo91532d() {
        return this.f154828V.mo91532d();
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: e */
    public final long mo102700e(long j7) {
        C36186q[] c36186qArr = this.f154826T;
        if (c36186qArr.length > 0) {
            boolean zM115140H = c36186qArr[0].m115140H(j7, false);
            int i13 = 1;
            while (true) {
                C36186q[] c36186qArr2 = this.f154826T;
                if (i13 >= c36186qArr2.length) {
                    break;
                }
                c36186qArr2[i13].m115140H(j7, zM115140H);
                i13++;
            }
            if (zM115140H) {
                ((SparseArray) this.f154817K.f143660x).clear();
            }
        }
        return j7;
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: f */
    public final long mo102701f() {
        return -9223372036854775807L;
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: h */
    public final void mo102702h() throws ParserException {
        for (C36186q c36186q : this.f154825S) {
            c36186q.m115137E();
            if (c36186q.f154902t0 && !c36186q.f154886d0) {
                throw ParserException.m15562a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: i */
    public final void mo102703i(long j7) throws Throwable {
        for (C36186q c36186q : this.f154826T) {
            if (c36186q.f154885c0 && !c36186q.m115135C()) {
                int length = c36186q.f154878V.length;
                for (int i13 = 0; i13 < length; i13++) {
                    c36186q.f154878V[i13].m102735f(j7, c36186q.f154896n0[i13]);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0265  */
    /* JADX WARN: Code duplicated, block: B:122:0x026e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0272  */
    /* JADX WARN: Code duplicated, block: B:126:0x0278  */
    /* JADX WARN: Code duplicated, block: B:157:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:198:0x0274 A[SYNTHETIC] */
    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: j */
    public final long mo102704j(InterfaceC20035o[] interfaceC20035oArr, boolean[] zArr, InterfaceC32756r0[] interfaceC32756r0Arr, boolean[] zArr2, long j7) {
        IdentityHashMap identityHashMap;
        InterfaceC32756r0[] interfaceC32756r0Arr2;
        C36177h c36177h;
        C36177h c36177h2;
        boolean z4;
        int[] iArr;
        C36186q[] c36186qArr;
        int i13;
        int i14;
        InterfaceC32756r0[] interfaceC32756r0Arr3;
        int i15;
        C36177h c36177h3;
        int[] iArr2;
        C36186q c36186q;
        boolean z13;
        boolean z14;
        int i16;
        int i17;
        InterfaceC32756r0[] interfaceC32756r0Arr4;
        int i18;
        InterfaceC20035o[] interfaceC20035oArr2;
        int i19;
        int[] iArr3 = new int[interfaceC20035oArr.length];
        int[] iArr4 = new int[interfaceC20035oArr.length];
        int i24 = 0;
        while (true) {
            int length = interfaceC20035oArr.length;
            identityHashMap = this.f154816J;
            if (i24 >= length) {
                break;
            }
            InterfaceC32756r0 interfaceC32756r0 = interfaceC32756r0Arr[i24];
            iArr3[i24] = interfaceC32756r0 == null ? -1 : ((Integer) identityHashMap.get(interfaceC32756r0)).intValue();
            iArr4[i24] = -1;
            InterfaceC20035o interfaceC20035o = interfaceC20035oArr[i24];
            if (interfaceC20035o != null) {
                C32766w0 c32766w0Mo54502j = interfaceC20035o.mo54502j();
                int i25 = 0;
                while (true) {
                    C36186q[] c36186qArr2 = this.f154825S;
                    if (i25 >= c36186qArr2.length) {
                        break;
                    }
                    C36186q c36186q2 = c36186qArr2[i25];
                    c36186q2.m115141s();
                    int iIndexOf = c36186q2.f154891i0.f136271x.indexOf(c32766w0Mo54502j);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        iArr4[i24] = i25;
                        break;
                    }
                    i25++;
                }
            }
            i24++;
        }
        identityHashMap.clear();
        int length2 = interfaceC20035oArr.length;
        InterfaceC32756r0[] interfaceC32756r0Arr5 = new InterfaceC32756r0[length2];
        int length3 = interfaceC20035oArr.length;
        InterfaceC32756r0[] interfaceC32756r0Arr6 = new InterfaceC32756r0[length3];
        int length4 = interfaceC20035oArr.length;
        InterfaceC20035o[] interfaceC20035oArr3 = new InterfaceC20035o[length4];
        C36186q[] c36186qArr3 = new C36186q[this.f154825S.length];
        int i26 = length3;
        int i27 = 0;
        int i28 = 0;
        boolean z15 = false;
        while (i27 < this.f154825S.length) {
            int i29 = length2;
            int i34 = 0;
            while (true) {
                interfaceC32756r0Arr2 = interfaceC32756r0Arr5;
                if (i34 >= interfaceC20035oArr.length) {
                    break;
                }
                interfaceC32756r0Arr6[i34] = iArr3[i34] == i27 ? interfaceC32756r0Arr[i34] : null;
                interfaceC20035oArr3[i34] = iArr4[i34] == i27 ? interfaceC20035oArr[i34] : null;
                i34++;
                interfaceC32756r0Arr5 = interfaceC32756r0Arr2;
            }
            C36186q c36186q3 = this.f154825S[i27];
            C22611c0 c22611c0 = c36186q3.f154866J;
            int i35 = i27;
            C36177h c36177h4 = c36186q3.f154910z;
            ArrayList arrayList = c36186q3.f154870N;
            c36186q3.m115141s();
            int i36 = c36186q3.f154887e0;
            InterfaceC32756r0[] interfaceC32756r0Arr7 = interfaceC32756r0Arr6;
            int i37 = 0;
            while (i37 < length4) {
                C36182m c36182m = (C36182m) interfaceC32756r0Arr7[i37];
                if (c36182m == null || (interfaceC20035oArr3[i37] != null && zArr[i37])) {
                    i19 = i37;
                } else {
                    i19 = i37;
                    c36186q3.f154887e0--;
                    if (c36182m.f154848y != -1) {
                        C36186q c36186q4 = c36182m.f154847x;
                        int i38 = c36182m.f154846w;
                        c36186q4.m115141s();
                        c36186q4.f154893k0.getClass();
                        int i39 = c36186q4.f154893k0[i38];
                        AbstractC24543a.m71573i(c36186q4.f154896n0[i39]);
                        c36186q4.f154896n0[i39] = false;
                        c36182m.f154848y = -1;
                    }
                    interfaceC32756r0Arr7[i19] = null;
                }
                i37 = i19 + 1;
                c22611c0 = c22611c0;
            }
            C22611c0 c22611c1 = c22611c0;
            boolean z16 = true;
            if (z15) {
                c36177h = c36177h4;
                c36177h2 = c36177h;
                z4 = true;
            } else {
                if (c36186q3.f154901s0) {
                    if (i36 != 0) {
                        c36177h = c36177h4;
                    }
                    c36177h = c36177h4;
                    c36177h2 = c36177h;
                    z4 = true;
                } else {
                    c36177h = c36177h4;
                    if (j7 != c36186q3.f154898p0) {
                        c36177h2 = c36177h;
                        z4 = true;
                    }
                }
                c36177h2 = c36177h;
                z4 = false;
            }
            InterfaceC20035o interfaceC20035o2 = c36177h2.f154779q;
            boolean z17 = z4;
            InterfaceC20035o interfaceC20035o3 = interfaceC20035o2;
            int i44 = 0;
            while (i44 < length4) {
                int i45 = i44;
                InterfaceC20035o interfaceC20035o4 = interfaceC20035oArr3[i45];
                if (interfaceC20035o4 == null) {
                    i18 = length4;
                    interfaceC20035oArr2 = interfaceC20035oArr3;
                } else {
                    i18 = length4;
                    interfaceC20035oArr2 = interfaceC20035oArr3;
                    int iIndexOf2 = c36186q3.f154891i0.f136271x.indexOf(interfaceC20035o4.mo54502j());
                    if (iIndexOf2 < 0) {
                        iIndexOf2 = -1;
                    }
                    if (iIndexOf2 == c36186q3.f154894l0) {
                        c36177h2.f154779q = interfaceC20035o4;
                        interfaceC20035o3 = interfaceC20035o4;
                    }
                    if (interfaceC32756r0Arr7[i45] == null) {
                        c36186q3.f154887e0++;
                        C36182m c36182m2 = new C36182m(c36186q3, iIndexOf2);
                        interfaceC32756r0Arr7[i45] = c36182m2;
                        zArr2[i45] = z16;
                        if (c36186q3.f154893k0 != null) {
                            c36182m2.m115129a();
                            if (!z17) {
                                C36185p c36185p = c36186q3.f154878V[c36186q3.f154893k0[iIndexOf2]];
                                z17 = (c36185p.m102751v(j7, z16) || c36185p.m102741l() == 0) ? false : true;
                            }
                        }
                    }
                }
                i44 = i45 + 1;
                length4 = i18;
                interfaceC20035oArr3 = interfaceC20035oArr2;
                z16 = true;
            }
            int i46 = length4;
            InterfaceC20035o[] interfaceC20035oArr4 = interfaceC20035oArr3;
            if (c36186q3.f154887e0 == 0) {
                c36177h2.f154776n = null;
                c36186q3.f154889g0 = null;
                c36186q3.f154900r0 = true;
                arrayList.clear();
                if (c22611c1.m65554b()) {
                    if (c36186q3.f154885c0) {
                        for (C36185p c36185p2 : c36186q3.f154878V) {
                            c36185p2.m102736g();
                        }
                    }
                    c22611c1.m65553a();
                } else {
                    c36186q3.m115139G();
                }
                int[] iArr5 = iArr4;
                c36186q = c36186q3;
                i16 = i26;
                iArr2 = iArr5;
                iArr = iArr3;
                c36186qArr = c36186qArr3;
                i14 = i29;
                interfaceC32756r0Arr3 = interfaceC32756r0Arr2;
                i15 = i35;
                c36177h3 = c36177h2;
            } else {
                boolean z18 = true;
                if (arrayList.isEmpty() || AbstractC24567y.m71670a(interfaceC20035o3, interfaceC20035o2)) {
                    iArr = iArr3;
                    c36186qArr = c36186qArr3;
                    i13 = i26;
                    i14 = i29;
                    interfaceC32756r0Arr3 = interfaceC32756r0Arr2;
                    i15 = i35;
                    c36177h3 = c36177h2;
                    iArr2 = iArr4;
                    c36186q = c36186q3;
                } else {
                    if (c36186q3.f154901s0) {
                        iArr = iArr3;
                        c36186qArr = c36186qArr3;
                        i13 = i26;
                        i14 = i29;
                        interfaceC32756r0Arr3 = interfaceC32756r0Arr2;
                        i15 = i35;
                        c36177h3 = c36177h2;
                        iArr2 = iArr4;
                        c36186q = c36186q3;
                    } else {
                        long j13 = j7 < 0 ? -j7 : 0L;
                        C36179j c36179jM115134A = c36186q3.m115134A();
                        InterfaceC20035o interfaceC20035o5 = interfaceC20035o3;
                        iArr = iArr3;
                        c36186qArr = c36186qArr3;
                        i13 = i26;
                        i14 = i29;
                        interfaceC32756r0Arr3 = interfaceC32756r0Arr2;
                        i15 = i35;
                        c36177h3 = c36177h2;
                        iArr2 = iArr4;
                        c36186q = c36186q3;
                        interfaceC20035o5.mo54497q(j7, j13, -9223372036854775807L, c36186q3.f154871O, c36177h2.m115114a(c36179jM115134A, j7));
                        if (interfaceC20035o5.mo54503m() != c36177h3.f154770h.m102757a(c36179jM115134A.f148916d)) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                    }
                    c36186q.f154900r0 = z18;
                    z13 = z18;
                    z14 = z13;
                    if (z14) {
                        c36186q.m115140H(j7, z13);
                        i17 = 0;
                        i16 = i13;
                        while (i17 < i16) {
                            if (interfaceC32756r0Arr7[i17] != null) {
                                zArr2[i17] = z18;
                            }
                            i17++;
                            z18 = true;
                        }
                    } else {
                        i16 = i13;
                    }
                    z17 = z14;
                }
                z13 = z15;
                z14 = z17;
                if (z14) {
                    c36186q.m115140H(j7, z13);
                    i17 = 0;
                    i16 = i13;
                    while (i17 < i16) {
                        if (interfaceC32756r0Arr7[i17] != null) {
                            zArr2[i17] = z18;
                        }
                        i17++;
                        z18 = true;
                    }
                } else {
                    i16 = i13;
                }
                z17 = z14;
            }
            ArrayList arrayList2 = c36186q.f154875S;
            arrayList2.clear();
            for (int i47 = 0; i47 < i16; i47++) {
                InterfaceC32756r0 interfaceC32756r1 = interfaceC32756r0Arr7[i47];
                if (interfaceC32756r1 != null) {
                    arrayList2.add((C36182m) interfaceC32756r1);
                }
            }
            c36186q.f154901s0 = true;
            int i48 = 0;
            boolean z19 = false;
            while (i48 < interfaceC20035oArr.length) {
                InterfaceC32756r0 interfaceC32756r2 = interfaceC32756r0Arr7[i48];
                int i49 = i15;
                if (iArr2[i48] == i49) {
                    interfaceC32756r2.getClass();
                    interfaceC32756r0Arr4 = interfaceC32756r0Arr3;
                    interfaceC32756r0Arr4[i48] = interfaceC32756r2;
                    identityHashMap.put(interfaceC32756r2, Integer.valueOf(i49));
                    z19 = true;
                } else {
                    interfaceC32756r0Arr4 = interfaceC32756r0Arr3;
                    if (iArr[i48] == i49) {
                        AbstractC24543a.m71573i(interfaceC32756r2 == null);
                    }
                }
                i48++;
                interfaceC32756r0Arr3 = interfaceC32756r0Arr4;
                i15 = i49;
            }
            InterfaceC32756r0[] interfaceC32756r0Arr8 = interfaceC32756r0Arr3;
            int i54 = i15;
            int i55 = i28;
            if (z19) {
                c36186qArr[i55] = c36186q;
                i28 = i55 + 1;
                if (i55 == 0) {
                    c36177h3.f154774l = true;
                    if (z17) {
                        ((SparseArray) this.f154817K.f143660x).clear();
                        z15 = true;
                    } else {
                        C36186q[] c36186qArr4 = this.f154826T;
                        if (c36186qArr4.length == 0 || c36186q != c36186qArr4[0]) {
                            ((SparseArray) this.f154817K.f143660x).clear();
                            z15 = true;
                        }
                    }
                } else {
                    c36177h3.f154774l = i54 < this.f154827U;
                }
            }
            i27 = i54 + 1;
            interfaceC32756r0Arr5 = interfaceC32756r0Arr8;
            iArr4 = iArr2;
            c36186qArr3 = c36186qArr;
            interfaceC32756r0Arr6 = interfaceC32756r0Arr7;
            iArr3 = iArr;
            length4 = i46;
            interfaceC20035oArr3 = interfaceC20035oArr4;
            i26 = i16;
            length2 = i14;
        }
        System.arraycopy(interfaceC32756r0Arr5, 0, interfaceC32756r0Arr, 0, length2);
        C36186q[] c36186qArr5 = (C36186q[]) AbstractC24567y.m71664B(i28, c36186qArr3);
        this.f154826T = c36186qArr5;
        this.f154818L.getClass();
        this.f154828V = new C29934u0(c36186qArr5, 17);
        return j7;
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: k */
    public final C32768x0 mo102705k() {
        C32768x0 c32768x0 = this.f154824R;
        c32768x0.getClass();
        return c32768x0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[LOOP:1: B:17:0x0046->B:22:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0057 A[EDGE_INSN: B:53:0x0057->B:24:0x0057 BREAK  A[LOOP:1: B:17:0x0046->B:22:0x0053], SYNTHETIC] */
    @Override // p589wn.InterfaceC37409q
    /* JADX INFO: renamed from: l */
    public final boolean mo115123l(Uri uri, C0904j c0904j, boolean z4) {
        long j7;
        int i13;
        int iMo54501i;
        C37394b c37394b;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16 = true;
        for (C36186q c36186q : this.f154825S) {
            C36177h c36177h = c36186q.f154910z;
            Uri[] uriArr = c36177h.f154767e;
            if (AbstractC24567y.m71679j(uriArr, uri)) {
                if (!z4) {
                    C15556d c15556d = c36186q.f154865I;
                    C4320k c4320kM65740z = AbstractC22674j.m65740z(c36177h.f154779q);
                    c15556d.getClass();
                    C2919f c2919fM43804g = C15556d.m43804g(c4320kM65740z, c0904j);
                    if (c2919fM43804g != null && c2919fM43804g.f11740a == 2) {
                        j7 = c2919fM43804g.f11741b;
                    }
                    i13 = 0;
                    while (true) {
                        if (i13 < uriArr.length) {
                            i13 = -1;
                            break;
                        }
                        if (uriArr[i13].equals(uri)) {
                            break;
                        }
                        i13++;
                    }
                    if (i13 != -1 && (iMo54501i = c36177h.f154779q.mo54501i(i13)) != -1) {
                        c36177h.f154781s |= uri.equals(c36177h.f154777o);
                        if (j7 == -9223372036854775807L) {
                            if (c36177h.f154779q.mo54505r(iMo54501i, j7)) {
                                c37394b = (C37394b) c36177h.f154769g.f160004z.get(uri);
                                if (c37394b != null) {
                                    z13 = !C37394b.m119747a(c37394b, j7);
                                } else {
                                    z13 = false;
                                }
                                z14 = z13;
                            }
                        }
                    }
                    if (z14 || j7 == -9223372036854775807L) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                }
                j7 = -9223372036854775807L;
                i13 = 0;
                while (true) {
                    if (i13 < uriArr.length) {
                        i13 = -1;
                        break;
                    }
                    if (uriArr[i13].equals(uri)) {
                        break;
                        break;
                    }
                    i13++;
                }
                if (i13 != -1) {
                    c36177h.f154781s |= uri.equals(c36177h.f154777o);
                    if (j7 == -9223372036854775807L) {
                        if (c36177h.f154779q.mo54505r(iMo54501i, j7)) {
                            c37394b = (C37394b) c36177h.f154769g.f160004z.get(uri);
                            if (c37394b != null) {
                                z13 = !C37394b.m119747a(c37394b, j7);
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                            }
                        }
                    }
                }
                if (z14) {
                    z15 = false;
                } else {
                    z15 = false;
                }
            } else {
                z15 = true;
            }
            z16 &= z15;
        }
        this.f154822P.mo97274c(this);
        return z16;
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: m */
    public final long mo91533m() {
        return this.f154828V.mo91533m();
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: n */
    public final void mo91534n(long j7) {
        this.f154828V.mo91534n(j7);
    }

    @Override // p589wn.InterfaceC37409q
    /* JADX INFO: renamed from: o */
    public final void mo115124o() {
        for (C36186q c36186q : this.f154825S) {
            C22611c0 c22611c0 = c36186q.f154866J;
            ArrayList arrayList = c36186q.f154870N;
            if (!arrayList.isEmpty()) {
                C36179j c36179j = (C36179j) AbstractC41047q.m133279i(arrayList);
                int iM115115b = c36186q.f154910z.m115115b(c36179j);
                if (iM115115b == 1) {
                    c36179j.f154794K = true;
                } else if (iM115115b == 2 && !c36186q.f154902t0 && c22611c0.m65554b()) {
                    c22611c0.m65553a();
                }
            }
        }
        this.f154822P.mo97274c(this);
    }

    /* JADX INFO: renamed from: p */
    public final C36186q m115125p(String str, int i13, Uri[] uriArr, C31521c0[] c31521c0Arr, C31521c0 c31521c0, List list, Map map, long j7) {
        return new C36186q(str, i13, this, new C36177h(this.f154829w, this.f154830x, uriArr, c31521c0Arr, this.f154831y, this.f154832z, this.f154817K, list, this.f154821O), map, this.f154815I, j7, c31521c0, this.f154811E, this.f154812F, this.f154813G, this.f154814H, this.f154820N);
    }

    /* JADX INFO: renamed from: r */
    public final void m115126r() {
        int i13 = this.f154823Q - 1;
        this.f154823Q = i13;
        if (i13 > 0) {
            return;
        }
        int i14 = 0;
        for (C36186q c36186q : this.f154825S) {
            c36186q.m115141s();
            i14 += c36186q.f154891i0.f136270w;
        }
        C32766w0[] c32766w0Arr = new C32766w0[i14];
        int i15 = 0;
        for (C36186q c36186q2 : this.f154825S) {
            c36186q2.m115141s();
            int i16 = c36186q2.f154891i0.f136270w;
            int i17 = 0;
            while (i17 < i16) {
                c36186q2.m115141s();
                c32766w0Arr[i15] = c36186q2.f154891i0.m102758a(i17);
                i17++;
                i15++;
            }
        }
        this.f154824R = new C32768x0(c32766w0Arr);
        this.f154822P.mo97282g(this);
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: u */
    public final boolean mo91536u(long j7) {
        if (this.f154824R != null) {
            return this.f154828V.mo91536u(j7);
        }
        for (C36186q c36186q : this.f154825S) {
            if (!c36186q.f154886d0) {
                c36186q.mo91536u(c36186q.f154898p0);
            }
        }
        return false;
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: v */
    public final long mo102707v(long j7, C31537h1 c31537h1) {
        for (C36186q c36186q : this.f154826T) {
            if (c36186q.f154883a0 == 2) {
                C36177h c36177h = c36186q.f154910z;
                C37395c c37395c = c36177h.f154769g;
                int iMo54492c = c36177h.f154779q.mo54492c();
                Uri[] uriArr = c36177h.f154767e;
                C37402j c37402jM119751a = (iMo54492c >= uriArr.length || iMo54492c == -1) ? null : c37395c.m119751a(true, uriArr[c36177h.f154779q.mo54503m()]);
                if (c37402jM119751a == null) {
                    break;
                }
                AbstractC41023g0 abstractC41023g0 = c37402jM119751a.f160042r;
                if (abstractC41023g0.isEmpty() || !c37402jM119751a.f160069c) {
                    break;
                    break;
                }
                long j13 = c37402jM119751a.f160032h - c37395c.f160000N;
                long j14 = j7 - j13;
                int iM71672c = AbstractC24567y.m71672c(abstractC41023g0, Long.valueOf(j14), true);
                long j15 = ((C37399g) abstractC41023g0.get(iM71672c)).f160012E;
                return c31537h1.m97143a(j14, j15, iM71672c != abstractC41023g0.size() - 1 ? ((C37399g) abstractC41023g0.get(iM71672c + 1)).f160012E : j15) + j13;
            }
        }
        return j7;
    }
}
