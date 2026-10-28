package q52;

import android.graphics.Canvas;
import android.graphics.Paint;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q52.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Landroid/graphics/Canvas;", "", "text", "", "x", "y", "Landroid/graphics/Paint;", "paint", "Ll83/a0;", "a", "(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/graphics/Paint;)V", "maxWidth", "b", "(Landroid/graphics/Canvas;Ljava/lang/String;FFLandroid/graphics/Paint;F)F", "realtime-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29985c {
    /* JADX INFO: renamed from: a */
    public static final void m91709a(Canvas canvas, String text, float f13, float f14, Paint paint) {
        AbstractC22676k.m65750j(canvas, "<this>");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(paint, "paint");
        canvas.drawText(text, f13 - (paint.measureText(text) / 2), f14, paint);
    }

    /* JADX INFO: renamed from: b */
    public static final float m91710b(Canvas canvas, String text, float f13, float f14, Paint paint, float f15) {
        AbstractC22676k.m65750j(canvas, "<this>");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(paint, "paint");
        float fDescent = paint.descent() - paint.ascent();
        while (true) {
            int length = text.length();
            char[] charArray = text.toCharArray();
            AbstractC22676k.m65749i(charArray, "toCharArray(...)");
            Paint paint2 = paint;
            float f16 = f15;
            int iBreakText = paint2.breakText(charArray, 0, charArray.length, f16, null);
            String strSubstring = text.substring(0, iBreakText);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            text = text.substring(iBreakText, text.length());
            AbstractC22676k.m65749i(text, "substring(...)");
            m91709a(canvas, strSubstring, f13, f14, paint2);
            f14 += fDescent;
            if (iBreakText >= length) {
                return f14;
            }
            paint = paint2;
            f15 = f16;
        }
    }
}
