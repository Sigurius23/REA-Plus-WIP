package no1;

import c93.InterfaceC4339a;
import lo1.C24618c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: no1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26988b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107658w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C24618c.a f107659x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f107660y;

    public /* synthetic */ C26988b(C24618c.a aVar, Function1 function1, int i13) {
        this.f107658w = i13;
        this.f107659x = aVar;
        this.f107660y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f107658w) {
            case 0:
                return AbstractC26989c.m80943k(this.f107659x, this.f107660y);
            case 1:
                return AbstractC26989c.m80944l(this.f107659x, this.f107660y);
            case 2:
                return AbstractC26989c.m80945m(this.f107659x, this.f107660y);
            default:
                return AbstractC26989c.m80940h(this.f107659x, this.f107660y);
        }
    }
}
