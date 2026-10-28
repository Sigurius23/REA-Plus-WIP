package p676zb;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import p031b9.AbstractC2875y;
import p186h8.C16999a;

/* JADX INFO: renamed from: zb.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C40253d extends Drawable implements Animatable {

    /* JADX INFO: renamed from: F */
    public static final LinearInterpolator f174062F = new LinearInterpolator();

    /* JADX INFO: renamed from: G */
    public static final C16999a f174063G = new C16999a(1);

    /* JADX INFO: renamed from: H */
    public static final int[] f174064H = {-16777216};

    /* JADX INFO: renamed from: E */
    public boolean f174065E;

    /* JADX INFO: renamed from: w */
    public final C40252c f174066w;

    /* JADX INFO: renamed from: x */
    public float f174067x;

    /* JADX INFO: renamed from: y */
    public final ValueAnimator f174068y;

    /* JADX INFO: renamed from: z */
    public float f174069z;

    public C40253d(Context context) {
        context.getClass();
        context.getResources();
        C40252c c40252c = new C40252c();
        this.f174066w = c40252c;
        int[] iArr = f174064H;
        c40252c.f174053h = iArr;
        c40252c.f174054i = 0;
        c40252c.f174061p = iArr[0];
        m129251b(2.5f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C40250a(this, c40252c));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f174062F);
        valueAnimatorOfFloat.addListener(new C40251b(this, c40252c));
        this.f174068y = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: c */
    public static void m129249c(float f13, C40252c c40252c) {
        if (f13 <= 0.75f) {
            c40252c.f174061p = c40252c.f174053h[c40252c.f174054i];
            return;
        }
        float f14 = (f13 - 0.75f) / 0.25f;
        int[] iArr = c40252c.f174053h;
        int i13 = c40252c.f174054i;
        int i14 = iArr[i13];
        int i15 = iArr[(i13 + 1) % iArr.length];
        int i16 = (i14 >> 24) & 255;
        int i17 = (i14 >> 16) & 255;
        int i18 = (i14 >> 8) & 255;
        int i19 = i14 & 255;
        c40252c.f174061p = ((i16 + ((int) ((((i15 >> 24) & 255) - i16) * f14))) << 24) | ((i17 + ((int) ((((i15 >> 16) & 255) - i17) * f14))) << 16) | ((i18 + ((int) ((((i15 >> 8) & 255) - i18) * f14))) << 8) | (i19 + ((int) (f14 * ((i15 & 255) - i19))));
    }

    /* JADX INFO: renamed from: a */
    public final void m129250a(float f13, C40252c c40252c, boolean z4) {
        float interpolation;
        float interpolation2;
        if (this.f174065E) {
            m129249c(f13, c40252c);
            float fFloor = (float) (Math.floor(c40252c.f174057l / 0.8f) + 1.0d);
            float f14 = c40252c.f174055j;
            float f15 = c40252c.f174056k;
            c40252c.f174049d = (((f15 - 0.01f) - f14) * f13) + f14;
            c40252c.f174050e = f15;
            float f16 = c40252c.f174057l;
            c40252c.f174051f = AbstractC2875y.m8288a(fFloor, f16, f13, f16);
            return;
        }
        if (f13 != 1.0f || z4) {
            float f17 = c40252c.f174057l;
            C16999a c16999a = f174063G;
            if (f13 < 0.5f) {
                interpolation = c40252c.f174055j;
                interpolation2 = (c16999a.getInterpolation(f13 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f18 = c40252c.f174055j + 0.79f;
                interpolation = f18 - (((1.0f - c16999a.getInterpolation((f13 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f18;
            }
            float f19 = (0.20999998f * f13) + f17;
            float f24 = (f13 + this.f174069z) * 216.0f;
            c40252c.f174049d = interpolation;
            c40252c.f174050e = interpolation2;
            c40252c.f174051f = f19;
            this.f174067x = f24;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m129251b(float f13) {
        C40252c c40252c = this.f174066w;
        c40252c.f174052g = f13;
        c40252c.f174047b.setStrokeWidth(f13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f174067x, bounds.exactCenterX(), bounds.exactCenterY());
        C40252c c40252c = this.f174066w;
        float f13 = c40252c.f174058m;
        Paint paint = c40252c.f174047b;
        RectF rectF = c40252c.f174046a;
        float f14 = c40252c.f174059n;
        float fMin = (c40252c.f174052g / 2.0f) + f14;
        if (f14 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((0 * f13) / 2.0f, c40252c.f174052g / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f15 = c40252c.f174049d;
        float f16 = c40252c.f174051f;
        float f17 = (f15 + f16) * 360.0f;
        float f18 = ((c40252c.f174050e + f16) * 360.0f) - f17;
        paint.setColor(c40252c.f174061p);
        paint.setAlpha(c40252c.f174060o);
        float f19 = c40252c.f174052g / 2.0f;
        rectF.inset(f19, f19);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, c40252c.f174048c);
        float f24 = -f19;
        rectF.inset(f24, f24);
        canvas.drawArc(rectF, f17, f18, false, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f174066w.f174060o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f174068y.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f174066w.f174060o = i13;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f174066w.f174047b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f174068y.cancel();
        C40252c c40252c = this.f174066w;
        float f13 = c40252c.f174049d;
        c40252c.f174055j = f13;
        float f14 = c40252c.f174050e;
        c40252c.f174056k = f14;
        c40252c.f174057l = c40252c.f174051f;
        if (f14 != f13) {
            this.f174065E = true;
            this.f174068y.setDuration(666L);
            this.f174068y.start();
            return;
        }
        c40252c.f174054i = 0;
        c40252c.f174061p = c40252c.f174053h[0];
        c40252c.f174055j = 0.0f;
        c40252c.f174056k = 0.0f;
        c40252c.f174057l = 0.0f;
        c40252c.f174049d = 0.0f;
        c40252c.f174050e = 0.0f;
        c40252c.f174051f = 0.0f;
        this.f174068y.setDuration(1332L);
        this.f174068y.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f174068y.cancel();
        this.f174067x = 0.0f;
        C40252c c40252c = this.f174066w;
        c40252c.getClass();
        c40252c.f174054i = 0;
        c40252c.f174061p = c40252c.f174053h[0];
        c40252c.f174055j = 0.0f;
        c40252c.f174056k = 0.0f;
        c40252c.f174057l = 0.0f;
        c40252c.f174049d = 0.0f;
        c40252c.f174050e = 0.0f;
        c40252c.f174051f = 0.0f;
        invalidateSelf();
    }
}
