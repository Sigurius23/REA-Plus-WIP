package vl0;

import ol0.C28012b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: vl0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C36099b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f154321w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28012b f154322x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f154323y;

    public /* synthetic */ C36099b(C28012b c28012b, Function1 function1, int i13) {
        this.f154321w = i13;
        this.f154322x = c28012b;
        this.f154323y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f154321w) {
            case 0:
                return AbstractC36101d.m114737z(this.f154322x, this.f154323y, obj);
            default:
                return AbstractC36101d.m114736y(this.f154322x, this.f154323y, obj);
        }
    }
}
