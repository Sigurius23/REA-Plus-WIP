package uf0;

import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25312u;
import w60.AbstractC36857e;
import xp2.AbstractC38537f;
import yf1.AbstractC39518g;
import z22.AbstractC40029h;
import z72.AbstractC40163i;
import zx2.AbstractC41208a;
import zy2.AbstractC41231d;

/* JADX INFO: renamed from: uf0.f */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C34905f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f146989w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f146990x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC25312u f146991y;

    public /* synthetic */ C34905f(Function1 function1, InterfaceC25312u interfaceC25312u, int i13) {
        this.f146989w = i13;
        this.f146990x = function1;
        this.f146991y = interfaceC25312u;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f146989w) {
            case 0:
                return AbstractC34906g.m110074q(this.f146990x, this.f146991y, obj);
            case 1:
                return AbstractC36857e.m118181q(this.f146990x, this.f146991y, obj);
            case 2:
                return AbstractC38537f.m123472p(this.f146990x, this.f146991y, obj);
            case 3:
                return AbstractC38537f.m123470n(this.f146990x, this.f146991y, obj);
            case 4:
                return AbstractC39518g.m126212q(this.f146990x, this.f146991y, obj);
            case 5:
                return AbstractC39518g.m126210o(this.f146990x, this.f146991y, obj);
            case 6:
                return AbstractC40029h.m128340q(this.f146990x, this.f146991y, obj);
            case 7:
                return AbstractC40163i.m128881n(this.f146991y, this.f146990x, obj);
            case 8:
                return AbstractC41208a.m133876n(this.f146991y, this.f146990x, obj);
            default:
                return AbstractC41231d.m133936o(this.f146991y, this.f146990x, obj);
        }
    }

    public /* synthetic */ C34905f(InterfaceC25312u interfaceC25312u, Function1 function1, int i13) {
        this.f146989w = i13;
        this.f146991y = interfaceC25312u;
        this.f146990x = function1;
    }
}
