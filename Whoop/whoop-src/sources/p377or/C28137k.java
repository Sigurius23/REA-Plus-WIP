package p377or;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import cr.AbstractC11075m;
import ir.AbstractC20858a;
import java.util.WeakHashMap;
import mq.C25873a;
import mq.C25874b;
import mq.C25875c;
import p014aj.C0929d;
import p184h5.AbstractC16883j0;
import p184h5.AbstractC16901p0;
import p211i5.C18091d;
import p474s.AbstractC32015u2;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: or.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C28137k extends LinearLayout {

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ int f113788L = 0;

    /* JADX INFO: renamed from: E */
    public C25873a f113789E;

    /* JADX INFO: renamed from: F */
    public View f113790F;

    /* JADX INFO: renamed from: G */
    public TextView f113791G;

    /* JADX INFO: renamed from: H */
    public ImageView f113792H;

    /* JADX INFO: renamed from: I */
    public Drawable f113793I;

    /* JADX INFO: renamed from: J */
    public int f113794J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ TabLayout f113795K;

    /* JADX INFO: renamed from: w */
    public C28134h f113796w;

    /* JADX INFO: renamed from: x */
    public TextView f113797x;

    /* JADX INFO: renamed from: y */
    public ImageView f113798y;

    /* JADX INFO: renamed from: z */
    public View f113799z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28137k(TabLayout tabLayout, Context context) {
        super(context);
        this.f113795K = tabLayout;
        this.f113794J = 2;
        m85129f(context);
        int i13 = tabLayout.f21056E;
        int i14 = tabLayout.f21057F;
        int i15 = tabLayout.f21058G;
        int i16 = tabLayout.f21059H;
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        setPaddingRelative(i13, i14, i15, i16);
        setGravity(17);
        setOrientation(!tabLayout.f21081g0 ? 1 : 0);
        setClickable(true);
        AbstractC16883j0.m47541a(this, PointerIcon.getSystemIcon(getContext(), 1002));
    }

    private C25873a getBadge() {
        return this.f113789E;
    }

    private C25873a getOrCreateBadge() {
        if (this.f113789E == null) {
            this.f113789E = new C25873a(getContext());
        }
        m85126c();
        C25873a c25873a = this.f113789E;
        if (c25873a != null) {
            return c25873a;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    /* JADX INFO: renamed from: a */
    public final void m85124a(View view) {
        if (this.f113789E == null || view == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        C25873a c25873a = this.f113789E;
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c25873a.setBounds(rect);
        c25873a.m76479h(view, null);
        if (c25873a.m76474c() != null) {
            c25873a.m76474c().setForeground(c25873a);
        } else {
            view.getOverlay().add(c25873a);
        }
        this.f113799z = view;
    }

    /* JADX INFO: renamed from: b */
    public final void m85125b() {
        if (this.f113789E != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f113799z;
            if (view != null) {
                C25873a c25873a = this.f113789E;
                if (c25873a != null) {
                    if (c25873a.m76474c() != null) {
                        c25873a.m76474c().setForeground(null);
                    } else {
                        view.getOverlay().remove(c25873a);
                    }
                }
                this.f113799z = null;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m85126c() {
        C28134h c28134h;
        if (this.f113789E != null) {
            if (this.f113790F != null) {
                m85125b();
                return;
            }
            ImageView imageView = this.f113798y;
            if (imageView != null && (c28134h = this.f113796w) != null && c28134h.f113776a != null) {
                if (this.f113799z == imageView) {
                    m85127d(imageView);
                    return;
                } else {
                    m85125b();
                    m85124a(this.f113798y);
                    return;
                }
            }
            TextView textView = this.f113797x;
            if (textView == null || this.f113796w == null) {
                m85125b();
            } else if (this.f113799z == textView) {
                m85127d(textView);
            } else {
                m85125b();
                m85124a(this.f113797x);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m85127d(View view) {
        C25873a c25873a = this.f113789E;
        if (c25873a == null || view != this.f113799z) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c25873a.setBounds(rect);
        c25873a.m76479h(view, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f113793I;
        if ((drawable == null || !drawable.isStateful()) ? false : this.f113793I.setState(drawableState)) {
            invalidate();
            this.f113795K.invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX INFO: renamed from: e */
    public final void m85128e() {
        boolean z4;
        m85130g();
        C28134h c28134h = this.f113796w;
        if (c28134h == null) {
            z4 = false;
        } else {
            TabLayout tabLayout = c28134h.f113781f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            if (selectedTabPosition == -1 || selectedTabPosition != c28134h.f113779d) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        setSelected(z4);
    }

    /* JADX INFO: renamed from: f */
    public final void m85129f(Context context) {
        GradientDrawable gradientDrawable;
        TabLayout tabLayout = this.f113795K;
        int i13 = tabLayout.f21071T;
        if (i13 != 0) {
            Drawable drawableM92133x = AbstractC30060g.m92133x(context, i13);
            this.f113793I = drawableM92133x;
            if (drawableM92133x != null && drawableM92133x.isStateful()) {
                this.f113793I.setState(getDrawableState());
            }
        } else {
            this.f113793I = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        Drawable rippleDrawable = gradientDrawable2;
        if (tabLayout.f21065N != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateList = tabLayout.f21065N;
            int iM57612a = AbstractC20858a.m57612a(colorStateList, AbstractC20858a.f78462c);
            int[] iArr = AbstractC20858a.f78461b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{AbstractC20858a.f78463d, iArr, StateSet.NOTHING}, new int[]{iM57612a, AbstractC20858a.m57612a(colorStateList, iArr), AbstractC20858a.m57612a(colorStateList, AbstractC20858a.f78460a)});
            boolean z4 = tabLayout.f21085k0;
            if (z4) {
                gradientDrawable = gradientDrawable2;
                gradientDrawable = null;
            }
            rippleDrawable = new RippleDrawable(colorStateList2, gradientDrawable, z4 ? null : gradientDrawable3);
        }
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        setBackground(rippleDrawable);
        tabLayout.invalidate();
    }

    /* JADX INFO: renamed from: g */
    public final void m85130g() {
        int i13;
        ViewParent parent;
        C28134h c28134h = this.f113796w;
        View view = c28134h != null ? c28134h.f113780e : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f113790F;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f113790F);
                }
                addView(view);
            }
            this.f113790F = view;
            TextView textView = this.f113797x;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f113798y;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f113798y.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.f113791G = textView2;
            if (textView2 != null) {
                this.f113794J = textView2.getMaxLines();
            }
            this.f113792H = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.f113790F;
            if (view3 != null) {
                removeView(view3);
                this.f113790F = null;
            }
            this.f113791G = null;
            this.f113792H = null;
        }
        if (this.f113790F == null) {
            if (this.f113798y == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.whoop.android.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f113798y = imageView2;
                addView(imageView2, 0);
            }
            if (this.f113797x == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.whoop.android.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f113797x = textView3;
                addView(textView3);
                this.f113794J = this.f113797x.getMaxLines();
            }
            TextView textView4 = this.f113797x;
            TabLayout tabLayout = this.f113795K;
            textView4.setTextAppearance(tabLayout.f21060I);
            if (!isSelected() || (i13 = tabLayout.f21062K) == -1) {
                this.f113797x.setTextAppearance(tabLayout.f21061J);
            } else {
                this.f113797x.setTextAppearance(i13);
            }
            ColorStateList colorStateList = tabLayout.f21063L;
            if (colorStateList != null) {
                this.f113797x.setTextColor(colorStateList);
            }
            m85131h(this.f113797x, this.f113798y, true);
            m85126c();
            ImageView imageView3 = this.f113798y;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC28136j(this, imageView3));
            }
            TextView textView5 = this.f113797x;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC28136j(this, textView5));
            }
        } else {
            TextView textView6 = this.f113791G;
            if (textView6 != null || this.f113792H != null) {
                m85131h(textView6, this.f113792H, false);
            }
        }
        if (c28134h == null || TextUtils.isEmpty(c28134h.f113778c)) {
            return;
        }
        setContentDescription(c28134h.f113778c);
    }

    public int getContentHeight() {
        View[] viewArr = {this.f113797x, this.f113798y, this.f113790F};
        int iMax = 0;
        int iMin = 0;
        boolean z4 = false;
        for (int i13 = 0; i13 < 3; i13++) {
            View view = viewArr[i13];
            if (view != null && view.getVisibility() == 0) {
                iMin = z4 ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z4 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z4 = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f113797x, this.f113798y, this.f113790F};
        int iMax = 0;
        int iMin = 0;
        boolean z4 = false;
        for (int i13 = 0; i13 < 3; i13++) {
            View view = viewArr[i13];
            if (view != null && view.getVisibility() == 0) {
                iMin = z4 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z4 ? Math.max(iMax, view.getRight()) : view.getRight();
                z4 = true;
            }
        }
        return iMax - iMin;
    }

    public C28134h getTab() {
        return this.f113796w;
    }

    /* JADX INFO: renamed from: h */
    public final void m85131h(TextView textView, ImageView imageView, boolean z4) {
        boolean z13;
        Drawable drawable;
        C28134h c28134h = this.f113796w;
        Drawable drawableMutate = (c28134h == null || (drawable = c28134h.f113776a) == null) ? null : drawable.mutate();
        TabLayout tabLayout = this.f113795K;
        if (drawableMutate != null) {
            drawableMutate.setTintList(tabLayout.f21064M);
            PorterDuff.Mode mode = tabLayout.f21068Q;
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
        }
        C28134h c28134h2 = this.f113796w;
        CharSequence charSequence = c28134h2 != null ? c28134h2.f113777b : null;
        if (imageView != null) {
            if (drawableMutate != null) {
                imageView.setImageDrawable(drawableMutate);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (zIsEmpty) {
                z13 = false;
            } else {
                this.f113796w.getClass();
                z13 = true;
            }
            textView.setText(!zIsEmpty ? charSequence : null);
            textView.setVisibility(z13 ? 0 : 8);
            if (!zIsEmpty) {
                setVisibility(0);
            }
        } else {
            z13 = false;
        }
        if (z4 && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iM29870d = (z13 && imageView.getVisibility() == 0) ? (int) AbstractC11075m.m29870d(getContext(), 8) : 0;
            if (tabLayout.f21081g0) {
                if (iM29870d != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iM29870d);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iM29870d != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iM29870d;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        C28134h c28134h3 = this.f113796w;
        CharSequence charSequence2 = c28134h3 != null ? c28134h3.f113778c : null;
        if (zIsEmpty) {
            charSequence = charSequence2;
        }
        AbstractC32015u2.m99566a(this, charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C25873a c25873a = this.f113789E;
        if (c25873a != null && c25873a.isVisible()) {
            C25873a c25873a2 = this.f113789E;
            C25875c c25875c = c25873a2.f102010E;
            CharSequence quantityString = null;
            if (c25873a2.isVisible()) {
                C25874b c25874b = c25875c.f102054b;
                if (c25874b.f102028J != null) {
                    quantityString = c25874b.f102033O;
                    if (quantityString == null) {
                        quantityString = c25873a2.f102010E.f102054b.f102028J;
                    }
                } else if (!c25873a2.m76477f()) {
                    quantityString = c25874b.f102034P;
                } else if (c25874b.f102035Q != 0 && (context = (Context) c25873a2.f102019w.get()) != null) {
                    if (c25873a2.f102013H != -2) {
                        int iM76475d = c25873a2.m76475d();
                        int i13 = c25873a2.f102013H;
                        if (iM76475d <= i13) {
                            quantityString = context.getResources().getQuantityString(c25874b.f102035Q, c25873a2.m76475d(), Integer.valueOf(c25873a2.m76475d()));
                        } else {
                            quantityString = context.getString(c25874b.f102036R, Integer.valueOf(i13));
                        }
                    } else {
                        quantityString = context.getResources().getQuantityString(c25874b.f102035Q, c25873a2.m76475d(), Integer.valueOf(c25873a2.m76475d()));
                    }
                }
            }
            accessibilityNodeInfo.setContentDescription(quantityString);
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0929d.m2336s(0, 1, this.f113796w.f113779d, 1, isSelected()).f3422w);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C18091d.f70301e.f70313a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.whoop.android.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int size = View.MeasureSpec.getSize(i13);
        int mode = View.MeasureSpec.getMode(i13);
        TabLayout tabLayout = this.f113795K;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i13 = View.MeasureSpec.makeMeasureSpec(tabLayout.f21072U, Integer.MIN_VALUE);
        }
        super.onMeasure(i13, i14);
        if (this.f113797x != null) {
            float f13 = tabLayout.f21069R;
            int i15 = this.f113794J;
            ImageView imageView = this.f113798y;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f113797x;
                if (textView != null && textView.getLineCount() > 1) {
                    f13 = tabLayout.f21070S;
                }
            } else {
                i15 = 1;
            }
            float textSize = this.f113797x.getTextSize();
            int lineCount = this.f113797x.getLineCount();
            int maxLines = this.f113797x.getMaxLines();
            if (f13 != textSize || (maxLines >= 0 && i15 != maxLines)) {
                if (tabLayout.f21080f0 == 1 && f13 > textSize && lineCount == 1) {
                    Layout layout = this.f113797x.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f13 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f113797x.setTextSize(0, f13);
                this.f113797x.setMaxLines(i15);
                super.onMeasure(i13, i14);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f113796w == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        C28134h c28134h = this.f113796w;
        TabLayout tabLayout = c28134h.f113781f;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.m15791k(c28134h, true);
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z4) {
        isSelected();
        super.setSelected(z4);
        TextView textView = this.f113797x;
        if (textView != null) {
            textView.setSelected(z4);
        }
        ImageView imageView = this.f113798y;
        if (imageView != null) {
            imageView.setSelected(z4);
        }
        View view = this.f113790F;
        if (view != null) {
            view.setSelected(z4);
        }
    }

    public void setTab(C28134h c28134h) {
        if (c28134h != this.f113796w) {
            this.f113796w = c28134h;
            m85128e();
        }
    }
}
