package nu2;

import com.whoop.weightlifting.data.domain.WorkoutExercise;
import com.whoop.weightlifting.data.domain.WorkoutGroup;
import com.whoop.weightlifting.data.domain.WorkoutSet;
import com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nu2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u0015\u0010\n\u001a\u00020\u0004*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WorkoutGroup;", "", "Ljava/util/UUID;", "completedSetIds", "", "b", "(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;Ljava/util/Set;)Z", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;", "a", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;)Z", "supportsUpdatingNextSet", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27147d {
    /* JADX INFO: renamed from: a */
    public static final boolean m81637a(CurrentSetState currentSetState) {
        AbstractC22676k.m65750j(currentSetState, "<this>");
        return ((currentSetState instanceof CurrentSetState.Active) || (currentSetState instanceof CurrentSetState.Cooldown)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m81638b(WorkoutGroup workoutGroup, Set<UUID> completedSetIds) {
        AbstractC22676k.m65750j(workoutGroup, "<this>");
        AbstractC22676k.m65750j(completedSetIds, "completedSetIds");
        List<WorkoutExercise> exercises = workoutGroup.getExercises();
        if ((exercises instanceof Collection) && exercises.isEmpty()) {
            return true;
        }
        Iterator<T> it = exercises.iterator();
        while (it.hasNext()) {
            List<WorkoutSet> sets = ((WorkoutExercise) it.next()).getSets();
            if (!(sets instanceof Collection) || !sets.isEmpty()) {
                Iterator<T> it3 = sets.iterator();
                while (it3.hasNext()) {
                    if (!completedSetIds.contains(((WorkoutSet) it3.next()).getId())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
