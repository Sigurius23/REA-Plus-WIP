package mr1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p114eb.AbstractC12939a0;
import tu2.AbstractC34197b;

/* JADX INFO: renamed from: mr1.i */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C25919i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f102332w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC12939a0 f102333x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f102334y;

    public /* synthetic */ C25919i(AbstractC12939a0 abstractC12939a0, int i13, int i14) {
        this.f102332w = i14;
        this.f102333x = abstractC12939a0;
        this.f102334y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f102332w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC25920j.m76667m(this.f102333x, this.f102334y, composer, iIntValue);
            default:
                return AbstractC34197b.m108093s(this.f102333x, this.f102334y, composer, iIntValue);
        }
    }
}
