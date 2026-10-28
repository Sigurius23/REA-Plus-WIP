package dn0;

import c93.InterfaceC4339a;
import g31.AbstractC15299c;
import kk1.AbstractC22546g;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import wr0.AbstractC37557u0;
import x31.AbstractC37947f;
import z21.AbstractC40020b;

/* JADX INFO: renamed from: dn0.l */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C12212l implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40840w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f40841x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f40842y;

    public /* synthetic */ C12212l(Function1 function1, int i13, int i14) {
        this.f40840w = i14;
        this.f40841x = function1;
        this.f40842y = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f40840w) {
            case 0:
                return AbstractC12216p.m33891R(this.f40841x, this.f40842y);
            case 1:
                return AbstractC15299c.m43424h(this.f40841x, this.f40842y);
            case 2:
                return AbstractC22546g.m65250o0(this.f40841x, this.f40842y);
            case 3:
                this.f40841x.invoke(Integer.valueOf(this.f40842y));
                return C23454a0.f92919a;
            case 4:
                return AbstractC37557u0.m120487I(this.f40841x, this.f40842y);
            case 5:
                return AbstractC37947f.m121499F(this.f40841x, this.f40842y);
            default:
                return AbstractC40020b.m128256i(this.f40841x, this.f40842y);
        }
    }
}
