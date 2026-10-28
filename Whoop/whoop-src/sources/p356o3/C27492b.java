package p356o3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import p318m3.AbstractC24984n;
import p318m3.C24982l;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: o3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C27492b implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i13, int i14, int i15, int i16, int i17, CharSequence charSequence, int i18, int i19, boolean z4, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i18)) != layout.getLineCount() - 1) {
            return;
        }
        C24982l c24982l = AbstractC24984n.f97780a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fM88548y = AbstractC29125c.m88548y(layout, lineForOffset, paint) + AbstractC29125c.m88547x(layout, lineForOffset, paint);
            if (fM88548y == 0.0f) {
                return;
            }
            AbstractC22676k.m65747g(canvas);
            canvas.translate(fM88548y, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z4) {
        return 0;
    }
}
