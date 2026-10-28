package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.whoop.android.R;
import p296l5.InterfaceC23349m;
import p474s.AbstractC31967i2;
import p474s.AbstractC31971j2;
import p474s.C31980m;
import p474s.C31988o;
import p474s.C32000r;
import p474s.C32001r0;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes5.dex */
public class AppCompatCheckBox extends CheckBox implements InterfaceC23349m {

    /* JADX INFO: renamed from: w */
    public final C31988o f4325w;

    /* JADX INFO: renamed from: x */
    public final C31980m f4326x;

    /* JADX INFO: renamed from: y */
    public final C32001r0 f4327y;

    /* JADX INFO: renamed from: z */
    public C32000r f4328z;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    private C32000r getEmojiTextViewHelper() {
        if (this.f4328z == null) {
            this.f4328z = new C32000r(this);
        }
        return this.f4328z;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C31980m c31980m = this.f4326x;
        if (c31980m != null) {
            c31980m.m99468a();
        }
        C32001r0 c32001r0 = this.f4327y;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C31980m c31980m = this.f4326x;
        if (c31980m != null) {
            return c31980m.m99469b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C31980m c31980m = this.f4326x;
        if (c31980m != null) {
            return c31980m.m99470c();
        }
        return null;
    }

    @Override // p296l5.InterfaceC23349m
    public ColorStateList getSupportButtonTintList() {
        C31988o c31988o = this.f4325w;
        if (c31988o != null) {
            return c31988o.f132790a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C31988o c31988o = this.f4325w;
        if (c31988o != null) {
            return c31988o.f132791b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4327y.m99523d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4327y.m99524e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().m99518c(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C31980m c31980m = this.f4326x;
        if (c31980m != null) {
            c31980m.m99472e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        C31980m c31980m = this.f4326x;
        if (c31980m != null) {
            c31980m.m99473f(i13);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C31988o c31988o = this.f4325w;
        if (c31988o != null) {
            if (c31988o.f132794e) {
                c31988o.f132794e = false;
            } else {
                c31988o.f132794e = true;
                c31988o.m99496a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C32001r0 c32001r0 = this.f4327y;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C32001r0 c32001r0 = this.f4327y;
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
        C31980m c31980m = this.f4326x;
        if (c31980m != null) {
            c31980m.m99475h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C31980m c31980m = this.f4326x;
        if (c31980m != null) {
            c31980m.m99476i(mode);
        }
    }

    @Override // p296l5.InterfaceC23349m
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C31988o c31988o = this.f4325w;
        if (c31988o != null) {
            c31988o.f132790a = colorStateList;
            c31988o.f132792c = true;
            c31988o.m99496a();
        }
    }

    @Override // p296l5.InterfaceC23349m
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C31988o c31988o = this.f4325w;
        if (c31988o != null) {
            c31988o.f132791b = mode;
            c31988o.f132793d = true;
            c31988o.m99496a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C32001r0 c32001r0 = this.f4327y;
        c32001r0.m99527h(colorStateList);
        c32001r0.m99522b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C32001r0 c32001r0 = this.f4327y;
        c32001r0.m99528i(mode);
        c32001r0.m99522b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC31971j2.m99463a(context);
        AbstractC31967i2.m99459a(getContext(), this);
        C31988o c31988o = new C31988o(this);
        this.f4325w = c31988o;
        c31988o.m99498c(attributeSet, i13);
        C31980m c31980m = new C31980m(this);
        this.f4326x = c31980m;
        c31980m.m99471d(attributeSet, i13);
        C32001r0 c32001r0 = new C32001r0(this);
        this.f4327y = c32001r0;
        c32001r0.m99525f(attributeSet, i13);
        getEmojiTextViewHelper().m99517b(attributeSet, i13);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i13) {
        setButtonDrawable(AbstractC30060g.m92133x(getContext(), i13));
    }
}
