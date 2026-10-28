package no0;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import c41.C4092p2;
import p040c0.InterfaceC3747i0;
import p715kotlin.jvm.functions.Function3;
import p743vy1.Function1;

/* JADX INFO: renamed from: no0.v */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26977v implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107614w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4092p2 f107615x;

    public /* synthetic */ C26977v(C4092p2 c4092p2, int i13) {
        this.f107614w = i13;
        this.f107615x = c4092p2;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f107614w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC26979w.m80854V(this.f107615x, (InterfaceC1103a) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return Function1.m117562s(this.f107615x, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue2);
        }
    }
}
