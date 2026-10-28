package by1;

import c93.InterfaceC4339a;
import ek2.AbstractC13305b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: by1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3695b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15109w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f15110x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f15111y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f15112z;

    public /* synthetic */ C3695b(Function1 function1, Function1 function2, String str, int i13) {
        this.f15109w = i13;
        this.f15110x = function1;
        this.f15111y = function2;
        this.f15112z = str;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f15109w) {
            case 0:
                return AbstractC3697d.m11504e(this.f15110x, this.f15111y, this.f15112z);
            case 1:
                return AbstractC13305b.m37390k(this.f15110x, this.f15111y, this.f15112z);
            default:
                return AbstractC13305b.m37391l(this.f15110x, this.f15111y, this.f15112z);
        }
    }
}
