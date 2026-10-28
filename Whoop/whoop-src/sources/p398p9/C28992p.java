package p398p9;

import java.util.ArrayList;
import java.util.Collections;
import p318m3.C24977g;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: p9.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C28992p {

    /* JADX INFO: renamed from: g */
    public static final C24977g f117269g = new C24977g(15);

    /* JADX INFO: renamed from: h */
    public static final C24977g f117270h = new C24977g(16);

    /* JADX INFO: renamed from: d */
    public int f117274d;

    /* JADX INFO: renamed from: e */
    public int f117275e;

    /* JADX INFO: renamed from: f */
    public int f117276f;

    /* JADX INFO: renamed from: b */
    public final C28991o[] f117272b = new C28991o[5];

    /* JADX INFO: renamed from: a */
    public final ArrayList f117271a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public int f117273c = -1;

    /* JADX INFO: renamed from: a */
    public final void m88010a(float f13, int i13) {
        C28991o c28991o;
        int i14 = this.f117273c;
        ArrayList arrayList = this.f117271a;
        if (i14 != 1) {
            Collections.sort(arrayList, f117269g);
            this.f117273c = 1;
        }
        int i15 = this.f117276f;
        C28991o[] c28991oArr = this.f117272b;
        if (i15 > 0) {
            int i16 = i15 - 1;
            this.f117276f = i16;
            c28991o = c28991oArr[i16];
        } else {
            c28991o = new C28991o();
        }
        int i17 = this.f117274d;
        this.f117274d = i17 + 1;
        c28991o.f117266a = i17;
        c28991o.f117267b = i13;
        c28991o.f117268c = f13;
        arrayList.add(c28991o);
        this.f117275e += i13;
        while (true) {
            int i18 = this.f117275e;
            if (i18 <= 2000) {
                return;
            }
            int i19 = i18 - 2000;
            C28991o c28991o2 = (C28991o) arrayList.get(0);
            int i24 = c28991o2.f117267b;
            if (i24 <= i19) {
                this.f117275e -= i24;
                arrayList.remove(0);
                int i25 = this.f117276f;
                if (i25 < 5) {
                    this.f117276f = i25 + 1;
                    c28991oArr[i25] = c28991o2;
                }
            } else {
                c28991o2.f117267b = i24 - i19;
                this.f117275e -= i19;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m88011b() {
        int i13 = this.f117273c;
        ArrayList arrayList = this.f117271a;
        if (i13 != 0) {
            Collections.sort(arrayList, f117270h);
            this.f117273c = 0;
        }
        float f13 = 0.5f * this.f117275e;
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            C28991o c28991o = (C28991o) arrayList.get(i15);
            i14 += c28991o.f117267b;
            if (i14 >= f13) {
                return c28991o.f117268c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C28991o) AbstractC25012a.m73371d(arrayList, 1)).f117268c;
    }
}
