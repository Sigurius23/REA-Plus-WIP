package mo;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import mm.C25680d;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: mo.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C25733n implements InterfaceC25732m, DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101400w = 0;

    /* JADX INFO: renamed from: x */
    public final DisplayManager f101401x;

    /* JADX INFO: renamed from: y */
    public Object f101402y;

    public C25733n(C25735p c25735p, DisplayManager displayManager) {
        this.f101402y = c25735p;
        this.f101401x = displayManager;
    }

    /* JADX INFO: renamed from: a */
    private final void m75870a(int i13) {
    }

    /* JADX INFO: renamed from: b */
    private final void m75871b(int i13) {
    }

    /* JADX INFO: renamed from: c */
    private final void m75872c(int i13) {
    }

    /* JADX INFO: renamed from: d */
    private final void m75873d(int i13) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i13) {
        int i14 = this.f101400w;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i13) {
        switch (this.f101400w) {
            case 0:
                C25680d c25680d = (C25680d) this.f101402y;
                if (c25680d != null && i13 == 0) {
                    c25680d.m75617a(this.f101401x.getDisplay(0));
                    break;
                }
                break;
            default:
                if (i13 == 0) {
                    C25735p.m75874a((C25735p) this.f101402y, this.f101401x.getDisplay(0));
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i13) {
        int i14 = this.f101400w;
    }

    @Override // mo.InterfaceC25732m
    /* JADX INFO: renamed from: x */
    public void mo68185x() {
        this.f101401x.unregisterDisplayListener(this);
        this.f101402y = null;
    }

    @Override // mo.InterfaceC25732m
    /* JADX INFO: renamed from: y */
    public void mo68186y(C25680d c25680d) {
        this.f101402y = c25680d;
        Handler handlerM71680k = AbstractC24567y.m71680k(null);
        DisplayManager displayManager = this.f101401x;
        displayManager.registerDisplayListener(this, handlerM71680k);
        c25680d.m75617a(displayManager.getDisplay(0));
    }

    public C25733n(DisplayManager displayManager) {
        this.f101401x = displayManager;
    }
}
