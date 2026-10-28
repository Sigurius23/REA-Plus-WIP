package cc;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import e93.AbstractC12889b;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p002a0.C0022g;
import p479s4.AbstractC32121b;

/* JADX INFO: renamed from: cc.p */
/* JADX INFO: loaded from: classes.dex */
public final class C4409p extends AbstractC4400g {

    /* JADX INFO: renamed from: J */
    public static final PorterDuff.Mode f17810J = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: E */
    public boolean f17811E;

    /* JADX INFO: renamed from: F */
    public boolean f17812F;

    /* JADX INFO: renamed from: G */
    public final float[] f17813G;

    /* JADX INFO: renamed from: H */
    public final Matrix f17814H;

    /* JADX INFO: renamed from: I */
    public final Rect f17815I;

    /* JADX INFO: renamed from: x */
    public C4407n f17816x;

    /* JADX INFO: renamed from: y */
    public PorterDuffColorFilter f17817y;

    /* JADX INFO: renamed from: z */
    public ColorFilter f17818z;

    public C4409p() {
        this.f17812F = true;
        this.f17813G = new float[9];
        this.f17814H = new Matrix();
        this.f17815I = new Rect();
        this.f17816x = new C4407n();
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m13833a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f17755w;
        if (drawable == null) {
            return false;
        }
        AbstractC32121b.m99999d(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f17815I;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f17818z;
        if (colorFilter == null) {
            colorFilter = this.f17817y;
        }
        Matrix matrix = this.f17814H;
        canvas.getMatrix(matrix);
        float[] fArr = this.f17813G;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, iWidth);
        int iMin2 = Math.min(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && AbstractC32121b.m100003h(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        this.f17816x.m13827b(iMin, iMin2);
        if (!this.f17812F) {
            this.f17816x.m13832g(iMin, iMin2);
        } else if (!this.f17816x.m13826a()) {
            this.f17816x.m13832g(iMin, iMin2);
            this.f17816x.m13831f();
        }
        this.f17816x.m13828c(canvas, colorFilter, rect);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f17755w;
        return drawable != null ? AbstractC32121b.m100001f(drawable) : this.f17816x.f17798b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f17816x.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f17755w;
        return drawable != null ? AbstractC32121b.m100002g(drawable) : this.f17818z;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f17755w != null) {
            return new C4408o(this.f17755w.getConstantState());
        }
        this.f17816x.f17797a = getChangingConfigurations();
        return this.f17816x;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f17816x.f17798b.f17790i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f17816x.f17798b.f17789h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f17755w;
        return drawable != null ? AbstractC32121b.m100010p(drawable) : this.f17816x.f17801e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C4407n c4407n = this.f17816x;
        if (c4407n == null) {
            return false;
        }
        if (c4407n.m13829d()) {
            return true;
        }
        ColorStateList colorStateList = this.f17816x.f17799c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f17811E && super.mutate() == this) {
            this.f17816x = new C4407n(this.f17816x);
            this.f17811E = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z4;
        PorterDuff.Mode mode;
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C4407n c4407n = this.f17816x;
        ColorStateList colorStateList = c4407n.f17799c;
        if (colorStateList == null || (mode = c4407n.f17800d) == null) {
            z4 = false;
        } else {
            this.f17817y = m13833a(colorStateList, mode);
            invalidateSelf();
            z4 = true;
        }
        if (!c4407n.m13829d() || !c4407n.m13830e(iArr)) {
            return z4;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j7) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j7);
        } else {
            super.scheduleSelf(runnable, j7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.setAlpha(i13);
        } else if (this.f17816x.f17798b.getRootAlpha() != i13) {
            this.f17816x.f17798b.setRootAlpha(i13);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            AbstractC32121b.m100020z(drawable, z4);
        } else {
            this.f17816x.f17801e = z4;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f17818z = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i13) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            AbstractC32121b.m99991D(i13, drawable);
        } else {
            setTintList(ColorStateList.valueOf(i13));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            AbstractC32121b.m99992E(drawable, colorStateList);
            return;
        }
        C4407n c4407n = this.f17816x;
        if (c4407n.f17799c != colorStateList) {
            c4407n.f17799c = colorStateList;
            this.f17817y = m13833a(colorStateList, c4407n.f17800d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            AbstractC32121b.m99993F(drawable, mode);
            return;
        }
        C4407n c4407n = this.f17816x;
        if (c4407n.f17800d != mode) {
            c4407n.f17800d = mode;
            this.f17817y = m13833a(c4407n.f17799c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z13) {
        Drawable drawable = this.f17755w;
        return drawable != null ? drawable.setVisible(z4, z13) : super.setVisible(z4, z13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f17755w;
        if (drawable != null) {
            AbstractC32121b.m100009o(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C4407n c4407n = this.f17816x;
        c4407n.f17798b = new C4406m();
        TypedArray typedArrayM36252R = AbstractC12889b.m36252R(resources, theme, attributeSet, AbstractC4394a.f17738a);
        C4407n c4407n2 = this.f17816x;
        C4406m c4406m = c4407n2.f17798b;
        int i13 = AbstractC12889b.m36246L(xmlPullParser, "tintMode") ? typedArrayM36252R.getInt(6, -1) : -1;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i13 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i13 != 5) {
            if (i13 != 9) {
                switch (i13) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c4407n2.f17800d = mode;
        ColorStateList colorStateListM36242H = AbstractC12889b.m36242H(typedArrayM36252R, xmlPullParser, theme);
        if (colorStateListM36242H != null) {
            c4407n2.f17799c = colorStateListM36242H;
        }
        boolean z4 = c4407n2.f17801e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z4 = typedArrayM36252R.getBoolean(5, z4);
        }
        c4407n2.f17801e = z4;
        float f13 = c4406m.f17791j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f13 = typedArrayM36252R.getFloat(7, f13);
        }
        c4406m.f17791j = f13;
        float f14 = c4406m.f17792k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f14 = typedArrayM36252R.getFloat(8, f14);
        }
        c4406m.f17792k = f14;
        if (c4406m.f17791j <= 0.0f) {
            throw new XmlPullParserException(typedArrayM36252R.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f14 > 0.0f) {
            c4406m.f17789h = typedArrayM36252R.getDimension(3, c4406m.f17789h);
            int i14 = 2;
            float dimension = typedArrayM36252R.getDimension(2, c4406m.f17790i);
            c4406m.f17790i = dimension;
            if (c4406m.f17789h <= 0.0f) {
                throw new XmlPullParserException(typedArrayM36252R.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c4406m.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayM36252R.getFloat(4, alpha);
                }
                c4406m.setAlpha(alpha);
                String string = typedArrayM36252R.getString(0);
                if (string != null) {
                    c4406m.f17794m = string;
                    c4406m.f17796o.put(string, c4406m);
                }
                typedArrayM36252R.recycle();
                c4407n.f17797a = getChangingConfigurations();
                int i15 = 1;
                c4407n.f17807k = true;
                C4407n c4407n3 = this.f17816x;
                C4406m c4406m2 = c4407n3.f17798b;
                ArrayDeque arrayDeque = new ArrayDeque();
                C4403j c4403j = c4406m2.f17788g;
                C0022g c0022g = c4406m2.f17796o;
                arrayDeque.push(c4403j);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z13 = true;
                while (eventType != i15 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == i14) {
                        String name = xmlPullParser.getName();
                        C4403j c4403j2 = (C4403j) arrayDeque.peek();
                        if (c4403j2 != null) {
                            ArrayList arrayList = c4403j2.f17768b;
                            if ("path".equals(name)) {
                                C4402i c4402i = new C4402i();
                                c4402i.m13822c(resources, xmlPullParser, attributeSet, theme);
                                arrayList.add(c4402i);
                                if (c4402i.getPathName() != null) {
                                    c0022g.put(c4402i.getPathName(), c4402i);
                                }
                                c4407n3.f17797a = c4407n3.f17797a;
                                z13 = false;
                            } else if ("clip-path".equals(name)) {
                                C4401h c4401h = new C4401h();
                                c4401h.m13819c(resources, xmlPullParser, attributeSet, theme);
                                arrayList.add(c4401h);
                                if (c4401h.getPathName() != null) {
                                    c0022g.put(c4401h.getPathName(), c4401h);
                                }
                                c4407n3.f17797a = c4407n3.f17797a;
                            } else if ("group".equals(name)) {
                                C4403j c4403j3 = new C4403j();
                                c4403j3.m13823c(resources, xmlPullParser, attributeSet, theme);
                                arrayList.add(c4403j3);
                                arrayDeque.push(c4403j3);
                                if (c4403j3.getGroupName() != null) {
                                    c0022g.put(c4403j3.getGroupName(), c4403j3);
                                }
                                c4407n3.f17797a = c4407n3.f17797a;
                            }
                        }
                    } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                        arrayDeque.pop();
                    }
                    eventType = xmlPullParser.next();
                    i15 = 1;
                    i14 = 2;
                }
                if (!z13) {
                    this.f17817y = m13833a(c4407n.f17799c, c4407n.f17800d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayM36252R.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayM36252R.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C4409p(C4407n c4407n) {
        this.f17812F = true;
        this.f17813G = new float[9];
        this.f17814H = new Matrix();
        this.f17815I = new Rect();
        this.f17816x = c4407n;
        this.f17817y = m13833a(c4407n.f17799c, c4407n.f17800d);
    }
}
