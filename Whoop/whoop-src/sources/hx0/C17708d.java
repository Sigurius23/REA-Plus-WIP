package hx0;

import com.whoop.dataSyncService.rawdata.RawDataUploadWorker;
import io.getstream.chat.android.client.ChatClient;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import m83.AbstractC25265s;
import p218ic.AbstractC18377p0;
import p218ic.C18347a0;
import p218ic.C18354e;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.C18392z;
import p218ic.EnumC18346a;
import p218ic.EnumC18366k;
import p218ic.EnumC18368l;
import p218ic.EnumC18390x;
import p457rc.C31222e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: hx0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lhx0/d;", "", "Lic/p0;", "workManager", "<init>", "(Lic/p0;)V", "Lic/k0;", "b", "()Lic/k0;", "Lic/a0;", "a", "()Lic/a0;", "Ll83/a0;", "d", "()V", "c", "Lic/p0;", "Ltr2/n;", "Ltr2/n;", "logger", "Lic/e;", "Lic/e;", "constraints", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17708d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C18354e constraints;

    public C17708d(AbstractC18377p0 workManager) {
        AbstractC22676k.m65750j(workManager, "workManager");
        this.workManager = workManager;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("RawDataUploadScheduler");
        EnumC18390x enumC18390x = EnumC18390x.f71560w;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.constraints = new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet));
    }

    /* JADX INFO: renamed from: a */
    private final C18347a0 m50699a() {
        return (C18347a0) ((C18392z) ((C18392z) new C18392z(RawDataUploadWorker.class).m52880f(this.constraints)).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, TimeUnit.MILLISECONDS)).m52878b();
    }

    /* JADX INFO: renamed from: b */
    private final C18367k0 m50700b() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return (C18367k0) ((C18365j0) ((C18365j0) new C18365j0(RawDataUploadWorker.class, 900000L, timeUnit).m52880f(this.constraints)).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, timeUnit)).m52878b();
    }

    /* JADX INFO: renamed from: c */
    public final void m50701c() {
        this.workManager.m52876e("ONE_TIME_RAW_DATA_UPLOAD", EnumC18368l.f71503w, m50699a());
        this.logger.mo85228t("Scheduled one time raw data upload", new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: d */
    public final void m50702d() {
        this.workManager.mo52875d("PERIODIC_RAW_DATA_UPLOAD", EnumC18366k.f71499w, m50700b());
        this.logger.mo85228t("Scheduled periodic raw data upload", new AbstractC30556a.a[0]);
    }
}
