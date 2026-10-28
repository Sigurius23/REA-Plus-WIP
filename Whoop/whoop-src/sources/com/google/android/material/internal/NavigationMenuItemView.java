package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.datepicker.C5016j;
import cr.AbstractC11067e;
import java.util.WeakHashMap;
import no.nordicsemi.android.dfu.DfuBaseService;
import p184h5.AbstractC16901p0;
import p444r.C30820n;
import p444r.InterfaceC30831y;
import p474s.AbstractC32015u2;
import p474s.C31990o1;
import p513u4.AbstractC34514b;
import p513u4.AbstractC34523k;

/* JADX INFO: loaded from: classes6.dex */
public class NavigationMenuItemView extends AbstractC11067e implements InterfaceC30831y {

    /* JADX INFO: renamed from: R */
    public static final int[] f21005R = {R.attr.state_checked};

    /* JADX INFO: renamed from: G */
    public int f21006G;

    /* JADX INFO: renamed from: H */
    public boolean f21007H;

    /* JADX INFO: renamed from: I */
    public boolean f21008I;

    /* JADX INFO: renamed from: J */
    public final boolean f21009J;

    /* JADX INFO: renamed from: K */
    public final CheckedTextView f21010K;

    /* JADX INFO: renamed from: L */
    public FrameLayout f21011L;

    /* JADX INFO: renamed from: M */
    public C30820n f21012M;

    /* JADX INFO: renamed from: N */
    public ColorStateList f21013N;

    /* JADX INFO: renamed from: O */
    public boolean f21014O;

    /* JADX INFO: renamed from: P */
    public Drawable f21015P;

    /* JADX INFO: renamed from: Q */
    public final C5016j f21016Q;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21009J = true;
        C5016j c5016j = new C5016j(this, 2);
        this.f21016Q = c5016j;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.whoop.android.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.whoop.android.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.whoop.android.R.id.design_menu_item_text);
        this.f21010K = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC16901p0.m47583n(checkedTextView, c5016j);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f21011L == null) {
                this.f21011L = (FrameLayout) ((ViewStub) findViewById(com.whoop.android.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f21011L.removeAllViews();
            this.f21011L.addView(view);
        }
    }

    @Override // p444r.InterfaceC30831y
    /* JADX INFO: renamed from: c */
    public final void mo3252c(C30820n c30820n) {
        StateListDrawable stateListDrawable;
        this.f21012M = c30820n;
        int i13 = c30820n.f127086b;
        if (i13 > 0) {
            setId(i13);
        }
        setVisibility(c30820n.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.whoop.android.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f21005R, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            setBackground(stateListDrawable);
        }
        setCheckable(c30820n.isCheckable());
        setChecked(c30820n.isChecked());
        setEnabled(c30820n.isEnabled());
        setTitle(c30820n.f127090f);
        setIcon(c30820n.getIcon());
        setActionView(c30820n.getActionView());
        setContentDescription(c30820n.f127102r);
        AbstractC32015u2.m99566a(this, c30820n.f127103s);
        C30820n c30820n2 = this.f21012M;
        CharSequence charSequence = c30820n2.f127090f;
        CheckedTextView checkedTextView = this.f21010K;
        if (charSequence == null && c30820n2.getIcon() == null && this.f21012M.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f21011L;
            if (frameLayout != null) {
                C31990o1 c31990o1 = (C31990o1) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c31990o1).width = -1;
                this.f21011L.setLayoutParams(c31990o1);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f21011L;
        if (frameLayout2 != null) {
            C31990o1 c31990o2 = (C31990o1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c31990o2).width = -2;
            this.f21011L.setLayoutParams(c31990o2);
        }
    }

    @Override // p444r.InterfaceC30831y
    public C30820n getItemData() {
        return this.f21012M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i13 + 1);
        C30820n c30820n = this.f21012M;
        if (c30820n != null && c30820n.isCheckable() && this.f21012M.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f21005R);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z4) {
        refreshDrawableState();
        if (this.f21008I != z4) {
            this.f21008I = z4;
            this.f21016Q.mo5308h(this.f21010K, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS);
        }
    }

    public void setChecked(boolean z4) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f21010K;
        checkedTextView.setChecked(z4);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z4 && this.f21009J) ? 1 : 0);
    }

    public void setHorizontalPadding(int i13) {
        setPadding(i13, getPaddingTop(), i13, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f21014O) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f21013N);
            }
            int i13 = this.f21006G;
            drawable.setBounds(0, 0, i13, i13);
        } else if (this.f21007H) {
            if (this.f21015P == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC34523k.f145117a;
                Drawable drawableM109070f = AbstractC34514b.m109070f(resources, com.whoop.android.R.drawable.navigation_empty_icon, theme);
                this.f21015P = drawableM109070f;
                if (drawableM109070f != null) {
                    int i14 = this.f21006G;
                    drawableM109070f.setBounds(0, 0, i14, i14);
                }
            }
            drawable = this.f21015P;
        }
        this.f21010K.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i13) {
        this.f21010K.setCompoundDrawablePadding(i13);
    }

    public void setIconSize(int i13) {
        this.f21006G = i13;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f21013N = colorStateList;
        this.f21014O = colorStateList != null;
        C30820n c30820n = this.f21012M;
        if (c30820n != null) {
            setIcon(c30820n.getIcon());
        }
    }

    public void setMaxLines(int i13) {
        this.f21010K.setMaxLines(i13);
    }

    public void setNeedsEmptyIcon(boolean z4) {
        this.f21007H = z4;
    }

    public void setTextAppearance(int i13) {
        this.f21010K.setTextAppearance(i13);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f21010K.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f21010K.setText(charSequence);
    }
}
