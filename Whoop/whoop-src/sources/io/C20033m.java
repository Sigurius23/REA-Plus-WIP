package io;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import g73.C15556d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicReference;
import p087db.C11858k0;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p465rm.C31521c0;
import p465rm.C31581z;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41058v0;
import p690zr.C41057v;
import p690zr.C41060w0;
import sn.C32766w0;
import sn.C32768x0;

/* JADX INFO: renamed from: io.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C20033m extends AbstractC20038r {

    /* JADX INFO: renamed from: e */
    public static final AbstractC41058v0 f75160e = new C41057v(new C11858k0(8));

    /* JADX INFO: renamed from: f */
    public static final AbstractC41058v0 f75161f = new C41057v(new C11858k0(9));

    /* JADX INFO: renamed from: c */
    public final C15556d f75162c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f75163d;

    public C20033m(Context context) {
        C15556d c15556d = new C15556d(7);
        int i13 = C18744f.f73655o0;
        C18744f c18744f = new C18744f(new C18745g(context));
        this.f75162c = c15556d;
        this.f75163d = new AtomicReference(c18744f);
    }

    /* JADX INFO: renamed from: a */
    public static int m55866a(C31521c0 c31521c0, String str, boolean z4) {
        if (!TextUtils.isEmpty(str) && str.equals(c31521c0.f130100y)) {
            return 4;
        }
        String strM55869d = m55869d(str);
        String strM55869d2 = m55869d(c31521c0.f130100y);
        if (strM55869d2 == null || strM55869d == null) {
            return (z4 && strM55869d2 == null) ? 1 : 0;
        }
        if (strM55869d2.startsWith(strM55869d) || strM55869d.startsWith(strM55869d2)) {
            return 3;
        }
        int i13 = AbstractC24567y.f95875a;
        return strM55869d2.split("-", 2)[0].equals(strM55869d.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m55867b(int i13, boolean z4) {
        int i14 = i13 & 7;
        if (i14 != 4) {
            return z4 && i14 == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static void m55868c(SparseArray sparseArray, C20708t c20708t, int i13) {
        if (c20708t == null) {
            return;
        }
        int iM71613g = AbstractC24555m.m71613g(c20708t.f77527w.f136262y[0].f130077L);
        Pair pair = (Pair) sparseArray.get(iM71613g);
        if (pair == null || ((C20708t) pair.first).f77528x.isEmpty()) {
            sparseArray.put(iM71613g, Pair.create(c20708t, Integer.valueOf(i13)));
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m55869d(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static Pair m55870e(int i13, C20037q c20037q, int[][][] iArr, InterfaceC19980j interfaceC19980j, Comparator comparator) {
        int i14;
        RandomAccess randomAccessM133256r;
        C20037q c20037q2 = c20037q;
        ArrayList arrayList = new ArrayList();
        int i15 = c20037q2.f75166a;
        int i16 = 0;
        while (i16 < i15) {
            if (i13 == c20037q2.f75167b[i16]) {
                C32768x0 c32768x0 = c20037q2.f75168c[i16];
                for (int i17 = 0; i17 < c32768x0.f136270w; i17++) {
                    C32766w0 c32766w0M102758a = c32768x0.m102758a(i17);
                    C41060w0 c41060w0Mo13592b = interfaceC19980j.mo13592b(i16, c32766w0M102758a, iArr[i16][i17]);
                    int i18 = c32766w0M102758a.f136260w;
                    boolean[] zArr = new boolean[i18];
                    int i19 = 0;
                    while (i19 < i18) {
                        AbstractC19981k abstractC19981k = (AbstractC19981k) c41060w0Mo13592b.get(i19);
                        int iMo54507a = abstractC19981k.mo54507a();
                        if (zArr[i19] || iMo54507a == 0) {
                            i14 = i15;
                        } else {
                            if (iMo54507a == 1) {
                                randomAccessM133256r = AbstractC41023g0.m133256r(abstractC19981k);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC19981k);
                                int i24 = i19 + 1;
                                while (i24 < i18) {
                                    AbstractC19981k abstractC19981k2 = (AbstractC19981k) c41060w0Mo13592b.get(i24);
                                    int i25 = i15;
                                    if (abstractC19981k2.mo54507a() == 2 && abstractC19981k.mo54508b(abstractC19981k2)) {
                                        arrayList2.add(abstractC19981k2);
                                        zArr[i24] = true;
                                    }
                                    i24++;
                                    i15 = i25;
                                }
                                randomAccessM133256r = arrayList2;
                            }
                            i14 = i15;
                            arrayList.add(randomAccessM133256r);
                        }
                        i19++;
                        i15 = i14;
                    }
                }
            }
            i16++;
            c20037q2 = c20037q;
            i15 = i15;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i26 = 0; i26 < list.size(); i26++) {
            iArr2[i26] = ((AbstractC19981k) list.get(i26)).f74966y;
        }
        AbstractC19981k abstractC19981k3 = (AbstractC19981k) list.get(0);
        return Pair.create(new C20034n(0, abstractC19981k3.f74965x, iArr2), Integer.valueOf(abstractC19981k3.f74964w));
    }

    /* JADX INFO: renamed from: f */
    public final void m55871f(C18744f c18744f) {
        C31581z c31581z;
        c18744f.getClass();
        if (((C18744f) this.f75163d.getAndSet(c18744f)).equals(c18744f) || (c31581z = this.f75170a) == null) {
            return;
        }
        c31581z.f130483H.m71650c(10);
    }
}
