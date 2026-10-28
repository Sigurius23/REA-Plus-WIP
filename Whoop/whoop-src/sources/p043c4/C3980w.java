package p043c4;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.C28655q;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c4.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C3980w extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: x */
    public static final C3980w f16201x;

    /* JADX INFO: renamed from: y */
    public static final C3980w f16202y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16203w;

    static {
        int i13 = 2;
        f16201x = new C3980w(i13, 0);
        f16202y = new C3980w(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3980w(int i13, int i14) {
        super(i13);
        this.f16203w = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16203w) {
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
