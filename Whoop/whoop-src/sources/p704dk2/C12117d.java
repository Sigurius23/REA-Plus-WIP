package p704dk2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ep1.AbstractC13418m;
import l72.AbstractC23408o;
import p719m22.AbstractC42786k;
import p719m22.AbstractC42787l;
import p736sz0.Function0;
import yt2.AbstractC39772c;

/* JADX INFO: renamed from: dk2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12117d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f40336E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40337w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f40338x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f40339y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f40340z;

    public /* synthetic */ C12117d(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, int i15) {
        this.f40337w = i15;
        this.f40338x = interfaceC4339a;
        this.f40339y = interfaceC4339a2;
        this.f40340z = i13;
        this.f40336E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40337w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return Function0.m33506i(this.f40338x, this.f40339y, this.f40340z, this.f40336E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC13418m.m38006t(this.f40338x, this.f40339y, this.f40340z, this.f40336E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC23408o.m67864p0(this.f40338x, this.f40339y, this.f40340z, this.f40336E, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC42786k.m73214j(this.f40338x, this.f40339y, this.f40340z, this.f40336E, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC42787l.m73224j(this.f40338x, this.f40339y, this.f40340z, this.f40336E, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return Function0.m105270l(this.f40338x, this.f40339y, this.f40340z, this.f40336E, (Composer) obj, iIntValue6);
            default:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC39772c.m127346s(this.f40338x, this.f40339y, this.f40340z, this.f40336E, (Composer) obj, iIntValue7);
        }
    }
}
