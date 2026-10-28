package am2;

import mf2.AbstractC25515f;
import o11.AbstractC27406l;
import o42.AbstractC27531k;
import p209i3.InterfaceC18044z;
import p715kotlin.jvm.functions.Function1;
import sy0.AbstractC33084g;
import sy0.AbstractC33093p;
import yb0.AbstractC39384g;

/* JADX INFO: renamed from: am2.f0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1017f0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3809w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f3810x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f3811y;

    public /* synthetic */ C1017f0(Function1 function1, boolean z4, int i13) {
        this.f3809w = i13;
        this.f3810x = function1;
        this.f3811y = z4;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3809w) {
            case 0:
                return AbstractC1035o0.m2842Q0(this.f3810x, this.f3811y, obj);
            case 1:
                return AbstractC25515f.m75052g0(this.f3810x, this.f3811y, ((Boolean) obj).booleanValue());
            case 2:
                return AbstractC27406l.m82646G(this.f3811y, this.f3810x, (InterfaceC18044z) obj);
            case 3:
                return AbstractC27531k.m82971E(this.f3810x, this.f3811y, ((Boolean) obj).booleanValue());
            case 4:
                return AbstractC27531k.m82972F(this.f3810x, this.f3811y, ((Boolean) obj).booleanValue());
            case 5:
                return AbstractC33084g.m104808e(this.f3810x, this.f3811y, ((Boolean) obj).booleanValue());
            case 6:
                return AbstractC33093p.m104850d(this.f3810x, this.f3811y, ((Boolean) obj).booleanValue());
            default:
                return AbstractC39384g.m125611O(this.f3811y, this.f3810x, (String) obj);
        }
    }

    public /* synthetic */ C1017f0(boolean z4, Function1 function1, int i13) {
        this.f3809w = i13;
        this.f3811y = z4;
        this.f3810x = function1;
    }
}
