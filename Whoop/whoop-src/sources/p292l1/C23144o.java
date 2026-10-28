package p292l1;

import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p291l0.C22951e1;
import p390p1.C28655q;

/* JADX INFO: renamed from: l1.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C23144o implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91536w;

    /* JADX INFO: renamed from: x */
    public static final C23144o f91533x = new C23144o(0);

    /* JADX INFO: renamed from: y */
    public static final C23144o f91534y = new C23144o(1);

    /* JADX INFO: renamed from: z */
    public static final C23144o f91535z = new C23144o(2);

    /* JADX INFO: renamed from: E */
    public static final C23144o f91530E = new C23144o(3);

    /* JADX INFO: renamed from: F */
    public static final C23144o f91531F = new C23144o(4);

    /* JADX INFO: renamed from: G */
    public static final C23144o f91532G = new C23144o(5);

    public /* synthetic */ C23144o(int i13) {
        this.f91536w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f91536w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C23078d.f91051a.m67053a(null, 0.0f, 0.0f, null, 0L, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
                } else {
                    c28655q.m87138X();
                }
                return c23454a0;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C23078d.f91051a.m67053a(null, 0.0f, 0.0f, null, 0L, c28655q2, ProfileVerifier.CompilationStatus.f6515xf2722a21);
                } else {
                    c28655q2.m87138X();
                }
                return c23454a0;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C28655q c28655q3 = (C28655q) composer3;
                if (c28655q3.m87135U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C23078d.f91051a.m67053a(null, 0.0f, 0.0f, null, 0L, c28655q3, ProfileVerifier.CompilationStatus.f6515xf2722a21);
                } else {
                    c28655q3.m87138X();
                }
                return c23454a0;
            case 3:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                C28655q c28655q4 = (C28655q) composer4;
                if (!c28655q4.m87135U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    c28655q4.m87138X();
                }
                return c23454a0;
            case 4:
                ((Number) obj2).intValue();
                C28655q c28655q5 = (C28655q) ((Composer) obj);
                c28655q5.m87150e0(-511854661);
                C23078d c23078d = C23078d.f91051a;
                C22951e1 c22951e1M67052b = C23078d.m67052b(c28655q5);
                c28655q5.m87173q(false);
                return c22951e1M67052b;
            default:
                ((Number) obj2).intValue();
                C28655q c28655q6 = (C28655q) ((Composer) obj);
                c28655q6.m87150e0(69134487);
                C23078d c23078d2 = C23078d.f91051a;
                C22951e1 c22951e1M67052b2 = C23078d.m67052b(c28655q6);
                c28655q6.m87173q(false);
                return c22951e1M67052b2;
        }
    }
}
