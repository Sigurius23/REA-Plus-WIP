package p184h5;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import bi.AbstractC3269g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p014aj.C0929d;

/* JADX INFO: renamed from: h5.s1 */
/* JADX INFO: loaded from: classes5.dex */
public class C16911s1 extends AbstractC3269g {

    /* JADX INFO: renamed from: b */
    public final WindowInsetsController f64870b;

    /* JADX INFO: renamed from: c */
    public final Window f64871c;

    public C16911s1(WindowInsetsController windowInsetsController, C0929d c0929d) {
        this.f64870b = windowInsetsController;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: H */
    public boolean mo9522H() {
        this.f64870b.setSystemBarsAppearance(0, 0);
        return (this.f64870b.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: X */
    public final void mo9525X(boolean z4) {
        Window window = this.f64871c;
        if (z4) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f64870b.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f64870b.setSystemBarsAppearance(0, 16);
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: Y */
    public final void mo9526Y(boolean z4) {
        Window window = this.f64871c;
        if (z4) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | DfuBaseService.ERROR_REMOTE_MASK);
            }
            this.f64870b.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f64870b.setSystemBarsAppearance(0, 8);
    }

    public C16911s1(Window window, C0929d c0929d) {
        this(window.getInsetsController(), c0929d);
        this.f64871c = window;
    }
}
