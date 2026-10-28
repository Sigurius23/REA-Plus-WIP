package l00;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23004v;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l00.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C23022d implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90769w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f90770x;

    public /* synthetic */ C23022d(int i13, Modifier modifier) {
        this.f90769w = i13;
        this.f90770x = modifier;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f90769w) {
            case 0:
                InterfaceC23004v StripeImage = (InterfaceC23004v) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(StripeImage, "$this$StripeImage");
                if ((iIntValue & 17) == 16) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        AbstractC23024f.m66784c(this.f90770x, composer, 0);
                    }
                } else {
                    AbstractC23024f.m66784c(this.f90770x, composer, 0);
                }
                break;
            case 1:
                InterfaceC23004v StripeImage2 = (InterfaceC23004v) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(StripeImage2, "$this$StripeImage");
                if ((iIntValue2 & 17) == 16) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        AbstractC22989q.m66760a(this.f90770x, composer2, 0);
                    }
                } else {
                    AbstractC22989q.m66760a(this.f90770x, composer2, 0);
                }
                break;
            case 2:
                InterfaceC23004v StripeImage3 = (InterfaceC23004v) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(StripeImage3, "$this$StripeImage");
                if ((iIntValue3 & 17) == 16) {
                    C28655q c28655q3 = (C28655q) composer3;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        AbstractC23024f.m66785d(this.f90770x, composer3, 0);
                    }
                } else {
                    AbstractC23024f.m66785d(this.f90770x, composer3, 0);
                }
                break;
            default:
                InterfaceC23004v StripeImage4 = (InterfaceC23004v) obj;
                Composer composer4 = (Composer) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(StripeImage4, "$this$StripeImage");
                if ((iIntValue4 & 17) == 16) {
                    C28655q c28655q4 = (C28655q) composer4;
                    if (c28655q4.m87121F()) {
                        c28655q4.m87138X();
                    } else {
                        AbstractC22989q.m66760a(this.f90770x, composer4, 0);
                    }
                } else {
                    AbstractC22989q.m66760a(this.f90770x, composer4, 0);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
