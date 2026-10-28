package p184h5;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;
import p014aj.C0928c;

/* JADX INFO: renamed from: h5.y */
/* JADX INFO: loaded from: classes.dex */
public final class C16925y extends C0928c {

    /* JADX INFO: renamed from: y */
    public View f64892y;

    /* JADX INFO: renamed from: z */
    public WindowInsetsController f64893z;

    @Override // p014aj.C0928c
    /* JADX INFO: renamed from: L */
    public final void mo2302L() {
        View view = this.f64892y;
        WindowInsetsController windowInsetsController = this.f64893z;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController == null) {
            super.mo2302L();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: h5.x
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i13) {
                atomicBoolean.set((i13 & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }

    @Override // p014aj.C0928c
    /* JADX INFO: renamed from: V */
    public final void mo2312V() {
        View view = this.f64892y;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f64893z;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.mo2312V();
    }
}
