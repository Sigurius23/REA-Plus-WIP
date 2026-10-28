package to;

import com.google.android.gms.common.api.InterfaceC4973d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p529uo.AbstractC35135w;

/* JADX INFO: renamed from: to.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC33967d extends BasePendingResult {
    /* JADX INFO: renamed from: c0 */
    public abstract void mo97692c0(InterfaceC4973d interfaceC4973d);

    /* JADX INFO: renamed from: d0 */
    public final void m107424d0(Status status) {
        AbstractC35135w.m111090b(!status.m15593b(), "Failed result must not be success");
        m15605a0(mo15602X(status));
    }
}
