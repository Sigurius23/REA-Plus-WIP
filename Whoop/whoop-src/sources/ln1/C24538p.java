package ln1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import ox2.AbstractC28462h;
import p163g1.C15199y3;
import p715kotlin.jvm.functions.Function1;
import pp2.AbstractC29441e;
import sv2.AbstractC33042e;

/* JADX INFO: renamed from: ln1.p */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24538p implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95751w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f95752x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC2994c0 f95753y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C15199y3 f95754z;

    public /* synthetic */ C24538p(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1, int i13) {
        this.f95751w = i13;
        this.f95753y = interfaceC2994c0;
        this.f95754z = c15199y3;
        this.f95752x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f95751w) {
            case 0:
                return AbstractC24539q.m71497H(this.f95753y, this.f95752x, this.f95754z);
            case 1:
                return AbstractC28462h.m86317B(this.f95752x, this.f95753y, this.f95754z);
            case 2:
                return AbstractC29441e.m89848w(this.f95753y, this.f95754z, this.f95752x);
            case 3:
                return AbstractC33042e.m104487Z(this.f95753y, this.f95752x, this.f95754z);
            default:
                return AbstractC33042e.m104483X(this.f95753y, this.f95754z, this.f95752x);
        }
    }

    public /* synthetic */ C24538p(InterfaceC2994c0 interfaceC2994c0, Function1 function1, C15199y3 c15199y3, int i13) {
        this.f95751w = i13;
        this.f95753y = interfaceC2994c0;
        this.f95752x = function1;
        this.f95754z = c15199y3;
    }

    public /* synthetic */ C24538p(Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        this.f95751w = 1;
        this.f95752x = function1;
        this.f95753y = interfaceC2994c0;
        this.f95754z = c15199y3;
    }
}
