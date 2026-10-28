package ln1;

import com.whoop.homecustomization.view.CustomizeOverviewFragment;
import hn1.InterfaceC17515a;
import hn1.InterfaceC17516b;
import in1.InterfaceC18722b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ln1.f */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24528f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95693w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f95694x;

    public /* synthetic */ C24528f(Object obj, int i13) {
        this.f95693w = i13;
        this.f95694x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f95693w) {
            case 0:
                return CustomizeOverviewFragment.m21901J((CustomizeOverviewFragment) this.f95694x, (InterfaceC18722b) obj);
            case 1:
                return CustomizeOverviewFragment.m21902K((CustomizeOverviewFragment) this.f95694x, (InterfaceC17516b) obj);
            case 2:
                return CustomizeOverviewFragment.m21903L((CustomizeOverviewFragment) this.f95694x, (InterfaceC17515a) obj);
            default:
                return AbstractC24539q.m71496G((Function1) this.f95694x, (C24526d) obj);
        }
    }
}
