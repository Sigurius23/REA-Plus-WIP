package kd1;

import android.view.Window;
import p208i2.AbstractC17918w0;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: kd1.e0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroid/view/Window;", "Li2/x;", "statusBarColor", "navigationBarColor", "Ll83/a0;", "a", "(Landroid/view/Window;JJ)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22393e0 {
    /* JADX INFO: renamed from: a */
    public static final void m64451a(Window window, long j7, long j13) {
        if (window == null) {
            return;
        }
        window.setStatusBarColor(AbstractC17918w0.m51506H(j7));
        window.setNavigationBarColor(AbstractC17918w0.m51506H(j13));
    }
}
