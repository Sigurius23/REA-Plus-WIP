package wi0;

import c93.InterfaceC4339a;
import com.whoop.archv2.feature.view.playground.PlaygroundFragment;

/* JADX INFO: renamed from: wi0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C37310b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f159527w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PlaygroundFragment f159528x;

    public /* synthetic */ C37310b(PlaygroundFragment playgroundFragment, int i13) {
        this.f159527w = i13;
        this.f159528x = playgroundFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f159527w) {
            case 0:
                return PlaygroundFragment.m18077E(this.f159528x);
            default:
                return PlaygroundFragment.m18080H(this.f159528x);
        }
    }
}
