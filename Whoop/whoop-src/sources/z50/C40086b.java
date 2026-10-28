package z50;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import x50.InterfaceC37988c;

/* JADX INFO: renamed from: z50.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C40086b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f173001E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f173002w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC37988c f173003x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f173004y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f173005z;

    public /* synthetic */ C40086b(InterfaceC37988c interfaceC37988c, Function1 function1, int i13, int i14, int i15) {
        this.f173002w = i15;
        this.f173003x = interfaceC37988c;
        this.f173004y = function1;
        this.f173005z = i13;
        this.f173001E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f173002w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC40087c.m128477i(this.f173003x, this.f173004y, this.f173005z, this.f173001E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC40089e.m128518k(this.f173003x, this.f173004y, this.f173005z, this.f173001E, (Composer) obj, iIntValue2);
        }
    }
}
