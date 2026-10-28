package id0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import gd0.AbstractC15713c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: id0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18408b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f71597E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f71598F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71599w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC15713c f71600x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f71601y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f71602z;

    public /* synthetic */ C18408b(AbstractC15713c abstractC15713c, Function1 function1, Function1 function2, int i13, int i14, int i15) {
        this.f71599w = i15;
        this.f71600x = abstractC15713c;
        this.f71601y = function1;
        this.f71602z = function2;
        this.f71597E = i13;
        this.f71598F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f71599w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC18409c.m52959G(this.f71600x, this.f71601y, this.f71602z, this.f71597E, this.f71598F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC18409c.m52982u(this.f71600x, this.f71601y, this.f71602z, this.f71597E, this.f71598F, (Composer) obj, iIntValue2);
        }
    }
}
