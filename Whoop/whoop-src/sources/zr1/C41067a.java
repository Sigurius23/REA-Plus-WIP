package zr1;

import p715kotlin.jvm.functions.Function1;
import zt2.AbstractC41140i;
import zt2.AbstractC41141j;
import zv2.AbstractC41172h;
import zx2.AbstractC41208a;
import zz0.AbstractC41251l;
import zz0.C41243d;

/* JADX INFO: renamed from: zr1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C41067a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f177081w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f177082x;

    public /* synthetic */ C41067a(Function1 function1, int i13) {
        this.f177081w = i13;
        this.f177082x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f177081w) {
            case 0:
                return AbstractC41068b.m133328p(this.f177082x, (String) obj);
            case 1:
                return AbstractC41140i.m133601m(this.f177082x, obj);
            case 2:
                return AbstractC41141j.m133614k(this.f177082x, obj);
            case 3:
                return AbstractC41141j.m133616m(this.f177082x, obj);
            case 4:
                return AbstractC41172h.m133791L(this.f177082x, (String) obj);
            case 5:
                return AbstractC41208a.m133877o(this.f177082x, obj);
            default:
                return C41243d.m133961d(this.f177082x, (AbstractC41251l) obj);
        }
    }
}
