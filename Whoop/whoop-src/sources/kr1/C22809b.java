package kr1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import gr1.C16094a;

/* JADX INFO: renamed from: kr1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C22809b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f89823w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16094a f89824x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f89825y;

    public /* synthetic */ C22809b(C16094a c16094a, int i13, int i14) {
        this.f89823w = i14;
        this.f89824x = c16094a;
        this.f89825y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f89823w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC22810c.m66063n(this.f89824x, this.f89825y, composer, iIntValue);
            default:
                return AbstractC22810c.m66061l(this.f89824x, this.f89825y, composer, iIntValue);
        }
    }
}
