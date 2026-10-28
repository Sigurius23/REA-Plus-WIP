package p377or;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;
import p474s.C32018v1;

/* JADX INFO: renamed from: or.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C28131e extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f113768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f113769b;

    public /* synthetic */ C28131e(Object obj, int i13) {
        this.f113768a = i13;
        this.f113769b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f113768a) {
            case 0:
                ((TabLayout) this.f113769b).m15789i();
                break;
            default:
                C32018v1 c32018v1 = (C32018v1) this.f113769b;
                if (c32018v1.f132871Z.isShowing()) {
                    c32018v1.mo94785c();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f113768a) {
            case 0:
                ((TabLayout) this.f113769b).m15789i();
                break;
            default:
                ((C32018v1) this.f113769b).dismiss();
                break;
        }
    }
}
