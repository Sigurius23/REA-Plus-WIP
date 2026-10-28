package p197hj;

import c93.InterfaceC4339a;
import com.amplitude.android.engagement.types.Action;
import com.amplitude.android.engagement.types.ButtonMeta;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: hj.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C17329l extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67120w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Action f67121x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ ButtonMeta f67122y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17329l(int i13, Action action, ButtonMeta buttonMeta) {
        super(0);
        this.f67120w = i13;
        this.f67121x = action;
        this.f67122y = buttonMeta;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        return "AmplitudeEngagement.sdk[internal]#execNudgeAction(variantId=" + this.f67120w + ", action=" + this.f67121x + ", meta=" + this.f67122y + ')';
    }
}
