package p132f0;

import l83.C23454a0;
import p005a3.InterfaceC0240p2;
import p133f1.C13972r;
import p180h0.C16418l2;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;

/* JADX INFO: renamed from: f0.u */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13828u implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49350w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22659b0 f49351x;

    public /* synthetic */ C13828u(C22659b0 c22659b0, int i13) {
        this.f49350w = i13;
        this.f49351x = c22659b0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z4;
        switch (this.f49350w) {
            case 0:
                InterfaceC0240p2 interfaceC0240p2 = (InterfaceC0240p2) obj;
                C22659b0 c22659b0 = this.f49351x;
                if (c22659b0.f89329w) {
                    z4 = true;
                } else {
                    AbstractC22676k.m65748h(interfaceC0240p2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                    if (((C16418l2) interfaceC0240p2).f63091O) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                c22659b0.f89329w = z4;
                return Boolean.valueOf(!z4);
            default:
                if (((C13972r) obj).f49820f.f92227a.f92216a.f92135x.length() > 0) {
                    this.f49351x.f89329w = false;
                }
                return C23454a0.f92919a;
        }
    }
}
