package p197hj;

import c93.InterfaceC4339a;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.TriggerEventPayload;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: hj.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C17331n extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67127w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Nudge f67128x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TriggerEventPayload f67129y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17331n(Nudge nudge, TriggerEventPayload triggerEventPayload, int i13) {
        super(0);
        this.f67127w = i13;
        this.f67128x = nudge;
        this.f67129y = triggerEventPayload;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f67127w) {
            case 0:
                return "AmplitudeEngagement.sdk[internal]#forceTriggerSingleNudge(nudge=" + this.f67128x + ", triggerEventPayload=" + this.f67129y + ')';
            default:
                return "AmplitudeEngagement.sdk[internal]#sendDirectedTrigger(nudge=" + this.f67128x + ", triggerEventPayload=" + this.f67129y + ')';
        }
    }
}
