package p284ko;

import java.util.ArrayList;
import java.util.Collections;
import p087db.C11858k0;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: ko.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C22621h0 {

    /* JADX INFO: renamed from: h */
    public static final C11858k0 f88987h = new C11858k0(27);

    /* JADX INFO: renamed from: i */
    public static final C11858k0 f88988i = new C11858k0(28);

    /* JADX INFO: renamed from: a */
    public final int f88989a;

    /* JADX INFO: renamed from: e */
    public int f88993e;

    /* JADX INFO: renamed from: f */
    public int f88994f;

    /* JADX INFO: renamed from: g */
    public int f88995g;

    /* JADX INFO: renamed from: c */
    public final C22619g0[] f88991c = new C22619g0[5];

    /* JADX INFO: renamed from: b */
    public final ArrayList f88990b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public int f88992d = -1;

    public C22621h0(int i13) {
        this.f88989a = i13;
    }

    /* JADX INFO: renamed from: a */
    public final void m65563a(float f13, int i13) {
        C22619g0 c22619g0;
        int i14 = this.f88992d;
        ArrayList arrayList = this.f88990b;
        if (i14 != 1) {
            Collections.sort(arrayList, f88987h);
            this.f88992d = 1;
        }
        int i15 = this.f88995g;
        C22619g0[] c22619g0Arr = this.f88991c;
        if (i15 > 0) {
            int i16 = i15 - 1;
            this.f88995g = i16;
            c22619g0 = c22619g0Arr[i16];
        } else {
            c22619g0 = new C22619g0();
        }
        int i17 = this.f88993e;
        this.f88993e = i17 + 1;
        c22619g0.f88978a = i17;
        c22619g0.f88979b = i13;
        c22619g0.f88980c = f13;
        arrayList.add(c22619g0);
        this.f88994f += i13;
        while (true) {
            int i18 = this.f88994f;
            int i19 = this.f88989a;
            if (i18 <= i19) {
                return;
            }
            int i24 = i18 - i19;
            C22619g0 c22619g1 = (C22619g0) arrayList.get(0);
            int i25 = c22619g1.f88979b;
            if (i25 <= i24) {
                this.f88994f -= i25;
                arrayList.remove(0);
                int i26 = this.f88995g;
                if (i26 < 5) {
                    this.f88995g = i26 + 1;
                    c22619g0Arr[i26] = c22619g1;
                }
            } else {
                c22619g1.f88979b = i25 - i24;
                this.f88994f -= i24;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m65564b() {
        int i13 = this.f88992d;
        ArrayList arrayList = this.f88990b;
        if (i13 != 0) {
            Collections.sort(arrayList, f88988i);
            this.f88992d = 0;
        }
        float f13 = 0.5f * this.f88994f;
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            C22619g0 c22619g0 = (C22619g0) arrayList.get(i15);
            i14 += c22619g0.f88979b;
            if (i14 >= f13) {
                return c22619g0.f88980c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C22619g0) AbstractC25012a.m73371d(arrayList, 1)).f88980c;
    }
}
