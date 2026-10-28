package t30;

import androidx.fragment.app.AbstractC1356w0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.stripe.android.stripe3ds2.views.ChallengeProgressFragment;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29926q0;

/* JADX INFO: renamed from: t30.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C33514p extends AbstractC1356w0 {

    /* JADX INFO: renamed from: b */
    public final String f139915b;

    /* JADX INFO: renamed from: c */
    public final C29926q0 f139916c;

    /* JADX INFO: renamed from: d */
    public final Integer f139917d;

    public C33514p(String directoryServerName, C29926q0 sdkTransactionId, Integer num) {
        AbstractC22676k.m65750j(directoryServerName, "directoryServerName");
        AbstractC22676k.m65750j(sdkTransactionId, "sdkTransactionId");
        this.f139915b = directoryServerName;
        this.f139916c = sdkTransactionId;
        this.f139917d = num;
    }

    @Override // androidx.fragment.app.AbstractC1356w0
    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC1320m0 mo4083a(ClassLoader classLoader, String className) {
        AbstractC22676k.m65750j(classLoader, "classLoader");
        AbstractC22676k.m65750j(className, "className");
        if (className.equals(ChallengeProgressFragment.class.getName())) {
            return new ChallengeProgressFragment(this.f139915b, this.f139916c, this.f139917d);
        }
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0Mo4083a = super.mo4083a(classLoader, className);
        AbstractC22676k.m65747g(abstractComponentCallbacksC1320m0Mo4083a);
        return abstractComponentCallbacksC1320m0Mo4083a;
    }
}
