package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.whoop.android.R;
import cr.AbstractC11066d;
import cr.AbstractC11075m;
import cr.C11065c;
import io.sentry.config.AbstractC20301a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import la.C23548b;
import p184h5.AbstractC16871f0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p257jq.AbstractC21885a;
import p287kq.AbstractC22766a;
import p311lq.C24644c;
import p311lq.C24645d;
import p311lq.C24646e;
import p311lq.C24651j;
import p311lq.InterfaceC24647f;
import p435qr.AbstractC30554a;
import p479s4.AbstractC32122c;
import p558vp.AbstractC36259c;
import p657yq.C39707a;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: loaded from: classes6.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* JADX INFO: renamed from: E */
    public View f20709E;

    /* JADX INFO: renamed from: F */
    public int f20710F;

    /* JADX INFO: renamed from: G */
    public int f20711G;

    /* JADX INFO: renamed from: H */
    public int f20712H;

    /* JADX INFO: renamed from: I */
    public int f20713I;

    /* JADX INFO: renamed from: J */
    public final Rect f20714J;

    /* JADX INFO: renamed from: K */
    public final C11065c f20715K;

    /* JADX INFO: renamed from: L */
    public final C39707a f20716L;

    /* JADX INFO: renamed from: M */
    public boolean f20717M;

    /* JADX INFO: renamed from: N */
    public boolean f20718N;

    /* JADX INFO: renamed from: O */
    public Drawable f20719O;

    /* JADX INFO: renamed from: P */
    public Drawable f20720P;

    /* JADX INFO: renamed from: Q */
    public int f20721Q;

    /* JADX INFO: renamed from: R */
    public boolean f20722R;

    /* JADX INFO: renamed from: S */
    public ValueAnimator f20723S;

    /* JADX INFO: renamed from: T */
    public long f20724T;

    /* JADX INFO: renamed from: U */
    public final TimeInterpolator f20725U;

    /* JADX INFO: renamed from: V */
    public final TimeInterpolator f20726V;

    /* JADX INFO: renamed from: W */
    public int f20727W;

    /* JADX INFO: renamed from: a0 */
    public C24646e f20728a0;

    /* JADX INFO: renamed from: b0 */
    public int f20729b0;

    /* JADX INFO: renamed from: c0 */
    public int f20730c0;

    /* JADX INFO: renamed from: d0 */
    public C16905q1 f20731d0;

    /* JADX INFO: renamed from: e0 */
    public int f20732e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f20733f0;

    /* JADX INFO: renamed from: g0 */
    public int f20734g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f20735h0;

    /* JADX INFO: renamed from: w */
    public boolean f20736w;

    /* JADX INFO: renamed from: x */
    public final int f20737x;

    /* JADX INFO: renamed from: y */
    public ViewGroup f20738y;

    /* JADX INFO: renamed from: z */
    public View f20739z;

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        int i13;
        ColorStateList colorStateListM65695C;
        ColorStateList colorStateListM65695C2;
        super(AbstractC30554a.m93706a(context, attributeSet, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar), attributeSet, R.attr.collapsingToolbarLayoutStyle);
        this.f20736w = true;
        this.f20714J = new Rect();
        this.f20727W = -1;
        this.f20732e0 = 0;
        this.f20734g0 = 0;
        Context context2 = getContext();
        C11065c c11065c = new C11065c(this);
        this.f20715K = c11065c;
        c11065c.f34956W = AbstractC22766a.f89676e;
        c11065c.m29849i(false);
        c11065c.f34943J = false;
        this.f20716L = new C39707a(context2);
        AbstractC11075m.m29867a(context2, attributeSet, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar);
        int[] iArr = AbstractC21885a.f84552l;
        AbstractC11075m.m29868b(context2, attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, R.style.Widget_Design_CollapsingToolbar);
        int i14 = typedArrayObtainStyledAttributes.getInt(4, 8388691);
        if (c11065c.f34978j != i14) {
            c11065c.f34978j = i14;
            c11065c.m29849i(false);
        }
        c11065c.m29852l(typedArrayObtainStyledAttributes.getInt(0, 8388627));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f20713I = dimensionPixelSize;
        this.f20712H = dimensionPixelSize;
        this.f20711G = dimensionPixelSize;
        this.f20710F = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            this.f20710F = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.f20712H = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f20711G = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f20713I = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        }
        this.f20717M = typedArrayObtainStyledAttributes.getBoolean(20, true);
        setTitle(typedArrayObtainStyledAttributes.getText(18));
        c11065c.m29854n(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        c11065c.m29851k(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            c11065c.m29854n(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            c11065c.m29851k(typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            int i15 = typedArrayObtainStyledAttributes.getInt(22, -1);
            setTitleEllipsize(i15 != 0 ? i15 != 1 ? i15 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START);
        }
        if (typedArrayObtainStyledAttributes.hasValue(11) && c11065c.f34986n != (colorStateListM65695C2 = AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context2, 11))) {
            c11065c.f34986n = colorStateListM65695C2;
            c11065c.m29849i(false);
        }
        int i16 = 2;
        if (typedArrayObtainStyledAttributes.hasValue(2) && c11065c.f34988o != (colorStateListM65695C = AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context2, 2))) {
            c11065c.f34988o = colorStateListM65695C;
            c11065c.m29849i(false);
        }
        this.f20727W = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, -1);
        if (typedArrayObtainStyledAttributes.hasValue(14) && (i13 = typedArrayObtainStyledAttributes.getInt(14, 1)) != c11065c.f34987n0) {
            c11065c.f34987n0 = i13;
            Bitmap bitmap = c11065c.f34944K;
            if (bitmap != null) {
                bitmap.recycle();
                c11065c.f34944K = null;
            }
            c11065c.m29849i(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            c11065c.f34955V = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(21, 0));
            c11065c.m29849i(false);
        }
        this.f20724T = typedArrayObtainStyledAttributes.getInt(15, 600);
        this.f20725U = AbstractC36259c.m115699l0(context2, R.attr.motionEasingStandardInterpolator, AbstractC22766a.f89674c);
        this.f20726V = AbstractC36259c.m115699l0(context2, R.attr.motionEasingStandardInterpolator, AbstractC22766a.f89675d);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(3));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(17));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(19, 0));
        this.f20737x = typedArrayObtainStyledAttributes.getResourceId(23, -1);
        this.f20733f0 = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.f20735h0 = typedArrayObtainStyledAttributes.getBoolean(12, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        C23548b c23548b = new C23548b(this, i16);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(this, c23548b);
    }

    /* JADX INFO: renamed from: b */
    public static C24651j m15677b(View view) {
        C24651j c24651j = (C24651j) view.getTag(R.id.view_offset_helper);
        if (c24651j != null) {
            return c24651j;
        }
        C24651j c24651j2 = new C24651j(view);
        view.setTag(R.id.view_offset_helper, c24651j2);
        return c24651j2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList colorStateListValueOf;
        Context context = getContext();
        TypedValue typedValueM56323V = AbstractC20301a.m56323V(context, R.attr.colorSurfaceContainer);
        if (typedValueM56323V != null) {
            int i13 = typedValueM56323V.resourceId;
            if (i13 != 0) {
                colorStateListValueOf = AbstractC32122c.getColorStateList(context, i13);
            } else {
                int i14 = typedValueM56323V.data;
                if (i14 != 0) {
                    colorStateListValueOf = ColorStateList.valueOf(i14);
                } else {
                    colorStateListValueOf = null;
                }
            }
        } else {
            colorStateListValueOf = null;
        }
        if (colorStateListValueOf != null) {
            return colorStateListValueOf.getDefaultColor();
        }
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        C39707a c39707a = this.f20716L;
        return c39707a.m127046a(dimension, c39707a.f170938d);
    }

    /* JADX INFO: renamed from: a */
    public final void m15678a() {
        View view;
        if (this.f20736w) {
            ViewGroup viewGroup = null;
            this.f20738y = null;
            this.f20739z = null;
            int i13 = this.f20737x;
            if (i13 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i13);
                this.f20738y = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    while (true) {
                        if (parent == this) {
                            view = viewGroup2;
                            break;
                        } else {
                            if (parent == null) {
                                break;
                            }
                            if (parent instanceof View) {
                                view = (View) parent;
                            }
                            parent = parent.getParent();
                            view = view;
                        }
                    }
                    this.f20739z = view;
                }
            }
            if (this.f20738y == null) {
                int childCount = getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.f20738y = viewGroup;
            }
            m15679c();
            this.f20736w = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m15679c() {
        View view;
        if (!this.f20717M && (view = this.f20709E) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f20709E);
            }
        }
        if (!this.f20717M || this.f20738y == null) {
            return;
        }
        if (this.f20709E == null) {
            this.f20709E = new View(getContext());
        }
        if (this.f20709E.getParent() == null) {
            this.f20738y.addView(this.f20709E, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C24645d;
    }

    /* JADX INFO: renamed from: d */
    public final void m15680d() {
        if (this.f20719O == null && this.f20720P == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f20729b0 < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        m15678a();
        if (this.f20738y == null && (drawable = this.f20719O) != null && this.f20721Q > 0) {
            drawable.mutate().setAlpha(this.f20721Q);
            this.f20719O.draw(canvas);
        }
        if (this.f20717M && this.f20718N) {
            ViewGroup viewGroup = this.f20738y;
            C11065c c11065c = this.f20715K;
            if (viewGroup == null || this.f20719O == null || this.f20721Q <= 0 || this.f20730c0 != 1 || c11065c.f34962b >= c11065c.f34968e) {
                c11065c.m29845d(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.f20719O.getBounds(), Region.Op.DIFFERENCE);
                c11065c.m29845d(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.f20720P == null || this.f20721Q <= 0) {
            return;
        }
        C16905q1 c16905q1 = this.f20731d0;
        int iM47600d = c16905q1 != null ? c16905q1.m47600d() : 0;
        if (iM47600d > 0) {
            this.f20720P.setBounds(0, -this.f20729b0, getWidth(), iM47600d - this.f20729b0);
            this.f20720P.mutate().setAlpha(this.f20721Q);
            this.f20720P.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        boolean z4;
        View view2;
        Drawable drawable = this.f20719O;
        if (drawable == null || this.f20721Q <= 0 || ((view2 = this.f20739z) == null || view2 == this ? view != this.f20738y : view != view2)) {
            z4 = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.f20730c0 == 1 && view != null && this.f20717M) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.f20719O.mutate().setAlpha(this.f20721Q);
            this.f20719O.draw(canvas);
            z4 = true;
        }
        return super.drawChild(canvas, view, j7) || z4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f20720P;
        boolean z4 = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f20719O;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        C11065c c11065c = this.f20715K;
        if (c11065c != null) {
            c11065c.f34951R = drawableState;
            ColorStateList colorStateList2 = c11065c.f34988o;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c11065c.f34986n) != null && colorStateList.isStateful())) {
                c11065c.m29849i(false);
                z4 = true;
            }
            state |= z4;
        }
        if (state) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m15681e(int i13, int i14, int i15, int i16, boolean z4) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.f20717M || (view = this.f20709E) == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        int titleMarginStart = 0;
        boolean z13 = view.isAttachedToWindow() && this.f20709E.getVisibility() == 0;
        this.f20718N = z13;
        if (z13 || z4) {
            boolean z14 = getLayoutDirection() == 1;
            View view2 = this.f20739z;
            if (view2 == null) {
                view2 = this.f20738y;
            }
            int height = ((getHeight() - m15677b(view2).f96418b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((C24645d) view2.getLayoutParams())).bottomMargin;
            View view3 = this.f20709E;
            Rect rect = this.f20714J;
            AbstractC11066d.m29858a(this, view3, rect);
            ViewGroup viewGroup = this.f20738y;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            } else {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            }
            int i17 = rect.left + (z14 ? titleMarginEnd : titleMarginStart);
            int i18 = rect.top + height + titleMarginTop;
            int i19 = rect.right;
            if (!z14) {
                titleMarginStart = titleMarginEnd;
            }
            int i24 = i19 - titleMarginStart;
            int i25 = (rect.bottom + height) - titleMarginBottom;
            C11065c c11065c = this.f20715K;
            Rect rect2 = c11065c.f34974h;
            if (rect2.left != i17 || rect2.top != i18 || rect2.right != i24 || rect2.bottom != i25) {
                rect2.set(i17, i18, i24, i25);
                c11065c.f34952S = true;
            }
            int i26 = z14 ? this.f20712H : this.f20710F;
            int i27 = rect.top + this.f20711G;
            int i28 = (i15 - i13) - (z14 ? this.f20710F : this.f20712H);
            int i29 = (i16 - i14) - this.f20713I;
            Rect rect3 = c11065c.f34972g;
            if (rect3.left != i26 || rect3.top != i27 || rect3.right != i28 || rect3.bottom != i29) {
                rect3.set(i26, i27, i28, i29);
                c11065c.f34952S = true;
            }
            c11065c.m29849i(z4);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15682f() {
        CharSequence title;
        if (this.f20738y != null && this.f20717M && TextUtils.isEmpty(this.f20715K.f34940G)) {
            ViewGroup viewGroup = this.f20738y;
            if (viewGroup instanceof Toolbar) {
                title = ((Toolbar) viewGroup).getTitle();
            } else {
                title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
            }
            setTitle(title);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C24645d c24645d = new C24645d(-1, -1);
        c24645d.f96401a = 0;
        c24645d.f96402b = 0.5f;
        return c24645d;
    }

    public int getCollapsedTitleGravity() {
        return this.f20715K.f34980k;
    }

    public float getCollapsedTitleTextSize() {
        return this.f20715K.f34984m;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f20715K.f34999w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.f20719O;
    }

    public int getExpandedTitleGravity() {
        return this.f20715K.f34978j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f20713I;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f20712H;
    }

    public int getExpandedTitleMarginStart() {
        return this.f20710F;
    }

    public int getExpandedTitleMarginTop() {
        return this.f20711G;
    }

    public float getExpandedTitleTextSize() {
        return this.f20715K.f34982l;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f20715K.f35002z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.f20715K.f34993q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.f20715K.f34977i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.f20715K.f34977i0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.f20715K.f34977i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.f20715K.f34987n0;
    }

    public int getScrimAlpha() {
        return this.f20721Q;
    }

    public long getScrimAnimationDuration() {
        return this.f20724T;
    }

    public int getScrimVisibleHeightTrigger() {
        int i13 = this.f20727W;
        if (i13 >= 0) {
            return i13 + this.f20732e0 + this.f20734g0;
        }
        C16905q1 c16905q1 = this.f20731d0;
        int iM47600d = c16905q1 != null ? c16905q1.m47600d() : 0;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iM47600d, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f20720P;
    }

    public CharSequence getTitle() {
        if (this.f20717M) {
            return this.f20715K.f34940G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f20730c0;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f20715K.f34955V;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f20715K.f34939F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f20730c0 == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.f20728a0 == null) {
                this.f20728a0 = new C24646e(this);
            }
            C24646e c24646e = this.f20728a0;
            if (appBarLayout.f20682H == null) {
                appBarLayout.f20682H = new ArrayList();
            }
            if (c24646e != null && !appBarLayout.f20682H.contains(c24646e)) {
                appBarLayout.f20682H.add(c24646e);
            }
            AbstractC16871f0.m47500c(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f20715K.m29848h(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        C24646e c24646e = this.f20728a0;
        if (c24646e != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).f20682H) != null) {
            arrayList.remove(c24646e);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        C16905q1 c16905q1 = this.f20731d0;
        if (c16905q1 != null) {
            int iM47600d = c16905q1.m47600d();
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt = getChildAt(i17);
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iM47600d) {
                    childAt.offsetTopAndBottom(iM47600d);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i18 = 0; i18 < childCount2; i18++) {
            C24651j c24651jM15677b = m15677b(getChildAt(i18));
            View view = c24651jM15677b.f96417a;
            c24651jM15677b.f96418b = view.getTop();
            c24651jM15677b.f96419c = view.getLeft();
        }
        m15681e(i13, i14, i15, i16, false);
        m15682f();
        m15680d();
        int childCount3 = getChildCount();
        for (int i19 = 0; i19 < childCount3; i19++) {
            m15677b(getChildAt(i19)).m72003a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        int measuredHeight;
        int measuredHeight2;
        m15678a();
        super.onMeasure(i13, i14);
        int mode = View.MeasureSpec.getMode(i14);
        C16905q1 c16905q1 = this.f20731d0;
        int iM47600d = c16905q1 != null ? c16905q1.m47600d() : 0;
        if ((mode == 0 || this.f20733f0) && iM47600d > 0) {
            this.f20732e0 = iM47600d;
            super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iM47600d, 1073741824));
        }
        if (this.f20735h0) {
            C11065c c11065c = this.f20715K;
            if (c11065c.f34987n0 > 1) {
                m15682f();
                collapsingToolbarLayout = this;
                collapsingToolbarLayout.m15681e(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
                int i15 = c11065c.f34990p;
                if (i15 > 1) {
                    TextPaint textPaint = c11065c.f34954U;
                    textPaint.setTextSize(c11065c.f34982l);
                    textPaint.setTypeface(c11065c.f35002z);
                    textPaint.setLetterSpacing(c11065c.f34973g0);
                    collapsingToolbarLayout.f20734g0 = (i15 - 1) * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + collapsingToolbarLayout.f20734g0, 1073741824));
                }
            } else {
                collapsingToolbarLayout = this;
            }
        } else {
            collapsingToolbarLayout = this;
        }
        ViewGroup viewGroup = collapsingToolbarLayout.f20738y;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.f20739z;
            if (view == null || view == collapsingToolbarLayout) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                setMinimumHeight(measuredHeight);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight2 = view.getMeasuredHeight();
            }
            setMinimumHeight(measuredHeight2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        Drawable drawable = this.f20719O;
        if (drawable != null) {
            ViewGroup viewGroup = this.f20738y;
            if (this.f20730c0 == 1 && viewGroup != null && this.f20717M) {
                i14 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i13, i14);
        }
    }

    public void setCollapsedTitleGravity(int i13) {
        this.f20715K.m29852l(i13);
    }

    public void setCollapsedTitleTextAppearance(int i13) {
        this.f20715K.m29851k(i13);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        C11065c c11065c = this.f20715K;
        if (c11065c.f34988o != colorStateList) {
            c11065c.f34988o = colorStateList;
            c11065c.m29849i(false);
        }
    }

    public void setCollapsedTitleTextSize(float f13) {
        C11065c c11065c = this.f20715K;
        if (c11065c.f34984m != f13) {
            c11065c.f34984m = f13;
            c11065c.m29849i(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C11065c c11065c = this.f20715K;
        if (c11065c.m29853m(typeface)) {
            c11065c.m29849i(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f20719O;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f20719O = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f20738y;
                if (this.f20730c0 == 1 && viewGroup != null && this.f20717M) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.f20719O.setCallback(this);
                this.f20719O.setAlpha(this.f20721Q);
            }
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i13) {
        setContentScrim(new ColorDrawable(i13));
    }

    public void setContentScrimResource(int i13) {
        setContentScrim(AbstractC32122c.getDrawable(getContext(), i13));
    }

    public void setExpandedTitleColor(int i13) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i13));
    }

    public void setExpandedTitleGravity(int i13) {
        C11065c c11065c = this.f20715K;
        if (c11065c.f34978j != i13) {
            c11065c.f34978j = i13;
            c11065c.m29849i(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i13) {
        this.f20713I = i13;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i13) {
        this.f20712H = i13;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i13) {
        this.f20710F = i13;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i13) {
        this.f20711G = i13;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i13) {
        this.f20715K.m29854n(i13);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C11065c c11065c = this.f20715K;
        if (c11065c.f34986n != colorStateList) {
            c11065c.f34986n = colorStateList;
            c11065c.m29849i(false);
        }
    }

    public void setExpandedTitleTextSize(float f13) {
        C11065c c11065c = this.f20715K;
        if (c11065c.f34982l != f13) {
            c11065c.f34982l = f13;
            c11065c.m29849i(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C11065c c11065c = this.f20715K;
        if (c11065c.m29855o(typeface)) {
            c11065c.m29849i(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z4) {
        this.f20735h0 = z4;
    }

    public void setForceApplySystemWindowInsetTop(boolean z4) {
        this.f20733f0 = z4;
    }

    public void setHyphenationFrequency(int i13) {
        this.f20715K.f34993q0 = i13;
    }

    public void setLineSpacingAdd(float f13) {
        this.f20715K.f34989o0 = f13;
    }

    public void setLineSpacingMultiplier(float f13) {
        this.f20715K.f34991p0 = f13;
    }

    public void setMaxLines(int i13) {
        C11065c c11065c = this.f20715K;
        if (i13 != c11065c.f34987n0) {
            c11065c.f34987n0 = i13;
            Bitmap bitmap = c11065c.f34944K;
            if (bitmap != null) {
                bitmap.recycle();
                c11065c.f34944K = null;
            }
            c11065c.m29849i(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z4) {
        this.f20715K.f34943J = z4;
    }

    public void setScrimAlpha(int i13) {
        ViewGroup viewGroup;
        if (i13 != this.f20721Q) {
            if (this.f20719O != null && (viewGroup = this.f20738y) != null) {
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                viewGroup.postInvalidateOnAnimation();
            }
            this.f20721Q = i13;
            WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j7) {
        this.f20724T = j7;
    }

    public void setScrimVisibleHeightTrigger(int i13) {
        if (this.f20727W != i13) {
            this.f20727W = i13;
            m15680d();
        }
    }

    public void setScrimsShown(boolean z4) {
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        boolean z13 = isLaidOut() && !isInEditMode();
        if (this.f20722R != z4) {
            if (z13) {
                int i13 = z4 ? 255 : 0;
                m15678a();
                ValueAnimator valueAnimator = this.f20723S;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f20723S = valueAnimator2;
                    valueAnimator2.setInterpolator(i13 > this.f20721Q ? this.f20725U : this.f20726V);
                    this.f20723S.addUpdateListener(new C24644c(this, 0));
                } else if (valueAnimator.isRunning()) {
                    this.f20723S.cancel();
                }
                this.f20723S.setDuration(this.f20724T);
                this.f20723S.setIntValues(this.f20721Q, i13);
                this.f20723S.start();
            } else {
                setScrimAlpha(z4 ? 255 : 0);
            }
            this.f20722R = z4;
        }
    }

    public void setStaticLayoutBuilderConfigurer(InterfaceC24647f interfaceC24647f) {
        C11065c c11065c = this.f20715K;
        if (interfaceC24647f != null) {
            c11065c.m29849i(true);
        } else {
            c11065c.getClass();
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f20720P;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f20720P = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f20720P.setState(getDrawableState());
                }
                Drawable drawable3 = this.f20720P;
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f20720P.setVisible(getVisibility() == 0, false);
                this.f20720P.setCallback(this);
                this.f20720P.setAlpha(this.f20721Q);
            }
            WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i13) {
        setStatusBarScrim(new ColorDrawable(i13));
    }

    public void setStatusBarScrimResource(int i13) {
        setStatusBarScrim(AbstractC32122c.getDrawable(getContext(), i13));
    }

    public void setTitle(CharSequence charSequence) {
        C11065c c11065c = this.f20715K;
        if (charSequence == null || !TextUtils.equals(c11065c.f34940G, charSequence)) {
            c11065c.f34940G = charSequence;
            c11065c.f34941H = null;
            Bitmap bitmap = c11065c.f34944K;
            if (bitmap != null) {
                bitmap.recycle();
                c11065c.f34944K = null;
            }
            c11065c.m29849i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i13) {
        this.f20730c0 = i13;
        boolean z4 = i13 == 1;
        this.f20715K.f34964c = z4;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f20730c0 == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z4 && this.f20719O == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        C11065c c11065c = this.f20715K;
        c11065c.f34939F = truncateAt;
        c11065c.m29849i(false);
    }

    public void setTitleEnabled(boolean z4) {
        if (z4 != this.f20717M) {
            this.f20717M = z4;
            setContentDescription(getTitle());
            m15679c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        C11065c c11065c = this.f20715K;
        c11065c.f34955V = timeInterpolator;
        c11065c.m29849i(false);
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
        super.setVisibility(i13);
        boolean z4 = i13 == 0;
        Drawable drawable = this.f20720P;
        if (drawable != null && drawable.isVisible() != z4) {
            this.f20720P.setVisible(z4, false);
        }
        Drawable drawable2 = this.f20719O;
        if (drawable2 == null || drawable2.isVisible() == z4) {
            return;
        }
        this.f20719O.setVisible(z4, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f20719O || drawable == this.f20720P;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C24645d c24645d = new C24645d(context, attributeSet);
        c24645d.f96401a = 0;
        c24645d.f96402b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC21885a.f84553m);
        c24645d.f96401a = typedArrayObtainStyledAttributes.getInt(0, 0);
        c24645d.f96402b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
        return c24645d;
    }

    public void setCollapsedTitleTextColor(int i13) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i13));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        C24645d c24645d = new C24645d(-1, -1);
        c24645d.f96401a = 0;
        c24645d.f96402b = 0.5f;
        return c24645d;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C24645d c24645d = new C24645d(layoutParams);
        c24645d.f96401a = 0;
        c24645d.f96402b = 0.5f;
        return c24645d;
    }
}
