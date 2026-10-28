package mx1;

import c93.InterfaceC4339a;
import jx1.C22016g;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mx1.g */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26001g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f102785w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f102786x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C22016g f102787y;

    public /* synthetic */ C26001g(Function1 function1, C22016g c22016g, int i13) {
        this.f102785w = i13;
        this.f102786x = function1;
        this.f102787y = c22016g;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f102785w) {
            case 0:
                return AbstractC26004j.m77202x(this.f102786x, this.f102787y);
            case 1:
                return AbstractC26004j.m77198t(this.f102786x, this.f102787y);
            case 2:
                return AbstractC26007m.m77224P(this.f102786x, this.f102787y);
            default:
                return AbstractC26012r.m77299h(this.f102786x, this.f102787y);
        }
    }
}
