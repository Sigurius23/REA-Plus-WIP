package id2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.share.view.WhoopShareFragment;
import fd2.EnumC14407e;
import l83.InterfaceC23462h;

/* JADX INFO: renamed from: id2.l */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C18427l implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f71677w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f71678x;

    public /* synthetic */ C18427l(Object obj, int i13) {
        this.f71677w = i13;
        this.f71678x = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f71677w) {
            case 0:
                return AbstractC18429n.m53070w((InterfaceC4351m) this.f71678x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return WhoopShareFragment.m25821I((WhoopShareFragment) this.f71678x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC18435t.m53100Y((InterfaceC23462h) this.f71678x, ((Long) obj).longValue(), (EnumC14407e) obj2);
        }
    }
}
