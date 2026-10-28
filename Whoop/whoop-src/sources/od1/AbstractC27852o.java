package od1;

import com.whoop.addactivity.network.model.ScoreType;
import com.whoop.data.repositories.FeatureFlagChecker;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import m83.C25271y;
import n82.EnumC26455a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wr2.AbstractC37575c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: od1.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a7\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000b\u001a'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000b\u001a'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000b\u001a\u001b\u0010\u0012\u001a\u00020\u0010*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"", "Lod1/a;", "", "searchQuery", "Ln82/a;", "screenType", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "k", "(Ljava/util/List;Ljava/lang/String;Ln82/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)Ljava/util/List;", "g", "(Ljava/util/List;Ln82/a;)Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "pageType", "f", "i", "", "includeStressInterventionActivities", "l", "(Lod1/a;Z)Z", "j", "select-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27852o {

    /* JADX INFO: renamed from: od1.o$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f112206a;

        static {
            int[] iArr = new int[EnumC26455a.values().length];
            try {
                iArr[EnumC26455a.SLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC26455a.STRAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC26455a.RECOVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC26455a.ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f112206a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final List<C27836a> m83987f(List<C27836a> list, EnumC26455a enumC26455a) {
        if (a.f112206a[enumC26455a.ordinal()] == 4) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C27836a) obj).getScoreType() == enumC26455a.toScoreType()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    private static final List<C27836a> m83988g(List<C27836a> list, EnumC26455a enumC26455a) {
        int i13 = a.f112206a[enumC26455a.ordinal()];
        if (i13 == 1) {
            return m83991j(list, EnumC26455a.SLEEP);
        }
        if (i13 != 2 && i13 != 3) {
            if (i13 == 4) {
                return list;
            }
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C27836a) obj).getScoreType() != ScoreType.SLEEP) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final List<C27836a> m83989h(List<C27836a> list, EnumC26455a enumC26455a) {
        int i13 = a.f112206a[enumC26455a.ordinal()];
        if (i13 == 1) {
            return C25271y.f99162w;
        }
        if (i13 == 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C27836a) obj).getScoreType() == ScoreType.CARDIO) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return list;
            }
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((C27836a) obj2).getScoreType() == ScoreType.RECOVERY) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final List<C27836a> m83990i(List<C27836a> list, EnumC26455a enumC26455a) {
        int i13 = a.f112206a[enumC26455a.ordinal()];
        if (i13 == 1) {
            return C25271y.f99162w;
        }
        if (i13 == 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C27836a) obj).getScoreType() == ScoreType.CARDIO) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return list;
            }
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((C27836a) obj2).getScoreType() == ScoreType.RECOVERY) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: j */
    public static final List<C27836a> m83991j(List<C27836a> list, EnumC26455a screenType) {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(screenType, "screenType");
        if (screenType == EnumC26455a.ALL) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C27836a) obj).getScoreType() == screenType.toScoreType()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final List<C27836a> m83992k(List<C27836a> list, String str, EnumC26455a enumC26455a, FeatureFlagChecker featureFlagChecker) {
        if (AbstractC39414r.m125890i0(str)) {
            return m83991j(list, enumC26455a);
        }
        List listM120636o = AbstractC37575c.m120636o(list, str, null, 2, null);
        return featureFlagChecker.isFeatureEnabled("enable-cross-score-type-activity-edits") ? m83988g(listM120636o, enumC26455a) : m83991j(listM120636o, enumC26455a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final boolean m83993l(C27836a c27836a, boolean z4) {
        if (AbstractC22676k.m65745e(c27836a.getInternalName(), "activity")) {
            return true;
        }
        if (z4) {
            return false;
        }
        return AbstractC22676k.m65745e(c27836a.getInternalName(), "increase_alertness") || AbstractC22676k.m65745e(c27836a.getInternalName(), "increase_relaxation");
    }
}
