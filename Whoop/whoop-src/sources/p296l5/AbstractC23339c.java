package p296l5;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: l5.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23339c {
    /* JADX INFO: renamed from: a */
    public static EdgeEffect m67570a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX INFO: renamed from: b */
    public static float m67571b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m67572c(EdgeEffect edgeEffect, float f13, float f14) {
        try {
            return edgeEffect.onPullDistance(f13, f14);
        } catch (Throwable unused) {
            edgeEffect.onPull(f13, f14);
            return 0.0f;
        }
    }
}
