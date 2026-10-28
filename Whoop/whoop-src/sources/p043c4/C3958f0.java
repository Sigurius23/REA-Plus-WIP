package p043c4;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1613o1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuBaseService;
import p021av.C2088b;
import p027b3.AbstractC2346a;
import p390p1.AbstractC28667t;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28633k1;
import p390p1.C28655q;
import p390p1.C28677v1;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39147y;
import p636y3.C39179k;
import p636y3.C39180l;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p668z1.C39973v;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22667f0;
import vd1.C35909c;

/* JADX INFO: renamed from: c4.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3958f0 extends AbstractC2346a {

    /* JADX INFO: renamed from: J */
    public InterfaceC4339a f16127J;

    /* JADX INFO: renamed from: K */
    public C3966j0 f16128K;

    /* JADX INFO: renamed from: L */
    public String f16129L;

    /* JADX INFO: renamed from: M */
    public final View f16130M;

    /* JADX INFO: renamed from: N */
    public final C3962h0 f16131N;

    /* JADX INFO: renamed from: O */
    public final WindowManager f16132O;

    /* JADX INFO: renamed from: P */
    public final WindowManager.LayoutParams f16133P;

    /* JADX INFO: renamed from: Q */
    public InterfaceC3964i0 f16134Q;

    /* JADX INFO: renamed from: R */
    public EnumC39181m f16135R;

    /* JADX INFO: renamed from: S */
    public final C28633k1 f16136S;

    /* JADX INFO: renamed from: T */
    public final C28633k1 f16137T;

    /* JADX INFO: renamed from: U */
    public C39179k f16138U;

    /* JADX INFO: renamed from: V */
    public final C28612f0 f16139V;

    /* JADX INFO: renamed from: W */
    public final Rect f16140W;

    /* JADX INFO: renamed from: a0 */
    public final C39973v f16141a0;

    /* JADX INFO: renamed from: b0 */
    public C3978u f16142b0;

    /* JADX INFO: renamed from: c0 */
    public final C28633k1 f16143c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f16144d0;

    /* JADX INFO: renamed from: e0 */
    public final int[] f16145e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3958f0(InterfaceC4339a interfaceC4339a, C3966j0 c3966j0, String str, View view, InterfaceC39171c interfaceC39171c, InterfaceC3964i0 interfaceC3964i0, UUID uuid) {
        super(view.getContext());
        C3962h0 c3960g0 = Build.VERSION.SDK_INT >= 29 ? new C3960g0() : new C3962h0();
        this.f16127J = interfaceC4339a;
        this.f16128K = c3966j0;
        this.f16129L = str;
        this.f16130M = view;
        this.f16131N = c3960g0;
        Object systemService = view.getContext().getSystemService("window");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f16132O = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        C3966j0 c3966j1 = this.f16128K;
        boolean zM12006c = AbstractC3975r.m12006c(view);
        boolean z4 = c3966j1.f16163b;
        int i13 = c3966j1.f16162a;
        if (z4 && zM12006c) {
            i13 |= DfuBaseService.ERROR_REMOTE_MASK;
        } else if (z4 && !zM12006c) {
            i13 &= -8193;
        }
        layoutParams.flags = i13;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f16133P = layoutParams;
        this.f16134Q = interfaceC3964i0;
        this.f16135R = EnumC39181m.f168423w;
        this.f16136S = AbstractC28683x.m87272z(null);
        this.f16137T = AbstractC28683x.m87272z(null);
        this.f16139V = AbstractC28683x.m87264r(new C2088b(this, 5));
        this.f16140W = new Rect();
        this.f16141a0 = new C39973v(new C3971n(this, 2));
        setId(android.R.id.content);
        AbstractC1613o1.m5024n(this, AbstractC1613o1.m5017g(view));
        AbstractC1613o1.m5025o(this, AbstractC1613o1.m5018h(view));
        AbstractC34132o.m107862G(this, AbstractC34132o.m107891t(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(interfaceC39171c.mo743q0((float) 8));
        setOutlineProvider(new C3952c0(1));
        this.f16143c0 = AbstractC28683x.m87272z(AbstractC3982y.f16205a);
        this.f16145e0 = new int[2];
    }

    private final InterfaceC4351m getContent() {
        return (InterfaceC4351m) this.f16143c0.getValue();
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC39147y getParentLayoutCoordinates() {
        return (InterfaceC39147y) this.f16137T.getValue();
    }

    private final C39179k getVisibleDisplayBounds() {
        this.f16131N.getClass();
        View view = this.f16130M;
        Rect rect = this.f16140W;
        view.getWindowVisibleDisplayFrame(rect);
        return new C39179k(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(InterfaceC4351m interfaceC4351m) {
        this.f16143c0.setValue(interfaceC4351m);
    }

    private final void setParentLayoutCoordinates(InterfaceC39147y interfaceC39147y) {
        this.f16137T.setValue(interfaceC39147y);
    }

    @Override // p027b3.AbstractC2346a
    /* JADX INFO: renamed from: a */
    public final void mo3598a(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-857613600);
        int i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            getContent().invoke(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3955e(this, i13, 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f16128K.f16164c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                InterfaceC4339a interfaceC4339a = this.f16127J;
                if (interfaceC4339a != null) {
                    interfaceC4339a.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p027b3.AbstractC2346a
    /* JADX INFO: renamed from: f */
    public final void mo7237f(boolean z4, int i13, int i14, int i15, int i16) {
        super.mo7237f(z4, i13, i14, i15, i16);
        this.f16128K.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f16133P;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f16131N.getClass();
        this.f16132O.updateViewLayout(this, layoutParams);
    }

    @Override // p027b3.AbstractC2346a
    /* JADX INFO: renamed from: g */
    public final void mo7238g(int i13, int i14) {
        this.f16128K.getClass();
        C39179k visibleDisplayBounds = getVisibleDisplayBounds();
        super.mo7238g(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.m124798c(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.m124796a(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f16139V.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f16133P;
    }

    public final EnumC39181m getParentLayoutDirection() {
        return this.f16135R;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final C39180l m134049getPopupContentSizebOM6tXw() {
        return (C39180l) this.f16136S.getValue();
    }

    public final InterfaceC3964i0 getPositionProvider() {
        return this.f16134Q;
    }

    @Override // p027b3.AbstractC2346a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f16144d0;
    }

    public AbstractC2346a getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f16129L;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m11998j(AbstractC28667t abstractC28667t, InterfaceC4351m interfaceC4351m) {
        setParentCompositionContext(abstractC28667t);
        setContent(interfaceC4351m);
        this.f16144d0 = true;
    }

    /* JADX INFO: renamed from: k */
    public final void m11999k(InterfaceC4339a interfaceC4339a, C3966j0 c3966j0, String str, EnumC39181m enumC39181m) {
        int i13;
        this.f16127J = interfaceC4339a;
        this.f16129L = str;
        if (!AbstractC22676k.m65745e(this.f16128K, c3966j0)) {
            c3966j0.getClass();
            this.f16128K = c3966j0;
            boolean zM12006c = AbstractC3975r.m12006c(this.f16130M);
            boolean z4 = c3966j0.f16163b;
            int i14 = c3966j0.f16162a;
            if (z4 && zM12006c) {
                i14 |= DfuBaseService.ERROR_REMOTE_MASK;
            } else if (z4 && !zM12006c) {
                i14 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f16133P;
            layoutParams.flags = i14;
            this.f16131N.getClass();
            this.f16132O.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = enumC39181m.ordinal();
        if (iOrdinal != 0) {
            i13 = 1;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i13 = 0;
        }
        super.setLayoutDirection(i13);
    }

    /* JADX INFO: renamed from: l */
    public final void m12000l() {
        InterfaceC39147y parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.mo3532g()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jMo3541n = parentLayoutCoordinates.mo3541n();
            long jMo3510E = parentLayoutCoordinates.mo3510E(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jMo3510E >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jMo3510E & 4294967295L)))) & 4294967295L);
            int i13 = (int) (jRound >> 32);
            int i14 = (int) (jRound & 4294967295L);
            C39179k c39179k = new C39179k(i13, i14, ((int) (jMo3541n >> 32)) + i13, ((int) (jMo3541n & 4294967295L)) + i14);
            if (c39179k.equals(this.f16138U)) {
                return;
            }
            this.f16138U = c39179k;
            m12002n();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m12001m(InterfaceC39147y interfaceC39147y) {
        setParentLayoutCoordinates(interfaceC39147y);
        m12000l();
    }

    /* JADX INFO: renamed from: n */
    public final void m12002n() {
        C39180l c39180lM134049getPopupContentSizebOM6tXw;
        C39179k c39179k = this.f16138U;
        if (c39179k == null || (c39180lM134049getPopupContentSizebOM6tXw = m134049getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j7 = c39180lM134049getPopupContentSizebOM6tXw.f168422a;
        C39179k visibleDisplayBounds = getVisibleDisplayBounds();
        long jM124796a = (((long) visibleDisplayBounds.m124796a()) & 4294967295L) | (((long) visibleDisplayBounds.m124798c()) << 32);
        C22667f0 c22667f0 = new C22667f0();
        c22667f0.f89335w = 0L;
        this.f16141a0.m128204d(new C3956e0(c22667f0, this, c39179k, jM124796a, j7), C3953d.f16106G, this);
        long j13 = c22667f0.f89335w;
        WindowManager.LayoutParams layoutParams = this.f16133P;
        layoutParams.x = (int) (j13 >> 32);
        layoutParams.y = (int) (j13 & 4294967295L);
        boolean z4 = this.f16128K.f16166e;
        C3962h0 c3962h0 = this.f16131N;
        if (z4) {
            c3962h0.mo12003a(this, (int) (jM124796a >> 32), (int) (jM124796a & 4294967295L));
        }
        c3962h0.getClass();
        this.f16132O.updateViewLayout(this, layoutParams);
    }

    @Override // p027b3.AbstractC2346a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16141a0.m128205e();
        if (!this.f16128K.f16164c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f16142b0 == null) {
            this.f16142b0 = new C3978u(this.f16127J, 0);
        }
        AbstractC3979v.m12017h(this, this.f16142b0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C39973v c39973v = this.f16141a0;
        C35909c c35909c = c39973v.f172501h;
        if (c35909c != null) {
            c35909c.m114042a();
        }
        c39973v.m128201a();
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC3979v.m12018i(this, this.f16142b0);
        }
        this.f16142b0 = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f16128K.f16165d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            InterfaceC4339a interfaceC4339a = this.f16127J;
            if (interfaceC4339a != null) {
                interfaceC4339a.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        InterfaceC4339a interfaceC4339a2 = this.f16127J;
        if (interfaceC4339a2 != null) {
            interfaceC4339a2.invoke();
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i13) {
    }

    public final void setParentLayoutDirection(EnumC39181m enumC39181m) {
        this.f16135R = enumC39181m;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m134050setPopupContentSizefhxjrPA(C39180l c39180l) {
        this.f16136S.setValue(c39180l);
    }

    public final void setPositionProvider(InterfaceC3964i0 interfaceC3964i0) {
        this.f16134Q = interfaceC3964i0;
    }

    public final void setTestTag(String str) {
        this.f16129L = str;
    }
}
