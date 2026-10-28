package rg2;

import ha0.C17051d;
import ha0.C17055h;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rg2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"", "internalName", "", "Lha0/h;", "recentDtos", "", "Lha0/d;", "allActivitiesByInternalName", "Lrg2/j;", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lrg2/j;", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31400l {
    /* JADX INFO: renamed from: a */
    public static final C31398j m96704a(String internalName, List<C17055h> recentDtos, Map<String, C17051d> allActivitiesByInternalName) {
        Object next;
        AbstractC22676k.m65750j(internalName, "internalName");
        AbstractC22676k.m65750j(recentDtos, "recentDtos");
        AbstractC22676k.m65750j(allActivitiesByInternalName, "allActivitiesByInternalName");
        C17051d c17051d = allActivitiesByInternalName.get(internalName);
        if (c17051d != null) {
            return new C31398j(c17051d.getInternalName(), c17051d.getDisplayName(), c17051d.getIconUrl(), c17051d.getHasGps(), c17051d.getScoreType());
        }
        Iterator<T> it = recentDtos.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((C17055h) next).getInternalName(), internalName));
        C17055h c17055h = (C17055h) next;
        if (c17055h == null) {
            return null;
        }
        return new C31398j(c17055h.getInternalName(), c17055h.getDisplayName(), c17055h.getIconUrl(), c17055h.getHasGps(), c17055h.getScoreType());
    }
}
