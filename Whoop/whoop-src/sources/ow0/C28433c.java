package ow0;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ow0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C28433c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114658w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f114659x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C28431a f114660y;

    public /* synthetic */ C28433c(Function1 function1, C28431a c28431a) {
        this.f114659x = function1;
        this.f114660y = c28431a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f114658w) {
            case 0:
                return AbstractC28434d.m86163g(this.f114660y, this.f114659x);
            default:
                return AbstractC28434d.m86164h(this.f114659x, this.f114660y);
        }
    }

    public /* synthetic */ C28433c(C28431a c28431a, Function1 function1) {
        this.f114660y = c28431a;
        this.f114659x = function1;
    }
}
