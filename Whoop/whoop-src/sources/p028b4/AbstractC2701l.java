package p028b4;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.input.nestedscroll.AbstractC1129a;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.node.C1134a;
import androidx.compose.p018ui.node.Owner;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import com.whoop.android.R;
import e93.AbstractC12889b;
import java.util.LinkedHashMap;
import p002a0.C0006a1;
import p005a3.AbstractC0201g;
import p005a3.C0188c2;
import p005a3.C0230n0;
import p005a3.InterfaceC0184b2;
import p026b2.C2314t;
import p026b2.C2320z;
import p027b3.AbstractC2445t3;
import p097ds.AbstractC12314q;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16899o1;
import p184h5.C16905q1;
import p184h5.C16912t;
import p184h5.InterfaceC16909s;
import p184h5.InterfaceC16915u;
import p209i3.AbstractC18032n;
import p390p1.C28647o;
import p390p1.InterfaceC28623i;
import p399pb.InterfaceC29049f;
import p479s4.AbstractC32128i;
import p492t2.C33316d;
import p492t2.C33319g;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34454d0;
import p543v4.C35643b;
import p549vb.AbstractC35862g;
import p557vo.AbstractC36220b;
import p603x2.AbstractC37831a;
import p635y2.AbstractC39125q1;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: b4.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2701l extends ViewGroup implements InterfaceC16909s, InterfaceC28623i, InterfaceC0184b2, InterfaceC16915u {

    /* JADX INFO: renamed from: E */
    public boolean f10621E;

    /* JADX INFO: renamed from: F */
    public InterfaceC4339a f10622F;

    /* JADX INFO: renamed from: G */
    public InterfaceC4339a f10623G;

    /* JADX INFO: renamed from: H */
    public Modifier f10624H;

    /* JADX INFO: renamed from: I */
    public Function1 f10625I;

    /* JADX INFO: renamed from: J */
    public InterfaceC39171c f10626J;

    /* JADX INFO: renamed from: K */
    public Function1 f10627K;

    /* JADX INFO: renamed from: L */
    public InterfaceC1585g0 f10628L;

    /* JADX INFO: renamed from: M */
    public InterfaceC29049f f10629M;

    /* JADX INFO: renamed from: N */
    public final int[] f10630N;

    /* JADX INFO: renamed from: O */
    public long f10631O;

    /* JADX INFO: renamed from: P */
    public C16905q1 f10632P;

    /* JADX INFO: renamed from: Q */
    public final C2700k f10633Q;

    /* JADX INFO: renamed from: R */
    public final C2700k f10634R;

    /* JADX INFO: renamed from: S */
    public Function1 f10635S;

    /* JADX INFO: renamed from: T */
    public final int[] f10636T;

    /* JADX INFO: renamed from: U */
    public int f10637U;

    /* JADX INFO: renamed from: V */
    public int f10638V;

    /* JADX INFO: renamed from: W */
    public final C16912t f10639W;

    /* JADX INFO: renamed from: a0 */
    public boolean f10640a0;

    /* JADX INFO: renamed from: b0 */
    public final C0230n0 f10641b0;

    /* JADX INFO: renamed from: w */
    public final C33316d f10642w;

    /* JADX INFO: renamed from: x */
    public final View f10643x;

    /* JADX INFO: renamed from: y */
    public final Owner f10644y;

    /* JADX INFO: renamed from: z */
    public InterfaceC4339a f10645z;

    public AbstractC2701l(Context context, C28647o c28647o, int i13, C33316d c33316d, View view, Owner owner) {
        super(context);
        this.f10642w = c33316d;
        this.f10643x = view;
        this.f10644y = owner;
        LinkedHashMap linkedHashMap = AbstractC2445t3.f9550a;
        setTag(R.id.androidx_compose_ui_view_composition_context, c28647o);
        int i14 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        AbstractC16901p0.m47586q(this, new C2691b(this, i14));
        AbstractC16877h0.m47517l(this, this);
        this.f10645z = C2699j.f10617z;
        this.f10622F = C2699j.f10616y;
        this.f10623G = C2699j.f10615x;
        C2314t c2314t = C2314t.f9131w;
        this.f10624H = c2314t;
        this.f10626J = AbstractC35862g.m113838a();
        this.f10630N = new int[2];
        this.f10631O = 0L;
        this.f10633Q = new C2700k(this, 1);
        this.f10634R = new C2700k(this, i14);
        this.f10636T = new int[2];
        this.f10637U = Integer.MIN_VALUE;
        this.f10638V = Integer.MIN_VALUE;
        this.f10639W = new C16912t();
        C0230n0 c0230n0 = new C0230n0(3);
        c0230n0.f766N = this;
        Modifier modifierM3500d = AbstractC1131a.m3500d(AbstractC1125a.m3478a(AbstractC34454d0.m108919j(AbstractC18032n.m51775c(AbstractC1129a.m3495a(c2314t, AbstractC2703n.f10646a, c33316d), true, C2692c.f10594z), this), new C2696g(this, c0230n0, this)), new C2693d(this, c0230n0, 2));
        c0230n0.m586E0(this.f10624H.mo3471e(modifierM3500d));
        this.f10625I = new C2320z(5, c0230n0, modifierM3500d);
        c0230n0.m578A0(this.f10626J);
        this.f10627K = new C0006a1(c0230n0, 11);
        c0230n0.f789k0 = new C2693d(this, c0230n0, i14);
        c0230n0.f790l0 = new C2694e(this, i14);
        c0230n0.m584D0(new C2695f(this, c0230n0));
        this.f10641b0 = c0230n0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0188c2 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            AbstractC37831a.m121374b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f10644y.getSnapshotObserver();
    }

    /* JADX INFO: renamed from: k */
    public static final int m7579k(AbstractC2701l abstractC2701l, int i13, int i14, int i15) {
        if (i15 >= 0 || i13 == i14) {
            return View.MeasureSpec.makeMeasureSpec(AbstractC12889b.m36284n(i15, i13, i14), 1073741824);
        }
        if (i15 != -2 || i14 == Integer.MAX_VALUE) {
            return (i15 != -1 || i14 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: l */
    public static C35643b m7580l(C35643b c35643b, int i13, int i14, int i15, int i16) {
        int i17 = c35643b.f151449a - i13;
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = c35643b.f151450b - i14;
        if (i18 < 0) {
            i18 = 0;
        }
        int i19 = c35643b.f151451c - i15;
        if (i19 < 0) {
            i19 = 0;
        }
        int i24 = c35643b.f151452d - i16;
        return C35643b.m112840b(i17, i18, i19, i24 >= 0 ? i24 : 0);
    }

    @Override // p005a3.InterfaceC0184b2
    /* JADX INFO: renamed from: U */
    public final boolean mo432U() {
        return isAttachedToWindow();
    }

    @Override // p390p1.InterfaceC28623i
    /* JADX INFO: renamed from: a */
    public final void mo608a() {
        this.f10622F.invoke();
        removeAllViewsInLayout();
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: b */
    public final void mo3267b(View view, View view2, int i13, int i14) {
        this.f10639W.m47605b(i13, i14);
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: c */
    public final void mo3268c(View view, int i13) {
        this.f10639W.m47606c(i13);
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: d */
    public final void mo3269d(View view, int i13, int i14, int[] iArr, int i15) {
        if (this.f10643x.isNestedScrollingEnabled()) {
            float fM7588g = AbstractC2703n.m7588g(i13);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC2703n.m7588g(i14))) & 4294967295L) | (((long) Float.floatToRawIntBits(fM7588g)) << 32);
            int iM7590i = AbstractC2703n.m7590i(i15);
            C33319g c33319g = this.f10642w.f138977a;
            C33319g c33319g2 = null;
            if (c33319g != null && c33319g.f9141N) {
                c33319g2 = (C33319g) AbstractC0201g.m507g(c33319g);
            }
            long jMo29341l0 = c33319g2 != null ? c33319g2.mo29341l0(jFloatToRawIntBits, iM7590i) : 0L;
            iArr[0] = AbstractC12314q.m34338r(Float.intBitsToFloat((int) (jMo29341l0 >> 32)));
            iArr[1] = AbstractC12314q.m34338r(Float.intBitsToFloat((int) (jMo29341l0 & 4294967295L)));
        }
    }

    @Override // p390p1.InterfaceC28623i
    /* JADX INFO: renamed from: e */
    public final void mo615e() {
        View view = this.f10643x;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f10622F.invoke();
        }
    }

    @Override // p390p1.InterfaceC28623i
    /* JADX INFO: renamed from: f */
    public final void mo617f() {
        this.f10623G.invoke();
    }

    @Override // p184h5.InterfaceC16909s
    /* JADX INFO: renamed from: g */
    public final void mo3272g(View view, int i13, int i14, int i15, int i16, int i17, int[] iArr) {
        if (this.f10643x.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC2703n.m7588g(i13))) << 32) | (((long) Float.floatToRawIntBits(AbstractC2703n.m7588g(i14))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(AbstractC2703n.m7588g(i15))) << 32) | (((long) Float.floatToRawIntBits(AbstractC2703n.m7588g(i16))) & 4294967295L);
            int iM7590i = AbstractC2703n.m7590i(i17);
            C33319g c33319g = this.f10642w.f138977a;
            C33319g c33319g2 = null;
            if (c33319g != null && c33319g.f9141N) {
                c33319g2 = (C33319g) AbstractC0201g.m507g(c33319g);
            }
            C33319g c33319g3 = c33319g2;
            long jMo9761J = c33319g3 != null ? c33319g3.mo9761J(jFloatToRawIntBits, jFloatToRawIntBits2, iM7590i) : 0L;
            iArr[0] = AbstractC12314q.m34338r(Float.intBitsToFloat((int) (jMo9761J >> 32)));
            iArr[1] = AbstractC12314q.m34338r(Float.intBitsToFloat((int) (jMo9761J & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f10636T;
        getLocationInWindow(iArr);
        int i13 = iArr[0];
        region.op(i13, iArr[1], getWidth() + i13, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final InterfaceC39171c getDensity() {
        return this.f10626J;
    }

    public final View getInteropView() {
        return this.f10643x;
    }

    public final C0230n0 getLayoutNode() {
        return this.f10641b0;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f10643x.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC1585g0 getLifecycleOwner() {
        return this.f10628L;
    }

    public final Modifier getModifier() {
        return this.f10624H;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f10639W.m47604a();
    }

    public final Function1 getOnDensityChanged$ui_release() {
        return this.f10627K;
    }

    public final Function1 getOnModifierChanged$ui_release() {
        return this.f10625I;
    }

    public final Function1 getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f10635S;
    }

    public final InterfaceC4339a getRelease() {
        return this.f10623G;
    }

    public final InterfaceC4339a getReset() {
        return this.f10622F;
    }

    public final InterfaceC29049f getSavedStateRegistryOwner() {
        return this.f10629M;
    }

    public final InterfaceC4339a getUpdate() {
        return this.f10645z;
    }

    public final View getView() {
        return this.f10643x;
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: h */
    public final void mo3273h(View view, int i13, int i14, int i15, int i16, int i17) {
        if (this.f10643x.isNestedScrollingEnabled()) {
            float fM7588g = AbstractC2703n.m7588g(i13);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC2703n.m7588g(i14))) & 4294967295L) | (Float.floatToRawIntBits(fM7588g) << 32);
            float fM7588g2 = AbstractC2703n.m7588g(i15);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(AbstractC2703n.m7588g(i16))) & 4294967295L) | (Float.floatToRawIntBits(fM7588g2) << 32);
            int iM7590i = AbstractC2703n.m7590i(i17);
            C33319g c33319g = this.f10642w.f138977a;
            C33319g c33319g2 = null;
            if (c33319g != null && c33319g.f9141N) {
                c33319g2 = (C33319g) AbstractC0201g.m507g(c33319g);
            }
            if (c33319g2 != null) {
                c33319g2.mo9761J(jFloatToRawIntBits, jFloatToRawIntBits2, iM7590i);
            }
        }
    }

    @Override // p184h5.InterfaceC16906r
    /* JADX INFO: renamed from: i */
    public final boolean mo3274i(View view, View view2, int i13, int i14) {
        return ((i13 & 2) == 0 && (i13 & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f10640a0) {
            this.f10641b0.m598P();
            return null;
        }
        this.f10643x.postOnAnimation(new RunnableC2690a(this.f10634R, 0));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f10643x.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: m */
    public final C16905q1 m7581m(C16905q1 c16905q1) {
        C16899o1 c16899o1 = c16905q1.f64864a;
        C35643b c35643bMo47530g = c16899o1.mo47530g(-1);
        C35643b c35643b = C35643b.f151448e;
        if (!c35643bMo47530g.equals(c35643b) || !c16899o1.mo47531h(-9).equals(c35643b) || c16899o1.mo47550f() != null) {
            C1134a c1134a = (C1134a) this.f10641b0.f783e0.f740d;
            if (c1134a.f4881p0.f9141N) {
                long jM115291C = AbstractC36220b.m115291C(c1134a.mo3523Z(0L));
                int i13 = (int) (jM115291C >> 32);
                if (i13 < 0) {
                    i13 = 0;
                }
                int i14 = (int) (jM115291C & 4294967295L);
                if (i14 < 0) {
                    i14 = 0;
                }
                long jMo3541n = AbstractC39125q1.m124662h(c1134a).mo3541n();
                int i15 = (int) (jMo3541n >> 32);
                int i16 = (int) (jMo3541n & 4294967295L);
                long j7 = c1134a.f168213y;
                long jM115291C2 = AbstractC36220b.m115291C(c1134a.mo3523Z((((long) Float.floatToRawIntBits((int) (j7 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j7 & 4294967295L))) & 4294967295L)));
                int i17 = i15 - ((int) (jM115291C2 >> 32));
                if (i17 < 0) {
                    i17 = 0;
                }
                int i18 = i16 - ((int) (4294967295L & jM115291C2));
                int i19 = i18 >= 0 ? i18 : 0;
                if (i13 != 0 || i14 != 0 || i17 != 0 || i19 != 0) {
                    return c16905q1.f64864a.mo47533n(i13, i14, i17, i19);
                }
            }
        }
        return c16905q1;
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public final C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        this.f10632P = new C16905q1(c16905q1);
        return m7581m(c16905q1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10633Q.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f10640a0) {
            this.f10641b0.m598P();
        } else {
            this.f10643x.postOnAnimation(new RunnableC2690a(this.f10634R, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f608a.m128202b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        this.f10643x.layout(0, 0, i15 - i13, i16 - i14);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        View view = this.f10643x;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i13), View.MeasureSpec.getSize(i14));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i13, i14);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f10637U = i13;
        this.f10638V = i14;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f13, float f14, boolean z4) {
        if (!this.f10643x.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC3006f0.m8732z(this.f10642w.m105692c(), null, null, new C2697h(z4, this, AbstractC32128i.m100047a(AbstractC2703n.m7589h(f13), AbstractC2703n.m7589h(f14)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f13, float f14) {
        if (!this.f10643x.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC3006f0.m8732z(this.f10642w.m105692c(), null, null, new C2698i(this, AbstractC32128i.m100047a(AbstractC2703n.m7589h(f13), AbstractC2703n.m7589h(f14)), (InterfaceC30057d) null, 0), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i13) {
        super.onWindowVisibilityChanged(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        Function1 function1 = this.f10635S;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z4));
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    public final void setDensity(InterfaceC39171c interfaceC39171c) {
        if (interfaceC39171c != this.f10626J) {
            this.f10626J = interfaceC39171c;
            Function1 function1 = this.f10627K;
            if (function1 != null) {
                function1.invoke(interfaceC39171c);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        if (interfaceC1585g0 != this.f10628L) {
            this.f10628L = interfaceC1585g0;
            AbstractC1613o1.m5024n(this, interfaceC1585g0);
        }
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.f10624H) {
            this.f10624H = modifier;
            Function1 function1 = this.f10625I;
            if (function1 != null) {
                function1.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1 function1) {
        this.f10627K = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1 function1) {
        this.f10625I = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1 function1) {
        this.f10635S = function1;
    }

    public final void setRelease(InterfaceC4339a interfaceC4339a) {
        this.f10623G = interfaceC4339a;
    }

    public final void setReset(InterfaceC4339a interfaceC4339a) {
        this.f10622F = interfaceC4339a;
    }

    public final void setSavedStateRegistryOwner(InterfaceC29049f interfaceC29049f) {
        if (interfaceC29049f != this.f10629M) {
            this.f10629M = interfaceC29049f;
            AbstractC34132o.m107862G(this, interfaceC29049f);
        }
    }

    public final void setUpdate(InterfaceC4339a interfaceC4339a) {
        this.f10645z = interfaceC4339a;
        this.f10621E = true;
        this.f10633Q.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
