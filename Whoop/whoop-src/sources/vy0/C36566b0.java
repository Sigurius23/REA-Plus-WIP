package vy0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import zq0.AbstractC40983x;

/* JADX INFO: renamed from: vy0.b0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36566b0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f156573w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C36570d0 f156574x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f156575y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f156576z;

    public /* synthetic */ C36566b0(C36570d0 c36570d0, Function1 function1, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f156573w = i13;
        this.f156574x = c36570d0;
        this.f156575y = function1;
        this.f156576z = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f156573w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC36568c0.m117315t(this.f156574x, this.f156575y, this.f156576z, composer, iIntValue);
            default:
                return AbstractC40983x.m133087q(this.f156574x, this.f156575y, this.f156576z, composer, iIntValue);
        }
    }
}
