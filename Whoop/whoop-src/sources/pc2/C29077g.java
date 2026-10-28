package pc2;

import com.whoop.data.repositories.FeatureFlagChecker;
import java.util.List;
import p705ea2.AbstractC12922s;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qc2.AbstractC30221c;

/* JADX INFO: renamed from: pc2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lpc2/g;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lpc2/b;", "result", "Lpc2/f;", "a", "(Lpc2/b;)Lpc2/f;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29077g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C29077g(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    public final C29076f m88401a(AbstractC29072b result) {
        int i13;
        List<AbstractC30221c> listM88403b;
        AbstractC22676k.m65750j(result, "result");
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled("maverick-regulatory-labels-android");
        if (!(result instanceof AbstractC29072b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC29072b.a aVar = (AbstractC29072b.a) result;
        if (aVar.getStrap().isGen4()) {
            i13 = AbstractC12922s.f44637w0;
        } else if (aVar.getStrap().isMaverick() && zIsFeatureEnabled) {
            i13 = AbstractC12922s.f44641y0;
        } else {
            i13 = (aVar.getStrap().isGoose() && zIsFeatureEnabled) ? AbstractC12922s.f44639x0 : AbstractC12922s.f44635v0;
        }
        if (aVar.getStrap().isGen4()) {
            listM88403b = AbstractC29078h.m88402a();
        } else if (aVar.getStrap().isMaverick() && zIsFeatureEnabled) {
            listM88403b = AbstractC29078h.m88404c();
        } else {
            listM88403b = (aVar.getStrap().isGoose() && zIsFeatureEnabled) ? AbstractC29078h.m88403b() : AbstractC29078h.m88402a();
        }
        return new C29076f(i13, listM88403b);
    }
}
