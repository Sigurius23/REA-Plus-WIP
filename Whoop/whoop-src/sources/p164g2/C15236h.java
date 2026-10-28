package p164g2;

import androidx.compose.p018ui.platform.AndroidComposeView;
import b30.C2539i0;
import p002a0.AbstractC0018e1;
import p002a0.C0047q0;
import p002a0.C0059w0;

/* JADX INFO: renamed from: g2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C15236h {

    /* JADX INFO: renamed from: a */
    public final C15240l f57233a;

    /* JADX INFO: renamed from: b */
    public final AndroidComposeView f57234b;

    /* JADX INFO: renamed from: c */
    public final C0059w0 f57235c;

    /* JADX INFO: renamed from: d */
    public final C0059w0 f57236d;

    /* JADX INFO: renamed from: e */
    public boolean f57237e;

    public C15236h(C15240l c15240l, AndroidComposeView androidComposeView) {
        this.f57233a = c15240l;
        this.f57234b = androidComposeView;
        C0059w0 c0059w0 = AbstractC0018e1.f44a;
        this.f57235c = new C0059w0();
        this.f57236d = new C0059w0();
    }

    /* JADX INFO: renamed from: a */
    public final void m43337a() {
        if (this.f57237e) {
            return;
        }
        C2539i0 c2539i0 = new C2539i0(this);
        C0047q0 c0047q0 = this.f57234b.f4931V0;
        if (c0047q0.m103f(c2539i0) < 0) {
            c0047q0.m98a(c2539i0);
        }
        this.f57237e = true;
    }
}
