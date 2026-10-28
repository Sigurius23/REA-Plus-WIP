package cc;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import ar.C1913a;
import ar.C1916d;
import e93.AbstractC12889b;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p002a0.C0022g;
import p479s4.AbstractC32121b;
import p513u4.AbstractC34514b;
import p513u4.AbstractC34523k;

/* JADX INFO: renamed from: cc.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C4399f extends AbstractC4400g implements Animatable {

    /* JADX INFO: renamed from: y */
    public final Context f17753y;

    /* JADX INFO: renamed from: z */
    public C1916d f17754z = null;

    /* JADX INFO: renamed from: E */
    public ArrayList f17750E = null;

    /* JADX INFO: renamed from: F */
    public final C4396c f17751F = new C4396c(this);

    /* JADX INFO: renamed from: x */
    public final C4397d f17752x = new C4397d();

    public C4399f(Context context, int i13) {
        this.f17753y = context;
    }

    @Override // cc.AbstractC4400g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C4397d c4397d = this.f17752x;
        c4397d.f17746a.draw(canvas);
        if (c4397d.f17747b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.getAlpha() : this.f17752x.f17746a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f17752x.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.getColorFilter() : this.f17752x.f17746a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f17755w != null) {
            return new C1913a(this.f17755w.getConstantState(), 1);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f17752x.f17746a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f17752x.f17746a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.getOpacity() : this.f17752x.f17746a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C4397d c4397d;
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c4397d = this.f17752x;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM36252R = AbstractC12889b.m36252R(resources, theme, attributeSet, AbstractC4394a.f17742e);
                    int resourceId = typedArrayM36252R.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C4409p c4409p = new C4409p();
                        ThreadLocal threadLocal = AbstractC34523k.f145117a;
                        c4409p.f17755w = AbstractC34514b.m109070f(resources, resourceId, theme);
                        c4409p.f17812F = false;
                        c4409p.setCallback(this.f17751F);
                        C4409p c4409p2 = c4397d.f17746a;
                        if (c4409p2 != null) {
                            c4409p2.setCallback(null);
                        }
                        c4397d.f17746a = c4409p;
                    }
                    typedArrayM36252R.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC4394a.f17743f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f17753y;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(c4397d.f17746a.f17816x.f17798b.f17796o.get(string));
                        if (c4397d.f17748c == null) {
                            c4397d.f17748c = new ArrayList();
                            c4397d.f17749d = new C0022g(0);
                        }
                        c4397d.f17748c.add(animatorLoadAnimator);
                        c4397d.f17749d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c4397d.f17747b == null) {
            c4397d.f17747b = new AnimatorSet();
        }
        c4397d.f17747b.playTogether(c4397d.f17748c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.isAutoMirrored() : this.f17752x.f17746a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f17755w;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f17752x.f17747b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.isStateful() : this.f17752x.f17746a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f17752x.f17746a.setBounds(rect);
        }
    }

    @Override // cc.AbstractC4400g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i13) {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.setLevel(i13) : this.f17752x.f17746a.setLevel(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.setState(iArr) : this.f17752x.f17746a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.setAlpha(i13);
        } else {
            this.f17752x.f17746a.setAlpha(i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.setAutoMirrored(z4);
        } else {
            this.f17752x.f17746a.setAutoMirrored(z4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f17752x.f17746a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i13) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            AbstractC32121b.m99991D(i13, drawable);
        } else {
            this.f17752x.f17746a.setTint(i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            AbstractC32121b.m99992E(drawable, colorStateList);
        } else {
            this.f17752x.f17746a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            AbstractC32121b.m99993F(drawable, mode);
        } else {
            this.f17752x.f17746a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z13) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            return drawable.setVisible(z4, z13);
        }
        this.f17752x.f17746a.setVisible(z4, z13);
        return super.setVisible(z4, z13);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C4397d c4397d = this.f17752x;
        if (c4397d.f17747b.isStarted()) {
            return;
        }
        c4397d.f17747b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f17752x.f17747b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
