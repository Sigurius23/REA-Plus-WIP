package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.ViewOnClickListenerC5018l;
import com.whoop.android.R;
import p076d.C11311s;
import p184h5.AbstractC16901p0;
import p184h5.C16913t0;
import p290l.AbstractC22932a;
import p408q.AbstractC29658b;
import p444r.InterfaceC30832z;
import p444r.MenuC30818l;
import p474s.C31944d;
import p474s.C31960h;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes5.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: E */
    public int f4258E;

    /* JADX INFO: renamed from: F */
    public C16913t0 f4259F;

    /* JADX INFO: renamed from: G */
    public boolean f4260G;

    /* JADX INFO: renamed from: H */
    public boolean f4261H;

    /* JADX INFO: renamed from: I */
    public CharSequence f4262I;

    /* JADX INFO: renamed from: J */
    public CharSequence f4263J;

    /* JADX INFO: renamed from: K */
    public View f4264K;

    /* JADX INFO: renamed from: L */
    public View f4265L;

    /* JADX INFO: renamed from: M */
    public View f4266M;

    /* JADX INFO: renamed from: N */
    public LinearLayout f4267N;

    /* JADX INFO: renamed from: O */
    public TextView f4268O;

    /* JADX INFO: renamed from: P */
    public TextView f4269P;

    /* JADX INFO: renamed from: Q */
    public final int f4270Q;

    /* JADX INFO: renamed from: R */
    public final int f4271R;

    /* JADX INFO: renamed from: S */
    public boolean f4272S;

    /* JADX INFO: renamed from: T */
    public final int f4273T;

    /* JADX INFO: renamed from: w */
    public final C11311s f4274w;

    /* JADX INFO: renamed from: x */
    public final Context f4275x;

    /* JADX INFO: renamed from: y */
    public ActionMenuView f4276y;

    /* JADX INFO: renamed from: z */
    public C31960h f4277z;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: f */
    public static int m3259f(View view, int i13, int i14) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), i14);
        return Math.max(0, i13 - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: g */
    public static int m3260g(View view, boolean z4, int i13, int i14, int i15) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i16 = ((i15 - measuredHeight) / 2) + i14;
        if (z4) {
            view.layout(i13 - measuredWidth, i16, i13, measuredHeight + i16);
        } else {
            view.layout(i13, i16, i13 + measuredWidth, measuredHeight + i16);
        }
        return z4 ? -measuredWidth : measuredWidth;
    }

    /* JADX INFO: renamed from: c */
    public final void m3261c(AbstractC29658b abstractC29658b) {
        View view = this.f4264K;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f4273T, (ViewGroup) this, false);
            this.f4264K = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f4264K);
        }
        View viewFindViewById = this.f4264K.findViewById(R.id.action_mode_close_button);
        this.f4265L = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC5018l(abstractC29658b, 3));
        MenuC30818l menuC30818lMo72859e = abstractC29658b.mo72859e();
        C31960h c31960h = this.f4277z;
        if (c31960h != null) {
            c31960h.m99449c();
            C31944d c31944d = c31960h.f132697T;
            if (c31944d != null && c31944d.m94835b()) {
                c31944d.f127130i.dismiss();
            }
        }
        C31960h c31960h2 = new C31960h(getContext());
        this.f4277z = c31960h2;
        c31960h2.f132689L = true;
        c31960h2.f132690M = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC30818lMo72859e.m94814c(this.f4277z, this.f4275x);
        C31960h c31960h3 = this.f4277z;
        InterfaceC30832z interfaceC30832z = c31960h3.f132685H;
        if (interfaceC30832z == null) {
            InterfaceC30832z interfaceC30832z2 = (InterfaceC30832z) c31960h3.f132704z.inflate(c31960h3.f132683F, (ViewGroup) this, false);
            c31960h3.f132685H = interfaceC30832z2;
            interfaceC30832z2.mo3256b(c31960h3.f132703y);
            c31960h3.mo3336d();
        }
        InterfaceC30832z interfaceC30832z3 = c31960h3.f132685H;
        if (interfaceC30832z != interfaceC30832z3) {
            ((ActionMenuView) interfaceC30832z3).setPresenter(c31960h3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC30832z3;
        this.f4276y = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f4276y, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final void m3262d() {
        if (this.f4267N == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4267N = linearLayout;
            this.f4268O = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f4269P = (TextView) this.f4267N.findViewById(R.id.action_bar_subtitle);
            int i13 = this.f4270Q;
            if (i13 != 0) {
                this.f4268O.setTextAppearance(getContext(), i13);
            }
            int i14 = this.f4271R;
            if (i14 != 0) {
                this.f4269P.setTextAppearance(getContext(), i14);
            }
        }
        this.f4268O.setText(this.f4262I);
        this.f4269P.setText(this.f4263J);
        boolean zIsEmpty = TextUtils.isEmpty(this.f4262I);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f4263J);
        this.f4269P.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f4267N.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f4267N.getParent() == null) {
            addView(this.f4267N);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3263e() {
        removeAllViews();
        this.f4266M = null;
        this.f4276y = null;
        this.f4277z = null;
        View view = this.f4265L;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f4259F != null ? this.f4274w.f36244a : getVisibility();
    }

    public int getContentHeight() {
        return this.f4258E;
    }

    public CharSequence getSubtitle() {
        return this.f4263J;
    }

    public CharSequence getTitle() {
        return this.f4262I;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i13) {
        if (i13 != getVisibility()) {
            C16913t0 c16913t0 = this.f4259F;
            if (c16913t0 != null) {
                c16913t0.m47608b();
            }
            super.setVisibility(i13);
        }
    }

    /* JADX INFO: renamed from: i */
    public final C16913t0 m3265i(int i13, long j7) {
        C16913t0 c16913t0 = this.f4259F;
        if (c16913t0 != null) {
            c16913t0.m47608b();
        }
        C11311s c11311s = this.f4274w;
        if (i13 != 0) {
            C16913t0 c16913t0M47570a = AbstractC16901p0.m47570a(this);
            c16913t0M47570a.m47607a(0.0f);
            c16913t0M47570a.m47609c(j7);
            ((ActionBarContextView) c11311s.f36246c).f4259F = c16913t0M47570a;
            c11311s.f36244a = i13;
            c16913t0M47570a.m47610d(c11311s);
            return c16913t0M47570a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C16913t0 c16913t0M47570a2 = AbstractC16901p0.m47570a(this);
        c16913t0M47570a2.m47607a(1.0f);
        c16913t0M47570a2.m47609c(j7);
        ((ActionBarContextView) c11311s.f36246c).f4259F = c16913t0M47570a2;
        c11311s.f36244a = i13;
        c16913t0M47570a2.m47610d(c11311s);
        return c16913t0M47570a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i13;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC22932a.f90508a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C31960h c31960h = this.f4277z;
        if (c31960h != null) {
            Configuration configuration2 = c31960h.f132702x.getResources().getConfiguration();
            int i14 = configuration2.screenWidthDp;
            int i15 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i14 > 600 || ((i14 > 960 && i15 > 720) || (i14 > 720 && i15 > 960))) {
                i13 = 5;
            } else if (i14 >= 500 || ((i14 > 640 && i15 > 480) || (i14 > 480 && i15 > 640))) {
                i13 = 4;
            } else {
                i13 = i14 >= 360 ? 3 : 2;
            }
            c31960h.f132693P = i13;
            MenuC30818l menuC30818l = c31960h.f132703y;
            if (menuC30818l != null) {
                menuC30818l.m94820q(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C31960h c31960h = this.f4277z;
        if (c31960h != null) {
            c31960h.m99449c();
            C31944d c31944d = this.f4277z.f132697T;
            if (c31944d == null || !c31944d.m94835b()) {
                return;
            }
            c31944d.f127130i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4261H = false;
        }
        if (!this.f4261H) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f4261H = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f4261H = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        boolean z13 = getLayoutDirection() == 1;
        int paddingRight = z13 ? (i15 - i13) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i16 - i14) - getPaddingTop()) - getPaddingBottom();
        View view = this.f4264K;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4264K.getLayoutParams();
            int i17 = z13 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i18 = z13 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i19 = z13 ? paddingRight - i17 : paddingRight + i17;
            int iM3260g = m3260g(this.f4264K, z13, i19, paddingTop, paddingTop2) + i19;
            paddingRight = z13 ? iM3260g - i18 : iM3260g + i18;
        }
        LinearLayout linearLayout = this.f4267N;
        if (linearLayout != null && this.f4266M == null && linearLayout.getVisibility() != 8) {
            paddingRight += m3260g(this.f4267N, z13, paddingRight, paddingTop, paddingTop2);
        }
        View view2 = this.f4266M;
        if (view2 != null) {
            m3260g(view2, z13, paddingRight, paddingTop, paddingTop2);
        }
        int paddingLeft = z13 ? getPaddingLeft() : (i15 - i13) - getPaddingRight();
        ActionMenuView actionMenuView = this.f4276y;
        if (actionMenuView != null) {
            m3260g(actionMenuView, !z13, paddingLeft, paddingTop, paddingTop2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        if (View.MeasureSpec.getMode(i13) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i14) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i13);
        int size2 = this.f4258E;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i14);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f4264K;
        if (view != null) {
            int iM3259f = m3259f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4264K.getLayoutParams();
            paddingLeft = iM3259f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f4276y;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m3259f(this.f4276y, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f4267N;
        if (linearLayout != null && this.f4266M == null) {
            if (this.f4272S) {
                this.f4267N.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f4267N.getMeasuredWidth();
                boolean z4 = measuredWidth <= paddingLeft;
                if (z4) {
                    paddingLeft -= measuredWidth;
                }
                this.f4267N.setVisibility(z4 ? 0 : 8);
            } else {
                paddingLeft = m3259f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f4266M;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i15 = layoutParams.width;
            int i16 = i15 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i15 >= 0) {
                paddingLeft = Math.min(i15, paddingLeft);
            }
            int i17 = layoutParams.height;
            int i18 = i17 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i17 >= 0) {
                iMin = Math.min(i17, iMin);
            }
            this.f4266M.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(iMin, i18));
        }
        if (this.f4258E > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i19 = 0;
        for (int i24 = 0; i24 < childCount; i24++) {
            int measuredHeight = getChildAt(i24).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i19) {
                i19 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i19);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4260G = false;
        }
        if (!this.f4260G) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f4260G = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f4260G = false;
        return true;
    }

    public void setContentHeight(int i13) {
        this.f4258E = i13;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f4266M;
        if (view2 != null) {
            removeView(view2);
        }
        this.f4266M = view;
        if (view != null && (linearLayout = this.f4267N) != null) {
            removeView(linearLayout);
            this.f4267N = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4263J = charSequence;
        m3262d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4262I = charSequence;
        m3262d();
        AbstractC16901p0.m47584o(this, charSequence);
    }

    public void setTitleOptional(boolean z4) {
        if (z4 != this.f4272S) {
            requestLayout();
        }
        this.f4272S = z4;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        C11311s c11311s = new C11311s();
        c11311s.f36246c = this;
        c11311s.f36245b = false;
        this.f4274w = c11311s;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f4275x = context;
        } else {
            this.f4275x = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC22932a.f90511d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC30060g.m92133x(context, resourceId));
        this.f4270Q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f4271R = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f4258E = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f4273T = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }
}
