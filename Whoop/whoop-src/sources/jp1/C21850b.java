package jp1;

import c93.InterfaceC4339a;
import cp1.EnumC11017d;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jp1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C21850b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84392w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ EnumC11017d f84393x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f84394y;

    public /* synthetic */ C21850b(EnumC11017d enumC11017d, Function1 function1, int i13) {
        this.f84392w = i13;
        this.f84393x = enumC11017d;
        this.f84394y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f84392w) {
            case 0:
                return AbstractC21854f.m61851l(this.f84393x, this.f84394y);
            case 1:
                return AbstractC21855g.m61879r(this.f84393x, this.f84394y);
            default:
                return AbstractC21855g.m61884w(this.f84393x, this.f84394y);
        }
    }
}
