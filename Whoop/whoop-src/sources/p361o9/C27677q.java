package p361o9;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import ng3.C26702o;
import p027b3.AbstractC2351b;
import p031b9.C2848l0;
import p299l9.C23501g1;
import p318m3.C24977g;
import p516u8.C34586d;
import p516u8.C34610p;
import p516u8.C34611p0;
import p516u8.C34613q0;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41058v0;
import p690zr.C41057v;
import p690zr.C41060w0;

/* JADX INFO: renamed from: o9.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C27677q extends AbstractC2351b {

    /* JADX INFO: renamed from: j */
    public static final AbstractC41058v0 f111422j = new C41057v(new C24977g(5));

    /* JADX INFO: renamed from: d */
    public final Object f111423d;

    /* JADX INFO: renamed from: e */
    public final Context f111424e;

    /* JADX INFO: renamed from: f */
    public final C26702o f111425f;

    /* JADX INFO: renamed from: g */
    public C27670j f111426g;

    /* JADX INFO: renamed from: h */
    public C27672l f111427h;

    /* JADX INFO: renamed from: i */
    public C34586d f111428i;

    public C27677q(Context context) {
        C26702o c26702o = new C26702o(8, false);
        C27670j c27670j = C27670j.f111376D;
        this.f111423d = new Object();
        this.f111424e = context != null ? context.getApplicationContext() : null;
        this.f111425f = c26702o;
        if (c27670j != null) {
            this.f111426g = c27670j;
        } else {
            c27670j.getClass();
            C27669i c27669i = new C27669i(c27670j);
            c27669i.m109414b(c27670j);
            this.f111426g = new C27670j(c27669i);
        }
        this.f111428i = C34586d.f145642c;
        if (this.f111426g.f111384y && context == null) {
            AbstractC38046a.m121826u("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m83670L(C23501g1 c23501g1, C27670j c27670j, HashMap map) {
        for (int i13 = 0; i13 < c23501g1.f93027a; i13++) {
            C34613q0 c34613q0 = (C34613q0) c27670j.f145850s.get(c23501g1.m68058a(i13));
            if (c34613q0 != null) {
                C34611p0 c34611p0 = c34613q0.f145803a;
                C34613q0 c34613q1 = (C34613q0) map.get(Integer.valueOf(c34611p0.f145798c));
                if (c34613q1 == null || (c34613q1.f145804b.isEmpty() && !c34613q0.f145804b.isEmpty())) {
                    map.put(Integer.valueOf(c34611p0.f145798c), c34613q0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static int m83671M(C34610p c34610p, String str, boolean z4) {
        if (!TextUtils.isEmpty(str) && str.equals(c34610p.f145773d)) {
            return 4;
        }
        String strM83672P = m83672P(str);
        String strM83672P2 = m83672P(c34610p.f145773d);
        if (strM83672P2 == null || strM83672P == null) {
            return (z4 && strM83672P2 == null) ? 1 : 0;
        }
        if (strM83672P2.startsWith(strM83672P) || strM83672P.startsWith(strM83672P2)) {
            return 3;
        }
        int i13 = AbstractC38065t.f163031a;
        return strM83672P2.split("-", 2)[0].equals(strM83672P.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX INFO: renamed from: P */
    public static String m83672P(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: Q */
    public static Pair m83673Q(int i13, C27681u c27681u, int[][][] iArr, InterfaceC27674n interfaceC27674n, Comparator comparator) {
        int i14;
        RandomAccess randomAccessM133256r;
        C27681u c27681u2 = c27681u;
        ArrayList arrayList = new ArrayList();
        int i15 = c27681u2.f111431a;
        int i16 = 0;
        while (i16 < i15) {
            if (i13 == c27681u2.f111432b[i16]) {
                C23501g1 c23501g1 = c27681u2.f111433c[i16];
                for (int i17 = 0; i17 < c23501g1.f93027a; i17++) {
                    C34611p0 c34611p0M68058a = c23501g1.m68058a(i17);
                    C41060w0 c41060w0Mo8620c = interfaceC27674n.mo8620c(i16, c34611p0M68058a, iArr[i16][i17]);
                    int i18 = c34611p0M68058a.f145796a;
                    boolean[] zArr = new boolean[i18];
                    int i19 = 0;
                    while (i19 < i18) {
                        AbstractC27675o abstractC27675o = (AbstractC27675o) c41060w0Mo8620c.get(i19);
                        int iMo83659a = abstractC27675o.mo83659a();
                        if (zArr[i19] || iMo83659a == 0) {
                            i14 = i15;
                        } else {
                            if (iMo83659a == 1) {
                                randomAccessM133256r = AbstractC41023g0.m133256r(abstractC27675o);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC27675o);
                                int i24 = i19 + 1;
                                while (i24 < i18) {
                                    AbstractC27675o abstractC27675o2 = (AbstractC27675o) c41060w0Mo8620c.get(i24);
                                    int i25 = i15;
                                    if (abstractC27675o2.mo83659a() == 2 && abstractC27675o.mo83660b(abstractC27675o2)) {
                                        arrayList2.add(abstractC27675o2);
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
            c27681u2 = c27681u;
            i15 = i15;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i26 = 0; i26 < list.size(); i26++) {
            iArr2[i26] = ((AbstractC27675o) list.get(i26)).f111402y;
        }
        AbstractC27675o abstractC27675o3 = (AbstractC27675o) list.get(0);
        return Pair.create(new C27678r(0, abstractC27675o3.f111401x, iArr2), Integer.valueOf(abstractC27675o3.f111400w));
    }

    /* JADX INFO: renamed from: N */
    public final C27670j m83674N() {
        C27670j c27670j;
        synchronized (this.f111423d) {
            c27670j = this.f111426g;
        }
        return c27670j;
    }

    /* JADX INFO: renamed from: O */
    public final void m83675O() {
        boolean z4;
        C2848l0 c2848l0;
        C27672l c27672l;
        synchronized (this.f111423d) {
            try {
                z4 = this.f111426g.f111384y && AbstractC38065t.f163031a >= 32 && (c27672l = this.f111427h) != null && c27672l.f111388b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z4 || (c2848l0 = (C2848l0) this.f9291b) == null) {
            return;
        }
        c2848l0.f11261H.m121881e(10);
    }

    /* JADX INFO: renamed from: R */
    public final void m83676R(C27670j c27670j) {
        boolean zEquals;
        c27670j.getClass();
        synchronized (this.f111423d) {
            zEquals = this.f111426g.equals(c27670j);
            this.f111426g = c27670j;
        }
        if (zEquals) {
            return;
        }
        if (c27670j.f111384y && this.f111424e == null) {
            AbstractC38046a.m121826u("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        C2848l0 c2848l0 = (C2848l0) this.f9291b;
        if (c2848l0 != null) {
            c2848l0.f11261H.m121881e(10);
        }
    }
}
