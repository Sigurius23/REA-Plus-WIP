package p710im1;

import androidx.compose.runtime.Composer;
import bm.C3396t;
import em1.C13348v;
import fm1.C14599c;
import java.util.List;
import p040c0.InterfaceC3747i0;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: im1.n0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18685n0 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f73306E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73307w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13348v f73308x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f73309y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f73310z;

    public /* synthetic */ C18685n0(C3396t c3396t, List list, C14599c c14599c, C13348v c13348v) {
        this.f73309y = c3396t;
        this.f73310z = list;
        this.f73306E = c14599c;
        this.f73308x = c13348v;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f73307w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC18697t0.m54322d1((InterfaceC28601c1) this.f73309y, this.f73308x, (Function1) this.f73310z, (Function1) this.f73306E, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC18657a1.m54109w((C3396t) this.f73309y, this.f73310z, (C14599c) this.f73306E, this.f73308x, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ C18685n0(InterfaceC28601c1 interfaceC28601c1, C13348v c13348v, Function1 function1, Function1 function2) {
        this.f73309y = interfaceC28601c1;
        this.f73308x = c13348v;
        this.f73310z = function1;
        this.f73306E = function2;
    }
}
