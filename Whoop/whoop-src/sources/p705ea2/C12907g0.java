package p705ea2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import p708hb2.AbstractC17096d;
import p715kotlin.jvm.functions.Function1;
import p740ux0.Function0;

/* JADX INFO: renamed from: ea2.g0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12907g0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44417w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f44418x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f44419y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f44420z;

    public /* synthetic */ C12907g0(InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14) {
        this.f44417w = i14;
        this.f44418x = interfaceC4339a;
        this.f44419y = function1;
        this.f44420z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f44417w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC12911i0.m36322n(this.f44418x, this.f44419y, this.f44420z, composer, iIntValue);
            case 1:
                return AbstractC17096d.m48290f(this.f44418x, this.f44419y, this.f44420z, composer, iIntValue);
            default:
                return Function0.m112216i(this.f44418x, this.f44419y, this.f44420z, composer, iIntValue);
        }
    }
}
