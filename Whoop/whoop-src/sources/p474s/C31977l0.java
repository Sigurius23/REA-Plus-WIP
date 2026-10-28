package p474s;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p290l.AbstractC22932a;
import p408q.C29660d;
import p444r.ViewTreeObserverOnGlobalLayoutListenerC30809d;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: s.l0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31977l0 extends Spinner {

    /* JADX INFO: renamed from: I */
    public static final int[] f132751I = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: E */
    public final boolean f132752E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC31973k0 f132753F;

    /* JADX INFO: renamed from: G */
    public int f132754G;

    /* JADX INFO: renamed from: H */
    public final Rect f132755H;

    /* JADX INFO: renamed from: w */
    public final C31980m f132756w;

    /* JADX INFO: renamed from: x */
    public final Context f132757x;

    /* JADX INFO: renamed from: y */
    public final C31941c0 f132758y;

    /* JADX INFO: renamed from: z */
    public SpinnerAdapter f132759z;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public C31977l0(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.whoop.android.R.attr.spinnerStyle);
        this.f132755H = new Rect();
        AbstractC31967i2.m99459a(getContext(), this);
        int[] iArr = AbstractC22932a.f90528u;
        C31983m2 c31983m2M99479q = C31983m2.m99479q(context, attributeSet, iArr, com.whoop.android.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) c31983m2M99479q.f132769x;
        this.f132756w = new C31980m(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f132757x = new C29660d(context, resourceId);
        } else {
            this.f132757x = context;
        }
        int i13 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f132751I, com.whoop.android.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i13 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e5) {
                    e = e5;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i13 != 0) {
                        DialogInterfaceOnClickListenerC31949e0 dialogInterfaceOnClickListenerC31949e0 = new DialogInterfaceOnClickListenerC31949e0(this);
                        this.f132753F = dialogInterfaceOnClickListenerC31949e0;
                        dialogInterfaceOnClickListenerC31949e0.f132658y = typedArray.getString(2);
                    } else if (i13 == 1) {
                        C31965i0 c31965i0 = new C31965i0(this, this.f132757x, attributeSet);
                        C31983m2 c31983m2M99479q2 = C31983m2.m99479q(this.f132757x, attributeSet, iArr, com.whoop.android.R.attr.spinnerStyle);
                        this.f132754G = ((TypedArray) c31983m2M99479q2.f132769x).getLayoutDimension(3, -2);
                        c31965i0.m99572n(c31983m2M99479q2.m99486j(1));
                        c31965i0.f132708c0 = typedArray.getString(2);
                        c31983m2M99479q2.m99491r();
                        this.f132753F = c31965i0;
                        this.f132758y = new C31941c0(this, this, c31965i0);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.whoop.android.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    c31983m2M99479q.m99491r();
                    this.f132752E = true;
                    spinnerAdapter = this.f132759z;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f132759z = null;
                    }
                    this.f132756w.m99471d(attributeSet, com.whoop.android.R.attr.spinnerStyle);
                }
            } catch (Throwable th3) {
                th = th3;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e13) {
            e = e13;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th4) {
            th = th4;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i13 != 0) {
            DialogInterfaceOnClickListenerC31949e0 dialogInterfaceOnClickListenerC31949e1 = new DialogInterfaceOnClickListenerC31949e0(this);
            this.f132753F = dialogInterfaceOnClickListenerC31949e1;
            dialogInterfaceOnClickListenerC31949e1.f132658y = typedArray.getString(2);
        } else if (i13 == 1) {
            C31965i0 c31965i1 = new C31965i0(this, this.f132757x, attributeSet);
            C31983m2 c31983m2M99479q3 = C31983m2.m99479q(this.f132757x, attributeSet, iArr, com.whoop.android.R.attr.spinnerStyle);
            this.f132754G = ((TypedArray) c31983m2M99479q3.f132769x).getLayoutDimension(3, -2);
            c31965i1.m99572n(c31983m2M99479q3.m99486j(1));
            c31965i1.f132708c0 = typedArray.getString(2);
            c31983m2M99479q3.m99491r();
            this.f132753F = c31965i1;
            this.f132758y = new C31941c0(this, this, c31965i1);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.whoop.android.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        c31983m2M99479q.m99491r();
        this.f132752E = true;
        spinnerAdapter = this.f132759z;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f132759z = null;
        }
        this.f132756w.m99471d(attributeSet, com.whoop.android.R.attr.spinnerStyle);
    }

    /* JADX INFO: renamed from: a */
    public final int m99467a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i13 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f132755H;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C31980m c31980m = this.f132756w;
        if (c31980m != null) {
            c31980m.m99468a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC31973k0 interfaceC31973k0 = this.f132753F;
        return interfaceC31973k0 != null ? interfaceC31973k0.mo99432b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC31973k0 interfaceC31973k0 = this.f132753F;
        return interfaceC31973k0 != null ? interfaceC31973k0.mo99440k() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f132753F != null ? this.f132754G : super.getDropDownWidth();
    }

    public final InterfaceC31973k0 getInternalPopup() {
        return this.f132753F;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC31973k0 interfaceC31973k0 = this.f132753F;
        return interfaceC31973k0 != null ? interfaceC31973k0.mo99435f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f132757x;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC31973k0 interfaceC31973k0 = this.f132753F;
        return interfaceC31973k0 != null ? interfaceC31973k0.mo99434e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C31980m c31980m = this.f132756w;
        if (c31980m != null) {
            return c31980m.m99469b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C31980m c31980m = this.f132756w;
        if (c31980m != null) {
            return c31980m.m99470c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC31973k0 interfaceC31973k0 = this.f132753F;
        if (interfaceC31973k0 == null || !interfaceC31973k0.mo99431a()) {
            return;
        }
        interfaceC31973k0.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (this.f132753F == null || View.MeasureSpec.getMode(i13) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m99467a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i13)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C31969j0 c31969j0 = (C31969j0) parcelable;
        super.onRestoreInstanceState(c31969j0.getSuperState());
        if (!c31969j0.f132728w || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC30809d(this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C31969j0 c31969j0 = new C31969j0(super.onSaveInstanceState());
        InterfaceC31973k0 interfaceC31973k0 = this.f132753F;
        c31969j0.f132728w = interfaceC31973k0 != null && interfaceC31973k0.mo99431a();
        return c31969j0;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C31941c0 c31941c0 = this.f132758y;
        if (c31941c0 == null || !c31941c0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC31973k0 interfaceC31973k0 = this.f132753F;
        if (interfaceC31973k0 == null) {
            return super.performClick();
        }
        if (interfaceC31973k0.mo99431a()) {
            return true;
        }
        interfaceC31973k0.mo99439j(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C31980m c31980m = this.f132756w;
        if (c31980m != null) {
            c31980m.m99472e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        C31980m c31980m = this.f132756w;
        if (c31980m != null) {
            c31980m.m99473f(i13);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i13) {
        InterfaceC31973k0 interfaceC31973k0 = this.f132753F;
        if (interfaceC31973k0 == null) {
            super.setDropDownHorizontalOffset(i13);
        } else {
            interfaceC31973k0.mo99438i(i13);
            interfaceC31973k0.mo99433d(i13);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i13) {
        InterfaceC31973k0 interfaceC31973k0 = this.f132753F;
        if (interfaceC31973k0 != null) {
            interfaceC31973k0.mo99437h(i13);
        } else {
            super.setDropDownVerticalOffset(i13);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i13) {
        if (this.f132753F != null) {
            this.f132754G = i13;
        } else {
            super.setDropDownWidth(i13);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC31973k0 interfaceC31973k0 = this.f132753F;
        if (interfaceC31973k0 != null) {
            interfaceC31973k0.mo99442n(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i13) {
        setPopupBackgroundDrawable(AbstractC30060g.m92133x(getPopupContext(), i13));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC31973k0 interfaceC31973k0 = this.f132753F;
        if (interfaceC31973k0 != null) {
            interfaceC31973k0.mo99436g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C31980m c31980m = this.f132756w;
        if (c31980m != null) {
            c31980m.m99475h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C31980m c31980m = this.f132756w;
        if (c31980m != null) {
            c31980m.m99476i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f132752E) {
            this.f132759z = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC31973k0 interfaceC31973k0 = this.f132753F;
        if (interfaceC31973k0 != null) {
            Context context = this.f132757x;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C31953f0 c31953f0 = new C31953f0();
            c31953f0.f132673a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c31953f0.f132674b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC31945d0.m99429a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC31973k0.mo99441l(c31953f0);
        }
    }
}
