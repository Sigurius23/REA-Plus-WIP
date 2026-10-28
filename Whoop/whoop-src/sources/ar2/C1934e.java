package ar2;

import c93.InterfaceC4339a;
import eg2.AbstractC13176i;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import y21.AbstractC39162i;

/* JADX INFO: renamed from: ar2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1934e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7678w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f7679x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f7680y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f7681z;

    public /* synthetic */ C1934e(String str, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        this.f7679x = str;
        this.f7681z = function1;
        this.f7680y = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f7678w) {
            case 0:
                return AbstractC1936g.m5933g(this.f7681z, this.f7679x, this.f7680y);
            case 1:
                return AbstractC13176i.m36957O(this.f7679x, this.f7680y, this.f7681z);
            default:
                return AbstractC39162i.m124730u(this.f7679x, this.f7681z, this.f7680y);
        }
    }

    public /* synthetic */ C1934e(String str, InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
        this.f7679x = str;
        this.f7680y = interfaceC28601c1;
        this.f7681z = function1;
    }

    public /* synthetic */ C1934e(Function1 function1, String str, InterfaceC28601c1 interfaceC28601c1) {
        this.f7681z = function1;
        this.f7679x = str;
        this.f7680y = interfaceC28601c1;
    }
}
