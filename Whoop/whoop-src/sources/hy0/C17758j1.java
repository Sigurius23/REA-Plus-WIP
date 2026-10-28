package hy0;

import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import t11.AbstractC33305e;

/* JADX INFO: renamed from: hy0.j1 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17758j1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69051w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f69052x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f69053y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f69054z;

    public /* synthetic */ C17758j1(int i13, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        this.f69052x = i13;
        this.f69053y = function1;
        this.f69054z = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f69051w) {
            case 0:
                return AbstractC17766l1.m50966g(this.f69052x, this.f69054z, this.f69053y, (String) obj);
            default:
                return AbstractC33305e.m105620H(this.f69052x, this.f69053y, this.f69054z, (String) obj);
        }
    }

    public /* synthetic */ C17758j1(int i13, InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
        this.f69052x = i13;
        this.f69054z = interfaceC28601c1;
        this.f69053y = function1;
    }
}
