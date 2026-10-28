package fy0;

import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.service.network.model.UserState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fy0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"", "Lcom/whoop/data/onboarding/FeatureEducationType;", "a", "(Ljava/lang/String;)Lcom/whoop/data/onboarding/FeatureEducationType;", "deep-dive_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14864b {
    /* JADX INFO: renamed from: a */
    public static final FeatureEducationType m42889a(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        int iHashCode = str.hashCode();
        if (iHashCode == -891993739) {
            if (str.equals("strain")) {
                return FeatureEducationType.OVERLAY_HOME_DEEP_DIVES_STRAIN;
            }
            return null;
        }
        if (iHashCode == -799113323) {
            if (str.equals("recovery")) {
                return FeatureEducationType.OVERLAY_HOME_DEEP_DIVES_RECOVERY;
            }
            return null;
        }
        if (iHashCode == 109522647 && str.equals(UserState.States.SLEEP)) {
            return FeatureEducationType.OVERLAY_HOME_DEEP_DIVES_SLEEP;
        }
        return null;
    }
}
