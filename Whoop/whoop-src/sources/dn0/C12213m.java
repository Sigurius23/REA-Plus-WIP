package dn0;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4352n;
import ev2.AbstractC13712u;
import p715kotlin.jvm.functions.Function1;
import qy0.InterfaceC30768a;

/* JADX INFO: renamed from: dn0.m */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C12213m implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40843w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f40844x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f40845y;

    public /* synthetic */ C12213m(boolean z4, Object obj, int i13) {
        this.f40843w = i13;
        this.f40844x = z4;
        this.f40845y = obj;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f40843w) {
            case 0:
                int iIntValue = ((Integer) obj4).intValue();
                return AbstractC12216p.m33892S(this.f40844x, (Function1) this.f40845y, (InterfaceC30768a) obj, (Function1) obj2, (Composer) obj3, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj4).intValue();
                return AbstractC13712u.m38772a0(this.f40844x, (String) this.f40845y, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (Composer) obj3, iIntValue2);
        }
    }
}
