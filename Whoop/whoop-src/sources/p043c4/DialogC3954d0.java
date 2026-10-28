package p043c4;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.AbstractC1613o1;
import c93.InterfaceC4339a;
import com.whoop.android.R;
import e93.AbstractC12889b;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import p161g.DialogC14910m;
import p505ts.AbstractC34132o;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: c4.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class DialogC3954d0 extends DialogC14910m {

    /* JADX INFO: renamed from: E */
    public C3948a0 f16111E;

    /* JADX INFO: renamed from: F */
    public final View f16112F;

    /* JADX INFO: renamed from: G */
    public final C3983z f16113G;

    /* JADX INFO: renamed from: H */
    public boolean f16114H;

    /* JADX INFO: renamed from: z */
    public InterfaceC4339a f16115z;

    public DialogC3954d0(InterfaceC4339a interfaceC4339a, C3948a0 c3948a0, View view, EnumC39181m enumC39181m, InterfaceC39171c interfaceC39171c, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), c3948a0.f16094e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f16115z = interfaceC4339a;
        this.f16111E = c3948a0;
        this.f16112F = view;
        float f13 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        AbstractC29125c.m88513V(window, this.f16111E.f16094e);
        window.setGravity(17);
        if (!this.f16111E.f16094e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i13 = Build.VERSION.SDK_INT;
            C3976s.f16197a.m12007a(attributes);
            if (i13 >= 30) {
                C3977t c3977t = C3977t.f16198a;
                c3977t.m12008a(attributes, 0);
                c3977t.m12009b(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        C3983z c3983z = new C3983z(getContext(), window);
        setTitle(this.f16111E.f16095f);
        c3983z.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c3983z.setClipChildren(false);
        c3983z.setElevation(interfaceC39171c.mo743q0(f13));
        c3983z.setOutlineProvider(new C3952c0(0));
        this.f16113G = c3983z;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            m11995c(viewGroup);
        }
        setContentView(c3983z);
        AbstractC1613o1.m5024n(c3983z, AbstractC1613o1.m5017g(view));
        AbstractC1613o1.m5025o(c3983z, AbstractC1613o1.m5018h(view));
        AbstractC34132o.m107862G(c3983z, AbstractC34132o.m107891t(view));
        m11996d(this.f16115z, this.f16111E, enumC39181m);
        C27648a.m83591n(getOnBackPressedDispatcher(), this, new C3949b(this, 1), 2);
    }

    /* JADX INFO: renamed from: c */
    public static final void m11995c(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C3983z) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                m11995c(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    /* JADX INFO: renamed from: d */
    public final void m11996d(InterfaceC4339a interfaceC4339a, C3948a0 c3948a0, EnumC39181m enumC39181m) {
        int i13;
        this.f16115z = interfaceC4339a;
        this.f16111E = c3948a0;
        EnumC3968k0 enumC3968k0 = c3948a0.f16092c;
        boolean zM12006c = AbstractC3975r.m12006c(this.f16112F);
        int iOrdinal = enumC3968k0.ordinal();
        int i14 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zM12006c = true;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                zM12006c = false;
            }
        }
        Window window = getWindow();
        AbstractC22676k.m65747g(window);
        window.setFlags(zM12006c ? 8192 : -8193, DfuBaseService.ERROR_REMOTE_MASK);
        int iOrdinal2 = enumC39181m.ordinal();
        if (iOrdinal2 == 0) {
            i13 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = 1;
        }
        C3983z c3983z = this.f16113G;
        c3983z.setLayoutDirection(i13);
        boolean z4 = c3948a0.f16094e;
        boolean z13 = c3948a0.f16093d;
        Window window2 = c3983z.f16206J;
        boolean z14 = (c3983z.f16210N && z13 == c3983z.f16208L && z4 == c3983z.f16209M) ? false : true;
        c3983z.f16208L = z13;
        c3983z.f16209M = z4;
        if (z14) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i15 = z13 ? -2 : -1;
            if (i15 != attributes.width || !c3983z.f16210N) {
                window2.setLayout(i15, -2);
                c3983z.f16210N = true;
            }
        }
        setCanceledOnTouchOutside(c3948a0.f16091b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z4) {
                i14 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i14);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i13, KeyEvent keyEvent) {
        if (!this.f16111E.f16090a || !keyEvent.isTracking() || keyEvent.isCanceled() || i13 != 111) {
            return super.onKeyUp(i13, keyEvent);
        }
        this.f16115z.invoke();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iM36258X;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f16111E.f16091b) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.f16114H = false;
            return zOnTouchEvent;
        }
        C3983z c3983z = this.f16113G;
        c3983z.getClass();
        float x3 = motionEvent.getX();
        if (!Float.isInfinite(x3) && !Float.isNaN(x3)) {
            float y13 = motionEvent.getY();
            if (!Float.isInfinite(y13) && !Float.isNaN(y13) && (childAt = c3983z.getChildAt(0)) != null) {
                int left = childAt.getLeft() + c3983z.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + c3983z.getTop();
                int height = childAt.getHeight() + top;
                int iM36258X2 = AbstractC12889b.m36258X(motionEvent.getX());
                if (left <= iM36258X2 && iM36258X2 <= width && top <= (iM36258X = AbstractC12889b.m36258X(motionEvent.getY())) && iM36258X <= height) {
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                        this.f16114H = false;
                        return zOnTouchEvent;
                    }
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.f16114H = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.f16114H = false;
                return zOnTouchEvent;
            }
        } else if (this.f16114H) {
            this.f16115z.invoke();
            this.f16114H = false;
            return true;
        }
        return zOnTouchEvent;
    }
}
