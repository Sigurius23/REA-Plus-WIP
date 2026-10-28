package p474s;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: s.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C32029y0 extends ToggleButton {

    /* JADX INFO: renamed from: w */
    public final C31980m f132894w;

    /* JADX INFO: renamed from: x */
    public final C32001r0 f132895x;

    /* JADX INFO: renamed from: y */
    public C32000r f132896y;

    public C32029y0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        AbstractC31967i2.m99459a(getContext(), this);
        C31980m c31980m = new C31980m(this);
        this.f132894w = c31980m;
        c31980m.m99471d(attributeSet, R.attr.buttonStyleToggle);
        C32001r0 c32001r0 = new C32001r0(this);
        this.f132895x = c32001r0;
        c32001r0.m99525f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m99517b(attributeSet, R.attr.buttonStyleToggle);
    }

    private C32000r getEmojiTextViewHelper() {
        if (this.f132896y == null) {
            this.f132896y = new C32000r(this);
        }
        return this.f132896y;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C31980m c31980m = this.f132894w;
        if (c31980m != null) {
            c31980m.m99468a();
        }
        C32001r0 c32001r0 = this.f132895x;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C31980m c31980m = this.f132894w;
        if (c31980m != null) {
            return c31980m.m99469b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C31980m c31980m = this.f132894w;
        if (c31980m != null) {
            return c31980m.m99470c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f132895x.m99523d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f132895x.m99524e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().m99518c(z4);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C31980m c31980m = this.f132894w;
        if (c31980m != null) {
            c31980m.m99472e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        C31980m c31980m = this.f132894w;
        if (c31980m != null) {
            c31980m.m99473f(i13);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C32001r0 c32001r0 = this.f132895x;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C32001r0 c32001r0 = this.f132895x;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().m99519d(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m99516a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C31980m c31980m = this.f132894w;
        if (c31980m != null) {
            c31980m.m99475h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C31980m c31980m = this.f132894w;
        if (c31980m != null) {
            c31980m.m99476i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C32001r0 c32001r0 = this.f132895x;
        c32001r0.m99527h(colorStateList);
        c32001r0.m99522b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C32001r0 c32001r0 = this.f132895x;
        c32001r0.m99528i(mode);
        c32001r0.m99522b();
    }
}
