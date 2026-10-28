package com.google.android.material.textfield;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.whoop.android.R;
import cr.AbstractC11075m;
import java.util.List;
import java.util.Locale;
import kr.C22788g;
import p257jq.AbstractC21885a;
import p435qr.AbstractC30554a;
import p474s.C31976l;
import p474s.C32018v1;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: com.google.android.material.textfield.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C5065x extends C31976l {

    /* JADX INFO: renamed from: E */
    public final C32018v1 f21305E;

    /* JADX INFO: renamed from: F */
    public final AccessibilityManager f21306F;

    /* JADX INFO: renamed from: G */
    public final Rect f21307G;

    /* JADX INFO: renamed from: H */
    public final int f21308H;

    /* JADX INFO: renamed from: I */
    public final float f21309I;

    /* JADX INFO: renamed from: J */
    public ColorStateList f21310J;

    /* JADX INFO: renamed from: K */
    public int f21311K;

    /* JADX INFO: renamed from: L */
    public ColorStateList f21312L;

    public C5065x(Context context, AttributeSet attributeSet) {
        super(AbstractC30554a.m93706a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, 0);
        this.f21307G = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM29873g = AbstractC11075m.m29873g(context2, attributeSet, AbstractC21885a.f84559s, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM29873g.hasValue(0) && typedArrayM29873g.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f21308H = typedArrayM29873g.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f21309I = typedArrayM29873g.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayM29873g.hasValue(2)) {
            this.f21310J = ColorStateList.valueOf(typedArrayM29873g.getColor(2, 0));
        }
        this.f21311K = typedArrayM29873g.getColor(4, 0);
        this.f21312L = AbstractC22674j.m65695C(typedArrayM29873g, context2, 5);
        this.f21306F = (AccessibilityManager) context2.getSystemService("accessibility");
        C32018v1 c32018v1 = new C32018v1(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f21305E = c32018v1;
        c32018v1.f132870Y = true;
        c32018v1.f132871Z.setFocusable(true);
        c32018v1.f132860O = this;
        c32018v1.f132871Z.setInputMethodMode(2);
        c32018v1.mo99441l(getAdapter());
        c32018v1.f132861P = new C5063v(this);
        if (typedArrayM29873g.hasValue(6)) {
            setSimpleItems(typedArrayM29873g.getResourceId(6, 0));
        }
        typedArrayM29873g.recycle();
    }

    /* JADX INFO: renamed from: a */
    public static void m15899a(C5065x c5065x, Object obj) {
        c5065x.setText(c5065x.convertSelectionToString(obj), false);
    }

    /* JADX INFO: renamed from: b */
    public final TextInputLayout m15900b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15901c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f21306F;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (m15901c()) {
            this.f21305E.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f21310J;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM15900b = m15900b();
        return (textInputLayoutM15900b == null || !textInputLayoutM15900b.m15831u()) ? super.getHint() : textInputLayoutM15900b.getHint();
    }

    public float getPopupElevation() {
        return this.f21309I;
    }

    public int getSimpleItemSelectedColor() {
        return this.f21311K;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f21312L;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM15900b = m15900b();
        if (textInputLayoutM15900b != null && textInputLayoutM15900b.m15831u() && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21305E.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (View.MeasureSpec.getMode(i13) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM15900b = m15900b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM15900b != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C32018v1 c32018v1 = this.f21305E;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c32018v1.f132871Z.isShowing() ? -1 : c32018v1.f132874y.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM15900b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c32018v1.f132871Z.getBackground();
                if (background != null) {
                    Rect rect = this.f21307G;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM15900b.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i13)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        if (m15901c()) {
            return;
        }
        super.onWindowFocusChanged(z4);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t14) {
        super.setAdapter(t14);
        this.f21305E.mo99441l(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C32018v1 c32018v1 = this.f21305E;
        if (c32018v1 != null) {
            c32018v1.m99572n(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i13) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i13));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f21310J = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C22788g) {
            ((C22788g) dropDownBackground).m66011m(this.f21310J);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f21305E.f132862Q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i13) {
        super.setRawInputType(i13);
        TextInputLayout textInputLayoutM15900b = m15900b();
        if (textInputLayoutM15900b != null) {
            textInputLayoutM15900b.m15810H();
        }
    }

    public void setSimpleItemSelectedColor(int i13) {
        this.f21311K = i13;
        if (getAdapter() instanceof C5064w) {
            ((C5064w) getAdapter()).m15898a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f21312L = colorStateList;
        if (getAdapter() instanceof C5064w) {
            ((C5064w) getAdapter()).m15898a();
        }
    }

    public void setSimpleItems(int i13) {
        setSimpleItems(getResources().getStringArray(i13));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (m15901c()) {
            this.f21305E.mo94785c();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C5064w(this, getContext(), this.f21308H, strArr));
    }
}
