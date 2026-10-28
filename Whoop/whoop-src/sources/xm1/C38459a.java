package xm1;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import fm1.C14600d;
import java.time.LocalDate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xm1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lxm1/a;", "", "<init>", "()V", "Lfm1/d;", "metaData", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "", "a", "(Lfm1/d;Lcom/whoop/data/repositories/FeatureFlagChecker;)Ljava/lang/String;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38459a {
    /* JADX INFO: renamed from: a */
    public final String m123250a(C14600d metaData, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(metaData, "metaData");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        if (featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.JOURNAL_CYCLE_ID_FIX)) {
            if (metaData.getJournalMeta().getIsAutoPop()) {
                String string = metaData.getCurrentCycleStartDay().minusDays(1L).toString();
                AbstractC22676k.m65747g(string);
                return string;
            }
            String string2 = metaData.getCurrentCycleStartDay().toString();
            AbstractC22676k.m65747g(string2);
            return string2;
        }
        boolean isAutoPop = metaData.getJournalMeta().getIsAutoPop();
        LocalDate currentCycleStartDay = metaData.getCurrentCycleStartDay();
        if (isAutoPop) {
            String string3 = currentCycleStartDay.minusDays(1L).toString();
            AbstractC22676k.m65749i(string3, "toString(...)");
            return string3;
        }
        String string4 = currentCycleStartDay.toString();
        AbstractC22676k.m65749i(string4, "toString(...)");
        return string4;
    }
}
