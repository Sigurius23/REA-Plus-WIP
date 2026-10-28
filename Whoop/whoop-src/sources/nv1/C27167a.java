package nv1;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: nv1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27167a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f108723w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f108724x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C27174h f108725y;

    public /* synthetic */ C27167a(Function1 function1, C27174h c27174h, int i13) {
        this.f108723w = i13;
        this.f108724x = function1;
        this.f108725y = c27174h;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f108723w) {
            case 0:
                return AbstractC27169c.m81711x(this.f108724x, this.f108725y);
            case 1:
                return AbstractC27169c.m81710w(this.f108724x, this.f108725y);
            default:
                return AbstractC27173g.m81729f(this.f108724x, this.f108725y);
        }
    }
}
