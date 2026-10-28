package dp0;

import p390p1.C28624i0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: dp0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C12245a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40956w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC12251g f40957x;

    public /* synthetic */ C12245a(InterfaceC12251g interfaceC12251g, int i13) {
        this.f40956w = i13;
        this.f40957x = interfaceC12251g;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f40956w) {
            case 0:
                return AbstractC12247c.m34101f(this.f40957x, (C28624i0) obj);
            default:
                return AbstractC12247c.m34104i(this.f40957x, (C28624i0) obj);
        }
    }
}
