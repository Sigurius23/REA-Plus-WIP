package lh2;

import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.whoop.stories.C10270c;
import n12.AbstractC26164a;
import tq1.C34083b;

/* JADX INFO: renamed from: lh2.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C24075f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95118w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractComponentCallbacksC1320m0 f95119x;

    public /* synthetic */ C24075f(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, int i13) {
        this.f95118w = i13;
        this.f95119x = abstractComponentCallbacksC1320m0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f95118w) {
            case 0:
                return C10270c.m26232s(this.f95119x);
            case 1:
                return AbstractC26164a.m77708c(this.f95119x);
            case 2:
                return AbstractC26164a.m77709d(this.f95119x);
            default:
                return C34083b.m107738b(this.f95119x);
        }
    }
}
