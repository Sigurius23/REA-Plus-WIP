package gh2;

import com.whoop.stealthmode.api.StealthModeApi;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rr2.InterfaceC31766c;

/* JADX INFO: renamed from: gh2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \f2\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lgh2/a;", "", "Lcom/whoop/stealthmode/api/StealthModeApi;", "api", "Lrr2/c;", "crashReporter", "<init>", "(Lcom/whoop/stealthmode/api/StealthModeApi;Lrr2/c;)V", "a", "Lcom/whoop/stealthmode/api/StealthModeApi;", "b", "Lrr2/c;", "c", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15855a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final StealthModeApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    public C15855a(StealthModeApi api, InterfaceC31766c crashReporter) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        this.api = api;
        this.crashReporter = crashReporter;
    }
}
