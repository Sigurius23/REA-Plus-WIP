package p707gt1;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import p291l0.InterfaceC22996s0;
import p390p1.InterfaceC28670t2;
import p715kotlin.jvm.functions.Function3;
import vx0.AbstractC36555c;
import w81.AbstractC36945c;

/* JADX INFO: renamed from: gt1.o */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16201o implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f61533w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28670t2 f61534x;

    public /* synthetic */ C16201o(InterfaceC28670t2 interfaceC28670t2, int i13) {
        this.f61533w = i13;
        this.f61534x = interfaceC28670t2;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f61533w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC16202p.m45857m(this.f61534x, (InterfaceC22996s0) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC36555c.m117246z(this.f61534x, (InterfaceC1103a) obj, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC36555c.m117210B(this.f61534x, (InterfaceC1103a) obj, (Composer) obj2, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj3).intValue();
                return AbstractC36555c.m117213E(this.f61534x, (InterfaceC1103a) obj, (Composer) obj2, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj3).intValue();
                return AbstractC36555c.m117214F(this.f61534x, (InterfaceC1103a) obj, (Composer) obj2, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj3).intValue();
                return AbstractC36945c.m118628q(this.f61534x, ((Integer) obj).intValue(), (Composer) obj2, iIntValue6);
            default:
                int iIntValue7 = ((Integer) obj3).intValue();
                return AbstractC36945c.m118625n(this.f61534x, ((Integer) obj).intValue(), (Composer) obj2, iIntValue7);
        }
    }
}
