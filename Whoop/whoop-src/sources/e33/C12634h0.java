package e33;

import c93.InterfaceC4339a;
import f33.C14048a;
import org.webrtc.EglBase;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: e33.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12634h0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C12638j0 f43144w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12634h0(C12638j0 c12638j0) {
        super(0);
        this.f43144w = c12638j0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        return new C14048a(((EglBase) this.f43144w.f43154d.invoke()).getEglBaseContext());
    }
}
