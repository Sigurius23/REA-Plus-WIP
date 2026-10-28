package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p412q3.C29875i;
import p499t9.C33623c0;
import p632y.AbstractC38771a;
import p666z.C39917a;

/* JADX INFO: loaded from: classes5.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: F */
    public static final int[] f4453F = {R.attr.colorBackground};

    /* JADX INFO: renamed from: G */
    public static final C33623c0 f4454G = new C33623c0();

    /* JADX INFO: renamed from: E */
    public final C29875i f4455E;

    /* JADX INFO: renamed from: w */
    public boolean f4456w;

    /* JADX INFO: renamed from: x */
    public boolean f4457x;

    /* JADX INFO: renamed from: y */
    public final Rect f4458y;

    /* JADX INFO: renamed from: z */
    public final Rect f4459z;

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.whoop.android.R.attr.cardViewStyle);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C39917a) ((Drawable) this.f4455E.f122095w)).f172332h;
    }

    public float getCardElevation() {
        return ((CardView) this.f4455E.f122096x).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f4458y.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f4458y.left;
    }

    public int getContentPaddingRight() {
        return this.f4458y.right;
    }

    public int getContentPaddingTop() {
        return this.f4458y.top;
    }

    public float getMaxCardElevation() {
        return ((C39917a) ((Drawable) this.f4455E.f122095w)).f172329e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f4457x;
    }

    public float getRadius() {
        return ((C39917a) ((Drawable) this.f4455E.f122095w)).f172325a;
    }

    public boolean getUseCompatPadding() {
        return this.f4456w;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
    }

    public void setCardBackgroundColor(int i13) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i13);
        C39917a c39917a = (C39917a) ((Drawable) this.f4455E.f122095w);
        if (colorStateListValueOf == null) {
            c39917a.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        c39917a.f172332h = colorStateListValueOf;
        c39917a.f172326b.setColor(colorStateListValueOf.getColorForState(c39917a.getState(), c39917a.f172332h.getDefaultColor()));
        c39917a.invalidateSelf();
    }

    public void setCardElevation(float f13) {
        ((CardView) this.f4455E.f122096x).setElevation(f13);
    }

    public void setMaxCardElevation(float f13) {
        f4454G.m106246s(this.f4455E, f13);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i13) {
        super.setMinimumHeight(i13);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i13) {
        super.setMinimumWidth(i13);
    }

    @Override // android.view.View
    public final void setPadding(int i13, int i14, int i15, int i16) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i13, int i14, int i15, int i16) {
    }

    public void setPreventCornerOverlap(boolean z4) {
        if (z4 != this.f4457x) {
            this.f4457x = z4;
            C29875i c29875i = this.f4455E;
            f4454G.m106246s(c29875i, ((C39917a) ((Drawable) c29875i.f122095w)).f172329e);
        }
    }

    public void setRadius(float f13) {
        C39917a c39917a = (C39917a) ((Drawable) this.f4455E.f122095w);
        if (f13 == c39917a.f172325a) {
            return;
        }
        c39917a.f172325a = f13;
        c39917a.m128081b(null);
        c39917a.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z4) {
        if (this.f4456w != z4) {
            this.f4456w = z4;
            C29875i c29875i = this.f4455E;
            f4454G.m106246s(c29875i, ((C39917a) ((Drawable) c29875i.f122095w)).f172329e);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i13) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i13);
        Rect rect = new Rect();
        this.f4458y = rect;
        this.f4459z = new Rect();
        C29875i c29875i = new C29875i(this);
        this.f4455E = c29875i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC38771a.f166870a, i13, com.whoop.android.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f4453F);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.whoop.android.R.color.cardview_light_background) : getResources().getColor(com.whoop.android.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f4456w = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f4457x = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C39917a c39917a = new C39917a(colorStateListValueOf, dimension);
        c29875i.f122095w = c39917a;
        setBackgroundDrawable(c39917a);
        setClipToOutline(true);
        setElevation(dimension2);
        f4454G.m106246s(c29875i, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C39917a c39917a = (C39917a) ((Drawable) this.f4455E.f122095w);
        if (colorStateList == null) {
            c39917a.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c39917a.f172332h = colorStateList;
        c39917a.f172326b.setColor(colorStateList.getColorForState(c39917a.getState(), c39917a.f172332h.getDefaultColor()));
        c39917a.invalidateSelf();
    }
}
