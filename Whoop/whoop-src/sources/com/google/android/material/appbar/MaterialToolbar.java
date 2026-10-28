package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whoop.android.R;
import cr.AbstractC11075m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import kr.C22788g;
import p006a4.AbstractC0354a;
import p026b2.C2298d;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p257jq.AbstractC21885a;
import p435qr.AbstractC30554a;
import p444r.MenuC30818l;
import se.AbstractC32411b;

/* JADX INFO: loaded from: classes6.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: C0 */
    public static final ImageView.ScaleType[] f20740C0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: A0 */
    public ImageView.ScaleType f20741A0;

    /* JADX INFO: renamed from: B0 */
    public Boolean f20742B0;

    /* JADX INFO: renamed from: x0 */
    public Integer f20743x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f20744y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f20745z0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC30554a.m93706a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM29873g = AbstractC11075m.m29873g(context2, attributeSet, AbstractC21885a.f84527D, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM29873g.hasValue(2)) {
            setNavigationIconTint(typedArrayM29873g.getColor(2, -1));
        }
        this.f20744y0 = typedArrayM29873g.getBoolean(4, false);
        this.f20745z0 = typedArrayM29873g.getBoolean(3, false);
        int i13 = typedArrayM29873g.getInt(1, -1);
        if (i13 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f20740C0;
            if (i13 < scaleTypeArr.length) {
                this.f20741A0 = scaleTypeArr[i13];
            }
        }
        if (typedArrayM29873g.hasValue(0)) {
            this.f20742B0 = Boolean.valueOf(typedArrayM29873g.getBoolean(0, false));
        }
        typedArrayM29873g.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : AbstractC0354a.m976p(background);
        if (colorStateListValueOf != null) {
            C22788g c22788g = new C22788g();
            c22788g.m66011m(colorStateListValueOf);
            c22788g.m66009k(context2);
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            c22788g.m66010l(AbstractC16877h0.m47510e(this));
            setBackground(c22788g);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m15683L(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i13 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i14 = measuredWidth2 + i13;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i13, 0), Math.max(i14 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i13 += iMax;
            i14 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i14 - i13, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i13, textView.getTop(), i14, textView.getBottom());
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f20741A0;
    }

    public Integer getNavigationIconTint() {
        return this.f20743x0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C22788g) {
            AbstractC32411b.m101088c0(this, (C22788g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z4, i13, i14, i15, i16);
        C2298d c2298d = AbstractC11075m.f35034c;
        ImageView imageView2 = null;
        if (this.f20744y0 || this.f20745z0) {
            ArrayList arrayListM29871e = AbstractC11075m.m29871e(this, getTitle());
            TextView textView = arrayListM29871e.isEmpty() ? null : (TextView) Collections.min(arrayListM29871e, c2298d);
            ArrayList arrayListM29871e2 = AbstractC11075m.m29871e(this, getSubtitle());
            TextView textView2 = arrayListM29871e2.isEmpty() ? null : (TextView) Collections.max(arrayListM29871e2, c2298d);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i17 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i18 = 0; i18 < getChildCount(); i18++) {
                    View childAt = getChildAt(i18);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i17 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i17 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f20744y0 && textView != null) {
                    m15683L(textView, pair);
                }
                if (this.f20745z0 && textView2 != null) {
                    m15683L(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i19 = 0; i19 < getChildCount(); i19++) {
                View childAt2 = getChildAt(i19);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f20742B0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f20741A0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f13) {
        super.setElevation(f13);
        Drawable background = getBackground();
        if (background instanceof C22788g) {
            ((C22788g) background).m66010l(f13);
        }
    }

    public void setLogoAdjustViewBounds(boolean z4) {
        Boolean bool = this.f20742B0;
        if (bool == null || bool.booleanValue() != z4) {
            this.f20742B0 = Boolean.valueOf(z4);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f20741A0 != scaleType) {
            this.f20741A0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f20743x0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f20743x0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i13) {
        this.f20743x0 = Integer.valueOf(i13);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z4) {
        if (this.f20745z0 != z4) {
            this.f20745z0 = z4;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z4) {
        if (this.f20744y0 != z4) {
            this.f20744y0 = z4;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* JADX INFO: renamed from: t */
    public final void mo3325t(int i13) {
        Menu menu = getMenu();
        boolean z4 = menu instanceof MenuC30818l;
        if (z4) {
            ((MenuC30818l) menu).m94828z();
        }
        super.mo3325t(i13);
        if (z4) {
            ((MenuC30818l) menu).m94827y();
        }
    }
}
