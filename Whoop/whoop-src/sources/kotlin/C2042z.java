package kotlin;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import ys2.AbstractC39758e;

/* JADX INFO: renamed from: at2.z */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2042z implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8107w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f8108x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC39758e.j f8109y;

    public /* synthetic */ C2042z(Function1 function1, AbstractC39758e.j jVar, int i13) {
        this.f8107w = i13;
        this.f8108x = function1;
        this.f8109y = jVar;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f8107w) {
            case 0:
                return AbstractC1993c0.m6089t(this.f8108x, this.f8109y);
            default:
                return AbstractC1993c0.m6049A(this.f8108x, this.f8109y);
        }
    }
}
