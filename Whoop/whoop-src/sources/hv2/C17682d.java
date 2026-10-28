package hv2;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import p040c0.InterfaceC3747i0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: hv2.d */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C17682d implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68581w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17689k.c f68582x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f68583y;

    public /* synthetic */ C17682d(C17689k.c cVar, Function1 function1, int i13) {
        this.f68581w = i13;
        this.f68582x = cVar;
        this.f68583y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f68581w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC17687i.m50452C0(this.f68582x, this.f68583y, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC17687i.m50535z0(this.f68582x, this.f68583y, (InterfaceC1103a) obj, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC17687i.m50448A0(this.f68582x, this.f68583y, (InterfaceC1103a) obj, (Composer) obj2, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj3).intValue();
                return AbstractC17687i.m50450B0(this.f68582x, this.f68583y, (InterfaceC1103a) obj, (Composer) obj2, iIntValue4);
        }
    }
}
