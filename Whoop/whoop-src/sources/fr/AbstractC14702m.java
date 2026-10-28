package fr;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;
import p032bc.C2939b;
import p287kq.AbstractC22766a;

/* JADX INFO: renamed from: fr.m */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC14702m extends Drawable implements Animatable {

    /* JADX INFO: renamed from: K */
    public static final C2939b f54350K = new C2939b(Float.class, "growFraction", 9);

    /* JADX INFO: renamed from: E */
    public ObjectAnimator f54351E;

    /* JADX INFO: renamed from: F */
    public ArrayList f54352F;

    /* JADX INFO: renamed from: G */
    public boolean f54353G;

    /* JADX INFO: renamed from: H */
    public float f54354H;

    /* JADX INFO: renamed from: J */
    public int f54356J;

    /* JADX INFO: renamed from: w */
    public final Context f54357w;

    /* JADX INFO: renamed from: x */
    public final AbstractC14694e f54358x;

    /* JADX INFO: renamed from: z */
    public ObjectAnimator f54360z;

    /* JADX INFO: renamed from: I */
    public final Paint f54355I = new Paint();

    /* JADX INFO: renamed from: y */
    public C14690a f54359y = new C14690a();

    public AbstractC14702m(Context context, AbstractC14694e abstractC14694e) {
        this.f54357w = context;
        this.f54358x = abstractC14694e;
        setAlpha(255);
    }

    /* JADX INFO: renamed from: b */
    public final float m42144b() {
        AbstractC14694e abstractC14694e = this.f54358x;
        if (abstractC14694e.f54316e == 0 && abstractC14694e.f54317f == 0) {
            return 1.0f;
        }
        return this.f54354H;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m42145c(boolean z4, boolean z13, boolean z14) {
        C14690a c14690a = this.f54359y;
        ContentResolver contentResolver = this.f54357w.getContentResolver();
        c14690a.getClass();
        return mo42142d(z4, z13, z14 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo42142d(boolean z4, boolean z13, boolean z14) {
        ObjectAnimator objectAnimator = this.f54360z;
        int i13 = 0;
        C2939b c2939b = f54350K;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, c2939b, 0.0f, 1.0f);
            this.f54360z = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f54360z.setInterpolator(AbstractC22766a.f89673b);
            ObjectAnimator objectAnimator2 = this.f54360z;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f54360z = objectAnimator2;
            objectAnimator2.addListener(new C14701l(this, i13));
        }
        int i14 = 1;
        if (this.f54351E == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, c2939b, 1.0f, 0.0f);
            this.f54351E = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f54351E.setInterpolator(AbstractC22766a.f89673b);
            ObjectAnimator objectAnimator3 = this.f54351E;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f54351E = objectAnimator3;
            objectAnimator3.addListener(new C14701l(this, i14));
        }
        if (isVisible() || z4) {
            ObjectAnimator objectAnimator4 = z4 ? this.f54360z : this.f54351E;
            ObjectAnimator objectAnimator5 = z4 ? this.f54351E : this.f54360z;
            if (!z14) {
                if (objectAnimator5.isRunning()) {
                    boolean z15 = this.f54353G;
                    this.f54353G = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.f54353G = z15;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z16 = this.f54353G;
                    this.f54353G = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f54353G = z16;
                }
                return super.setVisible(z4, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z17 = !z4 || super.setVisible(z4, false);
                AbstractC14694e abstractC14694e = this.f54358x;
                if (!z4 ? abstractC14694e.f54317f != 0 : abstractC14694e.f54316e != 0) {
                    boolean z18 = this.f54353G;
                    this.f54353G = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f54353G = z18;
                    return z17;
                }
                if (z13 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z17;
                }
                objectAnimator4.resume();
                return z17;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m42146e(C14692c c14692c) {
        ArrayList arrayList = this.f54352F;
        if (arrayList == null || !arrayList.contains(c14692c)) {
            return;
        }
        this.f54352F.remove(c14692c);
        if (this.f54352F.isEmpty()) {
            this.f54352F = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f54356J;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.f54360z;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.f54351E;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f54356J = i13;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f54355I.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z13) {
        return m42145c(z4, z13, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        mo42142d(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        mo42142d(false, true, false);
    }
}
