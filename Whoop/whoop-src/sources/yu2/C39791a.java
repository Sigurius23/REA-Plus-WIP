package yu2;

import androidx.core.app.NotificationCompat;
import com.whoop.weightlifting.StrengthTrainerDestination;
import hu2.C17656c;
import hu2.InterfaceC17655b;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yu2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lyu2/a;", "", "Leb/a0;", "strengthTrainerNavController", "globalNavController", "Lj02/o0;", "appNavigator", "<init>", "(Leb/a0;Leb/a0;Lj02/o0;)V", "Lhu2/b$f;", NotificationCompat.CATEGORY_EVENT, "", "isExerciseDetailsV2ExperimentEnabled", "Ll83/a0;", "a", "(Lhu2/b$f;Z)V", "Leb/a0;", "b", "c", "Lj02/o0;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39791a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 strengthTrainerNavController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 globalNavController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC21159o0 appNavigator;

    public C39791a(AbstractC12939a0 strengthTrainerNavController, AbstractC12939a0 globalNavController, InterfaceC21159o0 appNavigator) {
        AbstractC22676k.m65750j(strengthTrainerNavController, "strengthTrainerNavController");
        AbstractC22676k.m65750j(globalNavController, "globalNavController");
        AbstractC22676k.m65750j(appNavigator, "appNavigator");
        this.strengthTrainerNavController = strengthTrainerNavController;
        this.globalNavController = globalNavController;
        this.appNavigator = appNavigator;
    }

    /* JADX INFO: renamed from: a */
    public final void m127531a(InterfaceC17655b.f event, boolean isExerciseDetailsV2ExperimentEnabled) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(InterfaceC17655b.c.f68493w)) {
            this.strengthTrainerNavController.m36410z();
            return;
        }
        if (event.equals(C17656c.f68511w)) {
            StrengthTrainerDestination.C10745h.m28105h(StrengthTrainerDestination.C10745h.f32788a, this.strengthTrainerNavController, false, null, 3, null);
            return;
        }
        if (event.equals(InterfaceC17655b.h.f68497w)) {
            this.appNavigator.mo59393b(new AbstractC21155m0.z1(null, 1, null));
            return;
        }
        if (event.equals(InterfaceC17655b.o.f68510w)) {
            StrengthTrainerDestination.C10740c.f32762a.m28044a(this.strengthTrainerNavController);
        } else if (event.equals(InterfaceC17655b.d.f68494w)) {
            this.globalNavController.m36410z();
        } else {
            if (!(event instanceof InterfaceC17655b.g)) {
                throw new NoWhenBranchMatchedException();
            }
            StrengthTrainerDestination.C10742e.m28080p(StrengthTrainerDestination.C10742e.f32774a, this.strengthTrainerNavController, ((InterfaceC17655b.g) event).getExerciseId(), false, null, "Workout Builder", isExerciseDetailsV2ExperimentEnabled, 4, null);
        }
    }
}
