package p292l1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p390p1.C28655q;

/* JADX INFO: renamed from: l1.y2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23207y2 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC17869a1 f91860E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91861w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f91862x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC21083i f91863y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C23089e4 f91864z;

    public /* synthetic */ C23207y2(boolean z4, InterfaceC21083i interfaceC21083i, C23089e4 c23089e4, InterfaceC17869a1 interfaceC17869a1, int i13) {
        this.f91861w = i13;
        this.f91862x = z4;
        this.f91863y = interfaceC21083i;
        this.f91864z = c23089e4;
        this.f91860E = interfaceC17869a1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f91861w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C23177t2.f91688a.m67140a(this.f91862x, false, this.f91863y, null, this.f91864z, this.f91860E, 0.0f, 0.0f, c28655q, 100663296, 200);
                } else {
                    c28655q.m87138X();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C23107h4.f91269a.m67088a(this.f91862x, this.f91863y, this.f91864z, this.f91860E, c28655q2, 114822144);
                } else {
                    c28655q2.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
