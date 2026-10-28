package p474s;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: s.l */
/* JADX INFO: loaded from: classes5.dex */
public class C31976l extends AutoCompleteTextView {

    /* JADX INFO: renamed from: z */
    public static final int[] f132747z = {R.attr.popupBackground};

    /* JADX INFO: renamed from: w */
    public final C31980m f132748w;

    /* JADX INFO: renamed from: x */
    public final C32001r0 f132749x;

    /* JADX INFO: renamed from: y */
    public final C32020w f132750y;

    public C31976l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C31980m c31980m = this.f132748w;
        if (c31980m != null) {
            c31980m.m99468a();
        }
        C32001r0 c32001r0 = this.f132749x;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C31980m c31980m = this.f132748w;
        if (c31980m != null) {
            return c31980m.m99469b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C31980m c31980m = this.f132748w;
        if (c31980m != null) {
            return c31980m.m99470c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f132749x.m99523d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f132749x.m99524e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC32004s.m99548q(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f132750y.m99575f(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C31980m c31980m = this.f132748w;
        if (c31980m != null) {
            c31980m.m99472e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        C31980m c31980m = this.f132748w;
        if (c31980m != null) {
            c31980m.m99473f(i13);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C32001r0 c32001r0 = this.f132749x;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C32001r0 c32001r0 = this.f132749x;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i13) {
        setDropDownBackgroundDrawable(AbstractC30060g.m92133x(getContext(), i13));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.f132750y.m99576g(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f132750y.m99574d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C31980m c31980m = this.f132748w;
        if (c31980m != null) {
            c31980m.m99475h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C31980m c31980m = this.f132748w;
        if (c31980m != null) {
            c31980m.m99476i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C32001r0 c32001r0 = this.f132749x;
        c32001r0.m99527h(colorStateList);
        c32001r0.m99522b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C32001r0 c32001r0 = this.f132749x;
        c32001r0.m99528i(mode);
        c32001r0.m99522b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        C32001r0 c32001r0 = this.f132749x;
        if (c32001r0 != null) {
            c32001r0.m99526g(context, i13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31976l(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, com.whoop.android.R.attr.autoCompleteTextViewStyle);
        AbstractC31971j2.m99463a(context);
        AbstractC31967i2.m99459a(getContext(), this);
        C31983m2 c31983m2M99479q = C31983m2.m99479q(getContext(), attributeSet, f132747z, com.whoop.android.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) c31983m2M99479q.f132769x).hasValue(0)) {
            setDropDownBackgroundDrawable(c31983m2M99479q.m99486j(0));
        }
        c31983m2M99479q.m99491r();
        C31980m c31980m = new C31980m(this);
        this.f132748w = c31980m;
        c31980m.m99471d(attributeSet, com.whoop.android.R.attr.autoCompleteTextViewStyle);
        C32001r0 c32001r0 = new C32001r0(this);
        this.f132749x = c32001r0;
        c32001r0.m99525f(attributeSet, com.whoop.android.R.attr.autoCompleteTextViewStyle);
        c32001r0.m99522b();
        C32020w c32020w = new C32020w(this);
        this.f132750y = c32020w;
        c32020w.mo99418e(attributeSet, com.whoop.android.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM99574d = c32020w.m99574d(keyListener);
        if (keyListenerM99574d == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM99574d);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }
}
