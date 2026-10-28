package p184h5;

import android.view.View;
import android.view.Window;
import bi.AbstractC3269g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p014aj.C0929d;

/* JADX INFO: renamed from: h5.r1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16908r1 extends AbstractC3269g {

    /* JADX INFO: renamed from: b */
    public final Window f64868b;

    public C16908r1(Window window, C0929d c0929d) {
        this.f64868b = window;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: H */
    public final boolean mo9522H() {
        return (this.f64868b.getDecorView().getSystemUiVisibility() & DfuBaseService.ERROR_REMOTE_MASK) != 0;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: X */
    public final void mo9525X(boolean z4) {
        if (!z4) {
            m47603j0(16);
            return;
        }
        Window window = this.f64868b;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: Y */
    public final void mo9526Y(boolean z4) {
        if (!z4) {
            m47603j0(DfuBaseService.ERROR_REMOTE_MASK);
            return;
        }
        Window window = this.f64868b;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: j0 */
    public final void m47603j0(int i13) {
        View decorView = this.f64868b.getDecorView();
        decorView.setSystemUiVisibility((~i13) & decorView.getSystemUiVisibility());
    }
}
