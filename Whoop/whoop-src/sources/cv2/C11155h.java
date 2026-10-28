package cv2;

import com.whoop.weightlifting.data.WeightliftingApi;
import com.whoop.weightlifting.data.domain.FilterOptions;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import com.whoop.weightlifting.data.dto.CustomExerciseDtoKt;
import com.whoop.weightlifting.data.dto.ExerciseData;
import com.whoop.weightlifting.data.dto.WeightliftingExerciseDto;
import du2.AbstractC12378b;
import fi0.InterfaceC14515a;
import fu2.C14794i;
import fu2.InterfaceC14792g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: cv2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001a\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\u001c*\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!J7\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u001f\u001a\u00020\u00102\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020\u001c*\u00020\u00122\u0006\u0010%\u001a\u00020\rH\u0002¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u00020\u0012*\u00020\u00122\u0006\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\u00020\u001c*\u00020\u0012H\u0002¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\u00020\u001c*\u00020\u0012H\u0002¢\u0006\u0004\b-\u0010,J\u001b\u00100\u001a\u00020\u0012*\u00020\u00122\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J-\u00107\u001a\u00020\u0012*\u00020\u00122\u0018\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050302H\u0002¢\u0006\u0004\b7\u00108J'\u0010:\u001a\u00020\u0012*\u00020\u00122\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020503H\u0002¢\u0006\u0004\b:\u0010;J \u0010>\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020=H\u0086@¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010E¨\u0006F"}, m65681d2 = {"Lcv2/h;", "", "Lfu2/i;", "strengthTrainerInteractor", "Lfi0/a;", "analytics", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lfu2/i;Lfi0/a;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;)V", "", "", "Lcv2/b;", "it", "", "linkingCustomExercise", "Lcv2/g$a;", "k", "(Ljava/util/Map;Z)Lcv2/g$a;", "", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "exerciseList", "Lcom/whoop/weightlifting/data/domain/FilterOptions;", "filterOptions", "l", "(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/FilterOptions;Z)Lcv2/g$a;", "Lcv2/g;", "j", "(ZLq83/d;)Ljava/lang/Object;", "isLinkingCustomExercise", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcv2/g$a;Z)Lcv2/g;", "exerciseItems", "f", "(ZLjava/util/Map;)Ljava/util/Map;", "idToToggle", "m", "(Lcv2/g$a;Ljava/lang/String;)Lcv2/g;", "query", "n", "(Lcv2/g$a;Ljava/lang/String;)Lcv2/g$a;", "c", "(Lcv2/g$a;)Lcv2/g;", "d", "Lfu2/g;", "action", "o", "(Lcv2/g$a;Lfu2/g;)Lcv2/g$a;", "", "Ll83/k;", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "Lcv2/a;", "selectedFilterOptions", "g", "(Lcv2/g$a;Ljava/util/Set;)Lcv2/g$a;", "deselectedFilter", "e", "(Lcv2/g$a;Ll83/k;)Lcv2/g$a;", "currentDomainState", "Lcv2/d;", "i", "(Lcv2/g;Lcv2/d;Lq83/d;)Ljava/lang/Object;", "a", "Lfu2/i;", "b", "Lfi0/a;", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "Ltr2/n;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11155h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14794i strengthTrainerInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final WeightliftingApi api;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: cv2.h$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.select.domain.SelectExercisesInteractor", m100430f = "SelectExercisesInteractor.kt", m100431l = {78}, m100432m = "loadExerciseListWithFilterOptions", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        boolean f35708w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f35709x;

        /* JADX INFO: renamed from: z */
        int f35711z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f35709x = obj;
            this.f35711z |= Integer.MIN_VALUE;
            return C11155h.this.m30186j(false, this);
        }
    }

    /* JADX INFO: renamed from: cv2.h$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.select.domain.SelectExercisesInteractor$loadExerciseListWithFilterOptions$response$1", m100430f = "SelectExercisesInteractor.kt", m100431l = {79}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/data/dto/ExerciseData;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f35712w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C11155h.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f35712w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApi = C11155h.this.api;
            this.f35712w = 1;
            Object exerciseListV2 = weightliftingApi.getExerciseListV2(this);
            return exerciseListV2 == enumC31071a ? enumC31071a : exerciseListV2;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ExerciseData> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C11155h(C14794i strengthTrainerInteractor, InterfaceC14515a analytics, WeightliftingApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(strengthTrainerInteractor, "strengthTrainerInteractor");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.strengthTrainerInteractor = strengthTrainerInteractor;
        this.analytics = analytics;
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC11154g m30180c(InterfaceC11154g.a aVar) {
        WeightliftingExercise exercise;
        Iterator<T> it = aVar.m30175i().iterator();
        while (it.hasNext()) {
            C11149b c11149b = aVar.m30170d().get((String) it.next());
            if (c11149b != null && (exercise = c11149b.getExercise()) != null) {
                AbstractC12378b.m34744n(this.analytics, "Add Exercise To Workout", exercise.getExerciseId(), !aVar.m30176j().isEmpty() ? "List Was Filtered" : "", null, 8, null);
            }
        }
        List<String> listM30175i = aVar.m30175i();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it3 = listM30175i.iterator();
        while (it3.hasNext()) {
            C11149b c11149b2 = aVar.m30170d().get((String) it3.next());
            WeightliftingExercise exercise2 = c11149b2 != null ? c11149b2.getExercise() : null;
            if (exercise2 != null) {
                arrayList.add(exercise2);
            }
        }
        return m30191o(aVar, new InterfaceC14792g.a(arrayList));
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC11154g m30181d(InterfaceC11154g.a aVar) {
        AbstractC12378b.m34743m(this.analytics, "Edit Workout", "Add Superset", !aVar.m30176j().isEmpty() ? "List Was Filtered" : "", AbstractC31061c.m95645u("supersetExerciseIds", AbstractC25265s.m74110N0(aVar.m30175i(), ", ", null, null, null, 62)));
        List<String> listM30175i = aVar.m30175i();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM30175i.iterator();
        while (it.hasNext()) {
            C11149b c11149b = aVar.m30170d().get((String) it.next());
            WeightliftingExercise exercise = c11149b != null ? c11149b.getExercise() : null;
            if (exercise != null) {
                arrayList.add(exercise);
            }
        }
        return m30191o(aVar, new InterfaceC14792g.b(arrayList));
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC11154g.a m30182e(InterfaceC11154g.a aVar, C23465k c23465k) {
        return InterfaceC11154g.a.m30167b(aVar, null, null, null, null, false, false, null, null, AbstractC12350b.m34604y(c23465k, aVar.m30176j()), 255, null);
    }

    /* JADX INFO: renamed from: f */
    private final Map<String, C11149b> m30183f(boolean isLinkingCustomExercise, Map<String, C11149b> exerciseItems) {
        if (!isLinkingCustomExercise) {
            return exerciseItems;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C11149b> entry : exerciseItems.entrySet()) {
            if (!entry.getValue().getExercise().getIsCustomExercise()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC11154g.a m30184g(InterfaceC11154g.a aVar, Set<? extends C23465k> set) {
        return InterfaceC11154g.a.m30167b(aVar, null, null, null, null, false, false, null, null, set, 255, null);
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC11154g m30185h(InterfaceC11154g.a aVar, boolean z4) {
        Map<String, C11149b> mapM42542d = this.strengthTrainerInteractor.m42542d();
        if (mapM42542d == null) {
            return aVar;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(mapM42542d.size()));
        Iterator<T> it = mapM42542d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), C11149b.m30152f((C11149b) entry.getValue(), null, aVar.m30175i().contains((String) entry.getKey()), 1, null));
        }
        return InterfaceC11154g.a.m30167b(aVar, m30183f(z4, linkedHashMap), null, null, null, false, false, null, null, null, 510, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: j */
    public final Object m30186j(boolean z4, InterfaceC30057d<? super InterfaceC11154g> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f35711z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f35711z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f35709x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f35711z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            Map<String, C11149b> mapM42542d = this.strengthTrainerInteractor.m42542d();
            if (mapM42542d != null) {
                return m30187k(mapM42542d, z4);
            }
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f35708w = z4;
            aVar2.f35711z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to get getExerciseList", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = aVar2.f35708w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
                return C11153f.f35693a;
            }
            if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
                return C11152e.f35692a;
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.c cVar = (InterfaceC34385a.c) interfaceC34385a;
        List<WeightliftingExerciseDto> exercises = ((ExerciseData) cVar.m108735a()).getExercises();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(exercises, 10));
        Iterator<T> it = exercises.iterator();
        while (it.hasNext()) {
            arrayList.add(((WeightliftingExerciseDto) it.next()).toWeightliftingExercise());
        }
        return m30188l(arrayList, CustomExerciseDtoKt.toDomain(((ExerciseData) cVar.m108735a()).getFilterOptions()), z4);
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC11154g.a m30187k(Map<String, C11149b> it, boolean linkingCustomExercise) {
        Map<String, C11149b> mapM30183f = m30183f(linkingCustomExercise, it);
        boolean z4 = this.strengthTrainerInteractor.m42544f() != null;
        FilterOptions filterOptionsM42543e = this.strengthTrainerInteractor.m42543e();
        if (filterOptionsM42543e != null) {
            return new InterfaceC11154g.a(mapM30183f, null, null, null, z4, linkingCustomExercise, null, filterOptionsM42543e, null, 334, null);
        }
        this.logger.mo85222m("cachedFilterOptions was null when building SelectExercisesDomainState — cache may have been cleared mid-load", new AbstractC30556a.a[0]);
        throw new IllegalStateException("cachedFilterOptions was null when building SelectExercisesDomainState — cache may have been cleared mid-load");
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC11154g.a m30188l(List<WeightliftingExercise> exerciseList, FilterOptions filterOptions, boolean linkingCustomExercise) {
        List<WeightliftingExercise> list = exerciseList;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeightliftingExercise weightliftingExercise = (WeightliftingExercise) it.next();
            linkedHashMap.put(weightliftingExercise.getExerciseId(), new C11149b(weightliftingExercise, false));
        }
        this.strengthTrainerInteractor.m42546j(new InterfaceC14792g.c(linkedHashMap, filterOptions));
        return new InterfaceC11154g.a(linkedHashMap, null, null, null, this.strengthTrainerInteractor.m42544f() != null, linkingCustomExercise, null, filterOptions, null, 334, null);
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC11154g m30189m(InterfaceC11154g.a aVar, String str) {
        C11149b c11149b = aVar.m30170d().get(str);
        if (c11149b == null) {
            return aVar;
        }
        if (aVar.getIsLinkingCustomExercise()) {
            return InterfaceC11154g.a.m30167b(aVar, null, null, null, null, false, false, str, null, null, 447, null);
        }
        boolean isSelected = c11149b.getIsSelected();
        if (!isSelected) {
            AbstractC12378b.m34744n(this.analytics, "Add Exercise", str, !aVar.m30176j().isEmpty() ? "List Was Filtered" : "", null, 8, null);
        }
        Map<String, C11149b> mapM30170d = aVar.m30170d();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(mapM30170d.size()));
        Iterator<T> it = mapM30170d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            String str2 = (String) entry.getKey();
            C11149b c11149bM30152f = (C11149b) entry.getValue();
            if (AbstractC22676k.m65745e(str2, str)) {
                c11149bM30152f = C11149b.m30152f(c11149bM30152f, null, !isSelected, 1, null);
            }
            linkedHashMap.put(key, c11149bM30152f);
        }
        return InterfaceC11154g.a.m30167b(aVar, linkedHashMap, isSelected ? AbstractC25265s.m74124b1(aVar.m30175i(), str) : AbstractC25265s.m74128f1(str, aVar.m30175i()), null, null, false, false, null, null, null, 508, null);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC11154g.a m30190n(InterfaceC11154g.a aVar, String str) {
        return InterfaceC11154g.a.m30167b(aVar, null, null, str, null, false, false, null, null, null, 507, null);
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC11154g.a m30191o(InterfaceC11154g.a aVar, InterfaceC14792g interfaceC14792g) {
        int iM118951C = AbstractC37056f.m118951C(this.strengthTrainerInteractor.m42545h().getGroups());
        this.strengthTrainerInteractor.m42546j(interfaceC14792g);
        int i13 = iM118951C + 1;
        Integer numValueOf = Integer.valueOf(i13);
        if (i13 < 0 || i13 >= this.strengthTrainerInteractor.m42545h().getGroups().size()) {
            numValueOf = null;
        }
        return InterfaceC11154g.a.m30167b(aVar, null, null, null, new InterfaceC11150c.b(numValueOf), false, false, null, null, null, 503, null);
    }

    /* JADX INFO: renamed from: i */
    public final Object m30192i(InterfaceC11154g interfaceC11154g, InterfaceC11151d interfaceC11151d, InterfaceC30057d<? super InterfaceC11154g> interfaceC30057d) {
        boolean z4 = interfaceC11151d instanceof InterfaceC11151d.e;
        if (z4 && (interfaceC11154g instanceof InterfaceC11154g.b)) {
            return m30186j(((InterfaceC11151d.e) interfaceC11151d).getIsLinkingCustomExercise(), interfaceC30057d);
        }
        if (z4 && (interfaceC11154g instanceof InterfaceC11154g.a)) {
            return m30185h((InterfaceC11154g.a) interfaceC11154g, ((InterfaceC11151d.e) interfaceC11151d).getIsLinkingCustomExercise());
        }
        if ((interfaceC11151d instanceof InterfaceC11151d.f) && (interfaceC11154g instanceof InterfaceC11154g.a)) {
            return m30189m((InterfaceC11154g.a) interfaceC11154g, ((InterfaceC11151d.f) interfaceC11151d).getExerciseId());
        }
        if ((interfaceC11151d instanceof InterfaceC11151d.g) && (interfaceC11154g instanceof InterfaceC11154g.a)) {
            return m30190n((InterfaceC11154g.a) interfaceC11154g, ((InterfaceC11151d.g) interfaceC11151d).getQuery());
        }
        if ((interfaceC11151d instanceof InterfaceC11151d.a) && (interfaceC11154g instanceof InterfaceC11154g.a)) {
            return m30180c((InterfaceC11154g.a) interfaceC11154g);
        }
        if ((interfaceC11151d instanceof InterfaceC11151d.b) && (interfaceC11154g instanceof InterfaceC11154g.a)) {
            return m30181d((InterfaceC11154g.a) interfaceC11154g);
        }
        if ((interfaceC11151d instanceof InterfaceC11151d.d) && (interfaceC11154g instanceof InterfaceC11154g.a)) {
            return m30184g((InterfaceC11154g.a) interfaceC11154g, ((InterfaceC11151d.d) interfaceC11151d).m30163a());
        }
        return ((interfaceC11151d instanceof InterfaceC11151d.c) && (interfaceC11154g instanceof InterfaceC11154g.a)) ? m30182e((InterfaceC11154g.a) interfaceC11154g, ((InterfaceC11151d.c) interfaceC11151d).getDeselectedFilter()) : interfaceC11154g;
    }
}
