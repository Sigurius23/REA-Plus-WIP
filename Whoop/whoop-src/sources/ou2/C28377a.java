package ou2;

import com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout;
import hu2.InterfaceC17654a;
import nu2.C27146c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ou2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lou2/a;", "", "<init>", "()V", "Lnu2/c;", "domainState", "Lhu2/a$k;", "a", "(Lnu2/c;)Lhu2/a$k;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28377a {
    /* JADX INFO: renamed from: a */
    public final InterfaceC17654a.k m86072a(C27146c domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        ActiveWorkout workoutState = domainState.getWorkoutState();
        if (workoutState != null && workoutState.getShouldReturnToWorkoutLibrary()) {
            return InterfaceC17654a.a.f68459w;
        }
        if (domainState.getWorkoutState() == null && domainState.getWorkoutCompleted()) {
            return InterfaceC17654a.j.f68470w;
        }
        return null;
    }
}
