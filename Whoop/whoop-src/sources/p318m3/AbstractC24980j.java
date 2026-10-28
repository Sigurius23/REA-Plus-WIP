package p318m3;

import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import p448r3.AbstractC30895a;

/* JADX INFO: renamed from: m3.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24980j {
    /* JADX INFO: renamed from: a */
    public static StaticLayout m73305a(CharSequence charSequence, TextPaint textPaint, int i13, int i14, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i15, TextUtils.TruncateAt truncateAt, int i16, int i17, boolean z4, int i18, int i19, int i24, int i25) {
        if (i14 < 0) {
            AbstractC30895a.m95015a("invalid start value");
        }
        int length = charSequence.length();
        if (i14 < 0 || i14 > length) {
            AbstractC30895a.m95015a("invalid end value");
        }
        if (i15 < 0) {
            AbstractC30895a.m95015a("invalid maxLines value");
        }
        if (i13 < 0) {
            AbstractC30895a.m95015a("invalid width value");
        }
        if (i16 < 0) {
            AbstractC30895a.m95015a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i14, textPaint, i13);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i15);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i16);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z4);
        builderObtain.setBreakStrategy(i18);
        builderObtain.setHyphenationFrequency(i25);
        builderObtain.setIndents(null, null);
        int i26 = Build.VERSION.SDK_INT;
        builderObtain.setJustificationMode(i17);
        builderObtain.setUseLineSpacingFromFallbacks(true);
        if (i26 >= 33) {
            AbstractC24973c.m73300d(builderObtain, i19, i24);
        }
        if (i26 >= 35) {
            AbstractC24979i.m73304a(builderObtain);
        }
        return builderObtain.build();
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m73306b(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
