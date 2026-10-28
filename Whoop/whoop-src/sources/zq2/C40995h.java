package zq2;

import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: zq2.h */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C40995h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f176929w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f176930x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C40993f f176931y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f176932z;

    public /* synthetic */ C40995h(Function1 function1, C40993f c40993f, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f176929w = i13;
        this.f176930x = function1;
        this.f176931y = c40993f;
        this.f176932z = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f176929w) {
            case 0:
                return AbstractC40996i.m133124A(this.f176930x, this.f176931y, this.f176932z, (C40988a) obj);
            default:
                return AbstractC40998k.m133195y(this.f176930x, this.f176931y, this.f176932z, (C40988a) obj);
        }
    }
}
