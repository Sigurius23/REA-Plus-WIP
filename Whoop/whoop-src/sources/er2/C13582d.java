package er2;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import iw0.AbstractC20978k0;
import iw0.C20980l0;
import p040c0.InterfaceC3747i0;
import p715kotlin.jvm.functions.Function3;
import rq2.AbstractC31714a0;
import rq2.C31757y;

/* JADX INFO: renamed from: er2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C13582d implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f47949w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f47950x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f47951y;

    public /* synthetic */ C13582d(Object obj, boolean z4, int i13) {
        this.f47949w = i13;
        this.f47951y = obj;
        this.f47950x = z4;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f47949w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC13583e.m38345o((EnumC13585g) this.f47951y, this.f47950x, (Modifier) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC20978k0.m58316m((C20980l0) this.f47951y, this.f47950x, (InterfaceC1103a) obj, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC31714a0.m98387f((C31757y) this.f47951y, this.f47950x, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue3);
        }
    }
}
