package p163g1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import b30.C2483b0;
import g00.AbstractC14936g;
import j00.AbstractC21114q;
import l83.C23454a0;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p291l0.InterfaceC22997s1;
import p292l1.AbstractC23185u4;
import p292l1.C23197w4;
import p390p1.C28655q;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g1.q6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15122q6 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56650w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f56651x;

    public /* synthetic */ C15122q6(String str, int i13) {
        this.f56650w = i13;
        this.f56651x = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f56650w) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC15011f9.m43114b(this.f56651x, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 0, 0, 131070);
                } else {
                    c28655q.m87138X();
                }
                break;
            case 1:
                InterfaceC3747i0 AnimatedVisibility = (InterfaceC3747i0) obj;
                Composer composer2 = (Composer) obj2;
                ((Number) obj3).intValue();
                AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
                AbstractC14936g.m43027a(null, AbstractC37817c.m121344e(1686792714, composer2, new C2483b0(this.f56651x, 3)), composer2, 48);
                break;
            case 2:
                InterfaceC3747i0 AnimatedVisibility2 = (InterfaceC3747i0) obj;
                Composer composer3 = (Composer) obj2;
                ((Number) obj3).intValue();
                AbstractC22676k.m65750j(AnimatedVisibility2, "$this$AnimatedVisibility");
                String str = this.f56651x;
                if (str == null) {
                    str = "";
                }
                AbstractC21114q.m58930a(str, AbstractC1102d.m3409f(1.0f, C2314t.f9131w), composer3, 48);
                break;
            case 3:
                C23197w4 c23197w4 = (C23197w4) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? ((C28655q) composer4).m87153g(c23197w4) : ((C28655q) composer4).m87157i(c23197w4) ? 4 : 2;
                }
                C28655q c28655q2 = (C28655q) composer4;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    AbstractC23185u4.m67144a(c23197w4, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, AbstractC37817c.m121344e(1905952188, c28655q2, new C2483b0(this.f56651x, 5)), c28655q2, (iIntValue2 & 14) | 805306368);
                } else {
                    c28655q2.m87138X();
                }
                break;
            case 4:
                C23197w4 c23197w5 = (C23197w4) obj;
                Composer composer5 = (Composer) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? ((C28655q) composer5).m87153g(c23197w5) : ((C28655q) composer5).m87157i(c23197w5) ? 4 : 2;
                }
                C28655q c28655q3 = (C28655q) composer5;
                if (c28655q3.m87135U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    AbstractC23185u4.m67144a(c23197w5, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, AbstractC37817c.m121344e(-999924215, c28655q3, new C2483b0(this.f56651x, 6)), c28655q3, (iIntValue3 & 14) | 805306368);
                } else {
                    c28655q3.m87138X();
                }
                break;
            default:
                InterfaceC22997s1 TextButton = (InterfaceC22997s1) obj;
                Composer composer6 = (Composer) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(TextButton, "$this$TextButton");
                if ((iIntValue4 & 17) == 16) {
                    C28655q c28655q4 = (C28655q) composer6;
                    if (c28655q4.m87121F()) {
                        c28655q4.m87138X();
                    } else {
                        AbstractC15011f9.m43114b(this.f56651x, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C15033h9) ((C28655q) composer6).m87161k(AbstractC15044i9.f56319b)).f56282i, composer6, 0, 0, 65534);
                    }
                } else {
                    AbstractC15011f9.m43114b(this.f56651x, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C15033h9) ((C28655q) composer6).m87161k(AbstractC15044i9.f56319b)).f56282i, composer6, 0, 0, 65534);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
