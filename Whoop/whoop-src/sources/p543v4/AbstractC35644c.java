package p543v4;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import p006a4.AbstractC0354a;
import p107e3.AbstractC12601b;
import p460rg.AbstractC31375j;
import p462ri.C31441a;

/* JADX INFO: renamed from: v4.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC35644c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f151453a = 0;

    static {
        new ThreadLocal();
    }

    /* JADX INFO: renamed from: a */
    public static void m112843a(int i13, C31441a c31441a) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC12601b.m35318e(c31441a, i13 != 0 ? AbstractC0354a.m984x(i13) : null);
        } else if (i13 == 0) {
            c31441a.setXfermode(null);
        } else {
            PorterDuff.Mode modeM96493i = AbstractC31375j.m96493i(i13);
            c31441a.setXfermode(modeM96493i != null ? new PorterDuffXfermode(modeM96493i) : null);
        }
    }
}
