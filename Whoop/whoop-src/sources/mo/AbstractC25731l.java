package mo;

import android.view.Surface;
import p309lo.AbstractC24543a;

/* JADX INFO: renamed from: mo.l */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25731l {
    /* JADX INFO: renamed from: a */
    public static void m75869a(Surface surface, float f13) {
        try {
            surface.setFrameRate(f13, f13 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e5) {
            AbstractC24543a.m71578n("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e5);
        }
    }
}
