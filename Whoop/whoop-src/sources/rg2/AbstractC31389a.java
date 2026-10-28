package rg2;

import ha0.C17051d;
import java.util.List;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: rg2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"", "internalName", "", "Lrg2/j;", "recentActivityItems", "", "Lha0/d;", "allActivitiesByInternalName", "Lrg2/u;", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lrg2/u;", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31389a {
    /* JADX INFO: renamed from: a */
    public static final C31409u m96657a(String str, List<C31398j> recentActivityItems, Map<String, C17051d> allActivitiesByInternalName) {
        AbstractC22676k.m65750j(recentActivityItems, "recentActivityItems");
        AbstractC22676k.m65750j(allActivitiesByInternalName, "allActivitiesByInternalName");
        Object obj = null;
        if (str == null || AbstractC39414r.m125890i0(str)) {
            return new C31409u(null, false, 3, null);
        }
        for (Object obj2 : recentActivityItems) {
            if (AbstractC22676k.m65745e(((C31398j) obj2).getInternalName(), str)) {
                obj = obj2;
                break;
            }
        }
        C31398j c31398j = (C31398j) obj;
        if (c31398j != null) {
            return new C31409u(c31398j.getDisplayName(), c31398j.getHasGps());
        }
        C17051d c17051d = allActivitiesByInternalName.get(str);
        return c17051d != null ? new C31409u(c17051d.getDisplayName(), c17051d.getHasGps()) : new C31409u(str, false);
    }
}
