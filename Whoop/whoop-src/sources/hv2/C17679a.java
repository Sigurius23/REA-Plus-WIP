package hv2;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.whoop.weightlifting.StrengthTrainerDestination;
import gv2.InterfaceC16243a;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hv2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lhv2/a;", "", "Leb/a0;", "strengthTrainerNavController", "globalNavController", "", "isExerciseDetailsV2ExperimentEnabled", "<init>", "(Leb/a0;Leb/a0;Z)V", "Lgv2/a$g;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lgv2/a$g;)V", "Leb/a0;", "b", "c", "Z", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17679a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 strengthTrainerNavController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 globalNavController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isExerciseDetailsV2ExperimentEnabled;

    public C17679a(AbstractC12939a0 strengthTrainerNavController, AbstractC12939a0 globalNavController, boolean z4) {
        AbstractC22676k.m65750j(strengthTrainerNavController, "strengthTrainerNavController");
        AbstractC22676k.m65750j(globalNavController, "globalNavController");
        this.strengthTrainerNavController = strengthTrainerNavController;
        this.globalNavController = globalNavController;
        this.isExerciseDetailsV2ExperimentEnabled = z4;
    }

    /* JADX INFO: renamed from: a */
    public final void m50446a(InterfaceC16243a.g event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(InterfaceC16243a.e.f61707a)) {
            if (this.strengthTrainerNavController.m36410z()) {
                return;
            }
            this.globalNavController.m36410z();
        } else {
            if (event.equals(InterfaceC16243a.f.f61708a)) {
                StrengthTrainerDestination.C10745h.m28105h(StrengthTrainerDestination.C10745h.f32788a, this.strengthTrainerNavController, true, null, 2, null);
                return;
            }
            if (event instanceof InterfaceC16243a.j) {
                if (StrengthTrainerDestination.C10745h.f32788a.m28109i(this.strengthTrainerNavController, ((InterfaceC16243a.j) event).getCustomExerciseIdToSelect())) {
                    return;
                }
                this.globalNavController.m36410z();
            } else if (event instanceof InterfaceC16243a.i) {
                StrengthTrainerDestination.C10742e.f32774a.m28082l(this.strengthTrainerNavController, ((InterfaceC16243a.i) event).getExerciseId(), this.isExerciseDetailsV2ExperimentEnabled);
            } else {
                if (!(event instanceof InterfaceC16243a.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.globalNavController.m36402q(Uri.parse("android-app://com.whoop/education?path=CUSTOM_EXERCISE_EDUCATION&screenName=Custom%20Exercise&entryPoint=customExercise"));
            }
        }
    }
}
