package pu2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import com.whoop.weightlifting.data.domain.VolumeInputFormat;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import com.whoop.weightlifting.data.domain.WorkoutExercise;
import com.whoop.weightlifting.data.domain.WorkoutSet;
import com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout;
import com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState;
import cu2.AbstractC11128h;
import gy0.AbstractC16277f;
import o11.InterfaceC27402h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33210q;
import r41.AbstractC30924h;

/* JADX INFO: renamed from: pu2.j */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "Lo11/h$c;", "c", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/domain/model/UnitSystem;)Lo11/h$c;", "Lcom/whoop/design/util/TextResource$b;", "b", "(Lcom/whoop/domain/model/UnitSystem;)Lcom/whoop/design/util/TextResource$b;", "", "a", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Ljava/lang/Integer;", "Lo11/h$c;", "emptyExerciseStats", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29562j {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC27402h.c f120610a = new InterfaceC27402h.c(new C33210q(null, AbstractC8693b.m21267a(), null, null, null, null, AbstractC8693b.m21267a(), false, null, null, null, false, 4029, null), new C33210q(null, AbstractC8693b.m21267a(), null, null, null, null, AbstractC8693b.m21267a(), false, null, null, null, false, 4029, null), new C33210q(null, AbstractC8693b.m21267a(), null, null, null, null, AbstractC8693b.m21267a(), false, null, null, null, false, 4029, null), false, 8, null);

    /* JADX INFO: renamed from: pu2.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f120611a;

        static {
            int[] iArr = new int[UnitSystem.values().length];
            try {
                iArr[UnitSystem.METRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UnitSystem.IMPERIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f120611a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Integer m90632a(ActiveWorkout activeWorkout) {
        Integer timeAsIntSeconds;
        WeightliftingExercise exercise;
        AbstractC22676k.m65750j(activeWorkout, "<this>");
        WorkoutSet currentSet = activeWorkout.getCurrentSet();
        if (currentSet != null && (timeAsIntSeconds = currentSet.getTimeAsIntSeconds()) != null) {
            WorkoutExercise currentExercise = activeWorkout.getCurrentExercise();
            if (((currentExercise == null || (exercise = currentExercise.getExercise()) == null) ? null : exercise.getVolumeInputFormat()) == VolumeInputFormat.Time && (activeWorkout.getCurrentSetState() instanceof CurrentSetState.Active)) {
                return timeAsIntSeconds;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final TextResource.C8688b m90633b(UnitSystem unitSystem) {
        int i13;
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        int i14 = a.f120611a[unitSystem.ordinal()];
        if (i14 == 1) {
            i13 = AbstractC11128h.f35440X0;
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = AbstractC11128h.f35443Y0;
        }
        return AbstractC8693b.m21277k(i13);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC27402h.c m90634c(ActiveWorkout activeWorkout, UnitSystem unitSystem) {
        WorkoutSet currentSet;
        C33210q c33210q;
        AbstractC22676k.m65750j(activeWorkout, "<this>");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        WorkoutExercise currentExercise = activeWorkout.getCurrentExercise();
        if (currentExercise != null && (currentSet = activeWorkout.getCurrentSet()) != null) {
            C33210q c33210q2 = new C33210q(null, new TextResource.C8688b(AbstractC11128h.f35396I1, new TextResource.AbstractC8690d.b(Integer.valueOf(activeWorkout.getCurrentSetIndex() + 1)), new TextResource.AbstractC8690d.b(Integer.valueOf(currentExercise.getSets().size()))), null, null, null, null, AbstractC8693b.m21277k(AbstractC11128h.f35393H1), false, null, null, null, false, 4029, null);
            if (currentExercise.getExercise().getVolumeInputFormat() == VolumeInputFormat.Time) {
                c33210q = new C33210q(null, currentSet.getTime().length() == 0 ? AbstractC8693b.m21277k(AbstractC16277f.f62384u1) : AbstractC8693b.m21278l(AbstractC30924h.m95066G(currentSet.getTime())), null, null, null, null, AbstractC8693b.m21277k(AbstractC11128h.f35414O1), false, null, null, null, false, 4029, null);
            } else {
                c33210q = new C33210q(null, currentSet.getNumberOfReps().length() == 0 ? AbstractC8693b.m21277k(AbstractC16277f.f62384u1) : AbstractC8693b.m21278l(currentSet.getNumberOfReps()), null, null, null, null, AbstractC8693b.m21277k(AbstractC11128h.f35503r1), false, null, null, null, false, 4029, null);
            }
            return new InterfaceC27402h.c(c33210q2, c33210q, new C33210q(null, currentSet.getWeight().length() == 0 ? AbstractC8693b.m21277k(AbstractC16277f.f62384u1) : AbstractC8693b.m21278l(currentSet.getWeight()), null, null, null, null, m90633b(unitSystem), false, null, null, null, false, 4029, null), true);
        }
        return f120610a;
    }
}
