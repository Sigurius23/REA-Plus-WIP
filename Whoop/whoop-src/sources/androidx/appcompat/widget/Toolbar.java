package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.C1289e1;
import com.google.android.material.datepicker.ViewOnClickListenerC5018l;
import com.whoop.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p036bq.RunnableC3543b;
import p184h5.AbstractC16901p0;
import p184h5.C16894n;
import p184h5.InterfaceC16885k;
import p184h5.InterfaceC16897o;
import p290l.AbstractC22932a;
import p314m.C24828a;
import p408q.C29666j;
import p444r.C30820n;
import p444r.InterfaceC30816j;
import p444r.InterfaceC30829w;
import p444r.MenuC30818l;
import p474s.AbstractC31991o2;
import p474s.AbstractC32015u2;
import p474s.C31944d;
import p474s.C31951e2;
import p474s.C31960h;
import p474s.C31983m2;
import p474s.C31995p2;
import p474s.C32003r2;
import p474s.C32011t2;
import p474s.InterfaceC31938b1;
import p474s.InterfaceC31972k;
import p474s.InterfaceC31999q2;
import p474s.RunnableC31987n2;
import q30.C29934u0;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes5.dex */
public class Toolbar extends ViewGroup implements InterfaceC16885k {

    /* JADX INFO: renamed from: E */
    private ImageView f4396E;

    /* JADX INFO: renamed from: F */
    private Drawable f4397F;

    /* JADX INFO: renamed from: G */
    private CharSequence f4398G;

    /* JADX INFO: renamed from: H */
    ImageButton f4399H;

    /* JADX INFO: renamed from: I */
    View f4400I;

    /* JADX INFO: renamed from: J */
    private Context f4401J;

    /* JADX INFO: renamed from: K */
    private int f4402K;

    /* JADX INFO: renamed from: L */
    private int f4403L;

    /* JADX INFO: renamed from: M */
    private int f4404M;

    /* JADX INFO: renamed from: N */
    int f4405N;

    /* JADX INFO: renamed from: O */
    private int f4406O;

    /* JADX INFO: renamed from: P */
    private int f4407P;

    /* JADX INFO: renamed from: Q */
    private int f4408Q;

    /* JADX INFO: renamed from: R */
    private int f4409R;

    /* JADX INFO: renamed from: S */
    private int f4410S;

    /* JADX INFO: renamed from: T */
    private C31951e2 f4411T;

    /* JADX INFO: renamed from: U */
    private int f4412U;

    /* JADX INFO: renamed from: V */
    private int f4413V;

    /* JADX INFO: renamed from: W */
    private int f4414W;

    /* JADX INFO: renamed from: a0 */
    private CharSequence f4415a0;

    /* JADX INFO: renamed from: b0 */
    private CharSequence f4416b0;

    /* JADX INFO: renamed from: c0 */
    private ColorStateList f4417c0;

    /* JADX INFO: renamed from: d0 */
    private ColorStateList f4418d0;

    /* JADX INFO: renamed from: e0 */
    private boolean f4419e0;

    /* JADX INFO: renamed from: f0 */
    private boolean f4420f0;

    /* JADX INFO: renamed from: g0 */
    private final ArrayList<View> f4421g0;

    /* JADX INFO: renamed from: h0 */
    private final ArrayList<View> f4422h0;

    /* JADX INFO: renamed from: i0 */
    private final int[] f4423i0;

    /* JADX INFO: renamed from: j0 */
    final C16894n f4424j0;

    /* JADX INFO: renamed from: k0 */
    private ArrayList<MenuItem> f4425k0;

    /* JADX INFO: renamed from: l0 */
    InterfaceC31999q2 f4426l0;

    /* JADX INFO: renamed from: m0 */
    private final InterfaceC31972k f4427m0;

    /* JADX INFO: renamed from: n0 */
    private C32011t2 f4428n0;

    /* JADX INFO: renamed from: o0 */
    private C31960h f4429o0;

    /* JADX INFO: renamed from: p0 */
    private C1088b f4430p0;

    /* JADX INFO: renamed from: q0 */
    private InterfaceC30829w f4431q0;

    /* JADX INFO: renamed from: r0 */
    InterfaceC30816j f4432r0;

    /* JADX INFO: renamed from: s0 */
    private boolean f4433s0;

    /* JADX INFO: renamed from: t0 */
    private OnBackInvokedCallback f4434t0;

    /* JADX INFO: renamed from: u0 */
    private OnBackInvokedDispatcher f4435u0;

    /* JADX INFO: renamed from: v0 */
    private boolean f4436v0;

    /* JADX INFO: renamed from: w */
    ActionMenuView f4437w;

    /* JADX INFO: renamed from: w0 */
    private final Runnable f4438w0;

    /* JADX INFO: renamed from: x */
    private TextView f4439x;

    /* JADX INFO: renamed from: y */
    private TextView f4440y;

