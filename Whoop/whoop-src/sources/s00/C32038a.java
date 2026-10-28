package s00;

import androidx.lifecycle.C1601k1;
import bc3.InterfaceC2994c0;
import com.stripe.android.p056ui.core.elements.OTPSpec;
import ec3.C13081r1;
import g40.C15399o1;
import p442qy.C30765d;
import p599wz.C37734l1;
import p599wz.C37751r0;
import p665yz.C39899b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: s00.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C32038a implements InterfaceC32039b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2994c0 f132909a;

    /* JADX INFO: renamed from: b */
    public final C37734l1 f132910b;

    /* JADX INFO: renamed from: c */
    public final C1601k1 f132911c;

    /* JADX INFO: renamed from: d */
    public final C15399o1 f132912d;

    /* JADX INFO: renamed from: e */
    public final C13081r1 f132913e;

    public C32038a(InterfaceC2994c0 coroutineScope, C37734l1 linkConfigurationCoordinator, C37751r0 linkLauncher, C30765d logger, C1601k1 savedStateHandle, C39899b linkEventsReporter) {
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        AbstractC22676k.m65750j(linkLauncher, "linkLauncher");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        AbstractC22676k.m65750j(linkEventsReporter, "linkEventsReporter");
        this.f132909a = coroutineScope;
        this.f132910b = linkConfigurationCoordinator;
        this.f132911c = savedStateHandle;
        this.f132912d = OTPSpec.INSTANCE.transform();
        this.f132913e = savedStateHandle.m5002c(new C32040c(C32041d.f132915w), "LINK_EMBEDDED_STATE_KEY");
    }
}
