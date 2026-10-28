package ih0;

import p164g2.InterfaceC15250v;
import p390p1.InterfaceC28601c1;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ih0.h */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18496h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72036w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f72037x;

    public /* synthetic */ C18496h(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f72036w = i13;
        this.f72037x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f72036w) {
            case 0:
                return AbstractC18502l.m53569P(this.f72037x, ((Float) obj).floatValue());
            case 1:
                return AbstractC18504n.m53625n(this.f72037x, (InterfaceC15250v) obj);
            default:
                return AbstractC18504n.m53626o(this.f72037x, (C39180l) obj);
        }
    }
}
