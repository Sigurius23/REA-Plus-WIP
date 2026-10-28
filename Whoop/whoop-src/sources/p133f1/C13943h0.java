package p133f1;

import l83.C23454a0;
import p181h2.C16617b;
import p510u0.InterfaceC34310d1;
import p512u2.AbstractC34454d0;
import p512u2.C34472r;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: f1.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13943h0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49708w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC34310d1 f49709x;

    public /* synthetic */ C13943h0(InterfaceC34310d1 interfaceC34310d1, int i13) {
        this.f49708w = i13;
        this.f49709x = interfaceC34310d1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f49708w) {
            case 0:
                C34472r c34472r = (C34472r) obj;
                this.f49709x.mo35185d(AbstractC34454d0.m108920k(c34472r, false));
                c34472r.m108946a();
                break;
            default:
                this.f49709x.mo35183b(((C16617b) obj).f63937a);
                break;
        }
        return C23454a0.f92919a;
    }
}
