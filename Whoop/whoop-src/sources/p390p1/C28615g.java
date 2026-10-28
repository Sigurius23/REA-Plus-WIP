package p390p1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;

/* JADX INFO: renamed from: p1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C28615g implements InterfaceC4351m {

    /* JADX INFO: renamed from: x */
    public static final C28615g f115768x = new C28615g(0);

    /* JADX INFO: renamed from: y */
    public static final C28615g f115769y = new C28615g(1);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115770w;

    public /* synthetic */ C28615g(int i13) {
        this.f115770w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f115770w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (!c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c28655q.m87138X();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (!c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c28655q2.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
