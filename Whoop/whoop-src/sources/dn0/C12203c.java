package dn0;

import c93.InterfaceC4339a;
import j11.AbstractC21211n;
import nz0.AbstractC27304c;
import p734sl0.AbstractC32613g3;
import qy0.AbstractC30773f;
import xo1.AbstractC38493b;
import y11.AbstractC39058k;

/* JADX INFO: renamed from: dn0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C12203c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40771w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f40772x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f40773y;

    public /* synthetic */ C12203c(int i13, InterfaceC4339a interfaceC4339a, boolean z4) {
        this.f40771w = i13;
        this.f40772x = z4;
        this.f40773y = interfaceC4339a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f40771w) {
            case 0:
                return AbstractC12208h.m33843s(this.f40772x, this.f40773y);
            case 1:
                return AbstractC21211n.m59480C(this.f40772x, this.f40773y);
            case 2:
                return AbstractC27304c.m82402g(this.f40772x, this.f40773y);
            case 3:
                return AbstractC27304c.m82403h(this.f40772x, this.f40773y);
            case 4:
                return AbstractC30773f.m94550x(this.f40772x, this.f40773y);
            case 5:
                return AbstractC32613g3.m101804y(this.f40772x, this.f40773y);
            case 6:
                return AbstractC38493b.m123360w(this.f40772x, this.f40773y);
            case 7:
                return AbstractC39058k.m124518j(this.f40772x, this.f40773y);
            default:
                return AbstractC39058k.m124519k(this.f40772x, this.f40773y);
        }
    }
}
