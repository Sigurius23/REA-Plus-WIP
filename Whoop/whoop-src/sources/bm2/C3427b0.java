package bm2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import h60.AbstractC16978g;
import p736sz0.AbstractC33164a1;
import p748zc1.AbstractC40289c2;

/* JADX INFO: renamed from: bm2.b0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3427b0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13413w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f13414x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f13415y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f13416z;

    public /* synthetic */ C3427b0(String str, String str2, int i13, int i14) {
        this.f13413w = i14;
        this.f13414x = str;
        this.f13415y = str2;
        this.f13416z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f13413w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC3436e0.m9952O0(this.f13414x, this.f13415y, this.f13416z, composer, iIntValue);
            case 1:
                return AbstractC16978g.m47773l(this.f13414x, this.f13415y, this.f13416z, composer, iIntValue);
            case 2:
                return AbstractC33164a1.m105037k(this.f13414x, this.f13415y, this.f13416z, composer, iIntValue);
            default:
                return AbstractC40289c2.m129428f(this.f13414x, this.f13415y, this.f13416z, composer, iIntValue);
        }
    }
}
