package xz2;

import android.content.Context;
import com.whoop.service.network.model.cycles.Recovery;
import in2.AbstractC18738j;
import pz2.AbstractC29649b;

/* JADX INFO: renamed from: xz2.b */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC38769b {
    /* JADX INFO: renamed from: a */
    private static int m124304a(Context context, int i13, boolean z4) {
        return AbstractC18738j.m54485c(context, m124306c(i13, z4));
    }

    /* JADX INFO: renamed from: b */
    public static int m124305b(Context context, Recovery recovery) {
        return m124304a(context, m124307d(recovery), false);
    }

    /* JADX INFO: renamed from: c */
    private static int m124306c(int i13, boolean z4) {
        if (i13 <= 0) {
            return AbstractC29649b.f121092g;
        }
        if (i13 <= 33) {
            return z4 ? AbstractC29649b.f121089d : AbstractC29649b.f121088c;
        }
        if (i13 > 66) {
            return z4 ? AbstractC29649b.f121087b : AbstractC29649b.f121086a;
        }
        return z4 ? AbstractC29649b.f121091f : AbstractC29649b.f121090e;
    }

    /* JADX INFO: renamed from: d */
    public static int m124307d(Recovery recovery) {
        if (recovery == null || recovery.isCurrentlyBlackedOut() || recovery.isIncomplete() || recovery.isCalibrating()) {
            return -1;
        }
        return recovery.getScore();
    }
}
