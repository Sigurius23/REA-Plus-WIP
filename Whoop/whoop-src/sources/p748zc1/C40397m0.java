package p748zc1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: zc1.m0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C40397m0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f174348w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f174349x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f174350y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f174351z;

    public /* synthetic */ C40397m0(int i13, String str, int i14, boolean z4) {
        this.f174348w = i14;
        this.f174349x = str;
        this.f174350y = z4;
        this.f174351z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f174348w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC40418o0.m130479K(this.f174349x, this.f174350y, this.f174351z, composer, iIntValue);
            case 1:
                return AbstractC40418o0.m130473E(this.f174349x, this.f174350y, this.f174351z, composer, iIntValue);
            case 2:
                return AbstractC40418o0.m130485Q(this.f174349x, this.f174350y, this.f174351z, composer, iIntValue);
            case 3:
                return AbstractC40418o0.m130510y(this.f174349x, this.f174350y, this.f174351z, composer, iIntValue);
            default:
                return AbstractC40471t3.m130875j(this.f174349x, this.f174350y, this.f174351z, composer, iIntValue);
        }
    }
}
