package p384ow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import p440qw.C30668c;
import p536uw.AbstractC35290c;
import p536uw.C35289b;
import rw.AbstractC31855e;
import rw.AbstractC31869s;
import rw.C31852b;
import rw.C31867q;

/* JADX INFO: renamed from: ow.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C28418n {

    /* JADX INFO: renamed from: a */
    public final C30668c f114625a = C30668c.f126207y;

    /* JADX INFO: renamed from: b */
    public final int f114626b = 1;

    /* JADX INFO: renamed from: c */
    public final C28404a f114627c = EnumC28412h.f114603w;

    /* JADX INFO: renamed from: d */
    public final HashMap f114628d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final ArrayList f114629e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f114630f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public boolean f114631g = false;

    /* JADX INFO: renamed from: h */
    public final int f114632h;

    /* JADX INFO: renamed from: i */
    public final int f114633i;

    /* JADX INFO: renamed from: j */
    public boolean f114634j;

    /* JADX INFO: renamed from: k */
    public final C28413i f114635k;

    /* JADX INFO: renamed from: l */
    public int f114636l;

    /* JADX INFO: renamed from: m */
    public final boolean f114637m;

    /* JADX INFO: renamed from: n */
    public EnumC28428x f114638n;

    /* JADX INFO: renamed from: o */
    public final C28425u f114639o;

    /* JADX INFO: renamed from: p */
    public final ArrayDeque f114640p;

    public C28418n() {
        C28413i c28413i = C28417m.f114613j;
        this.f114632h = 2;
        this.f114633i = 2;
        this.f114634j = true;
        this.f114635k = C28417m.f114613j;
        this.f114636l = 0;
        this.f114637m = true;
        this.f114638n = C28417m.f114614k;
        this.f114639o = C28417m.f114615l;
        this.f114640p = new ArrayDeque();
    }

    /* JADX INFO: renamed from: a */
    public final C28417m m86138a() {
        C31867q c31867q;
        C31867q c31867q2;
        ArrayList arrayList = this.f114629e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f114630f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z4 = AbstractC35290c.f150281a;
        int i13 = this.f114632h;
        int i14 = this.f114633i;
        if (i13 != 2 || i14 != 2) {
            C31852b c31852b = new C31852b(AbstractC31855e.f132113b, i13, i14);
            C31867q c31867q3 = AbstractC31869s.f132160a;
            int i15 = 0;
            C31867q c31867q4 = new C31867q(Date.class, c31852b, i15);
            if (z4) {
                C35289b c35289b = AbstractC35290c.f150283c;
                c35289b.getClass();
                c31867q = new C31867q(c35289b.f132114a, new C31852b(c35289b, i13, i14), i15);
                C35289b c35289b2 = AbstractC35290c.f150282b;
                c35289b2.getClass();
                c31867q2 = new C31867q(c35289b2.f132114a, new C31852b(c35289b2, i13, i14), i15);
            } else {
                c31867q = null;
                c31867q2 = null;
            }
            arrayList3.add(c31867q4);
            if (z4) {
                arrayList3.add(c31867q);
                arrayList3.add(c31867q2);
            }
        }
        HashMap map = new HashMap(this.f114628d);
        boolean z13 = this.f114631g;
        boolean z14 = this.f114634j;
        int i16 = this.f114636l;
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        return new C28417m(this.f114625a, this.f114627c, map, z13, z14, this.f114635k, i16, this.f114637m, this.f114626b, arrayList3, this.f114638n, this.f114639o, new ArrayList(this.f114640p));
    }
}
