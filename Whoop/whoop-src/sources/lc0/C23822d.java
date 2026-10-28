package lc0;

import c93.InterfaceC4339a;
import jc0.C21604d;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lc0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C23822d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94228w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21604d.a f94229x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f94230y;

    public /* synthetic */ C23822d(C21604d.a aVar, Function1 function1, int i13) {
        this.f94228w = i13;
        this.f94229x = aVar;
        this.f94230y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f94228w) {
            case 0:
                return AbstractC23823e.m69952m(this.f94229x, this.f94230y);
            case 1:
                return AbstractC23823e.m69953n(this.f94229x, this.f94230y);
            case 2:
                return AbstractC23823e.m69954o(this.f94229x, this.f94230y);
            default:
                return AbstractC23823e.m69948i(this.f94229x, this.f94230y);
        }
    }
}
