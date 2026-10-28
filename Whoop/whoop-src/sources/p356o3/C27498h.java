package p356o3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import p448r3.AbstractC30895a;
import p530up.AbstractC35148d;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C27498h extends ReplacementSpan {

    /* JADX INFO: renamed from: E */
    public final float f110750E;

    /* JADX INFO: renamed from: F */
    public final int f110751F;

    /* JADX INFO: renamed from: G */
    public Paint.FontMetricsInt f110752G;

    /* JADX INFO: renamed from: H */
    public int f110753H;

    /* JADX INFO: renamed from: I */
    public int f110754I;

    /* JADX INFO: renamed from: J */
    public boolean f110755J;

    /* JADX INFO: renamed from: w */
    public final float f110756w;

    /* JADX INFO: renamed from: x */
    public final int f110757x;

    /* JADX INFO: renamed from: y */
    public final float f110758y;

    /* JADX INFO: renamed from: z */
    public final int f110759z;

    public C27498h(float f13, int i13, float f14, int i14, float f15, int i15) {
        this.f110756w = f13;
        this.f110757x = i13;
        this.f110758y = f14;
        this.f110759z = i14;
        this.f110750E = f15;
        this.f110751F = i15;
    }

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt m82917a() {
        Paint.FontMetricsInt fontMetricsInt = this.f110752G;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC22676k.m65757q("fontMetrics");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final int m82918b() {
        if (!this.f110755J) {
            AbstractC30895a.m95017c("PlaceholderSpan is not laid out yet.");
        }
        return this.f110754I;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i13, int i14, float f13, int i15, int i16, int i17, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i13, int i14, Paint.FontMetricsInt fontMetricsInt) {
        float f13;
        int iM111185p;
        this.f110755J = true;
        float textSize = paint.getTextSize();
        this.f110752G = paint.getFontMetricsInt();
        if (m82917a().descent <= m82917a().ascent) {
            AbstractC30895a.m95015a("Invalid fontMetrics: line height can not be negative.");
        }
        float f14 = this.f110750E;
        float f15 = this.f110756w;
        int i15 = this.f110757x;
        if (i15 == 0) {
            f13 = f15 * f14;
        } else {
            if (i15 != 1) {
                AbstractC30895a.m95016b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f13 = f15 * textSize;
        }
        this.f110753H = AbstractC35148d.m111185p(f13);
        float f16 = this.f110758y;
        int i16 = this.f110759z;
        if (i16 == 0) {
            iM111185p = AbstractC35148d.m111185p(f16 * f14);
        } else {
            if (i16 != 1) {
                AbstractC30895a.m95016b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            iM111185p = AbstractC35148d.m111185p(f16 * textSize);
        }
        this.f110754I = iM111185p;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = m82917a().ascent;
            fontMetricsInt.descent = m82917a().descent;
            fontMetricsInt.leading = m82917a().leading;
            switch (this.f110751F) {
                case 0:
                    if (fontMetricsInt.ascent > (-m82918b())) {
                        fontMetricsInt.ascent = -m82918b();
                    }
                    break;
                case 1:
                case 4:
                    if (m82918b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = m82918b() + fontMetricsInt.ascent;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - m82918b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - m82918b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < m82918b()) {
                        int iM82918b = fontMetricsInt.ascent - ((m82918b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iM82918b;
                        fontMetricsInt.descent = m82918b() + iM82918b;
                    }
                    break;
                default:
                    AbstractC30895a.m95015a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(m82917a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(m82917a().bottom, fontMetricsInt.descent);
        }
        if (!this.f110755J) {
            AbstractC30895a.m95017c("PlaceholderSpan is not laid out yet.");
        }
        return this.f110753H;
    }
}
