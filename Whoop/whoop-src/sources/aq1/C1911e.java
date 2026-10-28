package aq1;

import android.view.Window;
import c93.InterfaceC4339a;
import vo1.AbstractC36245t;

/* JADX INFO: renamed from: aq1.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C1911e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7553w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Window f7554x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f7555y;

    public /* synthetic */ C1911e(Window window, long j7, int i13) {
        this.f7553w = i13;
        this.f7554x = window;
        this.f7555y = j7;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f7553w) {
            case 0:
                return AbstractC1912f.m5866v(this.f7554x, this.f7555y);
            default:
                return AbstractC36245t.m115596x(this.f7554x, this.f7555y);
        }
    }
}
