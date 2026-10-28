package p163g1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.ArrayList;
import l83.C23454a0;
import p390p1.C28655q;
import p602x1.C37816b;

/* JADX INFO: renamed from: g1.y7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15203y7 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57079w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37816b f57080x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ ArrayList f57081y;

    public /* synthetic */ C15203y7(C37816b c37816b, ArrayList arrayList, int i13) {
        this.f57079w = i13;
        this.f57080x = c37816b;
        this.f57081y = arrayList;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57079w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.f57080x.invoke(this.f57081y, c28655q, 0);
                } else {
                    c28655q.m87138X();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    this.f57080x.invoke(this.f57081y, c28655q2, 0);
                } else {
                    c28655q2.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
