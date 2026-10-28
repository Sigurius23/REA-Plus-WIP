package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.whoop.android.R;
import hn.C17508p;
import p047c9.C4322m;
import p184h5.AbstractC16901p0;
import p184h5.C16864d;
import p184h5.C16870f;
import p184h5.InterfaceC16861c;
import p184h5.InterfaceC16918v;
import p243j5.C21328b;
import p296l5.C23348l;
import p474s.AbstractC31967i2;
import p474s.AbstractC31971j2;
import p474s.AbstractC32004s;
import p474s.AbstractC32031z;
import p474s.C31980m;
import p474s.C31996q;
import p474s.C32001r0;
import p474s.C32020w;
import p550vd.AbstractC35902e;

/* JADX INFO: loaded from: classes5.dex */
public class AppCompatEditText extends EditText implements InterfaceC16918v {

    /* JADX INFO: renamed from: E */
    public C31996q f4329E;

    /* JADX INFO: renamed from: w */
    public final C31980m f4330w;

    /* JADX INFO: renamed from: x */
    public final C32001r0 f4331x;

    /* JADX INFO: renamed from: y */
    public final C23348l f4332y;

    /* JADX INFO: renamed from: z */
    public final C32020w f4333z;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    private C31996q getSuperCaller() {
        if (this.f4329E == null) {
            this.f4329E = new C31996q(this);
        }
        return this.f4329E;
    }

    @Override // p184h5.InterfaceC16918v
    /* JADX INFO: renamed from: a */
    public final C16870f mo3289a(C16870f c16870f) {
        this.f4332y.getClass();
        return C23348l.m67596a(this, c16870f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C31980m c31980m = this.f4330w;
        if (c31980m != null) {
            c31980m.m99468a();
        }
        C32001r0 c32001r0 = this.f4331x;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C31980m c31980m = this.f4330w;
        if (c31980m != null) {
            return c31980m.m99469b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C31980m c31980m = this.f4330w;
        if (c31980m != null) {
            return c31980m.m99470c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4331x.m99523d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4331x.m99524e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM47575f;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f4331x.getClass();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 && inputConnectionOnCreateInputConnection != null) {
            AbstractC35902e.m113956a0(editorInfo, getText());
        }
        AbstractC32004s.m99548q(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i13 <= 30 && (strArrM47575f = AbstractC16901p0.m47575f(this)) != null) {
            editorInfo.contentMimeTypes = strArrM47575f;
            inputConnectionOnCreateInputConnection = new C21328b(inputConnectionOnCreateInputConnection, new C17508p(this, 22));
        }
        return this.f4333z.m99575f(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 || i13 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zM99584a = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AbstractC16901p0.m47575f(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zM99584a = AbstractC32031z.m99584a(dragEvent, this, activity);
            }
        }
        if (zM99584a) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i13) {
        C16864d c16864d;
        InterfaceC16861c interfaceC16861c;
        int i14;
        C4322m c4322m;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 31 || AbstractC16901p0.m47575f(this) == null || !(i13 == 16908322 || i13 == 16908337)) {
            return super.onTextContextMenuItem(i13);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i15 >= 31) {
                c4322m = new C4322m(primaryClip, 1);
            } else {
                c16864d = new C16864d();
                c16864d.f64790b = primaryClip;
                c16864d.f64791c = 1;
            }
            if (i13 == 16908322) {
                interfaceC16861c = c16864d;
                interfaceC16861c = c4322m;
                i14 = 0;
            } else {
                interfaceC16861c = c16864d;
                interfaceC16861c = c4322m;
                i14 = 1;
            }
            interfaceC16861c.mo13631e(i14);
            AbstractC16901p0.m47579j(this, interfaceC16861c.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C31980m c31980m = this.f4330w;
        if (c31980m != null) {
            c31980m.m99472e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        C31980m c31980m = this.f4330w;
        if (c31980m != null) {
            c31980m.m99473f(i13);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C32001r0 c32001r0 = this.f4331x;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C32001r0 c32001r0 = this.f4331x;
        if (c32001r0 != null) {
            c32001r0.m99522b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z4) {
        this.f4333z.m99576g(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f4333z.m99574d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C31980m c31980m = this.f4330w;
        if (c31980m != null) {
            c31980m.m99475h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C31980m c31980m = this.f4330w;
        if (c31980m != null) {
            c31980m.m99476i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C32001r0 c32001r0 = this.f4331x;
        c32001r0.m99527h(colorStateList);
        c32001r0.m99522b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C32001r0 c32001r0 = this.f4331x;
        c32001r0.m99528i(mode);
        c32001r0.m99522b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i13) {
        super.setTextAppearance(context, i13);
        C32001r0 c32001r0 = this.f4331x;
        if (c32001r0 != null) {
            c32001r0.m99526g(context, i13);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC31971j2.m99463a(context);
        AbstractC31967i2.m99459a(getContext(), this);
        C31980m c31980m = new C31980m(this);
        this.f4330w = c31980m;
        c31980m.m99471d(attributeSet, i13);
        C32001r0 c32001r0 = new C32001r0(this);
        this.f4331x = c32001r0;
        c32001r0.m99525f(attributeSet, i13);
        c32001r0.m99522b();
        this.f4332y = new C23348l();
        C32020w c32020w = new C32020w(this);
        this.f4333z = c32020w;
        c32020w.mo99418e(attributeSet, i13);
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
