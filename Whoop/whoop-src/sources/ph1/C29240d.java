package ph1;

import c93.InterfaceC4339a;
import nh1.C26722c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ph1.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C29240d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118323w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26722c.b f118324x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f118325y;

    public /* synthetic */ C29240d(C26722c.b bVar, Function1 function1, int i13) {
        this.f118323w = i13;
        this.f118324x = bVar;
        this.f118325y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f118323w) {
            case 0:
                return AbstractC29241e.m88762m(this.f118324x, this.f118325y);
            case 1:
                return AbstractC29241e.m88763n(this.f118324x, this.f118325y);
            case 2:
                return AbstractC29241e.m88764o(this.f118324x, this.f118325y);
            default:
                return AbstractC29241e.m88758i(this.f118324x, this.f118325y);
        }
    }
}
