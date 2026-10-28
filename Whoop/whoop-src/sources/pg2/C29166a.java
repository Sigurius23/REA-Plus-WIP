package pg2;

import ha0.C17055h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: pg2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ1\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ;\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\u0011\u0010\rJM\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lpg2/a;", "", "<init>", "()V", "", "Lha0/h;", "recentDtos", "", "e", "(Ljava/util/List;)Ljava/util/List;", "memberInternalNames", "mostPopularWhoopDefaults", "d", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "pinnedInternalName", "b", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "c", "", "catalogInternalNames", "a", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;)Ljava/util/List;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29166a {

    /* JADX INFO: renamed from: a */
    public static final C29166a f118028a = new C29166a();

    private C29166a() {
    }

    /* JADX INFO: renamed from: b */
    private final List<String> m88615b(List<String> memberInternalNames, List<String> mostPopularWhoopDefaults, String pinnedInternalName) {
        List<String> listM88616d = m88616d(memberInternalNames, mostPopularWhoopDefaults);
        if (pinnedInternalName == null) {
            return listM88616d;
        }
        if (AbstractC39414r.m125890i0(pinnedInternalName)) {
            pinnedInternalName = null;
        }
        if (pinnedInternalName == null) {
            return listM88616d;
        }
        List listM118958J = AbstractC37056f.m118958J(pinnedInternalName);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM88616d) {
            if (!AbstractC22676k.m65745e((String) obj, pinnedInternalName)) {
                arrayList.add(obj);
            }
        }
        return AbstractC25265s.m74129g1(listM118958J, AbstractC25265s.m74156w1(arrayList, 4));
    }

    /* JADX INFO: renamed from: d */
    private final List<String> m88616d(List<String> memberInternalNames, List<String> mostPopularWhoopDefaults) {
        List<String> listM74156w1 = AbstractC25265s.m74156w1(AbstractC25265s.m74159y0(memberInternalNames), 5);
        if (listM74156w1.size() >= 5) {
            return listM74156w1;
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(listM74156w1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : mostPopularWhoopDefaults) {
            if (!setM74103I1.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return AbstractC25265s.m74129g1(listM74156w1, AbstractC25265s.m74156w1(arrayList, 5 - listM74156w1.size()));
    }

    /* JADX INFO: renamed from: e */
    private final List<String> m88617e(List<C17055h> recentDtos) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : recentDtos) {
            if (hashSet.add(((C17055h) obj).getInternalName())) {
                arrayList.add(obj);
            }
        }
        List listM74156w1 = AbstractC25265s.m74156w1(arrayList, 5);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM74156w1, 10));
        Iterator it = listM74156w1.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C17055h) it.next()).getInternalName());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: a */
    public final List<String> m88618a(List<C17055h> recentDtos, List<String> mostPopularWhoopDefaults, String pinnedInternalName, Set<String> catalogInternalNames) {
        AbstractC22676k.m65750j(recentDtos, "recentDtos");
        AbstractC22676k.m65750j(mostPopularWhoopDefaults, "mostPopularWhoopDefaults");
        AbstractC22676k.m65750j(catalogInternalNames, "catalogInternalNames");
        if (pinnedInternalName == null || AbstractC39414r.m125890i0(pinnedInternalName)) {
            pinnedInternalName = null;
        }
        return (pinnedInternalName == null || catalogInternalNames.isEmpty() || catalogInternalNames.contains(pinnedInternalName)) ? m88615b(m88617e(recentDtos), mostPopularWhoopDefaults, pinnedInternalName) : m88619c(recentDtos, mostPopularWhoopDefaults);
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m88619c(List<C17055h> recentDtos, List<String> mostPopularWhoopDefaults) {
        AbstractC22676k.m65750j(recentDtos, "recentDtos");
        AbstractC22676k.m65750j(mostPopularWhoopDefaults, "mostPopularWhoopDefaults");
        return m88616d(m88617e(recentDtos), mostPopularWhoopDefaults);
    }
}
