package cc;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: cc.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C4407n extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f17797a;

    /* JADX INFO: renamed from: b */
    public C4406m f17798b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f17799c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f17800d;

    /* JADX INFO: renamed from: e */
    public boolean f17801e;

    /* JADX INFO: renamed from: f */
    public Bitmap f17802f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f17803g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f17804h;

    /* JADX INFO: renamed from: i */
    public int f17805i;

    /* JADX INFO: renamed from: j */
    public boolean f17806j;

    /* JADX INFO: renamed from: k */
    public boolean f17807k;

    /* JADX INFO: renamed from: l */
    public Paint f17808l;

    public C4407n(C4407n c4407n) {
        this.f17799c = null;
        this.f17800d = C4409p.f17810J;
        if (c4407n != null) {
            this.f17797a = c4407n.f17797a;
            C4406m c4406m = new C4406m(c4407n.f17798b);
            this.f17798b = c4406m;
            if (c4407n.f17798b.f17786e != null) {
                c4406m.f17786e = new Paint(c4407n.f17798b.f17786e);
            }
            if (c4407n.f17798b.f17785d != null) {
                this.f17798b.f17785d = new Paint(c4407n.f17798b.f17785d);
            }
            this.f17799c = c4407n.f17799c;
            this.f17800d = c4407n.f17800d;
            this.f17801e = c4407n.f17801e;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13826a() {
        return !this.f17807k && this.f17803g == this.f17799c && this.f17804h == this.f17800d && this.f17806j == this.f17801e && this.f17805i == this.f17798b.getRootAlpha();
    }

    /* JADX INFO: renamed from: b */
    public final void m13827b(int i13, int i14) {
        Bitmap bitmap = this.f17802f;
        if (bitmap != null && i13 == bitmap.getWidth() && i14 == this.f17802f.getHeight()) {
            return;
        }
        this.f17802f = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
        this.f17807k = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m13828c(Canvas canvas, ColorFilter colorFilter, Rect rect) {
        Paint paint;
        if (this.f17798b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (this.f17808l == null) {
                Paint paint2 = new Paint();
                this.f17808l = paint2;
                paint2.setFilterBitmap(true);
            }
            this.f17808l.setAlpha(this.f17798b.getRootAlpha());
            this.f17808l.setColorFilter(colorFilter);
            paint = this.f17808l;
        }
        canvas.drawBitmap(this.f17802f, (Rect) null, rect, paint);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13829d() {
        C4406m c4406m = this.f17798b;
        if (c4406m.f17795n == null) {
            c4406m.f17795n = Boolean.valueOf(c4406m.f17788g.mo13820a());
        }
        return c4406m.f17795n.booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13830e(int[] iArr) {
        boolean zMo13821b = this.f17798b.f17788g.mo13821b(iArr);
        this.f17807k |= zMo13821b;
        return zMo13821b;
    }

    /* JADX INFO: renamed from: f */
    public final void m13831f() {
        this.f17803g = this.f17799c;
        this.f17804h = this.f17800d;
        this.f17805i = this.f17798b.getRootAlpha();
        this.f17806j = this.f17801e;
        this.f17807k = false;
    }

    /* JADX INFO: renamed from: g */
    public final void m13832g(int i13, int i14) {
        this.f17802f.eraseColor(0);
        Canvas canvas = new Canvas(this.f17802f);
        C4406m c4406m = this.f17798b;
        c4406m.m13825a(c4406m.f17788g, C4406m.f17781p, canvas, i13, i14);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f17797a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C4409p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C4409p(this);
    }

    public C4407n() {
        this.f17799c = null;
        this.f17800d = C4409p.f17810J;
        this.f17798b = new C4406m();
    }
}
