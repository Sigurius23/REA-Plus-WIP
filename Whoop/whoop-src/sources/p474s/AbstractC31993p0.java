package p474s;

import android.widget.TextView;

/* JADX INFO: renamed from: s.p0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31993p0 {
    /* JADX INFO: renamed from: a */
    public static int m99510a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* JADX INFO: renamed from: b */
    public static void m99511b(TextView textView, int i13, int i14, int i15, int i16) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i13, i14, i15, i16);
    }

    /* JADX INFO: renamed from: c */
    public static void m99512c(TextView textView, int[] iArr, int i13) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i13);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m99513d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
