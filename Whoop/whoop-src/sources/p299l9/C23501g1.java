package p299l9;

import p516u8.C34611p0;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.C41060w0;

/* JADX INFO: renamed from: l9.g1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23501g1 {

    /* JADX INFO: renamed from: d */
    public static final C23501g1 f93026d = new C23501g1(new C34611p0[0]);

    /* JADX INFO: renamed from: a */
    public final int f93027a;

    /* JADX INFO: renamed from: b */
    public final C41060w0 f93028b;

    /* JADX INFO: renamed from: c */
    public int f93029c;

    static {
        AbstractC38065t.m121892F(0);
    }

    public C23501g1(C34611p0... c34611p0Arr) {
        C41060w0 c41060w0M133253n = AbstractC41023g0.m133253n(c34611p0Arr);
        this.f93028b = c41060w0M133253n;
        this.f93027a = c34611p0Arr.length;
        int i13 = 0;
        while (i13 < c41060w0M133253n.f177069z) {
            int i14 = i13 + 1;
            for (int i15 = i14; i15 < c41060w0M133253n.f177069z; i15++) {
                if (((C34611p0) c41060w0M133253n.get(i13)).equals(c41060w0M133253n.get(i15))) {
                    AbstractC38046a.m121813h("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i13 = i14;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C34611p0 m68058a(int i13) {
        return (C34611p0) this.f93028b.get(i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23501g1.class != obj.getClass()) {
            return false;
        }
        C23501g1 c23501g1 = (C23501g1) obj;
        return this.f93027a == c23501g1.f93027a && this.f93028b.equals(c23501g1.f93028b);
    }

    public final int hashCode() {
        if (this.f93029c == 0) {
            this.f93029c = this.f93028b.hashCode();
        }
        return this.f93029c;
    }

    public final String toString() {
        return this.f93028b.toString();
    }
}
