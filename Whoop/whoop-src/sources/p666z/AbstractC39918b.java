package p666z;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: z.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC39918b extends Drawable {

    /* JADX INFO: renamed from: a */
    public static final double f172336a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a */
    public static float m128082a(float f13, float f14, boolean z4) {
        if (!z4) {
            return f13;
        }
        return (float) (((1.0d - f172336a) * ((double) f14)) + ((double) f13));
    }

    /* JADX INFO: renamed from: b */
    public static float m128083b(float f13, float f14, boolean z4) {
        if (!z4) {
            return f13 * 1.5f;
        }
        return (float) (((1.0d - f172336a) * ((double) f14)) + ((double) (f13 * 1.5f)));
    }
}
