package c73;

import a73.C0530e;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import java.util.Arrays;
import java.util.Locale;
import p507tx.AbstractC34235f;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: c73.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C4290f extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: w */
    public final C0530e f17400w;

    /* JADX INFO: renamed from: x */
    public final Rect f17401x = AbstractC4292h.f17407a;

    /* JADX INFO: renamed from: y */
    public final Paint f17402y = AbstractC4292h.f17409c;

    /* JADX INFO: renamed from: z */
    public final int f17403z;

    public C4290f(C0530e c0530e, int i13) {
        this.f17400w = c0530e;
        this.f17403z = i13;
    }

    /* JADX INFO: renamed from: a */
    public final void m13540a(TextPaint textPaint) {
        this.f17400w.getClass();
        textPaint.setFakeBoldText(true);
        int i13 = this.f17403z;
        float[] fArr = C0530e.f1833g;
        if (6 >= i13) {
            textPaint.setTextSize(textPaint.getTextSize() * fArr[i13 - 1]);
        } else {
            Locale locale = Locale.US;
            throw new IllegalStateException(AbstractC30007c.m91838h(i13, "Supplied heading level: ", " is invalid, where configured heading sizes are: `", Arrays.toString(fArr), "`"));
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i13, int i14, int i15, int i16, int i17, CharSequence charSequence, int i18, int i19, boolean z4, Layout layout) {
        int width;
        int i24 = this.f17403z;
        if ((i24 == 1 || i24 == 2) && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(this) == i19) {
            Paint paint2 = this.f17402y;
            paint2.set(paint);
            C0530e c0530e = this.f17400w;
            c0530e.getClass();
            paint2.setColor(AbstractC34235f.m108234t(paint2.getColor(), 75));
            paint2.setStyle(Paint.Style.FILL);
            int i25 = c0530e.f1838e;
            if (i25 >= 0) {
                paint2.setStrokeWidth(i25);
            }
            float strokeWidth = paint2.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i26 = (int) ((i17 - strokeWidth) + 0.5f);
                if (i14 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i13;
                    i13 -= canvas.getWidth();
                }
                Rect rect = this.f17401x;
                rect.set(i13, i26, width, i17);
                canvas.drawRect(rect, paint2);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z4) {
        return 0;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        m13540a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        m13540a(textPaint);
    }
}
