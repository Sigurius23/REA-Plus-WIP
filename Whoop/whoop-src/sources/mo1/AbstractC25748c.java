package mo1;

import androidx.room.C1815o0;
import c93.InterfaceC4339a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.TrackedBehaviorModel;
import com.whoop.design.models.items.TrackerInputModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import v41.EnumC35665f0;
import w71.C36892k0;
import w71.C36901t;

/* JADX INFO: renamed from: mo1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Llb1/z0;", "Lkotlin/Function0;", "Lmo1/d;", "trackedBehaviorReducer", "Ll83/a0;", "b", "(Llb1/z0;Lc93/a;)V", "Lcom/whoop/design/models/items/TrackedBehaviorModel;", "Lw71/k0;", "d", "(Lcom/whoop/design/models/items/TrackedBehaviorModel;)Lw71/k0;", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25748c {

    /* JADX INFO: renamed from: mo1.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f101456w;

        public a(Function1 function1) {
            this.f101456w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f101456w.invoke((TrackedBehaviorModel) it);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m75964b(C23749z0 c23749z0, InterfaceC4339a trackedBehaviorReducer) {
        AbstractC22676k.m65750j(c23749z0, "<this>");
        AbstractC22676k.m65750j(trackedBehaviorReducer, "trackedBehaviorReducer");
        c23749z0.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(TrackedBehaviorModel.class), new a(new C1815o0(trackedBehaviorReducer, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C36901t m75965c(InterfaceC4339a interfaceC4339a, TrackedBehaviorModel model) {
        AbstractC22676k.m65750j(model, "model");
        return C36901t.m118482c(((C25749d) interfaceC4339a.invoke()).m75978h(model), null, null, false, false, false, EnumC35665f0.FilledCard, m75966d(model), 31, null);
    }

    /* JADX INFO: renamed from: d */
    private static final C36892k0 m75966d(TrackedBehaviorModel trackedBehaviorModel) {
        String stateKey = trackedBehaviorModel.getStateKey();
        if (stateKey == null) {
            return null;
        }
        int id4 = trackedBehaviorModel.getBehaviorTracker().getId();
        boolean zIsSuggested = trackedBehaviorModel.isSuggested();
        TrackerInputModel trackerInput = trackedBehaviorModel.getTrackerInput();
        Boolean answeredYes = trackerInput != null ? trackerInput.getAnsweredYes() : null;
        TrackerInputModel trackerInput2 = trackedBehaviorModel.getTrackerInput();
        Double magnitudeInputValue = trackerInput2 != null ? trackerInput2.getMagnitudeInputValue() : null;
        TrackerInputModel trackerInput3 = trackedBehaviorModel.getTrackerInput();
        String magnitudeInputLabel = trackerInput3 != null ? trackerInput3.getMagnitudeInputLabel() : null;
        TrackerInputModel trackerInput4 = trackedBehaviorModel.getTrackerInput();
        Long timeInputValue = trackerInput4 != null ? trackerInput4.getTimeInputValue() : null;
        TrackerInputModel trackerInput5 = trackedBehaviorModel.getTrackerInput();
        return new C36892k0(stateKey, id4, zIsSuggested, answeredYes, magnitudeInputValue, magnitudeInputLabel, timeInputValue, trackerInput5 != null ? trackerInput5.getTimeInputLabel() : null, null, 256, null);
    }
}
