package p370oj;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p026b2.C2320z;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: oj.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C27959f extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f112756w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2320z f112757x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27959f(C2320z c2320z, int i13) {
        super(0);
        this.f112756w = i13;
        this.f112757x = c2320z;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() throws InterruptedException {
        switch (this.f112756w) {
            case 0:
                this.f112757x.invoke(Boolean.TRUE);
                break;
            case 1:
                this.f112757x.invoke(Boolean.TRUE);
                break;
            default:
                this.f112757x.invoke(Boolean.FALSE);
                break;
        }
        return C23454a0.f92919a;
    }
}
