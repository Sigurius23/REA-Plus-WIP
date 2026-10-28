package ou2;

import androidx.core.app.NotificationCompat;
import com.whoop.weightlifting.StrengthTrainerDestination;
import hu2.C17656c;
import hu2.InterfaceC17654a;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ou2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lou2/b;", "", "Leb/a0;", "strengthTrainerNavController", "Lj02/o0;", "appNavigator", "<init>", "(Leb/a0;Lj02/o0;)V", "Lhu2/a$k;", NotificationCompat.CATEGORY_EVENT, "", "isExerciseDetailsV2ExperimentEnabled", "Ll83/a0;", "a", "(Lhu2/a$k;Z)V", "Leb/a0;", "b", "Lj02/o0;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28378b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 strengthTrainerNavController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 appNavigator;

    public C28378b(AbstractC12939a0 strengthTrainerNavController, InterfaceC21159o0 appNavigator) {
        AbstractC22676k.m65750j(strengthTrainerNavController, "strengthTrainerNavController");
        AbstractC22676k.m65750j(appNavigator, "appNavigator");
        this.strengthTrainerNavController = strengthTrainerNavController;
        this.appNavigator = appNavigator;
    }

    /* JADX INFO: renamed from: a */
    public final void m86073a(InterfaceC17654a.k event, boolean isExerciseDetailsV2ExperimentEnabled) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC17654a.a) {
            this.strengthTrainerNavController.m36410z();
            return;
        }
        if (event instanceof InterfaceC17654a.i) {
            StrengthTrainerDestination.C10742e.m28080p(StrengthTrainerDestination.C10742e.f32774a, this.strengthTrainerNavController, ((InterfaceC17654a.i) event).getExerciseId(), false, null, "Live Session", isExerciseDetailsV2ExperimentEnabled, 4, null);
        } else if (event instanceof C17656c) {
            StrengthTrainerDestination.C10745h.m28105h(StrengthTrainerDestination.C10745h.f32788a, this.strengthTrainerNavController, false, "Live Session", 1, null);
        } else {
            if (!(event instanceof InterfaceC17654a.j)) {
                throw new NoWhenBranchMatchedException();
            }
            this.appNavigator.mo59393b(new AbstractC21155m0.z1(null, 1, null));
        }
    }
}
