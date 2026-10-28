package p163g1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.C28655q;

/* JADX INFO: renamed from: g1.g1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15014g1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56181w;

    /* JADX INFO: renamed from: x */
    public static final C15014g1 f56178x = new C15014g1(0);

    /* JADX INFO: renamed from: y */
    public static final C15014g1 f56179y = new C15014g1(1);

    /* JADX INFO: renamed from: z */
    public static final C15014g1 f56180z = new C15014g1(2);

    /* JADX INFO: renamed from: E */
    public static final C15014g1 f56175E = new C15014g1(3);

    /* JADX INFO: renamed from: F */
    public static final C15014g1 f56176F = new C15014g1(4);

    /* JADX INFO: renamed from: G */
    public static final C15014g1 f56177G = new C15014g1(5);

    public /* synthetic */ C15014g1(int i13) {
        this.f56181w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56181w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (!c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c28655q.m87138X();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (!c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c28655q2.m87138X();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C28655q c28655q3 = (C28655q) composer3;
                if (!c28655q3.m87135U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c28655q3.m87138X();
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                C28655q c28655q4 = (C28655q) composer4;
                if (!c28655q4.m87135U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    c28655q4.m87138X();
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                C28655q c28655q5 = (C28655q) composer5;
                if (!c28655q5.m87135U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    c28655q5.m87138X();
                }
                break;
            default:
                Composer composer6 = (Composer) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                C28655q c28655q6 = (C28655q) composer6;
                if (!c28655q6.m87135U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    c28655q6.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
