package n72;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.sage.design.sagemeter.SageGaugeModel;
import jb1.C21536b;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: n72.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C26438a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f105017w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ FeatureFlagChecker f105018x;

    public /* synthetic */ C26438a(int i13, FeatureFlagChecker featureFlagChecker) {
        this.f105017w = i13;
        this.f105018x = featureFlagChecker;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f105017w) {
            case 0:
                return AbstractC26440c.m78272g(this.f105018x, (C21536b) obj);
            case 1:
                return AbstractC26440c.m78275j(this.f105018x, (C23749z0) obj);
            default:
                return AbstractC26440c.m78276k(this.f105018x, (SageGaugeModel) obj);
        }
    }
}
