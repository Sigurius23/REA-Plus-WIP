package xp2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import vp2.C36276c;

/* JADX INFO: renamed from: xp2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C38534c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f165840w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C36276c.b f165841x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f165842y;

    public /* synthetic */ C38534c(C36276c.b bVar, Function1 function1, int i13) {
        this.f165840w = i13;
        this.f165841x = bVar;
        this.f165842y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f165840w) {
            case 0:
                return AbstractC38535d.m123448k(this.f165841x, this.f165842y);
            case 1:
                return AbstractC38535d.m123449l(this.f165841x, this.f165842y);
            case 2:
                return AbstractC38535d.m123450m(this.f165841x, this.f165842y);
            default:
                return AbstractC38535d.m123445h(this.f165841x, this.f165842y);
        }
    }
}
