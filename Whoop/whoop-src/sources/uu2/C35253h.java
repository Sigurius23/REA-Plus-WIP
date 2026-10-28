package uu2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import gu2.C16214a;

/* JADX INFO: renamed from: uu2.h */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C35253h implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f149957w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16214a f149958x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f149959y;

    public /* synthetic */ C35253h(C16214a c16214a, int i13, int i14) {
        this.f149957w = i14;
        this.f149958x = c16214a;
        this.f149959y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f149957w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC35261l.m111776U(this.f149958x, this.f149959y, composer, iIntValue);
            default:
                return AbstractC35248e0.m111688k(this.f149958x, this.f149959y, composer, iIntValue);
        }
    }
}
