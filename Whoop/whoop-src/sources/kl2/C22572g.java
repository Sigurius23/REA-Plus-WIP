package kl2;

import c93.InterfaceC4339a;
import nl2.C26816c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kl2.g */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C22572g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f88816w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26816c.e f88817x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f88818y;

    public /* synthetic */ C22572g(C26816c.e eVar, Function1 function1, int i13) {
        this.f88816w = i13;
        this.f88817x = eVar;
        this.f88818y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f88816w) {
            case 0:
                return AbstractC22576k.m65339B(this.f88817x, this.f88818y);
            default:
                return AbstractC22576k.m65348K(this.f88817x, this.f88818y);
        }
    }
}
