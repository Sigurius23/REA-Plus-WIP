package p185h6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import p212i6.C18148a;
import p692zt.C41113q;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: h6.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C16970y extends ReplacementSpan {

    /* JADX INFO: renamed from: E */
    public TextPaint f65127E;

    /* JADX INFO: renamed from: x */
    public final C16969x f65129x;

    /* JADX INFO: renamed from: w */
    public final Paint.FontMetricsInt f65128w = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: y */
    public short f65130y = -1;

    /* JADX INFO: renamed from: z */
    public float f65131z = 1.0f;

    public C16970y(C16969x c16969x) {
        AbstractC37056f.m118993q(c16969x, "rasterizer cannot be null");
        this.f65129x = c16969x;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i13, int i14, float f13, int i15, int i16, int i17, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i13, i14, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f65127E;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f65127E = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f13, i15, f13 + this.f65130y, i17, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        C16955j.m47708a().getClass();
        float f14 = i16;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        C16969x c16969x = this.f65129x;
        C41113q c41113q = c16969x.f65125b;
        Typeface typeface = (Typeface) c41113q.f177222E;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) c41113q.f177225y, c16969x.f65124a * 2, 2, f13, f14, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i13, int i14, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f65128w;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C16969x c16969x = this.f65129x;
        C18148a c18148aM47732b = c16969x.m47732b();
        int iM52082a = c18148aM47732b.m52082a(14);
        this.f65131z = fAbs / (iM52082a != 0 ? ((ByteBuffer) c18148aM47732b.f70446z).getShort(iM52082a + c18148aM47732b.f70443w) : (short) 0);
        C18148a c18148aM47732b2 = c16969x.m47732b();
        int iM52082a2 = c18148aM47732b2.m52082a(14);
        if (iM52082a2 != 0) {
            ((ByteBuffer) c18148aM47732b2.f70446z).getShort(iM52082a2 + c18148aM47732b2.f70443w);
        }
        C18148a c18148aM47732b3 = c16969x.m47732b();
        int iM52082a3 = c18148aM47732b3.m52082a(12);
        short s13 = (short) ((iM52082a3 != 0 ? ((ByteBuffer) c18148aM47732b3.f70446z).getShort(iM52082a3 + c18148aM47732b3.f70443w) : (short) 0) * this.f65131z);
        this.f65130y = s13;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s13;
    }
}
