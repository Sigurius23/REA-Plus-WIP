package t23;

import c93.InterfaceC4339a;
import org.webrtc.SurfaceTextureHelper;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: t23.u1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33461u1 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C33476x1 f139722w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33461u1(C33476x1 c33476x1) {
        super(0);
        this.f139722w = c33476x1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        SurfaceTextureHelper surfaceTextureHelper = this.f139722w.f139757e.f139346c;
        if (surfaceTextureHelper != null) {
            return surfaceTextureHelper;
        }
        AbstractC22676k.m65757q("surfaceTextureHelper");
        throw null;
    }
}
