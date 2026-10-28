package b30;

import android.os.Bundle;
import e30.AbstractC12605c;
import o73.C27648a;
import p003a1.C0103b;
import p027b3.AbstractC2378g1;
import p108e4.AbstractC12667a;
import p314m.AbstractActivityC24852m;

/* JADX INFO: renamed from: b30.j */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractActivityC2546j extends AbstractActivityC24852m {
    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        AbstractC2378g1.m7328c(this);
    }

    /* JADX INFO: renamed from: o */
    public abstract AbstractC12605c mo7466o();

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC12667a.m35444P(this);
        C27648a.m83591n(getOnBackPressedDispatcher(), null, new C0103b(this, 14), 3);
    }
}
