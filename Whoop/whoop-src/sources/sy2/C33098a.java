package sy2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: sy2.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C33098a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138065w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f138066x;

    public /* synthetic */ C33098a(Function1 function1, int i13) {
        this.f138065w = i13;
        this.f138066x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f138065w) {
            case 0:
                return AbstractC33099b.m104866f(this.f138066x);
            case 1:
                return AbstractC33102e.m104887s(this.f138066x);
            case 2:
                return AbstractC33103f.m104900f(this.f138066x);
            case 3:
                return AbstractC33108k.m104917p(this.f138066x);
            case 4:
                return AbstractC33110m.m104937l(this.f138066x);
            case 5:
                return AbstractC33111n.m104944f(this.f138066x);
            case 6:
                return AbstractC33113p.m104959m(this.f138066x);
            case 7:
                return AbstractC33114q.m104978f(this.f138066x);
            default:
                return AbstractC33117t.m105004r(this.f138066x);
        }
    }
}
