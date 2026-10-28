package nw0;

import p715kotlin.jvm.functions.Function1;
import pp1.AbstractC29436i;
import s01.C32048d;

/* JADX INFO: renamed from: nw0.f */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C27199f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f108900w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32048d f108901x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f108902y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f108903z;

    public /* synthetic */ C27199f(C32048d c32048d, String str, Function1 function1) {
        this.f108901x = c32048d;
        this.f108903z = str;
        this.f108902y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f108900w) {
            case 0:
                return AbstractC27200g.m81778C(this.f108901x, this.f108903z, this.f108902y, obj);
            default:
                return AbstractC29436i.m89808z0(this.f108901x, this.f108902y, this.f108903z, obj);
        }
    }

    public /* synthetic */ C27199f(C32048d c32048d, Function1 function1, String str) {
        this.f108901x = c32048d;
        this.f108902y = function1;
        this.f108903z = str;
    }
}
