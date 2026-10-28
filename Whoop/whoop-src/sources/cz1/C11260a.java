package cz1;

import com.whoop.milestonepill.domain.model.MilestonePillResponse;
import com.whoop.navigation.AchievementsScreenModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: cz1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006*\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcz1/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "previousCount", "Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;", "currentData", "", "b", "(Ljava/lang/String;Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Z", "a", "(Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)Ljava/lang/String;", "Ll83/a0;", "c", "(Ljava/lang/String;Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;)V", "Lfi0/a;", "milestone-pill-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11260a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C11260a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final String m30423a(MilestonePillResponse milestonePillResponse) {
        C9598e navigation = milestonePillResponse.getNavigation();
        NavigationScreenModel parameters = navigation != null ? navigation.getParameters() : null;
        AchievementsScreenModel achievementsScreenModel = parameters instanceof AchievementsScreenModel ? (AchievementsScreenModel) parameters : null;
        if (achievementsScreenModel != null) {
            return achievementsScreenModel.getMilestoneType();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m30424b(String previousCount, MilestonePillResponse currentData) {
        if (previousCount == null) {
            return true;
        }
        Integer numM125932Q = AbstractC39421y.m125932Q(previousCount);
        int iIntValue = numM125932Q != null ? numM125932Q.intValue() : 0;
        Integer numM125932Q2 = AbstractC39421y.m125932Q(currentData.getCount());
        return (numM125932Q2 != null ? numM125932Q2.intValue() : 0) > iIntValue;
    }

    /* JADX INFO: renamed from: c */
    public final void m30425c(String previousCount, MilestonePillResponse currentData) {
        AbstractC22676k.m65750j(currentData, "currentData");
        this.analytics.mo41422d("achievements", ProfileAnalyticsKt.VIEW, "milestone_pill", "Achievements", currentData.getCount(), AbstractC25247g0.m73990Y(new C23465k("achievement_progress", Boolean.valueOf(m30424b(previousCount, currentData))), new C23465k("achievement_name", m30423a(currentData))));
    }
}
