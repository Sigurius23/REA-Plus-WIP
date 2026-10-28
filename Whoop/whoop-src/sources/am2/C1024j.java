package am2;

import android.net.Uri;
import e81.AbstractC12823d0;
import gv1.AbstractC16233g;
import h01.AbstractC16552s;
import mq2.AbstractC25894g;
import p163g1.EnumC15209z3;
import p164g2.InterfaceC15250v;
import p294l3.C23277r0;
import p390p1.InterfaceC28601c1;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;
import p748zc1.AbstractC40358i5;
import rm1.AbstractC31594h;
import rm1.AbstractC31595i;
import w80.AbstractC36941b;

/* JADX INFO: renamed from: am2.j */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1024j implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3843w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f3844x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f3845y;

    public /* synthetic */ C1024j(int i13, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f3843w = i13;
        this.f3844x = interfaceC28601c1;
        this.f3845y = interfaceC28601c2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3843w) {
            case 0:
                return Boolean.valueOf(AbstractC1026k.m2735I(this.f3844x, this.f3845y, (EnumC15209z3) obj));
            case 1:
                return AbstractC1026k.m2739M(this.f3844x, this.f3845y, obj);
            case 2:
                return AbstractC12823d0.m35946o(this.f3844x, this.f3845y, (Integer) obj);
            case 3:
                return AbstractC16233g.m45985x(this.f3844x, this.f3845y, (Uri) obj);
            case 4:
                return AbstractC16552s.m46826o(this.f3844x, this.f3845y, (C23277r0) obj);
            case 5:
                return AbstractC25894g.m76597s(this.f3844x, this.f3845y, (InterfaceC39147y) obj);
            case 6:
                return AbstractC25894g.m76598t(this.f3844x, this.f3845y, ((Float) obj).floatValue());
            case 7:
                return AbstractC31594h.m97400C(this.f3844x, this.f3845y, ((Float) obj).floatValue());
            case 8:
                return AbstractC31594h.m97402E(this.f3844x, this.f3845y, ((Float) obj).floatValue());
            case 9:
                return AbstractC31595i.m97472u(this.f3844x, this.f3845y, ((Boolean) obj).booleanValue());
            case 10:
                return AbstractC36941b.m118559D(this.f3844x, this.f3845y, (InterfaceC15250v) obj);
            case 11:
                return AbstractC40358i5.m129956R(this.f3844x, this.f3845y, ((Boolean) obj).booleanValue());
            case 12:
                return AbstractC40358i5.m129957S(this.f3844x, this.f3845y, ((Boolean) obj).booleanValue());
            case 13:
                return AbstractC40358i5.m129985y(this.f3844x, this.f3845y, ((Boolean) obj).booleanValue());
            default:
                return AbstractC40358i5.m129986z(this.f3844x, this.f3845y, ((Boolean) obj).booleanValue());
        }
    }
}
