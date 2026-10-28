package fu2;

import b30.C2588o1;
import b30.C2663y4;
import com.whoop.data.local.room.dao.persistent.C6494e;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import com.whoop.weightlifting.data.domain.WorkoutExercise;
import com.whoop.weightlifting.data.domain.WorkoutGroup;
import com.whoop.weightlifting.data.domain.WorkoutSet;
import d21.C11506d;
import eg.C13161j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import or2.C28218y1;
import or2.InterfaceC28215x1;
import p098dt.AbstractC12350b;
import p704dk2.C12122i;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import z82.InterfaceC40188b;

/* JADX INFO: renamed from: fu2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\n*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\n*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\n*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\n*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u0018J3\u0010\"\u001a\u00020\n*\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J;\u0010'\u001a\u00020\n*\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010$\u001a\u00020 2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J3\u0010*\u001a\u00020\n*\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010)\u001a\u00020 H\u0002¢\u0006\u0004\b*\u0010#J#\u0010-\u001a\u00020\n*\u00020\n2\u0006\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0014H\u0002¢\u0006\u0004\b-\u0010\u0018J\u0013\u0010.\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b.\u0010/J/\u00103\u001a\u00020\n*\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00142\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020100H\u0002¢\u0006\u0004\b3\u00104J7\u00106\u001a\u00020\n*\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020500H\u0002¢\u0006\u0004\b6\u00107J?\u00109\u001a\u00020\n*\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00142\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020800H\u0002¢\u0006\u0004\b9\u0010:Ji\u0010@\u001a\u00020\n*\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u00142\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00100<2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00100<2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00100<2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020800H\u0002¢\u0006\u0004\b@\u0010AJ/\u0010B\u001a\u00020\n*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020500H\u0002¢\u0006\u0004\bB\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, m65681d2 = {"Lfu2/d;", "", "Lor2/x1;", "uuidGenerator", "Lz82/b;", "analyticsManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lor2/x1;Lz82/b;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lfu2/c;", "currentState", "Lfu2/b$n;", "action", "t", "(Lfu2/c;Lfu2/b$n;)Lfu2/c;", "Ljava/util/UUID;", "exerciseId", "y", "(Lfu2/c;Ljava/util/UUID;)Lfu2/c;", "", "groupIndex", "exerciseIndex", "q", "(Lfu2/c;II)Lfu2/c;", "n", "(Lfu2/c;I)Lfu2/c;", "setIndexToDelete", "v", "groupIndexToUpdate", "exerciseIndexToUpdate", "setIndexToUpdate", "", "newRepsText", "E", "(Lfu2/c;IIILjava/lang/String;)Lfu2/c;", "newTimeText", "", "skipCascading", "L", "(Lfu2/c;IIILjava/lang/String;Z)Lfu2/c;", "newWeightText", "O", "fromIndex", "toIndex", "x", "p", "(Lfu2/c;)Lfu2/c;", "Lkotlin/Function1;", "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;", "update", "D", "(Lfu2/c;ILkotlin/jvm/functions/Function1;)Lfu2/c;", "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;", "z", "(Lfu2/c;IILkotlin/jvm/functions/Function1;)Lfu2/c;", "Lcom/whoop/weightlifting/data/domain/WorkoutSet;", "H", "(Lfu2/c;IIILkotlin/jvm/functions/Function1;)Lfu2/c;", "startingSetIndex", "", "completedSetIds", "ignoredSetIds", "updatedManuallyEditedSetIds", "J", "(Lfu2/c;IIILjava/util/Set;Ljava/util/Set;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)Lfu2/c;", "B", "a", "Lor2/x1;", "b", "Lz82/b;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "u", "()Z", "isCascadeEnabled", "s", "()Ljava/util/UUID;", "randomUuid", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14789d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC28215x1 uuidGenerator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC40188b analyticsManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C14789d(InterfaceC28215x1 uuidGenerator, InterfaceC40188b analyticsManager, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(uuidGenerator, "uuidGenerator");
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.uuidGenerator = uuidGenerator;
        this.analyticsManager = analyticsManager;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final WorkoutGroup m42473A(Function1 function1, int i13, WorkoutGroup updateGroup) {
        AbstractC22676k.m65750j(updateGroup, "$this$updateGroup");
        List<WorkoutExercise> exercises = updateGroup.getExercises();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(exercises, 10));
        Iterator<T> it = exercises.iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                return WorkoutGroup.copy$default(updateGroup, arrayList, null, 2, null);
            }
            Object next = it.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            WorkoutExercise workoutExercise = (WorkoutExercise) next;
            WorkoutExercise workoutExercise2 = i14 != i13 ? workoutExercise : null;
            if (workoutExercise2 == null) {
                workoutExercise2 = (WorkoutExercise) function1.invoke(workoutExercise);
            }
            arrayList.add(workoutExercise2);
            i14 = i15;
        }
    }

    /* JADX INFO: renamed from: B */
    private final C14788c m42474B(C14788c c14788c, int i13, Function1 function1) {
        return m42476D(c14788c, i13, new C12122i(function1, 26));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final WorkoutGroup m42475C(Function1 function1, WorkoutGroup updateGroup) {
        AbstractC22676k.m65750j(updateGroup, "$this$updateGroup");
        List<WorkoutExercise> exercises = updateGroup.getExercises();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(exercises, 10));
        Iterator<T> it = exercises.iterator();
        while (it.hasNext()) {
            arrayList.add((WorkoutExercise) function1.invoke((WorkoutExercise) it.next()));
        }
        return WorkoutGroup.copy$default(updateGroup, arrayList, null, 2, null);
    }

    /* JADX INFO: renamed from: D */
    private final C14788c m42476D(C14788c c14788c, int i13, Function1 function1) {
        List<WorkoutGroup> listM42470f = c14788c.m42470f();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM42470f, 10));
        int i14 = 0;
        for (Object obj : listM42470f) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            WorkoutGroup workoutGroup = (WorkoutGroup) obj;
            WorkoutGroup workoutGroup2 = i14 != i13 ? workoutGroup : null;
            if (workoutGroup2 == null) {
                workoutGroup2 = (WorkoutGroup) function1.invoke(workoutGroup);
            }
            arrayList.add(workoutGroup2);
            i14 = i15;
        }
        return C14788c.m42465d(c14788c, arrayList, null, null, null, 14, null);
    }

    /* JADX INFO: renamed from: E */
    private final C14788c m42477E(C14788c c14788c, int i13, int i14, int i15, String str) {
        List<WorkoutExercise> exercises;
        WorkoutExercise workoutExercise;
        WorkoutGroup workoutGroup = (WorkoutGroup) AbstractC25265s.m74102I0(i13, c14788c.m42470f());
        if (workoutGroup != null && (exercises = workoutGroup.getExercises()) != null && (workoutExercise = (WorkoutExercise) AbstractC25265s.m74102I0(i14, exercises)) != null && WorkoutSet.INSTANCE.isValidNumberOfReps(str)) {
            String string = AbstractC39414r.m125869O0(str).toString();
            WorkoutSet workoutSet = (WorkoutSet) AbstractC25265s.m74102I0(i15, workoutExercise.getSets());
            if (workoutSet != null && !AbstractC22676k.m65745e(workoutSet.getNumberOfReps(), string)) {
                return !m42509u() ? m42480H(c14788c, i13, i14, i15, new C2663y4(string, 19)) : m42482J(c14788c, i13, i14, i15, c14788c.m42469e(), AbstractC12350b.m34556E(c14788c.m42469e(), c14788c.m42472h()), AbstractC12350b.m34555D(workoutSet.getId(), c14788c.m42472h()), new C2663y4(string, 20));
            }
        }
        return c14788c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final WorkoutSet m42478F(String str, WorkoutSet updateSet) {
        AbstractC22676k.m65750j(updateSet, "$this$updateSet");
        return WorkoutSet.copy$default(updateSet, str, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final WorkoutSet m42479G(String str, WorkoutSet updateSetsFromIndex) {
        AbstractC22676k.m65750j(updateSetsFromIndex, "$this$updateSetsFromIndex");
        return WorkoutSet.copy$default(updateSetsFromIndex, str, null, null, null, 14, null);
    }

    /* JADX INFO: renamed from: H */
    private final C14788c m42480H(C14788c c14788c, int i13, int i14, int i15, Function1 function1) {
        return m42514z(c14788c, i13, i14, new C11506d(function1, i15, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final WorkoutExercise m42481I(Function1 function1, int i13, WorkoutExercise updateExercise) {
        AbstractC22676k.m65750j(updateExercise, "$this$updateExercise");
        List<WorkoutSet> sets = updateExercise.getSets();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sets, 10));
        int i14 = 0;
        for (Object obj : sets) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            WorkoutSet workoutSet = (WorkoutSet) obj;
            WorkoutSet workoutSet2 = i14 != i13 ? workoutSet : null;
            if (workoutSet2 == null) {
                workoutSet2 = (WorkoutSet) function1.invoke(workoutSet);
            }
            arrayList.add(workoutSet2);
            i14 = i15;
        }
        return WorkoutExercise.copy$default(updateExercise, arrayList, null, null, 6, null);
    }

    /* JADX INFO: renamed from: J */
    private final C14788c m42482J(C14788c c14788c, int i13, int i14, int i15, Set<UUID> set, Set<UUID> set2, Set<UUID> set3, Function1 function1) {
        return C14788c.m42465d(m42514z(c14788c, i13, i14, new C2588o1(i15, set, set2, function1)), null, null, set3, null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final WorkoutExercise m42483K(int i13, Set set, Set set2, Function1 function1, WorkoutExercise updateExercise) {
        AbstractC22676k.m65750j(updateExercise, "$this$updateExercise");
        WorkoutSet workoutSet = (WorkoutSet) AbstractC25265s.m74102I0(i13, updateExercise.getSets());
        UUID id4 = workoutSet != null ? workoutSet.getId() : null;
        boolean z4 = id4 != null && set.contains(id4);
        List<WorkoutSet> sets = updateExercise.getSets();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sets, 10));
        int i14 = 0;
        for (Object obj : sets) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            WorkoutSet workoutSet2 = (WorkoutSet) obj;
            boolean z13 = i14 == i13;
            boolean z14 = (!(i14 > i13) || z4 || set2.contains(workoutSet2.getId())) ? false : true;
            if (z13 || z14) {
                workoutSet2 = (WorkoutSet) function1.invoke(workoutSet2);
            }
            arrayList.add(workoutSet2);
            i14 = i15;
        }
        return WorkoutExercise.copy$default(updateExercise, arrayList, null, null, 6, null);
    }

    /* JADX INFO: renamed from: L */
    private final C14788c m42484L(C14788c c14788c, int i13, int i14, int i15, String str, boolean z4) {
        List<WorkoutExercise> exercises;
        WorkoutExercise workoutExercise;
        WorkoutGroup workoutGroup = (WorkoutGroup) AbstractC25265s.m74102I0(i13, c14788c.m42470f());
        if (workoutGroup != null && (exercises = workoutGroup.getExercises()) != null && (workoutExercise = (WorkoutExercise) AbstractC25265s.m74102I0(i14, exercises)) != null && WorkoutSet.INSTANCE.isValidTime(str)) {
            String string = AbstractC39414r.m125869O0(str).toString();
            WorkoutSet workoutSet = (WorkoutSet) AbstractC25265s.m74102I0(i15, workoutExercise.getSets());
            if (workoutSet != null && !AbstractC22676k.m65745e(workoutSet.getTime(), string)) {
                return (z4 || !m42509u()) ? m42480H(c14788c, i13, i14, i15, new C2663y4(string, 17)) : m42482J(c14788c, i13, i14, i15, c14788c.m42469e(), AbstractC12350b.m34556E(c14788c.m42469e(), c14788c.m42472h()), AbstractC12350b.m34555D(workoutSet.getId(), c14788c.m42472h()), new C2663y4(string, 18));
            }
        }
        return c14788c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final WorkoutSet m42485M(String str, WorkoutSet updateSet) {
        AbstractC22676k.m65750j(updateSet, "$this$updateSet");
        return WorkoutSet.copy$default(updateSet, null, str, null, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final WorkoutSet m42486N(String str, WorkoutSet updateSetsFromIndex) {
        AbstractC22676k.m65750j(updateSetsFromIndex, "$this$updateSetsFromIndex");
        return WorkoutSet.copy$default(updateSetsFromIndex, null, str, null, null, 13, null);
    }

    /* JADX INFO: renamed from: O */
    private final C14788c m42487O(C14788c c14788c, int i13, int i14, int i15, String str) {
        List<WorkoutExercise> exercises;
        WorkoutExercise workoutExercise;
        WorkoutGroup workoutGroup = (WorkoutGroup) AbstractC25265s.m74102I0(i13, c14788c.m42470f());
        if (workoutGroup != null && (exercises = workoutGroup.getExercises()) != null && (workoutExercise = (WorkoutExercise) AbstractC25265s.m74102I0(i14, exercises)) != null && WorkoutSet.INSTANCE.isValidWeight(str)) {
            String string = AbstractC39414r.m125869O0(str).toString();
            WorkoutSet workoutSet = (WorkoutSet) AbstractC25265s.m74102I0(i15, workoutExercise.getSets());
            if (workoutSet != null && !AbstractC22676k.m65745e(workoutSet.getWeight(), string)) {
                return !m42509u() ? m42480H(c14788c, i13, i14, i15, new C2663y4(string, 21)) : m42482J(c14788c, i13, i14, i15, c14788c.m42469e(), AbstractC12350b.m34556E(c14788c.m42469e(), c14788c.m42472h()), AbstractC12350b.m34555D(workoutSet.getId(), c14788c.m42472h()), new C2663y4(string, 22));
            }
        }
        return c14788c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final WorkoutSet m42488P(String str, WorkoutSet updateSet) {
        AbstractC22676k.m65750j(updateSet, "$this$updateSet");
        return WorkoutSet.copy$default(updateSet, null, null, str, null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final WorkoutSet m42489Q(String str, WorkoutSet updateSetsFromIndex) {
        AbstractC22676k.m65750j(updateSetsFromIndex, "$this$updateSetsFromIndex");
        return WorkoutSet.copy$default(updateSetsFromIndex, null, null, str, null, 11, null);
    }

    /* JADX INFO: renamed from: n */
    private final C14788c m42503n(C14788c c14788c, int i13) {
        return m42474B(c14788c, i13, new C13161j(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final WorkoutExercise m42504o(C14789d c14789d, WorkoutExercise updateExercisesInGroup) {
        AbstractC22676k.m65750j(updateExercisesInGroup, "$this$updateExercisesInGroup");
        WorkoutSet workoutSet = (WorkoutSet) AbstractC25265s.m74114R0(updateExercisesInGroup.getSets());
        return WorkoutExercise.copy$default(updateExercisesInGroup, AbstractC25265s.m74128f1(workoutSet != null ? new WorkoutSet(workoutSet.getNumberOfReps(), workoutSet.getTime(), workoutSet.getWeight(), c14789d.m42508s()) : WorkoutSet.INSTANCE.m134199default(c14789d.m42508s()), updateExercisesInGroup.getSets()), null, null, 6, null);
    }

    /* JADX INFO: renamed from: p */
    private final C14788c m42505p(C14788c c14788c) {
        return C14788c.m42465d(c14788c, null, C25235a0.f99113w, null, null, 13, null);
    }

    /* JADX INFO: renamed from: q */
    private final C14788c m42506q(C14788c c14788c, int i13, int i14) {
        List<WorkoutExercise> exercises;
        WorkoutExercise workoutExercise;
        WeightliftingExercise exercise;
        WorkoutGroup workoutGroup = (WorkoutGroup) AbstractC25265s.m74102I0(i13, c14788c.m42470f());
        if (workoutGroup == null || (exercises = workoutGroup.getExercises()) == null || (workoutExercise = (WorkoutExercise) AbstractC25265s.m74102I0(i14, exercises)) == null || (exercise = workoutExercise.getExercise()) == null) {
            return c14788c;
        }
        this.analyticsManager.mo41424f(exercise.getExerciseId(), "Remove Exercise", "", "Workout Builder");
        C14788c c14788cM42476D = m42476D(C14788c.m42465d(c14788c, null, AbstractC12350b.m34604y(c14788c.m42470f().get(i13).getExercises().get(i14).getId(), c14788c.m42471g()), null, null, 13, null), i13, new C6494e(i14, 9));
        List<WorkoutGroup> listM42470f = c14788cM42476D.m42470f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM42470f) {
            if (!((WorkoutGroup) obj).getExercises().isEmpty()) {
                arrayList.add(obj);
            }
        }
        return C14788c.m42465d(c14788cM42476D, arrayList, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final WorkoutGroup m42507r(int i13, WorkoutGroup updateGroup) {
        AbstractC22676k.m65750j(updateGroup, "$this$updateGroup");
        List<WorkoutExercise> exercises = updateGroup.getExercises();
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Object obj : exercises) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            if (i14 != i13) {
                arrayList.add(obj);
            }
            i14 = i15;
        }
        return WorkoutGroup.copy$default(updateGroup, arrayList, null, 2, null);
    }

    /* JADX INFO: renamed from: s */
    private final UUID m42508s() {
        return this.uuidGenerator.mo85405a();
    }

    /* JADX INFO: renamed from: u */
    private final boolean m42509u() {
        return this.featureFlagChecker.isFeatureEnabled("st-cascade-set-values");
    }

    /* JADX INFO: renamed from: v */
    private final C14788c m42510v(C14788c c14788c, int i13, int i14) {
        return m42474B(c14788c, i13, new C6494e(i14, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final WorkoutExercise m42511w(int i13, WorkoutExercise updateExercisesInGroup) {
        AbstractC22676k.m65750j(updateExercisesInGroup, "$this$updateExercisesInGroup");
        List<WorkoutSet> sets = updateExercisesInGroup.getSets();
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Object obj : sets) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            if (i14 != i13) {
                arrayList.add(obj);
            }
            i14 = i15;
        }
        return WorkoutExercise.copy$default(updateExercisesInGroup, arrayList, null, null, 6, null);
    }

    /* JADX INFO: renamed from: x */
    private final C14788c m42512x(C14788c c14788c, int i13, int i14) {
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(c14788c.m42470f());
        if (i13 >= 0 && i13 < arrayListM74097F1.size() && i14 >= 0 && i14 < arrayListM74097F1.size()) {
            arrayListM74097F1.add(i14, arrayListM74097F1.remove(i13));
        }
        return C14788c.m42465d(c14788c, arrayListM74097F1, null, null, null, 14, null);
    }

    /* JADX INFO: renamed from: y */
    private final C14788c m42513y(C14788c c14788c, UUID uuid) {
        return C14788c.m42465d(c14788c, null, c14788c.m42471g().contains(uuid) ? AbstractC12350b.m34604y(uuid, c14788c.m42471g()) : AbstractC12350b.m34555D(uuid, c14788c.m42471g()), null, null, 13, null);
    }

    /* JADX INFO: renamed from: z */
    private final C14788c m42514z(C14788c c14788c, int i13, int i14, Function1 function1) {
        return m42476D(c14788c, i13, new C11506d(function1, i14, 4));
    }

    /* JADX INFO: renamed from: t */
    public final C14788c m42515t(C14788c currentState, InterfaceC14787b.n action) {
        AbstractC22676k.m65750j(currentState, "currentState");
        AbstractC22676k.m65750j(action, "action");
        if (action instanceof InterfaceC14787b.o) {
            return m42513y(currentState, ((InterfaceC14787b.o) action).getExerciseId());
        }
        if (action instanceof InterfaceC14787b.d) {
            InterfaceC14787b.d dVar = (InterfaceC14787b.d) action;
            return m42506q(currentState, dVar.getGroupIndex(), dVar.getExerciseIndex());
        }
        if (action instanceof InterfaceC14787b.a) {
            return m42503n(currentState, ((InterfaceC14787b.a) action).getGroupIndex());
        }
        if (action instanceof InterfaceC14787b.j) {
            InterfaceC14787b.j jVar = (InterfaceC14787b.j) action;
            return m42510v(currentState, jVar.getGroupIndex(), jVar.getSetIndex());
        }
        if (action instanceof InterfaceC14787b.p) {
            InterfaceC14787b.p pVar = (InterfaceC14787b.p) action;
            return m42477E(currentState, pVar.getGroupIndex(), pVar.getExerciseIndex(), pVar.getSetIndex(), pVar.getNewRepsText());
        }
        if (action instanceof InterfaceC14787b.q) {
            InterfaceC14787b.q qVar = (InterfaceC14787b.q) action;
            return m42484L(currentState, qVar.getGroupIndex(), qVar.getExerciseIndex(), qVar.getSetIndex(), qVar.getNewTimeText(), qVar.getSkipCascading());
        }
        if (action instanceof InterfaceC14787b.r) {
            InterfaceC14787b.r rVar = (InterfaceC14787b.r) action;
            return m42487O(currentState, rVar.getGroupIndex(), rVar.getExerciseIndex(), rVar.getSetIndex(), rVar.getNewWeightText());
        }
        if (action instanceof InterfaceC14787b.k) {
            InterfaceC14787b.k kVar = (InterfaceC14787b.k) action;
            return m42512x(currentState, kVar.getFromIndex(), kVar.getToIndex());
        }
        if (action instanceof InterfaceC14787b.c) {
            return m42505p(currentState);
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C14789d(InterfaceC28215x1 interfaceC28215x1, InterfaceC40188b interfaceC40188b, FeatureFlagChecker featureFlagChecker, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28218y1() : interfaceC28215x1, interfaceC40188b, featureFlagChecker);
    }
}
