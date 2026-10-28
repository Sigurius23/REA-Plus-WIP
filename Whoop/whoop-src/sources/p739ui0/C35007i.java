package p739ui0;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import ri0.C31446e;

/* JADX INFO: renamed from: ui0.i */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C35007i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f148083w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31446e.b f148084x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f148085y;

    public /* synthetic */ C35007i(C31446e.b bVar, Function1 function1, int i13) {
        this.f148083w = i13;
        this.f148084x = bVar;
        this.f148085y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f148083w) {
            case 0:
                return AbstractC35009k.m110547n(this.f148084x, this.f148085y);
            case 1:
                return AbstractC35009k.m110548o(this.f148084x, this.f148085y);
            case 2:
                return AbstractC35009k.m110549p(this.f148084x, this.f148085y);
            default:
                return AbstractC35009k.m110544k(this.f148084x, this.f148085y);
        }
    }
}
