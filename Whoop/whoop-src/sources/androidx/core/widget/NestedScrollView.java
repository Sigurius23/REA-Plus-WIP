package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1707m0;
import hn.C17508p;
import io.getstream.chat.android.p226ui.widgets.NestedScrollViewPaginationHelper;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p027b3.AbstractC2378g1;
import p029b5.AbstractC2723b;
import p184h5.AbstractC16856a0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16859b0;
import p184h5.C16873g;
import p184h5.C16903q;
import p184h5.C16912t;
import p184h5.InterfaceC16900p;
import p184h5.InterfaceC16909s;
import p243j5.AbstractC21327a;
import p296l5.AbstractC23339c;
import p296l5.C23341e;
import p296l5.C23342f;
import p296l5.C23344h;
import p296l5.InterfaceC23343g;
import p522uf.AbstractC34870c0;

/* JADX INFO: loaded from: classes5.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC16909s, InterfaceC16900p, ScrollingView {

    /* JADX INFO: renamed from: g0 */
    private static final float f5276g0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: h0 */
    private static final C23341e f5277h0 = new C23341e();

    /* JADX INFO: renamed from: i0 */
    private static final int[] f5278i0 = {R.attr.fillViewport};

    /* JADX INFO: renamed from: E */
    public EdgeEffect f5279E;

    /* JADX INFO: renamed from: F */
    public EdgeEffect f5280F;

    /* JADX INFO: renamed from: G */
    private int f5281G;

    /* JADX INFO: renamed from: H */
    private boolean f5282H;

    /* JADX INFO: renamed from: I */
    private boolean f5283I;

    /* JADX INFO: renamed from: J */
    private View f5284J;

    /* JADX INFO: renamed from: K */
    private boolean f5285K;

    /* JADX INFO: renamed from: L */
    private VelocityTracker f5286L;

    /* JADX INFO: renamed from: M */
    private boolean f5287M;

    /* JADX INFO: renamed from: N */
    private boolean f5288N;

    /* JADX INFO: renamed from: O */
    private int f5289O;

    /* JADX INFO: renamed from: P */
    private int f5290P;

    /* JADX INFO: renamed from: Q */
    private int f5291Q;

    /* JADX INFO: renamed from: R */
    private int f5292R;

    /* JADX INFO: renamed from: S */
    private final int[] f5293S;

    /* JADX INFO: renamed from: T */
    private final int[] f5294T;

    /* JADX INFO: renamed from: U */
    private int f5295U;

    /* JADX INFO: renamed from: V */
    private int f5296V;

    /* JADX INFO: renamed from: W */
    private C23344h f5297W;

    /* JADX INFO: renamed from: a0 */
    private final C16912t f5298a0;

    /* JADX INFO: renamed from: b0 */
    private final C16903q f5299b0;

    /* JADX INFO: renamed from: c0 */
    private float f5300c0;

    /* JADX INFO: renamed from: d0 */
    private InterfaceC23343g f5301d0;

    /* JADX INFO: renamed from: e0 */
    final C23342f f5302e0;

    /* JADX INFO: renamed from: f0 */
    C16873g f5303f0;

    /* JADX INFO: renamed from: w */
    private final float f5304w;

    /* JADX INFO: renamed from: x */
    private long f5305x;

    /* JADX INFO: renamed from: y */
    private final Rect f5306y;

    /* JADX INFO: renamed from: z */
    private OverScroller f5307z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.whoop.android.R.attr.nestedScrollViewStyle);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m3689q(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m3689q((View) parent, nestedScrollView);
    }

    /* JADX INFO: renamed from: A */
    public final void m3690A(int i13, int i14, int i15, boolean z4) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f5305x > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f5307z.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i14 + scrollY, Math.max(0, height - height2))) - scrollY, i15);
            if (z4) {
                m3693D(2, 1);
            } else {
                m3695F(1);
            }
            this.f5296V = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f5307z.isFinished()) {
                this.f5307z.abortAnimation();
                m3695F(1);
            }
            scrollBy(i13, i14);
        }
        this.f5305x = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: B */
    public void m3691B(int i13, int i14, int i15, boolean z4) {
        m3690A(i13 - getScrollX(), i14 - getScrollY(), i15, z4);
    }

    /* JADX INFO: renamed from: C */
    public void m3692C(int i13, int i14, boolean z4) {
        m3691B(i13, i14, AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, z4);
    }

    /* JADX INFO: renamed from: D */
    public boolean m3693D(int i13, int i14) {
        return this.f5299b0.m47593f(i13, i14);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m3694E(MotionEvent motionEvent) {
        boolean z4;
        if (AbstractC34870c0.m109982R(this.f5279E) != 0.0f) {
            AbstractC34870c0.m109995e0(this.f5279E, 0.0f, motionEvent.getX() / getWidth());
            z4 = true;
        } else {
            z4 = false;
        }
        if (AbstractC34870c0.m109982R(this.f5280F) == 0.0f) {
            return z4;
        }
        AbstractC34870c0.m109995e0(this.f5280F, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: F */
    public void m3695F(int i13) {
        this.f5299b0.m47594g(i13);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: b */
    public void mo3267b(View view, View view2, int i13, int i14) {
        this.f5298a0.m47605b(i13, i14);
        m3693D(2, i14);
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: c */
    public void mo3268c(View view, int i13) {
        this.f5298a0.m47606c(i13);
        m3695F(i13);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f5307z.isFinished()) {
            return;
        }
        this.f5307z.computeScrollOffset();
        int currY = this.f5307z.getCurrY();
        int iM3698j = m3698j(currY - this.f5296V);
        this.f5296V = currY;
        int[] iArr = this.f5294T;
        iArr[1] = 0;
        m3699k(0, iM3698j, iArr, null, 1);
        int i13 = iM3698j - this.f5294T[1];
        int scrollRange = getScrollRange();
        if (AbstractC2723b.m7688a()) {
            AbstractC21327a.m59856a(this, Math.abs(this.f5307z.getCurrVelocity()));
        }
        if (i13 != 0) {
            int scrollY = getScrollY();
            m3708u(0, i13, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i14 = i13 - scrollY2;
            int[] iArr2 = this.f5294T;
            iArr2[1] = 0;
            m3700l(0, scrollY2, 0, i14, this.f5293S, 1, iArr2);
            i13 = i14 - this.f5294T[1];
        }
        if (i13 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i13 < 0) {
                    if (this.f5279E.isFinished()) {
                        this.f5279E.onAbsorb((int) this.f5307z.getCurrVelocity());
                    }
                } else if (this.f5280F.isFinished()) {
                    this.f5280F.onAbsorb((int) this.f5307z.getCurrVelocity());
                }
            }
            this.f5307z.abortAnimation();
            m3695F(1);
        }
        if (this.f5307z.isFinished()) {
            m3695F(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: d */
    public void mo3269d(View view, int i13, int i14, int[] iArr, int i15) {
        m3699k(i13, i14, iArr, null, i15);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m3701m(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f13, float f14, boolean z4) {
        return this.f5299b0.m47588a(f13, f14, z4);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f13, float f14) {
        return this.f5299b0.m47589b(f13, f14);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i13, int i14, int[] iArr, int[] iArr2) {
        return m3699k(i13, i14, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i13, int i14, int i15, int i16, int[] iArr) {
        return this.f5299b0.m47591d(i13, i14, i15, i16, iArr, 0, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f5279E.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f5279E.setSize(width, height);
            if (this.f5279E.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f5280F.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f5280F.setSize(width2, height2);
        if (this.f5280F.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    /* JADX INFO: renamed from: e */
    public boolean m3696e(int i13) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i13);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m3705r(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i13 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i13 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i13 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m3711x(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f5306y);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f5306y);
            m3711x(m3697f(this.f5306y), 0, 1, true);
            viewFindNextFocus.requestFocus(i13);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !m3705r(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public int m3697f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i14 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i13 - verticalFadingEdgeLength : i13;
        int i15 = rect.bottom;
        if (i15 > i14 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i14, (childAt.getBottom() + layoutParams.bottomMargin) - i13);
        }
        if (rect.top >= scrollY || i15 >= i14) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i14 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // p184h5.InterfaceC16909s
    /* JADX INFO: renamed from: g */
    public void mo3272g(View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        m3706s(i16, i17, iArr);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f5298a0.m47604a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f5300c0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f5300c0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f5300c0;
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: h */
    public void mo3273h(View view, int i13, int i14, int i15, int i16, int i17) {
        m3706s(i16, i17, null);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m3704p(0);
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: i */
    public boolean mo3274i(View view, View view2, int i13, int i14) {
        return (i13 & 2) != 0;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f5299b0.f64860d;
    }

    /* JADX INFO: renamed from: j */
    public int m3698j(int i13) {
        int height = getHeight();
        if (i13 > 0 && AbstractC34870c0.m109982R(this.f5279E) != 0.0f) {
            int iRound = Math.round(AbstractC34870c0.m109995e0(this.f5279E, ((-i13) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
            if (iRound != i13) {
                this.f5279E.finish();
            }
            return i13 - iRound;
        }
        if (i13 >= 0 || AbstractC34870c0.m109982R(this.f5280F) == 0.0f) {
            return i13;
        }
        float f13 = height;
        int iRound2 = Math.round(AbstractC34870c0.m109995e0(this.f5280F, (i13 * 4.0f) / f13, 0.5f) * (f13 / 4.0f));
        if (iRound2 != i13) {
            this.f5280F.finish();
        }
        return i13 - iRound2;
    }

    /* JADX INFO: renamed from: k */
    public boolean m3699k(int i13, int i14, int[] iArr, int[] iArr2, int i15) {
        return this.f5299b0.m47590c(i13, i14, iArr, iArr2, i15);
    }

    /* JADX INFO: renamed from: l */
    public void m3700l(int i13, int i14, int i15, int i16, int[] iArr, int i17, int[] iArr2) {
        this.f5299b0.m47591d(i13, i14, i15, i16, iArr, i17, iArr2);
    }

    /* JADX INFO: renamed from: m */
    public boolean m3701m(KeyEvent keyEvent) {
        this.f5306y.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? m3703o(33) : m3696e(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? m3703o(130) : m3696e(130);
                    }
                    if (keyCode == 62) {
                        m3709v(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return m3703o(33);
                    }
                    if (keyCode == 93) {
                        return m3703o(130);
                    }
                    if (keyCode == 122) {
                        m3709v(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        m3709v(130);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i13, int i14) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i13, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i13, int i14, int i15, int i16) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i13, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i14, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX INFO: renamed from: n */
    public void m3702n(int i13) {
        if (getChildCount() > 0) {
            this.f5307z.fling(getScrollX(), getScrollY(), 0, i13, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m3693D(2, 1);
            this.f5296V = getScrollY();
            postInvalidateOnAnimation();
            if (AbstractC2723b.m7688a()) {
                AbstractC21327a.m59856a(this, Math.abs(this.f5307z.getCurrVelocity()));
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m3703o(int i13) {
        int childCount;
        boolean z4 = i13 == 130;
        int height = getHeight();
        Rect rect = this.f5306y;
        rect.top = 0;
        rect.bottom = height;
        if (z4 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f5306y.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f5306y;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f5306y;
        return m3710w(i13, rect3.top, rect3.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5283I = false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:70:0x011e  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i13;
        int width;
        int i14;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z4;
        int i15;
        float yVelocity;
        float f13;
        long j7;
        float fSqrt;
        int i16;
        if (motionEvent.getAction() != 8 || this.f5285K) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i13 = 9;
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            axisValue = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            i13 = 26;
        } else {
            axisValue = 0.0f;
            i13 = 0;
            width = 0;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        m3711x(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i13 == 0) {
            return true;
        }
        C16873g c16873g = this.f5303f0;
        NestedScrollView nestedScrollView = c16873g.f64811b.f92554a;
        int[] iArr = c16873g.f64817h;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i17 = 1;
        if (c16873g.f64815f == source && c16873g.f64816g == deviceId && c16873g.f64814e == i13) {
            z4 = false;
            i14 = 0;
        } else {
            Context context = c16873g.f64810a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            i14 = 0;
            int source2 = motionEvent.getSource();
            int i18 = Build.VERSION.SDK_INT;
            if (i18 >= 34) {
                scaledMinimumFlingVelocity = AbstractC2378g1.m7335j(viewConfiguration, deviceId2, i13, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i13, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i13 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i18 >= 34) {
                scaledMaximumFlingVelocity = AbstractC2378g1.m7334i(viewConfiguration, deviceId3, i13, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i13, source3) == null) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i13 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c16873g.f64815f = source;
            c16873g.f64816g = deviceId;
            c16873g.f64814e = i13;
            z4 = true;
        }
        if (iArr[i14] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = c16873g.f64812c;
            if (velocityTracker == null) {
                return true;
            }
            velocityTracker.recycle();
            c16873g.f64812c = null;
            return true;
        }
        if (c16873g.f64812c == null) {
            c16873g.f64812c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = c16873g.f64812c;
        Map map = AbstractC16856a0.f64771a;
        velocityTracker2.addMovement(motionEvent);
        int i19 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC16856a0.f64771a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new C16859b0());
            }
            C16859b0 c16859b0 = (C16859b0) map2.get(velocityTracker2);
            long[] jArr = c16859b0.f64780b;
            long eventTime = motionEvent.getEventTime();
            if (c16859b0.f64782d != 0 && eventTime - jArr[c16859b0.f64783e] > 40) {
                c16859b0.f64782d = i14;
                c16859b0.f64781c = 0.0f;
            }
            int i24 = (c16859b0.f64783e + 1) % 20;
            c16859b0.f64783e = i24;
            int i25 = c16859b0.f64782d;
            if (i25 != 20) {
                c16859b0.f64782d = i25 + 1;
            }
            c16859b0.f64779a[i24] = motionEvent.getAxisValue(26);
            jArr[c16859b0.f64783e] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C16859b0 c16859b1 = (C16859b0) AbstractC16856a0.f64771a.get(velocityTracker2);
        if (c16859b1 != null) {
            float[] fArr = c16859b1.f64779a;
            long[] jArr2 = c16859b1.f64780b;
            int i26 = c16859b1.f64782d;
            if (i26 < 2) {
                i15 = i13;
                i16 = 1000;
                fSqrt = 0.0f;
            } else {
                int i27 = c16859b1.f64783e;
                int i28 = ((i27 + 20) - (i26 - 1)) % 20;
                long j13 = jArr2[i27];
                while (true) {
                    j7 = jArr2[i28];
                    if (j13 - j7 <= 100) {
                        break;
                    }
                    c16859b1.f64782d--;
                    i28 = (i28 + 1) % 20;
                }
                int i29 = c16859b1.f64782d;
                if (i29 < 2) {
                    i15 = i13;
                    i16 = 1000;
                    fSqrt = 0.0f;
                } else if (i29 == 2) {
                    int i34 = (i28 + 1) % 20;
                    long j14 = jArr2[i34];
                    if (j7 == j14) {
                        i15 = i13;
                        i16 = 1000;
                        fSqrt = 0.0f;
                    } else {
                        i15 = i13;
                        i16 = 1000;
                        fSqrt = fArr[i34] / (j14 - j7);
                    }
                } else {
                    float f14 = 0.0f;
                    int i35 = 0;
                    int i36 = 0;
                    while (true) {
                        if (i35 >= c16859b1.f64782d - 1) {
                            break;
                        }
                        int i37 = i35 + i28;
                        long j15 = jArr2[i37 % 20];
                        int i38 = (i37 + 1) % i19;
                        if (jArr2[i38] != j15) {
                            i36++;
                            float fSqrt2 = (f14 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f14) * 2.0f));
                            float f15 = fArr[i38] / (jArr2[i38] - j15);
                            float fAbs = (Math.abs(f15) * (f15 - fSqrt2)) + f14;
                            if (i36 == i17) {
                                fAbs *= 0.5f;
                            }
                            f14 = fAbs;
                        }
                        i35++;
                        i13 = i13;
                        i19 = 20;
                        i17 = 1;
                    }
                    i15 = i13;
                    fSqrt = ((float) Math.sqrt(Math.abs(f14) * 2.0f)) * (f14 < 0.0f ? -1.0f : 1.0f);
                    i16 = 1000;
                }
            }
            float f16 = fSqrt * i16;
            c16859b1.f64781c = f16;
            if (f16 < (-Math.abs((float) r3))) {
                c16859b1.f64781c = -Math.abs(Float.MAX_VALUE);
            } else if (c16859b1.f64781c > Math.abs((float) r3)) {
                c16859b1.f64781c = Math.abs((float) r3);
            }
        } else {
            i15 = i13;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = AbstractC2378g1.m7330e(velocityTracker2, i15);
        } else {
            int i39 = i15;
            if (i39 == 0) {
                yVelocity = velocityTracker2.getXVelocity();
            } else if (i39 == 1) {
                yVelocity = velocityTracker2.getYVelocity();
            } else {
                C16859b0 c16859b2 = (C16859b0) AbstractC16856a0.f64771a.get(velocityTracker2);
                yVelocity = (c16859b2 == null || i39 != 26) ? 0.0f : c16859b2.f64781c;
            }
        }
        float f17 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
        float fSignum = Math.signum(f17);
        if (z4 || (fSignum != Math.signum(c16873g.f64813d) && fSignum != 0.0f)) {
            nestedScrollView.f5307z.abortAnimation();
        }
        if (Math.abs(f17) < iArr[0]) {
            return true;
        }
        int i44 = iArr[1];
        float fMax = Math.max(-i44, Math.min(f17, i44));
        if (fMax == 0.0f) {
            f13 = 0.0f;
        } else {
            nestedScrollView.f5307z.abortAnimation();
            nestedScrollView.m3702n((int) fMax);
            f13 = fMax;
        }
        c16873g.f64813d = f13;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x012d  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action == 2 && this.f5285K) {
            return true;
        }
        int i13 = action & 255;
        if (i13 == 0) {
            int y13 = (int) motionEvent.getY();
            int x3 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y13 < childAt.getTop() - scrollY || y13 >= childAt.getBottom() - scrollY || x3 < childAt.getLeft() || x3 >= childAt.getRight()) {
                    if (!m3694E(motionEvent) && this.f5307z.isFinished()) {
                        z4 = false;
                    }
                    this.f5285K = z4;
                    velocityTracker = this.f5286L;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f5286L = null;
                    }
                } else {
                    this.f5281G = y13;
                    this.f5292R = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f5286L;
                    if (velocityTracker3 == null) {
                        this.f5286L = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f5286L.addMovement(motionEvent);
                    this.f5307z.computeScrollOffset();
                    if (!m3694E(motionEvent) && this.f5307z.isFinished()) {
                        z4 = false;
                    }
                    this.f5285K = z4;
                    m3693D(2, 0);
                }
            } else {
                if (!m3694E(motionEvent)) {
                    z4 = false;
                }
                this.f5285K = z4;
                velocityTracker = this.f5286L;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f5286L = null;
                }
            }
        } else if (i13 == 1) {
            this.f5285K = false;
            this.f5292R = -1;
            velocityTracker2 = this.f5286L;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f5286L = null;
            }
            if (this.f5307z.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m3695F(0);
        } else if (i13 == 2) {
            int i14 = this.f5292R;
            if (i14 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i14);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i14 + " in onInterceptTouchEvent");
                } else {
                    int y14 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y14 - this.f5281G) > this.f5289O && (2 & getNestedScrollAxes()) == 0) {
                        this.f5285K = true;
                        this.f5281G = y14;
                        if (this.f5286L == null) {
                            this.f5286L = VelocityTracker.obtain();
                        }
                        this.f5286L.addMovement(motionEvent);
                        this.f5295U = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i13 == 3) {
            this.f5285K = false;
            this.f5292R = -1;
            velocityTracker2 = this.f5286L;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f5286L = null;
            }
            if (this.f5307z.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m3695F(0);
        } else if (i13 == 6) {
            m3707t(motionEvent);
        }
        return this.f5285K;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        int measuredHeight;
        super.onLayout(z4, i13, i14, i15, i16);
        int i17 = 0;
        this.f5282H = false;
        View view = this.f5284J;
        if (view != null && m3689q(view, this)) {
            View view2 = this.f5284J;
            view2.getDrawingRect(this.f5306y);
            offsetDescendantRectToMyCoords(view2, this.f5306y);
            int iM3697f = m3697f(this.f5306y);
            if (iM3697f != 0) {
                scrollBy(0, iM3697f);
            }
        }
        this.f5284J = null;
        if (!this.f5283I) {
            if (this.f5297W != null) {
                scrollTo(getScrollX(), this.f5297W.f92555w);
                this.f5297W = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i16 - i14) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i17 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i17 != scrollY) {
                scrollTo(getScrollX(), i17);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f5283I = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (this.f5287M && View.MeasureSpec.getMode(i14) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i13, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f13, float f14, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f14, true);
        m3702n((int) f14);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f13, float f14) {
        return dispatchNestedPreFling(f13, f14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i13, int i14, int[] iArr) {
        mo3269d(view, i13, i14, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i13, int i14, int i15, int i16) {
        m3706s(i16, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i13) {
        mo3267b(view, view2, i13, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i13, int i14, boolean z4, boolean z13) {
        super.scrollTo(i13, i14);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i13, Rect rect) {
        if (i13 == 2) {
            i13 = 130;
        } else if (i13 == 1) {
            i13 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i13) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i13);
        if (viewFindNextFocus != null && m3705r(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i13, rect);
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C23344h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C23344h c23344h = (C23344h) parcelable;
        super.onRestoreInstanceState(c23344h.getSuperState());
        this.f5297W = c23344h;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C23344h c23344h = new C23344h(super.onSaveInstanceState());
        c23344h.f92555w = getScrollY();
        return c23344h;
    }

    @Override // android.view.View
    public void onScrollChanged(int i13, int i14, int i15, int i16) {
        super.onScrollChanged(i13, i14, i15, i16);
        InterfaceC23343g interfaceC23343g = this.f5301d0;
        if (interfaceC23343g != null) {
            NestedScrollViewPaginationHelper.scrollChangeListener$lambda$2((NestedScrollViewPaginationHelper) ((C17508p) interfaceC23343g).f67738x, this, i13, i14, i15, i16);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m3705r(viewFindFocus, 0, i16)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f5306y);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f5306y);
        int iM3697f = m3697f(this.f5306y);
        if (iM3697f != 0) {
            if (this.f5288N) {
                m3713z(0, iM3697f);
            } else {
                scrollBy(0, iM3697f);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i13) {
        return mo3274i(view, view2, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mo3268c(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0141  */
    /* JADX WARN: Code duplicated, block: B:59:0x0148  */
    /* JADX WARN: Code duplicated, block: B:60:0x014c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0153  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fM109995e0;
        int iRound;
        int i13;
        ViewParent parent2;
        if (this.f5286L == null) {
            this.f5286L = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5295U = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f13 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f5295U);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f5286L;
                velocityTracker.computeCurrentVelocity(1000, this.f5291Q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f5292R);
                if (Math.abs(yVelocity) >= this.f5290P) {
                    if (AbstractC34870c0.m109982R(this.f5279E) != 0.0f) {
                        if (m3712y(this.f5279E, yVelocity)) {
                            this.f5279E.onAbsorb(yVelocity);
                        } else {
                            m3702n(-yVelocity);
                        }
                    } else if (AbstractC34870c0.m109982R(this.f5280F) != 0.0f) {
                        int i14 = -yVelocity;
                        if (m3712y(this.f5280F, i14)) {
                            this.f5280F.onAbsorb(i14);
                        } else {
                            m3702n(i14);
                        }
                    } else {
                        int i15 = -yVelocity;
                        float f14 = i15;
                        if (!dispatchNestedPreFling(0.0f, f14)) {
                            dispatchNestedFling(0.0f, f14, true);
                            m3702n(i15);
                        }
                    }
                } else if (this.f5307z.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f5292R = -1;
                this.f5285K = false;
                VelocityTracker velocityTracker2 = this.f5286L;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f5286L = null;
                }
                m3695F(0);
                this.f5279E.onRelease();
                this.f5280F.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f5292R);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f5292R + " in onTouchEvent");
                } else {
                    int y13 = (int) motionEvent.getY(iFindPointerIndex);
                    int i16 = this.f5281G - y13;
                    float x3 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i16 / getHeight();
                    if (AbstractC34870c0.m109982R(this.f5279E) != 0.0f) {
                        fM109995e0 = -AbstractC34870c0.m109995e0(this.f5279E, -height, x3);
                        if (AbstractC34870c0.m109982R(this.f5279E) == 0.0f) {
                            this.f5279E.onRelease();
                        }
                    } else if (AbstractC34870c0.m109982R(this.f5280F) != 0.0f) {
                        fM109995e0 = AbstractC34870c0.m109995e0(this.f5280F, height, 1.0f - x3);
                        if (AbstractC34870c0.m109982R(this.f5280F) == 0.0f) {
                            this.f5280F.onRelease();
                        }
                    } else {
                        iRound = Math.round(f13 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i13 = i16 - iRound;
                        if (!this.f5285K && Math.abs(i13) > this.f5289O) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f5285K = true;
                            if (i13 > 0) {
                                i13 -= this.f5289O;
                            } else {
                                i13 += this.f5289O;
                            }
                        }
                        if (this.f5285K) {
                            int iM3711x = m3711x(i13, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f5281G = y13 - iM3711x;
                            this.f5295U += iM3711x;
                        }
                    }
                    f13 = fM109995e0;
                    iRound = Math.round(f13 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i13 = i16 - iRound;
                    if (!this.f5285K) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f5285K = true;
                        if (i13 > 0) {
                            i13 -= this.f5289O;
                        } else {
                            i13 += this.f5289O;
                        }
                    }
                    if (this.f5285K) {
                        int iM3711x2 = m3711x(i13, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f5281G = y13 - iM3711x2;
                        this.f5295U += iM3711x2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f5285K && getChildCount() > 0 && this.f5307z.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f5292R = -1;
                this.f5285K = false;
                VelocityTracker velocityTracker3 = this.f5286L;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f5286L = null;
                }
                m3695F(0);
                this.f5279E.onRelease();
                this.f5280F.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f5281G = (int) motionEvent.getY(actionIndex);
                this.f5292R = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m3707t(motionEvent);
                this.f5281G = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f5292R));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f5285K && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f5307z.isFinished()) {
                this.f5307z.abortAnimation();
                m3695F(1);
            }
            int y14 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f5281G = y14;
            this.f5292R = pointerId;
            m3693D(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f5286L;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public boolean m3704p(int i13) {
        return this.f5299b0.m47592e(i13) != null;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3705r(View view, int i13, int i14) {
        view.getDrawingRect(this.f5306y);
        offsetDescendantRectToMyCoords(view, this.f5306y);
        return this.f5306y.bottom + i13 >= getScrollY() && this.f5306y.top - i13 <= getScrollY() + i14;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f5282H) {
            this.f5284J = view2;
        } else {
            view2.getDrawingRect(this.f5306y);
            offsetDescendantRectToMyCoords(view2, this.f5306y);
            int iM3697f = m3697f(this.f5306y);
            if (iM3697f != 0) {
                scrollBy(0, iM3697f);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM3697f = m3697f(rect);
        boolean z13 = iM3697f != 0;
        if (z13) {
            if (z4) {
                scrollBy(0, iM3697f);
                return z13;
            }
            m3713z(0, iM3697f);
        }
        return z13;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        VelocityTracker velocityTracker;
        if (z4 && (velocityTracker = this.f5286L) != null) {
            velocityTracker.recycle();
            this.f5286L = null;
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f5282H = true;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public final void m3706s(int i13, int i14, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i13);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f5299b0.m47591d(0, scrollY2, 0, i13 - scrollY2, null, i14, iArr);
    }

    @Override // android.view.View
    public void scrollTo(int i13, int i14) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i13 < 0) {
                i13 = 0;
            } else if (width + i13 > width2) {
                i13 = width2 - width;
            }
            if (height >= height2 || i14 < 0) {
                i14 = 0;
            } else if (height + i14 > height2) {
                i14 = height2 - height;
            }
            if (i13 == getScrollX() && i14 == getScrollY()) {
                return;
            }
            super.scrollTo(i13, i14);
        }
    }

    public void setFillViewport(boolean z4) {
        if (z4 != this.f5287M) {
            this.f5287M = z4;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        C16903q c16903q = this.f5299b0;
        if (c16903q.f64860d) {
            ViewGroup viewGroup = c16903q.f64859c;
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            AbstractC16877h0.m47519n(viewGroup);
        }
        c16903q.f64860d = z4;
    }

    public void setOnScrollChangeListener(InterfaceC23343g interfaceC23343g) {
        this.f5301d0 = interfaceC23343g;
    }

    public void setSmoothScrollingEnabled(boolean z4) {
        this.f5288N = z4;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i13) {
        return m3693D(i13, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        m3695F(0);
    }

    /* JADX INFO: renamed from: t */
    public final void m3707t(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5292R) {
            int i13 = actionIndex == 0 ? 1 : 0;
            this.f5281G = (int) motionEvent.getY(i13);
            this.f5292R = motionEvent.getPointerId(i13);
            VelocityTracker velocityTracker = this.f5286L;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m3708u(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, boolean z4) {
        boolean z13;
        boolean z14;
        int i25;
        int overScrollMode = getOverScrollMode();
        boolean z15 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z16 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z17 = overScrollMode == 0 || (overScrollMode == 1 && z15);
        boolean z18 = overScrollMode == 0 || (overScrollMode == 1 && z16);
        int i26 = i15 + i13;
        int i27 = !z17 ? 0 : i19;
        int i28 = i16 + i14;
        int i29 = !z18 ? 0 : i24;
        int i34 = -i27;
        int i35 = i27 + i17;
        int i36 = -i29;
        int i37 = i29 + i18;
        if (i26 > i35) {
            i26 = i35;
            z13 = true;
        } else if (i26 < i34) {
            z13 = true;
            i26 = i34;
        } else {
            z13 = false;
        }
        if (i28 > i37) {
            i28 = i37;
            z14 = true;
        } else if (i28 < i36) {
            z14 = true;
            i28 = i36;
        } else {
            z14 = false;
        }
        if (!z14 || m3704p(1)) {
            i25 = i26;
        } else {
            int i38 = i26;
            this.f5307z.springBack(i38, i28, 0, 0, 0, getScrollRange());
            i25 = i38;
        }
        onOverScrolled(i25, i28, z13, z14);
        return z13 || z14;
    }

    /* JADX INFO: renamed from: v */
    public boolean m3709v(int i13) {
        boolean z4 = i13 == 130;
        int height = getHeight();
        if (z4) {
            this.f5306y.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                Rect rect = this.f5306y;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            this.f5306y.top = getScrollY() - height;
            Rect rect2 = this.f5306y;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f5306y;
        int i14 = rect3.top;
        int i15 = height + i14;
        rect3.bottom = i15;
        return m3710w(i13, i14, i15);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX INFO: renamed from: w */
    public final boolean m3710w(int i13, int i14, int i15) {
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i16 = height + scrollY;
        boolean z13 = i13 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z14 = false;
        for (int i17 = 0; i17 < size; i17++) {
            View view2 = focusables.get(i17);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i14 < bottom && top < i15) {
                boolean z15 = i14 < top && bottom < i15;
                if (view == null) {
                    view = view2;
                    z14 = z15;
                } else {
                    boolean z16 = (z13 && top < view.getTop()) || (!z13 && bottom > view.getBottom());
                    if (z14) {
                        if (z15 && z16) {
                            view = view2;
                        }
                    } else if (z15) {
                        view = view2;
                        z14 = true;
                    } else if (z16) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i14 < scrollY || i15 > i16) {
            m3711x(z13 ? i14 - scrollY : i15 - i16, 0, 1, true);
            z4 = true;
        } else {
            z4 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i13);
        }
        return z4;
    }

    /* JADX INFO: renamed from: x */
    public final int m3711x(int i13, int i14, int i15, boolean z4) {
        int i16;
        int i17;
        VelocityTracker velocityTracker;
        if (i15 == 1) {
            m3693D(2, i15);
        }
        boolean z13 = false;
        if (m3699k(0, i13, this.f5294T, this.f5293S, i15)) {
            int i18 = i13 - this.f5294T[1];
            i17 = this.f5293S[1];
            i16 = i18;
        } else {
            i16 = i13;
            i17 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z14 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z4;
        int i19 = i16;
        boolean z15 = m3708u(0, i16, 0, scrollY, 0, scrollRange, 0, 0, true) && !m3704p(i15);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f5294T;
        iArr[1] = 0;
        m3700l(0, scrollY2, 0, i19 - scrollY2, this.f5293S, i15, iArr);
        int i24 = i17 + this.f5293S[1];
        int i25 = i19 - this.f5294T[1];
        int i26 = scrollY + i25;
        if (i26 < 0) {
            if (z14) {
                AbstractC34870c0.m109995e0(this.f5279E, (-i25) / getHeight(), i14 / getWidth());
                if (!this.f5280F.isFinished()) {
                    this.f5280F.onRelease();
                }
            }
        } else if (i26 > scrollRange && z14) {
            AbstractC34870c0.m109995e0(this.f5280F, i25 / getHeight(), 1.0f - (i14 / getWidth()));
            if (!this.f5279E.isFinished()) {
                this.f5279E.onRelease();
            }
        }
        if (this.f5279E.isFinished() && this.f5280F.isFinished()) {
            z13 = z15;
        } else {
            postInvalidateOnAnimation();
        }
        if (z13 && i15 == 0 && (velocityTracker = this.f5286L) != null) {
            velocityTracker.clear();
        }
        if (i15 == 1) {
            m3695F(i15);
            this.f5279E.onRelease();
            this.f5280F.onRelease();
        }
        return i24;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m3712y(EdgeEffect edgeEffect, int i13) {
        if (i13 > 0) {
            return true;
        }
        float fM109982R = AbstractC34870c0.m109982R(edgeEffect) * getHeight();
        double dLog = Math.log((Math.abs(-i13) * 0.35f) / (this.f5304w * 0.015f));
        double d3 = f5276g0;
        return ((float) (Math.exp((d3 / (d3 - 1.0d)) * dLog) * ((double) (this.f5304w * 0.015f)))) < fM109982R;
    }

    /* JADX INFO: renamed from: z */
    public final void m3713z(int i13, int i14) {
        m3690A(i13, i14, AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, false);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f5306y = new Rect();
        this.f5282H = true;
        this.f5283I = false;
        this.f5284J = null;
        this.f5285K = false;
        this.f5288N = true;
        this.f5292R = -1;
        this.f5293S = new int[2];
        this.f5294T = new int[2];
        C23342f c23342f = new C23342f(this);
        this.f5302e0 = c23342f;
        this.f5303f0 = new C16873g(getContext(), c23342f);
        int i14 = Build.VERSION.SDK_INT;
        this.f5279E = i14 >= 31 ? AbstractC23339c.m67570a(context, attributeSet) : new EdgeEffect(context);
        this.f5280F = i14 >= 31 ? AbstractC23339c.m67570a(context, attributeSet) : new EdgeEffect(context);
        this.f5304w = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f5307z = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f5289O = viewConfiguration.getScaledTouchSlop();
        this.f5290P = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5291Q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5278i0, i13, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f5298a0 = new C16912t();
        this.f5299b0 = new C16903q(this);
        setNestedScrollingEnabled(true);
        AbstractC16901p0.m47583n(this, f5277h0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13) {
        if (getChildCount() <= 0) {
            super.addView(view, i13);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i13, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i13, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
