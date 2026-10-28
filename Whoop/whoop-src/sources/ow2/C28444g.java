package ow2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import s21.AbstractC32084g;
import s21.C32085h;

/* JADX INFO: renamed from: ow2.g */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C28444g implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114685w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32085h f114686x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f114687y;

    public /* synthetic */ C28444g(C32085h c32085h, int i13, int i14) {
        this.f114685w = i14;
        this.f114686x = c32085h;
        this.f114687y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f114685w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC28445h.m86212d(this.f114686x, this.f114687y, composer, iIntValue);
            case 1:
                return AbstractC28445h.m86213e(this.f114686x, this.f114687y, composer, iIntValue);
            default:
                return AbstractC32084g.m99801i(this.f114686x, this.f114687y, composer, iIntValue);
        }
    }
}
