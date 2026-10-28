package io.sentry.android.replay.util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.util.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20233a extends Drawable {

    /* JADX INFO: renamed from: d */
    public static final int f76011d = Color.argb(32, 255, 20, 20);

    /* JADX INFO: renamed from: e */
    public static final int f76012e = Color.argb(128, 255, 20, 20);

    /* JADX INFO: renamed from: a */
    public final Paint f76013a = new Paint(1);

    /* JADX INFO: renamed from: b */
    public final Rect f76014b = new Rect();

    /* JADX INFO: renamed from: c */
    public final Object f76015c = C25271y.f99162w;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC22676k.m65750j(canvas, "canvas");
        Paint paint = this.f76013a;
        paint.setTextSize(32.0f);
        paint.setColor(-16777216);
        paint.setStrokeWidth(6.0f);
        for (Rect rect : this.f76015c) {
            paint.setColor(f76011d);
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            canvas.drawRect(rect, paint);
            paint.setColor(f76012e);
            Paint.Style style2 = Paint.Style.STROKE;
            paint.setStyle(style2);
            canvas.drawRect(rect, paint);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(rect.left);
            sb4.append('/');
            sb4.append(rect.top);
            String string = sb4.toString();
            int length = string.length();
            Rect rect2 = this.f76014b;
            paint.getTextBounds(string, 0, length, rect2);
            float f13 = rect.left;
            float f14 = rect.top;
            paint.setColor(-1);
            paint.setStyle(style2);
            canvas.drawText(string, f13, f14, paint);
            paint.setColor(-16777216);
            paint.setStyle(style);
            canvas.drawText(string, f13, f14, paint);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(rect.right);
            sb5.append('/');
            sb5.append(rect.bottom);
            String string2 = sb5.toString();
            paint.getTextBounds(string2, 0, string2.length(), rect2);
            float fWidth = rect.right - rect2.width();
            float fHeight = rect.bottom + rect2.height();
            paint.setColor(-1);
            paint.setStyle(style2);
            canvas.drawText(string2, fWidth, fHeight, paint);
            paint.setColor(-16777216);
            paint.setStyle(style);
            canvas.drawText(string2, fWidth, fHeight, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
