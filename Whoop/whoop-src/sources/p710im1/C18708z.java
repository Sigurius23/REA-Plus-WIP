package p710im1;

import com.whoop.home.view.HomeFragment;
import em1.InterfaceC13346t;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: im1.z */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C18708z implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73470w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ HomeFragment f73471x;

    public /* synthetic */ C18708z(HomeFragment homeFragment, int i13) {
        this.f73470w = i13;
        this.f73471x = homeFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73470w) {
            case 0:
                return HomeFragment.m21851q2(this.f73471x, (InterfaceC13346t) obj);
            default:
                return HomeFragment.m21788V1(this.f73471x, (InterfaceC13346t) obj);
        }
    }
}
