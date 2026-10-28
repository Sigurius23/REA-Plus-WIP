package kotlin;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import ys2.AbstractC39758e;

/* JADX INFO: renamed from: at2.p */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2022p implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8018w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f8019x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC39758e.i f8020y;

    public /* synthetic */ C2022p(Function1 function1, AbstractC39758e.i iVar, int i13) {
        this.f8018w = i13;
        this.f8019x = function1;
        this.f8020y = iVar;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f8018w) {
            case 0:
                return AbstractC2036w.m6404w(this.f8019x, this.f8020y);
            default:
                return AbstractC2036w.m6371K(this.f8019x, this.f8020y);
        }
    }
}
