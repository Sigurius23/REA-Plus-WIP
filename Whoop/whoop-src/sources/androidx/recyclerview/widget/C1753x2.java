package androidx.recyclerview.widget;

import android.text.TextUtils;
import p309lo.AbstractC24543a;
import p460rg.AbstractC31375j;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: androidx.recyclerview.widget.x2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1753x2 {

    /* JADX INFO: renamed from: a */
    public int f6931a;

    /* JADX INFO: renamed from: b */
    public int f6932b;

    /* JADX INFO: renamed from: c */
    public int f6933c;

    /* JADX INFO: renamed from: d */
    public int f6934d;

    /* JADX INFO: renamed from: e */
    public int f6935e;

    public /* synthetic */ C1753x2(int i13, int i14, int i15, int i16, int i17) {
        this.f6931a = i13;
        this.f6932b = i14;
        this.f6933c = i15;
        this.f6934d = i16;
        this.f6935e = i17;
    }

    /* JADX INFO: renamed from: b */
    public static C1753x2 m5347b(String str) {
        AbstractC24543a.m71569e(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < strArrSplit.length; i17++) {
            String strM96499o = AbstractC31375j.m96499o(strArrSplit[i17].trim());
            strM96499o.getClass();
            switch (strM96499o) {
                case "end":
                    i14 = i17;
                    break;
                case "text":
                    i16 = i17;
                    break;
                case "start":
                    i13 = i17;
                    break;
                case "style":
                    i15 = i17;
                    break;
            }
        }
        if (i13 == -1 || i14 == -1 || i16 == -1) {
            return null;
        }
        return new C1753x2(i13, i14, i15, i16, strArrSplit.length);
    }

    /* JADX INFO: renamed from: c */
    public static C1753x2 m5348c(String str) {
        AbstractC35849g.m113802d(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < strArrSplit.length; i17++) {
            String strM96499o = AbstractC31375j.m96499o(strArrSplit[i17].trim());
            strM96499o.getClass();
            switch (strM96499o) {
                case "end":
                    i14 = i17;
                    break;
                case "text":
                    i16 = i17;
                    break;
                case "start":
                    i13 = i17;
                    break;
                case "style":
                    i15 = i17;
                    break;
            }
        }
        if (i13 == -1 || i14 == -1 || i16 == -1) {
            return null;
        }
        return new C1753x2(i13, i14, i15, i16, strArrSplit.length);
    }

    /* JADX INFO: renamed from: a */
    public boolean m5349a() {
        int i13;
        int i14;
        int i15;
        int i16 = this.f6931a;
        int i17 = 2;
        if ((i16 & 7) != 0) {
            int i18 = this.f6934d;
            int i19 = this.f6932b;
            if (i18 > i19) {
                i15 = 1;
            } else {
                i15 = i18 == i19 ? 2 : 4;
            }
            if ((i15 & i16) == 0) {
                return false;
            }
        }
        if ((i16 & 112) != 0) {
            int i24 = this.f6934d;
            int i25 = this.f6933c;
            if (i24 > i25) {
                i14 = 1;
            } else {
                i14 = i24 == i25 ? 2 : 4;
            }
            if (((i14 << 4) & i16) == 0) {
                return false;
            }
        }
        if ((i16 & 1792) != 0) {
            int i26 = this.f6935e;
            int i27 = this.f6932b;
            if (i26 > i27) {
                i13 = 1;
            } else {
                i13 = i26 == i27 ? 2 : 4;
            }
            if (((i13 << 8) & i16) == 0) {
                return false;
            }
        }
        if ((i16 & 28672) != 0) {
            int i28 = this.f6935e;
            int i29 = this.f6933c;
            if (i28 > i29) {
                i17 = 1;
            } else if (i28 != i29) {
                i17 = 4;
            }
            if ((i16 & (i17 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
