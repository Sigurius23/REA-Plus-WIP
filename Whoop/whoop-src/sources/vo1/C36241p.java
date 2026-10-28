package vo1;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import so1.C32825l0;

/* JADX INFO: renamed from: vo1.p */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C36241p implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f155201w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f155202x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C32825l0 f155203y;

    public /* synthetic */ C36241p(Function1 function1, C32825l0 c32825l0, int i13) {
        this.f155201w = i13;
        this.f155202x = function1;
        this.f155203y = c32825l0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f155201w) {
            case 0:
                return AbstractC36243r.m115512V(this.f155202x, this.f155203y);
            default:
                return C36250y.m115650d(this.f155202x, this.f155203y);
        }
    }
}
