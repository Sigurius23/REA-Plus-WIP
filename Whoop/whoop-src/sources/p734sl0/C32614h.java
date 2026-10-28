package p734sl0;

import live.hms.video.error.ErrorCodes;
import p164g2.InterfaceC15250v;
import p294l3.C23277r0;
import p390p1.InterfaceC28601c1;
import p412q3.C29891y;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: sl0.h */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32614h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135190w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f135191x;

    public /* synthetic */ C32614h(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f135190w = i13;
        this.f135191x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135190w) {
            case 0:
                return AbstractC32619i.m101818J(this.f135191x, ErrorCodes.InitAPIErrors.cServerErrors, (String) obj);
            case 1:
                return AbstractC32686w.m102501G(this.f135191x, (InterfaceC15250v) obj);
            case 2:
                return AbstractC32650o0.m102050A(this.f135191x, (InterfaceC15250v) obj);
            case 3:
                return AbstractC32611g1.m101766w(this.f135191x, ((Boolean) obj).booleanValue());
            case 4:
                return AbstractC32597d2.m101683L(this.f135191x, (C29891y) obj);
            case 5:
                return AbstractC32637l2.m101948X(this.f135191x, (C23277r0) obj);
            case 6:
                return AbstractC32681u2.m102451D(this.f135191x, (String) obj);
            case 7:
                return AbstractC32623i3.m101882p(this.f135191x, obj);
            case 8:
                return AbstractC32658p3.m102224x(this.f135191x, (InterfaceC39147y) obj);
            default:
                return AbstractC32658p3.m102192Q(this.f135191x, ((Float) obj).floatValue());
        }
    }
}
