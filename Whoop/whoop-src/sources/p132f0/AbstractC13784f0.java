package p132f0;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: f0.f0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13784f0 {

    /* JADX INFO: renamed from: a */
    public static final float f49177a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b */
    public static final double f49178b;

    /* JADX INFO: renamed from: c */
    public static final double f49179c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f49178b = dLog;
        f49179c = dLog - 1.0d;
    }
}
