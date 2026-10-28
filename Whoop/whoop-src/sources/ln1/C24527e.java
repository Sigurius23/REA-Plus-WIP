package ln1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.homecustomization.view.CustomizeOverviewFragment;
import p390p1.InterfaceC28601c1;
import p711j31.C21273d;

/* JADX INFO: renamed from: ln1.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24527e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95691w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f95692x;

    public /* synthetic */ C24527e(Object obj, int i13) {
        this.f95691w = i13;
        this.f95692x = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f95691w) {
            case 0:
                return CustomizeOverviewFragment.m21899H((CustomizeOverviewFragment) this.f95692x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return Boolean.valueOf(AbstractC24533k.m71461o((InterfaceC28601c1) this.f95692x, 1, (C21273d) obj, (C21273d) obj2));
        }
    }
}
