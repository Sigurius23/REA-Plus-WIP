package p112e9;

import a00.C0072g;
import android.util.Pair;
import android.util.SparseArray;
import com.iterable.iterableapi.C5327g1;
import com.mapbox.maps.C5538l;
import g73.C15553a;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.AbstractC11266d;
import p012ab.C0682h0;
import p031b9.AbstractC2875y;
import p031b9.C2846k1;
import p031b9.C2856o0;
import p032bc.C2953i;
import p047c9.C4323n;
import p141f9.AbstractC14271m;
import p141f9.C14259a;
import p141f9.C14261c;
import p141f9.C14264f;
import p141f9.C14265g;
import p141f9.C14266h;
import p171g9.C15587d;
import p171g9.InterfaceC15591h;
import p249jc.C21567b;
import p284ko.C22631o;
import p299l9.C23488c0;
import p299l9.C23501g1;
import p299l9.C23511l;
import p299l9.C23521q;
import p299l9.C23537y;
import p299l9.C23538y0;
import p299l9.InterfaceC23482a0;
import p299l9.InterfaceC23483a1;
import p299l9.InterfaceC23486b1;
import p299l9.InterfaceC23539z;
import p299l9.InterfaceC23540z0;
import p324m9.AbstractC25273a;
import p324m9.C25277e;
import p324m9.C25279g;
import p324m9.InterfaceC25278f;
import p361o9.InterfaceC27679s;
import p398p9.C28987k;
import p398p9.HandlerC28984h;
import p398p9.InterfaceC28988l;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p516u8.C34611p0;
import p550vd.AbstractC35903f;
import p607x8.AbstractC38065t;
import p674z8.InterfaceC40169e;
import p674z8.InterfaceC40170f;
import p674z8.InterfaceC40178n;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.C41017e0;
import p690zr.C41060w0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: e9.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C12863b implements InterfaceC23482a0, InterfaceC23483a1, InterfaceC25278f {

    /* JADX INFO: renamed from: Z */
    public static final Pattern f44208Z = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: a0 */
    public static final Pattern f44209a0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: E */
    public final C21567b f44210E;

    /* JADX INFO: renamed from: F */
    public final C0072g f44211F;

    /* JADX INFO: renamed from: G */
    public final long f44212G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC28988l f44213H;

    /* JADX INFO: renamed from: I */
    public final C22631o f44214I;

    /* JADX INFO: renamed from: J */
    public final C23501g1 f44215J;

    /* JADX INFO: renamed from: K */
    public final C12862a[] f44216K;

    /* JADX INFO: renamed from: L */
    public final C15553a f44217L;

    /* JADX INFO: renamed from: M */
    public final C12877p f44218M;

    /* JADX INFO: renamed from: O */
    public final C15587d f44220O;

    /* JADX INFO: renamed from: P */
    public final C15587d f44221P;

    /* JADX INFO: renamed from: Q */
    public InterfaceC23539z f44222Q;

    /* JADX INFO: renamed from: T */
    public C23511l f44225T;

    /* JADX INFO: renamed from: U */
    public C14261c f44226U;

    /* JADX INFO: renamed from: V */
    public int f44227V;

    /* JADX INFO: renamed from: W */
    public List f44228W;

    /* JADX INFO: renamed from: Y */
    public long f44230Y;

    /* JADX INFO: renamed from: w */
    public final int f44231w;

    /* JADX INFO: renamed from: x */
    public final C0682h0 f44232x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC40178n f44233y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC15591h f44234z;

    /* JADX INFO: renamed from: X */
    public boolean f44229X = true;

    /* JADX INFO: renamed from: R */
    public C25279g[] f44223R = new C25279g[0];

    /* JADX INFO: renamed from: S */
    public C12874m[] f44224S = new C12874m[0];

    /* JADX INFO: renamed from: N */
    public final IdentityHashMap f44219N = new IdentityHashMap();

    /* JADX WARN: Code duplicated, block: B:35:0x015e  */
    public C12863b(int i13, C14261c c14261c, C0072g c0072g, int i14, C0682h0 c0682h0, InterfaceC40178n interfaceC40178n, InterfaceC15591h interfaceC15591h, C15587d c15587d, C21567b c21567b, C15587d c15587d2, long j7, InterfaceC28988l interfaceC28988l, C22631o c22631o, C15553a c15553a, C12865d c12865d, C4323n c4323n) {
        int i15;
        int i16;
        int[][] iArr;
        boolean[] zArr;
        C34610p[][] c34610pArr;
        C34610p[] c34610pArrM36120o;
        C14264f c14264fM36118g;
        int i17;
        HashMap map;
        String[] strArr;
        Integer num;
        this.f44231w = i13;
        this.f44226U = c14261c;
        this.f44211F = c0072g;
        this.f44227V = i14;
        this.f44232x = c0682h0;
        this.f44233y = interfaceC40178n;
        this.f44234z = interfaceC15591h;
        this.f44221P = c15587d;
        this.f44210E = c21567b;
        this.f44220O = c15587d2;
        this.f44212G = j7;
        this.f44213H = interfaceC28988l;
        this.f44214I = c22631o;
        this.f44217L = c15553a;
        boolean z4 = true;
        this.f44218M = new C12877p(c14261c, c12865d, c22631o);
        int i18 = 0;
        c15553a.getClass();
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        C41060w0 c41060w0 = C41060w0.f177067E;
        this.f44225T = new C23511l(c41060w0, c41060w0);
        C14266h c14266hM40728a = c14261c.m40728a(i14);
        List list = c14266hM40728a.f52097d;
        this.f44228W = list;
        List list2 = c14266hM40728a.f52096c;
        int size = list2.size();
        HashMap map2 = new HashMap(AbstractC41047q.m133271a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i19 = 0; i19 < size; i19++) {
            map2.put(Long.valueOf(((C14259a) list2.get(i19)).f52052a), Integer.valueOf(i19));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i19));
            arrayList.add(arrayList2);
            sparseArray.put(i19, arrayList2);
        }
        int i24 = 0;
        while (i24 < size) {
            C14259a c14259a = (C14259a) list2.get(i24);
            List list3 = c14259a.f52056e;
            List list4 = c14259a.f52057f;
            boolean z13 = z4;
            C14264f c14264fM36118g2 = m36118g("http://dashif.org/guidelines/trickmode", list3);
            c14264fM36118g2 = c14264fM36118g2 == null ? m36118g("http://dashif.org/guidelines/trickmode", list4) : c14264fM36118g2;
            int iIntValue = (c14264fM36118g2 == null || (num = (Integer) map2.get(Long.valueOf(Long.parseLong(c14264fM36118g2.f52088b)))) == null) ? i24 : num.intValue();
            if (iIntValue == i24 && (c14264fM36118g = m36118g("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = c14264fM36118g.f52088b;
                int i25 = AbstractC38065t.f163031a;
                String[] strArrSplit = str.split(",", -1);
                int length = strArrSplit.length;
                int i26 = i18;
                while (i26 < length) {
                    Integer num2 = (Integer) map2.get(Long.valueOf(Long.parseLong(strArrSplit[i26])));
                    if (num2 != null) {
                        C14259a c14259a2 = (C14259a) list2.get(num2.intValue());
                        i17 = size;
                        int i27 = c14259a.f52053b;
                        map = map2;
                        List list5 = c14259a.f52054c;
                        strArr = strArrSplit;
                        int i28 = c14259a2.f52053b;
                        List list6 = c14259a2.f52054c;
                        if (i27 == i28) {
                            if (list5.isEmpty() || list6.isEmpty()) {
                                iIntValue = Math.min(iIntValue, num2.intValue());
                            } else {
                                C34610p c34610p = ((AbstractC14271m) list5.get(0)).f52111w;
                                C34610p c34610p2 = ((AbstractC14271m) list6.get(0)).f52111w;
                                if (Objects.equals(c34610p.f145773d, c34610p2.f145773d) && c34610p.f145775f == c34610p2.f145775f) {
                                    iIntValue = Math.min(iIntValue, num2.intValue());
                                }
                            }
                        }
                    } else {
                        i17 = size;
                        map = map2;
                        strArr = strArrSplit;
                    }
                    i26++;
                    size = i17;
                    map2 = map;
                    strArrSplit = strArr;
                }
            }
            int i29 = size;
            HashMap map3 = map2;
            if (iIntValue != i24) {
                List list7 = (List) sparseArray.get(i24);
                List list8 = (List) sparseArray.get(iIntValue);
                list8.addAll(list7);
                sparseArray.put(i24, list8);
                arrayList.remove(list7);
            }
            i24++;
            z4 = z13;
            size = i29;
            map2 = map3;
            i18 = 0;
        }
        boolean z14 = z4;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i34 = 0; i34 < size2; i34++) {
            int[] iArrM113999S = AbstractC35903f.m113999S((Collection) arrayList.get(i34));
            iArr2[i34] = iArrM113999S;
            Arrays.sort(iArrM113999S);
        }
        boolean[] zArr2 = new boolean[size2];
        C34610p[][] c34610pArr2 = new C34610p[size2][];
        int i35 = 0;
        int i36 = 0;
        while (i35 < size2) {
            int[] iArr3 = iArr2[i35];
            int length2 = iArr3.length;
            int i37 = 0;
            while (true) {
                if (i37 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list9 = ((C14259a) list2.get(iArr3[i37])).f52054c;
                iArr = iArr2;
                for (int i38 = 0; i38 < list9.size(); i38++) {
                    if (!((AbstractC14271m) list9.get(i38)).f52114z.isEmpty()) {
                        zArr2[i35] = z14;
                        i36++;
                        break;
                    }
                }
                i37++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i35];
            int length3 = iArr4.length;
            int i39 = 0;
            while (true) {
                if (i39 >= length3) {
                    zArr = zArr2;
                    c34610pArr = c34610pArr2;
                    c34610pArrM36120o = new C34610p[0];
                    break;
                }
                int i44 = iArr4[i39];
                C14259a c14259a3 = (C14259a) list2.get(i44);
                List list10 = ((C14259a) list2.get(i44)).f52055d;
                int[] iArr5 = iArr4;
                int i45 = 0;
                while (i45 < list10.size()) {
                    C14264f c14264f = (C14264f) list10.get(i45);
                    zArr = zArr2;
                    c34610pArr = c34610pArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(c14264f.f52087a)) {
                        C34608o c34608o = new C34608o();
                        c34608o.f145741m = AbstractC34587d0.m109382o("application/cea-608");
                        c34608o.f145729a = AbstractC11266d.m30457k(c14259a3.f52052a, ":cea608", new StringBuilder());
                        c34610pArrM36120o = m36120o(c14264f, f44208Z, new C34610p(c34608o));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(c14264f.f52087a)) {
                        C34608o c34608o2 = new C34608o();
                        c34608o2.f145741m = AbstractC34587d0.m109382o("application/cea-708");
                        c34608o2.f145729a = AbstractC11266d.m30457k(c14259a3.f52052a, ":cea708", new StringBuilder());
                        c34610pArrM36120o = m36120o(c14264f, f44209a0, new C34610p(c34608o2));
                        break;
                    }
                    i45++;
                    c34610pArr2 = c34610pArr;
                    zArr2 = zArr;
                }
                i39++;
                iArr4 = iArr5;
            }
            c34610pArr[i35] = c34610pArrM36120o;
            if (c34610pArrM36120o.length != 0) {
                i36++;
            }
            i35++;
            c34610pArr2 = c34610pArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        C34610p[][] c34610pArr3 = c34610pArr2;
        int size3 = list.size() + i36 + size2;
        C34611p0[] c34611p0Arr = new C34611p0[size3];
        C12862a[] c12862aArr = new C12862a[size3];
        int i46 = 0;
        int i47 = 0;
        while (i46 < size2) {
            int[] iArr7 = iArr6[i46];
            ArrayList arrayList3 = new ArrayList();
            for (int i48 : iArr7) {
                arrayList3.addAll(((C14259a) list2.get(i48)).f52054c);
            }
            int size4 = arrayList3.size();
            C34610p[] c34610pArr4 = new C34610p[size4];
            int i49 = 0;
            while (i49 < size4) {
                int i54 = size2;
                C34610p c34610p3 = ((AbstractC14271m) arrayList3.get(i49)).f52111w;
                int i55 = i47;
                C34608o c34608oM109410a = c34610p3.m109410a();
                c34608oM109410a.f145728L = interfaceC15591h.mo43889a(c34610p3);
                c34610pArr4[i49] = new C34610p(c34608oM109410a);
                i49++;
                size2 = i54;
                i47 = i55;
            }
            int i56 = size2;
            int i57 = i47;
            C14259a c14259a4 = (C14259a) list2.get(iArr7[0]);
            long j13 = c14259a4.f52052a;
            String string = j13 != -1 ? Long.toString(j13) : AbstractC2875y.m8295h(i46, "unset:");
            int i58 = i57 + 1;
            if (zArr3[i46]) {
                i15 = i57 + 2;
            } else {
                i15 = i58;
                i58 = -1;
            }
            if (c34610pArr3[i46].length != 0) {
                i16 = i15 + 1;
            } else {
                i16 = i15;
                i15 = -1;
            }
            m36119l(c0682h0, c34610pArr4);
            List list11 = list2;
            c34611p0Arr[i57] = new C34611p0(string, c34610pArr4);
            int i59 = c14259a4.f52053b;
            C41017e0 c41017e1 = AbstractC41023g0.f176998x;
            C41060w0 c41060w1 = C41060w0.f177067E;
            C12862a c12862a = new C12862a(i59, 0, iArr7, i57, i58, i15, -1, c41060w1);
            int i64 = i57;
            c12862aArr[i64] = c12862a;
            int i65 = -1;
            if (i58 != -1) {
                String strM8299l = AbstractC2875y.m8299l(string, ":emsg");
                C34608o c34608o3 = new C34608o();
                c34608o3.f145729a = strM8299l;
                c34608o3.f145741m = AbstractC34587d0.m109382o("application/x-emsg");
                c34611p0Arr[i58] = new C34611p0(strM8299l, new C34610p(c34608o3));
                c12862aArr[i58] = new C12862a(5, 1, iArr7, i64, -1, -1, -1, c41060w1);
                i65 = -1;
            }
            if (i15 != i65) {
                i64 = i64;
                String strM8299l2 = AbstractC2875y.m8299l(string, ":cc");
                c12862aArr[i15] = new C12862a(3, 1, iArr7, i64, -1, -1, -1, AbstractC41023g0.m133253n(c34610pArr3[i46]));
                m36119l(c0682h0, c34610pArr3[i46]);
                c34611p0Arr[i15] = new C34611p0(strM8299l2, c34610pArr3[i46]);
            } else {
                i64 = i64;
            }
            i46++;
            size2 = i56;
            i47 = i16;
            list2 = list11;
        }
        int i66 = 0;
        while (i66 < list.size()) {
            C14265g c14265g = (C14265g) list.get(i66);
            C34608o c34608o4 = new C34608o();
            c34608o4.f145729a = c14265g.m40750a();
            c34608o4.f145741m = AbstractC34587d0.m109382o("application/x-emsg");
            c34611p0Arr[i47] = new C34611p0(c14265g.m40750a() + ":" + i66, new C34610p(c34608o4));
            C41017e0 c41017e2 = AbstractC41023g0.f176998x;
            c12862aArr[i47] = new C12862a(5, 2, new int[0], -1, -1, -1, i66, C41060w0.f177067E);
            i66++;
            i47++;
        }
        Pair pairCreate = Pair.create(new C23501g1(c34611p0Arr), c12862aArr);
        this.f44215J = (C23501g1) pairCreate.first;
        this.f44216K = (C12862a[]) pairCreate.second;
    }

    /* JADX INFO: renamed from: g */
    public static C14264f m36118g(String str, List list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            C14264f c14264f = (C14264f) list.get(i13);
            if (str.equals(c14264f.f52087a)) {
                return c14264f;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static void m36119l(C0682h0 c0682h0, C34610p[] c34610pArr) {
        for (int i13 = 0; i13 < c34610pArr.length; i13++) {
            C34610p c34610p = c34610pArr[i13];
            C5327g1 c5327g1 = (C5327g1) c0682h0.f2434z;
            if (c5327g1.f21694w && ((C21567b) c5327g1.f21695x).mo60610g(c34610p)) {
                C34608o c34608oM109410a = c34610p.m109410a();
                String str = c34610p.f145780k;
                c34608oM109410a.f145741m = AbstractC34587d0.m109382o("application/x-media3-cues");
                c34608oM109410a.f145725I = ((C21567b) c5327g1.f21695x).mo60612i(c34610p);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(c34610p.f145783n);
                sb4.append(str != null ? " ".concat(str) : "");
                c34608oM109410a.f145738j = sb4.toString();
                c34608oM109410a.f145746r = Long.MAX_VALUE;
                c34610p = new C34610p(c34608oM109410a);
            }
            c34610pArr[i13] = c34610p;
        }
    }

    /* JADX INFO: renamed from: o */
    public static C34610p[] m36120o(C14264f c14264f, Pattern pattern, C34610p c34610p) {
        String str = c14264f.f52088b;
        if (str == null) {
            return new C34610p[]{c34610p};
        }
        int i13 = AbstractC38065t.f163031a;
        String[] strArrSplit = str.split(";", -1);
        C34610p[] c34610pArr = new C34610p[strArrSplit.length];
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            Matcher matcher = pattern.matcher(strArrSplit[i14]);
            if (!matcher.matches()) {
                return new C34610p[]{c34610p};
            }
            int i15 = Integer.parseInt(matcher.group(1));
            C34608o c34608oM109410a = c34610p.m109410a();
            c34608oM109410a.f145729a = c34610p.f145770a + ":" + i15;
            c34608oM109410a.f145724H = i15;
            c34608oM109410a.f145732d = matcher.group(2);
            c34610pArr[i14] = new C34610p(c34608oM109410a);
        }
        return c34610pArr;
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: a */
    public final boolean mo36121a() {
        return this.f44225T.mo36121a();
    }

    @Override // p299l9.InterfaceC23483a1
    /* JADX INFO: renamed from: b */
    public final void mo8198b(InterfaceC23486b1 interfaceC23486b1) {
        this.f44222Q.mo8198b(this);
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: d */
    public final long mo36122d() {
        return this.f44225T.mo36122d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: e */
    public final long mo36123e(long j7) throws Throwable {
        int i13;
        AbstractC25273a abstractC25273a;
        boolean z4;
        C25279g[] c25279gArr = this.f44223R;
        int length = c25279gArr.length;
        boolean z13 = false;
        int i14 = 0;
        while (i14 < length) {
            C25279g c25279g = c25279gArr[i14];
            C23538y0[] c23538y0Arr = c25279g.f99208N;
            C23538y0 c23538y0 = c25279g.f99207M;
            C28987k c28987k = c25279g.f99203I;
            ?? r14 = c25279g.f99205K;
            c25279g.f99214T = j7;
            c25279g.f99217W = z13;
            if (c25279g.m74178z()) {
                c25279g.f99213S = j7;
                z4 = z13;
                i13 = i14;
            } else {
                ?? r15 = z13;
                while (true) {
                    if (r15 < r14.size()) {
                        abstractC25273a = (AbstractC25273a) r14.get(r15);
                        long j13 = abstractC25273a.f99187G;
                        i13 = i14;
                        if (j13 == j7 && abstractC25273a.f99165K == -9223372036854775807L) {
                            break;
                        }
                        if (j13 <= j7) {
                            i14 = i13;
                            r15++;
                        }
                    } else {
                        i13 = i14;
                    }
                    abstractC25273a = null;
                    break;
                }
                if (abstractC25273a != null ? c23538y0.m68137t(abstractC25273a.m74167a(0)) : c23538y0.m68138u(j7, j7 < c25279g.mo36122d())) {
                    c25279g.f99215U = c25279g.m74173B(c23538y0.m68129l(), 0);
                    for (C23538y0 c23538y1 : c23538y0Arr) {
                        c23538y1.m68138u(j7, true);
                    }
                    z4 = false;
                } else {
                    c25279g.f99213S = j7;
                    c25279g.f99219Y = false;
                    r14.clear();
                    c25279g.f99215U = 0;
                    if (c28987k.m88007a()) {
                        c23538y0.m68124g();
                        for (C23538y0 c23538y2 : c23538y0Arr) {
                            c23538y2.m68124g();
                        }
                        HandlerC28984h handlerC28984h = c28987k.f117258x;
                        AbstractC35849g.m113808j(handlerC28984h);
                        z4 = false;
                        handlerC28984h.m88005a(false);
                    } else {
                        z4 = false;
                        c28987k.f117259y = null;
                        c23538y0.m68136s(false);
                        for (C23538y0 c23538y3 : c25279g.f99208N) {
                            c23538y3.m68136s(false);
                        }
                    }
                }
            }
            i14 = i13 + 1;
            z13 = z4;
        }
        C12874m[] c12874mArr = this.f44224S;
        int length2 = c12874mArr.length;
        for (?? r10 = z13; r10 < length2; r10++) {
            C12874m c12874m = c12874mArr[r10];
            int iM121908a = AbstractC38065t.m121908a(c12874m.f44317y, j7, true);
            c12874m.f44313G = iM121908a;
            c12874m.f44314H = (c12874m.f44318z && iM121908a == c12874m.f44317y.length) ? j7 : -9223372036854775807L;
        }
        return j7;
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: f */
    public final long mo36124f() {
        for (C25279g c25279g : this.f44223R) {
            c25279g.getClass();
            try {
                boolean z4 = c25279g.f99218X;
                c25279g.f99218X = false;
                if (z4) {
                    return this.f44230Y;
                }
            } catch (Throwable th3) {
                c25279g.f99218X = false;
                throw th3;
            }
        }
        return -9223372036854775807L;
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: h */
    public final void mo36125h() {
        this.f44213H.mo36136c();
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: i */
    public final void mo36126i(long j7) throws Throwable {
        long j13;
        for (C25279g c25279g : this.f44223R) {
            if (!c25279g.m74178z()) {
                C23538y0 c23538y0 = c25279g.f99207M;
                int i13 = c23538y0.f93234q;
                c23538y0.m68123f(j7, true);
                C23538y0 c23538y1 = c25279g.f99207M;
                int i14 = c23538y1.f93234q;
                if (i14 > i13) {
                    synchronized (c23538y1) {
                        j13 = c23538y1.f93233p == 0 ? Long.MIN_VALUE : c23538y1.f93231n[c23538y1.f93235r];
                    }
                    int i15 = 0;
                    while (true) {
                        C23538y0[] c23538y0Arr = c25279g.f99208N;
                        if (i15 >= c23538y0Arr.length) {
                            break;
                        }
                        c23538y0Arr[i15].m68123f(j13, c25279g.f99223z[i15]);
                        i15++;
                    }
                }
                int iMin = Math.min(c25279g.m74173B(i14, 0), c25279g.f99215U);
                if (iMin > 0) {
                    ArrayList arrayList = c25279g.f99205K;
                    int i16 = AbstractC38065t.f163031a;
                    if (iMin > arrayList.size() || iMin < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (iMin != 0) {
                        arrayList.subList(0, iMin).clear();
                    }
                    c25279g.f99215U -= iMin;
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m36127j(int[] iArr, int i13) {
        int i14 = iArr[i13];
        if (i14 != -1) {
            C12862a[] c12862aArr = this.f44216K;
            int i15 = c12862aArr[i14].f44204e;
            for (int i16 = 0; i16 < iArr.length; i16++) {
                int i17 = iArr[i16];
                if (i17 == i15 && c12862aArr[i17].f44202c == 0) {
                    return i16;
                }
            }
        }
        return -1;
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: k */
    public final C23501g1 mo36128k() {
        return this.f44215J;
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: m */
    public final long mo36129m() {
        return this.f44225T.mo36129m();
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: n */
    public final void mo36130n(long j7) {
        long j13;
        for (C25279g c25279g : this.f44223R) {
            if (!c25279g.f99203I.m88007a()) {
                long jM40730c = this.f44226U.m40730c(this.f44227V);
                C23538y0 c23538y0 = c25279g.f99207M;
                AbstractC35849g.m113807i(!c25279g.f99203I.m88007a());
                if (!c25279g.m74178z() && jM40730c != -9223372036854775807L && !c25279g.f99205K.isEmpty()) {
                    AbstractC25273a abstractC25273aM74176v = c25279g.m74176v();
                    long j14 = abstractC25273aM74176v.f99166L;
                    if (j14 == -9223372036854775807L) {
                        j14 = abstractC25273aM74176v.f99188H;
                    }
                    if (j14 <= jM40730c) {
                        continue;
                    } else {
                        synchronized (c23538y0) {
                            j13 = c23538y0.f93239v;
                        }
                        if (j13 > jM40730c) {
                            c23538y0.m68125h(jM40730c);
                            for (C23538y0 c23538y1 : c25279g.f99208N) {
                                c23538y1.m68125h(jM40730c);
                            }
                            C15587d c15587d = c25279g.f99201G;
                            C23537y c23537y = new C23537y(1, c25279g.f99220w, null, 3, null, AbstractC38065t.m121907U(jM40730c), AbstractC38065t.m121907U(j13));
                            C23488c0 c23488c0 = c15587d.f58538b;
                            c23488c0.getClass();
                            c15587d.m43883a(new C2953i(c15587d, c23488c0, c23537y, 8));
                        }
                    }
                }
            }
        }
        this.f44225T.mo36130n(j7);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: s */
    public final long mo36131s(long j7, C2846k1 c2846k1) {
        long jM36162f;
        int i13 = 0;
        for (C25279g c25279g : this.f44223R) {
            if (c25279g.f99220w == 2) {
                C12871j[] c12871jArr = c25279g.f99199E.f44305i;
                int length = c12871jArr.length;
                while (i13 < length) {
                    C12871j c12871j = c12871jArr[i13];
                    InterfaceC12870i interfaceC12870i = c12871j.f44289d;
                    long j13 = c12871j.f44291f;
                    InterfaceC12870i interfaceC12870i2 = c12871j.f44289d;
                    if (interfaceC12870i != null) {
                        long jM36160d = c12871j.m36160d();
                        if (jM36160d != 0) {
                            AbstractC35849g.m113808j(interfaceC12870i2);
                            long jMo3108u = interfaceC12870i2.mo3108u(j7, c12871j.f44290e) + j13;
                            long jM36162f2 = c12871j.m36162f(jMo3108u);
                            if (jM36162f2 >= j7) {
                                jM36162f = jM36162f2;
                            } else {
                                if (jM36160d != -1) {
                                    AbstractC35849g.m113808j(interfaceC12870i2);
                                    if (jMo3108u >= ((interfaceC12870i2.mo3077B() + j13) + jM36160d) - 1) {
                                        jM36162f = jM36162f2;
                                    }
                                }
                                jM36162f = c12871j.m36162f(jMo3108u + 1);
                            }
                            return c2846k1.m8161a(j7, jM36162f2, jM36162f);
                        }
                    }
                    i13++;
                    j7 = j7;
                }
                break;
            }
        }
        return j7;
    }

    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: t */
    public final void mo36132t(InterfaceC23539z interfaceC23539z, long j7) {
        this.f44222Q = interfaceC23539z;
        interfaceC23539z.mo8200c(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p299l9.InterfaceC23482a0
    /* JADX INFO: renamed from: u */
    public final long mo36133u(InterfaceC27679s[] interfaceC27679sArr, boolean[] zArr, InterfaceC23540z0[] interfaceC23540z0Arr, boolean[] zArr2, long j7) throws Throwable {
        int i13;
        boolean z4;
        int[] iArr;
        int i14;
        int i15;
        int i16;
        C34611p0 c34611p0M68058a;
        AbstractC41023g0 abstractC41023g0;
        int i17;
        C12876o c12876o;
        boolean z13;
        int[] iArr2 = new int[interfaceC27679sArr.length];
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i13 = -1;
            if (i19 >= interfaceC27679sArr.length) {
                break;
            }
            InterfaceC27679s interfaceC27679s = interfaceC27679sArr[i19];
            if (interfaceC27679s != null) {
                int iIndexOf = this.f44215J.f93028b.indexOf(interfaceC27679s.mo68078j());
                iArr2[i19] = iIndexOf >= 0 ? iIndexOf : -1;
            } else {
                iArr2[i19] = -1;
            }
            i19++;
        }
        for (int i24 = 0; i24 < interfaceC27679sArr.length; i24++) {
            if (interfaceC27679sArr[i24] == null || !zArr[i24]) {
                InterfaceC23540z0 interfaceC23540z0 = interfaceC23540z0Arr[i24];
                if (interfaceC23540z0 instanceof C25279g) {
                    ((C25279g) interfaceC23540z0).m74174C(this);
                } else if (interfaceC23540z0 instanceof C25277e) {
                    C25277e c25277e = (C25277e) interfaceC23540z0;
                    C25279g c25279g = c25277e.f99194E;
                    boolean[] zArr3 = c25279g.f99223z;
                    int i25 = c25277e.f99197y;
                    AbstractC35849g.m113807i(zArr3[i25]);
                    c25279g.f99223z[i25] = false;
                }
                interfaceC23540z0Arr[i24] = null;
            }
        }
        int i26 = 0;
        while (true) {
            z4 = true;
            if (i26 >= interfaceC27679sArr.length) {
                break;
            }
            InterfaceC23540z0 interfaceC23540z1 = interfaceC23540z0Arr[i26];
            if ((interfaceC23540z1 instanceof C23521q) || (interfaceC23540z1 instanceof C25277e)) {
                int iM36127j = m36127j(iArr2, i26);
                if (iM36127j == -1) {
                    z13 = interfaceC23540z0Arr[i26] instanceof C23521q;
                } else {
                    InterfaceC23540z0 interfaceC23540z2 = interfaceC23540z0Arr[i26];
                    z13 = (interfaceC23540z2 instanceof C25277e) && ((C25277e) interfaceC23540z2).f99195w == interfaceC23540z0Arr[iM36127j];
                }
                if (!z13) {
                    InterfaceC23540z0 interfaceC23540z3 = interfaceC23540z0Arr[i26];
                    if (interfaceC23540z3 instanceof C25277e) {
                        C25277e c25277e2 = (C25277e) interfaceC23540z3;
                        C25279g c25279g2 = c25277e2.f99194E;
                        boolean[] zArr4 = c25279g2.f99223z;
                        int i27 = c25277e2.f99197y;
                        AbstractC35849g.m113807i(zArr4[i27]);
                        c25279g2.f99223z[i27] = false;
                    }
                    interfaceC23540z0Arr[i26] = null;
                }
            }
            i26++;
        }
        int i28 = 0;
        while (i28 < interfaceC27679sArr.length) {
            InterfaceC27679s interfaceC27679s2 = interfaceC27679sArr[i28];
            if (interfaceC27679s2 == null) {
                iArr = iArr2;
                i14 = i18;
                i15 = i28;
            } else {
                InterfaceC23540z0 interfaceC23540z4 = interfaceC23540z0Arr[i28];
                if (interfaceC23540z4 == null) {
                    zArr2[i28] = z4;
                    C12862a c12862a = this.f44216K[iArr2[i28]];
                    int i29 = c12862a.f44202c;
                    if (i29 == 0) {
                        int i34 = c12862a.f44205f;
                        boolean z14 = i34 != i13 ? z4 ? 1 : 0 : i18;
                        if (z14 != 0) {
                            c34611p0M68058a = this.f44215J.m68058a(i34);
                            i16 = z4 ? 1 : 0;
                        } else {
                            i16 = i18;
                            c34611p0M68058a = null;
                        }
                        int i35 = c12862a.f44206g;
                        if (i35 != i13) {
                            abstractC41023g0 = this.f44216K[i35].f44207h;
                        } else {
                            C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                            abstractC41023g0 = C41060w0.f177067E;
                        }
                        int size = abstractC41023g0.size() + i16;
                        C34610p[] c34610pArr = new C34610p[size];
                        int[] iArr3 = new int[size];
                        if (z14 != 0) {
                            c34610pArr[i18] = c34611p0M68058a.f145799d[i18];
                            iArr3[i18] = 5;
                            i17 = z4 ? 1 : 0;
                        } else {
                            i17 = i18;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i36 = i18; i36 < abstractC41023g0.size(); i36++) {
                            C34610p c34610p = (C34610p) abstractC41023g0.get(i36);
                            c34610pArr[i17] = c34610p;
                            iArr3[i17] = 3;
                            arrayList.add(c34610p);
                            i17 += z4 ? 1 : 0;
                        }
                        if (!this.f44226U.f52065d || z14 == 0) {
                            c12876o = null;
                        } else {
                            C12877p c12877p = this.f44218M;
                            c12876o = new C12876o(c12877p, c12877p.f44331w);
                        }
                        C0682h0 c0682h0 = this.f44232x;
                        InterfaceC28988l interfaceC28988l = this.f44213H;
                        C14261c c14261c = this.f44226U;
                        C0072g c0072g = this.f44211F;
                        int i37 = this.f44227V;
                        int[] iArr4 = c12862a.f44200a;
                        int i38 = c12862a.f44201b;
                        iArr = iArr2;
                        long j13 = this.f44212G;
                        InterfaceC40178n interfaceC40178n = this.f44233y;
                        InterfaceC40170f interfaceC40170fCreateDataSource = ((InterfaceC40169e) c0682h0.f2433y).createDataSource();
                        if (interfaceC40178n != null) {
                            interfaceC40170fCreateDataSource.addTransferListener(interfaceC40178n);
                        }
                        C12876o c12876o2 = c12876o;
                        i14 = 0;
                        i15 = i28;
                        C25279g c25279g3 = new C25279g(c12862a.f44201b, iArr3, c34610pArr, new C12873l((C5327g1) c0682h0.f2434z, interfaceC28988l, c14261c, c0072g, i37, iArr4, interfaceC27679s2, i38, interfaceC40170fCreateDataSource, j13, c0682h0.f2432x, z14, arrayList, c12876o), this, this.f44214I, j7, this.f44234z, this.f44221P, this.f44210E, this.f44220O, this.f44229X);
                        synchronized (this) {
                            this.f44219N.put(c25279g3, c12876o2);
                        }
                        interfaceC23540z0Arr[i15] = c25279g3;
                    } else {
                        iArr = iArr2;
                        i14 = i18;
                        i15 = i28;
                        if (i29 == 2) {
                            interfaceC23540z0Arr[i15] = new C12874m((C14265g) this.f44228W.get(c12862a.f44203d), interfaceC27679s2.mo68078j().f145799d[i14], this.f44226U.f52065d);
                        }
                    }
                } else {
                    iArr = iArr2;
                    i14 = i18;
                    i15 = i28;
                    if (interfaceC23540z4 instanceof C25279g) {
                        ((C25279g) interfaceC23540z4).f99199E.f44306j = interfaceC27679s2;
                    }
                }
            }
            i28 = i15 + 1;
            i18 = i14;
            iArr2 = iArr;
            i13 = -1;
            z4 = true;
        }
        int[] iArr5 = iArr2;
        boolean z15 = i18;
        int i39 = z15 ? 1 : 0;
        while (i39 < interfaceC27679sArr.length) {
            if (interfaceC23540z0Arr[i39] == null && interfaceC27679sArr[i39] != null) {
                C12862a c12862a2 = this.f44216K[iArr5[i39]];
                if (c12862a2.f44202c == 1) {
                    iArr5 = iArr5;
                    int iM36127j2 = m36127j(iArr5, i39);
                    if (iM36127j2 == -1) {
                        interfaceC23540z0Arr[i39] = new C23521q();
                    } else {
                        C25279g c25279g4 = (C25279g) interfaceC23540z0Arr[iM36127j2];
                        int i44 = c12862a2.f44201b;
                        boolean[] zArr5 = c25279g4.f99223z;
                        C23538y0[] c23538y0Arr = c25279g4.f99208N;
                        int i45 = z15 ? 1 : 0;
                        while (true) {
                            if (i45 >= c23538y0Arr.length) {
                                throw new IllegalStateException();
                            }
                            if (c25279g4.f99221x[i45] == i44) {
                                AbstractC35849g.m113807i(!zArr5[i45]);
                                zArr5[i45] = true;
                                c23538y0Arr[i45].m68138u(j7, true);
                                interfaceC23540z0Arr[i39] = new C25277e(c25279g4, c25279g4, c23538y0Arr[i45], i45);
                                break;
                            }
                            i45++;
                        }
                    }
                }
                i39++;
                iArr5 = iArr5;
            }
            i39++;
            iArr5 = iArr5;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = interfaceC23540z0Arr.length;
        for (int i46 = z15 ? 1 : 0; i46 < length; i46++) {
            InterfaceC23540z0 interfaceC23540z5 = interfaceC23540z0Arr[i46];
            if (interfaceC23540z5 instanceof C25279g) {
                arrayList2.add((C25279g) interfaceC23540z5);
            } else if (interfaceC23540z5 instanceof C12874m) {
                arrayList3.add((C12874m) interfaceC23540z5);
            }
        }
        C25279g[] c25279gArr = new C25279g[arrayList2.size()];
        this.f44223R = c25279gArr;
        arrayList2.toArray(c25279gArr);
        C12874m[] c12874mArr = new C12874m[arrayList3.size()];
        this.f44224S = c12874mArr;
        arrayList3.toArray(c12874mArr);
        C15553a c15553a = this.f44217L;
        AbstractList abstractListM133290t = AbstractC41047q.m133290t(arrayList2, new C5538l(21));
        c15553a.getClass();
        this.f44225T = new C23511l(arrayList2, abstractListM133290t);
        if (this.f44229X) {
            this.f44229X = z15;
            this.f44230Y = j7;
        }
        return j7;
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: x */
    public final boolean mo36134x(C2856o0 c2856o0) {
        return this.f44225T.mo36134x(c2856o0);
    }
}
