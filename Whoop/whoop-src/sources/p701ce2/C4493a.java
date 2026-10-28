package p701ce2;

import be2.InterfaceC3175b;
import bt1.InterfaceC3621b;
import ge2.InterfaceC15739d;
import gf1.AbstractC15790i;
import l83.InterfaceC23462h;
import me2.InterfaceC25473a;
import nt1.InterfaceC27122a;
import p715kotlin.jvm.functions.Function1;
import pd2.InterfaceC29106b;
import qd2.AbstractC30295a;
import s32.AbstractC32114f;
import vt1.InterfaceC36487a;

/* JADX INFO: renamed from: ce2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C4493a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18095w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f18096x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC23462h f18097y;

    public /* synthetic */ C4493a(Function1 function1, InterfaceC23462h interfaceC23462h, int i13) {
        this.f18095w = i13;
        this.f18096x = function1;
        this.f18097y = interfaceC23462h;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18095w) {
            case 0:
                return Function1.m14079E(this.f18096x, this.f18097y, (InterfaceC3175b) obj);
            case 1:
                return p703ct1.Function1.m30060u(this.f18096x, this.f18097y, (InterfaceC3621b) obj);
            case 2:
                return AbstractC15790i.m44543m(this.f18096x, this.f18097y, obj);
            case 3:
                return p709he2.Function1.m48697K(this.f18096x, this.f18097y, (InterfaceC15739d) obj);
            case 4:
                return p722ne2.Function1.m79137s(this.f18096x, this.f18097y, (InterfaceC25473a) obj);
            case 5:
                return p725ot1.Function1.m85805Q(this.f18096x, this.f18097y, (InterfaceC27122a) obj);
            case 6:
                return AbstractC30295a.m92595y(this.f18096x, this.f18097y, (InterfaceC29106b) obj);
            case 7:
                return AbstractC32114f.m99966o(this.f18096x, this.f18097y, obj);
            default:
                return p744wt1.Function1.m120878q(this.f18096x, this.f18097y, (InterfaceC36487a) obj);
        }
    }
}
