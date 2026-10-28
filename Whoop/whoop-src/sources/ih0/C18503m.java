package ih0;

import ah0.C0888i;
import c93.InterfaceC4339a;
import p390p1.InterfaceC28670t2;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ih0.m */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C18503m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72087w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f72088x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f72089y;

    public /* synthetic */ C18503m(int i13, Object obj, Object obj2) {
        this.f72087w = i13;
        this.f72088x = obj;
        this.f72089y = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f72087w) {
            case 0:
                return Integer.valueOf(AbstractC18504n.a.m53628h((InterfaceC28670t2) this.f72088x, (InterfaceC39171c) this.f72089y));
            default:
                return AbstractC18491e0.m53459Y0((C0888i.a) this.f72088x, (Function1) this.f72089y);
        }
    }
}
