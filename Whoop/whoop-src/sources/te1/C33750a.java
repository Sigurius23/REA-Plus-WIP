package te1;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import z21.AbstractC40021c;

/* JADX INFO: renamed from: te1.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C33750a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f141238w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f141239x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f141240y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f141241z;

    public /* synthetic */ C33750a(Function1 function1, int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f141241z = function1;
        this.f141240y = i13;
        this.f141239x = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f141238w) {
            case 0:
                return AbstractC33751b.m106716q(this.f141241z, this.f141240y, this.f141239x);
            default:
                return AbstractC40021c.m128285h(this.f141239x, this.f141240y, this.f141241z);
        }
    }

    public /* synthetic */ C33750a(InterfaceC28601c1 interfaceC28601c1, int i13, Function1 function1) {
        this.f141239x = interfaceC28601c1;
        this.f141240y = i13;
        this.f141241z = function1;
    }
}
