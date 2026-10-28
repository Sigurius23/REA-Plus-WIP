package sn;

import java.util.Arrays;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p309lo.AbstractC24543a;
import p465rm.C31521c0;
import p465rm.InterfaceC31529f;
import q63.AbstractC30007c;
import sm.C32710c;

/* JADX INFO: renamed from: sn.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32766w0 implements InterfaceC31529f {

    /* JADX INFO: renamed from: E */
    public static final C32710c f136259E = new C32710c(24);

    /* JADX INFO: renamed from: w */
    public final int f136260w;

    /* JADX INFO: renamed from: x */
    public final String f136261x;

    /* JADX INFO: renamed from: y */
    public final C31521c0[] f136262y;

    /* JADX INFO: renamed from: z */
    public int f136263z;

    public C32766w0(String str, C31521c0... c31521c0Arr) {
        AbstractC24543a.m71569e(c31521c0Arr.length > 0);
        this.f136261x = str;
        this.f136262y = c31521c0Arr;
        this.f136260w = c31521c0Arr.length;
        String str2 = c31521c0Arr[0].f130100y;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i13 = c31521c0Arr[0].f130070E | DfuBaseService.ERROR_CONNECTION_MASK;
        for (int i14 = 1; i14 < c31521c0Arr.length; i14++) {
            String str3 = c31521c0Arr[i14].f130100y;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                m102756b(i14, "languages", c31521c0Arr[0].f130100y, c31521c0Arr[i14].f130100y);
                return;
            } else {
                if (i13 != (c31521c0Arr[i14].f130070E | DfuBaseService.ERROR_CONNECTION_MASK)) {
                    m102756b(i14, "role flags", Integer.toBinaryString(c31521c0Arr[0].f130070E), Integer.toBinaryString(c31521c0Arr[i14].f130070E));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m102756b(int i13, String str, String str2, String str3) {
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(AbstractC30007c.m91832b(str.length() + 78, str2), str3));
        sb4.append("Different ");
        sb4.append(str);
        sb4.append(" combined in one TrackGroup: '");
        sb4.append(str2);
        sb4.append("' (track 0) and '");
        sb4.append(str3);
        sb4.append("' (track ");
        sb4.append(i13);
        sb4.append(")");
        AbstractC24543a.m71578n("TrackGroup", "", new IllegalStateException(sb4.toString()));
    }

    /* JADX INFO: renamed from: a */
    public final int m102757a(C31521c0 c31521c0) {
        int i13 = 0;
        while (true) {
            C31521c0[] c31521c0Arr = this.f136262y;
            if (i13 >= c31521c0Arr.length) {
                return -1;
            }
            if (c31521c0 == c31521c0Arr[i13]) {
                return i13;
            }
            i13++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C32766w0.class == obj.getClass()) {
            C32766w0 c32766w0 = (C32766w0) obj;
            if (this.f136260w == c32766w0.f136260w && this.f136261x.equals(c32766w0.f136261x) && Arrays.equals(this.f136262y, c32766w0.f136262y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f136263z == 0) {
            this.f136263z = AbstractC11266d.m30450d(527, 31, this.f136261x) + Arrays.hashCode(this.f136262y);
        }
        return this.f136263z;
    }
}
