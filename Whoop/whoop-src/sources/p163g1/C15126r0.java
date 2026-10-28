package p163g1;

import androidx.compose.material.AbstractC1118c;
import c93.InterfaceC4339a;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: g1.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15126r0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56677w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC39171c f56678x;

    public /* synthetic */ C15126r0(int i13, InterfaceC39171c interfaceC39171c) {
        this.f56677w = i13;
        this.f56678x = interfaceC39171c;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        float fMo743q0;
        switch (this.f56677w) {
            case 0:
                fMo743q0 = this.f56678x.mo743q0(AbstractC15108p2.f56603b);
                break;
            case 1:
                fMo743q0 = this.f56678x.mo743q0(AbstractC1118c.f4723b);
                break;
            default:
                fMo743q0 = this.f56678x.mo743q0(125);
                break;
        }
        return Float.valueOf(fMo743q0);
    }
}
