package kd1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import kr2.AbstractC22813b;
import p040c0.InterfaceC3747i0;
import p715kotlin.jvm.functions.Function3;
import vt2.AbstractC36497f;

/* JADX INFO: renamed from: kd1.c0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22389c0 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f87581w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f87582x;

    public /* synthetic */ C22389c0(int i13, InterfaceC4351m interfaceC4351m) {
        this.f87581w = i13;
        this.f87582x = interfaceC4351m;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f87581w;
        InterfaceC3747i0 interfaceC3747i0 = (InterfaceC3747i0) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i13) {
            case 0:
                return AbstractC22391d0.m64438d(this.f87582x, interfaceC3747i0, composer, iIntValue);
            case 1:
                return AbstractC22813b.m66096w(this.f87582x, interfaceC3747i0, composer, iIntValue);
            case 2:
                return AbstractC22813b.m66088o(this.f87582x, interfaceC3747i0, composer, iIntValue);
            case 3:
                return AbstractC22813b.m66085l(this.f87582x, interfaceC3747i0, composer, iIntValue);
            case 4:
                return AbstractC22813b.m66092s(this.f87582x, interfaceC3747i0, composer, iIntValue);
            default:
                return AbstractC36497f.m116986t(this.f87582x, interfaceC3747i0, composer, iIntValue);
        }
    }
}