    /* JADX INFO: renamed from: z */
    private ImageButton f4441z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i13 = 0; i13 < menu.size(); i13++) {
            arrayList.add(menu.getItem(i13));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C29666j(getContext());
    }

    /* JADX INFO: renamed from: p */
    public static int m3295p(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: q */
    public static int m3296q(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: A */
    public final int m3297A(View view, int i13, int i14, int i15, int i16, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i17 = marginLayoutParams.leftMargin - iArr[0];
        int i18 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i18) + Math.max(0, i17);
        iArr[0] = Math.max(0, -i17);
        iArr[1] = Math.max(0, -i18);
        view.measure(ViewGroup.getChildMeasureSpec(i13, getPaddingRight() + getPaddingLeft() + iMax + i14, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i15, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i16, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX INFO: renamed from: B */
    public final void m3298B(View view, int i13, int i14, int i15, int i16) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i13, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i14, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i15, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i16 >= 0) {
            if (mode != 0) {
                i16 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i16);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: C */
    public void m3299C() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C31995p2) childAt.getLayoutParams()).f132800b != 2 && childAt != this.f4437w) {
                removeViewAt(childCount);
                this.f4422h0.add(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m3300D(int i13, int i14) {
        m3315h();
        this.f4411T.m99446a(i13, i14);
    }

    /* JADX INFO: renamed from: E */
    public void m3301E(MenuC30818l menuC30818l, C31960h c31960h) {
        if (menuC30818l == null && this.f4437w == null) {
            return;
        }
        m3317j();
        MenuC30818l menuC30818l2 = this.f4437w.f4317w;
        if (menuC30818l2 == menuC30818l) {
            return;
        }
        if (menuC30818l2 != null) {
            menuC30818l2.m94822s(this.f4429o0);
            menuC30818l2.m94822s(this.f4430p0);
        }
        if (this.f4430p0 == null) {
            this.f4430p0 = new C1088b(this);
        }
        c31960h.f132694Q = true;
        if (menuC30818l != null) {
            menuC30818l.m94814c(c31960h, this.f4401J);
            menuC30818l.m94814c(this.f4430p0, this.f4401J);
        } else {
            c31960h.mo3338f(this.f4401J, null);
            this.f4430p0.mo3338f(this.f4401J, null);
            c31960h.mo3336d();
            this.f4430p0.mo3336d();
        }
        this.f4437w.setPopupTheme(this.f4402K);
        this.f4437w.setPresenter(c31960h);
        this.f4429o0 = c31960h;
        m3307K();
    }

    /* JADX INFO: renamed from: F */
    public void m3302F(InterfaceC30829w interfaceC30829w, InterfaceC30816j interfaceC30816j) {
        this.f4431q0 = interfaceC30829w;
        this.f4432r0 = interfaceC30816j;
        ActionMenuView actionMenuView = this.f4437w;
        if (actionMenuView != null) {
            actionMenuView.f4310F = interfaceC30829w;
            actionMenuView.f4311G = interfaceC30816j;
        }
    }

    /* JADX INFO: renamed from: G */
    public void m3303G(Context context, int i13) {
        this.f4404M = i13;
        TextView textView = this.f4440y;
        if (textView != null) {
            textView.setTextAppearance(context, i13);
        }
    }

    /* JADX INFO: renamed from: H */
    public void mo3304H(Context context, int i13) {
        this.f4403L = i13;
        TextView textView = this.f4439x;
        if (textView != null) {
            textView.setTextAppearance(context, i13);
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m3305I(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: J */
    public boolean m3306J() {
        C31960h c31960h;
        ActionMenuView actionMenuView = this.f4437w;
        return (actionMenuView == null || (c31960h = actionMenuView.f4309E) == null || !c31960h.m99451l()) ? false : true;
    }

    /* JADX INFO: renamed from: K */
    public void m3307K() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM99501a = AbstractC31991o2.m99501a(this);
            boolean z4 = m3323r() && onBackInvokedDispatcherM99501a != null && isAttachedToWindow() && this.f4436v0;
            if (z4 && this.f4435u0 == null) {
                if (this.f4434t0 == null) {
                    this.f4434t0 = AbstractC31991o2.m99502b(new RunnableC31987n2(this, 0));
                }
                AbstractC31991o2.m99503c(onBackInvokedDispatcherM99501a, this.f4434t0);
                this.f4435u0 = onBackInvokedDispatcherM99501a;
                return;
            }
            if (z4 || (onBackInvokedDispatcher = this.f4435u0) == null) {
                return;
            }
            AbstractC31991o2.m99504d(onBackInvokedDispatcher, this.f4434t0);
            this.f4435u0 = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3308a() {
        for (int size = this.f4422h0.size() - 1; size >= 0; size--) {
            addView(this.f4422h0.get(size));
        }
        this.f4422h0.clear();
    }

    @Override // p184h5.InterfaceC16885k
    public void addMenuProvider(InterfaceC16897o interfaceC16897o) {
        C16894n c16894n = this.f4424j0;
        c16894n.f64846b.add(interfaceC16897o);
        c16894n.f64845a.run();
    }

    /* JADX INFO: renamed from: b */
    public final void m3309b(int i13, List list) {
        boolean z4 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, getLayoutDirection());
        list.clear();
        if (!z4) {
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                C31995p2 c31995p2 = (C31995p2) childAt.getLayoutParams();
                if (c31995p2.f132800b == 0 && m3305I(childAt)) {
                    int i15 = c31995p2.f97197a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i15, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        list.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i16 = childCount - 1; i16 >= 0; i16--) {
            View childAt2 = getChildAt(i16);
            C31995p2 c31995p3 = (C31995p2) childAt2.getLayoutParams();
            if (c31995p3.f132800b == 0 && m3305I(childAt2)) {
                int i17 = c31995p3.f97197a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i17, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    list.add(childAt2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3310c(View view, boolean z4) {
        C31995p2 c31995p2GenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c31995p2GenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            c31995p2GenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C31995p2) layoutParams;
        }
        c31995p2GenerateLayoutParams.f132800b = 1;
        if (!z4 || this.f4400I == null) {
            addView(view, c31995p2GenerateLayoutParams);
        } else {
            view.setLayoutParams(c31995p2GenerateLayoutParams);
            this.f4422h0.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C31995p2);
    }

    /* JADX INFO: renamed from: d */
    public boolean m3311d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f4437w) != null && actionMenuView.f4320z;
    }

    /* JADX INFO: renamed from: e */
    public void m3312e() {
        C1088b c1088b = this.f4430p0;
        C30820n c30820n = c1088b == null ? null : c1088b.f4449x;
        if (c30820n != null) {
            c30820n.collapseActionView();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m3313f() {
        C31960h c31960h;
        ActionMenuView actionMenuView = this.f4437w;
        if (actionMenuView == null || (c31960h = actionMenuView.f4309E) == null) {
            return;
        }
        c31960h.m99449c();
        C31944d c31944d = c31960h.f132697T;
        if (c31944d == null || !c31944d.m94835b()) {
            return;
        }
        c31944d.f127130i.dismiss();
    }

    /* JADX INFO: renamed from: g */
    public void m3314g() {
        if (this.f4399H == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f4399H = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f4397F);
            this.f4399H.setContentDescription(this.f4398G);
            C31995p2 c31995p2GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c31995p2GenerateDefaultLayoutParams.f97197a = (this.f4405N & 112) | 8388611;
            c31995p2GenerateDefaultLayoutParams.f132800b = 2;
            this.f4399H.setLayoutParams(c31995p2GenerateDefaultLayoutParams);
            this.f4399H.setOnClickListener(new ViewOnClickListenerC5018l(this, 4));
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f4399H;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f4399H;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C31951e2 c31951e2 = this.f4411T;
        if (c31951e2 != null) {
            return c31951e2.f132669g ? c31951e2.f132663a : c31951e2.f132664b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i13 = this.f4413V;
        return i13 != Integer.MIN_VALUE ? i13 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C31951e2 c31951e2 = this.f4411T;
        if (c31951e2 != null) {
            return c31951e2.f132663a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C31951e2 c31951e2 = this.f4411T;
        if (c31951e2 != null) {
            return c31951e2.f132664b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C31951e2 c31951e2 = this.f4411T;
        if (c31951e2 != null) {
            return c31951e2.f132669g ? c31951e2.f132664b : c31951e2.f132663a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i13 = this.f4412U;
        return i13 != Integer.MIN_VALUE ? i13 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC30818l menuC30818l;
        ActionMenuView actionMenuView = this.f4437w;
        return (actionMenuView == null || (menuC30818l = actionMenuView.f4317w) == null || !menuC30818l.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f4413V, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f4412U, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f4396E;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f4396E;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m3316i();
        return this.f4437w.getMenu();
    }

    public View getNavButtonView() {
        return this.f4441z;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f4441z;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f4441z;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C31960h getOuterActionMenuPresenter() {
        return this.f4429o0;
    }

    public Drawable getOverflowIcon() {
        m3316i();
        return this.f4437w.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f4401J;
    }

    public int getPopupTheme() {
        return this.f4402K;
    }

    public CharSequence getSubtitle() {
        return this.f4416b0;
    }

    public final TextView getSubtitleTextView() {
        return this.f4440y;
    }

    public CharSequence getTitle() {
        return this.f4415a0;
    }

    public int getTitleMarginBottom() {
        return this.f4410S;
    }

    public int getTitleMarginEnd() {
        return this.f4408Q;
    }

    public int getTitleMarginStart() {
        return this.f4407P;
    }

    public int getTitleMarginTop() {
        return this.f4409R;
    }

    public final TextView getTitleTextView() {
        return this.f4439x;
    }

    public InterfaceC31938b1 getWrapper() {
        if (this.f4428n0 == null) {
            this.f4428n0 = new C32011t2(this, true);
        }
        return this.f4428n0;
    }

    /* JADX INFO: renamed from: h */
    public final void m3315h() {
        if (this.f4411T == null) {
            C31951e2 c31951e2 = new C31951e2();
            c31951e2.f132663a = 0;
            c31951e2.f132664b = 0;
            c31951e2.f132665c = Integer.MIN_VALUE;
            c31951e2.f132666d = Integer.MIN_VALUE;
            c31951e2.f132667e = 0;
            c31951e2.f132668f = 0;
            c31951e2.f132669g = false;
            c31951e2.f132670h = false;
            this.f4411T = c31951e2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3316i() {
        m3317j();
        ActionMenuView actionMenuView = this.f4437w;
        if (actionMenuView.f4317w == null) {
            MenuC30818l menuC30818l = (MenuC30818l) actionMenuView.getMenu();
            if (this.f4430p0 == null) {
                this.f4430p0 = new C1088b(this);
            }
            this.f4437w.setExpandedActionViewsExclusive(true);
            menuC30818l.m94814c(this.f4430p0, this.f4401J);
            m3307K();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3317j() {
        if (this.f4437w == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f4437w = actionMenuView;
            actionMenuView.setPopupTheme(this.f4402K);
            this.f4437w.setOnMenuItemClickListener(this.f4427m0);
            ActionMenuView actionMenuView2 = this.f4437w;
            InterfaceC30829w interfaceC30829w = this.f4431q0;
            C1087a c1087a = new C1087a(this, 1);
            actionMenuView2.f4310F = interfaceC30829w;
            actionMenuView2.f4311G = c1087a;
            C31995p2 c31995p2GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c31995p2GenerateDefaultLayoutParams.f97197a = (this.f4405N & 112) | 8388613;
            this.f4437w.setLayoutParams(c31995p2GenerateDefaultLayoutParams);
            m3310c(this.f4437w, false);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m3318k() {
        if (this.f4441z == null) {
            this.f4441z = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C31995p2 c31995p2GenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c31995p2GenerateDefaultLayoutParams.f97197a = (this.f4405N & 112) | 8388611;
            this.f4441z.setLayoutParams(c31995p2GenerateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C31995p2 generateDefaultLayoutParams() {
        C31995p2 c31995p2 = new C31995p2(-2, -2);
        c31995p2.f132800b = 0;
        c31995p2.f97197a = 8388627;
        return c31995p2;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C31995p2 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C31995p2 c31995p2 = new C31995p2(context, attributeSet);
        c31995p2.f97197a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC22932a.f90509b);
        c31995p2.f97197a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c31995p2.f132800b = 0;
        return c31995p2;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C31995p2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C31995p2) {
            C31995p2 c31995p2 = (C31995p2) layoutParams;
            C31995p2 c31995p3 = new C31995p2(c31995p2);
            c31995p3.f132800b = 0;
            c31995p3.f132800b = c31995p2.f132800b;
            return c31995p3;
        }
        if (layoutParams instanceof C24828a) {
            C31995p2 c31995p4 = new C31995p2((C24828a) layoutParams);
            c31995p4.f132800b = 0;
            return c31995p4;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C31995p2 c31995p5 = new C31995p2(layoutParams);
            c31995p5.f132800b = 0;
            return c31995p5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C31995p2 c31995p6 = new C31995p2(marginLayoutParams);
        c31995p6.f132800b = 0;
        ((ViewGroup.MarginLayoutParams) c31995p6).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c31995p6).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c31995p6).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c31995p6).bottomMargin = marginLayoutParams.bottomMargin;
        return c31995p6;
    }

    /* JADX INFO: renamed from: o */
    public final int m3322o(View view, int i13) {
        C31995p2 c31995p2 = (C31995p2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i14 = i13 > 0 ? (measuredHeight - i13) / 2 : 0;
        int i15 = c31995p2.f97197a & 112;
        if (i15 != 16 && i15 != 48 && i15 != 80) {
            i15 = this.f4414W & 112;
        }
        if (i15 == 48) {
            return getPaddingTop() - i14;
        }
        if (i15 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c31995p2).bottomMargin) - i14;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i16 = ((ViewGroup.MarginLayoutParams) c31995p2).topMargin;
        if (iMax < i16) {
            iMax = i16;
        } else {
            int i17 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i18 = ((ViewGroup.MarginLayoutParams) c31995p2).bottomMargin;
            if (i17 < i18) {
                iMax = Math.max(0, iMax - (i18 - i17));
            }
        }
        return paddingTop + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3307K();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f4438w0);
        m3307K();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4420f0 = false;
        }
        if (!this.f4420f0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f4420f0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4420f0 = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0280  */
    /* JADX WARN: Code duplicated, block: B:103:0x0293 A[LOOP:0: B:102:0x0291->B:103:0x0293, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02b1 A[LOOP:1: B:105:0x02af->B:106:0x02b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02d8 A[LOOP:2: B:108:0x02d6->B:109:0x02d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x031b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x031d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0321  */
    /* JADX WARN: Code duplicated, block: B:118:0x032b A[LOOP:3: B:117:0x0329->B:118:0x032b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    /* JADX WARN: Code duplicated, block: B:68:0x017e  */
    /* JADX WARN: Code duplicated, block: B:70:0x018a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0196  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01af  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x0210  */
    /* JADX WARN: Code duplicated, block: B:86:0x0213  */
    /* JADX WARN: Code duplicated, block: B:88:0x021b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x021d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0221  */
    /* JADX WARN: Code duplicated, block: B:94:0x0235  */
    /* JADX WARN: Code duplicated, block: B:95:0x0258  */
    /* JADX WARN: Code duplicated, block: B:97:0x025b  */
    /* JADX WARN: Code duplicated, block: B:98:0x027d  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        int iM3330y;
        int iM3331z;
        int iMax;
        int iMin;
        boolean zM3305I;
        boolean zM3305I2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        C31995p2 c31995p2;
        C31995p2 c31995p3;
        int i17;
        boolean z13;
        int i18;
        int i19;
        int paddingTop;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int iMax2;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int size;
        int i39;
        int size2;
        int i44;
        ArrayList<View> arrayList;
        int size3;
        int i45;
        int i46;
        int i47;
        int measuredWidth;
        int i48;
        int i49;
        int size4;
        int i54;
        boolean z14 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i55 = width - paddingRight;
        int[] iArr = this.f4423i0;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i16 - i14) : 0;
        if (m3305I(this.f4441z)) {
            if (z14) {
                iM3331z = m3331z(this.f4441z, i55, iMin2, iArr);
                iM3330y = paddingLeft;
            } else {
                iM3330y = m3330y(this.f4441z, paddingLeft, iMin2, iArr);
            }
            if (m3305I(this.f4399H)) {
                if (z14) {
                    iM3331z = m3331z(this.f4399H, iM3331z, iMin2, iArr);
                } else {
                    iM3330y = m3330y(this.f4399H, iM3330y, iMin2, iArr);
                }
            }
            if (m3305I(this.f4437w)) {
                if (z14) {
                    iM3330y = m3330y(this.f4437w, iM3330y, iMin2, iArr);
                } else {
                    iM3331z = m3331z(this.f4437w, iM3331z, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM3330y);
            iArr[1] = Math.max(0, currentContentInsetRight - (i55 - iM3331z));
            iMax = Math.max(iM3330y, currentContentInsetLeft);
            iMin = Math.min(iM3331z, i55 - currentContentInsetRight);
            if (m3305I(this.f4400I)) {
                if (z14) {
                    iMin = m3331z(this.f4400I, iMin, iMin2, iArr);
                } else {
                    iMax = m3330y(this.f4400I, iMax, iMin2, iArr);
                }
            }
            if (m3305I(this.f4396E)) {
                if (z14) {
                    iMin = m3331z(this.f4396E, iMin, iMin2, iArr);
                } else {
                    iMax = m3330y(this.f4396E, iMax, iMin2, iArr);
                }
            }
            zM3305I = m3305I(this.f4439x);
            zM3305I2 = m3305I(this.f4440y);
            if (zM3305I) {
                C31995p2 c31995p4 = (C31995p2) this.f4439x.getLayoutParams();
                measuredHeight = this.f4439x.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c31995p4).topMargin + ((ViewGroup.MarginLayoutParams) c31995p4).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zM3305I2) {
                C31995p2 c31995p5 = (C31995p2) this.f4440y.getLayoutParams();
                measuredHeight = this.f4440y.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c31995p5).topMargin + ((ViewGroup.MarginLayoutParams) c31995p5).bottomMargin + measuredHeight;
            }
            if (zM3305I || zM3305I2) {
                if (zM3305I) {
                    textView = this.f4439x;
                } else {
                    textView = this.f4440y;
                }
                if (zM3305I2) {
                    textView2 = this.f4440y;
                } else {
                    textView2 = this.f4439x;
                }
                c31995p2 = (C31995p2) textView.getLayoutParams();
                c31995p3 = (C31995p2) textView2.getLayoutParams();
                i17 = measuredHeight;
                z13 = (!zM3305I && this.f4439x.getMeasuredWidth() > 0) || (zM3305I2 && this.f4440y.getMeasuredWidth() > 0);
                i18 = this.f4414W & 112;
                i19 = iMax;
                if (i18 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c31995p2).topMargin + this.f4409R;
                } else if (i18 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i17) / 2;
                    i34 = ((ViewGroup.MarginLayoutParams) c31995p2).topMargin;
                    i35 = this.f4409R;
                    if (iMax2 < i34 + i35) {
                        iMax2 = i34 + i35;
                    } else {
                        i36 = (((height - paddingBottom) - i17) - iMax2) - paddingTop2;
                        i37 = ((ViewGroup.MarginLayoutParams) c31995p2).bottomMargin;
                        i38 = this.f4410S;
                        if (i36 < i37 + i38) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c31995p3).bottomMargin + i38) - i36));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c31995p3).bottomMargin) - this.f4410S) - i17;
                }
                if (z14) {
                    if (z13) {
                        i27 = this.f4407P;
                    } else {
                        i27 = 0;
                    }
                    int i56 = i27 - iArr[1];
                    iMin -= Math.max(0, i56);
                    iArr[1] = Math.max(0, -i56);
                    if (zM3305I) {
                        C31995p2 c31995p6 = (C31995p2) this.f4439x.getLayoutParams();
                        int measuredWidth2 = iMin - this.f4439x.getMeasuredWidth();
                        int measuredHeight2 = this.f4439x.getMeasuredHeight() + paddingTop;
                        this.f4439x.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i28 = measuredWidth2 - this.f4408Q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c31995p6).bottomMargin;
                    } else {
                        i28 = iMin;
                    }
                    if (zM3305I2) {
                        int i57 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C31995p2) this.f4440y.getLayoutParams())).topMargin;
                        this.f4440y.layout(iMin - this.f4440y.getMeasuredWidth(), i57, iMin, this.f4440y.getMeasuredHeight() + i57);
                        i29 = iMin - this.f4408Q;
                    } else {
                        i29 = iMin;
                    }
                    if (z13) {
                        iMin = Math.min(i28, i29);
                    }
                    iMax = i19;
                } else {
                    if (z13) {
                        i24 = this.f4407P;
                    } else {
                        i24 = 0;
                    }
                    int i58 = i24 - iArr[0];
                    iMax = Math.max(0, i58) + i19;
                    iArr[0] = Math.max(0, -i58);
                    if (zM3305I) {
                        C31995p2 c31995p7 = (C31995p2) this.f4439x.getLayoutParams();
                        int measuredWidth3 = this.f4439x.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f4439x.getMeasuredHeight() + paddingTop;
                        this.f4439x.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i25 = measuredWidth3 + this.f4408Q;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c31995p7).bottomMargin;
                    } else {
                        i25 = iMax;
                    }
                    if (zM3305I2) {
                        int i59 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C31995p2) this.f4440y.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f4440y.getMeasuredWidth() + iMax;
                        this.f4440y.layout(iMax, i59, measuredWidth4, this.f4440y.getMeasuredHeight() + i59);
                        i26 = measuredWidth4 + this.f4408Q;
                    } else {
                        i26 = iMax;
                    }
                    if (z13) {
                        iMax = Math.max(i25, i26);
                    }
                }
            }
            m3309b(3, this.f4421g0);
            size = this.f4421g0.size();
            for (i39 = 0; i39 < size; i39++) {
                iMax = m3330y(this.f4421g0.get(i39), iMax, iMin2, iArr);
            }
            m3309b(5, this.f4421g0);
            size2 = this.f4421g0.size();
            for (i44 = 0; i44 < size2; i44++) {
                iMin = m3331z(this.f4421g0.get(i44), iMin, iMin2, iArr);
            }
            m3309b(1, this.f4421g0);
            arrayList = this.f4421g0;
            int i64 = iArr[0];
            int i65 = iArr[1];
            size3 = arrayList.size();
            i45 = i65;
            i46 = i64;
            i47 = 0;
            measuredWidth = 0;
            while (i47 < size3) {
                View view = arrayList.get(i47);
                C31995p2 c31995p8 = (C31995p2) view.getLayoutParams();
                ArrayList<View> arrayList2 = arrayList;
                int i66 = ((ViewGroup.MarginLayoutParams) c31995p8).leftMargin - i46;
                int i67 = ((ViewGroup.MarginLayoutParams) c31995p8).rightMargin - i45;
                int iMax3 = Math.max(0, i66);
                int iMax4 = Math.max(0, i67);
                int iMax5 = Math.max(0, -i66);
                int iMax6 = Math.max(0, -i67);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i47++;
                i45 = iMax6;
                i46 = iMax5;
                arrayList = arrayList2;
            }
            i48 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i49 = measuredWidth + i48;
            if (i48 >= iMax) {
                if (i49 > iMin) {
                    iMax = i48 - (i49 - iMin);
                } else {
                    iMax = i48;
                }
            }
            size4 = this.f4421g0.size();
            for (i54 = 0; i54 < size4; i54++) {
                iMax = m3330y(this.f4421g0.get(i54), iMax, iMin2, iArr);
            }
            this.f4421g0.clear();
        }
        iM3330y = paddingLeft;
        iM3331z = i55;
        if (m3305I(this.f4399H)) {
            if (z14) {
                iM3331z = m3331z(this.f4399H, iM3331z, iMin2, iArr);
            } else {
                iM3330y = m3330y(this.f4399H, iM3330y, iMin2, iArr);
            }
        }
        if (m3305I(this.f4437w)) {
            if (z14) {
                iM3330y = m3330y(this.f4437w, iM3330y, iMin2, iArr);
            } else {
                iM3331z = m3331z(this.f4437w, iM3331z, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM3330y);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i55 - iM3331z));
        iMax = Math.max(iM3330y, currentContentInsetLeft2);
        iMin = Math.min(iM3331z, i55 - currentContentInsetRight2);
        if (m3305I(this.f4400I)) {
            if (z14) {
                iMin = m3331z(this.f4400I, iMin, iMin2, iArr);
            } else {
                iMax = m3330y(this.f4400I, iMax, iMin2, iArr);
            }
        }
        if (m3305I(this.f4396E)) {
            if (z14) {
                iMin = m3331z(this.f4396E, iMin, iMin2, iArr);
            } else {
                iMax = m3330y(this.f4396E, iMax, iMin2, iArr);
            }
        }
        zM3305I = m3305I(this.f4439x);
        zM3305I2 = m3305I(this.f4440y);
        if (zM3305I) {
            C31995p2 c31995p9 = (C31995p2) this.f4439x.getLayoutParams();
            measuredHeight = this.f4439x.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c31995p9).topMargin + ((ViewGroup.MarginLayoutParams) c31995p9).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zM3305I2) {
            C31995p2 c31995p10 = (C31995p2) this.f4440y.getLayoutParams();
            measuredHeight = this.f4440y.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c31995p10).topMargin + ((ViewGroup.MarginLayoutParams) c31995p10).bottomMargin + measuredHeight;
        }
        if (zM3305I) {
            if (zM3305I) {
                textView = this.f4439x;
            } else {
                textView = this.f4440y;
            }
            if (zM3305I2) {
                textView2 = this.f4440y;
            } else {
                textView2 = this.f4439x;
            }
            c31995p2 = (C31995p2) textView.getLayoutParams();
            c31995p3 = (C31995p2) textView2.getLayoutParams();
            i17 = measuredHeight;
            if (zM3305I) {
            }
            i18 = this.f4414W & 112;
            i19 = iMax;
            if (i18 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c31995p2).topMargin + this.f4409R;
            } else if (i18 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i17) / 2;
                i34 = ((ViewGroup.MarginLayoutParams) c31995p2).topMargin;
                i35 = this.f4409R;
                if (iMax2 < i34 + i35) {
                    iMax2 = i34 + i35;
                } else {
                    i36 = (((height - paddingBottom) - i17) - iMax2) - paddingTop2;
                    i37 = ((ViewGroup.MarginLayoutParams) c31995p2).bottomMargin;
                    i38 = this.f4410S;
                    if (i36 < i37 + i38) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c31995p3).bottomMargin + i38) - i36));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c31995p3).bottomMargin) - this.f4410S) - i17;
            }
            if (z14) {
                if (z13) {
                    i27 = this.f4407P;
                } else {
                    i27 = 0;
                }
                int i510 = i27 - iArr[1];
                iMin -= Math.max(0, i510);
                iArr[1] = Math.max(0, -i510);
                if (zM3305I) {
                    C31995p2 c31995p11 = (C31995p2) this.f4439x.getLayoutParams();
                    int measuredWidth5 = iMin - this.f4439x.getMeasuredWidth();
                    int measuredHeight4 = this.f4439x.getMeasuredHeight() + paddingTop;
                    this.f4439x.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i28 = measuredWidth5 - this.f4408Q;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c31995p11).bottomMargin;
                } else {
                    i28 = iMin;
                }
                if (zM3305I2) {
                    int i511 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C31995p2) this.f4440y.getLayoutParams())).topMargin;
                    this.f4440y.layout(iMin - this.f4440y.getMeasuredWidth(), i511, iMin, this.f4440y.getMeasuredHeight() + i511);
                    i29 = iMin - this.f4408Q;
                } else {
                    i29 = iMin;
                }
                if (z13) {
                    iMin = Math.min(i28, i29);
                }
                iMax = i19;
            } else {
                if (z13) {
                    i24 = this.f4407P;
                } else {
                    i24 = 0;
                }
                int i512 = i24 - iArr[0];
                iMax = Math.max(0, i512) + i19;
                iArr[0] = Math.max(0, -i512);
                if (zM3305I) {
                    C31995p2 c31995p12 = (C31995p2) this.f4439x.getLayoutParams();
                    int measuredWidth6 = this.f4439x.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f4439x.getMeasuredHeight() + paddingTop;
                    this.f4439x.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i25 = measuredWidth6 + this.f4408Q;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c31995p12).bottomMargin;
                } else {
                    i25 = iMax;
                }
                if (zM3305I2) {
                    int i513 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C31995p2) this.f4440y.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f4440y.getMeasuredWidth() + iMax;
                    this.f4440y.layout(iMax, i513, measuredWidth7, this.f4440y.getMeasuredHeight() + i513);
                    i26 = measuredWidth7 + this.f4408Q;
                } else {
                    i26 = iMax;
                }
                if (z13) {
                    iMax = Math.max(i25, i26);
                }
            }
        } else {
            if (zM3305I) {
                textView = this.f4439x;
            } else {
                textView = this.f4440y;
            }
            if (zM3305I2) {
                textView2 = this.f4440y;
            } else {
                textView2 = this.f4439x;
            }
            c31995p2 = (C31995p2) textView.getLayoutParams();
            c31995p3 = (C31995p2) textView2.getLayoutParams();
            i17 = measuredHeight;
            if (zM3305I) {
            }
            i18 = this.f4414W & 112;
            i19 = iMax;
            if (i18 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c31995p2).topMargin + this.f4409R;
            } else if (i18 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i17) / 2;
                i34 = ((ViewGroup.MarginLayoutParams) c31995p2).topMargin;
                i35 = this.f4409R;
                if (iMax2 < i34 + i35) {
                    iMax2 = i34 + i35;
                } else {
                    i36 = (((height - paddingBottom) - i17) - iMax2) - paddingTop2;
                    i37 = ((ViewGroup.MarginLayoutParams) c31995p2).bottomMargin;
                    i38 = this.f4410S;
                    if (i36 < i37 + i38) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c31995p3).bottomMargin + i38) - i36));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c31995p3).bottomMargin) - this.f4410S) - i17;
            }
            if (z14) {
                if (z13) {
                    i27 = this.f4407P;
                } else {
                    i27 = 0;
                }
                int i514 = i27 - iArr[1];
                iMin -= Math.max(0, i514);
                iArr[1] = Math.max(0, -i514);
                if (zM3305I) {
                    C31995p2 c31995p13 = (C31995p2) this.f4439x.getLayoutParams();
                    int measuredWidth8 = iMin - this.f4439x.getMeasuredWidth();
                    int measuredHeight6 = this.f4439x.getMeasuredHeight() + paddingTop;
                    this.f4439x.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i28 = measuredWidth8 - this.f4408Q;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c31995p13).bottomMargin;
                } else {
                    i28 = iMin;
                }
                if (zM3305I2) {
                    int i515 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C31995p2) this.f4440y.getLayoutParams())).topMargin;
                    this.f4440y.layout(iMin - this.f4440y.getMeasuredWidth(), i515, iMin, this.f4440y.getMeasuredHeight() + i515);
                    i29 = iMin - this.f4408Q;
                } else {
                    i29 = iMin;
                }
                if (z13) {
                    iMin = Math.min(i28, i29);
                }
                iMax = i19;
            } else {
                if (z13) {
                    i24 = this.f4407P;
                } else {
                    i24 = 0;
                }
                int i516 = i24 - iArr[0];
                iMax = Math.max(0, i516) + i19;
                iArr[0] = Math.max(0, -i516);
                if (zM3305I) {
                    C31995p2 c31995p14 = (C31995p2) this.f4439x.getLayoutParams();
                    int measuredWidth9 = this.f4439x.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f4439x.getMeasuredHeight() + paddingTop;
                    this.f4439x.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i25 = measuredWidth9 + this.f4408Q;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c31995p14).bottomMargin;
                } else {
                    i25 = iMax;
                }
                if (zM3305I2) {
                    int i517 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C31995p2) this.f4440y.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f4440y.getMeasuredWidth() + iMax;
                    this.f4440y.layout(iMax, i517, measuredWidth10, this.f4440y.getMeasuredHeight() + i517);
                    i26 = measuredWidth10 + this.f4408Q;
                } else {
                    i26 = iMax;
                }
                if (z13) {
                    iMax = Math.max(i25, i26);
                }
            }
        }
        m3309b(3, this.f4421g0);
        size = this.f4421g0.size();
        while (i39 < size) {
            iMax = m3330y(this.f4421g0.get(i39), iMax, iMin2, iArr);
        }
        m3309b(5, this.f4421g0);
        size2 = this.f4421g0.size();
        while (i44 < size2) {
            iMin = m3331z(this.f4421g0.get(i44), iMin, iMin2, iArr);
        }
        m3309b(1, this.f4421g0);
        arrayList = this.f4421g0;
        int i68 = iArr[0];
        int i69 = iArr[1];
        size3 = arrayList.size();
        i45 = i69;
        i46 = i68;
        i47 = 0;
        measuredWidth = 0;
        while (i47 < size3) {
            View view2 = arrayList.get(i47);
            C31995p2 c31995p15 = (C31995p2) view2.getLayoutParams();
            ArrayList<View> arrayList3 = arrayList;
            int i610 = ((ViewGroup.MarginLayoutParams) c31995p15).leftMargin - i46;
            int i611 = ((ViewGroup.MarginLayoutParams) c31995p15).rightMargin - i45;
            int iMax7 = Math.max(0, i610);
            int iMax8 = Math.max(0, i611);
            int iMax9 = Math.max(0, -i610);
            int iMax10 = Math.max(0, -i611);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i47++;
            i45 = iMax10;
            i46 = iMax9;
            arrayList = arrayList3;
        }
        i48 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i49 = measuredWidth + i48;
        if (i48 >= iMax) {
            if (i49 > iMin) {
                iMax = i48 - (i49 - iMin);
            } else {
                iMax = i48;
            }
        }
        size4 = this.f4421g0.size();
        while (i54 < size4) {
            iMax = m3330y(this.f4421g0.get(i54), iMax, iMin2, iArr);
        }
        this.f4421g0.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i13, int i14) {
        char c3;
        char c7;
        int iM3295p;
        int iMax;
        int iCombineMeasuredStates;
        int iM3295p2;
        int iMax2;
        int iCombineMeasuredStates2;
        int iM3296q;
        int[] iArr = this.f4423i0;
        int i15 = 0;
        if (getLayoutDirection() == 1) {
            c7 = 1;
            c3 = 0;
        } else {
            c3 = 1;
            c7 = 0;
        }
        if (m3305I(this.f4441z)) {
            m3298B(this.f4441z, i13, 0, i14, this.f4406O);
            iM3295p = m3295p(this.f4441z) + this.f4441z.getMeasuredWidth();
            iMax = Math.max(0, m3296q(this.f4441z) + this.f4441z.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f4441z.getMeasuredState());
        } else {
            iM3295p = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m3305I(this.f4399H)) {
            m3298B(this.f4399H, i13, 0, i14, this.f4406O);
            iM3295p = m3295p(this.f4399H) + this.f4399H.getMeasuredWidth();
            iMax = Math.max(iMax, m3296q(this.f4399H) + this.f4399H.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4399H.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM3295p);
        iArr[c7] = Math.max(0, currentContentInsetStart - iM3295p);
        if (m3305I(this.f4437w)) {
            m3298B(this.f4437w, i13, iMax3, i14, this.f4406O);
            iM3295p2 = m3295p(this.f4437w) + this.f4437w.getMeasuredWidth();
            iMax = Math.max(iMax, m3296q(this.f4437w) + this.f4437w.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4437w.getMeasuredState());
        } else {
            iM3295p2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, iM3295p2);
        iArr[c3] = Math.max(0, currentContentInsetEnd - iM3295p2);
        if (m3305I(this.f4400I)) {
            iMax4 += m3297A(this.f4400I, i13, iMax4, i14, 0, iArr);
            iMax = Math.max(iMax, m3296q(this.f4400I) + this.f4400I.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4400I.getMeasuredState());
        }
        if (m3305I(this.f4396E)) {
            iMax4 += m3297A(this.f4396E, i13, iMax4, i14, 0, iArr);
            iMax = Math.max(iMax, m3296q(this.f4396E) + this.f4396E.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4396E.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (((C31995p2) childAt.getLayoutParams()).f132800b == 0 && m3305I(childAt)) {
                iMax4 += m3297A(childAt, i13, iMax4, i14, 0, iArr);
                int iMax5 = Math.max(iMax, m3296q(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i17 = iMax4;
        int i18 = this.f4409R + this.f4410S;
        int i19 = this.f4407P + this.f4408Q;
        if (m3305I(this.f4439x)) {
            m3297A(this.f4439x, i13, i17 + i19, i14, i18, iArr);
            int iM3295p3 = m3295p(this.f4439x) + this.f4439x.getMeasuredWidth();
            int iM3296q2 = m3296q(this.f4439x) + this.f4439x.getMeasuredHeight();
            iMax2 = iM3295p3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f4439x.getMeasuredState());
            iM3296q = iM3296q2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iM3296q = 0;
        }
        if (m3305I(this.f4440y)) {
            iMax2 = Math.max(iMax2, m3297A(this.f4440y, i13, i17 + i19, i14, i18 + iM3296q, iArr));
            iM3296q += m3296q(this.f4440y) + this.f4440y.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f4440y.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iM3296q);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i17 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i13, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i14, iCombineMeasuredStates2 << 16);
        if (!this.f4433s0) {
            i15 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i24 = 0; i24 < childCount2; i24++) {
            View childAt2 = getChildAt(i24);
            if (m3305I(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i15 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i15);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C32003r2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C32003r2 c32003r2 = (C32003r2) parcelable;
        super.onRestoreInstanceState(c32003r2.m113141b());
        ActionMenuView actionMenuView = this.f4437w;
        MenuC30818l menuC30818l = actionMenuView != null ? actionMenuView.f4317w : null;
        int i13 = c32003r2.f132817y;
        if (i13 != 0 && this.f4430p0 != null && menuC30818l != null && (menuItemFindItem = menuC30818l.findItem(i13)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c32003r2.f132818z) {
            removeCallbacks(this.f4438w0);
            post(this.f4438w0);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i13) {
        super.onRtlPropertiesChanged(i13);
        m3315h();
        C31951e2 c31951e2 = this.f4411T;
        boolean z4 = i13 == 1;
        if (z4 == c31951e2.f132669g) {
            return;
        }
        c31951e2.f132669g = z4;
        if (!c31951e2.f132670h) {
            c31951e2.f132663a = c31951e2.f132667e;
            c31951e2.f132664b = c31951e2.f132668f;
            return;
        }
        if (z4) {
            int i14 = c31951e2.f132666d;
            if (i14 == Integer.MIN_VALUE) {
                i14 = c31951e2.f132667e;
            }
            c31951e2.f132663a = i14;
            int i15 = c31951e2.f132665c;
            if (i15 == Integer.MIN_VALUE) {
                i15 = c31951e2.f132668f;
            }
            c31951e2.f132664b = i15;
            return;
        }
        int i16 = c31951e2.f132665c;
        if (i16 == Integer.MIN_VALUE) {
            i16 = c31951e2.f132667e;
        }
        c31951e2.f132663a = i16;
        int i17 = c31951e2.f132666d;
        if (i17 == Integer.MIN_VALUE) {
            i17 = c31951e2.f132668f;
        }
        c31951e2.f132664b = i17;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C30820n c30820n;
        C32003r2 c32003r2 = new C32003r2(super.onSaveInstanceState());
        C1088b c1088b = this.f4430p0;
        if (c1088b != null && (c30820n = c1088b.f4449x) != null) {
            c32003r2.f132817y = c30820n.f127086b;
        }
        c32003r2.f132818z = m3329x();
        return c32003r2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4419e0 = false;
        }
        if (!this.f4419e0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f4419e0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4419e0 = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public boolean m3323r() {
        C1088b c1088b = this.f4430p0;
        return (c1088b == null || c1088b.f4449x == null) ? false : true;
    }

    @Override // p184h5.InterfaceC16885k
    public void removeMenuProvider(InterfaceC16897o interfaceC16897o) {
        this.f4424j0.m47564b(interfaceC16897o);
    }

    /* JADX INFO: renamed from: s */
    public boolean m3324s() {
        C31960h c31960h;
        ActionMenuView actionMenuView = this.f4437w;
        return (actionMenuView == null || (c31960h = actionMenuView.f4309E) == null || !c31960h.m99449c()) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z4) {
        if (this.f4436v0 != z4) {
            this.f4436v0 = z4;
            m3307K();
        }
    }

    public void setCollapseContentDescription(int i13) {
        setCollapseContentDescription(i13 != 0 ? getContext().getText(i13) : null);
    }

    public void setCollapseIcon(int i13) {
        setCollapseIcon(AbstractC30060g.m92133x(getContext(), i13));
    }

    public void setCollapsible(boolean z4) {
        this.f4433s0 = z4;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i13) {
        if (i13 < 0) {
            i13 = Integer.MIN_VALUE;
        }
        if (i13 != this.f4413V) {
            this.f4413V = i13;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i13) {
        if (i13 < 0) {
            i13 = Integer.MIN_VALUE;
        }
        if (i13 != this.f4412U) {
            this.f4412U = i13;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i13) {
        setLogo(AbstractC30060g.m92133x(getContext(), i13));
    }

    public void setLogoDescription(int i13) {
        setLogoDescription(getContext().getText(i13));
    }

    public void setNavigationContentDescription(int i13) {
        setNavigationContentDescription(i13 != 0 ? getContext().getText(i13) : null);
    }

    public void setNavigationIcon(int i13) {
        setNavigationIcon(AbstractC30060g.m92133x(getContext(), i13));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m3318k();
        this.f4441z.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC31999q2 interfaceC31999q2) {
        this.f4426l0 = interfaceC31999q2;
    }

    public void setOverflowIcon(Drawable drawable) {
        m3316i();
        this.f4437w.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i13) {
        if (this.f4402K != i13) {
            this.f4402K = i13;
            if (i13 == 0) {
                this.f4401J = getContext();
            } else {
                this.f4401J = new ContextThemeWrapper(getContext(), i13);
            }
        }
    }

    public void setSubtitle(int i13) {
        setSubtitle(getContext().getText(i13));
    }

    public void setSubtitleTextColor(int i13) {
        setSubtitleTextColor(ColorStateList.valueOf(i13));
    }

    public void setTitle(int i13) {
        setTitle(getContext().getText(i13));
    }

    public void setTitleMarginBottom(int i13) {
        this.f4410S = i13;
        requestLayout();
    }

    public void setTitleMarginEnd(int i13) {
        this.f4408Q = i13;
        requestLayout();
    }

    public void setTitleMarginStart(int i13) {
        this.f4407P = i13;
        requestLayout();
    }

    public void setTitleMarginTop(int i13) {
        this.f4409R = i13;
        requestLayout();
    }

    public void setTitleTextColor(int i13) {
        setTitleTextColor(ColorStateList.valueOf(i13));
    }

    /* JADX INFO: renamed from: t */
    public void mo3325t(int i13) {
        getMenuInflater().inflate(i13, getMenu());
    }

    /* JADX INFO: renamed from: u */
    public void m3326u() {
        Iterator<MenuItem> it = this.f4425k0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        C16894n c16894n = this.f4424j0;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it3 = c16894n.f64846b.iterator();
        while (it3.hasNext()) {
            ((C1289e1) ((InterfaceC16897o) it3.next())).f5593a.m4177k(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f4425k0 = currentMenuItems2;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m3327v(View view) {
        return view.getParent() == this || this.f4422h0.contains(view);
    }

    /* JADX INFO: renamed from: w */
    public boolean m3328w() {
        C31960h c31960h;
        ActionMenuView actionMenuView = this.f4437w;
        if (actionMenuView == null || (c31960h = actionMenuView.f4309E) == null) {
            return false;
        }
        return c31960h.f132698U != null || c31960h.m99450k();
    }

    /* JADX INFO: renamed from: x */
    public boolean m3329x() {
        C31960h c31960h;
        ActionMenuView actionMenuView = this.f4437w;
        return (actionMenuView == null || (c31960h = actionMenuView.f4309E) == null || !c31960h.m99450k()) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    public final int m3330y(View view, int i13, int i14, int[] iArr) {
        C31995p2 c31995p2 = (C31995p2) view.getLayoutParams();
        int i15 = ((ViewGroup.MarginLayoutParams) c31995p2).leftMargin - iArr[0];
        int iMax = Math.max(0, i15) + i13;
        iArr[0] = Math.max(0, -i15);
        int iM3322o = m3322o(view, i14);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM3322o, iMax + measuredWidth, view.getMeasuredHeight() + iM3322o);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c31995p2).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: z */
    public final int m3331z(View view, int i13, int i14, int[] iArr) {
        C31995p2 c31995p2 = (C31995p2) view.getLayoutParams();
        int i15 = ((ViewGroup.MarginLayoutParams) c31995p2).rightMargin - iArr[1];
        int iMax = i13 - Math.max(0, i15);
        iArr[1] = Math.max(0, -i15);
        int iM3322o = m3322o(view, i14);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM3322o, iMax, view.getMeasuredHeight() + iM3322o);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c31995p2).leftMargin);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f4414W = 8388627;
        this.f4421g0 = new ArrayList<>();
        this.f4422h0 = new ArrayList<>();
        this.f4423i0 = new int[2];
        this.f4424j0 = new C16894n(new RunnableC31987n2(this, 1));
        this.f4425k0 = new ArrayList<>();
        this.f4427m0 = new C29934u0(this, 13);
        this.f4438w0 = new RunnableC3543b(this, 23);
        Context context2 = getContext();
        int[] iArr = AbstractC22932a.f90531x;
        C31983m2 c31983m2M99479q = C31983m2.m99479q(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AbstractC16901p0.m47582m(this, context, iArr, attributeSet, (TypedArray) c31983m2M99479q.f132769x, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c31983m2M99479q.f132769x;
        this.f4403L = typedArray.getResourceId(28, 0);
        this.f4404M = typedArray.getResourceId(19, 0);
        this.f4414W = typedArray.getInteger(0, this.f4414W);
        this.f4405N = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f4410S = dimensionPixelOffset;
        this.f4409R = dimensionPixelOffset;
        this.f4408Q = dimensionPixelOffset;
        this.f4407P = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f4407P = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f4408Q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f4409R = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f4410S = dimensionPixelOffset5;
        }
        this.f4406O = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m3315h();
        C31951e2 c31951e2 = this.f4411T;
        c31951e2.f132670h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c31951e2.f132667e = dimensionPixelSize;
            c31951e2.f132663a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c31951e2.f132668f = dimensionPixelSize2;
            c31951e2.f132664b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c31951e2.m99446a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f4412U = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f4413V = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f4397F = c31983m2M99479q.m99486j(4);
        this.f4398G = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f4401J = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM99486j = c31983m2M99479q.m99486j(16);
        if (drawableM99486j != null) {
            setNavigationIcon(drawableM99486j);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM99486j2 = c31983m2M99479q.m99486j(11);
        if (drawableM99486j2 != null) {
            setLogo(drawableM99486j2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c31983m2M99479q.m99484h(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c31983m2M99479q.m99484h(20));
        }
        if (typedArray.hasValue(14)) {
            mo3325t(typedArray.getResourceId(14, 0));
        }
        c31983m2M99479q.m99491r();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m3314g();
        }
        ImageButton imageButton = this.f4399H;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m3314g();
            this.f4399H.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f4399H;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f4397F);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f4396E == null) {
                this.f4396E = new AppCompatImageView(getContext(), null);
            }
            if (!m3327v(this.f4396E)) {
                m3310c(this.f4396E, true);
            }
        } else {
            ImageView imageView = this.f4396E;
            if (imageView != null && m3327v(imageView)) {
                removeView(this.f4396E);
                this.f4422h0.remove(this.f4396E);
            }
        }
        ImageView imageView2 = this.f4396E;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f4396E == null) {
            this.f4396E = new AppCompatImageView(getContext(), null);
        }
        ImageView imageView = this.f4396E;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m3318k();
        }
        ImageButton imageButton = this.f4441z;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            AbstractC32015u2.m99566a(this.f4441z, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m3318k();
            if (!m3327v(this.f4441z)) {
                m3310c(this.f4441z, true);
            }
        } else {
            ImageButton imageButton = this.f4441z;
            if (imageButton != null && m3327v(imageButton)) {
                removeView(this.f4441z);
                this.f4422h0.remove(this.f4441z);
            }
        }
        ImageButton imageButton2 = this.f4441z;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f4440y;
            if (textView != null && m3327v(textView)) {
                removeView(this.f4440y);
                this.f4422h0.remove(this.f4440y);
            }
        } else {
            if (this.f4440y == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f4440y = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f4440y.setEllipsize(TextUtils.TruncateAt.END);
                int i13 = this.f4404M;
                if (i13 != 0) {
                    this.f4440y.setTextAppearance(context, i13);
                }
                ColorStateList colorStateList = this.f4418d0;
                if (colorStateList != null) {
                    this.f4440y.setTextColor(colorStateList);
                }
            }
            if (!m3327v(this.f4440y)) {
                m3310c(this.f4440y, true);
            }
        }
        TextView textView2 = this.f4440y;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f4416b0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f4418d0 = colorStateList;
        TextView textView = this.f4440y;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f4439x;
            if (textView != null && m3327v(textView)) {
                removeView(this.f4439x);
                this.f4422h0.remove(this.f4439x);
            }
        } else {
            if (this.f4439x == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f4439x = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f4439x.setEllipsize(TextUtils.TruncateAt.END);
                int i13 = this.f4403L;
                if (i13 != 0) {
                    this.f4439x.setTextAppearance(context, i13);
                }
                ColorStateList colorStateList = this.f4417c0;
                if (colorStateList != null) {
                    this.f4439x.setTextColor(colorStateList);
                }
            }
            if (!m3327v(this.f4439x)) {
                m3310c(this.f4439x, true);
            }
        }
        TextView textView2 = this.f4439x;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f4415a0 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f4417c0 = colorStateList;
        TextView textView = this.f4439x;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
