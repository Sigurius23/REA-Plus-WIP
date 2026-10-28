package p149fh;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.room.AbstractC1772c1;
import e93.AbstractC12889b;
import fr.C14692c;
import gi.EnumC15876g;
import java.util.ArrayList;
import p031b9.AbstractC2875y;
import p341nh.EnumC26713g;
import p474s.AbstractC32004s;

/* JADX INFO: renamed from: fh.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C14477a extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: E */
    public final int f52831E;

    /* JADX INFO: renamed from: F */
    public final int f52832F;

    /* JADX INFO: renamed from: G */
    public long f52833G;

    /* JADX INFO: renamed from: H */
    public int f52834H;

    /* JADX INFO: renamed from: I */
    public int f52835I;

    /* JADX INFO: renamed from: J */
    public Drawable f52836J;

    /* JADX INFO: renamed from: K */
    public final Drawable f52837K;

    /* JADX INFO: renamed from: L */
    public final Enum f52838L;

    /* JADX INFO: renamed from: x */
    public final int f52840x;

    /* JADX INFO: renamed from: y */
    public final boolean f52841y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52839w = 1;

    /* JADX INFO: renamed from: z */
    public final ArrayList f52842z = new ArrayList();

    public C14477a(Drawable drawable, EnumC26713g enumC26713g, int i13, boolean z4) {
        this.f52838L = enumC26713g;
        this.f52840x = i13;
        this.f52841y = z4;
        this.f52831E = m41346a(null, drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null);
        this.f52832F = m41346a(null, drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null);
        this.f52834H = 255;
        this.f52836J = null;
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        this.f52837K = drawableMutate;
        if (i13 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
        Drawable drawable2 = this.f52836J;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        if (drawableMutate != null) {
            drawableMutate.setCallback(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m41346a(Integer num, Integer num2) {
        switch (this.f52839w) {
            case 0:
                if (num != null && num.intValue() == -1) {
                    return -1;
                }
                if (num2 != null && num2.intValue() == -1) {
                    return -1;
                }
                return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
            default:
                if (num != null && num.intValue() == -1) {
                    return -1;
                }
                if (num2 != null && num2.intValue() == -1) {
                    return -1;
                }
                return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m41347b() {
        switch (this.f52839w) {
            case 0:
                this.f52835I = 2;
                this.f52836J = null;
                ArrayList arrayList = this.f52842z;
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((C14692c) arrayList.get(i13)).m42126a(this);
                }
                break;
            default:
                this.f52835I = 2;
                this.f52836J = null;
                ArrayList arrayList2 = this.f52842z;
                int size2 = arrayList2.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    ((C14692c) arrayList2.get(i14)).m42126a(this);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m41348c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dM5393k = AbstractC1772c1.m5393k(intrinsicWidth, intrinsicHeight, iWidth, iHeight, (EnumC26713g) this.f52838L);
        double d3 = 2;
        int iM36257W = AbstractC12889b.m36257W((((double) iWidth) - (((double) intrinsicWidth) * dM5393k)) / d3);
        int iM36257W2 = AbstractC12889b.m36257W((((double) iHeight) - (dM5393k * ((double) intrinsicHeight))) / d3);
        drawable.setBounds(rect.left + iM36257W, rect.top + iM36257W2, rect.right - iM36257W, rect.bottom - iM36257W2);
    }

    /* JADX INFO: renamed from: d */
    public void m41349d(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dM99538g = AbstractC32004s.m99538g(intrinsicWidth, intrinsicHeight, iWidth, iHeight, (EnumC15876g) this.f52838L);
        double d3 = 2;
        int iM36257W = AbstractC12889b.m36257W((((double) iWidth) - (((double) intrinsicWidth) * dM99538g)) / d3);
        int iM36257W2 = AbstractC12889b.m36257W((((double) iHeight) - (dM99538g * ((double) intrinsicHeight))) / d3);
        drawable.setBounds(rect.left + iM36257W, rect.top + iM36257W2, rect.right - iM36257W, rect.bottom - iM36257W2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        switch (this.f52839w) {
            case 0:
                int i13 = this.f52835I;
                if (i13 == 0) {
                    Drawable drawable3 = this.f52836J;
                    if (drawable3 != null) {
                        drawable3.setAlpha(this.f52834H);
                        int iSave = canvas.save();
                        try {
                            drawable3.draw(canvas);
                            return;
                        } finally {
                            canvas.restoreToCount(iSave);
                        }
                    }
                    return;
                }
                Drawable drawable4 = this.f52837K;
                if (i13 == 2) {
                    if (drawable4 != null) {
                        drawable4.setAlpha(this.f52834H);
                        int iSave2 = canvas.save();
                        try {
                            drawable4.draw(canvas);
                            return;
                        } finally {
                            canvas.restoreToCount(iSave2);
                        }
                    }
                    return;
                }
                double dUptimeMillis = (SystemClock.uptimeMillis() - this.f52833G) / ((double) this.f52840x);
                double dM36282l = AbstractC12889b.m36282l(dUptimeMillis, 0.0d, 1.0d);
                int i14 = this.f52834H;
                int i15 = (int) (dM36282l * ((double) i14));
                if (this.f52841y) {
                    i14 -= i15;
                }
                boolean z4 = dUptimeMillis >= 1.0d;
                if (!z4 && (drawable = this.f52836J) != null) {
                    drawable.setAlpha(i14);
                    int iSave3 = canvas.save();
                    try {
                        drawable.draw(canvas);
                        canvas.restoreToCount(iSave3);
                    } catch (Throwable th3) {
                        canvas.restoreToCount(iSave3);
                        throw th3;
                    }
                }
                if (drawable4 != null) {
                    drawable4.setAlpha(i15);
                    int iSave4 = canvas.save();
                    try {
                        drawable4.draw(canvas);
                        canvas.restoreToCount(iSave4);
                    } catch (Throwable th4) {
                        canvas.restoreToCount(iSave4);
                        throw th4;
                    }
                }
                if (z4) {
                    m41347b();
                    return;
                } else {
                    invalidateSelf();
                    return;
                }
            default:
                int i16 = this.f52835I;
                if (i16 == 0) {
                    Drawable drawable5 = this.f52836J;
                    if (drawable5 != null) {
                        drawable5.setAlpha(this.f52834H);
                        int iSave5 = canvas.save();
                        try {
                            drawable5.draw(canvas);
                            return;
                        } finally {
                            canvas.restoreToCount(iSave5);
                        }
                    }
                    return;
                }
                Drawable drawable6 = this.f52837K;
                if (i16 == 2) {
                    if (drawable6 != null) {
                        drawable6.setAlpha(this.f52834H);
                        int iSave6 = canvas.save();
                        try {
                            drawable6.draw(canvas);
                            return;
                        } finally {
                            canvas.restoreToCount(iSave6);
                        }
                    }
                    return;
                }
                double dUptimeMillis2 = (SystemClock.uptimeMillis() - this.f52833G) / ((double) this.f52840x);
                double dM36282l2 = AbstractC12889b.m36282l(dUptimeMillis2, 0.0d, 1.0d);
                int i17 = this.f52834H;
                int i18 = (int) (dM36282l2 * ((double) i17));
                if (this.f52841y) {
                    i17 -= i18;
                }
                boolean z13 = dUptimeMillis2 >= 1.0d;
                if (!z13 && (drawable2 = this.f52836J) != null) {
                    drawable2.setAlpha(i17);
                    int iSave7 = canvas.save();
                    try {
                        drawable2.draw(canvas);
                        canvas.restoreToCount(iSave7);
                    } catch (Throwable th5) {
                        canvas.restoreToCount(iSave7);
                        throw th5;
                    }
                }
                if (drawable6 != null) {
                    drawable6.setAlpha(i18);
                    int iSave8 = canvas.save();
                    try {
                        drawable6.draw(canvas);
                        canvas.restoreToCount(iSave8);
                    } catch (Throwable th6) {
                        canvas.restoreToCount(iSave8);
                        throw th6;
                    }
                }
                if (z13) {
                    m41347b();
                    return;
                } else {
                    invalidateSelf();
                    return;
                }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        switch (this.f52839w) {
            case 0:
                break;
        }
        return this.f52834H;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        ColorFilter colorFilter2;
        switch (this.f52839w) {
            case 0:
                int i13 = this.f52835I;
                if (i13 != 0) {
                    Drawable drawable = this.f52837K;
                    if (i13 != 1) {
                        if (i13 == 2 && drawable != null) {
                            return drawable.getColorFilter();
                        }
                    } else {
                        if (drawable != null && (colorFilter = drawable.getColorFilter()) != null) {
                            return colorFilter;
                        }
                        Drawable drawable2 = this.f52836J;
                        if (drawable2 != null) {
                            return drawable2.getColorFilter();
                        }
                    }
                } else {
                    Drawable drawable3 = this.f52836J;
                    if (drawable3 != null) {
                        return drawable3.getColorFilter();
                    }
                }
                return null;
            default:
                int i14 = this.f52835I;
                if (i14 != 0) {
                    Drawable drawable4 = this.f52837K;
                    if (i14 != 1) {
                        if (i14 == 2 && drawable4 != null) {
                            return drawable4.getColorFilter();
                        }
                    } else {
                        if (drawable4 != null && (colorFilter2 = drawable4.getColorFilter()) != null) {
                            return colorFilter2;
                        }
                        Drawable drawable5 = this.f52836J;
                        if (drawable5 != null) {
                            return drawable5.getColorFilter();
                        }
                    }
                } else {
                    Drawable drawable6 = this.f52836J;
                    if (drawable6 != null) {
                        return drawable6.getColorFilter();
                    }
                }
                return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.f52839w) {
            case 0:
                break;
        }
        return this.f52832F;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.f52839w) {
            case 0:
                break;
        }
        return this.f52831E;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f52839w) {
            case 0:
                Drawable drawable = this.f52836J;
                int i13 = this.f52835I;
                if (i13 != 0) {
                    Drawable drawable2 = this.f52837K;
                    if (i13 == 2) {
                        if (drawable2 != null) {
                            return drawable2.getOpacity();
                        }
                    } else {
                        if (drawable != null && drawable2 != null) {
                            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
                        }
                        if (drawable != null) {
                            return drawable.getOpacity();
                        }
                        if (drawable2 != null) {
                            return drawable2.getOpacity();
                        }
                    }
                } else if (drawable != null) {
                    return drawable.getOpacity();
                }
                return -2;
            default:
                Drawable drawable3 = this.f52836J;
                int i14 = this.f52835I;
                if (i14 != 0) {
                    Drawable drawable4 = this.f52837K;
                    if (i14 == 2) {
                        if (drawable4 != null) {
                            return drawable4.getOpacity();
                        }
                    } else {
                        if (drawable3 != null && drawable4 != null) {
                            return Drawable.resolveOpacity(drawable3.getOpacity(), drawable4.getOpacity());
                        }
                        if (drawable3 != null) {
                            return drawable3.getOpacity();
                        }
                        if (drawable4 != null) {
                            return drawable4.getOpacity();
                        }
                    }
                } else if (drawable3 != null) {
                    return drawable3.getOpacity();
                }
                return -2;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f52839w) {
            case 0:
                invalidateSelf();
                break;
            default:
                invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        switch (this.f52839w) {
            case 0:
                return this.f52835I == 1;
            default:
                return this.f52835I == 1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        switch (this.f52839w) {
            case 1:
                Drawable drawable = this.f52836J;
                if (!(drawable != null ? drawable.isStateful() : false)) {
                    Drawable drawable2 = this.f52837K;
                    if (!(drawable2 != null ? drawable2.isStateful() : false)) {
                        return false;
                    }
                }
                return true;
            default:
                return super.isStateful();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        switch (this.f52839w) {
            case 0:
                Drawable drawable = this.f52836J;
                if (drawable != null) {
                    m41348c(drawable, rect);
                }
                Drawable drawable2 = this.f52837K;
                if (drawable2 != null) {
                    m41348c(drawable2, rect);
                }
                break;
            default:
                Drawable drawable3 = this.f52836J;
                if (drawable3 != null) {
                    m41349d(drawable3, rect);
                }
                Drawable drawable4 = this.f52837K;
                if (drawable4 != null) {
                    m41349d(drawable4, rect);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i13) {
        switch (this.f52839w) {
            case 0:
                Drawable drawable = this.f52836J;
                boolean level = drawable != null ? drawable.setLevel(i13) : false;
                Drawable drawable2 = this.f52837K;
                return level || (drawable2 != null ? drawable2.setLevel(i13) : false);
            default:
                Drawable drawable3 = this.f52836J;
                boolean level2 = drawable3 != null ? drawable3.setLevel(i13) : false;
                Drawable drawable4 = this.f52837K;
                return level2 || (drawable4 != null ? drawable4.setLevel(i13) : false);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        switch (this.f52839w) {
            case 0:
                Drawable drawable = this.f52836J;
                boolean state = drawable != null ? drawable.setState(iArr) : false;
                Drawable drawable2 = this.f52837K;
                return state || (drawable2 != null ? drawable2.setState(iArr) : false);
            default:
                Drawable drawable3 = this.f52836J;
                boolean state2 = drawable3 != null ? drawable3.setState(iArr) : false;
                Drawable drawable4 = this.f52837K;
                return state2 || (drawable4 != null ? drawable4.setState(iArr) : false);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        switch (this.f52839w) {
            case 0:
                scheduleSelf(runnable, j7);
                break;
            default:
                scheduleSelf(runnable, j7);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        switch (this.f52839w) {
            case 0:
                if (i13 < 0 || i13 >= 256) {
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Invalid alpha: ").toString());
                }
                this.f52834H = i13;
                return;
            default:
                if (i13 < 0 || i13 >= 256) {
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Invalid alpha: ").toString());
                }
                this.f52834H = i13;
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f52839w) {
            case 0:
                Drawable drawable = this.f52836J;
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                Drawable drawable2 = this.f52837K;
                if (drawable2 != null) {
                    drawable2.setColorFilter(colorFilter);
                }
                break;
            default:
                Drawable drawable3 = this.f52836J;
                if (drawable3 != null) {
                    drawable3.setColorFilter(colorFilter);
                }
                Drawable drawable4 = this.f52837K;
                if (drawable4 != null) {
                    drawable4.setColorFilter(colorFilter);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i13) {
        switch (this.f52839w) {
            case 0:
                Drawable drawable = this.f52836J;
                if (drawable != null) {
                    drawable.setTint(i13);
                }
                Drawable drawable2 = this.f52837K;
                if (drawable2 != null) {
                    drawable2.setTint(i13);
                }
                break;
            default:
                Drawable drawable3 = this.f52836J;
                if (drawable3 != null) {
                    drawable3.setTint(i13);
                }
                Drawable drawable4 = this.f52837K;
                if (drawable4 != null) {
                    drawable4.setTint(i13);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        switch (this.f52839w) {
            case 0:
                Drawable drawable = this.f52836J;
                if (drawable != null) {
                    drawable.setTintBlendMode(blendMode);
                }
                Drawable drawable2 = this.f52837K;
                if (drawable2 != null) {
                    drawable2.setTintBlendMode(blendMode);
                }
                break;
            default:
                Drawable drawable3 = this.f52836J;
                if (drawable3 != null) {
                    drawable3.setTintBlendMode(blendMode);
                }
                Drawable drawable4 = this.f52837K;
                if (drawable4 != null) {
                    drawable4.setTintBlendMode(blendMode);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        switch (this.f52839w) {
            case 0:
                Drawable drawable = this.f52836J;
                if (drawable != null) {
                    drawable.setTintList(colorStateList);
                }
                Drawable drawable2 = this.f52837K;
                if (drawable2 != null) {
                    drawable2.setTintList(colorStateList);
                }
                break;
            default:
                Drawable drawable3 = this.f52836J;
                if (drawable3 != null) {
                    drawable3.setTintList(colorStateList);
                }
                Drawable drawable4 = this.f52837K;
                if (drawable4 != null) {
                    drawable4.setTintList(colorStateList);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        switch (this.f52839w) {
            case 0:
                Drawable drawable = this.f52836J;
                if (drawable != null) {
                    drawable.setTintMode(mode);
                }
                Drawable drawable2 = this.f52837K;
                if (drawable2 != null) {
                    drawable2.setTintMode(mode);
                }
                break;
            default:
                Drawable drawable3 = this.f52836J;
                if (drawable3 != null) {
                    drawable3.setTintMode(mode);
                }
                Drawable drawable4 = this.f52837K;
                if (drawable4 != null) {
                    drawable4.setTintMode(mode);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        switch (this.f52839w) {
            case 0:
                Object obj = this.f52836J;
                Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
                if (animatable != null) {
                    animatable.start();
                }
                Object obj2 = this.f52837K;
                Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
                if (animatable2 != null) {
                    animatable2.start();
                }
                if (this.f52835I == 0) {
                    this.f52835I = 1;
                    this.f52833G = SystemClock.uptimeMillis();
                    ArrayList arrayList = this.f52842z;
                    int size = arrayList.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        ((C14692c) arrayList.get(i13)).m42127b(this);
                    }
                    invalidateSelf();
                    break;
                }
                break;
            default:
                Object obj3 = this.f52836J;
                Animatable animatable3 = obj3 instanceof Animatable ? (Animatable) obj3 : null;
                if (animatable3 != null) {
                    animatable3.start();
                }
                Object obj4 = this.f52837K;
                Animatable animatable4 = obj4 instanceof Animatable ? (Animatable) obj4 : null;
                if (animatable4 != null) {
                    animatable4.start();
                }
                if (this.f52835I == 0) {
                    this.f52835I = 1;
                    this.f52833G = SystemClock.uptimeMillis();
                    ArrayList arrayList2 = this.f52842z;
                    int size2 = arrayList2.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        ((C14692c) arrayList2.get(i14)).m42127b(this);
                    }
                    invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        switch (this.f52839w) {
            case 0:
                Object obj = this.f52836J;
                Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
                if (animatable != null) {
                    animatable.stop();
                }
                Object obj2 = this.f52837K;
                Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
                if (animatable2 != null) {
                    animatable2.stop();
                }
                if (this.f52835I != 2) {
                    m41347b();
                }
                break;
            default:
                Object obj3 = this.f52836J;
                Animatable animatable3 = obj3 instanceof Animatable ? (Animatable) obj3 : null;
                if (animatable3 != null) {
                    animatable3.stop();
                }
                Object obj4 = this.f52837K;
                Animatable animatable4 = obj4 instanceof Animatable ? (Animatable) obj4 : null;
                if (animatable4 != null) {
                    animatable4.stop();
                }
                if (this.f52835I != 2) {
                    m41347b();
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f52839w) {
            case 0:
                unscheduleSelf(runnable);
                break;
            default:
                unscheduleSelf(runnable);
                break;
        }
    }

    public C14477a(Drawable drawable, Drawable drawable2, EnumC15876g enumC15876g, int i13, boolean z4) {
        this.f52838L = enumC15876g;
        this.f52840x = i13;
        this.f52841y = z4;
        this.f52831E = m41346a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f52832F = m41346a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.f52834H = 255;
        this.f52836J = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.f52837K = drawableMutate;
        if (i13 > 0) {
            Drawable drawable3 = this.f52836J;
            if (drawable3 != null) {
                drawable3.setCallback(this);
            }
            if (drawableMutate != null) {
                drawableMutate.setCallback(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.");
    }
}
