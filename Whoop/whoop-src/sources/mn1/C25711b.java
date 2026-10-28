package mn1;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import jn1.AbstractC21805d;
import p040c0.InterfaceC3747i0;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: mn1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C25711b implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101262w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC21805d.c f101263x;

    public /* synthetic */ C25711b(AbstractC21805d.c cVar, int i13) {
        this.f101262w = i13;
        this.f101263x = cVar;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f101262w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC25712c.m75734s(this.f101263x, (InterfaceC1103a) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC25712c.m75735t(this.f101263x, (InterfaceC1103a) obj, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC25712c.m75738w(this.f101263x, (InterfaceC1103a) obj, (Composer) obj2, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj3).intValue();
                return AbstractC25712c.m75728m(this.f101263x, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue4);
        }
    }
}
