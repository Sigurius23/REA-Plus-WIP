package a80;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import y70.C39267c;

/* JADX INFO: renamed from: a80.d */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0540d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1866w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39267c.b f1867x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f1868y;

    public /* synthetic */ C0540d(C39267c.b bVar, Function1 function1, int i13) {
        this.f1866w = i13;
        this.f1867x = bVar;
        this.f1868y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f1866w) {
            case 0:
                return AbstractC0541e.m1326k(this.f1867x, this.f1868y);
            case 1:
                return AbstractC0541e.m1327l(this.f1867x, this.f1868y);
            case 2:
                return AbstractC0541e.m1328m(this.f1867x, this.f1868y);
            default:
                return AbstractC0541e.m1323h(this.f1867x, this.f1868y);
        }
    }
}
