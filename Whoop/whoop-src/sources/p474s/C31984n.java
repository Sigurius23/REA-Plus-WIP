package p474s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.whoop.android.R;
import p184h5.AbstractC16901p0;
import p290l.AbstractC22932a;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: s.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C31984n extends CheckedTextView {

    /* JADX INFO: renamed from: w */
    public final C31988o f132771w;

    /* JADX INFO: renamed from: x */
    public final C31980m f132772x;

    /* JADX INFO: renamed from: y */
    public final C32001r0 f132773y;

    /* JADX INFO: renamed from: z */
    public C32000r f132774z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31984n(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        AbstractC31971j2.m99463a(context);
        AbstractC31967i2.m99459a(getContext(), this);
        C32001r0 c32001r0 = new C32001r0(this);
        this.f132773y = c32001r0;
        c32001r0.m99525f(attributeSet, R.attr.checkedTextViewStyle);
        c32001r0.m99522b();
        C31980m c31980m = new C31980m(this);
        this.f132772x = c31980m;
        c31980m.m99471d(attributeSet, R.attr.checkedTextViewStyle);
        this.f132771w = new C31988o(this);
        Context context2 = getContext();
        int[] iArr = AbstractC22932a.f90519l;
        C31983m2 c31983m2M99479q = C31983m2.m99479q(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) c31983m2M99479q.f132769x;
        AbstractC16901p0.m47582m(this, getContext(), iArr, attributeSet, (TypedArray) c31983m2M99479q.f132769x, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC30060g.m92133x(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(AbstractC30060g.m92133x(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC30060g.m92133x(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(c31983m2M99479q.m99484h(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC31950e1.m99445c(typedArray.getInt(3, -1), null));
            }
            c31983m2M99479q.m99491r();
            getEmojiTextViewHelper().m99517b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th3) {
            c31983m2M99479q.m99491r();
            throw th3;
        }
    }

    private C32000r getEmojiTextViewHelper() {
        if (this.f132774z == null) {
            this.f132774z = new C32000r(this);
        }
        return this.f132774z;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C32001r0 c32001r0 = this.f132773y;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
        C31980m c31980m = this.f132772x;
        if (c31980m != null) {
            c31980m.m99468a();
        }
        C31988o c31988o = this.f132771w;
        if (c31988o != null) {
            c31988o.m99497b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C31980m c31980m = this.f132772x;
        if (c31980m != null) {
            return c31980m.m99469b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C31980m c31980m = this.f132772x;
        if (c31980m != null) {
            return c31980m.m99470c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C31988o c31988o = this.f132771w;
        if (c31988o != null) {
            return c31988o.f132790a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C31988o c31988o = this.f132771w;
        if (c31988o != null) {
            return c31988o.f132791b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f132773y.m99523d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f132773y.m99524e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC32004s.m99548q(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().m99518c(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C31980m c31980m = this.f132772x;
        if (c31980m != null) {
            c31980m.m99472e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        C31980m c31980m = this.f132772x;
        if (c31980m != null) {
            c31980m.m99473f(i13);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C31988o c31988o = this.f132771w;
        if (c31988o != null) {
            if (c31988o.f132794e) {
                c31988o.f132794e = false;
            } else {
                c31988o.f132794e = true;
                c31988o.m99497b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C32001r0 c32001r0 = this.f132773y;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C32001r0 c32001r0 = this.f132773y;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().m99519d(z4);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C31980m c31980m = this.f132772x;
        if (c31980m != null) {
            c31980m.m99475h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C31980m c31980m = this.f132772x;
        if (c31980m != null) {
            c31980m.m99476i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C31988o c31988o = this.f132771w;
        if (c31988o != null) {
            c31988o.f132790a = colorStateList;
            c31988o.f132792c = true;
            c31988o.m99497b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C31988o c31988o = this.f132771w;
        if (c31988o != null) {
            c31988o.f132791b = mode;
            c31988o.f132793d = true;
            c31988o.m99497b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C32001r0 c32001r0 = this.f132773y;
        c32001r0.m99527h(colorStateList);
        c32001r0.m99522b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C32001r0 c32001r0 = this.f132773y;
        c32001r0.m99528i(mode);
        c32001r0.m99522b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        C32001r0 c32001r0 = this.f132773y;
        if (c32001r0 != null) {
            c32001r0.m99526g(context, i13);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i13) {
        setCheckMarkDrawable(AbstractC30060g.m92133x(getContext(), i13));
    }
}
