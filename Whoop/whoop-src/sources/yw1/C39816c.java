package yw1;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import uw1.C35310c;

/* JADX INFO: renamed from: yw1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C39816c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f171581w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35310c.b f171582x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f171583y;

    public /* synthetic */ C39816c(C35310c.b bVar, Function1 function1, int i13) {
        this.f171581w = i13;
        this.f171582x = bVar;
        this.f171583y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f171581w) {
            case 0:
                return AbstractC39817d.m127662j(this.f171582x, this.f171583y);
            case 1:
                return AbstractC39817d.m127663k(this.f171582x, this.f171583y);
            default:
                return AbstractC39817d.m127659g(this.f171582x, this.f171583y);
        }
    }
}
