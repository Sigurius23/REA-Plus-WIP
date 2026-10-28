package zq2;

import p181h2.C16617b;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: zq2.j */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C40997j implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f176937w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f176938x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f176939y;

    public /* synthetic */ C40997j(Function1 function1, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f176937w = i13;
        this.f176938x = function1;
        this.f176939y = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f176937w) {
            case 0:
                return AbstractC40996i.b.m133162b(this.f176938x, this.f176939y, (C16617b) obj);
            default:
                return AbstractC40998k.b.m133198b(this.f176938x, this.f176939y, (C16617b) obj);
        }
    }
}
