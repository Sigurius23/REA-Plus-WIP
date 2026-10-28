package p318m3;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* JADX INFO: renamed from: m3.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24973c {
    /* JADX INFO: renamed from: a */
    public static final BoringLayout.Metrics m73297a(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m73298b(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m73299c(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    /* JADX INFO: renamed from: d */
    public static final void m73300d(StaticLayout.Builder builder, int i13, int i14) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i13).setLineBreakWordStyle(i14).build());
    }
}
