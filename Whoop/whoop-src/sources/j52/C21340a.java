package j52;

import com.whoop.pulseinformationpacket.network.PipUploadWorker;
import io.getstream.chat.android.client.ChatClient;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import m83.AbstractC25265s;
import p218ic.AbstractC18377p0;
import p218ic.C18354e;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.EnumC18346a;
import p218ic.EnumC18366k;
import p218ic.EnumC18390x;
import p457rc.C31222e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: j52.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lj52/a;", "", "Lic/p0;", "workManager", "Ltr2/n;", "logger", "<init>", "(Lic/p0;Ltr2/n;)V", "Ll83/a0;", "b", "()V", "Lic/k0;", "a", "()Lic/k0;", "Lic/p0;", "Ltr2/n;", "Lic/e;", "c", "Lic/e;", "constraints", "pulseInformationPacket_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21340a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C18354e constraints;

    public C21340a(AbstractC18377p0 workManager, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(logger, "logger");
        this.workManager = workManager;
        this.logger = logger;
        EnumC18390x enumC18390x = EnumC18390x.f71560w;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.constraints = new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet));
    }

    /* JADX INFO: renamed from: a */
    public final C18367k0 m59942a() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return (C18367k0) ((C18365j0) ((C18365j0) new C18365j0(PipUploadWorker.class, 900000L, timeUnit).m52880f(this.constraints)).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, timeUnit)).m52878b();
    }

    /* JADX INFO: renamed from: b */
    public final void m59943b() {
        this.workManager.mo52875d("PERIODIC_PIP_UPLOAD", EnumC18366k.f71499w, m59942a());
        this.logger.mo85228t("Scheduled periodic pip upload", new AbstractC30556a.a[0]);
    }
}
