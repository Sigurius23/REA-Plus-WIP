package ve2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import ue2.InterfaceC34861a;

/* JADX INFO: renamed from: ve2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C35928a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f153005w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC34861a f153006x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f153007y;

    public /* synthetic */ C35928a(Function1 function1, InterfaceC34861a interfaceC34861a) {
        this.f153007y = function1;
        this.f153006x = interfaceC34861a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f153005w) {
            case 0:
                return AbstractC35929b.m114174k(this.f153007y, this.f153006x);
            default:
                return AbstractC35929b.m114175l(this.f153006x, this.f153007y);
        }
    }

    public /* synthetic */ C35928a(InterfaceC34861a interfaceC34861a, Function1 function1) {
        this.f153006x = interfaceC34861a;
        this.f153007y = function1;
    }
}
