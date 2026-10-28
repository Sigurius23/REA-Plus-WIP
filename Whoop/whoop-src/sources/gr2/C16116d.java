package gr2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: gr2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C16116d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f61227w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16114b f61228x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f61229y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f61230z;

    public /* synthetic */ C16116d(C16114b c16114b, boolean z4, int i13, int i14) {
        this.f61227w = i14;
        this.f61228x = c16114b;
        this.f61229y = z4;
        this.f61230z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f61227w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC16117e.m45663k(this.f61228x, this.f61229y, this.f61230z, composer, iIntValue);
            default:
                return AbstractC16119g.m45672i(this.f61228x, this.f61229y, this.f61230z, composer, iIntValue);
        }
    }
}
