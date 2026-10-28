package dv2;

import b91.AbstractC2890e;
import c41.AbstractC3992b0;
import c41.C3985a0;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weightlifting.data.domain.FilterItem;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import cu2.AbstractC11128h;
import cv2.C11149b;
import cv2.C11152e;
import cv2.C11153f;
import cv2.EnumC11148a;
import cv2.InterfaceC11154g;
import eu2.C13645b;
import gu2.C16214a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import o11.AbstractC27407m;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import wr2.AbstractC37575c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: dv2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n*\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f*\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u0013\u0010\u001a\u001a\u00020\u0018*\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\r*\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010#\u001a\u00020\"*\u00020\u00152\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010*¨\u0006+"}, m65681d2 = {"Ldv2/f;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcv2/g$a;", "Ldv2/e$b;", "g", "(Lcv2/g$a;)Ldv2/e$b;", "", "", "", "Lo11/m$c;", "b", "(Lcv2/g$a;)Ljava/util/Map;", "Ldv2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcv2/g$a;)Ldv2/a;", "e", "(Lcv2/g$a;)Ljava/util/List;", "Lcv2/b;", "d", "", "Lo11/m$c$b;", "a", "i", "(Lcv2/b;)Lo11/m$c$b;", "j", "(Lcv2/b;)Lo11/m$c;", "", "selectedEquipment", "selectedMovements", "selectedMuscles", "", "c", "(Lcv2/b;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)Z", "Lcv2/g;", "domainState", "Ldv2/e;", "f", "(Lcv2/g;)Ldv2/e;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12395f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: dv2.f$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q((String) t14, (String) t15);
        }
    }

    /* JADX INFO: renamed from: dv2.f$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            String name = ((C11149b) t14).getExercise().getName();
            Locale locale = Locale.ROOT;
            String lowerCase = name.toLowerCase(locale);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((C11149b) t15).getExercise().getName().toLowerCase(locale);
            AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
            return AbstractC30060g.m92127q(lowerCase, lowerCase2);
        }
    }

    /* JADX INFO: renamed from: dv2.f$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            String name = ((C11149b) t14).getExercise().getName();
            Locale locale = Locale.ROOT;
            String lowerCase = name.toLowerCase(locale);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((C11149b) t15).getExercise().getName().toLowerCase(locale);
            AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
            return AbstractC30060g.m92127q(lowerCase, lowerCase2);
        }
    }

    public C12395f(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    private final List<AbstractC27407m.c.b> m34822a(InterfaceC11154g.a aVar) {
        ArrayList arrayList = new ArrayList();
        List<String> listM30175i = aVar.m30175i();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM30175i, 10));
        Iterator<T> it = listM30175i.iterator();
        while (it.hasNext()) {
            C11149b c11149b = aVar.m30170d().get((String) it.next());
            arrayList2.add(c11149b != null ? Boolean.valueOf(arrayList.add(m34829i(c11149b))) : null);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private final Map<String, List<AbstractC27407m.c>> m34823b(InterfaceC11154g.a aVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listM74152u1 = AbstractC25265s.m74152u1(aVar.m30170d().values(), new b());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj : listM74152u1) {
            String strValueOf = String.valueOf(AbstractC39414r.m125882a0(((C11149b) obj).getExercise().getName()));
            AbstractC22676k.m65748h(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            Object arrayList = linkedHashMap2.get(upperCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap2.put(upperCase, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        TreeMap treeMapM74006o0 = AbstractC25247g0.m74006o0(linkedHashMap2, new a());
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC25247g0.m73988W(treeMapM74006o0.size()));
        for (Map.Entry entry : treeMapM74006o0.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            AbstractC22676k.m65747g(list);
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(m34830j((C11149b) it.next()));
            }
            linkedHashMap3.put(key, arrayList2);
        }
        linkedHashMap.putAll(linkedHashMap3);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m34824c(C11149b c11149b, Set<String> set, Set<String> set2, Set<String> set3) {
        if (!set.isEmpty() && !set.contains(c11149b.getExercise().getEquipment().getSerializedValue())) {
            return false;
        }
        if (!set2.isEmpty()) {
            String upperCase = c11149b.getExercise().getMovementPattern().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            if (!set2.contains(upperCase)) {
                return false;
            }
        }
        if (set3.isEmpty()) {
            return true;
        }
        List<String> muscleGroups = c11149b.getExercise().getMuscleGroups();
        if ((muscleGroups instanceof Collection) && muscleGroups.isEmpty()) {
            return false;
        }
        Iterator<T> it = muscleGroups.iterator();
        while (it.hasNext()) {
            String upperCase2 = ((String) it.next()).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            if (set3.contains(upperCase2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    private final List<C11149b> m34825d(InterfaceC11154g.a aVar) {
        Set<C23465k> setM30176j = aVar.m30176j();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setM30176j) {
            if (((C23465k) obj).f92938x == EnumC11148a.EQUIPMENT) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String upperCase = ((FilterItem) ((C23465k) it.next()).f92937w).getKey().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            arrayList2.add(upperCase);
        }
        Set<String> setM74103I1 = AbstractC25265s.m74103I1(arrayList2);
        Set<C23465k> setM30176j2 = aVar.m30176j();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : setM30176j2) {
            if (((C23465k) obj2).f92938x == EnumC11148a.MOVEMENT) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            String upperCase2 = ((FilterItem) ((C23465k) it3.next()).f92937w).getKey().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            arrayList4.add(upperCase2);
        }
        Set<String> setM74103I2 = AbstractC25265s.m74103I1(arrayList4);
        Set<C23465k> setM30176j3 = aVar.m30176j();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : setM30176j3) {
            if (((C23465k) obj3).f92938x == EnumC11148a.MUSCLES) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(arrayList5, 10));
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            String upperCase3 = ((FilterItem) ((C23465k) it4.next()).f92937w).getKey().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
            arrayList6.add(upperCase3);
        }
        Set<String> setM74103I3 = AbstractC25265s.m74103I1(arrayList6);
        Collection<C11149b> collectionValues = aVar.m30170d().values();
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : collectionValues) {
            if (m34824c((C11149b) obj4, setM74103I1, setM74103I2, setM74103I3)) {
                arrayList7.add(obj4);
            }
        }
        return arrayList7;
    }

    /* JADX INFO: renamed from: e */
    private final List<AbstractC27407m.c> m34826e(InterfaceC11154g.a aVar) {
        List listM74152u1 = AbstractC25265s.m74152u1(m34825d(aVar), new c());
        if (!AbstractC39414r.m125890i0(aVar.getSearchQuery())) {
            listM74152u1 = AbstractC37575c.m120636o(listM74152u1, aVar.getSearchQuery(), null, 2, null);
        }
        List list = listM74152u1;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m34830j((C11149b) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC12394e.b m34827g(InterfaceC11154g.a aVar) {
        int i13;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(aVar.getSearchQuery());
        Collection<C11149b> collectionValues = aVar.m30170d().values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            i13 = 0;
        } else {
            Iterator<T> it = collectionValues.iterator();
            i13 = 0;
            while (it.hasNext()) {
                if (((C11149b) it.next()).getIsSelected() && (i13 = i13 + 1) < 0) {
                    AbstractC37056f.m118976c0();
                    throw null;
                }
            }
        }
        boolean z4 = i13 > 0;
        boolean z13 = i13 > 1;
        List<AbstractC27407m.c.b> listM34822a = m34822a(aVar);
        TextResource.C8688b c8688b = i13 > 1 ? new TextResource.C8688b(AbstractC11128h.f35462e, new TextResource.AbstractC8690d.b(Integer.valueOf(i13))) : AbstractC8693b.m21277k(AbstractC11128h.f35465f);
        C13645b c13645b = new C13645b(AbstractC8693b.m21277k(AbstractC11128h.f35411N1), null, z13, InterfaceC12391b.o.f41917a, 2, null);
        C13645b c13645b2 = new C13645b(c8688b, EnumC39333f.ACCENT_ACTION, z4, InterfaceC12391b.a.f41902a);
        InterfaceC25312u c16214a = aVar.getIsLinkingCustomExercise() ? new C16214a(AbstractC8693b.m21277k(AbstractC11128h.f35420Q1), EnumC39333f.WHITE_50, AbstractC2890e.m8450e().getB2()) : new C3985a0(null, AbstractC3992b0.a.f16255g, AbstractC8693b.m21277k(AbstractC11128h.f35439X), false, 0, EnumC39333f.WHITE_50, EnumC39333f.BRAND_WHITE, 25, null);
        return (AbstractC39414r.m125890i0(aVar.getSearchQuery()) && aVar.m30176j().isEmpty()) ? new InterfaceC12394e.b.C41498b(m34823b(aVar), textResourceM21278l, c13645b, c13645b2, listM34822a, c16214a, aVar.getIsLinkingCustomExercise(), aVar.getFilterOptions(), aVar.m30176j()) : new InterfaceC12394e.b.a(m34826e(aVar), textResourceM21278l, c13645b, c13645b2, listM34822a, c16214a, aVar.getIsLinkingCustomExercise(), m34828h(aVar), aVar.getFilterOptions(), aVar.m30176j());
    }

    /* JADX INFO: renamed from: h */
    private final C12390a m34828h(InterfaceC11154g.a aVar) {
        C12390a c12390a = new C12390a(AbstractC8693b.m21277k(AbstractC11128h.f35479j1), aVar.getIsLinkingCustomExercise() ? AbstractC8693b.m21277k(AbstractC11128h.f35485l1) : AbstractC8693b.m21277k(AbstractC11128h.f35482k1));
        if (m34826e(aVar).isEmpty()) {
            return c12390a;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    private final AbstractC27407m.c.b m34829i(C11149b c11149b) {
        WeightliftingExercise exercise = c11149b.getExercise();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(exercise.getName());
        InterfaceC12391b.e eVar = new InterfaceC12391b.e(exercise.getExerciseId());
        InterfaceC12391b.f fVar = new InterfaceC12391b.f(exercise.getExerciseId(), true);
        Object obj = this.featureFlagChecker.isFeatureEnabled("exercise-details-image-navigation-android") ? fVar : null;
        if (obj == null) {
            obj = C23454a0.f92919a;
        }
        return new AbstractC27407m.c.b(exercise.getExerciseId(), textResourceM21278l, exercise.getImageUrl(), null, fVar, eVar, obj, 8, null);
    }

    /* JADX INFO: renamed from: j */
    private final AbstractC27407m.c m34830j(C11149b c11149b) {
        WeightliftingExercise exercise = c11149b.getExercise();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(exercise.getName());
        InterfaceC12391b.e eVar = new InterfaceC12391b.e(exercise.getExerciseId());
        InterfaceC12391b.f fVar = new InterfaceC12391b.f(exercise.getExerciseId(), c11149b.getIsSelected());
        Object obj = this.featureFlagChecker.isFeatureEnabled("exercise-details-image-navigation-android") ? fVar : null;
        if (obj == null) {
            obj = C23454a0.f92919a;
        }
        Object obj2 = obj;
        return c11149b.getIsSelected() ? new AbstractC27407m.c.C42106c(exercise.getExerciseId(), textResourceM21278l, exercise.getImageUrl(), null, fVar, eVar, obj2, 8, null) : new AbstractC27407m.c.a(exercise.getExerciseId(), textResourceM21278l, exercise.getImageUrl(), null, fVar, eVar, obj2, false, 136, null);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC12394e m34831f(InterfaceC11154g domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState instanceof InterfaceC11154g.b) {
            return InterfaceC12394e.c.f41984a;
        }
        if (domainState instanceof C11152e) {
            return new InterfaceC12394e.a(AbstractC8693b.m21277k(AbstractC11128h.f35473h1));
        }
        if (domainState instanceof C11153f) {
            return new InterfaceC12394e.a(AbstractC8693b.m21277k(AbstractC11128h.f35506s1));
        }
        if (domainState instanceof InterfaceC11154g.a) {
            return m34827g((InterfaceC11154g.a) domainState);
        }
        throw new NoWhenBranchMatchedException();
    }
}
