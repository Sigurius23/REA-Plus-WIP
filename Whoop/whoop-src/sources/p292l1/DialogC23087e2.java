package p292l1;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.AbstractC1613o1;
import bc3.InterfaceC2994c0;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import com.whoop.android.R;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuBaseService;
import p014aj.C0929d;
import p043c4.C3952c0;
import p043c4.EnumC3968k0;
import p077d0.C11344e;
import p161g.DialogC14910m;
import p184h5.C16908r1;
import p184h5.C16911s1;
import p184h5.C16917u1;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p505ts.AbstractC34132o;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: l1.e2 */
/* JADX INFO: loaded from: classes5.dex */
public final class DialogC23087e2 extends DialogC14910m {

    /* JADX INFO: renamed from: E */
    public C23147o2 f91108E;

    /* JADX INFO: renamed from: F */
    public long f91109F;

    /* JADX INFO: renamed from: G */
    public final View f91110G;

    /* JADX INFO: renamed from: H */
    public final C23069b2 f91111H;

    /* JADX INFO: renamed from: z */
    public InterfaceC4339a f91112z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC23087e2(InterfaceC4339a interfaceC4339a, C23147o2 c23147o2, long j7, View view, EnumC39181m enumC39181m, InterfaceC39171c interfaceC39171c, UUID uuid, C11344e c11344e, InterfaceC2994c0 interfaceC2994c0) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        boolean z4 = false;
        this.f91112z = interfaceC4339a;
        this.f91108E = c23147o2;
        this.f91109F = j7;
        this.f91110G = view;
        float f13 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        AbstractC29125c.m88513V(window, false);
        C23069b2 c23069b2 = new C23069b2(getContext(), window);
        c23069b2.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c23069b2.setClipChildren(false);
        c23069b2.setElevation(interfaceC39171c.mo743q0(f13));
        c23069b2.setOutlineProvider(new C3952c0(2));
        this.f91111H = c23069b2;
        setContentView(c23069b2);
        AbstractC1613o1.m5024n(c23069b2, AbstractC1613o1.m5017g(view));
        AbstractC1613o1.m5025o(c23069b2, AbstractC1613o1.m5018h(view));
        AbstractC34132o.m107862G(c23069b2, AbstractC34132o.m107891t(view));
        m67056c(this.f91112z, this.f91108E, this.f91109F, enumC39181m);
        C0929d c0929d = new C0929d(window.getDecorView());
        int i13 = Build.VERSION.SDK_INT;
        AbstractC3269g c16917u1 = i13 >= 35 ? new C16917u1(window, c0929d) : i13 >= 30 ? new C16911s1(window, c0929d) : new C16908r1(window, c0929d);
        this.f91108E.getClass();
        long j13 = this.f91109F;
        long j14 = C17919x.f69636m;
        c16917u1.mo9526Y(!C17919x.m51542d(j13, j14) && ((double) AbstractC17918w0.m51536x(j13)) <= 0.5d);
        this.f91108E.getClass();
        long j15 = this.f91109F;
        if (!C17919x.m51542d(j15, j14) && AbstractC17918w0.m51536x(j15) <= 0.5d) {
            z4 = true;
        }
        c16917u1.mo9525X(z4);
        getOnBackPressedDispatcher().m43015a(this, new C23081d2(this.f91108E.f91544b, interfaceC2994c0, c11344e, new C19683b(this, 18)));
    }

    /* JADX INFO: renamed from: c */
    public final void m67056c(InterfaceC4339a interfaceC4339a, C23147o2 c23147o2, long j7, EnumC39181m enumC39181m) {
        this.f91112z = interfaceC4339a;
        this.f91108E = c23147o2;
        this.f91109F = j7;
        EnumC3968k0 enumC3968k0 = c23147o2.f91543a;
        ViewGroup.LayoutParams layoutParams = this.f91110G.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i13 = 1;
        boolean z4 = (layoutParams2 == null || (layoutParams2.flags & DfuBaseService.ERROR_REMOTE_MASK) == 0) ? false : true;
        int iOrdinal = enumC3968k0.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z4 = true;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z4 = false;
            }
        }
        Window window = getWindow();
        AbstractC22676k.m65747g(window);
        window.setFlags(z4 ? 8192 : -8193, DfuBaseService.ERROR_REMOTE_MASK);
        int iOrdinal2 = enumC39181m.ordinal();
        if (iOrdinal2 == 0) {
            i13 = 0;
        } else if (iOrdinal2 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        this.f91111H.setLayoutDirection(i13);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.f91112z.invoke();
        }
        return zOnTouchEvent;
    }
}
