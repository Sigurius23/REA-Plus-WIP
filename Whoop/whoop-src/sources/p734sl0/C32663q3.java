package p734sl0;

import h51.C16934f;
import nl0.C26804f;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: sl0.q3 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32663q3 implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f135512E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f135513F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135514w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32695y0 f135515x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C26804f f135516y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C16934f f135517z;

    public /* synthetic */ C32663q3(C32695y0 c32695y0, C26804f c26804f, C16934f c16934f, Function1 function1, Function1 function2, int i13) {
        this.f135514w = i13;
        this.f135515x = c32695y0;
        this.f135516y = c26804f;
        this.f135517z = c16934f;
        this.f135512E = function1;
        this.f135513F = function2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135514w) {
            case 0:
                return AbstractC32668r3.m102270t(this.f135515x, this.f135516y, this.f135517z, this.f135512E, this.f135513F, obj);
            default:
                return AbstractC32673s3.m102324x(this.f135515x, this.f135516y, this.f135517z, this.f135512E, this.f135513F, obj);
        }
    }
}
