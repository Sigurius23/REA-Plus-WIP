package pu2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.User;
import com.whoop.domain.model.UserProfile;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import com.whoop.weightlifting.data.domain.WorkoutExercise;
import com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout;
import com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState;
import cu2.AbstractC11123c;
import cu2.AbstractC11124d;
import cu2.AbstractC11128h;
import du2.EnumC12379c;
import gy0.AbstractC16272a;
import gy0.AbstractC16277f;
import hu2.InterfaceC17654a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iu2.AbstractC20939c;
import nu2.C27146c;
import o11.InterfaceC27402h;
import od1.C27858u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33210q;
import q81.AbstractC30043a;

/* JADX INFO: renamed from: pu2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u0010*\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, m65681d2 = {"Lpu2/d;", "", "Lod1/u;", "userContext", "<init>", "(Lod1/u;)V", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "Lpu2/q;", "g", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lpu2/q;", "", "currentHeartRate", "Lpu2/r;", "f", "(Ljava/lang/Integer;)Lpu2/r;", "currentSetTimeInSeconds", "Lpu2/s;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/Integer;)Lpu2/s;", "Lpu2/o;", "e", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lpu2/o;", "Lsz0/q;", "Lpu2/p;", "i", "(Lsz0/q;)Lpu2/p;", "Lcom/whoop/design/util/TextResource;", "label", "a", "(Lcom/whoop/design/util/TextResource;)Lpu2/p;", "Lpu2/n;", "d", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lpu2/n;", "Lnu2/c;", "domainState", "Lpu2/e;", "c", "(Lnu2/c;)Lpu2/e;", "Lod1/u;", "Lcom/whoop/domain/model/UnitSystem;", "b", "()Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29556d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27858u userContext;

    public C29556d(C27858u userContext) {
        AbstractC22676k.m65750j(userContext, "userContext");
        this.userContext = userContext;
    }

    /* JADX INFO: renamed from: a */
    private final C29568p m90540a(TextResource label) {
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62384u1);
        int i13 = AbstractC11123c.f35352i;
        return new C29568p(c8688bM21277k, label, i13, i13);
    }

    /* JADX INFO: renamed from: b */
    private final UnitSystem m90541b() {
        UserProfile profile;
        UnitSystem unitSystem;
        User userM84055f = this.userContext.m84055f();
        return (userM84055f == null || (profile = userM84055f.getProfile()) == null || (unitSystem = profile.getUnitSystem()) == null) ? AbstractC20939c.m58198a() : unitSystem;
    }

    /* JADX INFO: renamed from: d */
    private final C29566n m90542d(ActiveWorkout activeWorkout) {
        InterfaceC17654a.c0 tVar;
        int i13;
        int i14;
        int i15;
        TextResource.C8688b c8688bM21277k;
        CurrentSetState currentSetState = activeWorkout.getCurrentSetState();
        if ((currentSetState instanceof CurrentSetState.Warmup) || (currentSetState instanceof CurrentSetState.Rest)) {
            tVar = new InterfaceC17654a.t(EnumC12379c.NOTIFICATION, false, 2, null);
        } else if (currentSetState instanceof CurrentSetState.Active) {
            tVar = new InterfaceC17654a.f(EnumC12379c.NOTIFICATION);
        } else {
            if (!(currentSetState instanceof CurrentSetState.Cooldown)) {
                throw new NoWhenBranchMatchedException();
            }
            tVar = InterfaceC17654a.g.f68467w;
        }
        CurrentSetState currentSetState2 = activeWorkout.getCurrentSetState();
        if ((currentSetState2 instanceof CurrentSetState.Warmup) || (currentSetState2 instanceof CurrentSetState.Rest)) {
            i13 = AbstractC16272a.f62149r2;
        } else if (currentSetState2 instanceof CurrentSetState.Active) {
            i13 = AbstractC16272a.f62180w3;
        } else {
            if (!(currentSetState2 instanceof CurrentSetState.Cooldown)) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = AbstractC16272a.f62186x3;
        }
        CurrentSetState currentSetState3 = activeWorkout.getCurrentSetState();
        if ((currentSetState3 instanceof CurrentSetState.Warmup) || (currentSetState3 instanceof CurrentSetState.Rest)) {
            i14 = AbstractC11123c.f35346c;
        } else {
            if (!(currentSetState3 instanceof CurrentSetState.Active) && !(currentSetState3 instanceof CurrentSetState.Cooldown)) {
                throw new NoWhenBranchMatchedException();
            }
            i14 = AbstractC11123c.f35347d;
        }
        CurrentSetState currentSetState4 = activeWorkout.getCurrentSetState();
        if ((currentSetState4 instanceof CurrentSetState.Warmup) || (currentSetState4 instanceof CurrentSetState.Rest)) {
            i15 = AbstractC11124d.f35354a;
        } else {
            if (!(currentSetState4 instanceof CurrentSetState.Active) && !(currentSetState4 instanceof CurrentSetState.Cooldown)) {
                throw new NoWhenBranchMatchedException();
            }
            i15 = AbstractC11124d.f35355b;
        }
        CurrentSetState currentSetState5 = activeWorkout.getCurrentSetState();
        if ((currentSetState5 instanceof CurrentSetState.Warmup) || (currentSetState5 instanceof CurrentSetState.Rest)) {
            c8688bM21277k = AbstractC8693b.m21277k(AbstractC11128h.f35391H);
        } else if (currentSetState5 instanceof CurrentSetState.Active) {
            c8688bM21277k = AbstractC8693b.m21277k(AbstractC11128h.f35480k);
        } else {
            if (!(currentSetState5 instanceof CurrentSetState.Cooldown)) {
                throw new NoWhenBranchMatchedException();
            }
            c8688bM21277k = AbstractC8693b.m21277k(AbstractC11128h.f35401K0);
        }
        return new C29566n(tVar, i13, i14, i15, c8688bM21277k);
    }

    /* JADX INFO: renamed from: e */
    private final C29567o m90543e(ActiveWorkout activeWorkout) {
        if ((activeWorkout.getCurrentSetState() instanceof CurrentSetState.Warmup) || (activeWorkout.getCurrentSetState() instanceof CurrentSetState.Cooldown)) {
            return new C29567o(m90540a(AbstractC8693b.m21277k(AbstractC11128h.f35393H1)), m90540a(AbstractC8693b.m21277k(AbstractC11128h.f35503r1)), m90540a(AbstractC29562j.m90633b(m90541b())));
        }
        InterfaceC27402h.c cVarM90634c = AbstractC29562j.m90634c(activeWorkout, m90541b());
        C29568p c29568pM90547i = m90547i(cVarM90634c.getLeftStat());
        C33210q middleStat = cVarM90634c.getMiddleStat();
        if (middleStat == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C29568p c29568pM90547i2 = m90547i(middleStat);
        C33210q rightStat = cVarM90634c.getRightStat();
        if (rightStat != null) {
            return new C29567o(c29568pM90547i, c29568pM90547i2, m90547i(rightStat));
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: renamed from: f */
    private final C29570r m90544f(Integer currentHeartRate) {
        TextResource textResourceM21277k;
        String strValueOf;
        if (currentHeartRate == null || (strValueOf = String.valueOf(currentHeartRate.intValue())) == null || (textResourceM21277k = AbstractC8693b.m21278l(strValueOf)) == null) {
            textResourceM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62384u1);
        }
        return new C29570r(textResourceM21277k, 0, 2, null);
    }

    /* JADX INFO: renamed from: g */
    private final C29569q m90545g(ActiveWorkout activeWorkout) {
        WeightliftingExercise exercise;
        WeightliftingExercise exercise2;
        CurrentSetState currentSetState = activeWorkout.getCurrentSetState();
        if (currentSetState instanceof CurrentSetState.Warmup) {
            return new C29569q(AbstractC8693b.m21277k(AbstractC11128h.f35438W1), AbstractC11123c.f35350g, false, 4, null);
        }
        if (currentSetState instanceof CurrentSetState.Cooldown) {
            return new C29569q(AbstractC8693b.m21277k(AbstractC11128h.f35478j0), AbstractC11123c.f35349f, false, 4, null);
        }
        String name = null;
        if (currentSetState instanceof CurrentSetState.Rest) {
            WorkoutExercise currentExercise = activeWorkout.getCurrentExercise();
            if (currentExercise != null && (exercise2 = currentExercise.getExercise()) != null) {
                name = exercise2.getName();
            }
            return new C29569q(AbstractC8693b.m21278l(name), 0, true, 2, null);
        }
        if (!(currentSetState instanceof CurrentSetState.Active)) {
            throw new NoWhenBranchMatchedException();
        }
        WorkoutExercise currentExercise2 = activeWorkout.getCurrentExercise();
        if (currentExercise2 != null && (exercise = currentExercise2.getExercise()) != null) {
            name = exercise.getName();
        }
        return new C29569q(AbstractC8693b.m21278l(name), 0, false, 6, null);
    }

    /* JADX INFO: renamed from: h */
    private final C29571s m90546h(ActiveWorkout activeWorkout, Integer num) {
        TextResource textResourceM21267a;
        int i13;
        Integer numM90632a = AbstractC29562j.m90632a(activeWorkout);
        if (num == null || (textResourceM21267a = AbstractC8693b.m21278l(AbstractC30043a.m91991k(num.intValue(), false, 2, null))) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        if (num == null || numM90632a == null || num.intValue() < numM90632a.intValue()) {
            CurrentSetState currentSetState = activeWorkout.getCurrentSetState();
            if (currentSetState instanceof CurrentSetState.Rest) {
                i13 = AbstractC11123c.f35348e;
            } else if (currentSetState instanceof CurrentSetState.Active) {
                i13 = AbstractC11123c.f35344a;
            } else if (currentSetState instanceof CurrentSetState.Warmup) {
                i13 = AbstractC11123c.f35350g;
            } else {
                if (!(currentSetState instanceof CurrentSetState.Cooldown)) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = AbstractC11123c.f35349f;
            }
        } else {
            i13 = AbstractC11123c.f35351h;
        }
        return new C29571s(textResourceM21267a, i13);
    }

    /* JADX INFO: renamed from: i */
    private final C29568p m90547i(C33210q c33210q) {
        return new C29568p(c33210q.getStat(), c33210q.getStatTitle(), 0, 0, 12, null);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC29557e m90548c(C27146c domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        ActiveWorkout workoutState = domainState.getWorkoutState();
        if (workoutState != null) {
            InterfaceC29557e aVar = workoutState.getGroups().isEmpty() ? InterfaceC29557e.b.f120366a : new InterfaceC29557e.a(m90545g(workoutState), m90544f(domainState.getCurrentHeartRate()), m90546h(workoutState, domainState.getCurrentSetTimeInSeconds()), m90543e(workoutState), m90542d(workoutState));
            if (aVar != null) {
                return aVar;
            }
        }
        return InterfaceC29557e.b.f120366a;
    }
}
