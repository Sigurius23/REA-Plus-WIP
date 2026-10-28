package fu2;

import com.whoop.weightlifting.data.domain.FilterOptions;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import com.whoop.weightlifting.data.domain.WorkoutExercise;
import com.whoop.weightlifting.data.domain.WorkoutGroup;
import com.whoop.weightlifting.data.domain.WorkoutSet;
import com.whoop.weightlifting.data.domain.WorkoutTemplate;
import cv2.C11149b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import or2.C28218y1;
import or2.InterfaceC28215x1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: fu2.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010*R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R(\u0010.\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00060(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u0014\u00102\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u00107\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u0010:\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u001f\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b-\u0010;¨\u0006="}, m65681d2 = {"Lfu2/i;", "", "Lor2/x1;", "uuidGenerator", "<init>", "(Lor2/x1;)V", "", "", "Lcv2/b;", "exerciseList", "Lcom/whoop/weightlifting/data/domain/FilterOptions;", "filterOptions", "Ll83/a0;", "c", "(Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/FilterOptions;)V", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "customExercise", "m", "(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)V", "i", "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "workoutTemplate", "n", "(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)V", "activityId", "k", "(Ljava/lang/String;)V", "l", "(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/lang/String;)V", "Lfu2/g$a;", "action", "a", "(Lfu2/g$a;)V", "Lfu2/g$b;", "b", "(Lfu2/g$b;)V", "Lfu2/g;", "j", "(Lfu2/g;)V", "Lor2/x1;", "Lec3/p1;", "Lfu2/h;", "Lec3/p1;", "strengthTrainerDomainState", "_cachedFilterOptions", "d", "_cachedExerciseList", "Ljava/util/UUID;", "g", "()Ljava/util/UUID;", "randomUuid", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "f", "()Ljava/lang/String;", "linkedActivityId", "e", "()Lcom/whoop/weightlifting/data/domain/FilterOptions;", "cachedFilterOptions", "()Ljava/util/Map;", "cachedExerciseList", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14794i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC28215x1 uuidGenerator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13075p1 strengthTrainerDomainState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13075p1 _cachedFilterOptions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13075p1 _cachedExerciseList;

    public C14794i(InterfaceC28215x1 uuidGenerator) {
        AbstractC22676k.m65750j(uuidGenerator, "uuidGenerator");
        this.uuidGenerator = uuidGenerator;
        this.strengthTrainerDomainState = AbstractC13091v.m36593c(new C14793h(WorkoutTemplate.INSTANCE.getEmpty(), null));
        this._cachedFilterOptions = AbstractC13091v.m36593c(null);
        this._cachedExerciseList = AbstractC13091v.m36593c(null);
    }

    /* JADX INFO: renamed from: a */
    private final void m42533a(InterfaceC14792g.a action) {
        C13045h2 c13045h2;
        Object value;
        C14793h c14793h;
        List<WeightliftingExercise> listM42521a = action.m42521a();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM42521a, 10));
        Iterator<T> it = listM42521a.iterator();
        while (it.hasNext()) {
            arrayList.add(WorkoutGroup.INSTANCE.withSingleExercise(AbstractC37056f.m118958J(WorkoutSet.INSTANCE.m134199default(m42536g())), (WeightliftingExercise) it.next(), m42536g(), m42536g()));
        }
        InterfaceC13075p1 interfaceC13075p1 = this.strengthTrainerDomainState;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            c14793h = (C14793h) value;
        } while (!c13045h2.m36569i(value, C14793h.m42529b(c14793h, WorkoutTemplate.copy$default(c14793h.getWorkoutTemplate(), null, null, null, AbstractC25265s.m74129g1(c14793h.getWorkoutTemplate().getGroups(), arrayList), null, 23, null), null, 2, null)));
    }

    /* JADX INFO: renamed from: b */
    private final void m42534b(InterfaceC14792g.b action) {
        C13045h2 c13045h2;
        Object value;
        C14793h c14793h;
        List<WeightliftingExercise> listM42522a = action.m42522a();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM42522a, 10));
        Iterator<T> it = listM42522a.iterator();
        while (it.hasNext()) {
            arrayList.add(new WorkoutExercise(AbstractC37056f.m118958J(WorkoutSet.INSTANCE.m134199default(m42536g())), (WeightliftingExercise) it.next(), m42536g()));
        }
        InterfaceC13075p1 interfaceC13075p1 = this.strengthTrainerDomainState;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            c14793h = (C14793h) value;
        } while (!c13045h2.m36569i(value, C14793h.m42529b(c14793h, WorkoutTemplate.copy$default(c14793h.getWorkoutTemplate(), null, null, null, AbstractC25265s.m74128f1(new WorkoutGroup(arrayList, m42536g()), c14793h.getWorkoutTemplate().getGroups()), null, 23, null), null, 2, null)));
    }

    /* JADX INFO: renamed from: c */
    private final void m42535c(Map<String, C11149b> exerciseList, FilterOptions filterOptions) {
        ((C13045h2) this._cachedExerciseList).m36570j(exerciseList);
        ((C13045h2) this._cachedFilterOptions).m36570j(filterOptions);
    }

    /* JADX INFO: renamed from: g */
    private final UUID m42536g() {
        return this.uuidGenerator.mo85405a();
    }

    /* JADX INFO: renamed from: i */
    private final void m42537i(WeightliftingExercise customExercise) {
        C13045h2 c13045h2;
        Object value;
        C14793h c14793h;
        WorkoutTemplate workoutTemplate;
        ArrayList arrayList;
        if (AbstractC22676k.m65745e(m42545h(), WorkoutTemplate.INSTANCE.getEmpty())) {
            return;
        }
        InterfaceC13075p1 interfaceC13075p1 = this.strengthTrainerDomainState;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            c14793h = (C14793h) value;
            workoutTemplate = c14793h.getWorkoutTemplate();
            List<WorkoutGroup> groups = c14793h.getWorkoutTemplate().getGroups();
            int i13 = 10;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(groups, 10));
            for (WorkoutGroup workoutGroup : groups) {
                List<WorkoutExercise> exercises = workoutGroup.getExercises();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(exercises, i13));
                for (WorkoutExercise workoutExerciseCopy$default : exercises) {
                    if (AbstractC22676k.m65745e(workoutExerciseCopy$default.getExercise().getExerciseId(), customExercise.getExerciseId())) {
                        workoutExerciseCopy$default = WorkoutExercise.copy$default(workoutExerciseCopy$default, null, customExercise, null, 5, null);
                    }
                    arrayList2.add(workoutExerciseCopy$default);
                }
                arrayList.add(WorkoutGroup.copy$default(workoutGroup, arrayList2, null, 2, null));
                i13 = 10;
            }
        } while (!c13045h2.m36569i(value, C14793h.m42529b(c14793h, WorkoutTemplate.copy$default(workoutTemplate, null, null, null, arrayList, null, 23, null), null, 2, null)));
    }

    /* JADX INFO: renamed from: k */
    private final void m42538k(String activityId) {
        C13045h2 c13045h2;
        Object value;
        InterfaceC13075p1 interfaceC13075p1 = this.strengthTrainerDomainState;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, C14793h.m42529b((C14793h) value, null, activityId, 1, null)));
    }

    /* JADX INFO: renamed from: l */
    private final void m42539l(WorkoutTemplate workoutTemplate, String activityId) {
        m42541n(workoutTemplate);
        m42538k(activityId);
    }

    /* JADX INFO: renamed from: m */
    private final void m42540m(WeightliftingExercise customExercise) {
        Map mapM73996e0;
        InterfaceC13075p1 interfaceC13075p1 = this._cachedExerciseList;
        Map map = (Map) ((C13045h2) interfaceC13075p1).getValue();
        if (map == null) {
            mapM73996e0 = null;
        } else if (map.isEmpty()) {
            mapM73996e0 = AbstractC25247g0.m73996e0(map, new C23465k(customExercise.getExerciseId(), new C11149b(customExercise, false)));
        } else {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (AbstractC22676k.m65745e(((Map.Entry) it.next()).getKey(), customExercise.getExerciseId())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (!AbstractC22676k.m65745e(entry.getKey(), customExercise.getExerciseId())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    mapM73996e0 = AbstractC25247g0.m74001j0(linkedHashMap);
                }
            }
            mapM73996e0 = AbstractC25247g0.m73996e0(map, new C23465k(customExercise.getExerciseId(), new C11149b(customExercise, false)));
        }
        ((C13045h2) interfaceC13075p1).m36570j(mapM73996e0);
    }

    /* JADX INFO: renamed from: n */
    private final void m42541n(WorkoutTemplate workoutTemplate) {
        C13045h2 c13045h2;
        Object value;
        InterfaceC13075p1 interfaceC13075p1 = this.strengthTrainerDomainState;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, C14793h.m42529b((C14793h) value, workoutTemplate, null, 2, null)));
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, C11149b> m42542d() {
        return (Map) ((C13045h2) this._cachedExerciseList).getValue();
    }

    /* JADX INFO: renamed from: e */
    public final FilterOptions m42543e() {
        return (FilterOptions) ((C13045h2) this._cachedFilterOptions).getValue();
    }

    /* JADX INFO: renamed from: f */
    public final String m42544f() {
        return ((C14793h) ((C13045h2) this.strengthTrainerDomainState).getValue()).getLinkedActivityId();
    }

    /* JADX INFO: renamed from: h */
    public final WorkoutTemplate m42545h() {
        return ((C14793h) ((C13045h2) this.strengthTrainerDomainState).getValue()).getWorkoutTemplate();
    }

    /* JADX INFO: renamed from: j */
    public final void m42546j(InterfaceC14792g action) {
        AbstractC22676k.m65750j(action, "action");
        if (action instanceof InterfaceC14792g.e) {
            m42539l(WorkoutTemplate.INSTANCE.getEmpty(), null);
            return;
        }
        if (action instanceof InterfaceC14792g.i) {
            m42541n(((InterfaceC14792g.i) action).getWorkoutTemplate());
            return;
        }
        if (action instanceof InterfaceC14792g.f) {
            m42538k(((InterfaceC14792g.f) action).getActivityId());
            return;
        }
        if (action instanceof InterfaceC14792g.a) {
            m42533a((InterfaceC14792g.a) action);
            return;
        }
        if (action instanceof InterfaceC14792g.b) {
            m42534b((InterfaceC14792g.b) action);
            return;
        }
        if (action instanceof InterfaceC14792g.c) {
            InterfaceC14792g.c cVar = (InterfaceC14792g.c) action;
            m42535c(cVar.m42523a(), cVar.getFilterOptions());
        } else {
            if (action instanceof InterfaceC14792g.h) {
                m42540m(((InterfaceC14792g.h) action).getCustomExercise());
                return;
            }
            if (action instanceof InterfaceC14792g.g) {
                m42537i(((InterfaceC14792g.g) action).getCustomExercise());
            } else {
                if (!(action instanceof InterfaceC14792g.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((C13045h2) this._cachedExerciseList).m36570j(null);
                ((C13045h2) this._cachedFilterOptions).m36570j(null);
            }
        }
    }

    public /* synthetic */ C14794i(InterfaceC28215x1 interfaceC28215x1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28218y1() : interfaceC28215x1);
    }
}
