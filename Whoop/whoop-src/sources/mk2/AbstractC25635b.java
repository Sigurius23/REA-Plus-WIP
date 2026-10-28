package mk2;

import com.whoop.addactivity.network.model.ScoreType;
import com.whoop.service.network.model.UserState;
import ha0.C17051d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mk2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lha0/d;", "", "fallbackInternalName", "Lmk2/j;", "b", "(Lha0/d;Ljava/lang/String;)Lmk2/j;", "internalName", "a", "(Ljava/lang/String;)Lmk2/j;", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25635b {
    /* JADX INFO: renamed from: a */
    private static final EnumC25643j m75430a(String str) {
        if (AbstractC22676k.m65745e(str, "nap")) {
            return EnumC25643j.NAP;
        }
        return AbstractC22676k.m65745e(str, UserState.States.SLEEP) ? EnumC25643j.SLEEP : EnumC25643j.WORKOUT;
    }

    /* JADX INFO: renamed from: b */
    public static final EnumC25643j m75431b(C17051d c17051d, String fallbackInternalName) {
        AbstractC22676k.m65750j(fallbackInternalName, "fallbackInternalName");
        if (c17051d == null) {
            return m75430a(fallbackInternalName);
        }
        ScoreType scoreType = c17051d.getScoreType();
        ScoreType scoreType2 = ScoreType.SLEEP;
        if (scoreType == scoreType2 && AbstractC22676k.m65745e(c17051d.getInternalName(), "nap")) {
            return EnumC25643j.NAP;
        }
        if (c17051d.getScoreType() == scoreType2) {
            return EnumC25643j.SLEEP;
        }
        return c17051d.getScoreType() == ScoreType.RECOVERY ? EnumC25643j.RECOVERY : EnumC25643j.WORKOUT;
    }
}
