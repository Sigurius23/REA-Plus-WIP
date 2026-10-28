package p137f5;

import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: f5.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C14084c {

    /* JADX INFO: renamed from: a */
    public final TextPaint f50612a;

    /* JADX INFO: renamed from: b */
    public final TextDirectionHeuristic f50613b;

    /* JADX INFO: renamed from: c */
    public final int f50614c;

    /* JADX INFO: renamed from: d */
    public final int f50615d;

    public C14084c(PrecomputedText.Params params) {
        this.f50612a = params.getTextPaint();
        this.f50613b = params.getTextDirection();
        this.f50614c = params.getBreakStrategy();
        this.f50615d = params.getHyphenationFrequency();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14084c)) {
            return false;
        }
        C14084c c14084c = (C14084c) obj;
        if (this.f50614c != c14084c.f50614c || this.f50615d != c14084c.f50615d) {
            return false;
        }
        TextPaint textPaint = this.f50612a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = c14084c.f50612a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f50613b == c14084c.f50613b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f50612a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f50613b, Integer.valueOf(this.f50614c), Integer.valueOf(this.f50615d));
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("{");
        StringBuilder sb5 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f50612a;
        sb5.append(textPaint.getTextSize());
        sb4.append(sb5.toString());
        sb4.append(", textScaleX=" + textPaint.getTextScaleX());
        sb4.append(", textSkewX=" + textPaint.getTextSkewX());
        sb4.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb4.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb4.append(", textLocale=" + textPaint.getTextLocales());
        sb4.append(", typeface=" + textPaint.getTypeface());
        sb4.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb4.append(", textDir=" + this.f50613b);
        sb4.append(", breakStrategy=" + this.f50614c);
        sb4.append(", hyphenationFrequency=" + this.f50615d);
        sb4.append("}");
        return sb4.toString();
    }
}
