package no0;

import c93.InterfaceC4339a;
import lo0.C24571b0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: no0.b0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26936b0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107458w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C24571b0.a f107459x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f107460y;

    public /* synthetic */ C26936b0(C24571b0.a aVar, Function1 function1, int i13) {
        this.f107458w = i13;
        this.f107459x = aVar;
        this.f107460y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f107458w) {
            case 0:
                return AbstractC26939c0.m80454m(this.f107459x, this.f107460y);
            case 1:
                return AbstractC26939c0.m80455n(this.f107459x, this.f107460y);
            case 2:
                return AbstractC26939c0.m80456o(this.f107459x, this.f107460y);
            default:
                return AbstractC26939c0.m80450i(this.f107459x, this.f107460y);
        }
    }
}
