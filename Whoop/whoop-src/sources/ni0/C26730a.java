package ni0;

import c93.InterfaceC4339a;
import com.whoop.navigation.CachePolicyModel;

/* JADX INFO: renamed from: ni0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26730a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f106336w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CachePolicyModel f106337x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f106338y;

    public /* synthetic */ C26730a(CachePolicyModel cachePolicyModel, String str, int i13) {
        this.f106336w = i13;
        this.f106337x = cachePolicyModel;
        this.f106338y = str;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f106336w) {
            case 0:
                return C26732c.m79584r0(this.f106337x, this.f106338y);
            case 1:
                return C26732c.m79562g0(this.f106337x, this.f106338y);
            default:
                return C26732c.m79558e0(this.f106337x, this.f106338y);
        }
    }
}
