package p197hj;

import c93.InterfaceC4339a;
import com.amplitude.android.engagement.types.Nudge;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: hj.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C17327j extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67117w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Nudge f67118x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17327j(Nudge nudge, int i13) {
        super(0);
        this.f67117w = i13;
        this.f67118x = nudge;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f67117w) {
            case 0:
                return "AmplitudeEngagement.sdk[internal]#closeNudge(nudge=" + this.f67118x + ')';
            case 1:
                return "AmplitudeEngagement.sdk[internal]#dismissNudge(nudge=" + this.f67118x + ')';
            default:
                return Integer.valueOf(this.f67118x.getSteps().size());
        }
    }
}
