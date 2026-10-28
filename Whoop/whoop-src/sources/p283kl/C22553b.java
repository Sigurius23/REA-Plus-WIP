package p283kl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import ar.C1913a;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: kl.b */
/* JADX INFO: loaded from: classes.dex */
public final class C22553b extends Drawable implements InterfaceC22556e, Animatable {

    /* JADX INFO: renamed from: F */
    public int f88721F;

    /* JADX INFO: renamed from: H */
    public boolean f88723H;

    /* JADX INFO: renamed from: I */
    public Paint f88724I;

    /* JADX INFO: renamed from: J */
    public Rect f88725J;

    /* JADX INFO: renamed from: w */
    public final C1913a f88726w;

    /* JADX INFO: renamed from: x */
    public boolean f88727x;

    /* JADX INFO: renamed from: y */
    public boolean f88728y;

    /* JADX INFO: renamed from: z */
    public boolean f88729z;

    /* JADX INFO: renamed from: E */
    public boolean f88720E = true;

    /* JADX INFO: renamed from: G */
    public final int f88722G = -1;

    public C22553b(C1913a c1913a) {
        this.f88726w = c1913a;
    }

    /* JADX INFO: renamed from: a */
    public final void m65284a() {
        AbstractC29125c.m88537n(!this.f88729z, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        C1913a c1913a = this.f88726w;
        if (((C22558g) c1913a.f7566b).m65288d() == 1) {
            invalidateSelf();
        } else {
            if (this.f88727x) {
                return;
            }
            this.f88727x = true;
            ((C22558g) c1913a.f7566b).m65294j(this);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f88729z) {
            return;
        }
        if (this.f88723H) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f88725J == null) {
                this.f88725J = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f88725J);
            this.f88723H = false;
        }
        Bitmap bitmapM65286b = ((C22558g) this.f88726w.f7566b).m65286b();
        if (this.f88725J == null) {
            this.f88725J = new Rect();
        }
        Rect rect = this.f88725J;
        if (this.f88724I == null) {
            this.f88724I = new Paint(2);
        }
        canvas.drawBitmap(bitmapM65286b, (Rect) null, rect, this.f88724I);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f88726w;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C22558g) this.f88726w.f7566b).m65289e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C22558g) this.f88726w.f7566b).m65290f();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f88727x;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f88723H = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        if (this.f88724I == null) {
            this.f88724I = new Paint(2);
        }
        this.f88724I.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f88724I == null) {
            this.f88724I = new Paint(2);
        }
        this.f88724I.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z13) {
        AbstractC29125c.m88537n(!this.f88729z, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f88720E = z4;
        if (!z4) {
            this.f88727x = false;
            ((C22558g) this.f88726w.f7566b).m65295k(this);
        } else if (this.f88728y) {
            m65284a();
        }
        return super.setVisible(z4, z13);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f88728y = true;
        this.f88721F = 0;
        if (this.f88720E) {
            m65284a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f88728y = false;
        this.f88727x = false;
        ((C22558g) this.f88726w.f7566b).m65295k(this);
    }
}
