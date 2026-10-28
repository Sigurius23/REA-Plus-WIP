package com.whoop.p069ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import b13.ViewOnClickListenerC2292a;
import b30.ViewOnClickListenerC2558k3;
import bh3.InterfaceC3255b;
import com.google.android.material.textfield.TextInputLayout;
import e50.C12723b;
import java.lang.reflect.Field;
import p029b5.C2730i;
import p029b5.InterfaceC2731j;
import p413q4.AbstractC29962g;
import p544v5.AbstractC35701b;
import qr2.AbstractC30556a;
import vu1.AbstractC36514e;
import vu1.AbstractC36516g;
import vu1.AbstractC36519j;

/* JADX INFO: loaded from: classes10.dex */
public class WhoopEditText extends TextInputLayout {

    /* JADX INFO: renamed from: e1 */
    EditText f31571e1;

    /* JADX INFO: renamed from: f1 */
    private Rect f31572f1;

    /* JADX INFO: renamed from: g1 */
    private C10606p f31573g1;

    /* JADX INFO: renamed from: h1 */
    private boolean f31574h1;

    /* JADX INFO: renamed from: com.whoop.ui.WhoopEditText$a */
    public static class C10451a extends AbstractC35701b {
        public static final Parcelable.Creator<C10451a> CREATOR = new C2730i(new a());

        /* JADX INFO: renamed from: y */
        CharSequence f31575y;

        /* JADX INFO: renamed from: com.whoop.ui.WhoopEditText$a$a */
        public class a implements InterfaceC2731j {
            @Override // p029b5.InterfaceC2731j
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C10451a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C10451a(parcel, classLoader);
            }

            @Override // p029b5.InterfaceC2731j
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C10451a[] newArray(int i13) {
                return new C10451a[i13];
            }
        }

        public C10451a(Parcelable parcelable) {
            super(parcelable);
        }

        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: f */
        public static void m26675f(ViewGroup viewGroup, View view, Rect rect) {
            AbstractC29962g.m91655a(viewGroup, view, rect);
        }

        public String toString() {
            return "StrokedPillEditText.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " text=" + ((Object) this.f31575y) + "}";
        }

        @Override // p544v5.AbstractC35701b, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            TextUtils.writeToParcel(this.f31575y, parcel, i13);
        }

        public C10451a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f31575y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    public WhoopEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: R */
    private void m26670R(TypedArray typedArray) {
        m26671S();
        setGravity(80);
        if (typedArray == null || typedArray.getBoolean(AbstractC36519j.f156233z0, true)) {
            this.f31574h1 = true;
            LayoutInflater.from(getContext()).inflate(AbstractC36516g.f156115e, this);
        } else {
            this.f31574h1 = false;
            LayoutInflater.from(getContext()).inflate(AbstractC36516g.f156116f, this);
        }
        this.f31571e1 = (EditText) findViewById(AbstractC36514e.f156103u);
        getEditText().setId(-1);
        setTransitionGroup(true);
        if (typedArray != null) {
            for (int i13 = 0; i13 < typedArray.getIndexCount(); i13++) {
                int index = typedArray.getIndex(i13);
                if (index == AbstractC36519j.f156138E0) {
                    this.f31571e1.setText(typedArray.getText(index));
                } else if (index == AbstractC36519j.f156136D0) {
                    setHint(typedArray.getText(index).toString().toUpperCase());
                } else if (index == AbstractC36519j.f156130A0) {
                    this.f31571e1.setInputType(typedArray.getInt(index, 0));
                } else if (index == AbstractC36519j.f156132B0) {
                    this.f31571e1.setImeOptions(typedArray.getInt(index, 0));
                } else if (index == AbstractC36519j.f156134C0) {
                    this.f31571e1.setAllCaps(typedArray.getBoolean(index, false));
                } else if (index == AbstractC36519j.f156140F0) {
                    this.f31571e1.setTextColor(typedArray.getColorStateList(index));
                }
            }
        }
        setOnClickListener(new ViewOnClickListenerC2558k3(this, 2));
    }

    /* JADX INFO: renamed from: S */
    private void m26671S() {
        Object obj;
        try {
            Field declaredField = TextInputLayout.class.getDeclaredField("V0");
            declaredField.setAccessible(true);
            obj = declaredField.get(this);
        } catch (IllegalAccessException | NoSuchFieldException e5) {
            C12723b.m35566a().m35569d().mo85221l("WhoopEditText", "Failed to reflect CollapsingTextHelper", e5, new AbstractC30556a.a[0]);
            new RuntimeException("Failed to reflect CollapsingTextHelper", e5);
            obj = null;
        }
        this.f31573g1 = new C10606p(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m26672T(View view) {
        EditText editText = getEditText();
        if (editText != null) {
            if (editText.hasFocus()) {
                editText.performClick();
                return;
            }
            editText.requestFocus();
            if (this.f31574h1) {
                ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m26673U(InterfaceC3255b interfaceC3255b, View view, boolean z4) {
        if (z4) {
            interfaceC3255b.mo9472b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m26674V(InterfaceC3255b interfaceC3255b, View view) {
        interfaceC3255b.mo9472b(this);
    }

    public Editable getText() {
        EditText editText = this.f31571e1;
        if (editText != null) {
            return editText.getText();
        }
        return null;
    }

    public String getTextString() {
        Editable text = getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        EditText editText = getEditText();
        if (editText != null) {
            C10451a.m26675f(this, editText, this.f31572f1);
            this.f31573g1.m27360b(editText.getCompoundPaddingLeft() + this.f31572f1.left, getPaddingTop(), this.f31572f1.right - editText.getCompoundPaddingRight(), getHeight() - getPaddingBottom());
            this.f31573g1.m27359a();
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 0);
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C10451a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C10451a c10451a = (C10451a) parcelable;
        super.onRestoreInstanceState(c10451a.m113141b());
        setText(c10451a.f31575y);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public Parcelable onSaveInstanceState() {
        C10451a c10451a = new C10451a(super.onSaveInstanceState());
        c10451a.f31575y = getText();
        return c10451a;
    }

    public void setOnClickOrFocusListener(InterfaceC3255b interfaceC3255b) {
        EditText editText = getEditText();
        if (editText != null) {
            if (interfaceC3255b == null) {
                editText.setOnFocusChangeListener(null);
                editText.setOnClickListener(null);
            } else {
                editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC10607q(0, this, interfaceC3255b));
                editText.setOnClickListener(new ViewOnClickListenerC2292a(1, this, interfaceC3255b));
            }
        }
    }

    public void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        getEditText().setOnEditorActionListener(onEditorActionListener);
    }

    public void setText(CharSequence charSequence) {
        getEditText().setText(charSequence);
    }

    public WhoopEditText(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f31572f1 = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC36519j.f156231y0, i13, 0);
        m26670R(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setText(int i13) {
        getEditText().setText(i13);
    }
}
