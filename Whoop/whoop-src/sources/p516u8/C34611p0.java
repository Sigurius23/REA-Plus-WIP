package p516u8;

import java.util.Arrays;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: u8.p0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34611p0 {

    /* JADX INFO: renamed from: a */
    public final int f145796a;

    /* JADX INFO: renamed from: b */
    public final String f145797b;

    /* JADX INFO: renamed from: c */
    public final int f145798c;

    /* JADX INFO: renamed from: d */
    public final C34610p[] f145799d;

    /* JADX INFO: renamed from: e */
    public int f145800e;

    static {
        AbstractC38065t.m121892F(0);
        AbstractC38065t.m121892F(1);
    }

    public C34611p0(String str, C34610p... c34610pArr) {
        AbstractC35849g.m113802d(c34610pArr.length > 0);
        this.f145797b = str;
        this.f145799d = c34610pArr;
        this.f145796a = c34610pArr.length;
        int iM109376i = AbstractC34587d0.m109376i(c34610pArr[0].f145783n);
        this.f145798c = iM109376i == -1 ? AbstractC34587d0.m109376i(c34610pArr[0].f145782m) : iM109376i;
        String str2 = c34610pArr[0].f145773d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i13 = c34610pArr[0].f145775f | DfuBaseService.ERROR_CONNECTION_MASK;
        for (int i14 = 1; i14 < c34610pArr.length; i14++) {
            String str3 = c34610pArr[i14].f145773d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                m109412a(i14, "languages", c34610pArr[0].f145773d, c34610pArr[i14].f145773d);
                return;
            } else {
                if (i13 != (c34610pArr[i14].f145775f | DfuBaseService.ERROR_CONNECTION_MASK)) {
                    m109412a(i14, "role flags", Integer.toBinaryString(c34610pArr[0].f145775f), Integer.toBinaryString(c34610pArr[i14].f145775f));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m109412a(int i13, String str, String str2, String str3) {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbM32001t.append(str3);
        sbM32001t.append("' (track ");
        sbM32001t.append(i13);
        sbM32001t.append(")");
        AbstractC38046a.m121813h("TrackGroup", "", new IllegalStateException(sbM32001t.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C34611p0.class == obj.getClass()) {
            C34611p0 c34611p0 = (C34611p0) obj;
            if (this.f145797b.equals(c34611p0.f145797b) && Arrays.equals(this.f145799d, c34611p0.f145799d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f145800e == 0) {
            this.f145800e = Arrays.hashCode(this.f145799d) + AbstractC11266d.m30450d(527, 31, this.f145797b);
        }
        return this.f145800e;
    }

    public final String toString() {
        return this.f145797b + ": " + Arrays.toString(this.f145799d);
    }
}
