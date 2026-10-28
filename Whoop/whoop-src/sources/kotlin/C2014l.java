package kotlin;

import b01.AbstractC2195p;
import bs1.AbstractC3587f;
import c93.InterfaceC4339a;
import g32.AbstractC15311k;
import kd0.InterfaceC22381a;
import kf0.AbstractC22431f;
import p31.AbstractC28799j;
import p715kotlin.jvm.functions.Function1;
import qj2.AbstractC30437b;

/* JADX INFO: renamed from: at2.l */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2014l implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7992w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f7993x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f7994y;

    public /* synthetic */ C2014l(InterfaceC4339a interfaceC4339a, Function1 function1, int i13) {
        this.f7992w = i13;
        this.f7993x = interfaceC4339a;
        this.f7994y = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7992w) {
            case 0:
                return AbstractC2016m.m6283v0(this.f7993x, this.f7994y, obj);
            case 1:
                return AbstractC2195p.m6905G(this.f7993x, this.f7994y, obj);
            case 2:
                return AbstractC3587f.m10941l(this.f7994y, this.f7993x, obj);
            case 3:
                return AbstractC15311k.m43468N(this.f7994y, this.f7993x, (AbstractC28799j) obj);
            case 4:
                return AbstractC22431f.m64653a0(this.f7993x, this.f7994y, (InterfaceC22381a) obj);
            case 5:
                return AbstractC30437b.m93107l(this.f7994y, this.f7993x, obj);
            default:
                return p743vy1.Function1.m117564u(this.f7993x, this.f7994y, ((Boolean) obj).booleanValue());
        }
    }

    public /* synthetic */ C2014l(Function1 function1, InterfaceC4339a interfaceC4339a, int i13) {
        this.f7992w = i13;
        this.f7994y = function1;
        this.f7993x = interfaceC4339a;
    }
}
