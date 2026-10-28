package p318m3;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: m3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC24972b {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BoringLayout m73296a(CharSequence charSequence, TextPaint textPaint, int i13, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z4, TextUtils.TruncateAt truncateAt, int i14) {
        return new BoringLayout(charSequence, textPaint, i13, alignment, 1.0f, 0.0f, metrics, z4, truncateAt, i14, true);
    }
}
