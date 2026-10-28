package p318m3;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* JADX INFO: renamed from: m3.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24984n {

    /* JADX INFO: renamed from: a */
    public static final C24982l f97780a = new C24982l();

    /* JADX INFO: renamed from: b */
    public static final long f97781b;

    static {
        long j7 = 0;
        f97781b = (j7 & 4294967295L) | (j7 << 32);
    }

    /* JADX INFO: renamed from: a */
    public static final TextDirectionHeuristic m73317a(int i13) {
        if (i13 == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i13 == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i13 == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i13 == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i13 != 4) {
            return i13 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }
}
