package tq2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: tq2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C34085b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f142956w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34090g f142957x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f142958y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f142959z;

    public /* synthetic */ C34085b(C34090g c34090g, boolean z4, int i13, int i14) {
        this.f142956w = i14;
        this.f142957x = c34090g;
        this.f142958y = z4;
        this.f142959z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f142956w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC34086c.m107748f(this.f142957x, this.f142958y, this.f142959z, composer, iIntValue);
            default:
                return AbstractC34088e.m107757g(this.f142957x, this.f142958y, this.f142959z, composer, iIntValue);
        }
    }
}
