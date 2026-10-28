package p287kq;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p031b9.AbstractC2875y;
import p186h8.C16999a;

/* JADX INFO: renamed from: kq.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC22766a {

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f89672a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final C16999a f89673b = new C16999a(1);

    /* JADX INFO: renamed from: c */
    public static final C16999a f89674c = new C16999a(0);

    /* JADX INFO: renamed from: d */
    public static final C16999a f89675d = new C16999a(2);

    /* JADX INFO: renamed from: e */
    public static final DecelerateInterpolator f89676e = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a */
    public static float m65969a(float f13, float f14, float f15) {
        return AbstractC2875y.m8288a(f14, f13, f15, f13);
    }

    /* JADX INFO: renamed from: b */
    public static float m65970b(float f13, float f14, float f15, float f16, float f17) {
        if (f17 <= f15) {
            return f13;
        }
        return f17 >= f16 ? f14 : m65969a(f13, f14, (f17 - f15) / (f16 - f15));
    }

    /* JADX INFO: renamed from: c */
    public static int m65971c(float f13, int i13, int i14) {
        return Math.round(f13 * (i14 - i13)) + i13;
    }
}
